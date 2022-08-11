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
package org.eclipse.fx.ide.jdt.ui.internal.wizard.clazz;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;


/**
 * @author Tom Schindl
 *
 */
public class NewApplicationClassPage extends AbstractJDTElementPage<JDTElement> {
	
	protected NewApplicationClassPage(IPackageFragmentRoot froot, IPackageFragment fragment,
			IWorkspaceRoot fWorkspaceRoot) {
		super("newApplicationId", "JavaFX Main Class", "Create a new JavaFX Main Class", froot, fragment, fWorkspaceRoot);
	}
	
	@Override
	protected ImageDescriptor getTitleAreaImage(Display display) {
		return JavaFXUIPlugin.imageDescriptorFromPlugin(JavaFXUIPlugin.PLUGIN_ID, "/icons/wizban/newclass_wiz.png");
	}

	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		
	}

	@Override
	protected JDTElement createInstance() {
		return new JDTElement();
	}

}
