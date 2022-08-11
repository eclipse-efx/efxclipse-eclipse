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
package org.eclipse.fx.ide.pde.ui;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;

public class E3ViewPartClassPage extends AbstractJDTElementPage<JDTElement> {

	protected E3ViewPartClassPage(IPackageFragmentRoot froot, IPackageFragment fragment,
			IWorkspaceRoot fWorkspaceRoot) {
		super("newE3ViewPartClass", "JavaFX 3.x ViewPart", "Create a new JavaFX ViewPart class", froot, fragment, fWorkspaceRoot);
	}

	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		
	}

	@Override
	protected JDTElement createInstance() {
		return new JDTElement();
	}

	@Override
	protected ImageDescriptor getTitleAreaImage(Display display) {
		return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/wizban/newclass_wiz.png");
	}

}
