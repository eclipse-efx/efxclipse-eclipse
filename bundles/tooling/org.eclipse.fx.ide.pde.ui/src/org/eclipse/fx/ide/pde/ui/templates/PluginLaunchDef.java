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

public class PluginLaunchDef {
	private String name;
	private String startLevel;
	private String autoStart;
	
	public PluginLaunchDef(String name) {
		this(name,"default","default");
	}

	public PluginLaunchDef(String name, String startLevel, String autoStart) {
		this.name = name;
		this.startLevel = startLevel;
		this.autoStart = autoStart;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartLevel() {
		return startLevel;
	}
	public void setStartLevel(String startLevel) {
		this.startLevel = startLevel;
	}
	public String getAutoStart() {
		return autoStart;
	}
	public void setAutoStart(String autoStart) {
		this.autoStart = autoStart;
	}
	
	public static PluginLaunchDef parse(String definition) {
		return new PluginLaunchDef(definition.substring(0,definition.indexOf('@')), definition.substring(definition.indexOf('@')+1, definition.lastIndexOf(':')), definition.substring(definition.lastIndexOf(':')+1));
	}
}
