package org.eclipse.fx.ide.css.cssext.proposals.internal.paint;

import java.util.concurrent.atomic.AtomicBoolean;

import javafx.application.Platform;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.transform.Scale;

import org.eclipse.fx.ide.css.ui.extapi.UIProposal;
import org.eclipse.fx.ui.controls.paint.PaintEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class PaintProposal implements UIProposal {

	private String proposal;
	
	
	@Override
	public Object getAdditionalInfo() {
		return null;
	}

	@Override
	public String getProposal() {
		return proposal;
	}

	@Override
	public String getImageUrl() {
		return null;
	}

	@Override
	public String getLabel() {
		return "Pick Paint...";
	}

	@Override
	public int getPriority() {
		return 3;
	}

	@Override
	public boolean show() {
		Shell shell = new Shell();
		Platform.setImplicitExit(false);
		FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
		PaintEditor editor = new PaintEditor(null);
		
		Scene scene = new Scene(editor);
		canvas.setScene(scene);
		
		shell.setLayout(new FillLayout());
		shell.open();
		
		AtomicBoolean bla = new AtomicBoolean();
		bla.set(true);
		
		editor.setOkConsumer((o) -> {this.update(o); shell.dispose();});
		editor.setApplyConsumer((o) -> {this.update(o);});
		editor.setCancel(()-> {bla.set(false); shell.dispose();});
		
		Display d = shell.getDisplay();
		
		while (!shell.isDisposed()) {
			if (!d.readAndDispatch()) {
				d.sleep();
			}
		}
		
		
		
		
		
		return bla.get();
		
	}
	
	private void update(Paint paint) {
		
		proposal = paint.toString();
	}

	@Override
	public boolean hide() {
		return false;
	}

	@Override
	public Type getType() {
		return Type.Value;
	}
	
//	ConfigurableCompletionProposal dialogProposal = (ConfigurableCompletionProposal) createCompletionProposal("Pick color ...",context);
//	if( dialogProposal != null ) {
//		dialogProposal.setTextApplier(new ReplacementTextApplier() {
//			
//			@Override
//			public String getActualReplacementString(
//					ConfigurableCompletionProposal proposal) {
//				ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//				RGB rgb = dialog.open();
//				if( rgb != null ) {
//					return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
//				}
//				return null;
//			}
//		});
//	}
//	acceptor.accept(dialogProposal); 
}
