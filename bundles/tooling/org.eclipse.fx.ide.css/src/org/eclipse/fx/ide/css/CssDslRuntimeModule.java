/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css;

import org.eclipse.fx.ide.css.conversion.CssTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.NullFormatter;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CssDslRuntimeModule extends org.eclipse.fx.ide.css.AbstractCssDslRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return CssTerminalConverters.class;
	}
	
	@Override
	public Class<? extends IFormatter> bindIFormatter() {
		return NullFormatter.class;
	}
	
}
