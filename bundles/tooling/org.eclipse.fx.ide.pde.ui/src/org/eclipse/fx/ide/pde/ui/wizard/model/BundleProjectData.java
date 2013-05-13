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
package org.eclipse.fx.ide.pde.ui.wizard.model;


public class BundleProjectData {
	private String symbolicname;
	private String bundleDescription;
	private String version;
	private String vendor;
	private String EEnv;
	
	private boolean tychoIntegration;
	private String tychoGroupId;
	private String tychoRelengArtifactId;
	private String tychoRelengArtifactVersion;
	private String tychoRelengArtifactPath;
	
	public String getSymbolicname() {
		return symbolicname;
	}
	public void setSymbolicname(String symbolicname) {
		this.symbolicname = symbolicname;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getEEnv() {
		return EEnv;
	}
	public void setEEnv(String eEnv) {
		EEnv = eEnv;
	}
	public void setBundleDescription(String bundleDescription) {
		this.bundleDescription = bundleDescription;
	}
	public String getBundleDescription() {
		return bundleDescription;
	}
	
	public boolean isTychoIntegration() {
		return tychoIntegration;
	}
	public void setTychoIntegration(boolean tychoIntegration) {
		this.tychoIntegration = tychoIntegration;
	}
	public String getTychoGroupId() {
		return tychoGroupId;
	}
	public void setTychoGroupId(String tychoGroupId) {
		this.tychoGroupId = tychoGroupId;
	}
	public String getTychoRelengArtifactId() {
		return tychoRelengArtifactId;
	}
	public void setTychoRelengArtifactId(String tychoRelengArtifactId) {
		this.tychoRelengArtifactId = tychoRelengArtifactId;
	}
	public String getTychoRelengArtifactVersion() {
		return tychoRelengArtifactVersion;
	}
	public void setTychoRelengArtifactVersion(String tychoRelengArtifactVersion) {
		this.tychoRelengArtifactVersion = tychoRelengArtifactVersion;
	}
	public String getTychoRelengArtifactPath() {
		return tychoRelengArtifactPath;
	}
	public void setTychoRelengArtifactPath(String tychoRelengArtifactPath) {
		this.tychoRelengArtifactPath = tychoRelengArtifactPath;
	}
}
