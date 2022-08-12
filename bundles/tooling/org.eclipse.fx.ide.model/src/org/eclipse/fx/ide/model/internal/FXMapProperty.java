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

import org.eclipse.fx.ide.model.IFXMapProperty;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class FXMapProperty extends FXProperty implements IFXMapProperty {

	public FXMapProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
	}

	public static boolean isMap(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.collections.ObservableMap".equals(checkType)) { //$NON-NLS-1$
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
		return "FXMapProperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
