/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import org.eclipse.fx.ide.css.extapi.CssExt;

import com.google.inject.Inject;

/**
 * @author ccaks
 * 
 */
public class ExtApiDelegatingDocumentationProvider implements
		IEObjectDocumentationProvider {

	private @Inject CssExt ext;
	
	@Override
	public String getDocumentation(EObject o) {
		String doku = ext.getDocumentation(o);
		
		if (doku == null) {
			return "no docu support for this element :/";
		}
		else {
			return doku;
		}
	}

}
