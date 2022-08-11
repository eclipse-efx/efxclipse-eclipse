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
package org.eclipse.fx.ide.fxgraph.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.AbstractJvmModelRenameStrategy;

import com.google.inject.Inject;

/**
 * Encapsulates the model changes of a rename refactoring.  
 */
public class FXGraphRenameStrategy extends AbstractJvmModelRenameStrategy {

	@Override
	protected void setInferredJvmElementName(String name, EObject renamedSourceElement) {
		/*
		 * TODO: rename inferred elements as you would in IJvmModelInferrer 
		 */
	}
}
