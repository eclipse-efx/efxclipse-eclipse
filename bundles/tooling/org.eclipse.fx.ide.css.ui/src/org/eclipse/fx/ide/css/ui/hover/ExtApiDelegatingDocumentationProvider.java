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
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.util.Utils;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

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
		String doku = ext.getDocumentation(Utils.getFile(o.eResource()),o,o);
		
		if (doku == null) {
			return "no docu support for this element :/";
		}
		else {
			return doku;
		}
	}

}
