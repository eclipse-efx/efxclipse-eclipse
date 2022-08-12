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
import org.eclipse.jdt.core.IType;

public interface IFXCtrlEventMethod {
	public String getName();

	public boolean hasArgument();

	public Visibility getVisibility();

	public IType getArgumentType();

	public IJavaElement getJavaElement();
}
