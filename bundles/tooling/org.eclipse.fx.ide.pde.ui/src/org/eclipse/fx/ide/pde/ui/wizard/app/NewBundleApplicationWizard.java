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
package org.eclipse.fx.ide.pde.ui.wizard.app;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.pde.ui.wizard.BundleConfigurationPage;
import org.eclipse.fx.ide.rrobot.dsl.FileLoader;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import org.eclipse.fx.ide.rrobot.RRobot;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;

public class NewBundleApplicationWizard extends Wizard implements INewWizard {
	private AppBundleProjectData data;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.data = new AppBundleProjectData();
		this.data.setJemmyTest(true);
		this.data.setTychoIntegration(true);
		this.data.setNativeExport(true);
		this.data.setVersion("1.0.0.qualifier");
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(new BundleConfigurationPage(data,"bundle.page","New FX-OSGi application") {
			@Override
			protected String getBundleIdLabel() {
				return "Bundle-ID-Prefix";
			}
		});
		addPage(new GeneratorConfigurationPage(data, "generator.page","New FX-OSGi application"));
	}
	
	@Override
	public boolean performFinish() {
		Bundle b = FrameworkUtil.getBundle(getClass());
		BundleContext ctx = b.getBundleContext();
		ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
		final RRobot r = ctx.getService(ref);

		FileLoader loader = FileLoader.createLoader();
		final RobotTask task = loader.loadTask(URI.createPlatformPluginURI("/org.eclipse.fx.ide.pde.ui/generator-tasks/osgi-app.rtask", true));

		final Map<String,Object> additionalData = new HashMap<>();
		additionalData.put("Maven_GroupId", data.getSymbolicname());
		additionalData.put("BundleProject_bundleVendor", data.getVendor());
		additionalData.put("BundleProject_productName", data.getProductName());
		additionalData.put("BundleProject_bundleVersion", data.getVersion());
		additionalData.put("BundleProject_EE", data.getEEnv());
		additionalData.put("TychoIntegration", data.isTychoIntegration());
		additionalData.put("NativeExport", data.isNativeExport());
		additionalData.put("EclipseDI", data.isDiApp());
		
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
