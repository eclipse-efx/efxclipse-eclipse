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
package org.eclipse.fx.ide.fxml.wizards.template;

import org.eclipse.jdt.core.IType;

import org.eclipse.fx.ide.ui.wizards.template.JDTElement;

/**
 * FXML Definition
 */
public class FXMLElement extends JDTElement {
	private IType rootElement;
	private boolean fxRoot;

	/**
	 * @return the root type
	 */
	public IType getRootElement() {
		return this.rootElement;
	}

	/**
	 * set the root type
	 * @param rootElement the root type
	 */
	public void setRootElement(IType rootElement) {
		this.support.firePropertyChange("rootElement", this.rootElement, this.rootElement = rootElement); //$NON-NLS-1$
	}
	
	/**
	 * @param fxRoot is it a root
	 */
	public void setFxRoot(boolean fxRoot) {
		this.fxRoot = fxRoot;
	}
	
	/**
	 * @return is it a root
	 */
	public boolean isFxRoot() {
		return this.fxRoot;
	}
}
