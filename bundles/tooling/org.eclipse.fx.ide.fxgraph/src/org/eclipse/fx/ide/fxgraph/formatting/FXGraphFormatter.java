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
package org.eclipse.fx.ide.fxgraph.formatting;

import java.util.List;

import org.eclipse.fx.ide.fxgraph.services.FXGraphGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;


/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class FXGraphFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		FXGraphGrammarAccess f = (FXGraphGrammarAccess) getGrammarAccess();

		for (Keyword comma : f.findKeywords("(")) {
			c.setNoSpace().around(comma);
		}
		
		for (Keyword comma : f.findKeywords(")")) {
			c.setNoSpace().before(comma);
		}
		
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}
		
		for( Keyword hash : f.findKeywords("#") ) {
			c.setNoSpace().around(hash);
		}
		
		c.setAutoLinewrap(120);
		
		c.setLinewrap(1, 2, 3).around(f.getImportRule());
		c.setLinewrap(1, 2, 3).before(f.getPropertyRule());
		c.setLinewrap(1, 2, 3).before(f.getStaticCallValuePropertyRule());
		
		c.setLinewrap(1, 2, 3).after(f.getElementAccess().getLeftCurlyBracketKeyword_1_1_1());
		c.setLinewrap(1, 2, 3).after(f.getElementAccess().getLeftCurlyBracketKeyword_1_2_3());
		c.setLinewrap(1, 2, 3).before(f.getElementAccess().getRightCurlyBracketKeyword_1_1_3());
		c.setLinewrap(1, 2, 3).before(f.getElementAccess().getRightCurlyBracketKeyword_1_2_6());
		c.setLinewrap(1, 2, 3).after(f.getElementAccess().getCommaKeyword_1_2_5_0());
		
		c.setLinewrap(1, 2, 3).after(f.getListValuePropertyAccess().getLeftSquareBracketKeyword_0());
		c.setLinewrap(1, 2, 3).after(f.getListValuePropertyAccess().getCommaKeyword_2_0());
		c.setLinewrap(1, 2, 3).before(f.getListValuePropertyAccess().getRightSquareBracketKeyword_3());
		
		c.setLinewrap(1, 2, 3).after(f.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_4());
		c.setLinewrap(1, 2, 3).before(f.getComponentDefinitionAccess().getRightCurlyBracketKeyword_8());
		
		
		c.setLinewrap(1, 2, 3).after(f.getMapValuePropertyAccess().getLeftCurlyBracketKeyword_0());
		c.setLinewrap(1, 2, 3).before(f.getMapValuePropertyAccess().getRightCurlyBracketKeyword_3());
		
		{
			List<Pair<Keyword,Keyword>> pairs = f.findKeywordPairs("{", "}");
			for (Pair<Keyword, Keyword> pair : pairs) {
				c.setIndentation(pair.getFirst(), pair.getSecond());
			}	
		}
		
		{
			List<Pair<Keyword,Keyword>> pairs = f.findKeywordPairs("[", "]");
			for (Pair<Keyword, Keyword> pair : pairs) {
				c.setIndentation(pair.getFirst(), pair.getSecond());
			}	
		}
		
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}
