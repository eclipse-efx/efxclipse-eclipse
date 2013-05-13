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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.core.iproduct.IArgumentsInfo;
import org.eclipse.pde.internal.core.iproduct.IProduct;
import org.eclipse.pde.internal.core.iproduct.IProductModelFactory;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.wizards.product.BaseProductCreationOperation;
import org.eclipse.pde.internal.ui.wizards.product.ProductFileWizardPage;
import org.eclipse.pde.internal.ui.wizards.product.ProductFromConfigOperation;
import org.eclipse.pde.internal.ui.wizards.product.ProductFromExtensionOperation;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;


@SuppressWarnings("restriction")
public class NewJavaFXProductFileWizard extends BasicNewResourceWizard {

	private ProductFileWizardPage fMainPage;

	public void addPages() {
		fMainPage = new ProductFileWizardPage("product", getSelection()); //$NON-NLS-1$
		addPage(fMainPage);
	}

	public boolean performFinish() {
		try {
			getContainer().run(false, true, getOperation());
		} catch (InvocationTargetException e) {
			PDEPlugin.logException(e);
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}

	private IRunnableWithProgress getOperation() {
		IFile file = fMainPage.createNewFile();
		int option = fMainPage.getInitializationOption();
		if (option == ProductFileWizardPage.USE_LAUNCH_CONFIG) {
			return new ProductFromConfigOperation(file, fMainPage.getSelectedLaunchConfiguration()) {
				@Override
				protected void initializeProduct(IProduct product) {
					super.initializeProduct(product);
					impl_initializeProduct(product);
					
					IProductModelFactory factory = product.getModel().getFactory();
					addPlugins(factory, product, new String[] {"org.eclipse.fx.osgi"});
				}
			};
		}
		
		if (option == ProductFileWizardPage.USE_PRODUCT) {
			return new ProductFromExtensionOperation(file, fMainPage.getSelectedProduct()) {
				@Override
				protected void initializeProduct(IProduct product) {
					super.initializeProduct(product);
					impl_initializeProduct(product);
					
					IProductModelFactory factory = product.getModel().getFactory();
					addPlugins(factory, product, new String[] {"org.eclipse.fx.osgi"});
				}
			};
		}
		
		return new BaseProductCreationOperation(file) {
			@Override
			protected void initializeProduct(IProduct product) {
				super.initializeProduct(product);
				impl_initializeProduct(product);
				
				IProductModelFactory factory = product.getModel().getFactory();
				addPlugins(factory, product, new String[] {"org.eclipse.fx.osgi"});
			}
		};
	}

	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("New JavaFX Product");
		setNeedsProgressMonitor(true);
	}

	protected void initializeDefaultPageImageDescriptor() {
//		setDefaultPageImageDescriptor(PDEPluginImages.DESC_PRODUCT_WIZ);
	}

	static void impl_initializeProduct(IProduct product) {
		String args = product.getLauncherArguments().getVMArguments(IArgumentsInfo.L_ARGS_ALL);
		if( args == null ) {
			args = "";
		}
		args = "-Dosgi.framework.extensions=org.eclipse.fx.osgi";
		product.getLauncherArguments().setVMArguments(args, IArgumentsInfo.L_ARGS_ALL);
	}
}
