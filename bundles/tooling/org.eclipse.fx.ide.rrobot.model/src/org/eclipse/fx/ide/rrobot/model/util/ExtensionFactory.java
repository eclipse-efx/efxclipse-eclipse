/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.rrobot.model.util;

import org.eclipse.fx.ide.rrobot.model.bundle.Attribute;
import org.eclipse.fx.ide.rrobot.model.bundle.BundleFactory;
import org.eclipse.fx.ide.rrobot.model.bundle.Element;
import org.eclipse.fx.ide.rrobot.model.bundle.Extension;

public class ExtensionFactory {
	public static void createAttribute(Element el, String name, String value) {
		Attribute att = BundleFactory.eINSTANCE.createAttribute();
		att.setName(name);
		att.setValue(value);
		el.getAttributes().add(att);
	}
	
	public static class FXTheme {
		public static Element create_Theme_Element(Extension extension, String themeId, String baseStylesheet) {
			Element el = BundleFactory.eINSTANCE.createElement();
			el.setName("theme");
			ExtensionFactory.createAttribute(el, "id",themeId);
			ExtensionFactory.createAttribute(el, "basestylesheet", baseStylesheet);
			extension.getElements().add(el);
			return el;
		}
	}
	
	public static class Product {
		public static Element create_Product_Element(Extension extension, String name, String application) {
			Element el = BundleFactory.eINSTANCE.createElement();
			el.setName("product");
			ExtensionFactory.createAttribute(el, "name",name);
			ExtensionFactory.createAttribute(el, "application", application);
			extension.getElements().add(el);
			return el;
		}
		
		public static Element create_Property_Element(Element parent, String name, String value) {
			Element el = BundleFactory.eINSTANCE.createElement();
			el.setName("property");
			createAttribute(el, "name", name);
			createAttribute(el, "value", value);
			
			parent.getChildren().add(el);	
			
			return el;
		}
	}
}
