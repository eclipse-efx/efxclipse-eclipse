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
package org.eclipse.fx.ide.css.cssext.ui.outline;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleBracket;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcat;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleLiteral;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleOr;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRulePostfix;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleXor;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Substructure;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass;

/**
 * customization of the default outline structure
 * 
 */
public class CssExtDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	protected Image _image(PackageDefinition m) {
		return labelProvider.getImage(m);
	}
	
	private String findFullPackageName(PackageDefinition d) {
		String name = d.getName();
		EObject c = d.eContainer();
		while (c != null && c instanceof PackageDefinition) {
			PackageDefinition cur = (PackageDefinition) c;
			name = cur.getName() + "." + name;
			c = c.eContainer();
		}
		return name;
	}
	
	protected void _createChildren(DocumentRootNode parentNode, CssExtension ext) {
		
		SortedSet<PackageDefinition> packages = new TreeSet<PackageDefinition>(new Comparator<PackageDefinition>() {
			@Override
			public int compare(PackageDefinition o1, PackageDefinition o2) {
				String name1 = findFullPackageName(o1);
				String name2 = findFullPackageName(o2);
				return name1.compareTo(name2);
			}
		});
		packages.add(ext.getPackageDef());
		
		
		while (!packages.isEmpty()) {
			PackageDefinition current = packages.last();
			packages.remove(current);
			
			createEObjectNode(parentNode, current, labelProvider.getImage(current), findFullPackageName(current), false);
			
			for (PackageDefinition d : current.getSubpackages()) {
				packages.add(d);
			}
			packages.addAll(current.getSubpackages());
		}
		
		
	}
	
	protected void _createChildren(IOutlineNode parentNode, ElementDefinition elDef) {
		for (Definition d : elDef.getProperties()) {
			createNode(parentNode, d);
		}
		for (PseudoClassDefinition d : elDef.getPseudoClasses()) {
			createNode(parentNode, d);
		}
		if (!elDef.getSubstructures().isEmpty()) {
			createEStructuralFeatureNode(parentNode, elDef, CssExtDslPackage.Literals.ELEMENT_DEFINITION__SUBSTRUCTURES, labelProvider.getImage(Collections.EMPTY_LIST), "Substructures", false);
		}
	}
	
	protected String _text(Substructure n) {
		return "substructure \""+n.getName()+"\"";
	}
	
	protected void _createChildren(IOutlineNode parent, SubstructureStyleclass n) {
		for (SubstructureStyleclass s : n.getChilds()) {
			createEObjectNode(parent, s);
		}
	}
	
	protected String _text(SubstructureStyleclass n) {
		String x =  labelProvider.getText(n.getElement()) + " -> ";
		for (SubstructureSelector s : n.getSelectors()) {
				x += s.getSelectorName();
				if (s.getVar() != null) {
					x+="[" + s.getVar() + "]";
				}
				x += " ";
		}
		return x;
	}
	
	protected void _createChildren(IOutlineNode parentNode, PackageDefinition pkg) {
		if (!pkg.getRules().isEmpty()) {
			createEStructuralFeatureNode(parentNode, pkg, CssExtDslPackage.Literals.PACKAGE_DEFINITION__RULES, labelProvider.getImage(Collections.EMPTY_LIST), "Rules", false);
		}
		if (!pkg.getElements().isEmpty()) {
			createEStructuralFeatureNode(parentNode, pkg, CssExtDslPackage.Literals.PACKAGE_DEFINITION__ELEMENTS, labelProvider.getImage(Collections.EMPTY_LIST), "Elements", false);
		}
	}
	
	protected boolean _isLeaf(Definition modelElement) {
		return true;
	}
	
	protected Object _text(CSSRuleDefinition modelElement) {
		return modelElement.getName();
	}
	
	protected Object _text(PropertyDefinition modelElement) {
		return modelElement.getName();
	}
	
	protected Object _text(ElementDefinition modelElement) {
		String r = modelElement.getName();
		if (modelElement.getStyleclass() != null) {
			r += " (" +modelElement.getStyleclass() + ")";
		}
		return r;
	}
	
	protected Object _text(Doku d) {
		return "documentation";
	}
	
	protected Object _text(PackageDefinition modelElement) {
		String name = modelElement.getName();
		EObject cur = modelElement.eContainer();
		while(cur != null && cur instanceof PackageDefinition) {
			PackageDefinition curDef = (PackageDefinition) cur;
			name = curDef.getName() + "." + name;
			cur = cur.eContainer();
		}
		
		return name;
	}
	
	protected Object _text(CSSRuleBracket model) {
		return "CSSRuleBracket []";
	}
	
	protected Object _text(CSSRuleOr model) {
		return "CSSRuleOr |";
	}
	
	protected Object _text(CSSRuleXor model) {
		return "CSSRuleXor ||";
	}
	
	protected Object _text(CSSRuleConcat model) {
		return "CSSRuleConcat";
	}
	
	protected Object _text(CSSRuleLiteral model) {
		return model.getValue();
	}
	
	protected Object _text(CSSRuleRef model) {
		return "<" + model.getRef().getName() + ">";
	}
	
	protected Object _text(CSSRulePostfix model) {
		return "CSSRulePostfix " + model.getCardinality();
	}
	
	
}
