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

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXCtrlField;
import org.eclipse.fx.ide.model.Visibility;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.service.log.LogService;

public class FXCtrlField implements IFXCtrlField {
	private FXCtrlClass clazz;
	private IField field;
	private String erasedTypeSig;

	public FXCtrlField(FXCtrlClass clazz, IField field, String erasedTypeSig) {
		this.clazz = clazz;
		this.field = field;
		this.erasedTypeSig = erasedTypeSig;
	}

	@Override
	public IJavaElement getJavaElement() {
		return this.field;
	}

	@Override
	public String getName() {
		return this.field.getElementName();
	}

	@Override
	public IType getType() {
		try {
			return this.clazz.getJavaProject().findType(this.erasedTypeSig);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Visibility getVisibility() {
		try {
			int flags = this.field.getFlags();

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
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve visibility for field '" + field + "'", e);
		}

		return Visibility.PRIVATE;
	}
}
