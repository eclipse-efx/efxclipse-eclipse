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

import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CssExtDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public CssExtDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	
	String text(CSSRuleDefinition model) {
		return model.getName() + " =";
	}
	
	String text(CSSRuleRef ruleRef) {
		return "&lt;" + ruleRef.getRef().getName() + "&gt;";
	}
	
	String image(PackageDefinition pkg) {
		return "package_obj.gif";
	}
	
	String image(List<?> pkg) {
		return "category_obj.gif";
	}
	
	String image(ElementDefinition el) {
		return "element.gif";
	}
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
