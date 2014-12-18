package testwizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class WizardPage3 extends WizardPage  {

	public WizardPage3() {
		super("finishPage");
		setTitle("Finish");
		setDescription("Finish page");
	}

	@Override
	public void createControl(Composite parent) {
		setControl(parent);
	}
}
