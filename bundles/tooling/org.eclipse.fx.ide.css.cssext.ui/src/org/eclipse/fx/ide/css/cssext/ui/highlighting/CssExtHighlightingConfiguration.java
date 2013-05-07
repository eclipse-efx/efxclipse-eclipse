/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CssExtHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static String PACKAGE_NAME = "packagename";
	public static String CSSDOC_ID = "CSSDOC_ID";
	public static String REFERENCES_ID = "REFERENCES_ID";
	
	public static String ELEMENT_ID = "ELEMENT_ID";
	public static String PROPERTY_ID = "PROPERTY_ID";
	
	public static String RULE_ID = "RULE_ID";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		acceptor.acceptDefaultHighlighting(CSSDOC_ID, "Css Documentation", cssDocTextStyle());
		acceptor.acceptDefaultHighlighting(REFERENCES_ID, "References", referencesTextStyle());
		acceptor.acceptDefaultHighlighting(PACKAGE_NAME, "PackageDefinition", packageTextStyle());
		acceptor.acceptDefaultHighlighting(RULE_ID, "Css Rule", ruleTextStyle());
		acceptor.acceptDefaultHighlighting(PROPERTY_ID, "Property Definition", propertyTextStyle());
		acceptor.acceptDefaultHighlighting(ELEMENT_ID, "Element Definition", elementTextStyle());
	}
 
	public TextStyle cssDocTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63,95,191));
		return textStyle;
	}
	
	public TextStyle referencesTextStyle() {
		TextStyle textStyle = ruleTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle packageTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,123,0));
		return textStyle;
	}
	
	public TextStyle elementTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,123,0));
		return textStyle;
	}
	
	public TextStyle propertyTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0,123,0));
		return textStyle;
	}
	
	public TextStyle ruleTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,23,0));
		return textStyle;
	}
	
	
	
}
