package ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class JavaScriptProjectWizard extends Wizard implements INewWizard {
	private NewJavaScriptWizardPage firstPage;	
	private ParaConfigurePage paraPage;

	public JavaScriptProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		firstPage = new NewJavaScriptWizardPage();
//		paraPage = new ParaConfigurePage(); //dummy page
		addPage(firstPage);
//		addPage(paraPage);
//		for(IWizardPage page : getPages()) {
//			System.out.println(page.getName() + page.isPageComplete());
//		}	
	}
	
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == firstPage)
			return firstPage.getNumOfParameers() == 0;
		return paraPage.isPageComplete();
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		//main thread
		Thread thread = Thread.currentThread();
		System.out.println("Current thread5 info:" + thread + "\nID: " + thread.getId() +"\nname: " +
							thread.getName() + "\nclass: " + thread.getClass() );
		
		String name = firstPage.getProjectName();
		String location = firstPage.getProjectLocation();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProject project = workspace.getRoot().getProject(name);
			
		try {
			project.create(null);
			project.open(null); //pro must be open to create new folder			
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		
		try {
			IProjectDescription description = project.getDescription();
			URI uri = null;
			try {
				uri = URIUtil.fromString(location);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			description.setLocationURI(uri);
		} catch (CoreException e) {
			e.printStackTrace();
		}

//		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
//		add any natures, builders, ... required to the project description
	
		final Configuration config = new Configuration(firstPage, paraPage);
		
		IRunnableWithProgress op = new IRunnableWithProgress() {			
			public void run(IProgressMonitor monitor) throws InvocationTargetException {								
				try {
					doFinish(monitor, project, config);
//					doFinish(monitor, project, ftnName, nameKey, code, desc, paraNames, paraTypes); 
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		System.out.println("IRunnableWithProgress: " + op.toString());
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean performCancel() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProject project = workspace.getRoot().getProject(firstPage.getProjectName());
			
		try {
			if(project.exists())
				project.delete(true, false, null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		return true;		
	}
	
	private void doFinish( IProgressMonitor monitor, IProject project, Configuration config) 
			throws CoreException {
		// create a sample file
		monitor.beginTask("Creating new JavaScript project", 10);
					
		IFolder jsFolder = project.getFolder("js");
		jsFolder.create(false, true, null);

		monitor.setTaskName("Creating js file...");
		String ftnName = config.ftnSettings.get(0);
		final IFile jsFile = jsFolder.getFile(ftnName + ".js");
		try {
			InputStream stream = openJSContentStream(ftnName, config.paraNames);
			if (jsFile.exists()) {
				jsFile.setContents(stream, true, true, monitor);
			} else {
				jsFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) { }		
		monitor.worked(3);
		
		monitor.setTaskName("creating xml file...");
		IFile xmlFile = jsFolder.getFile(ftnName + ".xml");
		try {
			InputStream stream = openXMLContentStream(config);
			if (xmlFile.exists()) {
				xmlFile.setContents(stream, true, true, monitor);
			} else {
				xmlFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) { }		
		monitor.worked(5);
		
		monitor.setTaskName("Opening the js file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, jsFile, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(2);
	}
	
	private InputStream openJSContentStream(String ftnName, List<String> paraNames) {
		String contents = "/*This is the initial file contents for the js file.*/\n"
						+ "function " + ftnName + "(" + paraListToString(paraNames) + ") {\n\t\n}";
						
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private InputStream openXMLContentStream(Configuration config) {
		StringBuilder sb = new StringBuilder(
				  "<function name=\"?\" nameKey=\"?\" code=\"?\" "
				+ "preactivation=\"?\" deviceTypeBound=\"?\">"
				+ "\n\t<description>?</description>\n" );
		int offset = 0;
		
		for(int i=0; i<6; i++) {
			offset = sb.indexOf("?");
			sb.replace(offset, offset+1, config.ftnSettings.get(i));
		}
		
		if(config.paraNames==null) {
			sb.append("\t<inputParameters/>\n</function>");
		}else{
			sb.append("\t<inputParameters>\n?\t</inputParameters>\n</function>");
			for(int i=0; i<config.paraNames.size(); i++) {
				String paraType = paraPage.getParaType(config.paraTypes.get(i));
				String para = "\t\t<" + paraType + " name=\"" 
							+ config.paraNames.get(i) + "\" type=\"" + config.paraTypes.get(i) +"\">"
							+ "\n\t\t\t<description>" + config.paraDescs.get(i) + "</description>"
							+ "\n\t\t</" + paraType + ">\n";
							
				offset = sb.indexOf("?");
				sb.insert(offset,para); //will be inserted before the ? mark
			}
			
			offset = sb.indexOf("?");
			sb.replace(offset, offset+1, "");
		}
		
		return new ByteArrayInputStream(sb.toString().getBytes());
	}
	
	private String paraListToString(List<String> nameList) {
		if(nameList==null)
			return "";
		StringBuilder names = new StringBuilder();
		for(int i=0; i<nameList.size(); i++) {
			names.append(nameList.get(i) + ", ");
		}
		return names.substring(0, names.length()-2);
	}
	
	public void setParaPage(ParaConfigurePage page) {
		this.paraPage = page;
	}
	
	private static class Configuration {
		//name, nameKey, code, pre-activation, deviceTypeBound, description
		private List<String> ftnSettings;
		private List<String> paraNames;
		private List<String> paraTypes;
		private List<String> paraDescs;
		
		private Configuration(NewJavaScriptWizardPage firstPage, ParaConfigurePage secondPage) {
			ftnSettings = new ArrayList<String>(6);
			ftnSettings.add(firstPage.getFunctionName());
			ftnSettings.add(firstPage.getNameKey());
			ftnSettings.add(firstPage.getCode());
			ftnSettings.add(firstPage.getPreactivation());
			ftnSettings.add(firstPage.getDeviceTypebound());
			ftnSettings.add(firstPage.getDescription());
			
			if(secondPage!=null){
				paraNames = secondPage.getParaNames();
				paraTypes = secondPage.getParaTypes();
				paraDescs = secondPage.getParaDescriptions();
			}			
		}
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}
}