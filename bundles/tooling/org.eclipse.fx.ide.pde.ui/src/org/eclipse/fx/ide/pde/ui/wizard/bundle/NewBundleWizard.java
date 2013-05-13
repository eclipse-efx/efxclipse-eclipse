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
package org.eclipse.fx.ide.pde.ui.wizard.bundle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.pde.ui.wizard.BundleConfigurationPage;
import org.eclipse.fx.ide.pde.ui.wizard.TychoConfigurationPage;
import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;
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

public class NewBundleWizard extends Wizard implements INewWizard {
	private BundleProjectData data;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		data = new BundleProjectData();
		data.setTychoIntegration(true);
		data.setVersion("1.0.0.qualifier");
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(new BundleConfigurationPage(data,"bundle.page","New FX-OSGi Bundle"));
		addPage(new TychoConfigurationPage(data,"bundle.page","New FX-OSGi Bundle",null));
	}
	
	@Override
	public boolean performFinish() {
		Bundle b = FrameworkUtil.getBundle(getClass());
		BundleContext ctx = b.getBundleContext();
		ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
		final RRobot r = ctx.getService(ref);

		FileLoader loader = FileLoader.createLoader();
		final RobotTask task = loader.loadTask(URI.createPlatformPluginURI("/org.eclipse.fx.ide.pde.ui/generator-tasks/osgi-bundle.rtask", true));

		final Map<String,Object> additionalData = new HashMap<>();
		additionalData.put("Maven_GroupId", data.getTychoGroupId());
		additionalData.put("Maven_RelengArtifactId", data.getTychoRelengArtifactId());
		additionalData.put("Maven_RelengArtifactVersion", data.getTychoRelengArtifactVersion());
		additionalData.put("Maven_RelengArtifactPath", data.getTychoRelengArtifactPath());
		additionalData.put("BundleProject_bundleId",data.getSymbolicname());
		additionalData.put("BundleProject_projectName",data.getSymbolicname());
		additionalData.put("BundleProject_bundleName",data.getBundleDescription());
		additionalData.put("BundleProject_bundleVendor", data.getVendor());
		additionalData.put("BundleProject_bundleVersion", data.getVersion());
		additionalData.put("BundleProject_EE", data.getEEnv());
		additionalData.put("TychoIntegration", data.isTychoIntegration());
		
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