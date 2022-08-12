/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FXGraphStandaloneSetup extends FXGraphStandaloneSetupGenerated{

	public static void doSetup() {
		new FXGraphStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

