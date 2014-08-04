/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
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
	Set<CssExtension> getEnabledCssExtensions();
	
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
