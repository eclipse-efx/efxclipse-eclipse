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

public class OSGiLaunchDef extends BasicLaunchDef {
	public static Set<PluginLaunchDef> getTargetDefinitions() {
		Set<PluginLaunchDef> set = new HashSet<PluginLaunchDef>();
		set.add(PluginLaunchDef.parse("org.eclipse.fx.core.databinding@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.fx.ui.databinding@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.fx.javafx@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.fx.osgi@default:false"));
		set.add(PluginLaunchDef.parse("com.ibm.icu@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.contenttype@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.databinding.observable@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.databinding.property@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.databinding@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.jobs@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.runtime.compatibility.registry@default:false"));
		set.add(PluginLaunchDef.parse("org.eclipse.core.runtime@default:true"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.app@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.common@2:true"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.ds@1:true"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.event@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.preferences@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.registry@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.equinox.util@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.osgi.services@default:default"));
		set.add(PluginLaunchDef.parse("org.eclipse.osgi@-1:true"));
		return set;
	}
}
