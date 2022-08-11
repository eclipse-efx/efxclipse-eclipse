/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.ext;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;

import org.eclipse.fx.ide.css.ui.extapi.UIProposal;

public class ColorProposal implements UIProposal {

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
		return "Pick Color...";
	}

	@Override
	public int getPriority() {
		return 3;
	}

	@Override
	public boolean show() {
		ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		RGB rgb = dialog.open();
		if (rgb != null) {
			proposal = "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
			return true;
		}
		else {
			return false;
		}
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
