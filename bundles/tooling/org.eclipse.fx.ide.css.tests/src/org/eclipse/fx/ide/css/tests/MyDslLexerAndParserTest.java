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
package org.eclipse.fx.ide.css.tests;

import java.util.List;

import org.antlr.runtime.Token;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.eclipse.fx.ide.css.CssDslStandaloneSetup;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;

@RunWith(XtextRunner.class)
public class MyDslLexerAndParserTest extends AbstractBasicLexerAndParserTest {

  @SuppressWarnings("rawtypes")
  @Override
  Class getStandaloneSetupClass() {
    //here you should return the StandaloneSetup class
    //of the language you want to test
    return CssDslStandaloneSetup.class;
  }
  
  //for convenience, define constants for the
  //rule names in your grammar
  //the names of terminal rules will be capitalised
  //and "RULE_" will be appended to the front
  private static final String ID="RULE_ID";
  private static final String SPECIAL_ID="RULE_SPECIAL_ID";
  private static final String INT="RULE_INT";
  private static final String WS="RULE_WS";
  private static final String SL_COMMENT="RULE_SL_COMMENT";
  
  private static final String FQN="QualifiedName";

  
  public void testID(){
    checkTokenisation("a", ID);
    checkTokenisation("abc", ID);
    checkTokenisation("abc123", ID);
    checkTokenisation("abc_123", ID);
    checkTokenisation("^entity", ID);
    
    //fail as entity is a keyword
    failTokenisation("entity", ID);
    //fail as A is a SPECIAL_ID
    failTokenisation("A", ID);
  }
  
  public void testSpecialID(){
    checkTokenisation("A", SPECIAL_ID);
    checkTokenisation("ABC", SPECIAL_ID);
    checkTokenisation("ABC_123", SPECIAL_ID);
    
    //fail as underscore is missing
    failTokenisation("ABC123", SPECIAL_ID);
  }

  public void testSLCOMMENT(){
    checkTokenisation("//comment", SL_COMMENT);
    checkTokenisation("//comment\n", SL_COMMENT);
    checkTokenisation("// comment \t\t comment\r\n", SL_COMMENT);
  }
  
  public void testKeywords(){
    checkKeyword("entity");
    checkKeyword("property");
    checkKeyword(".");
    
    //Entity is not a keyword
    failKeyword("Entity");
  }
  
  public void testTokenSequences(){
    checkTokenisation("123 abc", INT, WS, ID);
    checkTokenisation("123 \t//comment\n abc", INT, WS, SL_COMMENT,WS,ID);
    
    //note that no white space is necessary!
    checkTokenisation("123abc", INT, ID);
  }
  
  public void testQualifiedName(){
    checkParsing("abc.d", FQN);
    //note that white spaces and comments are hidden
    //so they are allowed within qualified names
    //if you don't want that, you have to start the rule
    //definition with QualifiedName hidden():
    //thereby making all tokens visible to the rule
    checkParsing("abc   .   d", FQN);
    checkParsing("abc /*comment*/  .\t\n//comment\n  d", FQN);
    
    //fail as ABC is a SPECIAL_ID
    failParsing("ABC.d", FQN);
  }
  
  //this test has nothing to do with the blog post topic
  //but it illustrates a simple way for unit testing your
  //language, querying the instantiated model
  @Test
  public void testModel(){
	  
	  List<Token> toks = getTokens(".class { pr:none; }");
	  
	  for (Token t : toks) {
		  System.err.println("TOKEN: " + t);
	  }
	  
	  stylesheet s;
	  
	  try {
		s = (stylesheet) getModelAndExpect(".class{ property:none; }", EXPECT_ERRORS);
		System.err.println(s);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
  }
}