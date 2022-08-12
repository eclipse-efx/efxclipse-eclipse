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
package org.eclipse.fx.ide.model.internal;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.compiler.CompilationParticipant;
import org.eclipse.jdt.core.compiler.ReconcileContext;

public class ModelUpdater extends CompilationParticipant {

	public ModelUpdater() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isActive(IJavaProject project) {
		return true;
	}

	@Override
	public void reconcile(ReconcileContext context) {
		IJavaElementDelta delta = context.getDelta();
		if (delta != null) {
			if (delta.getElement() instanceof ICompilationUnit) {

				ICompilationUnit u = (ICompilationUnit) delta.getElement();
				try {
					for (IType t : u.getTypes()) {
						FXPlugin.getClassmodel().clearCache(t);
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		super.reconcile(context);
	}
}
