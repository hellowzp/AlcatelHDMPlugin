package ui;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;


public class CreateJavaScriptProjectPage extends WizardPage{
	
	private Text name;
	private Text location;
	private IProject project;
	
	public CreateJavaScriptProjectPage() {
		super("first page");
	    setTitle("New JavaScript project");
	    setDescription("specify the location and the name for your new project");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 3;
	    
	    Label nameLabel = new Label(container, SWT.NONE);
	    nameLabel.setText("&Project name: ");

	    name = new Text(container, SWT.BORDER | SWT.SINGLE);
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    name.setLayoutData(gd);
	    name.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(name.getText().isEmpty()) {
					setErrorMessage("Project name can't be empty");
					return;
				}
				validate();
			}
		});
	    
	    Label dummy = new Label(container, SWT.None);
	    dummy.setEnabled(false);
	    
	    Label locationLabel = new Label(container, SWT.NONE);
	    locationLabel.setText("&Project location: ");

	    location = new Text(container, SWT.BORDER | SWT.SINGLE);
	    location.setLayoutData(gd);
//	    location.setEditable(false);
	    location.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	    
	    Button brs = new Button(container, SWT.PUSH);
	    brs.setText("Browse...");
	    brs.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}

		});
		   
	    initialize();
	    setControl(container);
		setPageComplete(false);    
	}
	
	private void initialize() {
		
	}
	
	private void validate() {
		setErrorMessage(getTitle());
		String pName = name.getText();
		String pLocation = location.getText();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		IWorkspaceRoot root = workspace.getRoot();
		project = root.getProject(pName);
		if(project.exists()) {
			setErrorMessage("Project with the same name already exists");
			project = null;
			return;
		} 
		
		if (pLocation.length() == 0) {
//			setErrorMessage("Project location must be specified");
			return;
		}
		
		//check write permission
		if(true) {
			
		}
		
		//set description and return it to the wizard
		try {
			IProjectDescription description = project.getDescription();
			URI uri = null;
			try {
				uri = URIUtil.fromString(pLocation + pName);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			description.setLocationURI(uri);
		} catch (CoreException e) {
			e.printStackTrace();
		}
//		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
				
		setPageComplete(true);
	}
	    
    private void handleBrowse() {
    	DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
    	dialog.setMessage("Select a writable directory to host the project");
    	String result = dialog.open();
    	location.setText(result);
    	System.out.println(result);
    	if(result.length() != 0) validate();
	}
	    
	public IProject getProject() {
		return project;
	}
}
