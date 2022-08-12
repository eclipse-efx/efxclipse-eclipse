/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;

public interface ICssResource {
	
	public static enum Source {
		CLASSPATH,
		USER
	}
	
	ICssResource getParentResource();
	
	List<URI> getClasspathExtensions();
	List<URI> getDisabledExtensions();
	List<URI> getCustomExtensions();
	
	List<URI> getInheritedClasspathExtensions();
	List<URI> getInheritedDisabledExtensions();
	List<URI> getInheritedCustomExtensions();
	
	List<URI> getAllEnabledExtensions();
	
	/**
	 * returns all enabled extensions.
	 * @return
	 */
	Set<CssExtension> getEnabledCssExtensions(EObject context);
	
	void addCustomExtension(URI uri);
	void removeCustomExtension(URI uri);
	
	void addDisabledExtension(URI uri);
	void removeDisabledExtension(URI uri);
	
	boolean isUseCustom();
	void setUseCustom(boolean useCustom);
	
	void save() throws CoreException;
	void load() throws CoreException;

	CssExtension getExtension(URI uri);

	void clearCustomExtensions();
	void clearDisabledExtensions();
}
