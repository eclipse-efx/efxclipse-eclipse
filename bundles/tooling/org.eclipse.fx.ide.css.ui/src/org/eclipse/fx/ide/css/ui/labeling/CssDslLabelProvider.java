/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.labeling;

import java.util.Iterator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import org.eclipse.fx.ide.css.cssDsl.AttributeSelector;
import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.ColorTok;
import org.eclipse.fx.ide.css.cssDsl.CssSelector;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.IdSelector;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.NumberTok;
import org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction;
import org.eclipse.fx.ide.css.cssDsl.PseudoClassName;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation;
import org.eclipse.fx.ide.css.cssDsl.StringTok;
import org.eclipse.fx.ide.css.cssDsl.SymbolTok;
import org.eclipse.fx.ide.css.cssDsl.UrlTok;
import org.eclipse.fx.ide.css.cssDsl.WSTok;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CssDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public CssDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	String text(StringTok strTok) {
		if (strTok.getValue() != null) {
			return "\"" + strTok.getValue() + "\"";
		}
		else {
			return "null";
		}
	}

	String text(ruleset value) { 
		StringBuilder b = new StringBuilder();
		
		for( selector s : value.getSelectors() ) {
			if( b.length() > 0 ) {
				b.append(", ");
			}
			b.append(text(s));
		}
		
		return b.toString();
	}
	
	String text(selector value) {
		StringBuilder b = new StringBuilder(/*"se-"*/);
		
		for( simple_selector s : value.getSimpleselectors() ) {
			b.append(text(s));
		}
		
		if( value.getSelector() != null ) {
			if( value.getCombinator() != null ) {
				b.append(" " + value.getCombinator());
			}
			b.append(" " + text(value.getSelector()));
		}
		
		String r = b.toString();
		return r;
	}
	
	
	String image(selector s) {
		return "selector_16x16.png";
	}
	
	String image(ruleset ele) {
		return "selector_16x16.png";
	}
	
	String image(css_property ele) {
		return "property_16x16.png";
	}
	
	String image(CssSelector cssSelector) {
		return "selector_16x16.png";
	}
	
	String text(IdentifierTok idTok) {
		return idTok.getName();
	}
	
	String text(PseudoClassFunction pseudoFunc) {
		StringBuilder b = new StringBuilder();
		if (pseudoFunc.isNot()) {
			// :not pseudo function
			b.append("not(");
			b.append(getText(pseudoFunc.getParamSelector()));
			b.append(")");
		}
		else {
			// normal pseudo function
			b.append(pseudoFunc.getName());
			b.append("(");
			Iterator<CssTok> iterator = pseudoFunc.getParams().iterator();
			while (iterator.hasNext()) {
				CssTok next = iterator.next();
				b.append(getText(next));
			}
			b.append(")");
		}
		return b.toString();
	}
	
	String text(CssTok cssTok) {
		if (cssTok instanceof IdentifierTok) {
			return ((IdentifierTok) cssTok).getName();
		}
		else if (cssTok instanceof NumberTok) {
			return String.valueOf(((NumberTok) cssTok).getVal());
		}
		else if (cssTok instanceof SymbolTok) {
			return ((SymbolTok) cssTok).getSymbol();
		}
		else if (cssTok instanceof WSTok) {
			return " ";
		}
		else if (cssTok instanceof ColorTok) {
			return ((ColorTok) cssTok).getValue();
		}
		else if (cssTok instanceof FuncTok) {
			FuncTok funcTok = (FuncTok) cssTok;
			StringBuilder func = new StringBuilder();
			Iterator<CssTok> iterator = funcTok.getParams().iterator();
			while (iterator.hasNext()) {
				CssTok next = iterator.next();
				func.append(getText(next));
			}
			return getText(funcTok.getName()) + "(" + func.toString().trim()+ ")";
		}
		else if (cssTok instanceof UrlTok) {
			return "url(" + ((UrlTok)cssTok).getUrl().getUrl() + ")";
		}
		else return cssTok.toString();
	}
	
	String text(CssSelector cssSelector) {
		if (cssSelector instanceof ElementSelector) {
			return ((ElementSelector) cssSelector).getName();
		}
		else if (cssSelector instanceof ClassSelector) {
			return "." + ((ClassSelector) cssSelector).getName();
		}
		else if (cssSelector instanceof IdSelector) {
			return "#" + ((IdSelector) cssSelector).getName();
		}
		else if (cssSelector instanceof PseudoClassName) {
			return ":" + ((PseudoClassName) cssSelector).getName();
		}
		else if (cssSelector instanceof PseudoClassFunction) {
			return ":" + text((PseudoClassFunction)cssSelector);
		}
		else if (cssSelector instanceof AttributeSelector) {
			return "[" + text((AttributeSelector)cssSelector) + "]";
		}
		
		return cssSelector.toString();
	}
	
	String text(AttributeSelector s) {
		if (s.getOp() != null && s.getValue() != null) {
			return s.getName() + s.getOp() + s.getValue();
		}
		else {
			return s.getName();
		}
	}
	
	String text(ElementSelector elementSelector) {
		return elementSelector.getName();
	}
	
	String text(ClassSelector classSelector) {
		return "." + classSelector.getName();
	}
	
	String text(IdSelector idSelector) {
		return "#" + idSelector.getName();
	}
	
	String text(SimpleSelectorForNegation value) {
		StringBuilder b = new StringBuilder(/*"si-"*/);
		
		if( value.getElement() != null ) {
			b.append(getText(value.getElement()));
		}
		else if (value.getUniversal() != null) {
			b.append("*");
		}
		
		for( CssSelector sub : value.getSubSelectors() ) {
			b.append(getText(sub));
		}
		
		return b.toString();
	}
	
	String text(simple_selector value) {
		StringBuilder b = new StringBuilder(/*"si-"*/);
		
		if( value.getElement() != null ) {
			b.append(text(value.getElement()));
		}
		else if (value.getUniversal() != null) {
			b.append("*");
		}
		
		for( CssSelector sub : value.getSubSelectors() ) {
			b.append(text(sub));
//			if (sub instanceof IdSelector) {
//				b.append(((IdSelector) sub).getName());
//			}
//			else if (sub instanceof ClassSelector) {
//				b.append(((ClassSelector) sub).getName());
//			}
//			else if (sub instanceof PseudoClass) {
//				b.append(((PseudoClass) sub).getName());
//			}
		}
		
		return b.toString();
	}
	
