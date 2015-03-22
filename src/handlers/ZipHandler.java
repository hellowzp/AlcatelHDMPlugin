package handlers;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.wst.jsdt.core.IJavaScriptElement;
import org.eclipse.wst.jsdt.core.IJavaScriptProject;
import org.eclipse.wst.jsdt.internal.core.PackageFragmentRoot;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class ZipHandler extends AbstractHandler{
	/**
	 * The constructor.
	 */
	public ZipHandler() {
		
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IProject currentProject = null;
		IFile currentFile = null;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = window.getSelectionService().getSelection();
		
		if (selection instanceof IStructuredSelection) {
			 Object element = ((IStructuredSelection)selection).getFirstElement();
			
           if (element instanceof IResource) {    
               currentProject= ((IResource)element).getProject();
				if(((IResource) element).getFileExtension() != null){
					currentFile = (IFile)element;
				}else{
					System.out.println("no library");
					MessageDialog.openInformation(
							window.getShell(),
							"Failed!", 
							"Please select the JavaScript or xml file you want to zip.");
				}
				
				if(currentFile != null && currentProject !=null){
					makeZipCompression(currentProject, currentFile, window);
					try {
						currentProject.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
           } else if (element instanceof PackageFragmentRoot) {    
               IJavaScriptProject jProject =     
                   ((PackageFragmentRoot)element).getJavaScriptProject();    
               currentProject = jProject.getProject();    
           } else if (element instanceof IJavaScriptElement) {    
           	IJavaScriptProject jProject= ((IJavaScriptElement)element).getJavaScriptProject();    
               currentProject = jProject.getProject();    
           } else {
				System.out.println("not library");
        	    MessageDialog.openInformation(
						window.getShell(),
						"Failed!", 
						"Please select the JavaScript or xml file you want to zip.");
			} 
		}
		
		if (selection instanceof ITextSelection) {
			MessageDialog.openInformation(
					window.getShell(),
					"Failed!", 
					"Please select file in Package Explorer.");
		}
		return null;
	}
	
	public static boolean makeZipCompression(IProject project, IFile file, IWorkbenchWindow window){
		FileOutputStream fos = null;
		ZipOutputStream zipOut = null;
        FileInputStream fis = null;
        
		String fileName = file.getName().split("\\.")[0];
		String rFileName = file.getProjectRelativePath().toString().split("\\.")[0];
			
		IFile xmlFile = project.getFile( rFileName+ ".xml") ;
		IFile jsFile = project.getFile( rFileName + ".js") ;
		
		if(xmlFile.exists() && jsFile.exists()){	
			try {
				fos = new FileOutputStream(project.getLocation().toString() + "/" + rFileName + ".zip");
				zipOut = new ZipOutputStream(new BufferedOutputStream(fos));
								
				fis = new FileInputStream(jsFile.getLocation().toFile());
				ZipEntry jsZe = new ZipEntry(jsFile.getName());
				zipOut.putNextEntry(jsZe);
				byte[] tmp = new byte[4*1024];
                int size = 0;
                while((size = fis.read(tmp)) != -1){
                    zipOut.write(tmp, 0, size);
                }
                zipOut.flush();
                fis.close();
                
//				-------------zip xmlFile-----------
                fis = new FileInputStream(xmlFile.getLocation().toFile());
                ZipEntry xmlZe = new ZipEntry(xmlFile.getName());
                zipOut.putNextEntry(xmlZe);
                size = 0;
                while((size = fis.read(tmp)) != -1){
                    zipOut.write(tmp, 0, size);
                }
                zipOut.flush();
                fis.close();
               
                zipOut.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{
	                if(fos != null) fos.close();
	            } catch(Exception ex){
	                 
	            }
	        }
			
			
		}else if(!xmlFile.exists()){
			MessageDialog.openInformation(
					window.getShell(),
					"Failed!", 
					"Cannot find "+fileName+".xml file!");
			return false;
		}else if(!jsFile.exists()){
			MessageDialog.openInformation(
					window.getShell(),
					"Failed!", 
					"Cannot find "+fileName+".js file!");
			return false;
		}
		return false;
	}

//--------------------------------------success!---------------------------

//public static IProject getCurrentProject(IWorkbenchWindow window){    
//        ISelectionService selectionService = window.getSelectionService();    
//        ISelection selection = selectionService.getSelection();    
//
//        IProject project = null;    
//        if(selection instanceof IStructuredSelection) {    
//            Object element = ((IStructuredSelection)selection).getFirstElement();    
//            if (element instanceof IResource) {    
//                project= ((IResource)element).getProject();
//            } else if (element instanceof PackageFragmentRootContainer) {    
//                IJavaScriptProject jProject =     
//                    ((PackageFragmentRootContainer)element).getJavaProject();    
//                project = jProject.getProject();    
//            } else if (element instanceof IJavaScriptElement) {    
//            	IJavaScriptProject jProject= ((IJavaScriptElement)element).getJavaScriptProject();    
//                project = jProject.getProject();    
//            }    
//        }     
//        return project;    
//    }
//--------------------------------------success!---------------------------
//	public static IPath getCurrentFilePath(){    
//		
//		IWorkbench workbench = PlatformUI.getWorkbench();
//		IWorkbenchWindow window = 
//		        workbench == null ? null : workbench.getActiveWorkbenchWindow();
//		IWorkbenchPage activePage = 
//		        window == null ? null : window.getActivePage();
//		
//		IEditorPart editor = 
//		        activePage == null ? null : activePage.getActiveEditor();
//		
//		IEditorInput input = 
//		        editor == null ? null : editor.getEditorInput();
//		IPath path = input instanceof FileEditorInput 
//		        ? ((FileEditorInput)input).getPath()
//		        : null;
//		if (path != null)
//		{
//			return path;
//		}
//		return null;
//    }
//--------------------------------------success!---------------------------
	
//	public static IPath zipFiles(){
////		IWorkbench workbench = PlatformUI.getWorkbench();
////		IWorkbenchWindow window = 
////		        workbench == null ? null : workbench.getActiveWorkbenchWindow();
////		ISelection selection = window.getSelectionService().getSelection();
////		return ((IResource)selection).getLocation();
//	}

}
