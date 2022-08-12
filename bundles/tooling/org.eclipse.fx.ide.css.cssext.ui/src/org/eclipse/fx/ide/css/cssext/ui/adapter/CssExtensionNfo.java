/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;

public class CssExtensionNfo {
	public final URI uri;
	
	public CssExtension model;
	
	/*package*/ CssExtensionNfo(URI uri) {
		this.uri = uri;
	}
	
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
	
	public String getRootPackageName() {
		CssExtension model = getModel();
		if (model != null) {
			return getModel().getPackageDef().getName();
		}
		return "error";
	}

}