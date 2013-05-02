/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CssDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public final static String DECLARATIONNAME = "DeclarationName"; 
	public final static String SELECTOR = "Selector";
	public final static String ELEMENT = "ELEMENT";
	public final static String URL = "Url";
	public final static String FUNCTION = "Function";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// from super (without the keyword)
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		// local
		acceptor.acceptDefaultHighlighting(DECLARATIONNAME, "Declaration", crossDeclarationTextStyle());
		acceptor.acceptDefaultHighlighting(SELECTOR, "Selector", crossSelectorTextStyle());
		acceptor.acceptDefaultHighlighting(URL, "Url", urlTextStyle());
		acceptor.acceptDefaultHighlighting(FUNCTION, "Function", functionTextStyle());
		acceptor.acceptDefaultHighlighting(ELEMENT, "Element", elementTextStyle());
	}

	public TextStyle crossDeclarationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0,153,0));
		return textStyle;
	}
	
	public TextStyle elementTextStyle() {
		TextStyle textStyle = crossSelectorTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	

	public TextStyle crossSelectorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,123,0));
		return textStyle;
	}
	
	public TextStyle urlTextStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		return textStyle;
	}
	
	public TextStyle functionTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}