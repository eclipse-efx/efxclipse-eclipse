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
package org.eclipse.fx.ide.model;

import org.eclipse.jdt.core.IJavaElement;

public interface IFXProperty {
	public String getName();

	public IJavaElement getJavaElement();

	public boolean isSetable();

	public IFXClass getFXClass();

	public boolean isStatic();
	// public IStatus validateValue(IJavaProject jp, Object value);
}
