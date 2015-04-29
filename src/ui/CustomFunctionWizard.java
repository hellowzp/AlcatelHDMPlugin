package ui;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import library.HDMSharedLibraryInitializer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.wst.jsdt.core.IIncludePathEntry;
import org.eclipse.wst.jsdt.core.IJavaScriptProject;
import org.eclipse.wst.jsdt.core.JavaScriptCore;
import org.eclipse.wst.jsdt.core.JsGlobalScopeContainerInitializer;

import core.HDMPluginActivator;

public class CustomFunctionWizard extends Wizard implements INewWizard {
	private CustomFunctionPage firstPage;	
	private CustomFunctionParameterPage secondPage;
	
	static final ImageDescriptor LOGO_DESCRIPTOR = HDMPluginActivator.getImageDescriptor("icons/logo_big.png");

	public CustomFunctionWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		firstPage = new CustomFunctionPage();
		addPage(firstPage);
	}
	
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == firstPage)
			return firstPage.getNumOfParameers() == 0;
		return secondPage.isPageComplete();
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		String name = firstPage.getProjectName();
		String location = firstPage.getProjectLocation();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProject project = workspace.getRoot().getProject(name);

		try {
			project.create(null);
			project.open(null); //project must be open to set description and create new folder			
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	
		try {
			IProjectDescription description = project.getDescription();
//			try {
////				uri = URIUtil.fromString(location);
////				uri = new URI("file:/" + location);
//			} catch (URISyntaxException e) {
//				e.printStackTrace();
//			}
			description.setLocationURI(Paths.get(location).toUri());
			
			//http://help.eclipse.org/luna/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Fguide%2FresAdv_natures.htm
//			String[] prevNatures = description.getNatureIds();
//            String[] newNatures = new String[prevNatures.length + 1];
//            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
//            newNatures[prevNatures.length] = "org.eclipse.jdt.core.javanature";
//            
//            // check the status and decide what to do
//            IStatus status = workspace.validateNatureSet(newNatures);
//            if (status.getCode() == IStatus.OK) {
//            	description.setNatureIds(newNatures);
////            	project.setDescription(description, null); //make it take effect
//            } else {
//            	// raise a user error
//    			System.out.println(project.isNatureEnabled("org.eclipse.wst.jsdt.core.jsNature"));
//            }
                                                
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		final Configuration config = new Configuration(firstPage, secondPage);
		
		IRunnableWithProgress op = new IRunnableWithProgress() {			
			public void run(IProgressMonitor monitor) throws InvocationTargetException {								
				try {
					doFinish(monitor, project, config);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
//		System.out.println("IRunnableWithProgress: " + op.toString());
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
		if (getContainer().getCurrentPage() == firstPage)
			return true;
		
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
		monitor.beginTask("Creating new customized JavaScript project", 10);
		
		IFile proFile = project.getFile(".project");
		proFile.delete(true, monitor);
		
		//http://stackoverflow.com/questions/43157/easy-way-to-write-contents-of-a-java-inputstream-to-an-outputstream
		try {
			InputStream stream = openProjectDescriptiongStream(project.getName());
			Files.copy(stream, Paths.get( project.getLocation().append( File.separator + ".project").toString() ));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		IFolder settingFolder = project.getFolder(".settings");
		if(!settingFolder.exists()) {
			settingFolder.create(false, true, monitor);			
		}
		
//		try(
//			InputStream is = new BufferedInputStream(new FileInputStream("D:/my_documents/engineering_files/eclipse_RCP/AlcatelHDMPlugin/libraries/hdm.userlibraries")) ) 
//		{
//			IFile file = project.getFile("user.lib");
//		    file.create(is, true, monitor);
//
//		    IJavaScriptProject jsProj = JavaScriptCore.create(project);
//		    IPath path = file.getFullPath();
//		    List<IIncludePathEntry> libraries = new ArrayList<IIncludePathEntry>();
//		    libraries.addAll(Arrays.asList(jsProj.getRawIncludepath()));
//		    libraries.add(JavaScriptCore.newLibraryEntry(path, null, null));
//		
//		    jsProj.setRawIncludepath(libraries.toArray(new IIncludePathEntry[libraries.size()]), null);
//		    
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
	    
		
		IJavaScriptProject jsProj = JavaScriptCore.create(project);
		//create an instance of the container and get its defined include-path entry
		JsGlobalScopeContainerInitializer container = new HDMSharedLibraryInitializer();
		
		IIncludePathEntry newContainerEntry = JavaScriptCore.newContainerEntry(container.getPath());
		IIncludePathEntry[] rawPaths = jsProj.getRawIncludepath();  
		IIncludePathEntry[] newPaths = new IIncludePathEntry[rawPaths.length +1];
		System.arraycopy(rawPaths, 0, newPaths, 0, rawPaths.length);
		//add the new entry
		newPaths[rawPaths.length] = newContainerEntry;
		// set the new includepath to the project
		jsProj.setRawIncludepath(newPaths, null);
		
//		for(IIncludePathEntry pathEntry : newPaths) {
//			System.out.println(pathEntry.getPath() + " " + pathEntry.getEntryKind());
//		}
		
//		try (    //try with resource, auto-close
//			PrintWriter os = new PrintWriter(
//					new FileOutputStream(project.getLocation() + "/.settings/.jsdtscope")))
//		{
//			os.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//			os.println("<classpath>");
//			os.println("\t<classpathentry kind=\"src\" path=\"js\">");
//			os.println("\t\t<attributes>");
//			os.println("\t\t\t<attribute name=\"provider\" value=\"org.eclipse.wst.jsdt.web.core.internal.project.ModuleSourcePathProvider\"/>");
//			os.println("\t\t</attributes>");
//			os.println("\t</classpathentry>");
//			
//			os.println("\t<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.JRE_CONTAINER\"/>");
//			os.println("\t<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.baseBrowserLibrary\"/>");
//			os.println("\t<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.WebProject\">");
//			os.println("\t\t<attributes>");
//			os.println("\t\t\t<attribute name =\"hide\" value=\"true\"/>");
//			os.println("\t\t</attributes>");
//			os.println("\t</classpathentry>");
//			
//			os.println("\t<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.USER_LIBRARY/hdm\"/>");
//			os.println("</classpath>");
//			os.flush();
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} 
			
		project.close(monitor);
		project.open(monitor);
		monitor.worked(3);	
		
		monitor.setTaskName("Creating js file...");
		IFolder jsFolder = project.getFolder("js");
		jsFolder.create(false, true, null);
		String ftnName = config.ftnSettings.get(0);
		final IFile jsFile = jsFolder.getFile(ftnName + ".js");
		
		try {
			InputStream stream = openJSContentStream(config);
			if (jsFile.exists()) {
				jsFile.setContents(stream, true, true, monitor);
			} else {
				jsFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) { 
			
		}		
		monitor.worked(2);
		
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
		} catch (IOException e) { 
			
		}		
		monitor.worked(3);
		
		monitor.setTaskName("Opening the js file in JavaScript perspective...");
		IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
		System.out.println(ws.getLocation() + " " + ws.getLocationURI());
		IPath path = ws.getLocation().append(File.separator + ".metadata" + File.separator + ".hdm");
//		System.out.println(path.toString());
//		IFolder preFolder = ws.getFolder(new Path(".hdm"));
//		if(!preFolder.exists()) {
//			try {
//				preFolder.create(false, true, monitor);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		}
				
//		IFile preFile = preFolder.getFile("preferences.properties");
//		final Properties prefProperty = new Properties();
//
//		if(!preFile.exists()) {
//			InputStream stream = openPreferenceStream();
//			preFile.create(stream, true, monitor);
//			try {
//				stream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		File preFolder = new File(path.toOSString());
		if(!preFolder.exists()) {
			preFolder.mkdir();
		}
		
		final File preFile = new File(preFolder, "preferences.properties");
		if(!preFile.exists()) {
//			System.out.println("creating files in the fs...");
			try {
				InputStream stream = openPreferenceStream();
				Files.copy(stream, preFile.toPath());
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		final Properties prefProperty = new Properties();
		try {
			prefProperty.load(new FileInputStream(preFile));
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();			
				String pref = prefProperty.getProperty("keepOpenInJavaScriptPerspective", "false");

				if(pref.equals("false")) {
					MessageDialogWithToggle msgDialog = new MessageDialogWithToggle(
							getShell(), "Comfirm", getDefaultPageImage(), 
							"This project is associated with the JavaScript perspective.\n"
						  + "Do you want to open this perspective now?", 
							MessageDialog.QUESTION, new String[] {"OK", "Cancel"}, 0, "Remember this decision", false);
					msgDialog.open();

//					boolean cm = MessageDialogWithToggle.openConfirm(
//							getShell(), "Comfirm", 
//							"This project is associated with the JavaScript perspective.\n\n"
//						  + "Do you want to open this perspective now?");
					
					if(msgDialog.getReturnCode() == MessageDialogWithToggle.OK) {
						try {
							PlatformUI.getWorkbench().showPerspective("org.eclipse.wst.jsdt.ui.JavaPerspective", window);
						} catch (WorkbenchException e) {
							e.printStackTrace();
						}
						
						prefProperty.setProperty("keepOpenInJavaScriptPerspective", String.valueOf(msgDialog.getToggleState()));
						try {
							prefProperty.store(new FileOutputStream(preFile), "hdm project preferences");
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}else{
					try {
						PlatformUI.getWorkbench().showPerspective("org.eclipse.wst.jsdt.ui.JavaPerspective", window);
					} catch (WorkbenchException e) {
						e.printStackTrace();
					}
				}
						
				IWorkbenchPage page = window.getActivePage();
				try {
					IDE.openEditor(page, jsFile, true);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
		monitor.worked(2);
	}
	
//	private InputStream openJSContentStream(String ftnName, List<String> paraNames) {
//		String contents = "function " + ftnName + "(" + paraListToString(paraNames) + ") {\n\t\n}";						
//		return new ByteArrayInputStream(contents.getBytes());
//	}

	private InputStream openJSContentStream(Configuration config) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("/**\n" + " * " + config.ftnSettings.get(5) + "\n"); 
		if(config.paraNames!=null) {
			for(int i=0; i<config.paraNames.size(); i++) {
				sb.append(" * @Param " + config.paraTypes.get(i) + " " 
						+ config.paraNames.get(i) + ": " 
						+ config.paraDescs.get(i) + "\n");
			}
		}
		sb.append(" */\n");
		sb.append("function " + config.ftnSettings.get(0) + "(" 
				+ paraListToString(config.paraNames) + ") {\n\t\n}" );
		return new ByteArrayInputStream(sb.toString().getBytes());
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
				String paraType = secondPage.getParaType(config.paraTypes.get(i));
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
	
	private InputStream openProjectDescriptiongStream(String name) {
		StringBuilder sb = new StringBuilder(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\r"
			  + "<projectDescription>\n"
			  + "\t<name>#</name>\n"
			  + "\t<comment></comment>\n"
			  + "\t<projects>\n\t</projects>\n"
			  + "\t<buildSpec>\n\t\t<buildCommand>\n"
			  + "\t\t\t<name>org.eclipse.wst.jsdt.core.javascriptValidator</name>\n"
			  + "\t\t\t<arguments></arguments>\n"
			  + "\t\t</buildCommand>\n\t</buildSpec>\n"
			  + "\t<natures>\n"
			  + "\t\t<nature>org.eclipse.wst.jsdt.core.jsNature</nature>\n"
			  + "\t</natures>\n</projectDescription>" );
		int offset = sb.indexOf("#");
		sb.replace(offset, offset+1, name);				
				
		return new ByteArrayInputStream(sb.toString().getBytes());
	}
	
	private InputStream openPreferenceStream() {
		return new ByteArrayInputStream("keepOpenInJavaScriptPerspective=false".getBytes());
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
	
	public void setParaPage(CustomFunctionParameterPage page) {
		this.secondPage = page;
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}
	
	private static class Configuration {
		//name, nameKey, code, pre-activation, deviceTypeBound, description
		private List<String> ftnSettings;
		private List<String> paraNames;
		private List<String> paraTypes;
		private List<String> paraDescs;
		
		private Configuration(CustomFunctionPage firstPage, CustomFunctionParameterPage secondPage) {
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
}