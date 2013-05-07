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
package org.eclipse.fx.ide.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;

public class SearchHelper {

	public static interface PropertyDefinitionFilter {
		public boolean filter(PropertyDefinition def);
		public boolean returnOnFirstHit();
	}
	
	public static interface ElementDefinitionFilter {
		public boolean filter(ElementDefinition def);
		public boolean returnOnFirstHit();
	}
	
	public static interface RuleFilter {
		public boolean filter(CSSRule def);
		public boolean returnOnFirstHit();
	}
	
	public static interface SearchFilter<T extends EObject> {
		public Class<T> getSearchClass();
		public boolean filter(T obj);
		public boolean returnOnFirstHit();
	}
	
	private Set<CssExtension> model;
	
	public SearchHelper(Set<CssExtension> model) {
		this.model = model;
	}
	
	public SearchHelper(CssExtension model) {
		this.model = new HashSet<CssExtension>();
		this.model.add(model);
	}
	
	public SearchHelper(Collection<CssExtension> model) {
		this.model = new HashSet<CssExtension>(model);
	}
	
	public List<PropertyDefinition> findPropertiesByFilter(PropertyDefinitionFilter filter) {
		List<PropertyDefinition> result = new ArrayList<PropertyDefinition>();
		for (CssExtension e : model) {
			recFindProperties(e, result, filter);
		}
		return result;
	}
	
	private void recFindProperties(EObject obj, List<PropertyDefinition> result, PropertyDefinitionFilter filter) {
		if (filter.returnOnFirstHit() && !result.isEmpty()) return;
		else if (obj instanceof CssExtension) {
			CssExtension e = (CssExtension) obj;
			recFindProperties(e.getPackageDef(), result, filter);
		}
		else if (obj instanceof PackageDefinition) {
			PackageDefinition pkg = (PackageDefinition) obj;
			for (ElementDefinition el : pkg.getElements()) {
				for (Definition d : el.getProperties()) {
					PropertyDefinition prop = (PropertyDefinition) d;
					if (filter.filter(prop)) {
						result.add(prop);
						if (filter.returnOnFirstHit()) {
							return;
						}
					}
				}
			}
			for (PackageDefinition subPkg : pkg.getSubpackages()) {
				recFindProperties(subPkg, result, filter);
			}
		}
	}
	
	
	public <T extends EObject> List<T> findObjects(SearchFilter<T> filter) {
		List<T> result = new ArrayList<T>();
		for (CssExtension e : model) {
			recFindObjects(e, result, filter);
		}
		return result;
	}
	
	public <T extends EObject> void recFindObjects(EObject curr, List<T> result, SearchFilter<T> filter) {
		if (filter.returnOnFirstHit() && !result.isEmpty()) return;
		if (filter.getSearchClass().isAssignableFrom(curr.getClass())) {
			if (filter.filter((T)curr)) {
				result.add((T)curr);
			}
		}
		
		if (curr instanceof CssExtension) {
			CssExtension e = (CssExtension) curr;
			recFindObjects(e.getPackageDef(), result, filter);
		}
		else if (curr instanceof PackageDefinition) {
			PackageDefinition pkg = (PackageDefinition) curr;
			for (Definition def : pkg.getRules()) {
				recFindObjects((CSSRuleDefinition) def, result, filter);
			}
			for (ElementDefinition el : pkg.getElements()) {
				recFindObjects(el, result, filter);
			}
			for (PackageDefinition subPkg : pkg.getSubpackages()) {
				recFindObjects(subPkg, result, filter);
			}
		}
	}
}
