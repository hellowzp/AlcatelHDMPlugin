package testwizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class WizardPage1 extends WizardPage {

	public WizardPage1(String pageName) {
		super(pageName);
		setTitle("Page 1 with name " + pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
	}
	
	@Override
	public IWizardPage getNextPage() {
		return getWizard().getPage("finishPage");
	}
	
}
