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

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.Visibility;
import org.eclipse.fx.ide.model.internal.utils.Util;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.service.log.LogService;

public class FXCtrlEventMethod implements IFXCtrlEventMethod {
	private FXCtrlClass clazz;
	private IMethod method;
	private String erasedFQNType;

	public FXCtrlEventMethod(FXCtrlClass clazz, IMethod method, String erasedFQNType) {
		this.clazz = clazz;
		this.method = method;
		this.erasedFQNType = erasedFQNType;
	}

	@Override
	public IJavaElement getJavaElement() {
		return this.method;
	}

	@Override
	public String getName() {
		return this.method.getElementName();
	}

	@Override
	public boolean hasArgument() {
		return this.erasedFQNType != null;
	}

	public IType getArgumentType() {
		try {
			return this.clazz.getJavaProject().findType(this.erasedFQNType);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Visibility getVisibility() {
		try {
			int flags = this.method.getFlags();

			if (Flags.isPublic(flags)) {
				return Visibility.PUBLIC;
			} else if (Flags.isPackageDefault(flags)) {
				return Visibility.PACKAGE;
			} else if (Flags.isProtected(flags)) {
				return Visibility.PROTECTED;
			} else {
				return Visibility.PRIVATE;
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve visibility for method '" + method + "'", e);
		}

		return Visibility.PRIVATE;
	}

	public static boolean isEventMethod(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.event.Event".equals(checkType)) { //$NON-NLS-1$
				return true;
			}

			IType t = jp.findType(checkType);
			if( t == null ) {
				return false;
			}
			checkType = t.getSuperclassName();

			if (checkType != null) {
				checkType = Util.getFQNType(t, checkType);
			}
		} while (checkType != null);

		return false;
	}
}
