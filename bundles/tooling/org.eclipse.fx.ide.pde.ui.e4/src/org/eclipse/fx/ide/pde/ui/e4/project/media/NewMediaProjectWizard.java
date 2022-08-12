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
package org.eclipse.fx.ide.pde.ui.e4.project.media;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import org.eclipse.fx.ide.pde.ui.wizard.BundleConfigurationPage;
import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;
import org.eclipse.fx.ide.rrobot.RRobot;
import org.eclipse.fx.ide.rrobot.dsl.FileLoader;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;

public class NewMediaProjectWizard extends Wizard implements INewWizard {
	private BundleProjectData data;
	
	public NewMediaProjectWizard() {
		this.data = new BundleProjectData();
		this.data.setVersion("1.0.0.qualifier");
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(new BundleConfigurationPage(data,"bundle.page","New e4 FX application") {
			@Override
			protected boolean withBundleDescription() {
				return false;
			}
			
			@Override
			protected boolean withBundleVersion() {
				return false;
			}
		});
	}
	
	@Override
	public boolean performFinish() {
		Bundle b = FrameworkUtil.getBundle(getClass());
		BundleContext ctx = b.getBundleContext();
		ServiceReference<RRobot> ref = ctx.getServiceReference(RRobot.class);
		final RRobot r = ctx.getService(ref);

		FileLoader loader = FileLoader.createLoader();
		final RobotTask task = loader.loadTask(URI.createPlatformPluginURI("/org.eclipse.fx.ide.pde.ui.e4/generator-tasks/mediaSample.rtask", true));

		final Map<String,Object> additionalData = new HashMap<>();
		additionalData.put("BundleProject_projectName", data.getSymbolicname());
		additionalData.put("BundleProject_bundleId", data.getSymbolicname());
		additionalData.put("BundleProject_bundleVendor", data.getVendor() != null ? data.getVendor() : "");
//		additionalData.put("BundleProject_bundleVersion", data.getVersion());
		additionalData.put("BundleProject_EE", data.getEEnv());
		
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
