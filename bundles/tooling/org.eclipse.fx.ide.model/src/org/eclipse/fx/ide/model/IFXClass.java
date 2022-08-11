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
