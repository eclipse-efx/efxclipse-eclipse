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
package org.eclipse.fx.ide.pde.ui.e4.project.template;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.fx.ide.pde.ui.templates.BasicLaunchDef;
import org.eclipse.fx.ide.pde.ui.templates.PluginLaunchDef;

public class E4LaunchDef extends BasicLaunchDef {
	
	public static Set<PluginLaunchDef> getE4TargetPlugins() {
		Set<PluginLaunchDef> set = new HashSet<PluginLaunchDef>();
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.application"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.keybindings.e4"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.keybindings.generic"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.keybindings"));
		set.add(new PluginLaunchDef("org.eclipse.fx.core.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.di"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.dialogs"));
		set.add(new PluginLaunchDef("org.eclipse.fx.javafx"));
		set.add(new PluginLaunchDef("org.eclipse.fx.osgi.util"));
		set.add(new PluginLaunchDef("org.eclipse.fx.osgi","default","false"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.panes"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.services"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.theme"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.workbench.base"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.workbench.fx"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.workbench.renderers.base"));
		set.add(new PluginLaunchDef("org.eclipse.fx.ui.workbench.renderers.fx"));
		set.add(new PluginLaunchDef("com.ibm.icu"));
		set.add(new PluginLaunchDef("javax.annotation"));
		set.add(new PluginLaunchDef("javax.inject"));
		set.add(new PluginLaunchDef("javax.xml"));
		set.add(new PluginLaunchDef("org.apache.commons.logging"));
		set.add(new PluginLaunchDef("org.eclipse.core.commands"));
		set.add(new PluginLaunchDef("org.eclipse.core.contenttype"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding.observable"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding.property"));
		set.add(new PluginLaunchDef("org.eclipse.core.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.core.expressions"));
//		set.add(new PluginLaunchDef("org.eclipse.core.filesystem.macosx","default","false"));
		set.add(new PluginLaunchDef("org.eclipse.core.filesystem"));
		set.add(new PluginLaunchDef("org.eclipse.core.jobs"));
		set.add(new PluginLaunchDef("org.eclipse.core.resources"));
		set.add(new PluginLaunchDef("org.eclipse.core.runtime.compatibility.registry","default","false"));
		set.add(new PluginLaunchDef("org.eclipse.core.runtime","default","true"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.commands"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.contexts"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.di.extensions"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.di"));
		set.add(new PluginLaunchDef("org.eclipse.e4.core.services"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.di"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.model.workbench"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.services"));
		set.add(new PluginLaunchDef("org.eclipse.e4.ui.workbench"));
		set.add(new PluginLaunchDef("org.eclipse.emf.common"));
		set.add(new PluginLaunchDef("org.eclipse.emf.databinding"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore.change"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore.xmi"));
		set.add(new PluginLaunchDef("org.eclipse.emf.ecore"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.app"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.common","2","true"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.concurrent"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.ds","1","true"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.event"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.preferences"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.registry"));
		set.add(new PluginLaunchDef("org.eclipse.equinox.util"));
		set.add(new PluginLaunchDef("org.eclipse.osgi.services"));
		set.add(new PluginLaunchDef("org.eclipse.osgi","-1","true"));
		
		return set;
	}
}
