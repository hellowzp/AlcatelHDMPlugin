package ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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


public class NewJavaScriptWizardPage extends WizardPage {
	
	private Text name;
	private Text location;
	
	public NewJavaScriptWizardPage() {
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
				validate();
			}
		});
	    
	    Label dummy = new Label(container, SWT.None);
	    dummy.setEnabled(false);
	    
	    Label locationLabel = new Label(container, SWT.NONE);
	    locationLabel.setText("&Project location: ");

	    location = new Text(container, SWT.BORDER | SWT.SINGLE);
	    location.setLayoutData(gd);
	    location.setEditable(false);
	    String ws = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	    location.setText(ws);
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
		   
	    setControl(container);
		setPageComplete(false);    
	}
	
	private void validate() {
		Thread thread = Thread.currentThread();
		System.out.println("Current thread2 info:" + thread + "\nID: " + thread.getId() +"\nname: " +
							thread.getName() + "\nclass: " + thread.getClass() );
		
		setErrorMessage(null);
		setPageComplete(false);
		
		String pName = name.getText();		
		if(pName.isEmpty()) {
			setErrorMessage("Project name can't be empty");
			return;
		}
		
		String pLocation = location.getText();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject(pName);
		if(project.exists()) {
			setErrorMessage("Project with the same name already exists in the workspace");
			project = null;
			return;
		} 
		
		if (pLocation.length() == 0) {
			setErrorMessage("Project location must be specified");
			return;
		}
					
		setPageComplete(true);
	}
	    
    private void handleBrowse() {
    	DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
    	dialog.setMessage("Select a writable directory to host the project");
    	String result = dialog.open();
    	//return empty string if cancel is clicked
    	location.setText(result);
    	System.out.println(result);
    	//validate();
	}

	public String getProjectName() {
		return name.getText();
	}
	
	public String getProjectLocation() {
		return location.getText();
	}
}