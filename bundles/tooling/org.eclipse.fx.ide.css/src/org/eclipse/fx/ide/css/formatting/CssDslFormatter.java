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
package org.eclipse.fx.ide.css.formatting;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfigBasedStream;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.util.Pair;
import org.w3c.dom.css.CSSRuleList;

import com.google.inject.Inject;


/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class CssDslFormatter extends AbstractDeclarativeFormatter {
	
	@Inject
	private IHiddenTokenHelper hiddenTokenHelper;
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		CssDslGrammarAccess f = (CssDslGrammarAccess) getGrammarAccess();

// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
//		c.setLinewrap(0, 1, 2).before(getGrammarAccess().getSL_COMMENTRule());
//		c.setLinewrap(0, 1, 2).before(getGrammarAccess().getML_COMMENTRule());
//		c.setLinewrap(0, 1, 1).after(getGrammarAccess().getML_COMMENTRule());
		
		c.setSpace(" ").after(f.getCss_propertyRule());
		
		//c.setSpace(" ").before(f.getCssTokRule());
		//c.setSpace(" ").before(f.getIdentifierOrFuncTokRule());
		//c.setSpace(" ").before(f.getNumberTokRule());
		//c.setSpace(" ").before(f.getSymbolTokRule());
		
		c.setSpace(" ").around(f.getSymbolTokRule());
		
		for (Keyword semicolon : f.findKeywords(";")) {
			c.setNoSpace().before(semicolon);
			c.setLinewrap().after(semicolon);
		}
		
		for (Keyword colon : f.findKeywords(":")) {
			c.setNoSpace().before(colon);
			c.setSpace(" ").after(colon);
		}
		
		
		
		for (Pair<Keyword, Keyword> braces : f.findKeywordPairs("{", "}")) {
			
			c.setIndentationIncrement().after(braces.getFirst());
			c.setIndentationDecrement().before(braces.getSecond());
			 
			c.setLinewrap().after(braces.getFirst());
			c.setLinewrap().before(braces.getSecond());
			c.setLinewrap(2).after(braces.getSecond());
		}	
		
		
		
		
	}
	
	@Override
	public ITokenStream createFormatterStream(String indent, ITokenStream out, boolean preserveWhitespaces) {
		return new SemanticWSEaterFormattingConfigBasedStream(out, indent, getConfig(), createMatcher(), hiddenTokenHelper, preserveWhitespaces);
	}
	
	@Override
	public ITokenStream createFormatterStream(EObject context, String indent, ITokenStream out, boolean preserveWhitespaces) {
		super.createFormatterStream(context, indent, out, preserveWhitespaces);
		return new SemanticWSEaterFormattingConfigBasedStream(out, indent, getConfig(), createMatcher(), hiddenTokenHelper, preserveWhitespaces);
	}
	
	public static class SemanticWSEaterFormattingConfigBasedStream extends FormattingConfigBasedStream {

		public SemanticWSEaterFormattingConfigBasedStream(ITokenStream out,
				String initialIndentation, FormattingConfig cfg,
				IElementMatcher<ElementPattern> matcher,
				IHiddenTokenHelper hiddenTokenHelper, boolean preserveSpaces) {
			super(out, initialIndentation, cfg, matcher, hiddenTokenHelper, preserveSpaces);
		}
		
		@Override
		public void writeSemantic(EObject grammarElement, String value) throws IOException {
			System.err.println("writeSemantic " + grammarElement + " v:'" + value + "'" );
			if (grammarElement instanceof RuleCall) {
				AbstractRule rule = ((RuleCall)grammarElement).getRule();
				if ("WS".equals(rule.getName())) {
					writeHidden(grammarElement, value);
					return;
				}
			}
			super.writeSemantic(grammarElement, value);
			
		}
		
		@Override
		public void writeHidden(EObject grammarElement, String value) throws IOException {
			System.err.println("writeHidden " + grammarElement + " v:'" + value + "'");
			
			if (grammarElement instanceof RuleCall) {
				AbstractRule rule = ((RuleCall)grammarElement).getRule();
				if (rule.getName().equals("WS")) {
					System.err.println("eating " + grammarElement + " for hidden ws");
					if (preservedWS == null) {
						preservedWS = value;
					}
					else {
						preservedWS += value;
					}
					return;
				}
			}
//			if (value.matches("\\s+")) {
//				System.err.println("eating " + grammarElement + " for hidden ws");
//				if (preservedWS == null) {
//					preservedWS = value;
//				}
//				else {
//					preservedWS += value;
//				}
//				return;
//			}
			super.writeHidden(grammarElement, value);
		}
		
	}
}
