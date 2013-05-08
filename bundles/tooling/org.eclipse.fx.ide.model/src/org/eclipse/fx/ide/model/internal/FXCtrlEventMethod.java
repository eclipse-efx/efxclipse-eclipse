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
		return method;
	}
	
	@Override
	public String getName() {
		return method.getElementName();
	}
	
	@Override
	public boolean hasArgument() {
		return erasedFQNType != null;
	}
	
	public IType getArgumentType() {
		try {
			return clazz.getJavaProject().findType(erasedFQNType);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Visibility getVisibility() {
		try {
			int flags = method.getFlags();
			
			if( Flags.isPublic(flags) ) {
				return Visibility.PUBLIC;
			} else if( Flags.isPackageDefault(flags) ) {
				return Visibility.PACKAGE;
			} else if( Flags.isProtected(flags) ) {
				return Visibility.PROTECTED;
			} else {
				return Visibility.PRIVATE;
			}
		} catch(JavaModelException e ) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve visibility for method '"+method+"'", e);
		}
		
		return Visibility.PRIVATE;
	}
	
	public static boolean isEventMethod(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;
		
		do {
			if ("javafx.event.Event".equals(checkType)) {
				return true;
			}

			IType t = jp.findType(checkType);
			checkType = t.getSuperclassName();

			if (checkType != null) {
				checkType = Util.getFQNType(t, checkType);
			}
		} while(checkType != null);
		
		return false;
	}
}
