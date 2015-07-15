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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXClassmodel;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;

public class FXClassmodel implements IFXClassmodel {
	private Map<IType, FXClass> fxClassCache = new HashMap<>();
	private Map<IType, FXCtrlClass> fxCtrlClassCache = new HashMap<>();

	public IFXClass findClass(IJavaProject javaProject, IType type) {
		IFXClass rv = this.fxClassCache.get(type);
		if (rv == null) {
			FXClass c = new FXClass(javaProject, type);
			this.fxClassCache.put(type, c);
			rv = c;
		}

		System.err.println(fxClassCache);

		return rv;
	}

	@Override
	public IFXCtrlClass findCtrlClass(IJavaProject javaProject, IType type) {
		IFXCtrlClass rv = this.fxCtrlClassCache.get(type);

		if (rv == null) {
			FXCtrlClass c = new FXCtrlClass(javaProject, type);
			this.fxCtrlClassCache.put(type, c);
			rv = c;
		}
		return rv;
	}

	@Override
	public void clearCache(IType type) {
		this.fxClassCache.remove(type);
		this.fxCtrlClassCache.remove(type);
	}
}
