package ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.custom.ScrolledComposite;

import util.Validator;

public class ParamConfigurePage extends WizardPage {

	private List<Text> paraNames;
	private List<Combo> paraTypes;
	private List<Text> paraDescriptions;
	private int numOfParas;
	
	private static final String[] simpleTypes = new String[]{"string","integer","text","date","boolean","unsignedInt","long","unsignedLong","hexBinary"};
	private static final String[] complexTypes = new String[]{"AddObjectDTO","DeleteObjectDTO","DownloadDTO","FirmwareUpdateDTO","GetOptionsDTO",
														"GetParameterAttributesDTO","GetParameterNamesDTO","GetParameterValuesDTO","SnmpGetParameterValuesDTO",
														"RestoreDTO","SetParameterAttributesDTO","SetParameterAttributesDTO","SnmpSetParameterValuesDTO",
														"SetVouchersDTO","UploadDTO","ChangeDeploymentStateDTO","ScheduleDownloadDTO","CancelTransferDTO"};


	public ParamConfigurePage(int numOfParas) {
		super("ParaConfigurePage");
	    setTitle("Function parameters");
	    this.numOfParas = numOfParas;
	    paraNames = new ArrayList<>(numOfParas);
	    paraTypes = new ArrayList<>(numOfParas);
	    paraDescriptions = new ArrayList<>(numOfParas);
	    setDescription("Specify the information about the function parameters");
	    setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {
		int width = 510, height = 350;
		parent.setBounds(0, 0, width, height);
		parent.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW));
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.V_SCROLL);
		Composite container = new Composite(scrolledComposite, SWT.NONE);
		
		scrolledComposite.setExpandHorizontal(false);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setContent(container);
		scrolledComposite.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GREEN));
		
		if(numOfParas>4) {
			scrolledComposite.setMinSize(width,numOfParas*100);
		}else{
			scrolledComposite.setBounds(0,0,width,height); //520,400
		}
		
//		scrolledComposite.addControlListener(new ControlAdapter() {
//			public void controlResized(ControlEvent e) {
//				Rectangle r = scrolledComposite.getClientArea();
//				scrolledComposite.setMinSize(container.computeSize( r.width,
//						SWT.DEFAULT));
//			}
//		});
		
		container.setBounds(0, 0, width, height);
		container.setLayout(new GridLayout(1, false));
		container.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		setControl(scrolledComposite);
		
		Point p = getControl().getParent().getSize();
		System.out.println("Second page parent control size: " + p.x + " " + p.y);
		p = getControl().getSize();
		System.out.println("Second page control size: " + p.x + " " + p.y);
			
		for (int i = 0; i<numOfParas; i++) {
			Group group = new Group(container, SWT.NONE);
		    GridData groupGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		    groupGridData.widthHint = 500;
		    groupGridData.heightHint = 75;
		    group.setLayoutData(groupGridData);
		    group.setText("Parameter  " + (i+1));
		    GridLayout gd = new GridLayout(4, false);
		    gd.horizontalSpacing = 10;
		    group.setLayout(gd);
		    
			Label lblName = new Label(group, SWT.NONE);
			lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblName.setText("  &Name");
			
			Text nameText = new Text(group, SWT.BORDER);
			GridData gd_text_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
//			gd_text_1.widthHint = 100;
			nameText.setLayoutData(gd_text_1);
			nameText.setText("para_" + (i+1));
			nameText.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					validate();
				}
			});			
			paraNames.add(nameText);
			
			Label lblDes = new Label(group, SWT.NONE);
			lblDes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblDes.setText("&Description");
			
			Text desText = new Text(group, SWT.BORDER);
			GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
//			gd_text_1.widthHint = 100;
			desText.setLayoutData(gd_text_2);
			desText.setText("parameter description");
			desText.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					validate();
				}
			});		
			paraDescriptions.add(desText);
			
			Label lblType = new Label(group, SWT.NONE);
			lblType.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
			lblType.setText("  &Type");
			
			final Combo combo = new Combo(group, SWT.READ_ONLY);
			combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			combo.setCursor(new Cursor(getShell().getDisplay(), SWT.CURSOR_HAND));
			combo.setItems(simpleTypes);
			combo.select(0);
			paraTypes.add(combo);
			
			Button btnSimpleType = new Button(group, SWT.RADIO);
			btnSimpleType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					combo.setItems(simpleTypes);
					combo.select(0);
				}
			});
			btnSimpleType.setText("Simple");
			btnSimpleType.setSelection(true);
			
			Button btnComplexType = new Button(group, SWT.RADIO);
			btnComplexType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					combo.setItems(complexTypes);
					combo.select(0);
				}
			});
			btnComplexType.setText("Complex");
			
			new Label(group, SWT.NONE);
		}	
		
		setPageComplete(true);
	}
	
	private void validate() {
		setPageComplete(false);
		setErrorMessage(null);
		setMessage(null);
		
		for(int i=0; i<numOfParas; i++) {
			String msg = Validator.isValidJSIdentifier(paraNames.get(i).getText().trim());
			if(msg!=null) {
				setErrorMessage(msg);
				return;
			}
			
			if(paraDescriptions.get(i).getText().trim().isEmpty()) {
				setMessage("It's not recemmended to leave the parameter description empty", WizardPage.WARNING); // IMessageProvider.WARNING: 2
			}			
		}
		
		setPageComplete(true);
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}
	
	@Override
	public IWizardPage getPreviousPage() {
//		this.dispose();
//		this.getControl().dispose();
//		this.getControl().setSize(520,400);
		IWizardPage page =  super.getPreviousPage();
		
		Point p = page.getControl().getParent().getSize();
		System.out.println("Previous page parent control size: " + p.x + " " + p.y);
		
		page.getControl().getParent().setBounds(0,0,509,292);
		page.getControl().getParent().setSize(509,292);
		
		System.out.println("Previous page control size: " + page.getControl().getSize().x + " " + page.getControl().getSize().y);

		return page;
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
		for(String s : simpleTypes) {
			if(s.equals(para))
				return "simpleParameter";
		}
		return "complexParameter";
	}
	
}
