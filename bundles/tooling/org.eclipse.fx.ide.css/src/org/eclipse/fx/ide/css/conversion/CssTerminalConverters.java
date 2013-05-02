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
package org.eclipse.fx.ide.css.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

/**
 * @author ccaks
 *
 */
public class CssTerminalConverters extends DefaultTerminalConverters {

	CSSSTRINGValueConverter cssStringValueConverter = new CSSSTRINGValueConverter();
	
	@ValueConverter(rule = "CSSSTRING")
	public IValueConverter<String> CSSSTRING() {
		return cssStringValueConverter;
	}
	
}
