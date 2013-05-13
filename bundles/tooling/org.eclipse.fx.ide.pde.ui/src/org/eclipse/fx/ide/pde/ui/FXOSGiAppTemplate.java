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
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.pde.ui.templates.OSGiLaunchDef;
import org.eclipse.fx.ide.pde.ui.templates.PluginLaunchDef;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.iproduct.IArgumentsInfo;
import org.eclipse.pde.internal.core.iproduct.IProduct;
import org.eclipse.pde.internal.core.iproduct.IProductModelFactory;
import org.eclipse.pde.internal.ui.wizards.product.BaseProductCreationOperation;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

import org.eclipse.fx.ide.pde.ui.templates.OSGiAppLaunchGenerator;

@SuppressWarnings("restriction")
public class FXOSGiAppTemplate extends FXPDETemplateSection {
	public static final String KEY_APPLICATION_CLASS = "applicationClass"; //$NON-NLS-1$
	public static final String KEY_WINDOW_TITLE = "windowTitle"; //$NON-NLS-1$

	public FXOSGiAppTemplate() {
		setPageCount(1);
		createOptions();
	}
	
	private void createOptions() {
		addOption(KEY_WINDOW_TITLE, "Title", "Hello JavaFX", 0); //$NON-NLS-1$ 
		addOption(KEY_PACKAGE_NAME, "Package", (String) null, 0);
		addOption(KEY_APPLICATION_CLASS, "Application class", "Application", 0); //$NON-NLS-1$
		
		createBrandingOptions();
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
		return "javaFXApp"; //$NON-NLS-1$
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		createApplicationExtension();
		
		if (getBooleanOption(KEY_PRODUCT_BRANDING))
			createProductExtension();
		
		updateBuildModel();
	}

	private void createApplicationExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();

		IPluginExtension extension = createExtension("org.eclipse.core.runtime.applications", true); //$NON-NLS-1$
		extension.setId(VALUE_APPLICATION_ID);

		IPluginElement element = model.getPluginFactory().createElement(extension);
		element.setName("application"); //$NON-NLS-1$
		extension.add(element);

		IPluginElement run = model.getPluginFactory().createElement(element);
		run.setName("run"); //$NON-NLS-1$
		run.setAttribute("class", getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_APPLICATION_CLASS)); //$NON-NLS-1$ //$NON-NLS-2$
		element.add(run);

		if (!extension.isInTheModel())
			plugin.add(extension);
	}
	
	private void createProductExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();
		IPluginExtension extension = createExtension("org.eclipse.core.runtime.products", true); //$NON-NLS-1$
		extension.setId(VALUE_PRODUCT_ID);

		IPluginElement element = model.getFactory().createElement(extension);
		element.setName("product"); //$NON-NLS-1$
		element.setAttribute("name", getStringOption(KEY_WINDOW_TITLE)); //$NON-NLS-1$  
		element.setAttribute("application", plugin.getId() + "." + VALUE_APPLICATION_ID); //$NON-NLS-1$ //$NON-NLS-2$

		IPluginElement property = model.getFactory().createElement(element);

		property = model.getFactory().createElement(element);
		property.setName("property"); //$NON-NLS-1$
		property.setAttribute("name", "windowImages"); //$NON-NLS-1$ //$NON-NLS-2$
		property.setAttribute("value", "icons/alt_window_16.gif,icons/alt_window_32.gif"); //$NON-NLS-1$ //$NON-NLS-2$
		element.add(property);

		extension.add(element);

		if (!extension.isInTheModel())
			plugin.add(extension);
	}
	
	@Override
	public void execute(IProject project, final IPluginModelBase model,
			IProgressMonitor monitor) throws CoreException {
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
		
		IFile f = project.getFile(new Path(project.getName() + ".product.launch"));
		OSGiLaunchDef def = new OSGiLaunchDef();
		def.setProjectName(project.getName());
		def.getTargetPlugins().addAll(OSGiLaunchDef.getTargetDefinitions());
		def.getWorkbenchPlugins().add(new PluginLaunchDef(project.getName()));
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(new OSGiAppLaunchGenerator().generate(def).toString().getBytes());
			f.create(in, true, monitor);
			in.close();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (getBooleanOption(KEY_PRODUCT_BRANDING)) {
			IFile file = project.getFile(new org.eclipse.core.runtime.Path(model.getPluginBase().getId() + ".product"));
			
			try {
				new BaseProductCreationOperation(file) {
					@Override
					protected void initializeProduct(IProduct product) {
						super.initializeProduct(product);
						
						{
							String args = product.getLauncherArguments().getVMArguments(IArgumentsInfo.L_ARGS_ALL);
							if( args == null ) {
								args = "";
							}
							args += "-Dosgi.framework.extensions=org.eclipse.fx.osgi";
							product.getLauncherArguments().setVMArguments(args, IArgumentsInfo.L_ARGS_ALL);
						}
						
						{
							String args = product.getLauncherArguments().getProgramArguments(IArgumentsInfo.L_ARGS_ALL);
							if( args == null ) {
								args = "";
							}
							args += "-nosplash";
							product.getLauncherArguments().setProgramArguments(args, IArgumentsInfo.L_ARGS_ALL);
						}
						
						{
							// No Mac Flags
							product.getLauncherArguments().setVMArguments("", IArgumentsInfo.L_ARGS_MACOS);
						}
						
						IProductModelFactory factory = product.getModel().getFactory();
						product.setProductId(model.getPluginBase().getId() + "." + VALUE_PRODUCT_ID);
						product.setApplication(model.getPluginBase().getId() + "." + VALUE_APPLICATION_ID);
						product.setName("product");
						
						List<String> l = new ArrayList<String>();
						l.addAll(Arrays.asList(model.getPluginBase().getId(),
								"org.eclipse.fx.osgi",
								"org.eclipse.fx.javafx",
								"org.eclipse.fx.ui.application",
								"org.eclipse.fx.core.databinding",
								"org.eclipse.fx.ui.databinding",
								"org.eclipse.core.databinding",
								"org.eclipse.core.databinding.observable",
								"org.eclipse.core.databinding.property",
								"org.eclipse.equinox.app",
								"org.eclipse.osgi",
								"org.eclipse.equinox.common",
								"org.eclipse.equinox.registry",
								"org.eclipse.equinox.ds",
								"org.eclipse.equinox.event",
								"org.eclipse.equinox.util",
								"org.eclipse.osgi.services",
								"com.ibm.icu", //TODO Can we replace this please???
								
								"org.eclipse.core.runtime", //TODO Should be removed!
								"org.eclipse.core.jobs",
								"org.eclipse.equinox.preferences",
								"org.eclipse.core.contenttype"
						));
						
						addPlugins(factory, product, l.toArray(new String[0]));
					}
				}.run(monitor);				
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[3];
		dep[0] = new PluginReference("org.eclipse.equinox.app", null, 0); //$NON-NLS-1$
		dep[1] = new PluginReference("org.eclipse.osgi", null, 0); //$NON-NLS-1$
		dep[2] = new PluginReference("org.eclipse.fx.ui.application", null, 0); //$NON-NLS-1$
		
		return dep;
	}
	
	public boolean isDependentOnParentWizard() {
		return true;
	}
	
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}
	
	public String[] getNewFiles() {
		if (copyBrandingDirectory())
			return new String[] {"icons/", "splash.bmp"}; //$NON-NLS-1$ //$NON-NLS-2$
		return super.getNewFiles();
	}
}
