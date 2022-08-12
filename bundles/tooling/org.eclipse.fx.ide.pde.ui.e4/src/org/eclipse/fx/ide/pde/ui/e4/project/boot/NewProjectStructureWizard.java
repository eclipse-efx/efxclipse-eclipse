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
package org.eclipse.fx.ide.pde.ui.e4.project.boot;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.eclipse.fx.ide.pde.ui.wizard.BundleConfigurationPage;
import org.eclipse.fx.ide.rrobot.RRobot;
import org.eclipse.fx.ide.rrobot.dsl.FileLoader;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;

public class NewProjectStructureWizard extends Wizard implements INewWizard {
	private AppBundleProjectData data;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.data = new AppBundleProjectData();
//		this.data.setJemmyTest(isJemmyAvailable());
		this.data.setTychoIntegration(true);
		this.data.setNativeExport(true);
		this.data.setVersion("1.0.0.qualifier");
		this.data.setP2Update(false);
		this.data.setUpdateSite("http://p2.my.comp/updatesite");
		this.data.setClassloadingStrategy("ext");
	}
	
//	private boolean isJemmyAvailable() {
//		return PDECore.getDefault().getModelManager().findModel("at.bestsolution.efxclipse.jemmy") != null;
//	}
	
	@Override
	public void addPages() {
		super.addPages();
		addPage(new BundleConfigurationPage(data,"bundle.page","New e4 FX application") {
			@Override
			protected String getBundleIdLabel() {
				return "Bundle-ID-Prefix";
			}
		});
		addPage(new GeneratorConfigurationPage(data, "generator.page","New e4 FX application"));
	}

	@Override
	public boolean performFinish() {
		Bundle b = FrameworkUtil.getBundle(getClass());
		BundleContext ctx = b.getBundleContext();
		ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
		final RRobot r = ctx.getService(ref);

		FileLoader loader = FileLoader.createLoader();
		final RobotTask task = loader.loadTask(URI.createPlatformPluginURI("/org.eclipse.fx.ide.pde.ui.e4/generator-tasks/e4App.rtask", true));

		final Map<String,Object> additionalData = new HashMap<>();
		additionalData.put("Maven_GroupId", data.getSymbolicname());
		additionalData.put("BundleProject_bundleVendor", data.getVendor());
		additionalData.put("BundleProject_productName", data.getProductName());
		additionalData.put("BundleProject_bundleVersion", data.getVersion());
		additionalData.put("BundleProject_EE", data.getEEnv());
		additionalData.put("TychoIntegration", data.isTychoIntegration());
		additionalData.put("NativeExport", data.isNativeExport());
		additionalData.put("p2Update", data.isP2Update());
		additionalData.put("p2Location", data.getUpdateSite().replace(":", "$${#58}"));
		additionalData.put("classloaderStrategy", data.getClassloadingStrategy());
//		additionalData.put("JemmyTest", data.isJemmyTest());
		
		WorkspaceModifyOperation w = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
				r.executeTask(monitor, task, additionalData);
			}
		};
		
		try {
			getContainer().run(true, true,w);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
