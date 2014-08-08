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
package org.eclipse.fx.ide.css.validation;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.Proposal;
import org.eclipse.fx.ide.css.util.Utils;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
 

public class CssDslJavaValidator extends AbstractCssDslJavaValidator {
	//private @Inject CssDialectExtensionRegistry extension;
	
	private @Inject CssExt ext;
	
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	
	@Check
	public void checkProperty(css_property property) {
	}
	
	@Check
	public void checkDeclaration(css_declaration dec) {
//		System.err.println("CHECK DECL " + dec);
		css_property property = dec.getProperty();
		List<CssTok> tokens = dec.getValueTokens();
		
		URI uri = dec.eResource().getURI();
		
		List<Proposal> properties = ext.getPropertyProposalsForSelector(Utils.getFile(dec.eResource()),dec,null);
				//extension.getAllProperties(uri);
		
		boolean known = false;
		for (Proposal p : properties) {
			if (p.getProposal().equals(property.getName())) {
				known = true;
				break;
			}
		}
		
		if (!known) {
			warning("Unknown property: \""+property.getName()+"\"", CssDslPackage.Literals.CSS_DECLARATION__PROPERTY);
		}
		else {
			
			ruleset rs = (ruleset) dec.eContainer();
			List<selector> selectors = rs.getSelectors();
//			Set<CssProperty> selectorProps = new HashSet<>();
//			for (selector selector : selectors) {
//				selectorProps.addAll(extension.getPropertiesForSelector(uri, selector));
//			}
			
			List<Proposal> selectorProps = ext.getPropertyProposalsForSelector(Utils.getFile(dec.eResource()),dec,selectors);
			
			if (selectorProps.size() > 0) {
				boolean supported = false;
				for (Proposal p : selectorProps) {
					if (p.getProposal().equals(property.getName())) {
						supported = true;
						break;
					}
				}
				
				if (!supported) {
					warning("\""+property.getName()+"\" is not supported by the given selectors", CssDslPackage.Literals.CSS_DECLARATION__PROPERTY);
				}
			}
			
//			List<ValidationResult> result = extension.validateProperty(uri, null, property.getName(), tokens);
			
//			System.err.println(result);
//			 
//			System.err.println("validation of " + property.getName());
			
//			if (!result.isEmpty()) {
//				for (ValidationResult r : result) {
//					if (r.status == ValidationStatus.ERROR) {
//						if (r.object != null) {
//							if (r.object instanceof FuncTok) {
//								FuncTok f = (FuncTok) r.object;
//								error(r.message, f, CssDslPackage.Literals.FUNC_TOK__NAME, -1);
//							}
//							else {
//								error(r.message, r.object, null, 0);
//							}
//						}
//						else {
//							error(r.message, dec, CssDslPackage.Literals.CSS_DECLARATION__VALUE_TOKENS, r.index);
//						}
//					}
//				}
//			}
		}
	}
//	@Check
//	public void checkDeclaration(css_declaration dec) {
//		css_property property = dec.getProperty();
//		String propertyName = property.getName();
//		
//		if( propertyName == null || propertyName.trim().length() == 0 ) {
//			return;
//		}
//		
//		if( dec.getExpression().getTermGroups().size() == 1 && dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 && ("null".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) || "inherit".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) ) ) {
//			return;
//		}
//
//		ValidationResult[] results = new ValidationResult[0];
//		for( Property p : extension.getProperties(dec.eResource().getURI()) ) {
//			if( propertyName.equals(p.getName()) ) {
//				
//				ValidationResult[] r = p.validate(dec);
//				
//				// At least one validation succeed
//				if( r == null || r.length == 0 ) {
//					return;
//				} else if( r != null ) {
//					results = r;
//				}
//			}
//		}
//		
//		for( ValidationResult r : results ) {
//			if( r.status == ValidationStatus.ERROR ) {
//				if( r.object == null ) {
//					error( r.message, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION );
//				} else if( r.index == -1 ) {
//					error(r.message, r.object, r.feature, 0);
//				} else {
//					error(r.message, r.object, r.feature, r.index);
//				}
//			} else if( r.status == ValidationStatus.WARNING ) {
//				if( r.object == null ) {
//					warning( r.message, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION );
//				} else if( r.index == -1 ) {
//					warning(r.message, r.object, r.feature, 0);
//				} else {
//					warning(r.message, r.object, r.feature, r.index);
//				}
//			}
//		}
//		
////		System.err.println("Checking: " + extension + " => " + dec);
//	}
}
