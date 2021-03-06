package ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.custom.ScrolledComposite;

import core.PluginPropertyBundle;
import util.Validator;

public class CustomFunctionParameterPage extends WizardPage {

	private List<Text> paraNames;
	private List<Combo> paraTypes;
	private List<Text> paraDescriptions;
	private List<Boolean> initStates;
	private int numOfParas;
	
	public CustomFunctionParameterPage(int numOfParas) {
		super("ParaConfigurePage");
	    setTitle("Function parameters");
	    
	    this.numOfParas = numOfParas;
	    paraNames = new ArrayList<>(numOfParas);
	    paraTypes = new ArrayList<>(numOfParas);
	    paraDescriptions = new ArrayList<>(numOfParas);
	    initStates = new ArrayList<>(numOfParas);
	    
	    for(int i=0; i<numOfParas; i++) {
	    	initStates.add(Boolean.FALSE);
	    }
	    
	    setDescription("Specify the detailed parameter information for the function");
	    setImageDescriptor(CustomFunctionWizard.LOGO_DESCRIPTOR);
	    setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.V_SCROLL);
		Composite container = new Composite(scrolledComposite, SWT.NONE);
		container.setBounds( PluginPropertyBundle.PAGE_BOUND_X, 
							 PluginPropertyBundle.PAGE_BOUND_Y,
							 PluginPropertyBundle.PAGE_WIDTH,
							 PluginPropertyBundle.PAGE_HEIGHT);
		container.setLayout(new GridLayout(1, false));
//		container.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		setControl(scrolledComposite);
		
		scrolledComposite.setExpandHorizontal(false);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setContent(container);
//		scrolledComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
//		
		if(numOfParas>PluginPropertyBundle.PARAMETER_THRESHOLD) {
			scrolledComposite.setMinSize( PluginPropertyBundle.PAGE_WIDTH,
							numOfParas * PluginPropertyBundle.PAGE_ROW_HEIGHT);
		}else{
			scrolledComposite.setSize( PluginPropertyBundle.PAGE_WIDTH,
					 				   PluginPropertyBundle.PAGE_HEIGHT);
		}
		
//		scrolledComposite.addControlListener(new ControlAdapter() {
//			public void controlResized(ControlEvent e) {
//				Rectangle r = scrolledComposite.getClientArea();
//				scrolledComposite.setMinSize(container.computeSize( r.width,
//						SWT.DEFAULT));
//			}
//		});
		
		for (int i = 0; i<numOfParas; i++) {
			Group group = new Group(container, SWT.NONE);
		    GridData groupGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		    groupGridData.widthHint = PluginPropertyBundle.PAGE_WIDTH_HINT;
		    groupGridData.heightHint = PluginPropertyBundle.PAGE_HEIGHT_HINT;
		    group.setLayoutData(groupGridData);
		    group.setText("Parameter  " + (i+1));
		    GridLayout gd = new GridLayout(4, false);
		    gd.horizontalSpacing = PluginPropertyBundle.PAGE_HORIZONTAL_SPACE;
		    group.setLayout(gd);
		    
			Label lblName = new Label(group, SWT.NONE);
			lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblName.setText("  Name");
			
			Text paraName = new Text(group, SWT.BORDER);
			GridData gd_text_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
//			gd_text_1.widthHint = 100;
			paraName.setLayoutData(gd_text_1);
			paraName.setMessage("para_" + (i+1));
			final int index = i;
			paraName.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					initStates.set(index, Boolean.TRUE);
					validate();
				}
			});			
			paraNames.add(paraName);
			
			Label lblDes = new Label(group, SWT.NONE);
			lblDes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblDes.setText("Description");
			
			Text desText = new Text(group, SWT.BORDER);
			GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
//			gd_text_1.widthHint = 100;
			desText.setLayoutData(gd_text_2);
			desText.setMessage("parameter description");
			desText.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					validate();
				}
			});		
			paraDescriptions.add(desText);
			
			Label lblType = new Label(group, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
			lblType.setText("  Type");
			
			final Combo combo = new Combo(group, SWT.READ_ONLY);
			combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			combo.setCursor(new Cursor(getShell().getDisplay(), SWT.CURSOR_HAND));
			combo.setItems(PluginPropertyBundle.SIMPLE_PARAMETERS);
			combo.select(0);
			paraTypes.add(combo);
			
			Button btnSimpleType = new Button(group, SWT.RADIO);
			btnSimpleType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					combo.setItems(PluginPropertyBundle.SIMPLE_PARAMETERS);
					combo.select(0);
				}
			});
			btnSimpleType.setText("Simple");
			btnSimpleType.setSelection(true);
			
			Button btnComplexType = new Button(group, SWT.RADIO);
			btnComplexType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					combo.setItems(PluginPropertyBundle.COMPLEX_PARAMETERS);
					combo.select(0);
				}
			});
			btnComplexType.setText("Complex");
			
			new Label(group, SWT.NONE);
		}	
		
		setPageComplete(false);
	}
	
	private void validate() {
		setPageComplete(true);
		setErrorMessage(null);
		setMessage(null);
		
		for(int i=0; i<numOfParas; i++) {
			if(initStates.get(i)) {
				String paraName = paraNames.get(i).getText().trim();
				String msg = Validator.isValidJSIdentifier(paraName);
				if(msg!=null) {
					setErrorMessage(msg);
					setPageComplete(false);
					return;
				}
				
				for(int j=0; j<i; j++) {
					if(paraName != null && paraName.equals(paraNames.get(j).getText().trim()) ){
						setErrorMessage("Duplicate parameter name");
						setPageComplete(false);
						return;
					}
				}
				
//				if(paraDescriptions.get(i).getText().trim().isEmpty()) {
//					setMessage("It's not recemmended to leave the parameter description empty", WizardPage.WARNING); // IMessageProvider.WARNING: 2
//				}
			} else {
				setPageComplete(false);
			}
		}
		
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}
	
	@Override
	public IWizardPage getPreviousPage() {
//		this.dispose();
//		this.getControl().dispose();
		return super.getPreviousPage();
	}
	
	public List<String> getParaNames() {
		List<String> names = new ArrayList<String>(numOfParas);
		for(Text text : paraNames) names.add(text.getText());
		return names;
	}
	
	public List<String> getParaTypes() {
		List<String> types = new ArrayList<String>(numOfParas);
		for(Combo combo : paraTypes) types.add(combo.getText());
		return types;
	}
	
	public List<String> getParaDescriptions() {
		List<String> des = new ArrayList<String>(numOfParas);
		for(Text text : paraDescriptions) des.add(text.getText());
		return des;
	}
	
	public String getParaType(String para) {
		for(String s : PluginPropertyBundle.SIMPLE_PARAMETERS) {
			if(s.equals(para))
				return "simpleParameter";
		}
		return "complexParameter";
	}
	
}
