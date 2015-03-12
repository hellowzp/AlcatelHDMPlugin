package ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.IWizardPage;
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
import org.eclipse.swt.widgets.Group;


public class NewJavaScriptWizardPage extends WizardPage {
	
	private Text proName;
	private Text proLocation;
	private Text fntName;
	private Text numOfParas;
	private Text description;
	private Text nameKey;
	private Text code;
	
	private Button btnPreactivation;
	private Button btnDeviceTypebound;
		
	public NewJavaScriptWizardPage() {
		super("first page");
	    setTitle("New JavaScript project");
	    setDescription("specify the location and the name for your new project");
	    setPageComplete(false);    
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Group grpProject = new Group(container, SWT.NONE);
		GridData gd_grpProject = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_grpProject.widthHint = 568;
		grpProject.setLayoutData(gd_grpProject);
		grpProject.setText("Project");
		grpProject.setLayout(new GridLayout(3, false));
		
		Label nameLabel = new Label(grpProject, SWT.NONE);
	    nameLabel.setText("  &Project name: ");this.

	    proName = new Text(grpProject, SWT.BORDER | SWT.SINGLE);
	    proName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    proName.setFocus();
	    proName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	    
	    Label dummy = new Label(grpProject, SWT.None);
	    dummy.setEnabled(false);
	    
	    Label locationLabel = new Label(grpProject, SWT.NONE);
//	    GridData gd_locationLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
//	    gd_locationLabel.heightHint = 15;
//	    locationLabel.setLayoutData(gd_locationLabel);
	    locationLabel.setText("  &Project location: ");

	    proLocation = new Text(grpProject, SWT.BORDER | SWT.SINGLE);
	    proLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    proLocation.setEditable(false);
	    String ws = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	    proLocation.setText(ws);
	    proLocation.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	    
	    Button brs = new Button(grpProject, SWT.PUSH);
	    brs.setText("Browse...");
	    brs.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}

		});
	    
	    new Label(container, SWT.NONE);
	    
	    Group grpFunction = new Group(container, SWT.NONE);
	    GridData gd_grpFunction = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
	    gd_grpFunction.widthHint = 568;
	    grpFunction.setLayoutData(gd_grpFunction);
	    grpFunction.setText("Function");
	    grpFunction.setLayout(new GridLayout(3, false));
	    
	    Label lblFunctionName = new Label(grpFunction, SWT.NONE);
	    lblFunctionName.setText("  &Function name: ");
	    
	    fntName = new Text(grpFunction, SWT.BORDER);
	    fntName.setText("main");
//	    gd_txtMain.widthHint = 447;
	    GridData gd_fntName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_fntName.widthHint = 356;
	    fntName.setLayoutData(gd_fntName);
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblNumberOfParameters = new Label(grpFunction, SWT.NONE);
//	    lblNumberOfParameters.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
	    lblNumberOfParameters.setText("  &Number of parameters: ");
	    
	    numOfParas = new Text(grpFunction, SWT.BORDER);
	    numOfParas.setText("1");
	    numOfParas.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    numOfParas.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblDescriprion = new Label(grpFunction, SWT.NONE);
	    lblDescriprion.setText("  &Descriprion");
	    
	    description = new Text(grpFunction, SWT.BORDER);
	    description.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    description.setText("description");
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblNameKey = new Label(grpFunction, SWT.NONE);
	    lblNameKey.setText("  &Name Key");
	    
	    nameKey = new Text(grpFunction, SWT.BORDER);
	    nameKey.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    nameKey.setText("nameKey");
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblCode = new Label(grpFunction, SWT.NONE);
	    lblCode.setText("  &Code");
	    
	    code = new Text(grpFunction, SWT.BORDER);
	    code.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    code.setText("2013");
	    code.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    btnPreactivation = new Button(grpFunction, SWT.CHECK);
	    btnPreactivation.setText("  &Preactivation");
	    
	    btnDeviceTypebound = new Button(grpFunction, SWT.CHECK);
	    btnDeviceTypebound.setText("  &deviceTypeBound");
	    
	    new Label(grpFunction, SWT.NONE);
	        
		setPageComplete(false);    
	}
	
	@Override
	public boolean canFlipToNextPage() {
		if(isPageComplete() && isValidNumber(numOfParas)>0 ) 
			return true;
		return false;
	}

	@Override
	public IWizardPage getNextPage() {
		int num = Integer.valueOf(numOfParas.getText());
		ParamConfigurePage page =  new ParamConfigurePage(num);
		page.setWizard(getWizard());
		((JavaScriptProjectWizard)getWizard()).setParaPage(page);
		return page;
	}

	private void validate() {
		setErrorMessage(null);
		setPageComplete(false);
		
		String pName = proName.getText();		
		if(pName.isEmpty()) {
			setErrorMessage("Project name can't be empty");
			return;
		}
		
		String pLocation = proLocation.getText();
		
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
		
		int retInt = isValidNumber(numOfParas);
		if(retInt==-1) {
			setErrorMessage("Number of parameters cannot be empty");
			return;
		}else if(retInt==-2) {
			setErrorMessage("Invalid input, number of parameters accept only integer values");
			return;
		}
		
		retInt = isValidNumber(code);
		if(retInt==-1) {
			setErrorMessage("Function code cannot be empty");
			return;
		}else if(retInt==-2) {
			setErrorMessage("Invalid input, Function code accept only integer values");
			return;
		}
					
		setPageComplete(true);
	}
	    
    private void handleBrowse() {
    	DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
    	dialog.setMessage("Select a writable directory to host the project");
    	String result = dialog.open();
    	//return empty string if cancel is clicked
    	proLocation.setText(result);
    	System.out.println(result);
	}
    
    private int isValidNumber(Text textField) {
    	String tf = textField.getText();
    	int ret = -1;
    	if(tf.isEmpty()) 
    		return ret;
    	try{
    		ret = Integer.parseInt(tf);
    	}catch(NumberFormatException exception){
    		return -2;
    	}
		return ret;
    }

	public String getProjectName() {
		return proName.getText();
	}
	
	public String getProjectLocation() {
		return proLocation.getText();
	}
	
	public String getFunctionName(){
		return fntName.getText();
	}
	
	public String getDescription() {
		return description.getText();
	}
	
	public String getNameKey() {
		return nameKey.getText();
	}
	
	public String getCode() {
		return code.getText();
	}
	
	public String getPreactivation() {
		return btnPreactivation.getSelection() ? "true" : "false";
	}
	
	public String getDeviceTypebound() {
		return btnDeviceTypebound.getSelection() ? "true" : "false";
	}

	public int getNumOfParameers() {
		return isValidNumber(numOfParas);
	} 
}