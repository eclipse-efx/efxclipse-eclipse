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
package org.eclipse.fx.ide.pde.ui.templates;

import java.util.HashSet;
import java.util.Set;

public abstract class BasicLaunchDef {
	private String projectName;
	private String classloaderStrategy;
	private Set<PluginLaunchDef> workbenchPlugins = new HashSet<PluginLaunchDef>();
	private Set<PluginLaunchDef> targetPlugins = new HashSet<PluginLaunchDef>();
	private Set<LaunchFeature> features = new HashSet<>();

	public Set<PluginLaunchDef> getWorkbenchPlugins() {
		return workbenchPlugins;
	}
	
	public Set<PluginLaunchDef> getTargetPlugins() {
		return targetPlugins;
	}
	
	public Set<LaunchFeature> getFeatures() {
		return features;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClassloaderStrategy() {
		return classloaderStrategy;
	}

	public void setClassloaderStrategy(String classloaderStrategy) {
		this.classloaderStrategy = classloaderStrategy;
	}
}