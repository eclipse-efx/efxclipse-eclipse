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

public class JUnitLaunchDef extends BasicLaunchDef {
	private String junitClassName;
	private String testProductId;
	
	public String getJunitClassName() {
		return junitClassName;
	}

	public void setJunitClassName(String junitClassName) {
		this.junitClassName = junitClassName;
	}

	public String getTestProductId() {
		return testProductId;
	}

	public void setTestProductId(String testProductId) {
		this.testProductId = testProductId;
	}
}
