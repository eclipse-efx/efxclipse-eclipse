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
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISources;

public class RunBuildHandler extends AbstractBuildHandler {
	@Override
	protected IFile getConfigurationFile(IEvaluationContext context) {
		if( "org.eclipse.fx.ide.jdt.ui.fxbuild".equals(context.getVariable(ISources.ACTIVE_EDITOR_ID_NAME)) ) {
			IFileEditorInput input = (IFileEditorInput) context.getVariable(ISources.ACTIVE_EDITOR_INPUT_NAME);
			return input.getFile();	
		}
		
		ISelection s = (ISelection) context.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if( s instanceof IStructuredSelection ) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if( o instanceof IFile ) {
				return (IFile) o;
			}
		}
		return null;
	}

	@Override
	protected boolean launchAnt() {
		return true;
	}
}