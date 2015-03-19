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
package org.eclipse.fx.ide.pde.ui.e4.project.boot;

import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;

class AppBundleProjectData extends BundleProjectData {
	// private boolean jemmyTest;
	private boolean nativeExport;
	private String productName;
	private boolean p2Update;
	private String updateSite;

	public boolean isP2Update() {
		return p2Update;
	}

	public void setP2Update(boolean p2Update) {
		this.p2Update = p2Update;
	}

	public String getUpdateSite() {
		return updateSite;
	}

	public void setUpdateSite(String updateSite) {
		this.updateSite = updateSite;
	}

	// public boolean isJemmyTest() {
	// return jemmyTest;
	// }
	// public void setJemmyTest(boolean jemmyTest) {
	// this.jemmyTest = jemmyTest;
	// }
	public boolean isNativeExport() {
		return nativeExport;
	}

	public void setNativeExport(boolean nativeExport) {
		this.nativeExport = nativeExport;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}