//	public String text(Object t) {
//		return t.toString();
//	}
	
//	String text(Dim4Size value) {
//		StringBuilder b = new StringBuilder();
//		
//		for( String s : value.getValues() ) {
//			if( b.length() > 0 ) {
//				b.append(" ");
//			}
//			b.append(s);
//		}
//		
//		return b.toString();
//	}
//	
//	String text(PointValue value) {
//		if( value.eContainer() != null  && value.eContainer().eClass().equals(CssDslPackage.Literals.LINEAR_GRADIENT) ) {
//			if( value.eContainingFeature() != null && value.eContainingFeature().equals(CssDslPackage.Literals.LINEAR_GRADIENT__START) ) {
//				return "start";
//			} else {
//				return "end";
//			}
//		}
//		
//		return "point";
//	}
//	
//	
//	String text(StopValue value) {
//		return "stop";
//	}
//	
//	String text(LinearGradient value) {
//		return "linear-gradient";
//	}
//	
	String text(stylesheet value) {
		return "stylesheet";
	}
	
//	String text(BgSize value) {
//		if( value.getPredefined() != null ) {
//			return value.getPredefined();
//		} else {
//			return value.getYsize() != null ? value.getXsize() + " " + value.getYsize() : value.getXsize();
//		}
//	}
//	
//	String text(fx_background_image_size_property value) {
//		StringBuilder b = new StringBuilder();
//		
//		for( BgSize s : value.getValues() ) {
//			if( b.length() > 0 ) {
//				b.append(", ");
//			}
//			b.append(text(s));
//		}
//		
//		return b.toString();
//	}
	
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
