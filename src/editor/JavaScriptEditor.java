package editor;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.editors.text.TextEditor;

//compare with JavaEditor which extends AbstractDecoratedTextEditor
//but TextEditor extends AbstractDecoratedTextEditor again
public class JavaScriptEditor extends TextEditor  {

	private ColorManager colorManager;
	
	public static final String GROUP_JAVASCRIPT = "_javascript";
	public static final String ACTION_COMMENT = "_comment";
	public static final String ACTION_DEBUGGER = "_launch_debugger";
	public static final String ACTION_FORMAT = "_format";
	public static final String ACTION_OUTLINE = "_outline";
	public static final String ACTION_TOGGLE_BREAKPOINT = "_toggle_breakpoint";


	public JavaScriptEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new JSSourceViewerConfiguration(colorManager));
		setDocumentProvider(new JSDocumentProvider());
		
		setActions();
		
	}
	
	private void setActions() {
		setAction(ACTION_COMMENT,new CommentAction());
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	
	/**
	 * Toggle comment out selection range.
	 */
	private class CommentAction extends Action {

		public CommentAction(){
			setEnabled(true);
			setAccelerator(SWT.CTRL | '/');
		}

		@Override
		public void run() {
			System.out.println("comment acrion");
			ITextSelection sel = (ITextSelection)getSelectionProvider().getSelection();
			IDocument doc = getDocumentProvider().getDocument(getEditorInput());
			String text = sel.getText();
			text = text.replaceAll("[\r\n \t]+$", ""); // rtrim
			int length = text.length();
			try {
				if(text.startsWith("//")){
					text = text.replaceAll("(^|\r\n|\r|\n)//","$1");
				} else {
					text = text.replaceAll("(^|\r\n|\r|\n)","$1//");
				}
				doc.replace(sel.getOffset(), length, text);
			} catch (BadLocationException e) {
				
			}
		}
	}

	

}
