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

import org.eclipse.fx.ide.model.IFXPrimitiveProperty;
import org.eclipse.jdt.core.IMethod;

public class FXPrimitiveProperty extends FXProperty implements IFXPrimitiveProperty {
	private final Type type;

	public FXPrimitiveProperty(FXClass fxClass, String name, IMethod javaElement, Type type, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.type = type;
	}

	@Override
	public Type getType() {
		return this.type;
	}

	public static boolean isPrimitive(String genericTypeValue) {
		return Type.parseType(genericTypeValue) != null;
	}

	@Override
	public String toString() {
		return "FXPrimitiveProperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
