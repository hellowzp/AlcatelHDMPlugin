package ui;

import java.util.ArrayList;
import java.util.List;

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

public class ParaConfigurePage extends WizardPage {

	private List<Text> paraNames;
	private List<Combo> paraTypes;
	private List<Text> paraDescriptions;
	private int numOfParas;
	
	private static final String[] simpleTypes = new String[]{"Simple1","Simple2","Simple3"};
	private static final String[] complexTypes = new String[]{"Complex1","Complex2","Complex3"};


	public ParaConfigurePage(int numOfParas) {
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
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
//		container.setSize(420, 500);
		container.setLayout(new GridLayout(1, false));
		
		for(int i=0; i<numOfParas; i++) {
			Group group = new Group(container, SWT.NONE);
		    GridData groupGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		    groupGridData.widthHint = 480;
		    group.setLayoutData(groupGridData);
		    group.setText("Parameter  " + (i+1));
		    group.setLayout(new GridLayout(4, false));
		    
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
					if( ( (Text)e.getSource() ).getText().isEmpty()) {
						setErrorMessage("It's recommended not to leave the paramater name empty");
						setPageComplete(false);
					}else{
						setErrorMessage(null);
						setPageComplete(true);
					}
				}
			});			
			paraNames.add(nameText);
			
			Label lblDes = new Label(group, SWT.NONE);
			lblDes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblDes.setText("  &Description");
			
			Text desText = new Text(group, SWT.BORDER);
			GridData gd_text_2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
//			gd_text_1.widthHint = 100;
			desText.setLayoutData(gd_text_2);
			desText.setText("parameter description");
			desText.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					if( ( (Text)e.getSource() ).getText().isEmpty()) {
						setErrorMessage("It's recommended not to leave the paramater name empty");
						setPageComplete(false);
					}else{
						setErrorMessage(null);
						setPageComplete(true);
					}
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
	
	@Override
	public boolean canFlipToNextPage() {
		return false;
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
