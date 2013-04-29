/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard.clazz;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.fx.ide.ui.wizards.AbstractNewJDTElementWizard;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.ui.INewWizard;


public abstract class AbstractNewClassWizard<O extends JDTElement> extends AbstractNewJDTElementWizard<O> implements INewWizard {
	
	@Override
	protected IFile createFile() {
		IPackageFragment fragment = getDomainClass().getPackageFragment();
		if (fragment != null) {
			String cuName = getDomainClass().getName() + ".java";
			ICompilationUnit unit = fragment.getCompilationUnit(cuName); 
			IResource resource = unit.getResource();
			return (IFile) resource;
		} else {
			String cuName = getDomainClass().getName() + ".java";
			IFolder p = (IFolder) getDomainClass().getFragmentRoot().getResource();
			return p.getFile(cuName);
		}
	}
	
}
