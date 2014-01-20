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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.IdSelector;
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
import org.eclipse.fx.ide.css.cssext.ui.JavaDocParser;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;

import com.google.inject.Inject;

/**
 * Parser for the external documentation
 */
public class CssExtDocParser {

	private @Inject
	ICssExtManager cssExtManager;
	private @Inject
	XtextElementLinks elementLinks;
	private @Inject
	IQualifiedNameProvider nameProvider;

	// private @Inject DeclarativeLabelProvider labelProvider;
	// private @Inject IImageHelper imageHelper;

	String translateRule(CSSRule r) {
		String result = ""; //$NON-NLS-1$
		if (r instanceof CSSRuleOr) {
			Iterator<CSSRule> it = ((CSSRuleOr) r).getOrs().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result += " | "; //$NON-NLS-1$
				}
			}
		} else if (r instanceof CSSRuleConcat) {
			Iterator<CSSRule> it = ((CSSRuleConcat) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result += " "; //$NON-NLS-1$
				}
			}
		} else if (r instanceof CSSRuleConcatWithoutSpace) {
			Iterator<CSSRule> it = ((CSSRuleConcatWithoutSpace) r).getConc().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result += " ~ "; //$NON-NLS-1$
				}
			}
		} else if (r instanceof CSSRuleBracket) {
			result += "[ " + translateRule(((CSSRuleBracket) r).getInner()) + " ]"; //$NON-NLS-1$ //$NON-NLS-2$
		} else if (r instanceof CSSRuleXor) {
			Iterator<CSSRule> it = ((CSSRuleXor) r).getXors().iterator();
			while (it.hasNext()) {
				result += translateRule(it.next());
				if (it.hasNext()) {
					result += " || "; //$NON-NLS-1$
				}
			}
		} else if (r instanceof CSSRuleLiteral) {
			result += ((CSSRuleLiteral) r).getValue();
		} else if (r instanceof CSSNumLiteral) {
			result += ((CSSNumLiteral) r).getValue();
		} else if (r instanceof CSSRuleRef) {
			result += this.elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, ((CSSRuleRef) r).getRef(), "&lt;" + ((CSSRuleRef) r).getRef().getName() + "&gt;"); //$NON-NLS-1$ //$NON-NLS-2$
		} else if (r instanceof CSSRulePostfix) {
			result += translateRule(((CSSRulePostfix) r).getRule()) + ((CSSRulePostfix) r).getCardinality();
		} else if (r instanceof CSSRuleRegex) {
			result += ((CSSRuleRegex) r).getRegex();
		} else if (r instanceof CSSRuleSymbol) {
			result += ((CSSRuleSymbol) r).getSymbol();
		} else if (r instanceof CSSType) {
			result = ((CSSType) r).getType();
		} else {
			if (r == null)
				result = "<code>null</code>"; //$NON-NLS-1$
			else
				result = "UNKNOWN: " + r;
		}
		return result;
	}

	protected String getDocForProperty(PropertyDefinition property) {
		if (property != null) {
			String rule = "syntax = " + translateRule(property.getRule()) + "<br>"; //$NON-NLS-1$ //$NON-NLS-2$
			String javadoc = prepareDoku(property.getDoku());
			//			String defaultVal = property.getDefault()==null?"":"default = " + property.getDefault() + "<br>";  //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
			// TODO complete defaultvalue at language level and add here
			return formatRule(rule) + javadoc;
		}
		return "no documentation found";
	}

	protected String getDocForProperty(IFile f, String propertyName) {
		return getDocForProperty(findPropertyByName(f, propertyName));
	}

	public String getDocumentation(IFile f, EObject o) {
		// css ext lang elements
		if (o instanceof ElementDefinition) {
			return getDocForElement((ElementDefinition) o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocForProperty((PropertyDefinition) o);
		}
		if (o instanceof CSSRuleDefinition) {
			return getDocumentationForRule((CSSRuleDefinition) o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocForProperty((PropertyDefinition) o);
		}
		if (o instanceof PackageDefinition) {
			return getDocForPackage((PackageDefinition) o);
		}

		// css lang elements
		if (o instanceof ClassSelector) {
			return getDocForStyleClass(f, ((ClassSelector) o).getName());
		}
		if (o instanceof IdSelector) {
			return null;
		}
		if (o instanceof ElementSelector) {
			return getDocForElement(f, ((ElementSelector) o).getName());
		}
		if (o instanceof css_property) {
			return getDocForProperty(f, ((css_property) o).getName());
		}

		return "no documentation found";
	}

	private static String formatRule(String rule) {
		return "<p class=\"rule\">" + rule + "</p>"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	private String getDocumentationForRule(CSSRuleDefinition r) {
		String func = ""; //$NON-NLS-1$
		if (r.getFunc() != null) {
			CSSRuleFunc f = (CSSRuleFunc) r.getFunc();
			func = f.getName() + "(" + translateRule(f.getParams()) + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		String rule = ""; //$NON-NLS-1$
		if (r.getRule() != null) {
			rule = r.getName() + " = " + translateRule(r.getRule()); //$NON-NLS-1$
		}

		String javadoc = prepareDoku(r.getDoku());
		return formatRule(func + rule) + javadoc;
	}

	// private String getDocumentationForRule(PropertyDefinition r) {
	//		String rule = ""; //$NON-NLS-1$
	// if (r.getRule() != null) {
	//			rule = r.getName()+" = " +translateRule(r.getRule()); //$NON-NLS-1$
	// }
	// String javadoc = prepareDoku(r.getDoku());
	// return formatRule(rule) + javadoc;
	// }

	protected String getDocForStyleClass(IFile f, String styleClass) {
		Assert.isNotNull(styleClass);
		ElementDefinition element = findElementByStyleClass(f, styleClass);
		if (element != null) {
			return getDocForElement(element);
		}
		return null;
	}

	protected String getDocForElement(IFile f, String elName) {
		Assert.isNotNull(elName);
		ElementDefinition element = findElementByName(f, elName);
		if (element != null) {
			return getDocForElement(element);
		}
		return null;
	}

	protected static String getDocForElement(ElementDefinition el) {
		Assert.isNotNull(el);
		return prepareDoku(el.getDoku());
	}

	protected static String getDocForPackage(PackageDefinition pkg) {
		Assert.isNotNull(pkg);
		return prepareDoku(pkg.getDoku());
	}

	private static String prepareDoku(Doku doku) {
		if (doku != null) {
			return new JavaDocParser().parse(doku.getContent());
		}
		return "not documented!";
	}

	protected String getDocHeadForProperty(IFile f, String propertyName) {
		Assert.isNotNull(propertyName);
		PropertyDefinition property = findPropertyByName(f, propertyName);
		if (property != null) {
			return getDocHeadForProperty(property);
		}
		return "<b>" + propertyName + "</b>"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	protected String getDocHeadForProperty(PropertyDefinition property) {
		Assert.isNotNull(property);
		ElementDefinition element = (ElementDefinition) property.eContainer();

		StringBuffer out = new StringBuffer();
		out.append("<nobr>"); //$NON-NLS-1$
		printImage(out, "property_16x16.png"); //$NON-NLS-1$
		printName(out, property.getName());
		out.append("&nbsp;"); //$NON-NLS-1$
		printDefiningElement(out, element);
		out.append("</nobr>"); //$NON-NLS-1$
		return out.toString();
	}

	protected String getDocHeadForElement(IFile f, String elName) {
		ElementDefinition element = findElementByName(f, elName);
		if (element != null) {
			// we only show docs for Elements which have no styleclass
			if (element.getStyleclass() == null) {
				return getDocHeadForElement(element);
			}
		}
		return null;
	}

	protected String getDocHeadForStyleClass(IFile f, String styleClass) {
		ElementDefinition element = findElementByStyleClass(f, styleClass);
		if (element != null) {
			return getDocHeadForElement(element);
		}
		return null;
	}

	private static void printImage(StringBuffer out, String image) {
		URL bundleUrl = Platform.getBundle("org.eclipse.fx.ide.css.ui").getEntry("icons/" + (String) image); //$NON-NLS-1$ //$NON-NLS-2$
		URL fileUrl = null;
		try {
			fileUrl = FileLocator.toFileURL(bundleUrl);
			String url = fileUrl.toExternalForm();
			out.append("<img class=\"symbol\" src=\"" + url + "\"/>"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void printName(StringBuffer out, String name) {
		out.append("<span class=\"name\"><b>" + name + "</b></span>"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	private static void printStyleClass(StringBuffer out, ElementDefinition elDef) {
		if (elDef.getStyleclass() != null) {
			out.append("<br/><span class=\"styleclass\"><span class=\"keyword\">style-class</span> ."); //$NON-NLS-1$
			out.append(elDef.getStyleclass());
			out.append("</span>"); //$NON-NLS-1$
		}
	}

	private void printPackageDefinition(StringBuffer out, PackageDefinition pkg) {
		out.append("<span class=\"pkg\">(defined in " + this.elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, pkg, this.nameProvider.getFullyQualifiedName(pkg).toString()) + ")</span>"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	private void printDefiningElement(StringBuffer out, ElementDefinition element) {
		out.append("<span class=\"pkg\">(defined in " + this.elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, element, this.nameProvider.getFullyQualifiedName(element).toString()) + ")</span>"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	private void printSuperElements(StringBuffer out, List<ElementDefinition> superEls) {
		if (!superEls.isEmpty()) {
			out.append("<br/><span class=\"extends\"><span class=\"keyword\">extends</span> "); //$NON-NLS-1$
			Iterator<ElementDefinition> supaIt = superEls.iterator();
			while (supaIt.hasNext()) {
				ElementDefinition supa = supaIt.next();
				out.append(this.elementLinks.createLink(XtextElementLinks.XTEXTDOC_SCHEME, supa, supa.getName()));
				if (supaIt.hasNext()) {
					out.append(", "); //$NON-NLS-1$
				}
			}
			out.append("</span>"); //$NON-NLS-1$
		}
	}

	protected String getDocHeadForElement(ElementDefinition element) {
		Assert.isNotNull(element);

		PackageDefinition pkg = findPackage(element);

		StringBuffer out = new StringBuffer();
		out.append("<nobr>"); //$NON-NLS-1$
		printImage(out, "selector_16x16.png"); //$NON-NLS-1$
		printName(out, element.getName());
		out.append("&nbsp;"); //$NON-NLS-1$
		printPackageDefinition(out, pkg);
		out.append("</nobr>"); //$NON-NLS-1$
		printStyleClass(out, element);
		out.append("<nobr>"); //$NON-NLS-1$
		printSuperElements(out, element.getSuper());
		out.append("</nobr>"); //$NON-NLS-1$

		return out.toString();
	}

	private static PackageDefinition findPackage(ElementDefinition element) {
		return (PackageDefinition) element.eContainer();
	}

	private static PackageDefinition findPackage(CSSRuleDefinition element) {
		return (PackageDefinition) element.eContainer();
	}

	private PropertyDefinition findPropertyByName(IFile f, String propertyName) {
		return this.cssExtManager.findPropertyByName(f, propertyName);
	}

	private ElementDefinition findElementByName(IFile f, String elName) {
		return this.cssExtManager.findElementByName(f, elName);
	}

	private ElementDefinition findElementByStyleClass(IFile f, String styleClass) {
		return this.cssExtManager.findElementByStyleClass(f, styleClass);
	}

	/**
	 * Get the documentation
	 * 
	 * @param f
	 *            the file
	 * @param o
	 *            the definition
	 * @return the documentation or <code>null</code>
	 */
	public String getDocHead(IFile f, EObject o) {

		// css ext lang elements
		if (o instanceof CSSRuleDefinition) {
			return getDocHeadForCssRule((CSSRuleDefinition) o);
		}
		if (o instanceof ElementDefinition) {
			return getDocHeadForElement((ElementDefinition) o);
		}
		if (o instanceof PropertyDefinition) {
			return getDocHeadForProperty((PropertyDefinition) o);
		}
		if (o instanceof PackageDefinition) {
			return getDocHeadForPackage((PackageDefinition) o);
		}

		// css lang elements
		if (o instanceof ClassSelector) {
			ElementDefinition element = findElementByStyleClass(f, ((ClassSelector) o).getName());
			if (element != null) {
				return getDocHeadForElement(element);
			}
		}
		if (o instanceof ElementSelector) {
			return getDocHeadForElement(f, ((ElementSelector) o).getName());
		}
		if (o instanceof css_property) {
			return getDocHeadForProperty(f, ((css_property) o).getName());
		}
		if (o instanceof simple_selector) {
			simple_selector s = ((simple_selector) o);
			String elementName = null;
			if (s.getElement() instanceof ElementSelector) {
				elementName = ((ElementSelector) s.getElement()).getName();
			}
			return getDocHeadForElement(f, elementName);
		}
		// TODO add some color support here
		// we may need some kind of type info before
		// if (o instanceof ColorTok) {
		// // TODO implement color here
		// return null;
		// }
		// if (o instanceof IdentifierTok) {
		// css_declaration decl = (css_declaration) ((EObject)o).eContainer();
		// if (decl.getProperty().getName().contains("color")) {
		// // asume color
		// return "COLOR";
		// }
		// }

		return null;
	}

	private String getDocHeadForCssRule(CSSRuleDefinition rule) {
		Assert.isNotNull(rule);

		PackageDefinition pkg = findPackage(rule);

		StringBuffer out = new StringBuffer();
		out.append("<nobr>"); //$NON-NLS-1$
		printImage(out, "rule_16x16.png"); //$NON-NLS-1$
		printName(out, rule.getName());
		out.append("&nbsp;"); //$NON-NLS-1$
		printPackageDefinition(out, pkg);
		out.append("</nobr>"); //$NON-NLS-1$

		return out.toString();
	}

	private String getDocHeadForPackage(PackageDefinition pkg) {
		Assert.isNotNull(pkg);

		StringBuffer out = new StringBuffer();
		out.append("<nobr>"); //$NON-NLS-1$
		printImage(out, "package_16x16.png"); //$NON-NLS-1$
		printName(out, this.nameProvider.getFullyQualifiedName(pkg).toString());
		out.append("</nobr>"); //$NON-NLS-1$

		return out.toString();
	}

}
