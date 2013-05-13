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
