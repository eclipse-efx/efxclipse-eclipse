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
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class CssProject extends CssFolder {

	public CssProject(IResource adaptedObject) {
		super(adaptedObject);
	}
	
	private IProject findProject() {
		IResource res = (IResource) Platform.getAdapterManager().getAdapter(this.getAdaptedObject(), IResource.class);
		IProject project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		while (project == null && res.getParent() != null) {
			res = res.getParent();
			project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		}
		return project;
	}
	
	public void invalidateClasspathExtensions() {
		ClasspathManager.getInstance().invalidateClasspath(findProject());
	}
	
	@Override
	public List<URI> getClasspathExtensions() {
		return ClasspathManager.getInstance().getClasspath(findProject());
	}
	
	@Override
	public String toString() {
		return "CssProject(" + getAdaptedObject() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	@Override
	public ICssResource getParentResource() {
		return null;
	}
}
