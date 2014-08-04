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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ExtensionRegistry {

	/**
	 * a simple holder class for a css extension. it allows to defer the model loading, and to invalidate the model 
	 * @author ccaks
	 *
	 */
	public static class ExtensionHolder {
		public final URI uri;
		
		private CssExtension model;
		
		protected ExtensionHolder(URI uri) {
			this.uri = uri;
		}
		
		/**
		 * gets the extension model
		 * @return
		 */
		public CssExtension getModel() {
			if (model == null) {
				model = loadModel();
			}
			return model;
		}
		
		private CssExtension loadModel() {
			try {
				final ResourceSet rs = new ResourceSetImpl();
				Resource resource = rs.createResource(uri);
				resource.setURI(uri);
				resource.load(Collections.emptyMap());
				
				return (CssExtension) resource.getContents().get(0);
			}
			catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		// TODO do we need this=?
		public String getRootPackageName() {
			CssExtension model = getModel();
			if (model != null) {
				return getModel().getPackageDef().getName();
			}
			return "error";
		}
		
		/**
		 * invalidates the extionsion
		 */
		public void invalidate() {
			this.model = null;
		}
	}
	
	/**
	 * access to the singleton registry instance
	 */
	public final static ExtensionRegistry REGISTRY = new ExtensionRegistry();
	
	private Map<URI, ExtensionHolder> extensions = new HashMap<>();
	
	private Logger logger;
	
	private void recCheckChangedExtensions(IJavaElementDelta d, List<URI> changedExtensions) {
		if (IJavaElementDelta.F_CONTENT == (IJavaElementDelta.F_CONTENT & d.getFlags())) {
			// content change
			for (IResourceDelta rd : d.getResourceDeltas()) {
				final IResource res = rd.getResource();
				if ("cssext".equals(res.getFileExtension())) { //$NON-NLS-1$
					changedExtensions.add(URI.createPlatformResourceURI( res.getProject().getName() + "/" + res.getProjectRelativePath().toString(), true)); //$NON-NLS-1$
				}
			}
		}
		if (IJavaElementDelta.F_CHILDREN == (IJavaElementDelta.F_CHILDREN & d.getFlags())) {
			// check children
			for (IJavaElementDelta child : d.getChangedChildren()) {
				recCheckChangedExtensions(child, changedExtensions);
			}
		}
		
	}
	
	private IElementChangedListener listener = new IElementChangedListener() {
		@Override
		public void elementChanged(ElementChangedEvent event) {
			List<URI> changedExtensions = new ArrayList<URI>();
			recCheckChangedExtensions(event.getDelta(), changedExtensions);
			System.err.println(changedExtensions);
			for (URI changedEx : changedExtensions) {
				invalidateExtension(changedEx);
			}
		}
	};
	
	private ExtensionRegistry() {
		JavaCore.addElementChangedListener(listener, ElementChangedEvent.POST_CHANGE);
	}
	
	private Logger getLogger() {
		if (logger == null) {
			logger = LoggerCreator.createLogger(ExtensionRegistry.class);
		}
		return logger;
	}
	
	/**
	 * gets or creates an extension by uri
	 * @param uri
	 * @return
	 */
	public ExtensionHolder getExtension(URI uri) {
		getLogger().debug("getExtension("+uri+")");
		ExtensionHolder holder = extensions.get(uri);
		if (holder == null) {
			getLogger().debug(" => creating new holder");
			holder = new ExtensionHolder(uri);
			extensions.put(uri, holder);
		}
		else {
			getLogger().debug(" => result from cache");
		}
		return holder;
	}
	
	/**
	 * invalidates an extension to be reloaded on next request
	 * @param uri
	 */
	public void invalidateExtension(URI uri) {
		getLogger().debug("invalidateExtension("+uri+")");
		ExtensionHolder holder = extensions.get(uri);
		if (holder != null) {
			getLogger().debug(" invalididating " + uri);
			holder.invalidate();
		}
		else {
			getLogger().debug(" not found!");
		}
	}
	
	
}
