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

import org.eclipse.fx.ide.model.IFXObjectProperty;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class FXObjectPoperty extends FXProperty implements IFXObjectProperty {
	private String erasedFQNType;
	private IType type;
	private Boolean valueOf;
	private IMethod valueOfMethod;
	private boolean valueOfMethodResolved;

	public FXObjectPoperty(FXClass fxClass, String name, IJavaElement javaElement, String erasedFQNType, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.erasedFQNType = erasedFQNType;
	}

	@Override
	public String toString() {
		return "FXObjectPoperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public String getElementTypeAsString(boolean fqn) {
		return fqn ? this.erasedFQNType : Signature.getSimpleName(this.erasedFQNType);
	}

	@Override
	public boolean hasValueOf() {
		if (this.valueOf == null) {
			this.valueOf = Boolean.valueOf(getValueOfMethod() != null);
		}
		return this.valueOf.booleanValue();
	}

	public IMethod getValueOfMethod() {
		if (!this.valueOfMethodResolved) {
			try {
				for (IMethod m : getElementType().getMethods()) {
					if (Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && "valueOf".equals(m.getElementName())) { //$NON-NLS-1$
						this.valueOfMethod = m;
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			this.valueOfMethodResolved = true;
		}

		return this.valueOfMethod;
	}

	@Override
	public IType getElementType() {
		if (this.type == null) {
			try {
				this.type = getFXClass().getJavaProject().findType(this.erasedFQNType);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return this.type;
	}
}
