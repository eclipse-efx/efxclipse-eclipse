/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.pde.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.pde.core.project.IPackageImportDescription;
import org.eclipse.pde.core.project.IRequiredBundleDescription;

import org.eclipse.fx.ide.jdt.ui.internal.wizard.clazz.AbstractNewClassWizard;
import org.eclipse.fx.ide.pde.ui.templates.E3ViewPartGenerator;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;

public class E3ViewPartClassWizard extends AbstractNewClassWizard<JDTElement> {

	@Override
	public void addPages() {
		addPage(new E3ViewPartClassPage(root,fragment,ResourcesPlugin.getWorkspace().getRoot()));
	}
	
	@Override
	protected IGenerator<JDTElement> getGenerator() {
		return new E3ViewPartGenerator();
	}

	public boolean performFinish() {
		try {
			IBundleProjectService bpService = Activator.getDefault().acquireService(IBundleProjectService.class);
			IProject p = root.getJavaProject().getProject();
			
			if( p.hasNature("org.eclipse.pde.PluginNature") ) {
				IBundleProjectDescription bundleDesc = bpService.getDescription(p);
				
				IRequiredBundleDescription requireDesc = bpService.newRequiredBundle("org.eclipse.fx.ui.workbench3", null, false, false);
				IPackageImportDescription importDesc = bpService.newPackageImport("javafx.scene", null, false);
				
				BundleHelper.addRequiredBundleDescriptions(bundleDesc, requireDesc);
				BundleHelper.addPackageImportDescriptions(bundleDesc, importDesc);
				
				bundleDesc.apply(new NullProgressMonitor());
				return super.performFinish();
			} else {
				// TODO Show error that project is not a plugin
				return false;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
