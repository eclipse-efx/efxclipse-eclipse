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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

public class FXOSGiBundleTemplate extends FXPDETemplateSection {

	public FXOSGiBundleTemplate() {
		setPageCount(1);
	}
	
	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0);
		page.setTitle("JavaFX Bundle");
		page.setDescription("Template to create JavaFX application");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}
	
	@Override
	public String getUsedExtensionPoint() {
		return null;
	}

	@Override
	public String getSectionId() {
		return "javaFXBundle";
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		updateBuildModel();
	}
	
	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[1];
		dep[0] = new PluginReference("org.eclipse.core.runtime", null, 0); //$NON-NLS-1$
		
		return dep;
	}

	@Override
	public void execute(IProject project, IPluginModelBase model,
			IProgressMonitor monitor) throws CoreException {
//		IJavaProject jProject = JavaCore.create(project);
//		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>(Arrays.asList(jProject.getRawClasspath()));
//		entries.add(JavaCore.newContainerEntry(JavaFXCore.JAVAFX_CONTAINER_PATH));
//		jProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);
		
		if( model.getPluginBase() instanceof BundlePluginBase ) {
			IBundle bundle = ((BundlePluginBase) model.getPluginBase()).getBundle();
			
			String imports = bundle.getHeader(Constants.IMPORT_PACKAGE);
			if( imports == null ) {
				imports = "";
			}
			
			imports += Activator.getCommaValuesFromPackagesArray(Activator.getJavaFXImports(), null);
			
			bundle.setHeader(Constants.IMPORT_PACKAGE, imports);
		}
		super.execute(project, model, monitor);
	}
	
}
