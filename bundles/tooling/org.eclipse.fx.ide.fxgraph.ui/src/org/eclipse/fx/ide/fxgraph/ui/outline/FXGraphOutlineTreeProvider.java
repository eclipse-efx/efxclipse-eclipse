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
package org.eclipse.fx.ide.fxgraph.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

import org.eclipse.fx.ide.ui.util.IconKeys;

/**
 * customization of the default outline structure
 * 
 */
public class FXGraphOutlineTreeProvider extends DefaultOutlineTreeProvider {
	@Override
	protected void _createChildren(DocumentRootNode parentNode, EObject modelElement) {
		Model model = (Model) modelElement;
		
		if( model.getPackage() != null ) {
			createNode(parentNode, model.getPackage());
		} else {
			createEStructuralFeatureNode(parentNode, modelElement, FXGraphPackage.Literals.MODEL__PACKAGE, IconKeys.getIcon(IconKeys.PACKAGE_KEY), "default", true);
		}
		
		if( ! model.getImports().isEmpty() ) {
			createEStructuralFeatureNode(parentNode, modelElement, FXGraphPackage.Literals.MODEL__IMPORTS, IconKeys.getIcon(IconKeys.IMPORT_LIST_KEY), "import declarations", false);
		}
		
		if( model.getComponentDef() != null ) {
			createNode(parentNode, model.getComponentDef());	
		}
	}
	
	
	@Override
	protected void _createChildren(IOutlineNode parentNode, EObject modelElement) {
		if( modelElement instanceof ComponentDefinition ) {
			ComponentDefinition def = (ComponentDefinition) modelElement;
			if( ! def.getDefines().isEmpty() ) {
				createEStructuralFeatureNode(parentNode, def, FXGraphPackage.Literals.COMPONENT_DEFINITION__DEFINES, IconKeys.getIcon(IconKeys.DEFINES_KEY), "Defines", false);
			}
			
			if( ! def.getScripts().isEmpty() ) {
				createEStructuralFeatureNode(parentNode, def, FXGraphPackage.Literals.COMPONENT_DEFINITION__SCRIPTS, IconKeys.getIcon(IconKeys.SCRIPTS_KEY), "Scripts", false);
			}
			
			if( def.getRootNode() != null ) {
				createNode(parentNode, def.getRootNode());
			}
			
			return;
		} else if( modelElement instanceof Element ) {
			for( EObject o : modelElement.eContents() ) {
				if( o instanceof StaticCallValueProperty ) {
					createNode(parentNode, o);
				} else if( o instanceof Property ) {
					createNode(parentNode, o);
				} else if( o instanceof Element ) {
					createNode(parentNode, o);
				}
			}
			return;
		} else if( modelElement instanceof Property ) {
			Property p = (Property) modelElement;
			if( p.getValue() instanceof SimpleValueProperty ) {
				return;
			} else if( p.getValue() instanceof ListValueProperty ) {
				ListValueProperty lp = (ListValueProperty) p.getValue();
				for( ListValueElement e : lp.getValue() ) {
					if( lp.getValue() != null ) {
						createNode(parentNode, e);
					}
				}
				return;	
			} else if( p.getValue() instanceof ResourceValueProperty ) {
				return;
			} else if( p.getValue() instanceof MapValueProperty ) {
				MapValueProperty mp = (MapValueProperty) p.getValue();
				for( Property mpp : mp.getProperties() ) {
					createNode(parentNode, mpp);
				}
				return;
			}
		} else if( modelElement instanceof StaticCallValueProperty ) {
			StaticCallValueProperty p = (StaticCallValueProperty) modelElement;
			if( p.getValue() instanceof SimpleValueProperty ) {
				return;
			} else {
				if( p.getValue() != null ) {
					createNode(parentNode, p.getValue());	
				}
				return;
			}
		}
		
		super._createChildren(parentNode, modelElement);
	}
	
