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

import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public class FXEventHandlerProperty extends FXProperty implements IFXEventHandlerProperty {
	private IType eventType;

	public FXEventHandlerProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
	}

	public static boolean isEventHandler(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.event.EventHandler".equals(checkType)) { //$NON-NLS-1$
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
	public IType getEventType() {
		if (this.eventType == null) {
			try {
				IMethod m = (IMethod) getJavaElement();
				String signature;

				if (isSetable()) {
					signature = m.getParameterTypes()[0];
				} else {
					signature = m.getReturnType();
				}

				IType t = (IType) m.getParent();
				String fqnType = Util.toFQN(t, signature);
				this.eventType = getFXClass().getJavaProject().findType(fqnType);
			} catch (JavaModelException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
			}
		}

		return this.eventType;
	}

	@Override
	public String getEventTypeAsString(boolean fqn) {
		IType t = getEventType();
		if (t == null) {
			return "?"; //$NON-NLS-1$
		}
		return fqn ? t.getFullyQualifiedName() : t.getElementName();
	}

	@Override
	public String toString() {
		return "FXEventHandlerProperty(" + getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}