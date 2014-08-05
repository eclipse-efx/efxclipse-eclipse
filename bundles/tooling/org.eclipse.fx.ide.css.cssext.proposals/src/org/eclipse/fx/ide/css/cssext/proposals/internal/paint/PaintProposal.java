/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.proposals.internal.paint;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;

import org.eclipse.fx.ide.css.ui.extapi.UIProposal;
import org.eclipse.fx.ui.controls.paint.PaintEditor;
import org.eclipse.fx.ui.controls.paint.PaintEditor.State;
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
		FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
		PaintEditor editor = new PaintEditor(null, State.OK, State.CANCEL);
		
		Scene scene = new Scene(editor);
		canvas.setScene(scene);
		
		shell.setLayout(new FillLayout());
		shell.open();
		shell.pack();
		
		AtomicBoolean bla = new AtomicBoolean();
		bla.set(true);
		
		editor.setStateConsumer((s,o) -> {
			if( s == State.OK ) {
				this.update(o);
				bla.set(true);
				shell.dispose();
			} else if( s == State.CANCEL ) {
				bla.set(false);
				shell.dispose();
			}
		});
		
		Display d = shell.getDisplay();
		
		while (!shell.isDisposed()) {
			if (!d.readAndDispatch()) {
				d.sleep();
			}
		}
		
		return proposal != null ? bla.get() : false;
		
	}
	
	private void update(Paint paint) {
		if( paint instanceof LinearGradient ) {
			LinearGradient g = (LinearGradient) paint;
			if( g.isProportional() ) {
				proposal = "linear-gradient( ";
				proposal += "from "+p(g.getStartX())+"% "+p(g.getStartY())+"% ";
				proposal += "to " + p(g.getEndX())+"% "+p(g.getEndY())+"%";
				if( g.getCycleMethod() == CycleMethod.REFLECT ) {
					proposal += ", reflect";
				} else if( g.getCycleMethod() == CycleMethod.REPEAT ) {
					proposal += ", repeat";
				}
				
				proposal += stopAsString(g.getStops());
				
				proposal += ")";
			} else {
				proposal = "linear-gradient( ";
				proposal += "from "+g.getStartX()+" "+g.getStartY()+" ";
				proposal += "to " + g.getEndX()+" "+g.getEndY()+"";
				if( g.getCycleMethod() == CycleMethod.REFLECT ) {
					proposal += ", reflect";
				} else if( g.getCycleMethod() == CycleMethod.REPEAT ) {
					proposal += ", repeat";
				}
				
				proposal += stopAsString(g.getStops());
				
				proposal += " )";
			}
		} else if( paint instanceof RadialGradient ) {
			RadialGradient g = (RadialGradient) paint;
			if( g.isProportional() ) {
				proposal = "radial-gradient( ";
				
				proposal += "focus-angle " + g.getFocusAngle()+"deg";
				proposal += ", focus-distance " + p(g.getFocusDistance())+"%";
				proposal += ", center " + p(g.getCenterX())+"% " + p(g.getCenterY())+"%";
				proposal += ", radius " + p(g.getRadius())+"%";
				
				if( g.getCycleMethod() == CycleMethod.REFLECT ) {
					proposal += ", reflect";
				} else if( g.getCycleMethod() == CycleMethod.REPEAT ) {
					proposal += ", repeat";
				}
				
				proposal += stopAsString(g.getStops());
				proposal += " )";
			} else {
				proposal = "radial-gradient( ";
				
				proposal += "focus-angle " + g.getFocusAngle()+"deg";
				proposal += ", focus-distance " + p(g.getFocusDistance())+"%";
				proposal += ", center " + g.getCenterX()+ " " + g.getCenterY();
				proposal += ", radius " + g.getRadius();
				
				if( g.getCycleMethod() == CycleMethod.REFLECT ) {
					proposal += ", reflect";
				} else if( g.getCycleMethod() == CycleMethod.REPEAT ) {
					proposal += ", repeat";
				}
				
				proposal += stopAsString(g.getStops());
				proposal += " )";
			}
		} else if( paint instanceof Color ) {
			proposal = rgb((Color) paint);
		}
	}
	
	private static String stopAsString(List<Stop> stops) {
		return stops.stream().map((s) -> rgb(s.getColor()) + " " + p(s.getOffset())).collect(Collectors.joining(", ", ", ",""));
	}
	
	private static String rgb(Color c) {
		String rv = "";
		if( c.getOpacity() == 1.0 ) {
			rv += "rgb(";
		} else {
			rv += "rgba(";
		}
		
		rv += toInt(c.getRed())+","+toInt(c.getGreen())+","+toInt(c.getBlue());
		
		if( c.getOpacity() != 1.0 ) {
			rv += "," + c.getOpacity();
		}
		
		rv += ")";
		return rv;
	}
	
	private static int toInt(double v) {
		return (int)(v * 255);
	}
	
	private static double p(double v) {
		return v * 100;
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
