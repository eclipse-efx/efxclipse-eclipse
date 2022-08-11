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

import org.eclipse.fx.ide.model.IFXEnumProperty;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class FXEnumProperty extends FXProperty implements IFXEnumProperty {
	private String enumTypeAsString;
	private IType enumType;

	public FXEnumProperty(FXClass fxClass, String name, IJavaElement javaElement, String erasedFQNType, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.enumTypeAsString = erasedFQNType;
	}

	public static boolean isEnum(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		return jp.findType(erasedFQNType).isEnum();
	}

	@Override
	public String toString() {
		return "FXEnumProperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public String getEnumTypeAsString(boolean fqn) {
		return fqn ? this.enumTypeAsString : Signature.getSimpleName(this.enumTypeAsString);
	}

	@Override
	public IType getEnumType() {
		if (this.enumType == null) {
			try {
				this.enumType = getFXClass().getJavaProject().findType(this.enumTypeAsString);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return this.enumType;
	}
}
