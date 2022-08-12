/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.tests;

import java.io.StringReader;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public abstract class AbstractBasicLexerAndParserTest extends
    AbstractXtextTests {

  private Lexer lexer;
  private ITokenDefProvider tokenDefProvider;
  private IParser parser;

  protected Lexer getLexer() {
    return lexer;
  }

  protected ITokenDefProvider getTokenDefProvider() {
    return tokenDefProvider;
  }

  protected IParser getAntlrParser() {
    return parser;
  }

  @SuppressWarnings("rawtypes")
  abstract Class getStandaloneSetupClass();

  @SuppressWarnings("unchecked")
  @Override
  public void setUp() throws Exception {
    super.setUp();
    with(getStandaloneSetupClass());
    lexer = get(Lexer.class);
    tokenDefProvider = get(ITokenDefProvider.class);
    parser = get(IParser.class);
  }

  /**
   * return the list of tokens created by the lexer from the given input
   * */
  protected List<Token> getTokens(String input) {
    CharStream stream = new ANTLRStringStream(input);
    getLexer().setCharStream(stream);
    XtextTokenStream tokenStream = new XtextTokenStream(getLexer(),
        getTokenDefProvider());
    @SuppressWarnings("unchecked")
    List<Token> tokens = tokenStream.getTokens();
    return tokens;
  }

  /**
   * return the name of the terminal rule for a given token
   * */
  protected String getTokenType(Token token) {
    return getTokenDefProvider().getTokenDefMap().get(token.getType());
  }

  /**
   * check whether an input is chopped into a list of expected token types
   * */
  protected void checkTokenisation(String input, String... expectedTokenTypes) {
    List<Token> tokens = getTokens(input);
    assertEquals(input, expectedTokenTypes.length, tokens.size());
    for (int i = 0; i < tokens.size(); i++) {
      Token token = tokens.get(i);
      assertEquals(input, expectedTokenTypes[i], getTokenType(token));
    }
  }

  /**
   * check that an input is not tokenised using a particular terminal rule
   * */
  protected void failTokenisation(String input, String unExpectedTokenType) {
    List<Token> tokens = getTokens(input);
    assertEquals(input, 1, tokens.size());
    Token token = tokens.get(0);
    assertNotSame(input, unExpectedTokenType, getTokenType(token));
  }

  /**
   * return the parse result for an input given a specific entry rule of the
   * grammar
   * */
  protected IParseResult getParseResult(String input, String entryRule) {
	  return getAntlrParser().parse(new StringReader(input));
//    return getAntlrParser().parse(entryRule, new StringReader(input));
  }

  /**
   * check that the input can be successfully parsed given a specific entry
   * rule of the grammar
   * */
  protected void checkParsing(String input, String entryRule) {
    IParseResult la = getParseResult(input, entryRule);
    assertEquals(input, false, la.hasSyntaxErrors());
  }

  /**
   * check that the input cannot be successfully parsed given a specific entry
   * rule of the grammar
   * */
  protected void failParsing(String input, String entryRule) {
    IParseResult la = getParseResult(input, entryRule);
    assertEquals(input, false, la.hasSyntaxErrors());
  }

  /**
   * check that input is treated as a keyword by the grammar
   * */
  protected void checkKeyword(String input) {
    // the rule name for a keyword is usually
    // the keyword enclosed in single quotes
    String rule = new StringBuilder("'").append(input).append("'")
        .toString();
    checkTokenisation(input, rule);
  }

  /**
   * check that input is not treated as a keyword by the grammar
   * */
  protected void failKeyword(String keyword) {
    List<Token> tokens = getTokens(keyword);
    assertEquals(keyword, 1, tokens.size());
    String type = getTokenType(tokens.get(0));
    assertFalse(keyword, type.charAt(0) == '\'');
  }
}

