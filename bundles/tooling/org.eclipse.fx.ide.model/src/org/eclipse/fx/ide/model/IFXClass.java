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

import java.util.Map;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public interface IFXClass {
	public IFXProperty getDefaultProperty();

	public String getFQN();

	public String getSimpleName();

	public IType getType();

	public IMethod getValueOf();

	public Map<String, IFXProperty> getAllProperties();

	public Map<String, IFXProperty> getLocalProperties();

	public IFXProperty getProperty(String name);

	public Map<String, IFXProperty> getAllStaticProperties();

	public Map<String, IFXProperty> getLocalStaticProperties();

	public IFXProperty getStaticProperty(String name);
}
