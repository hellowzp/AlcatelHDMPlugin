package testwizard;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MyPageOne extends WizardPage {
  private Text text1;
  private Button radio1;
//  private Composite container;

  public MyPageOne() {
    super("First Page");
    setTitle("First Page");
    setDescription("Fake Wizard: First page");
  }

  @Override
  public void createControl(final Composite parent) {
    Composite container = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 3;
    Label label1 = new Label(container, SWT.NONE);
    label1.setText("Put a value here.");

    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
    text1.setText("");
    text1.addKeyListener(new KeyListener() {

      @Override
      public void keyPressed(KeyEvent e) {
      }

      @Override
      public void keyReleased(KeyEvent e) {
        if (!text1.getText().isEmpty()) {
            update(true,null);
        	
        } else {
        	update(false,"can't be empty!");
        }
      }

	 });
    
    Button button = new Button(container, SWT.PUSH);
    button.setText("Open Wizard");
//    button.addSelectionListener(new SelectionAdapter() {
//      @Override
//      public void widgetSelected(SelectionEvent e) {
//        WizardDialog wizardDialog = new WizardDialog(parent.getShell(),
//          new MyWizard());
//        if (wizardDialog.open() == Window.OK) {
//          System.out.println("Ok pressed");
//        } else {
//          System.out.println("Cancel pressed");
//          }
//      }
//    });
    
    radio1 = new Button(container, SWT.RADIO);
    radio1.setText("Option A");
    Button radio2 = new Button(container, SWT.RADIO);
    radio2.setText("Option B");
    
    radio1.addSelectionListener(new SelectionAdapter() {
    	@Override
        public void widgetSelected(SelectionEvent e) {
          System.out.println("Option A chosen!");
        }
	});
    
    
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    text1.setLayoutData(gd);
    button.setLayoutData(gd);
    // required to avoid an error in the system
    setControl(container);
    setPageComplete(false);

  }

  public String getText1() {
    return text1.getText();
  }
  
  private void update(boolean b, String msg) {
	setPageComplete(b);
	setErrorMessage(msg);
    getWizard().getContainer().updateButtons();
  }
  
  @Override
  public IWizardPage getNextPage() {
	  if(radio1.getSelection()) return getWizard().getPage("PAGE 1");
	  else return getWizard().getNextPage(this);		
  }
  
}
 