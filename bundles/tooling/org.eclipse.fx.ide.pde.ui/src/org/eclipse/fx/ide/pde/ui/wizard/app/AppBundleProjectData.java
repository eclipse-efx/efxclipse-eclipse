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
package org.eclipse.fx.ide.pde.ui.wizard.app;

import org.eclipse.fx.ide.pde.ui.wizard.model.BundleProjectData;

class AppBundleProjectData extends BundleProjectData {
	private boolean diApp;
	private boolean nativeExport;
	private String productName;

	public boolean isDiApp() {
		return diApp;
	}
	public void setDiApp(boolean diApp) {
		this.diApp = diApp;
	}
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