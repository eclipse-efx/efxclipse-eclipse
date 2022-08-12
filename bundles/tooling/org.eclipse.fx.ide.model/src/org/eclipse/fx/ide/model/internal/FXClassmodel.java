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

	@Override
	public IFXClass findClass(IJavaProject javaProject, IType type) {
		synchronized (this.fxClassCache) {
			IFXClass rv = this.fxClassCache.get(type);
			if (rv == null) {
				FXClass c = new FXClass(javaProject, type);
				this.fxClassCache.put(type, c);
				rv = c;
			}
			return rv;
		}
	}

	@Override
	public IFXCtrlClass findCtrlClass(IJavaProject javaProject, IType type) {
		synchronized (this.fxCtrlClassCache) {
			IFXCtrlClass rv = this.fxCtrlClassCache.get(type);

			if (rv == null) {
				FXCtrlClass c = new FXCtrlClass(javaProject, type);
				this.fxCtrlClassCache.put(type, c);
				rv = c;
			}
			return rv;
		}
	}

	@Override
	public void clearCache(IType type) {
		synchronized (this.fxClassCache) {
			this.fxClassCache.remove(type);
		}

		synchronized (this.fxCtrlClassCache) {
			this.fxCtrlClassCache.remove(type);
		}
	}
}
