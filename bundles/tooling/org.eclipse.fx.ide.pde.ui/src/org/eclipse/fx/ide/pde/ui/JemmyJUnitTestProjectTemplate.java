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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.pde.ui.templates.JemmyLaunchDef;
import org.eclipse.fx.ide.pde.ui.templates.PluginLaunchDef;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

import org.eclipse.fx.ide.pde.ui.templates.JemmyLaunch;

public class JemmyJUnitTestProjectTemplate extends FXPDETemplateSection {

	private static final String KEY_TEST_SUITE_CLASS = "testSuiteClass";
	private static final String KEY_TEST_PRODUCT_BUNDLE_ID = "testProductBundleId";
	private static final String KEY_TEST_E4_PRODUCT = "e4Product";
	
	public JemmyJUnitTestProjectTemplate() {
		setPageCount(1);
		createOptions();
	}
	
	private void createOptions() {
		addOption(KEY_TEST_PRODUCT_BUNDLE_ID, "Product Bundle Id:", null, 0);
		addOption(KEY_PACKAGE_NAME, "Pa&ckage name:", (String) null, 0);
		addOption(KEY_TEST_SUITE_CLASS, "TestSuite Class:", null, 0);
		addOption(KEY_TEST_E4_PRODUCT, "e4 product", false, 0);
	}
	
	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0);
		page.setTitle("JavaFX Application");
		page.setDescription("Template to create JavaFX application");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	protected void initializeFields(IFieldData data) {
		// In a new project wizard, we don't know this yet - the
		// model has not been created
		String packageName = getFormattedPackageName(data.getId());
		initializeOption(KEY_PACKAGE_NAME, packageName);
	}
	
	public void initializeFields(IPluginModelBase model) {
		String packageName = getFormattedPackageName(model.getPluginBase().getId());
		initializeOption(KEY_PACKAGE_NAME, packageName);
	}
	
	@Override
	public String getUsedExtensionPoint() {
		return null;
	}

	@Override
	public String getSectionId() {
		return "jemmyOsgi";
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
	}

	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[2];
		dep[0] = new PluginReference("at.bestsolution.efxclipse.jemmy", null, 0); //$NON-NLS-1$
		dep[1] = new PluginReference("org.junit4", null, 0); //$NON-NLS-1$
		
		return dep;
	}
	
	@Override
	public void execute(IProject project, IPluginModelBase model, IProgressMonitor monitor) throws CoreException {
		if( model.getPluginBase() instanceof BundlePluginBase ) {
			IBundle bundle = ((BundlePluginBase) model.getPluginBase()).getBundle();
			
			String imports = bundle.getHeader(Constants.IMPORT_PACKAGE);
			if( imports == null ) {
				imports = "";
			}
			
			List<String> collection = new ArrayList<String>();
			collection.addAll(Arrays.asList(Activator.getJavaFXImports()));
			collection.addAll(Arrays.asList(Activator.getJemmyImports()));
			imports += Activator.getCommaValuesFromPackagesArray(collection.toArray(new String[0]), null);
			
			bundle.setHeader(Constants.IMPORT_PACKAGE, imports);
		}
		super.execute(project, model, monitor);
		
		IFile f = project.getFile(new Path(project.getName() + ".launch"));
		JemmyLaunch l = new JemmyLaunch();
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(l.generate(createDef(project)).toString().getBytes());
			f.create(in, IFile.FORCE, monitor);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("restriction")
	private JemmyLaunchDef createDef(IProject p) {
		IPluginModelBase productBundle = PDECore.getDefault().getModelManager().findModel(getValue(KEY_TEST_PRODUCT_BUNDLE_ID)+"");
		Set<String> workspace = new HashSet<String>();
		Set<String> target = new HashSet<String>();
		
		calculateBundleDependencies(workspace, target, productBundle.getBundleDescription());
		
		JemmyLaunchDef d = new JemmyLaunchDef();
		d.setProjectName(p.getName());
		d.setJunitClassName(getValue(KEY_PACKAGE_NAME)+"." + getValue(KEY_TEST_SUITE_CLASS));
		d.setTestProductId(getValue(KEY_TEST_PRODUCT_BUNDLE_ID)+".product");
		if( getBooleanOption(KEY_TEST_E4_PRODUCT) ) {
			d.getTargetPlugins().addAll(JemmyLaunchDef.getTargetPluginsE4());	
		} else {
			d.getTargetPlugins().addAll(JemmyLaunchDef.getTargetPluginsOSGi());
		}
		
		for( String t : target ) {
			d.getTargetPlugins().add(new PluginLaunchDef(t));
		}
		d.getWorkbenchPlugins().add(new PluginLaunchDef(model.getPluginBase().getId()));
		for( String w : workspace ) {
			d.getWorkbenchPlugins().add(new PluginLaunchDef(w));
		}
		
		return d;
	}
	
	private void calculateBundleDependencies(Set<String> workspace, Set<String> target, BundleDescription desc) {
		if( ! workspace.contains(desc.getName()) && ! target.contains(desc.getName()) ) {
			IPluginModelBase model = PluginRegistry.findModel(desc);
			IResource resource = model.getUnderlyingResource();
			if( resource == null ) {
				target.add(desc.getName());
			} else {
				workspace.add(desc.getName());
			}
			
			for( BundleDescription sub : desc.getResolvedRequires() ) {
				calculateBundleDependencies(workspace, target, sub);
			}
		}
	}
	
	public boolean isDependentOnParentWizard() {
		return true;
	}
}
