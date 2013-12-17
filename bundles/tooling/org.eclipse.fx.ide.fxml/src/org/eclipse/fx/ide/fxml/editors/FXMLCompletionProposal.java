/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.editors;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.sse.ui.internal.contentassist.IRelevanceCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;

/**
 * Completetion proposal
 */
@SuppressWarnings("restriction")
public class FXMLCompletionProposal extends ConfigurableCompletionProposal implements IRelevanceCompletionProposal {

	/**
	 * Create a proposal
	 * 
	 * @param replacementString
	 *            the replacement string
	 * @param replacementOffset
	 *            the offset
	 * @param replacementLength
	 *            the length
	 * @param cursorPosition
	 *            the cursor position after the replace
	 */
	public FXMLCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition) {
		super(replacementString, replacementOffset, replacementLength, cursorPosition);
	}

	/**
	 * Create a proposal
	 * 
	 * @param replacementString
	 *            the replacement string
	 * @param replacementOffset
	 *            the offset
	 * @param replacementLength
	 *            the length
	 * @param cursorPosition
	 *            the cursor position after the replace
	 * @param image
	 *            the image to display
	 * @param displayString
	 *            the displayed string
	 * @param additionalProposalInfo
	 *            additional informations
	 */
	public FXMLCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition, Image image, StyledString displayString, String additionalProposalInfo) {
		super(replacementString, replacementOffset, replacementLength, cursorPosition, image, displayString, null, additionalProposalInfo);
	}

	@Override
	public int getRelevance() {
		return getPriority();
	}
}