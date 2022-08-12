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
package org.eclipse.fx.ide.rrobot.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.fx.ide.rrobot.dsl.services.RTaskGrammarAccess;

public class RTaskParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RTaskGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.fx.ide.rrobot.dsl.parser.antlr.internal.InternalRTaskParser createParser(XtextTokenStream stream) {
		return new org.eclipse.fx.ide.rrobot.dsl.parser.antlr.internal.InternalRTaskParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "RobotTask";
	}
	
	public RTaskGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RTaskGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
