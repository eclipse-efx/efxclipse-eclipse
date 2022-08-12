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

import org.eclipse.fx.ide.model.IFXCollectionProperty;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class FXCollectionProperty extends FXProperty implements IFXCollectionProperty {
	private String collectionTypeAsString;
	private String genericType;
	private IType elementType;

	public FXCollectionProperty(FXClass fxClass, String name, IMethod javaElement, String erasedFQNType, String genericType, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.collectionTypeAsString = erasedFQNType;
		this.genericType = genericType;
	}

	public static boolean isList(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.collections.ObservableList".equals(checkType) || "javafx.collections.ObservableSet".equals(checkType) || "java.util.Collection".equals(checkType)) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				return true;
			}

			IType t = jp.findType(checkType);
			checkType = t.getSuperclassName();

			if (checkType != null) {
				checkType = Util.getFQNType(t, checkType);
			}

		} while (checkType != null);
		return false;
	}

	@Override
	public String toString() {
		return "FXCollectionProperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public String getCollectionTypeAsString(boolean fqn) {
		return fqn ? this.collectionTypeAsString : Signature.getSimpleName(this.collectionTypeAsString);
	}

	@Override
	public String getCollectionAsString() {
		return Signature.getSimpleName(this.genericType);
	}

	@Override
	public IType getElementType() {
		if (this.elementType == null) {
			try {
				IMethod m = (IMethod) getJavaElement();
				String signature;

				if (isSetable()) {
					signature = m.getParameterTypes()[0];
				} else {
					signature = m.getReturnType();
				}

				// TODO if the value is a generic parameter we need to resolve
				// it
				// using the class' generic parameter
				String genericType = Signature.toString(signature);

				String eType;
				if (genericType.contains("extends")) { //$NON-NLS-1$
					eType = genericType.substring(genericType.indexOf("extends") + "extends".length(), genericType.indexOf('>')); //$NON-NLS-1$ //$NON-NLS-2$
				} else if (genericType.contains("super")) { //$NON-NLS-1$
					eType = genericType.substring(genericType.indexOf("super") + "super".length(), genericType.indexOf('>')); //$NON-NLS-1$ //$NON-NLS-2$
				} else {
					eType = genericType.substring(genericType.indexOf('<') + 1, genericType.lastIndexOf('>'));
					eType = Signature.getTypeErasure(eType);
				}

				eType = eType.trim();

				IType t = (IType) m.getParent();
				String fqnType = Util.getFQNType(t, eType);
				if (fqnType == null) {
					return null;
				}
				elementType = getFXClass().getJavaProject().findType(fqnType);
			} catch (JavaModelException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
			}
		}

		return elementType;
	}
}
