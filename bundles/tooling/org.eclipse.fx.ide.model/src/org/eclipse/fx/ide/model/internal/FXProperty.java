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
		this.setable = !( javaElement.getElementName().startsWith("get") || javaElement.getElementName().startsWith("is") );
	}
	
	@Override
	public boolean isStatic() {
		return isStatic;
	}
	
	@Override
	public FXClass getFXClass() { 
		return fxClass;
	}
	
	@Override
	public boolean isSetable() {
		return setable;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IJavaElement getJavaElement() {
		return javaElement;
	}
}
