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
package org.eclipse.fx.ide.css.ui.labeling;

import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.ruleset;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CssDslDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

	String image(ruleset ele) {
		return "icons/selector_16x16.png";
	}
	
	String image(css_property ele) {
		return "icons/property_16x16.png";
	}
	
/*
	//Labels and icons can be computed like this:
	
	String text(IEObjectDescription ele) {
	  return "my "+ele.getName();
	}
	 
    String image(IEObjectDescription ele) {
      return ele.getEClass().getName() + ".gif";
    }	 
*/

}
