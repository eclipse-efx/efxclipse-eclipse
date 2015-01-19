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
