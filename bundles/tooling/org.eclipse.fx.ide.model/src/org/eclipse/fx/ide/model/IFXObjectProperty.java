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

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public interface IFXObjectProperty extends IFXProperty {
	public String getElementTypeAsString(boolean fqn);
	public boolean hasValueOf();
	public IType getElementType();
	public IMethod getValueOfMethod();
}
