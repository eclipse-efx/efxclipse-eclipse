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
package org.eclipse.fx.ide.rrobot.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject;
import org.eclipse.pde.internal.core.natures.PDE;


@SuppressWarnings("restriction")
public class FeatureProjectHandler extends DefaultProjectHandler<FeatureProject> {
	@Override
	public boolean isHandled(EClass eClass) {
		return eClass == BundlePackage.Literals.FEATURE_PROJECT;
	}
	
	@Override
	protected IStatus customizeProject(IProgressMonitor monitor, IProject project, FeatureProject model) {
		try {
			addNatureToProject(project, PDE.FEATURE_NATURE, monitor);
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, PLUGIN_ID, "Unable to add nature");
		}
		return super.customizeProject(monitor, project, model);
	}
	
	@Override
	protected IStatus createResources(IProgressMonitor monitor, IProject p, FeatureProject model, Map<String, Object> additionalData) {
		IStatus s = super.createResources(monitor, p, model, additionalData);
		if( s.isOK() ) {
			List<IStatus> rv = new ArrayList<IStatus>();
			rv.add(s);
			rv.add(createFile(monitor, p.getFile("feature.xml"), model.getFeature(), additionalData));
			return new MultiStatus(PLUGIN_ID, 0, rv.toArray(new IStatus[0]), "File creation states",null);
		} else {
			return s;	
		}
	}
}
