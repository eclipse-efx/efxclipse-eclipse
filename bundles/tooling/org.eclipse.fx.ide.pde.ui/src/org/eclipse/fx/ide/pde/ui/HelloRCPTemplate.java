/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.pde.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.iproduct.IArgumentsInfo;
import org.eclipse.pde.internal.core.iproduct.IProduct;
import org.eclipse.pde.internal.core.iproduct.IProductModelFactory;
import org.eclipse.pde.internal.ui.wizards.product.BaseProductCreationOperation;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;
import org.osgi.framework.Version;

@SuppressWarnings("restriction")
public class HelloRCPTemplate extends FXPDETemplateSection {

	public static final String KEY_APPLICATION_CLASS = "applicationClass"; //$NON-NLS-1$
	public static final String KEY_WINDOW_TITLE = "windowTitle"; //$NON-NLS-1$
	public static final String KEY_VIEW_PART_CLASS = "viewPartClass"; //$NON-NLS-1$
	public static final String KEY_VIEW_NAME = "viewName";
	
	public HelloRCPTemplate() {
		setPageCount(1);
		createOptions();
	}

	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0, null);
		page.setTitle("Basic JavaFX/RCP application");
		page.setDescription("This template creates a minimal standalone JavaFX/RCP application that consists of an application window with a title.");
		wizard.addPage(page);
		markPagesAdded();
	}

	private void createOptions() {
		addOption(KEY_WINDOW_TITLE, "Application window &title:", "Hello RCP", 0); //$NON-NLS-1$ 
		
		addOption(KEY_PACKAGE_NAME, "Pa&ckage name:", (String) null, 0);
		addOption(KEY_APPLICATION_CLASS, "App&lication class:", "Application", 0); //$NON-NLS-1$ 
		
		addOption(KEY_VIEW_PART_CLASS, "ViewPart class", "MyViewPart", 0); //$NON-NLS-1$
		addOption(KEY_VIEW_NAME, "Name", "My FX View", 0);
		
		createBrandingOptions();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.pde.ui.templates.OptionTemplateSection#getSectionId()
	 */
	public String getSectionId() {
		return "helloRCP"; //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.AbstractTemplateSection#updateModel(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		createApplicationExtension();
		createPerspectiveExtension();
		createViewExtension();
		
		if (getBooleanOption(KEY_PRODUCT_BRANDING))
			createProductExtension();
	}

	private void createViewExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();
		IPluginExtension extension = createExtension("org.eclipse.ui.views", true); //$NON-NLS-1$
		IPluginModelFactory factory = model.getPluginFactory();
		
		String fullClassName = getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_VIEW_PART_CLASS); //$NON-NLS-1$ //$NON-NLS-2$
		IPluginElement viewElement = factory.createElement(extension);
		viewElement.setName("view"); //$NON-NLS-1$
		viewElement.setAttribute("id", fullClassName); //$NON-NLS-1$
		viewElement.setAttribute("name", getStringOption(KEY_VIEW_NAME)); //$NON-NLS-1$ //$NON-NLS-2$
		viewElement.setAttribute("icon", "icons/sample.gif"); //$NON-NLS-1$ //$NON-NLS-2$
		viewElement.setAttribute("class", fullClassName); //$NON-NLS-1$
		extension.add(viewElement);
		
		if (!extension.isInTheModel())
			plugin.add(extension);
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

	private void createPerspectiveExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();

		IPluginExtension extension = createExtension("org.eclipse.ui.perspectives", true); //$NON-NLS-1$
		IPluginElement element = model.getPluginFactory().createElement(extension);
		element.setName("perspective"); //$NON-NLS-1$
		element.setAttribute("class", getStringOption(KEY_PACKAGE_NAME) + ".Perspective"); //$NON-NLS-1$ //$NON-NLS-2$
		element.setAttribute("name", VALUE_PERSPECTIVE_NAME); //$NON-NLS-1$
		element.setAttribute("id", plugin.getId() + ".perspective"); //$NON-NLS-1$ //$NON-NLS-2$
		extension.add(element);

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
						
						IProductModelFactory factory = product.getModel().getFactory();
						product.setProductId(model.getPluginBase().getId() + "." + VALUE_PRODUCT_ID);
						product.setApplication(model.getPluginBase().getId() + "." + VALUE_APPLICATION_ID);
						product.setName("product");
						
						List<String> l = new ArrayList<String>();
						l.addAll(Arrays.asList(model.getPluginBase().getId(),
								"org.eclipse.fx.osgi",
								"org.eclipse.fx.javafx",
								"org.eclipse.fx.ui.workbench3",
								
								"org.eclipse.ui",
								"org.eclipse.core.runtime",
								"org.eclipse.core.jobs",
								"org.eclipse.equinox.preferences",
								"org.eclipse.core.contenttype",
								"org.eclipse.core.databinding",
								"org.eclipse.core.databinding.observable",
								"org.eclipse.core.databinding.property",
								"org.eclipse.equinox.app",
								"org.eclipse.osgi",
								"org.eclipse.equinox.common",
								"org.eclipse.equinox.registry",
								"com.ibm.icu", //TODO Can we replace this please???
								"org.eclipse.core.expressions",
								"org.eclipse.jface",
								"org.eclipse.swt",
								"org.eclipse.swt.carbon.macosx",
								"org.eclipse.swt.cocoa.macosx",
								"org.eclipse.swt.cocoa.macosx.x86_64",
//								"org.eclipse.swt.gtk.linux.ppc",
//								"org.eclipse.swt.gtk.linux.ppc64",
//								"org.eclipse.swt.gtk.linux.s390",
//								"org.eclipse.swt.gtk.linux.s390x",
								"org.eclipse.swt.gtk.linux.x86",
								"org.eclipse.swt.gtk.linux.x86_64",
//								"org.eclipse.swt.gtk.solaris.sparc",
//								"org.eclipse.swt.gtk.solaris.x86",
//								"org.eclipse.swt.motif.aix.ppc",
//								"org.eclipse.swt.motif.hpux.ia64_32",
//								"org.eclipse.swt.motif.linux.x86",
//								"org.eclipse.swt.motif.solaris.sparc",
//								"org.eclipse.swt.photon.qnx.x86",
								"org.eclipse.swt.win32.win32.x86",
								"org.eclipse.swt.win32.win32.x86_64",
								"org.eclipse.ui.workbench",
								"org.eclipse.core.commands",
								"org.eclipse.help",
								"org.eclipse.jface.databinding"
							));
						IPluginModelBase m = PluginRegistry.findModel("org.eclipse.ui.workbench");
						
						if( m != null ) {
							if( new Version("3.100").compareTo(m.getBundleDescription().getVersion()) < 0 ) {
								l.addAll(Arrays.asList(
										"javax.annotation",
										"javax.inject",
										"org.eclipse.e4.core.commands",
										"org.eclipse.e4.ui.workbench",
										"org.eclipse.emf.common",
										"org.eclipse.e4.core.contexts",
										"org.eclipse.e4.core.services",
										"org.eclipse.e4.core.di",
										"org.eclipse.e4.core.di.extensions",
										"org.eclipse.osgi.services",
										"org.eclipse.e4.ui.di",
										"org.eclipse.e4.ui.model.workbench",
										"org.eclipse.emf.ecore",
										"org.eclipse.emf.ecore.xmi",
										"org.eclipse.e4.ui.services",
										"org.eclipse.emf.ecore.change",
										"org.eclipse.e4.ui.css.core",
										"org.apache.batik.css",
										"org.apache.batik.util",
										"org.w3c.css.sac",
										"org.w3c.dom.svg",
										"org.apache.batik.util.gui",
										"org.w3c.dom.smil",
										"org.eclipse.e4.ui.css.swt",
										"org.eclipse.e4.ui.css.swt.theme",
										"org.eclipse.e4.ui.bindings",
										"org.eclipse.e4.ui.workbench.swt",
										"org.eclipse.e4.ui.widgets",
										"org.eclipse.e4.ui.workbench3",
										"org.eclipse.equinox.ds",
										"org.eclipse.equinox.event",
										"org.eclipse.equinox.util",
										"org.eclipse.e4.ui.workbench.renderers.swt",
										"org.eclipse.e4.ui.workbench.renderers.swt.cocoa"
								));
							}
						}
						
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

	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.ITemplateSection#getUsedExtensionPoint()
	 */
	public String getUsedExtensionPoint() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.BaseOptionTemplateSection#isDependentOnParentWizard()
	 */
	public boolean isDependentOnParentWizard() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.AbstractTemplateSection#getNumberOfWorkUnits()
	 */
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.AbstractTemplateSection#getDependencies(java.lang.String)
	 */
	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[3];
		dep[0] = new PluginReference("org.eclipse.core.runtime", null, 0); //$NON-NLS-1$
		dep[1] = new PluginReference("org.eclipse.ui", null, 0); //$NON-NLS-1$
		dep[2] = new PluginReference("org.eclipse.fx.ui.workbench3", null, 0); //$NON-NLS-1$
		return dep;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.templates.PDETemplateSection#getNewFiles()
	 */
	public String[] getNewFiles() {
		if (copyBrandingDirectory())
			return new String[] {"icons/", "splash.bmp"}; //$NON-NLS-1$ //$NON-NLS-2$
		return super.getNewFiles();
	}
}
