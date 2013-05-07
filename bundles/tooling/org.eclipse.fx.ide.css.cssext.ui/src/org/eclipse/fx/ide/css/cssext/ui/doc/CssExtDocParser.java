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
package org.eclipse.fx.ide.css.cssext.ui.doc;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.ui.JavaDocParser;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.ui.label.DeclarativeLabelProvider;

import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.ColorTok;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.IdSelector;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;
import org.eclipse.fx.ide.css.cssext.ICssExtManager;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSNumLiteral;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleBracket;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcat;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcatWithoutSpace;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleFunc;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleLiteral;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleOr;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRulePostfix;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRegex;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleSymbol;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleXor;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;

import com.google.inject.Inject;

public class CssExtDocParser {

	private @Inject ICssExtManager cssExtManager;
	private @Inject XtextElementLinks elementLinks;
	private @Inject IQualifiedNameProvider nameProvider;
	private @Inject DeclarativeLabelProvider labelProvider;
	private @Inject IImageHelper imageHelper;
	
	public String translateRule(CSSRule r) {
		String result = "";
		if (r instanceof CSSRuleOr) {
			Iterator<CSSRule> it =((CSSRuleOr) r).getOrs().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" | ";
				}
			}
		}
		else if (r instanceof CSSRuleConcat) {
			Iterator<CSSRule> it =((CSSRuleConcat) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" ";
				}
			}
		}
		else if (r instanceof CSSRuleConcatWithoutSpace) {
			Iterator<CSSRule> it =((CSSRuleConcatWithoutSpace) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" ~ ";
				}
			}
		}
		else if (r instanceof CSSRuleBracket) {
			result +="[ " + translateRule(((CSSRuleBracket) r).getInner()) + " ]";
		}
		else if (r instanceof CSSRuleXor) {
			Iterator<CSSRule> it =((CSSRuleXor) r).getXors().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result +=" || ";
				}
			}
		}
		else if (r instanceof CSSRuleLiteral) {
			result += ((CSSRuleLiteral) r).getValue();
		}
		else if (r instanceof CSSNumLiteral) {
			result += ((CSSNumLiteral)r).getValue();
		}
		else if (r instanceof CSSRuleRef) {
			result += elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, ((CSSRuleRef) r).getRef(), "&lt;" + ((CSSRuleRef) r).getRef().getName() + "&gt;");
		}
		else if (r instanceof CSSRulePostfix) {
			result += translateRule(((CSSRulePostfix) r).getRule()) + ((CSSRulePostfix) r).getCardinality();
		}
		else if (r instanceof CSSRuleRegex) {
			result += ((CSSRuleRegex) r).getRegex();
		}
		else if (r instanceof CSSRuleSymbol) {
			result += ((CSSRuleSymbol) r).getSymbol();
		}
		else if (r instanceof CSSType) {
			result = ((CSSType) r).getType();
		}
		else {
			if (r == null) result = "<code>null</code>";
			else result = "UNKNOWN: " + r;
		}
		return result;
	}
	
	protected String getDocForProperty(PropertyDefinition property) {
		if (property != null) {
			String rule = "syntax = " +translateRule(property.getRule()) + "<br>";
			String javadoc =  prepareDoku(property.getDoku());
			String defaultVal = property.getDefault()==null?"":"default = " + property.getDefault() + "<br>";
			// TODO complete defaultvalue at language level and add here
			return formatRule(rule)  + javadoc;
		}
		return "no documentation found";
	}
	
	protected String getDocForProperty(String propertyName) {
		return getDocForProperty(findPropertyByName(propertyName));
	}

	public String getDocumentation(EObject o) {
		// css ext lang elements
		if (o instanceof ElementDefinition) {
			return getDocForElement((ElementDefinition)o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocForProperty((PropertyDefinition)o);
		}
		if (o instanceof CSSRuleDefinition) {
			return getDocumentationForRule((CSSRuleDefinition) o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocForProperty((PropertyDefinition)o);
		}
		if (o instanceof PackageDefinition) {
			return getDocForPackage((PackageDefinition)o);
		}
		
		// css lang elements
		if (o instanceof ClassSelector) {
			return getDocForStyleClass(((ClassSelector)o).getName());
		}
		if (o instanceof IdSelector) {
			return null;
		}
		if (o instanceof ElementSelector) {
			return getDocForElement(((ElementSelector) o).getName());
		}
		if (o instanceof css_property) {
			return getDocForProperty(((css_property) o).getName());
		}
		
		return "no documentation found";
	}
	
	private String formatRule(String rule) {
		return "<p class=\"rule\">"+rule+"</p>";
	}
	
	private String getDocumentationForRule(CSSRuleDefinition r) {
		String func = "";
		if (r.getFunc() != null) {
			CSSRuleFunc f = (CSSRuleFunc) r.getFunc();
			func = f.getName() + "(" + translateRule(f.getParams()) + ")";
		}
		String rule = "";
		if (r.getRule() != null) {
			rule = r.getName()+" = " +translateRule(r.getRule());
		}
		
		String javadoc = prepareDoku(r.getDoku());
		return formatRule(func +  rule) + javadoc;
	}
	
	private String getDocumentationForRule(PropertyDefinition r) {
		String rule = "";
		if (r.getRule() != null) {
			rule = r.getName()+" = " +translateRule(r.getRule());
		}
		String javadoc = prepareDoku(r.getDoku());
		return formatRule(rule) + javadoc;
	}
	
	protected String getDocForStyleClass(String styleClass) {
		Assert.isNotNull(styleClass);
		ElementDefinition element = findElementByStyleClass(styleClass);
		if (element != null) {
			return getDocForElement(element);
		}
		return null;
	} 

	protected String getDocForElement(String elName) {
		Assert.isNotNull(elName);
		ElementDefinition element = findElementByName(elName);
		if (element != null) {
			return getDocForElement(element);
		}
		return null;
	}
	
	protected String getDocForElement(ElementDefinition el) {
		Assert.isNotNull(el);
		return prepareDoku(el.getDoku());
	}
	
	protected String getDocForPackage(PackageDefinition pkg) {
		Assert.isNotNull(pkg);
		return prepareDoku(pkg.getDoku());
	}
		
	private String prepareDoku(Doku doku) {
		if (doku != null) {
			return new JavaDocParser().parse(doku.getContent());
		}
		return "not documented!";
	}

	protected String getDocHeadForProperty(String propertyName) {
		Assert.isNotNull(propertyName);
		PropertyDefinition property = findPropertyByName(propertyName);
		if (property != null) {
			return getDocHeadForProperty(property);
		}
		return "<b>"+propertyName+"</b>";
	}
	
	protected String getDocHeadForProperty(PropertyDefinition property) {
		Assert.isNotNull(property);
		ElementDefinition element = (ElementDefinition) property.eContainer();
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "property_16x16.png");
		printName(out, property.getName());
		out.append("&nbsp;");
		printDefiningElement(out, element);
		out.append("</nobr>");
		return out.toString();
	}

	protected String getDocHeadForElement(String elName) {
		ElementDefinition element = findElementByName(elName);
		if (element != null) {
			// we only show docs for Elements which have no styleclass
			if (element.getStyleclass() == null) {
				return getDocHeadForElement(element);
			}
		}
		return null;
	}
	
	protected String getDocHeadForStyleClass(String styleClass) {
		ElementDefinition element = findElementByStyleClass(styleClass);
		if (element != null) {
			return getDocHeadForElement(element);
		}
		return null;
	}
	
	private void printImage(StringBuffer out, String image) {
		URL bundleUrl = Platform.getBundle("org.eclipse.fx.ide.css.ui").getEntry("icons/" + (String) image);
		 URL fileUrl = null;
	      try {
	        fileUrl = FileLocator.toFileURL(bundleUrl);
	      }
	      catch (IOException e) {
	        fileUrl = null;
	      }
		
		String url = fileUrl.toExternalForm();
		out.append("<img class=\"symbol\" src=\""+ url +"\"/>");
	}
	private void printName(StringBuffer out, String name) {
		out.append("<span class=\"name\"><b>" + name + "</b></span>");
	}
	private void printStyleClass(StringBuffer out, ElementDefinition elDef) {
		if (elDef.getStyleclass() != null) {
			out.append("<br/><span class=\"styleclass\"><span class=\"keyword\">style-class</span> .");
			out.append(elDef.getStyleclass());
			out.append("</span>");
		}
	}
	private void printPackageDefinition(StringBuffer out, PackageDefinition pkg) {
		out.append("<span class=\"pkg\">(defined in " + elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, pkg, nameProvider.getFullyQualifiedName(pkg).toString()) + ")</span>");
	}
	private void printDefiningElement(StringBuffer out, ElementDefinition element) {
		out.append("<span class=\"pkg\">(defined in " + elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, element, nameProvider.getFullyQualifiedName(element).toString()) + ")</span>");
	}
	private void printSuperElements(StringBuffer out, List<ElementDefinition> superEls) {
		if (!superEls.isEmpty()) {
			out.append("<br/><span class=\"extends\"><span class=\"keyword\">extends</span> ");
			Iterator<ElementDefinition> supaIt = superEls.iterator();
			while (supaIt.hasNext()) {
				ElementDefinition supa = supaIt.next();
				out.append(elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, supa, supa.getName()));
				if (supaIt.hasNext()) {
					out.append(", ");
				}
			}
			out.append("</span>");
		}
	}
	
	protected String getDocHeadForElement(ElementDefinition element) {
		Assert.isNotNull(element);
		
		PackageDefinition pkg = findPackage(element);
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "selector_16x16.png");
		printName(out, element.getName());
		out.append("&nbsp;");
		printPackageDefinition(out, pkg);
		out.append("</nobr>");
		printStyleClass(out, element);
		out.append("<nobr>");
		printSuperElements(out, element.getSuper());
		out.append("</nobr>");
		
		return out.toString();
	}
	
	private PackageDefinition findPackage(ElementDefinition element) {
		return (PackageDefinition) element.eContainer();
	}
	
	private PackageDefinition findPackage(CSSRuleDefinition element) {
		return (PackageDefinition) element.eContainer();
	}
	
	
	private PropertyDefinition findPropertyByName(String propertyName) {
		return cssExtManager.findPropertyByName(propertyName);
	}
	
	private ElementDefinition findElementByName(String elName) {
		return cssExtManager.findElementByName(elName);
	}
	
	private ElementDefinition findElementByStyleClass(String styleClass) {
		return cssExtManager.findElementByStyleClass(styleClass);
	}

	public String getDocHead(EObject o) {
		
		// css ext lang elements
		if (o instanceof CSSRuleDefinition) {
			return getDocHeadForCssRule((CSSRuleDefinition)o);
		}
		if (o instanceof ElementDefinition) {
			return getDocHeadForElement((ElementDefinition)o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocHeadForProperty((PropertyDefinition)o);
		}
		if (o instanceof PackageDefinition) {
			return getDocHeadForPackage((PackageDefinition)o);
		}
		
		// css lang elements
		if (o instanceof ClassSelector) {
			ElementDefinition element = findElementByStyleClass(((ClassSelector) o).getName());
			if (element != null) {
				return getDocHeadForElement(element);
			}
		}
		if (o instanceof ElementSelector) {
			return getDocHeadForElement(((ElementSelector) o).getName());
		}
		if (o instanceof css_property) {
			return getDocHeadForProperty(((css_property) o).getName());
		}
		if (o instanceof simple_selector) {
			simple_selector s = ((simple_selector)o);
			String elementName = null;
			if (s.getElement() instanceof ElementSelector) {
				elementName = ((ElementSelector)s.getElement()).getName();
			}
			return getDocHeadForElement(elementName);
		}
		// TODO add some color support here
		// we may need some kind of type info before
//		if (o instanceof ColorTok) {
//			// TODO implement color here
//			return null;
//		}
//		if (o instanceof IdentifierTok) {
//			css_declaration decl = (css_declaration) ((EObject)o).eContainer();
//			if (decl.getProperty().getName().contains("color")) {
//				// asume color
//				return "COLOR";
//			}
//		}
		
		return null;
	}

	private String getDocHeadForCssRule(CSSRuleDefinition rule) {
		Assert.isNotNull(rule);
		
		PackageDefinition pkg = findPackage(rule);
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "rule_16x16.png");
		printName(out, rule.getName());
		out.append("&nbsp;");
		printPackageDefinition(out, pkg);
		out.append("</nobr>");
		
		return out.toString();
	}
	
	private String getDocHeadForPackage(PackageDefinition pkg) {
		Assert.isNotNull(pkg);
		
		StringBuffer out = new StringBuffer();
		out.append("<nobr>");
		printImage(out, "package_16x16.png");
		printName(out, nameProvider.getFullyQualifiedName(pkg).toString());
		out.append("</nobr>");
		
		return out.toString();
	}
	
}
