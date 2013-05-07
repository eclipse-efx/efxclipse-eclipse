/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.labeling;

import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CssExtDslDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

	
	String text(CSSRuleDefinition model) {
		return model.getName() + " (description)";
	}
	
	String image(PackageDefinition ele) {
		return "package_obj.gif";
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
