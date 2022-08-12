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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.PreloaderClassGenerator;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;

/**
 * @author Tom Schindl
 *
 */
public class NewPreloaderClassWizard extends AbstractNewClassWizard<JDTElement> {

	@Override
	public void addPages() {
		addPage(new NewPreloaderClassPage(getInitialRoot(),getInitialFragment(),ResourcesPlugin.getWorkspace().getRoot()));
	}


	@Override
	protected IGenerator<JDTElement> getGenerator() {
		return new PreloaderClassGenerator();
	}

}
