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
package org.eclipse.fx.ide.fxgraph.ui.wizards.template;

import org.eclipse.jdt.core.IType;

import org.eclipse.fx.ide.ui.wizards.template.JDTElement;

public class FXGraphElement extends JDTElement {
	private IType rootElement;
	private boolean dynamic;

	public IType getRootElement() {
		return rootElement;
	}

	public void setRootElement(IType rootElement) {
		support.firePropertyChange("rootElement", this.rootElement, this.rootElement = rootElement);
	}
	
	public boolean isDynamic() {
		return dynamic;
	}
	
	public void setDynamic(boolean dynamic) {
		this.dynamic = dynamic;
	}
}
