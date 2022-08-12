/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.eclipse.fx.ide.css.cssext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;

public class CssExtDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CssExtDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.fx.ide.css.cssext.parser.antlr.internal.InternalCssExtDslParser createParser(XtextTokenStream stream) {
		return new org.eclipse.fx.ide.css.cssext.parser.antlr.internal.InternalCssExtDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "CssExtension";
	}
	
	public CssExtDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CssExtDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
