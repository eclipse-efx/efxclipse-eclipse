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
package org.eclipse.fx.ide.css.cssext;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CssExtDslStandaloneSetup extends CssExtDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CssExtDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

