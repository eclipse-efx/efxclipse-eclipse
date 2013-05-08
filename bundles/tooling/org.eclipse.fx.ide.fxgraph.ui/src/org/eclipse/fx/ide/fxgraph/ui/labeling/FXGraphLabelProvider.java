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
package org.eclipse.fx.ide.fxgraph.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.Import;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Script;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.ui.util.IconKeys;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class FXGraphLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public FXGraphLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(IncludeValueProperty element) {
		return element.getSource().getName();
	}
	
	Image image(IncludeValueProperty element) {
		return IconKeys.getIcon(IconKeys.INCLUDE_KEY);
	}
	
	Image image(StaticCallValueProperty element) {
		return IconKeys.getIcon(IconKeys.STAT_METHOD_PUBLIC_KEY);
	}
	
	String text(PackageDeclaration element) {
		return element.getName();
	}
	
	Image image(PackageDeclaration element) {
		return IconKeys.getIcon(IconKeys.PACKAGE_KEY);
	}

	String text(Import element) {
		return element.getImportedNamespace();
	}
	
	Image image(Import element) {
		return IconKeys.getIcon(IconKeys.IMPORT_KEY);
	}

	String text(ComponentDefinition def) {
		return def.getName() + def.getController() == null ? "" : " (" + def.getController().getSimpleName() + ")";
	}
	
	Image image(ComponentDefinition def) {
		return IconKeys.getIcon(IconKeys.COMPONENT_KEY);
	}
	
	String text(Element element) {
		return element.getType() != null ? element.getType().getSimpleName() : "<unknown>";
	}
	
	Image image(Element element) {
		return IconKeys.getIcon(IconKeys.CLASS_KEY);
	}
	
	Image image(Define element) {
		return IconKeys.getIcon(IconKeys.DEFINES_KEY);
	}
	
	Image image(Script script) {
		return IconKeys.getIcon(IconKeys.SCRIPTS_KEY);
	}
	
	Image image(Property element) {
		if( element.getValue() instanceof Element ) {
			return IconKeys.getIcon(IconKeys.FIELD_KEY);
		} else if( element.getValue() instanceof IncludeValueProperty ) {
			return IconKeys.getIcon(IconKeys.INCLUDE_KEY);
		} else if( element.getValue() instanceof ReferenceValueProperty ) {
			return IconKeys.getIcon(IconKeys.REFERENCE_KEY);
		} else if( element.getValue() instanceof ListValueProperty ) {
			return IconKeys.getIcon(IconKeys.LIST_KEY);
		} else if( element.getValue() instanceof MapValueProperty ) {
			return IconKeys.getIcon(IconKeys.MAP_KEY);
		} else if( element.getValue() instanceof BindValueProperty ) {
			return IconKeys.getIcon(IconKeys.BINDING_KEY);
		} else if( element.getValue() instanceof ControllerHandledValueProperty ) {
			return IconKeys.getIcon(IconKeys.EVENT_KEY);
		} else if( element.getValue() instanceof CopyValueProperty ) {
			return IconKeys.getIcon(IconKeys.COPY_KEY);
		} else  if( element.getValue() instanceof LocationValueProperty ) {
			return IconKeys.getIcon(IconKeys.LOCATION_KEY);
		} else if( element.getValue() instanceof ResourceValueProperty ) {
			return IconKeys.getIcon(IconKeys.EXTERNALIZED_STRING_KEY);
		} else if( element.getValue() instanceof ScriptHandlerHandledValueProperty ) {
			return IconKeys.getIcon(IconKeys.EVENT_KEY);
		} else if( element.getValue() instanceof SimpleValueProperty ) {
			return IconKeys.getIcon(IconKeys.FIELD_KEY);
		} else if( element.getValue() instanceof ConstValueProperty ) {
			return IconKeys.getIcon(IconKeys.FIELD_KEY);
		}
		
		return null;
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
