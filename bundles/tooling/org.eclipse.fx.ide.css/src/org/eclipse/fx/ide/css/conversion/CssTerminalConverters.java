/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
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
