package ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import testwizard.MyPageOne;
import testwizard.MyPageTwo;
import testwizard.MyWizard;
import testwizard.WizardPage1;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class JavaScriptProjectWizard extends Wizard implements INewWizard {
	private NewJavaScriptWizardPage firstPage;	

	public JavaScriptProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		firstPage = new NewJavaScriptWizardPage();
		addPage(firstPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
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
	
		IRunnableWithProgress op = new IRunnableWithProgress() {
			
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				Thread thread = Thread.currentThread();
				System.out.println("Current thread3 info:" + thread + "\nID: " + thread.getId() +"\nname: " +
									thread.getName() + "\nclass: " + thread.getClass() );
				
				System.out.println("Monitor: " + monitor );
												
				try {
					doFinish(monitor,project); 
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
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(IProgressMonitor monitor, IProject project)
				throws CoreException {
		System.out.println("finish");
		Thread thread = Thread.currentThread();
		System.out.println("Current thread1 info:" + thread + "\nID: " + thread.getId() +"\nname: " +
							thread.getName() + "\nclass: " + thread.getClass() );
		
		// create a sample file
		monitor.beginTask("Creating new JavaScript project", 5);
		System.out.println("Creating new JavaScript files");
					
		IFolder jsFolder = project.getFolder("js");
		jsFolder.create(false, true, null);

		final IFile file = jsFolder.getFile("main.js");
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) { }
		
		monitor.worked(3);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Thread thread = Thread.currentThread();
				System.out.println("Current thread4 info:" + thread + "\nID: " + thread.getId() +"\nname: " +
									thread.getName() + "\nclass: " + thread.getClass() );
				
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(2);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents =
			"/*This is the initial file contents for the js file.*/\n"
			+ "function init() { };";
		return new ByteArrayInputStream(contents.getBytes());
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}
}