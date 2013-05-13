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