	@Override
	protected void _createNode(IOutlineNode parentNode, EObject modelElement) {
		if( modelElement instanceof Define ) {
			Define d = (Define) modelElement;
			if( d.getElement() != null ) {
				_createNode(parentNode, d.getElement());
				return;
			}
		}
		
		super._createNode(parentNode, modelElement);
	}
	
	public Object _text(ComponentDefinition def) {
		if( def.getController() != null ) {
			StyledString s = new StyledString(def.getName());
			s.append( " - ", StyledString.QUALIFIER_STYLER);
			s.append(def.getController().getSimpleName(), StyledString.QUALIFIER_STYLER);
			return s;
		}
		
		return def.getName();
	}
	
	public Object _text(Property property) {
		if( property.getValue() instanceof SimpleValueProperty ) {
			StyledString s = new StyledString(property.getName());
			SimpleValueProperty p = (SimpleValueProperty) property.getValue();
			s.append(" : " + getSimplePropertValue(p), StyledString.QUALIFIER_STYLER);
			return s;
		} else if( property.getValue() instanceof ControllerHandledValueProperty ) {
			StyledString s = new StyledString(property.getName());
			ControllerHandledValueProperty p = (ControllerHandledValueProperty) property.getValue();
			s.append( " : " + p.getMethodname(),StyledString.QUALIFIER_STYLER);
			return s;
		} else if( property.getValue() instanceof ReferenceValueProperty ) {
			StyledString s = new StyledString(property.getName());
			ReferenceValueProperty p = (ReferenceValueProperty) property.getValue();
			
			if( p.getReference() != null ) {
				s.append(" : " + (p.getReference() instanceof Element ? ((Element)p.getReference()).getName() : ((IncludeValueProperty)p.getReference()).getName()),StyledString.QUALIFIER_STYLER);	
			}
			
			return s;
		} else if( property.getValue() instanceof ResourceValueProperty ) {
			StyledString s = new StyledString(property.getName());
			ResourceValueProperty rp = (ResourceValueProperty) property.getValue();
			if( rp.getValue() != null ) {
				s.append(" : " + rp.getValue().getValue(), StyledString.QUALIFIER_STYLER);
			}
			return s;
		}
		
		return property.getName();
	}
	
	public Object _text(Element element) {
		if( element.getValue() != null || element.getName() != null || element.getFactory() != null ) {
			StyledString s = new StyledString();

			s.append(element.getType().getSimpleName());

			if( element.getValue() != null ) {
				s.append( "(" +getSimplePropertValue(element.getValue()) + ")");
			}
			
			if( element.getFactory() != null ) {
				s.append("#", StyledString.QUALIFIER_STYLER);
				s.append(element.getFactory(), StyledString.QUALIFIER_STYLER);
			}

			if( element.getName() != null ) {
				s.append(" - " + element.getName(), StyledString.QUALIFIER_STYLER);
			}
			
			return s;
		}
		
		return element.getType() != null ? element.getType().getSimpleName() : "";
	}
	
	public Object _text(StaticCallValueProperty element) {
		String name = (element.getType() != null ? element.getType().getSimpleName() : "<unknown>") + "#" + (element.getName() !=null ? element.getName() : "<unkown>");
		if( element.getValue() instanceof SimpleValueProperty ) {
			StyledString s = new StyledString(name);
			s.append(" : " + getSimplePropertValue((SimpleValueProperty) element.getValue()), StyledString.QUALIFIER_STYLER);
			return s;
		}
		return name;
	}
	
	private String getSimplePropertValue(SimpleValueProperty p) {
		StringBuilder b = new StringBuilder();
		if( p.getBooleanValue() != null ) {
			b.append(p.getBooleanValue());
		} else if( p.getStringValue() != null ) {
			b.append(p.getStringValue());
		} else if( p.getNumber() != null ) {
			if( p.isNegative() ) {
				b.append("-");
			}
			b.append(p.getNumber());
		}
		return b.toString();
	}
}
