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

import org.eclipse.fx.ide.fxgraph.compiler.FXGraphOutputConfigurationProvider;
import org.eclipse.fx.ide.fxgraph.scoping.FXGraphQualifiedNameProvider;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class FXGraphRuntimeModule extends org.eclipse.fx.ide.fxgraph.AbstractFXGraphRuntimeModule {
	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.eclipse.fx.ide.fxgraph.generator.FXGraphGenerator.class;
	}
	
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return FXGraphQualifiedNameProvider.class;
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return FXGraphOutputConfigurationProvider.class;
	}
}
