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
package org.eclipse.fx.ide.model.internal;

import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.jdt.core.IJavaElement;

public abstract class FXProperty implements IFXProperty {
	private final String name;

	private final FXClass fxClass;

	private final IJavaElement javaElement;

	private boolean setable;

	private boolean isStatic;

	public FXProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		this.fxClass = fxClass;
		this.name = name;
		this.javaElement = javaElement;
		this.isStatic = isStatic;
		this.setable = !(javaElement.getElementName().startsWith("get") || javaElement.getElementName().startsWith("is"));
	}

	@Override
	public boolean isStatic() {
		return this.isStatic;
	}

	@Override
	public FXClass getFXClass() {
		return this.fxClass;
	}

	@Override
	public boolean isSetable() {
		return this.setable;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public IJavaElement getJavaElement() {
		return this.javaElement;
	}
}
