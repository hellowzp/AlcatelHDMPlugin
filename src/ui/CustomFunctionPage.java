package ui;

import java.util.Arrays;
import java.util.regex.Pattern;

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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CustomFunctionPage extends WizardPage {
	
	private Text proName;
	private Text proLocation;
	private Text fntName;
	private Text numOfParas;
	private Text description;
	private Text nameKey;
	private Text code;
	
	private Button btnPreactivation;
	private Button btnDeviceTypebound;
	
	private int state = 0xff; //0xffffffff;
	
	private static final Pattern FUNCTION_PATTERN = Pattern.compile("[_$a-zA-Z\\xA0-\\uFFFF][_$a-zA-Z0-9\\xA0-\\uFFFF]*");
	private static final String[] JAVASCRIPT_KEY_WORDS = { 
		"instanceof", "typeof", "break", "do", "new", "var", "case", 
		"else", "return", "void", "catch", "finally", "continue", 
		"for", "switch", "while", "this", "with", "debugger", "function", 
		"throw", "default", "if", "try", "delete", "in", "abstarct" };
		
	public CustomFunctionPage() {
		super("first page");
	    setTitle("JavaScript Project");
	    setDescription("First wizard page");
	    setImageDescriptor(CustomFunctionWizard.LOGO_DESCRIPTOR);
	    setPageComplete(false);    
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
//		parent.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW));
//		container.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		
		Group grpProject = new Group(container, SWT.NONE);
		GridData gd_grpProject = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_grpProject.widthHint = 500;
		grpProject.setLayoutData(gd_grpProject);
		grpProject.setText("Project");
		grpProject.setLayout(new GridLayout(3, false));
		
		Label nameLabel = new Label(grpProject, SWT.NONE);
	    nameLabel.setText("  Project name: ");this.

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
	    locationLabel.setText("  Project location: ");

	    proLocation = new Text(grpProject, SWT.BORDER | SWT.SINGLE);
	    proLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    proLocation.setEditable(false);
	    proLocation.setText(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
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
	    gd_grpFunction.widthHint = 500;
	    grpFunction.setLayoutData(gd_grpFunction);
	    grpFunction.setText("Function");
	    grpFunction.setLayout(new GridLayout(3, false));
	    
	    Label lblFunctionName = new Label(grpFunction, SWT.NONE);
	    lblFunctionName.setText("  Name: ");
	    
	    fntName = new Text(grpFunction, SWT.BORDER | SWT.SINGLE);
	    fntName.setMessage("main");
//	    gd_txtMain.widthHint = 447;
	    GridData gd_fntName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
	    gd_fntName.widthHint = 356;
	    fntName.setLayoutData(gd_fntName);
	    fntName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				state &= 0xfe; //set first bit to 0
				validate();
			}
		});
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblNumberOfParameters = new Label(grpFunction, SWT.NONE);
//	    lblNumberOfParameters.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
	    lblNumberOfParameters.setText("  #Parameters: ");
	    
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
	    lblDescriprion.setText("  Description");
	    
	    description = new Text(grpFunction, SWT.BORDER);
	    description.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    description.setMessage("function description");
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblNameKey = new Label(grpFunction, SWT.NONE);
	    lblNameKey.setText("  Name Key");
	    
	    nameKey = new Text(grpFunction, SWT.BORDER);
	    nameKey.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    nameKey.setMessage("function nameKey");
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    Label lblCode = new Label(grpFunction, SWT.NONE);
	    lblCode.setText("  Code");
	    
	    code = new Text(grpFunction, SWT.BORDER);
	    code.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	    code.setMessage("integer function code between 1 and 1000");
	    code.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				state &= 0xfd;  //set second bit to 0
				validate();
			}
		});
	    
	    new Label(grpFunction, SWT.NONE);
	    
	    btnPreactivation = new Button(grpFunction, SWT.CHECK);
	    btnPreactivation.setText("  Preactivation");
	    
	    btnDeviceTypebound = new Button(grpFunction, SWT.CHECK);
	    btnDeviceTypebound.setText("  deviceTypeBound");
	    
	    new Label(grpFunction, SWT.NONE);
	        
		setPageComplete(false);   
		
//		Point p = getControl().getParent().getSize();
//		System.out.println("First page parent control size: " + p.x + " " + p.y);
	}
	
	@Override
	public boolean canFlipToNextPage() {
		if(isPageComplete() && getNumOfParameers()>0 ) 
			return true;
		return false;
	}

	@Override
	public IWizardPage getNextPage() {
		int num = Integer.valueOf(numOfParas.getText());
		CustomFunctionParameterPage page =  
				new CustomFunctionParameterPage(num);
		page.setWizard(getWizard());
		((CustomFunctionWizard)getWizard()).setParaPage(page);	
		return page;
	}

	private void validate() {
		setErrorMessage(null);
		setPageComplete(false);
		
		String pName = getProjectName();		
		if(pName.isEmpty()) {
			setErrorMessage("Project name can't be empty");
			return;
		}
		
		String pLocation = getProjectLocation();		
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
		
		if((state & 0x01) != 0) return;
		String ftnValidationMsg = isValidFunctionName(getFunctionName()); 
		if(ftnValidationMsg!=null) {
			setErrorMessage(ftnValidationMsg);
			return;
		}
		
		int retInt = getNumOfParameers();
		if(retInt==-1) {
			setErrorMessage("Number of parameters cannot be empty");
			return;
		}else if(retInt==-2) {
			setErrorMessage("Invalid input, number of parameters accept only integer values");
			return;
		}
		
		if((state & 0x02) != 0) return;
		retInt = isValidNumber(getCode());
		if(retInt==-1) {
			setErrorMessage("Function code cannot be empty");
			return;
		}else if(retInt==-2) {
			setErrorMessage("Invalid input, function code accept only integer values");
			return;
		}else if(retInt < 1 || retInt > 1000) {
			setErrorMessage("The function code should be between 1 and 1000");
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
//    	System.out.println(result);
	}
    
    private int isValidNumber(String tf) {
    	if(tf.isEmpty()) 
    		return -1;
    	try{
    		return Integer.parseInt(tf);
    	}catch(NumberFormatException exception){
    		return -2;
    	}
    }
    
    private String isValidFunctionName(String ftn) {
    	if( ftn==null || ftn.isEmpty()) {
    		return "The function name can not be empty";
    	}
    	if( Arrays.asList(JAVASCRIPT_KEY_WORDS).contains(ftn)) {
    		return "The function name cannot be a JavaScript key word";
    	}
    	if(!FUNCTION_PATTERN.matcher(ftn).matches() ) {
    		return "Invalid function name";
    	}
    	return null;
    }

	public String getProjectName() {
		return proName.getText().trim();
	}
	
	public String getProjectLocation() {
		return proLocation.getText().trim();
	}
	
	public String getFunctionName(){
		return fntName.getText().trim();
	}
	
	public String getDescription() {
		return description.getText().trim();
	}
	
	public String getNameKey() {
		return nameKey.getText().trim();
	}
	
	public String getCode() {
		return code.getText().trim();
	}
	
	public String getPreactivation() {
		return btnPreactivation.getSelection() ? "true" : "false";
	}
	
	public String getDeviceTypebound() {
		return btnDeviceTypebound.getSelection() ? "true" : "false";
	}

	public int getNumOfParameers() {
		return isValidNumber(numOfParas.getText().trim());
	} 
}