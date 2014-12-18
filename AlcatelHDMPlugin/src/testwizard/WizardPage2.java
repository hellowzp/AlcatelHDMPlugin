package testwizard;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class WizardPage2 extends WizardPage {

	public WizardPage2(String pageName) {
		super(pageName);
		setTitle("Page 2 with name " + pageName);
	}

	@Override
	public void createControl(Composite parent) {
		setControl(parent);
	}
	
	@Override
	public IWizardPage getNextPage() {
		return getWizard().getPage("finishPage");
	}

}
