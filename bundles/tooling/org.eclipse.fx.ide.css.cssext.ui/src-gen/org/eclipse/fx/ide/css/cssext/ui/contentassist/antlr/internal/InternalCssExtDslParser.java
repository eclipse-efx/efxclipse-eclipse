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
package org.eclipse.fx.ide.css.cssext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "','", "'%'", "'import'", "'.'", "'package'", "'{'", "'}'", "'('", "'->'", "')'", "'extends'", "'styleclass'", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'~'", "'['", "']'", "'substructure'", "'@INT'", "'@NUM'", "'@STRING'", "'@URL'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_PSEUDO=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGEX=10;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int RULE_JDOC=6;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCssExtDsl.g"; }


     
     	private CssExtDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssExtDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCssExtension"
    // InternalCssExtDsl.g:61:1: entryRuleCssExtension : ruleCssExtension EOF ;
    public final void entryRuleCssExtension() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:62:1: ( ruleCssExtension EOF )
            // InternalCssExtDsl.g:63:1: ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // InternalCssExtDsl.g:70:1: ruleCssExtension : ( ( rule__CssExtension__Group__0 ) ) ;
    public final void ruleCssExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:74:2: ( ( ( rule__CssExtension__Group__0 ) ) )
            // InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            {
            // InternalCssExtDsl.g:75:1: ( ( rule__CssExtension__Group__0 ) )
            // InternalCssExtDsl.g:76:1: ( rule__CssExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:77:1: ( rule__CssExtension__Group__0 )
            // InternalCssExtDsl.g:77:2: rule__CssExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // InternalCssExtDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:90:1: ( ruleImport EOF )
            // InternalCssExtDsl.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCssExtDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalCssExtDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // InternalCssExtDsl.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:105:1: ( rule__Import__Group__0 )
            // InternalCssExtDsl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // InternalCssExtDsl.g:117:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:118:1: ( ruleValidID EOF )
            // InternalCssExtDsl.g:119:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCssExtDsl.g:126:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:130:2: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:131:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:131:1: ( RULE_ID )
            // InternalCssExtDsl.g:132:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCssExtDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:146:1: ( ruleQualifiedName EOF )
            // InternalCssExtDsl.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCssExtDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCssExtDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCssExtDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // InternalCssExtDsl.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:173:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:174:1: ( ruleQualifiedNameWithWildCard EOF )
            // InternalCssExtDsl.g:175:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:182:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:186:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // InternalCssExtDsl.g:187:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // InternalCssExtDsl.g:188:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:189:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // InternalCssExtDsl.g:189:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalCssExtDsl.g:201:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:202:1: ( rulePackageDefinition EOF )
            // InternalCssExtDsl.g:203:1: rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalCssExtDsl.g:210:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:214:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:215:1: ( ( rule__PackageDefinition__Group__0 ) )
            // InternalCssExtDsl.g:216:1: ( rule__PackageDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:217:1: ( rule__PackageDefinition__Group__0 )
            // InternalCssExtDsl.g:217:2: rule__PackageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // InternalCssExtDsl.g:229:1: entryRuleDoku : ruleDoku EOF ;
    public final void entryRuleDoku() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:230:1: ( ruleDoku EOF )
            // InternalCssExtDsl.g:231:1: ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // InternalCssExtDsl.g:238:1: ruleDoku : ( ( rule__Doku__ContentAssignment ) ) ;
    public final void ruleDoku() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:242:2: ( ( ( rule__Doku__ContentAssignment ) ) )
            // InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            {
            // InternalCssExtDsl.g:243:1: ( ( rule__Doku__ContentAssignment ) )
            // InternalCssExtDsl.g:244:1: ( rule__Doku__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentAssignment()); 
            }
            // InternalCssExtDsl.g:245:1: ( rule__Doku__ContentAssignment )
            // InternalCssExtDsl.g:245:2: rule__Doku__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Doku__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // InternalCssExtDsl.g:257:1: entryRuleCSSBaseType : ruleCSSBaseType EOF ;
    public final void entryRuleCSSBaseType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:261:1: ( ruleCSSBaseType EOF )
            // InternalCssExtDsl.g:262:1: ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // InternalCssExtDsl.g:272:1: ruleCSSBaseType : ( ruleCSSType ) ;
    public final void ruleCSSBaseType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:277:2: ( ( ruleCSSType ) )
            // InternalCssExtDsl.g:278:1: ( ruleCSSType )
            {
            // InternalCssExtDsl.g:278:1: ( ruleCSSType )
            // InternalCssExtDsl.g:279:1: ruleCSSType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // InternalCssExtDsl.g:293:1: entryRuleCSSType : ruleCSSType EOF ;
    public final void entryRuleCSSType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:297:1: ( ruleCSSType EOF )
            // InternalCssExtDsl.g:298:1: ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // InternalCssExtDsl.g:308:1: ruleCSSType : ( ( rule__CSSType__Alternatives ) ) ;
    public final void ruleCSSType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:313:2: ( ( ( rule__CSSType__Alternatives ) ) )
            // InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            {
            // InternalCssExtDsl.g:314:1: ( ( rule__CSSType__Alternatives ) )
            // InternalCssExtDsl.g:315:1: ( rule__CSSType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:316:1: ( rule__CSSType__Alternatives )
            // InternalCssExtDsl.g:316:2: rule__CSSType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // InternalCssExtDsl.g:329:1: entryRuleElementDefinition : ruleElementDefinition EOF ;
    public final void entryRuleElementDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:330:1: ( ruleElementDefinition EOF )
            // InternalCssExtDsl.g:331:1: ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // InternalCssExtDsl.g:338:1: ruleElementDefinition : ( ( rule__ElementDefinition__Group__0 ) ) ;
    public final void ruleElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:342:2: ( ( ( rule__ElementDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:343:1: ( ( rule__ElementDefinition__Group__0 ) )
            // InternalCssExtDsl.g:344:1: ( rule__ElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:345:1: ( rule__ElementDefinition__Group__0 )
            // InternalCssExtDsl.g:345:2: rule__ElementDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalCssExtDsl.g:357:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:358:1: ( rulePropertyDefinition EOF )
            // InternalCssExtDsl.g:359:1: rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalCssExtDsl.g:366:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:370:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:371:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // InternalCssExtDsl.g:372:1: ( rule__PropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:373:1: ( rule__PropertyDefinition__Group__0 )
            // InternalCssExtDsl.g:373:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // InternalCssExtDsl.g:385:1: entryRulePseudoClassDefinition : rulePseudoClassDefinition EOF ;
    public final void entryRulePseudoClassDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:386:1: ( rulePseudoClassDefinition EOF )
            // InternalCssExtDsl.g:387:1: rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // InternalCssExtDsl.g:394:1: rulePseudoClassDefinition : ( ( rule__PseudoClassDefinition__Group__0 ) ) ;
    public final void rulePseudoClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:398:2: ( ( ( rule__PseudoClassDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:399:1: ( ( rule__PseudoClassDefinition__Group__0 ) )
            // InternalCssExtDsl.g:400:1: ( rule__PseudoClassDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:401:1: ( rule__PseudoClassDefinition__Group__0 )
            // InternalCssExtDsl.g:401:2: rule__PseudoClassDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // InternalCssExtDsl.g:413:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:417:1: ( ruleCSSRuleRef EOF )
            // InternalCssExtDsl.g:418:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // InternalCssExtDsl.g:428:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:433:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // InternalCssExtDsl.g:434:1: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // InternalCssExtDsl.g:434:1: ( ( rule__CSSRuleRef__Group__0 ) )
            // InternalCssExtDsl.g:435:1: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:436:1: ( rule__CSSRuleRef__Group__0 )
            // InternalCssExtDsl.g:436:2: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // InternalCssExtDsl.g:449:1: entryRuleCSSRuleDefinition : ruleCSSRuleDefinition EOF ;
    public final void entryRuleCSSRuleDefinition() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:453:1: ( ruleCSSRuleDefinition EOF )
            // InternalCssExtDsl.g:454:1: ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // InternalCssExtDsl.g:464:1: ruleCSSRuleDefinition : ( ( rule__CSSRuleDefinition__Group__0 ) ) ;
    public final void ruleCSSRuleDefinition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:469:2: ( ( ( rule__CSSRuleDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:470:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:470:1: ( ( rule__CSSRuleDefinition__Group__0 ) )
            // InternalCssExtDsl.g:471:1: ( rule__CSSRuleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:472:1: ( rule__CSSRuleDefinition__Group__0 )
            // InternalCssExtDsl.g:472:2: rule__CSSRuleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // InternalCssExtDsl.g:485:1: entryRuleCSSRuleFunc : ruleCSSRuleFunc EOF ;
    public final void entryRuleCSSRuleFunc() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:489:1: ( ruleCSSRuleFunc EOF )
            // InternalCssExtDsl.g:490:1: ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // InternalCssExtDsl.g:500:1: ruleCSSRuleFunc : ( ( rule__CSSRuleFunc__Group__0 ) ) ;
    public final void ruleCSSRuleFunc() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:505:2: ( ( ( rule__CSSRuleFunc__Group__0 ) ) )
            // InternalCssExtDsl.g:506:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            {
            // InternalCssExtDsl.g:506:1: ( ( rule__CSSRuleFunc__Group__0 ) )
            // InternalCssExtDsl.g:507:1: ( rule__CSSRuleFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:508:1: ( rule__CSSRuleFunc__Group__0 )
            // InternalCssExtDsl.g:508:2: rule__CSSRuleFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // InternalCssExtDsl.g:521:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:525:1: ( ruleCSSRuleOr EOF )
            // InternalCssExtDsl.g:526:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // InternalCssExtDsl.g:536:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:541:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // InternalCssExtDsl.g:542:1: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // InternalCssExtDsl.g:542:1: ( ( rule__CSSRuleOr__Group__0 ) )
            // InternalCssExtDsl.g:543:1: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:544:1: ( rule__CSSRuleOr__Group__0 )
            // InternalCssExtDsl.g:544:2: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // InternalCssExtDsl.g:557:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:561:1: ( ruleCSSRuleXor EOF )
            // InternalCssExtDsl.g:562:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // InternalCssExtDsl.g:572:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:577:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // InternalCssExtDsl.g:578:1: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // InternalCssExtDsl.g:578:1: ( ( rule__CSSRuleXor__Group__0 ) )
            // InternalCssExtDsl.g:579:1: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:580:1: ( rule__CSSRuleXor__Group__0 )
            // InternalCssExtDsl.g:580:2: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // InternalCssExtDsl.g:593:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:597:1: ( ruleCSSRuleConcat EOF )
            // InternalCssExtDsl.g:598:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // InternalCssExtDsl.g:608:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:613:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // InternalCssExtDsl.g:614:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // InternalCssExtDsl.g:614:1: ( ( rule__CSSRuleConcat__Group__0 ) )
            // InternalCssExtDsl.g:615:1: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:616:1: ( rule__CSSRuleConcat__Group__0 )
            // InternalCssExtDsl.g:616:2: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:629:1: entryRuleCSSRuleConcatWithoutSpace : ruleCSSRuleConcatWithoutSpace EOF ;
    public final void entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:633:1: ( ruleCSSRuleConcatWithoutSpace EOF )
            // InternalCssExtDsl.g:634:1: ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:644:1: ruleCSSRuleConcatWithoutSpace : ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) ) ;
    public final void ruleCSSRuleConcatWithoutSpace() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:649:2: ( ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) ) )
            // InternalCssExtDsl.g:650:1: ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) )
            {
            // InternalCssExtDsl.g:650:1: ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) )
            // InternalCssExtDsl.g:651:1: ( rule__CSSRuleConcatWithoutSpace__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:652:1: ( rule__CSSRuleConcatWithoutSpace__Group__0 )
            // InternalCssExtDsl.g:652:2: rule__CSSRuleConcatWithoutSpace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // InternalCssExtDsl.g:665:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:669:1: ( ruleCSSRulePostfix EOF )
            // InternalCssExtDsl.g:670:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // InternalCssExtDsl.g:680:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:685:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // InternalCssExtDsl.g:686:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // InternalCssExtDsl.g:686:1: ( ( rule__CSSRulePostfix__Group__0 ) )
            // InternalCssExtDsl.g:687:1: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:688:1: ( rule__CSSRulePostfix__Group__0 )
            // InternalCssExtDsl.g:688:2: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // InternalCssExtDsl.g:701:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:705:1: ( ruleCSSRuleBracket EOF )
            // InternalCssExtDsl.g:706:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // InternalCssExtDsl.g:716:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:721:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // InternalCssExtDsl.g:722:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // InternalCssExtDsl.g:722:1: ( ( rule__CSSRuleBracket__Group__0 ) )
            // InternalCssExtDsl.g:723:1: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:724:1: ( rule__CSSRuleBracket__Group__0 )
            // InternalCssExtDsl.g:724:2: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // InternalCssExtDsl.g:737:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:741:1: ( ruleCSSRulePrimary EOF )
            // InternalCssExtDsl.g:742:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // InternalCssExtDsl.g:752:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:757:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // InternalCssExtDsl.g:758:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // InternalCssExtDsl.g:758:1: ( ( rule__CSSRulePrimary__Alternatives ) )
            // InternalCssExtDsl.g:759:1: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:760:1: ( rule__CSSRulePrimary__Alternatives )
            // InternalCssExtDsl.g:760:2: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // InternalCssExtDsl.g:773:1: entryRuleCSSRuleRegex : ruleCSSRuleRegex EOF ;
    public final void entryRuleCSSRuleRegex() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:777:1: ( ruleCSSRuleRegex EOF )
            // InternalCssExtDsl.g:778:1: ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // InternalCssExtDsl.g:788:1: ruleCSSRuleRegex : ( ( rule__CSSRuleRegex__Group__0 ) ) ;
    public final void ruleCSSRuleRegex() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:793:2: ( ( ( rule__CSSRuleRegex__Group__0 ) ) )
            // InternalCssExtDsl.g:794:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            {
            // InternalCssExtDsl.g:794:1: ( ( rule__CSSRuleRegex__Group__0 ) )
            // InternalCssExtDsl.g:795:1: ( rule__CSSRuleRegex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:796:1: ( rule__CSSRuleRegex__Group__0 )
            // InternalCssExtDsl.g:796:2: rule__CSSRuleRegex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // InternalCssExtDsl.g:809:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:810:1: ( ruleCSSRuleLiteral EOF )
            // InternalCssExtDsl.g:811:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // InternalCssExtDsl.g:818:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Group__0 ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:822:2: ( ( ( rule__CSSRuleLiteral__Group__0 ) ) )
            // InternalCssExtDsl.g:823:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            {
            // InternalCssExtDsl.g:823:1: ( ( rule__CSSRuleLiteral__Group__0 ) )
            // InternalCssExtDsl.g:824:1: ( rule__CSSRuleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:825:1: ( rule__CSSRuleLiteral__Group__0 )
            // InternalCssExtDsl.g:825:2: rule__CSSRuleLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // InternalCssExtDsl.g:837:1: entryRuleCSSRuleSymbol : ruleCSSRuleSymbol EOF ;
    public final void entryRuleCSSRuleSymbol() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:838:1: ( ruleCSSRuleSymbol EOF )
            // InternalCssExtDsl.g:839:1: ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // InternalCssExtDsl.g:846:1: ruleCSSRuleSymbol : ( ( rule__CSSRuleSymbol__Group__0 ) ) ;
    public final void ruleCSSRuleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:850:2: ( ( ( rule__CSSRuleSymbol__Group__0 ) ) )
            // InternalCssExtDsl.g:851:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            {
            // InternalCssExtDsl.g:851:1: ( ( rule__CSSRuleSymbol__Group__0 ) )
            // InternalCssExtDsl.g:852:1: ( rule__CSSRuleSymbol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:853:1: ( rule__CSSRuleSymbol__Group__0 )
            // InternalCssExtDsl.g:853:2: rule__CSSRuleSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // InternalCssExtDsl.g:865:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:866:1: ( ruleCSSDefaultValue EOF )
            // InternalCssExtDsl.g:867:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // InternalCssExtDsl.g:874:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:878:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // InternalCssExtDsl.g:879:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // InternalCssExtDsl.g:879:1: ( ( rule__CSSDefaultValue__Alternatives ) )
            // InternalCssExtDsl.g:880:1: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:881:1: ( rule__CSSDefaultValue__Alternatives )
            // InternalCssExtDsl.g:881:2: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // InternalCssExtDsl.g:893:1: entryRuleSubstructureSelector : ruleSubstructureSelector EOF ;
    public final void entryRuleSubstructureSelector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:897:1: ( ruleSubstructureSelector EOF )
            // InternalCssExtDsl.g:898:1: ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // InternalCssExtDsl.g:908:1: ruleSubstructureSelector : ( ( rule__SubstructureSelector__Group__0 ) ) ;
    public final void ruleSubstructureSelector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:913:2: ( ( ( rule__SubstructureSelector__Group__0 ) ) )
            // InternalCssExtDsl.g:914:1: ( ( rule__SubstructureSelector__Group__0 ) )
            {
            // InternalCssExtDsl.g:914:1: ( ( rule__SubstructureSelector__Group__0 ) )
            // InternalCssExtDsl.g:915:1: ( rule__SubstructureSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:916:1: ( rule__SubstructureSelector__Group__0 )
            // InternalCssExtDsl.g:916:2: rule__SubstructureSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // InternalCssExtDsl.g:929:1: entryRuleSubstructure : ruleSubstructure EOF ;
    public final void entryRuleSubstructure() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:930:1: ( ruleSubstructure EOF )
            // InternalCssExtDsl.g:931:1: ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // InternalCssExtDsl.g:938:1: ruleSubstructure : ( ( rule__Substructure__Group__0 ) ) ;
    public final void ruleSubstructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:942:2: ( ( ( rule__Substructure__Group__0 ) ) )
            // InternalCssExtDsl.g:943:1: ( ( rule__Substructure__Group__0 ) )
            {
            // InternalCssExtDsl.g:943:1: ( ( rule__Substructure__Group__0 ) )
            // InternalCssExtDsl.g:944:1: ( rule__Substructure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:945:1: ( rule__Substructure__Group__0 )
            // InternalCssExtDsl.g:945:2: rule__Substructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // InternalCssExtDsl.g:957:1: entryRuleSubstructureStyleclass : ruleSubstructureStyleclass EOF ;
    public final void entryRuleSubstructureStyleclass() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:958:1: ( ruleSubstructureStyleclass EOF )
            // InternalCssExtDsl.g:959:1: ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // InternalCssExtDsl.g:966:1: ruleSubstructureStyleclass : ( ( rule__SubstructureStyleclass__Group__0 ) ) ;
    public final void ruleSubstructureStyleclass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:970:2: ( ( ( rule__SubstructureStyleclass__Group__0 ) ) )
            // InternalCssExtDsl.g:971:1: ( ( rule__SubstructureStyleclass__Group__0 ) )
            {
            // InternalCssExtDsl.g:971:1: ( ( rule__SubstructureStyleclass__Group__0 ) )
            // InternalCssExtDsl.g:972:1: ( rule__SubstructureStyleclass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:973:1: ( rule__SubstructureStyleclass__Group__0 )
            // InternalCssExtDsl.g:973:2: rule__SubstructureStyleclass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstructureStyleclass"


    // $ANTLR start "rule__PackageDefinition__Alternatives_4"
    // InternalCssExtDsl.g:985:1: rule__PackageDefinition__Alternatives_4 : ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:989:1: ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCssExtDsl.g:990:1: ( ( rule__PackageDefinition__RulesAssignment_4_0 ) )
                    {
                    // InternalCssExtDsl.g:990:1: ( ( rule__PackageDefinition__RulesAssignment_4_0 ) )
                    // InternalCssExtDsl.g:991:1: ( rule__PackageDefinition__RulesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_4_0()); 
                    }
                    // InternalCssExtDsl.g:992:1: ( rule__PackageDefinition__RulesAssignment_4_0 )
                    // InternalCssExtDsl.g:992:2: rule__PackageDefinition__RulesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__RulesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:996:6: ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) )
                    {
                    // InternalCssExtDsl.g:996:6: ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) )
                    // InternalCssExtDsl.g:997:1: ( rule__PackageDefinition__SubpackagesAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_4_1()); 
                    }
                    // InternalCssExtDsl.g:998:1: ( rule__PackageDefinition__SubpackagesAssignment_4_1 )
                    // InternalCssExtDsl.g:998:2: rule__PackageDefinition__SubpackagesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__SubpackagesAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_4_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1002:6: ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) )
                    {
                    // InternalCssExtDsl.g:1002:6: ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) )
                    // InternalCssExtDsl.g:1003:1: ( rule__PackageDefinition__ElementsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_4_2()); 
                    }
                    // InternalCssExtDsl.g:1004:1: ( rule__PackageDefinition__ElementsAssignment_4_2 )
                    // InternalCssExtDsl.g:1004:2: rule__PackageDefinition__ElementsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__ElementsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_4_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Alternatives_4"


    // $ANTLR start "rule__CSSType__Alternatives"
    // InternalCssExtDsl.g:1013:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) );
    public final void rule__CSSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1017:1: ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCssExtDsl.g:1018:1: ( ( rule__CSSType__Group_0__0 ) )
                    {
                    // InternalCssExtDsl.g:1018:1: ( ( rule__CSSType__Group_0__0 ) )
                    // InternalCssExtDsl.g:1019:1: ( rule__CSSType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }
                    // InternalCssExtDsl.g:1020:1: ( rule__CSSType__Group_0__0 )
                    // InternalCssExtDsl.g:1020:2: rule__CSSType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1024:6: ( ( rule__CSSType__Group_1__0 ) )
                    {
                    // InternalCssExtDsl.g:1024:6: ( ( rule__CSSType__Group_1__0 ) )
                    // InternalCssExtDsl.g:1025:1: ( rule__CSSType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }
                    // InternalCssExtDsl.g:1026:1: ( rule__CSSType__Group_1__0 )
                    // InternalCssExtDsl.g:1026:2: rule__CSSType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1030:6: ( ( rule__CSSType__Group_2__0 ) )
                    {
                    // InternalCssExtDsl.g:1030:6: ( ( rule__CSSType__Group_2__0 ) )
                    // InternalCssExtDsl.g:1031:1: ( rule__CSSType__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }
                    // InternalCssExtDsl.g:1032:1: ( rule__CSSType__Group_2__0 )
                    // InternalCssExtDsl.g:1032:2: rule__CSSType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Alternatives"


    // $ANTLR start "rule__CSSType__Alternatives_2_1"
    // InternalCssExtDsl.g:1041:1: rule__CSSType__Alternatives_2_1 : ( ( ( rule__CSSType__Group_2_1_0__0 ) ) | ( ( rule__CSSType__Group_2_1_1__0 ) ) | ( ( rule__CSSType__Group_2_1_2__0 ) ) | ( ( rule__CSSType__Group_2_1_3__0 ) ) );
    public final void rule__CSSType__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1045:1: ( ( ( rule__CSSType__Group_2_1_0__0 ) ) | ( ( rule__CSSType__Group_2_1_1__0 ) ) | ( ( rule__CSSType__Group_2_1_2__0 ) ) | ( ( rule__CSSType__Group_2_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=2;
                }
                break;
            case 43:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCssExtDsl.g:1046:1: ( ( rule__CSSType__Group_2_1_0__0 ) )
                    {
                    // InternalCssExtDsl.g:1046:1: ( ( rule__CSSType__Group_2_1_0__0 ) )
                    // InternalCssExtDsl.g:1047:1: ( rule__CSSType__Group_2_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2_1_0()); 
                    }
                    // InternalCssExtDsl.g:1048:1: ( rule__CSSType__Group_2_1_0__0 )
                    // InternalCssExtDsl.g:1048:2: rule__CSSType__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1052:6: ( ( rule__CSSType__Group_2_1_1__0 ) )
                    {
                    // InternalCssExtDsl.g:1052:6: ( ( rule__CSSType__Group_2_1_1__0 ) )
                    // InternalCssExtDsl.g:1053:1: ( rule__CSSType__Group_2_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2_1_1()); 
                    }
                    // InternalCssExtDsl.g:1054:1: ( rule__CSSType__Group_2_1_1__0 )
                    // InternalCssExtDsl.g:1054:2: rule__CSSType__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1058:6: ( ( rule__CSSType__Group_2_1_2__0 ) )
                    {
                    // InternalCssExtDsl.g:1058:6: ( ( rule__CSSType__Group_2_1_2__0 ) )
                    // InternalCssExtDsl.g:1059:1: ( rule__CSSType__Group_2_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2_1_2()); 
                    }
                    // InternalCssExtDsl.g:1060:1: ( rule__CSSType__Group_2_1_2__0 )
                    // InternalCssExtDsl.g:1060:2: rule__CSSType__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:1064:6: ( ( rule__CSSType__Group_2_1_3__0 ) )
                    {
                    // InternalCssExtDsl.g:1064:6: ( ( rule__CSSType__Group_2_1_3__0 ) )
                    // InternalCssExtDsl.g:1065:1: ( rule__CSSType__Group_2_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2_1_3()); 
                    }
                    // InternalCssExtDsl.g:1066:1: ( rule__CSSType__Group_2_1_3__0 )
                    // InternalCssExtDsl.g:1066:2: rule__CSSType__Group_2_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2_1_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Alternatives_2_1"


    // $ANTLR start "rule__ElementDefinition__Alternatives_6"
    // InternalCssExtDsl.g:1075:1: rule__ElementDefinition__Alternatives_6 : ( ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) ) | ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) ) );
    public final void rule__ElementDefinition__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1079:1: ( ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) ) | ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_JDOC:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_PSEUDO:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCssExtDsl.g:1080:1: ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) )
                    {
                    // InternalCssExtDsl.g:1080:1: ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) )
                    // InternalCssExtDsl.g:1081:1: ( rule__ElementDefinition__PropertiesAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_6_0()); 
                    }
                    // InternalCssExtDsl.g:1082:1: ( rule__ElementDefinition__PropertiesAssignment_6_0 )
                    // InternalCssExtDsl.g:1082:2: rule__ElementDefinition__PropertiesAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__PropertiesAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1086:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) )
                    {
                    // InternalCssExtDsl.g:1086:6: ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) )
                    // InternalCssExtDsl.g:1087:1: ( rule__ElementDefinition__PseudoClassesAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_6_1()); 
                    }
                    // InternalCssExtDsl.g:1088:1: ( rule__ElementDefinition__PseudoClassesAssignment_6_1 )
                    // InternalCssExtDsl.g:1088:2: rule__ElementDefinition__PseudoClassesAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__PseudoClassesAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1092:6: ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) )
                    {
                    // InternalCssExtDsl.g:1092:6: ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) )
                    // InternalCssExtDsl.g:1093:1: ( rule__ElementDefinition__SubstructuresAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getSubstructuresAssignment_6_2()); 
                    }
                    // InternalCssExtDsl.g:1094:1: ( rule__ElementDefinition__SubstructuresAssignment_6_2 )
                    // InternalCssExtDsl.g:1094:2: rule__ElementDefinition__SubstructuresAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__SubstructuresAssignment_6_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getSubstructuresAssignment_6_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Alternatives_6"


    // $ANTLR start "rule__CSSRuleDefinition__Alternatives_4"
    // InternalCssExtDsl.g:1103:1: rule__CSSRuleDefinition__Alternatives_4 : ( ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) ) );
    public final void rule__CSSRuleDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1107:1: ( ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_JDOC && LA5_0<=RULE_INT)||LA5_0==RULE_REGEX||(LA5_0>=18 && LA5_0<=19)||LA5_0==32||LA5_0==38||(LA5_0>=41 && LA5_0<=44)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID||(LA5_2>=RULE_JDOC && LA5_2<=RULE_INT)||LA5_2==RULE_REGEX||(LA5_2>=15 && LA5_2<=19)||LA5_2==30||LA5_2==32||(LA5_2>=35 && LA5_2<=38)||(LA5_2>=41 && LA5_2<=44)) ) {
                    alt5=1;
                }
                else if ( (LA5_2==25) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCssExtDsl.g:1108:1: ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) )
                    {
                    // InternalCssExtDsl.g:1108:1: ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) )
                    // InternalCssExtDsl.g:1109:1: ( rule__CSSRuleDefinition__RuleAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4_0()); 
                    }
                    // InternalCssExtDsl.g:1110:1: ( rule__CSSRuleDefinition__RuleAssignment_4_0 )
                    // InternalCssExtDsl.g:1110:2: rule__CSSRuleDefinition__RuleAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__RuleAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1114:6: ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) )
                    {
                    // InternalCssExtDsl.g:1114:6: ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) )
                    // InternalCssExtDsl.g:1115:1: ( rule__CSSRuleDefinition__FuncAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_4_1()); 
                    }
                    // InternalCssExtDsl.g:1116:1: ( rule__CSSRuleDefinition__FuncAssignment_4_1 )
                    // InternalCssExtDsl.g:1116:2: rule__CSSRuleDefinition__FuncAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__FuncAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Alternatives_4"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"
    // InternalCssExtDsl.g:1125:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1129:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCssExtDsl.g:1130:1: ( '*' )
                    {
                    // InternalCssExtDsl.g:1130:1: ( '*' )
                    // InternalCssExtDsl.g:1131:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1138:6: ( '+' )
                    {
                    // InternalCssExtDsl.g:1138:6: ( '+' )
                    // InternalCssExtDsl.g:1139:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1146:6: ( '?' )
                    {
                    // InternalCssExtDsl.g:1146:6: ( '?' )
                    // InternalCssExtDsl.g:1147:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"


    // $ANTLR start "rule__CSSRulePrimary__Alternatives"
    // InternalCssExtDsl.g:1159:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1163:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCssExtDsl.g:1164:1: ( ruleCSSRuleRef )
                    {
                    // InternalCssExtDsl.g:1164:1: ( ruleCSSRuleRef )
                    // InternalCssExtDsl.g:1165:1: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1170:6: ( ruleCSSRuleBracket )
                    {
                    // InternalCssExtDsl.g:1170:6: ( ruleCSSRuleBracket )
                    // InternalCssExtDsl.g:1171:1: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1176:6: ( ruleCSSRuleLiteral )
                    {
                    // InternalCssExtDsl.g:1176:6: ( ruleCSSRuleLiteral )
                    // InternalCssExtDsl.g:1177:1: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:1182:6: ( ruleCSSRuleSymbol )
                    {
                    // InternalCssExtDsl.g:1182:6: ( ruleCSSRuleSymbol )
                    // InternalCssExtDsl.g:1183:1: ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssExtDsl.g:1188:6: ( ruleCSSBaseType )
                    {
                    // InternalCssExtDsl.g:1188:6: ( ruleCSSBaseType )
                    // InternalCssExtDsl.g:1189:1: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssExtDsl.g:1194:6: ( ruleCSSRuleRegex )
                    {
                    // InternalCssExtDsl.g:1194:6: ( ruleCSSRuleRegex )
                    // InternalCssExtDsl.g:1195:1: ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCssExtDsl.g:1200:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    {
                    // InternalCssExtDsl.g:1200:6: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    // InternalCssExtDsl.g:1201:1: ( rule__CSSRulePrimary__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
                    }
                    // InternalCssExtDsl.g:1202:1: ( rule__CSSRulePrimary__Group_6__0 )
                    // InternalCssExtDsl.g:1202:2: rule__CSSRulePrimary__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRulePrimary__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Alternatives"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAlternatives_2_0"
    // InternalCssExtDsl.g:1211:1: rule__CSSRuleSymbol__SymbolAlternatives_2_0 : ( ( ',' ) | ( '%' ) );
    public final void rule__CSSRuleSymbol__SymbolAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1215:1: ( ( ',' ) | ( '%' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCssExtDsl.g:1216:1: ( ',' )
                    {
                    // InternalCssExtDsl.g:1216:1: ( ',' )
                    // InternalCssExtDsl.g:1217:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1224:6: ( '%' )
                    {
                    // InternalCssExtDsl.g:1224:6: ( '%' )
                    // InternalCssExtDsl.g:1225:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAlternatives_2_0"


    // $ANTLR start "rule__CSSDefaultValue__Alternatives"
    // InternalCssExtDsl.g:1237:1: rule__CSSDefaultValue__Alternatives : ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1241:1: ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_JDOC:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt9=3;
                }
                break;
            case RULE_STRING:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCssExtDsl.g:1242:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    {
                    // InternalCssExtDsl.g:1242:1: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    // InternalCssExtDsl.g:1243:1: ( rule__CSSDefaultValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }
                    // InternalCssExtDsl.g:1244:1: ( rule__CSSDefaultValue__Group_0__0 )
                    // InternalCssExtDsl.g:1244:2: rule__CSSDefaultValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1248:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    {
                    // InternalCssExtDsl.g:1248:6: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    // InternalCssExtDsl.g:1249:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }
                    // InternalCssExtDsl.g:1250:1: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    // InternalCssExtDsl.g:1250:2: rule__CSSDefaultValue__IvalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__IvalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1254:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    {
                    // InternalCssExtDsl.g:1254:6: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    // InternalCssExtDsl.g:1255:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }
                    // InternalCssExtDsl.g:1256:1: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    // InternalCssExtDsl.g:1256:2: rule__CSSDefaultValue__DvalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__DvalAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:1260:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    {
                    // InternalCssExtDsl.g:1260:6: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    // InternalCssExtDsl.g:1261:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }
                    // InternalCssExtDsl.g:1262:1: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    // InternalCssExtDsl.g:1262:2: rule__CSSDefaultValue__SvalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__SvalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Alternatives"


    // $ANTLR start "rule__CssExtension__Group__0"
    // InternalCssExtDsl.g:1273:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1277:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // InternalCssExtDsl.g:1278:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__Group__0"


    // $ANTLR start "rule__CssExtension__Group__0__Impl"
    // InternalCssExtDsl.g:1285:1: rule__CssExtension__Group__0__Impl : ( ( rule__CssExtension__ImportsAssignment_0 )* ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1289:1: ( ( ( rule__CssExtension__ImportsAssignment_0 )* ) )
            // InternalCssExtDsl.g:1290:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            {
            // InternalCssExtDsl.g:1290:1: ( ( rule__CssExtension__ImportsAssignment_0 )* )
            // InternalCssExtDsl.g:1291:1: ( rule__CssExtension__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }
            // InternalCssExtDsl.g:1292:1: ( rule__CssExtension__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCssExtDsl.g:1292:2: rule__CssExtension__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CssExtension__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__Group__0__Impl"


    // $ANTLR start "rule__CssExtension__Group__1"
    // InternalCssExtDsl.g:1302:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1306:1: ( rule__CssExtension__Group__1__Impl )
            // InternalCssExtDsl.g:1307:2: rule__CssExtension__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__Group__1"


    // $ANTLR start "rule__CssExtension__Group__1__Impl"
    // InternalCssExtDsl.g:1313:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__PackageDefAssignment_1 )? ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1317:1: ( ( ( rule__CssExtension__PackageDefAssignment_1 )? ) )
            // InternalCssExtDsl.g:1318:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            {
            // InternalCssExtDsl.g:1318:1: ( ( rule__CssExtension__PackageDefAssignment_1 )? )
            // InternalCssExtDsl.g:1319:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }
            // InternalCssExtDsl.g:1320:1: ( rule__CssExtension__PackageDefAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_JDOC||LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCssExtDsl.g:1320:2: rule__CssExtension__PackageDefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CssExtension__PackageDefAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalCssExtDsl.g:1334:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1338:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalCssExtDsl.g:1339:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalCssExtDsl.g:1346:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1350:1: ( ( 'import' ) )
            // InternalCssExtDsl.g:1351:1: ( 'import' )
            {
            // InternalCssExtDsl.g:1351:1: ( 'import' )
            // InternalCssExtDsl.g:1352:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalCssExtDsl.g:1365:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1369:1: ( rule__Import__Group__1__Impl )
            // InternalCssExtDsl.g:1370:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalCssExtDsl.g:1376:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1380:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalCssExtDsl.g:1381:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalCssExtDsl.g:1381:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalCssExtDsl.g:1382:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalCssExtDsl.g:1383:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalCssExtDsl.g:1383:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCssExtDsl.g:1397:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1401:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCssExtDsl.g:1402:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCssExtDsl.g:1409:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1413:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:1414:1: ( ruleValidID )
            {
            // InternalCssExtDsl.g:1414:1: ( ruleValidID )
            // InternalCssExtDsl.g:1415:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCssExtDsl.g:1426:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1430:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCssExtDsl.g:1431:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCssExtDsl.g:1437:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1441:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCssExtDsl.g:1442:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCssExtDsl.g:1442:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCssExtDsl.g:1443:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:1444:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCssExtDsl.g:1444:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCssExtDsl.g:1458:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1462:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCssExtDsl.g:1463:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCssExtDsl.g:1470:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1474:1: ( ( ( '.' ) ) )
            // InternalCssExtDsl.g:1475:1: ( ( '.' ) )
            {
            // InternalCssExtDsl.g:1475:1: ( ( '.' ) )
            // InternalCssExtDsl.g:1476:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalCssExtDsl.g:1477:1: ( '.' )
            // InternalCssExtDsl.g:1478:2: '.'
            {
            match(input,21,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCssExtDsl.g:1489:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1493:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCssExtDsl.g:1494:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCssExtDsl.g:1500:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1504:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:1505:1: ( ruleValidID )
            {
            // InternalCssExtDsl.g:1505:1: ( ruleValidID )
            // InternalCssExtDsl.g:1506:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // InternalCssExtDsl.g:1521:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1525:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // InternalCssExtDsl.g:1526:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // InternalCssExtDsl.g:1533:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1537:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:1538:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1538:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:1539:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // InternalCssExtDsl.g:1550:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1554:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // InternalCssExtDsl.g:1555:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // InternalCssExtDsl.g:1561:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1565:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // InternalCssExtDsl.g:1566:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:1566:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // InternalCssExtDsl.g:1567:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:1568:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCssExtDsl.g:1568:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedNameWithWildCard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0"
    // InternalCssExtDsl.g:1582:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1586:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // InternalCssExtDsl.g:1587:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0__Impl"
    // InternalCssExtDsl.g:1594:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1598:1: ( ( '.' ) )
            // InternalCssExtDsl.g:1599:1: ( '.' )
            {
            // InternalCssExtDsl.g:1599:1: ( '.' )
            // InternalCssExtDsl.g:1600:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1"
    // InternalCssExtDsl.g:1613:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1617:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // InternalCssExtDsl.g:1618:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1__Impl"
    // InternalCssExtDsl.g:1624:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1628:1: ( ( '*' ) )
            // InternalCssExtDsl.g:1629:1: ( '*' )
            {
            // InternalCssExtDsl.g:1629:1: ( '*' )
            // InternalCssExtDsl.g:1630:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalCssExtDsl.g:1647:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1651:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalCssExtDsl.g:1652:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:1659:1: rule__PackageDefinition__Group__0__Impl : ( ( rule__PackageDefinition__Group_0__0 )? ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1663:1: ( ( ( rule__PackageDefinition__Group_0__0 )? ) )
            // InternalCssExtDsl.g:1664:1: ( ( rule__PackageDefinition__Group_0__0 )? )
            {
            // InternalCssExtDsl.g:1664:1: ( ( rule__PackageDefinition__Group_0__0 )? )
            // InternalCssExtDsl.g:1665:1: ( rule__PackageDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup_0()); 
            }
            // InternalCssExtDsl.g:1666:1: ( rule__PackageDefinition__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_JDOC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCssExtDsl.g:1666:2: rule__PackageDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // InternalCssExtDsl.g:1676:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1680:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalCssExtDsl.g:1681:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:1688:1: rule__PackageDefinition__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1692:1: ( ( 'package' ) )
            // InternalCssExtDsl.g:1693:1: ( 'package' )
            {
            // InternalCssExtDsl.g:1693:1: ( 'package' )
            // InternalCssExtDsl.g:1694:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // InternalCssExtDsl.g:1707:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1711:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalCssExtDsl.g:1712:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:1719:1: rule__PackageDefinition__Group__2__Impl : ( ( rule__PackageDefinition__NameAssignment_2 ) ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1723:1: ( ( ( rule__PackageDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:1724:1: ( ( rule__PackageDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:1724:1: ( ( rule__PackageDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:1725:1: ( rule__PackageDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:1726:1: ( rule__PackageDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:1726:2: rule__PackageDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // InternalCssExtDsl.g:1736:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1740:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalCssExtDsl.g:1741:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:1748:1: rule__PackageDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1752:1: ( ( '{' ) )
            // InternalCssExtDsl.g:1753:1: ( '{' )
            {
            // InternalCssExtDsl.g:1753:1: ( '{' )
            // InternalCssExtDsl.g:1754:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // InternalCssExtDsl.g:1767:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5 ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1771:1: ( rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5 )
            // InternalCssExtDsl.g:1772:2: rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__PackageDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:1779:1: rule__PackageDefinition__Group__4__Impl : ( ( rule__PackageDefinition__Alternatives_4 )* ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1783:1: ( ( ( rule__PackageDefinition__Alternatives_4 )* ) )
            // InternalCssExtDsl.g:1784:1: ( ( rule__PackageDefinition__Alternatives_4 )* )
            {
            // InternalCssExtDsl.g:1784:1: ( ( rule__PackageDefinition__Alternatives_4 )* )
            // InternalCssExtDsl.g:1785:1: ( rule__PackageDefinition__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_4()); 
            }
            // InternalCssExtDsl.g:1786:1: ( rule__PackageDefinition__Alternatives_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_JDOC||LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCssExtDsl.g:1786:2: rule__PackageDefinition__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PackageDefinition__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__5"
    // InternalCssExtDsl.g:1796:1: rule__PackageDefinition__Group__5 : rule__PackageDefinition__Group__5__Impl ;
    public final void rule__PackageDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1800:1: ( rule__PackageDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:1801:2: rule__PackageDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__5"


    // $ANTLR start "rule__PackageDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:1807:1: rule__PackageDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1811:1: ( ( '}' ) )
            // InternalCssExtDsl.g:1812:1: ( '}' )
            {
            // InternalCssExtDsl.g:1812:1: ( '}' )
            // InternalCssExtDsl.g:1813:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group__5__Impl"


    // $ANTLR start "rule__PackageDefinition__Group_0__0"
    // InternalCssExtDsl.g:1838:1: rule__PackageDefinition__Group_0__0 : rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1 ;
    public final void rule__PackageDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1842:1: ( rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1 )
            // InternalCssExtDsl.g:1843:2: rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__PackageDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group_0__0"


    // $ANTLR start "rule__PackageDefinition__Group_0__0__Impl"
    // InternalCssExtDsl.g:1850:1: rule__PackageDefinition__Group_0__0__Impl : ( ( rule__PackageDefinition__DokuAssignment_0_0 ) ) ;
    public final void rule__PackageDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1854:1: ( ( ( rule__PackageDefinition__DokuAssignment_0_0 ) ) )
            // InternalCssExtDsl.g:1855:1: ( ( rule__PackageDefinition__DokuAssignment_0_0 ) )
            {
            // InternalCssExtDsl.g:1855:1: ( ( rule__PackageDefinition__DokuAssignment_0_0 ) )
            // InternalCssExtDsl.g:1856:1: ( rule__PackageDefinition__DokuAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getDokuAssignment_0_0()); 
            }
            // InternalCssExtDsl.g:1857:1: ( rule__PackageDefinition__DokuAssignment_0_0 )
            // InternalCssExtDsl.g:1857:2: rule__PackageDefinition__DokuAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__DokuAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getDokuAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group_0__1"
    // InternalCssExtDsl.g:1867:1: rule__PackageDefinition__Group_0__1 : rule__PackageDefinition__Group_0__1__Impl ;
    public final void rule__PackageDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1871:1: ( rule__PackageDefinition__Group_0__1__Impl )
            // InternalCssExtDsl.g:1872:2: rule__PackageDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group_0__1"


    // $ANTLR start "rule__PackageDefinition__Group_0__1__Impl"
    // InternalCssExtDsl.g:1878:1: rule__PackageDefinition__Group_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__PackageDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1882:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:1883:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:1883:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:1884:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1()); 
            }
            // InternalCssExtDsl.g:1885:1: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCssExtDsl.g:1885:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__0"
    // InternalCssExtDsl.g:1899:1: rule__CSSType__Group_0__0 : rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 ;
    public final void rule__CSSType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1903:1: ( rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 )
            // InternalCssExtDsl.g:1904:2: rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__0"


    // $ANTLR start "rule__CSSType__Group_0__0__Impl"
    // InternalCssExtDsl.g:1911:1: rule__CSSType__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1915:1: ( ( () ) )
            // InternalCssExtDsl.g:1916:1: ( () )
            {
            // InternalCssExtDsl.g:1916:1: ( () )
            // InternalCssExtDsl.g:1917:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }
            // InternalCssExtDsl.g:1918:1: ()
            // InternalCssExtDsl.g:1920:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0__1"
    // InternalCssExtDsl.g:1930:1: rule__CSSType__Group_0__1 : rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 ;
    public final void rule__CSSType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1934:1: ( rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 )
            // InternalCssExtDsl.g:1935:2: rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__1"


    // $ANTLR start "rule__CSSType__Group_0__1__Impl"
    // InternalCssExtDsl.g:1942:1: rule__CSSType__Group_0__1__Impl : ( ( rule__CSSType__Group_0_1__0 )? ) ;
    public final void rule__CSSType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1946:1: ( ( ( rule__CSSType__Group_0_1__0 )? ) )
            // InternalCssExtDsl.g:1947:1: ( ( rule__CSSType__Group_0_1__0 )? )
            {
            // InternalCssExtDsl.g:1947:1: ( ( rule__CSSType__Group_0_1__0 )? )
            // InternalCssExtDsl.g:1948:1: ( rule__CSSType__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_0_1()); 
            }
            // InternalCssExtDsl.g:1949:1: ( rule__CSSType__Group_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_JDOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCssExtDsl.g:1949:2: rule__CSSType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__2"
    // InternalCssExtDsl.g:1959:1: rule__CSSType__Group_0__2 : rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 ;
    public final void rule__CSSType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1963:1: ( rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 )
            // InternalCssExtDsl.g:1964:2: rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3
            {
            pushFollow(FOLLOW_15);
            rule__CSSType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__2"


    // $ANTLR start "rule__CSSType__Group_0__2__Impl"
    // InternalCssExtDsl.g:1971:1: rule__CSSType__Group_0__2__Impl : ( ( rule__CSSType__TypeAssignment_0_2 ) ) ;
    public final void rule__CSSType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1975:1: ( ( ( rule__CSSType__TypeAssignment_0_2 ) ) )
            // InternalCssExtDsl.g:1976:1: ( ( rule__CSSType__TypeAssignment_0_2 ) )
            {
            // InternalCssExtDsl.g:1976:1: ( ( rule__CSSType__TypeAssignment_0_2 ) )
            // InternalCssExtDsl.g:1977:1: ( rule__CSSType__TypeAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_2()); 
            }
            // InternalCssExtDsl.g:1978:1: ( rule__CSSType__TypeAssignment_0_2 )
            // InternalCssExtDsl.g:1978:2: rule__CSSType__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__2__Impl"


    // $ANTLR start "rule__CSSType__Group_0__3"
    // InternalCssExtDsl.g:1988:1: rule__CSSType__Group_0__3 : rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 ;
    public final void rule__CSSType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:1992:1: ( rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 )
            // InternalCssExtDsl.g:1993:2: rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__3"


    // $ANTLR start "rule__CSSType__Group_0__3__Impl"
    // InternalCssExtDsl.g:2000:1: rule__CSSType__Group_0__3__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2004:1: ( ( '(' ) )
            // InternalCssExtDsl.g:2005:1: ( '(' )
            {
            // InternalCssExtDsl.g:2005:1: ( '(' )
            // InternalCssExtDsl.g:2006:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__3__Impl"


    // $ANTLR start "rule__CSSType__Group_0__4"
    // InternalCssExtDsl.g:2019:1: rule__CSSType__Group_0__4 : rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 ;
    public final void rule__CSSType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2023:1: ( rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 )
            // InternalCssExtDsl.g:2024:2: rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__4"


    // $ANTLR start "rule__CSSType__Group_0__4__Impl"
    // InternalCssExtDsl.g:2031:1: rule__CSSType__Group_0__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2035:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2036:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2036:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2037:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
            }
            // InternalCssExtDsl.g:2038:1: ( RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCssExtDsl.g:2038:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__5"
    // InternalCssExtDsl.g:2048:1: rule__CSSType__Group_0__5 : rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 ;
    public final void rule__CSSType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2052:1: ( rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 )
            // InternalCssExtDsl.g:2053:2: rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__5"


    // $ANTLR start "rule__CSSType__Group_0__5__Impl"
    // InternalCssExtDsl.g:2060:1: rule__CSSType__Group_0__5__Impl : ( ( rule__CSSType__FromAssignment_0_5 ) ) ;
    public final void rule__CSSType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2064:1: ( ( ( rule__CSSType__FromAssignment_0_5 ) ) )
            // InternalCssExtDsl.g:2065:1: ( ( rule__CSSType__FromAssignment_0_5 ) )
            {
            // InternalCssExtDsl.g:2065:1: ( ( rule__CSSType__FromAssignment_0_5 ) )
            // InternalCssExtDsl.g:2066:1: ( rule__CSSType__FromAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_0_5()); 
            }
            // InternalCssExtDsl.g:2067:1: ( rule__CSSType__FromAssignment_0_5 )
            // InternalCssExtDsl.g:2067:2: rule__CSSType__FromAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__FromAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__5__Impl"


    // $ANTLR start "rule__CSSType__Group_0__6"
    // InternalCssExtDsl.g:2077:1: rule__CSSType__Group_0__6 : rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 ;
    public final void rule__CSSType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2081:1: ( rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 )
            // InternalCssExtDsl.g:2082:2: rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__6"


    // $ANTLR start "rule__CSSType__Group_0__6__Impl"
    // InternalCssExtDsl.g:2089:1: rule__CSSType__Group_0__6__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2093:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2094:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2094:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2095:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
            }
            // InternalCssExtDsl.g:2096:1: ( RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCssExtDsl.g:2096:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__6__Impl"


    // $ANTLR start "rule__CSSType__Group_0__7"
    // InternalCssExtDsl.g:2106:1: rule__CSSType__Group_0__7 : rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 ;
    public final void rule__CSSType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2110:1: ( rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 )
            // InternalCssExtDsl.g:2111:2: rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__7"


    // $ANTLR start "rule__CSSType__Group_0__7__Impl"
    // InternalCssExtDsl.g:2118:1: rule__CSSType__Group_0__7__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2122:1: ( ( '->' ) )
            // InternalCssExtDsl.g:2123:1: ( '->' )
            {
            // InternalCssExtDsl.g:2123:1: ( '->' )
            // InternalCssExtDsl.g:2124:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__7__Impl"


    // $ANTLR start "rule__CSSType__Group_0__8"
    // InternalCssExtDsl.g:2137:1: rule__CSSType__Group_0__8 : rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 ;
    public final void rule__CSSType__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2141:1: ( rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 )
            // InternalCssExtDsl.g:2142:2: rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__8"


    // $ANTLR start "rule__CSSType__Group_0__8__Impl"
    // InternalCssExtDsl.g:2149:1: rule__CSSType__Group_0__8__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2153:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2154:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2154:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2155:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
            }
            // InternalCssExtDsl.g:2156:1: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCssExtDsl.g:2156:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__8__Impl"


    // $ANTLR start "rule__CSSType__Group_0__9"
    // InternalCssExtDsl.g:2166:1: rule__CSSType__Group_0__9 : rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 ;
    public final void rule__CSSType__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2170:1: ( rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 )
            // InternalCssExtDsl.g:2171:2: rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__9"


    // $ANTLR start "rule__CSSType__Group_0__9__Impl"
    // InternalCssExtDsl.g:2178:1: rule__CSSType__Group_0__9__Impl : ( ( rule__CSSType__ToAssignment_0_9 ) ) ;
    public final void rule__CSSType__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2182:1: ( ( ( rule__CSSType__ToAssignment_0_9 ) ) )
            // InternalCssExtDsl.g:2183:1: ( ( rule__CSSType__ToAssignment_0_9 ) )
            {
            // InternalCssExtDsl.g:2183:1: ( ( rule__CSSType__ToAssignment_0_9 ) )
            // InternalCssExtDsl.g:2184:1: ( rule__CSSType__ToAssignment_0_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_0_9()); 
            }
            // InternalCssExtDsl.g:2185:1: ( rule__CSSType__ToAssignment_0_9 )
            // InternalCssExtDsl.g:2185:2: rule__CSSType__ToAssignment_0_9
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__ToAssignment_0_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_0_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__9__Impl"


    // $ANTLR start "rule__CSSType__Group_0__10"
    // InternalCssExtDsl.g:2195:1: rule__CSSType__Group_0__10 : rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11 ;
    public final void rule__CSSType__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2199:1: ( rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11 )
            // InternalCssExtDsl.g:2200:2: rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__10"


    // $ANTLR start "rule__CSSType__Group_0__10__Impl"
    // InternalCssExtDsl.g:2207:1: rule__CSSType__Group_0__10__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2211:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2212:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2212:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2213:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
            }
            // InternalCssExtDsl.g:2214:1: ( RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCssExtDsl.g:2214:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__10__Impl"


    // $ANTLR start "rule__CSSType__Group_0__11"
    // InternalCssExtDsl.g:2224:1: rule__CSSType__Group_0__11 : rule__CSSType__Group_0__11__Impl ;
    public final void rule__CSSType__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2228:1: ( rule__CSSType__Group_0__11__Impl )
            // InternalCssExtDsl.g:2229:2: rule__CSSType__Group_0__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__11"


    // $ANTLR start "rule__CSSType__Group_0__11__Impl"
    // InternalCssExtDsl.g:2235:1: rule__CSSType__Group_0__11__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2239:1: ( ( ')' ) )
            // InternalCssExtDsl.g:2240:1: ( ')' )
            {
            // InternalCssExtDsl.g:2240:1: ( ')' )
            // InternalCssExtDsl.g:2241:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__11__Impl"


    // $ANTLR start "rule__CSSType__Group_0_1__0"
    // InternalCssExtDsl.g:2278:1: rule__CSSType__Group_0_1__0 : rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1 ;
    public final void rule__CSSType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2282:1: ( rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1 )
            // InternalCssExtDsl.g:2283:2: rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0_1__0"


    // $ANTLR start "rule__CSSType__Group_0_1__0__Impl"
    // InternalCssExtDsl.g:2290:1: rule__CSSType__Group_0_1__0__Impl : ( ( rule__CSSType__DokuAssignment_0_1_0 ) ) ;
    public final void rule__CSSType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2294:1: ( ( ( rule__CSSType__DokuAssignment_0_1_0 ) ) )
            // InternalCssExtDsl.g:2295:1: ( ( rule__CSSType__DokuAssignment_0_1_0 ) )
            {
            // InternalCssExtDsl.g:2295:1: ( ( rule__CSSType__DokuAssignment_0_1_0 ) )
            // InternalCssExtDsl.g:2296:1: ( rule__CSSType__DokuAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_0_1_0()); 
            }
            // InternalCssExtDsl.g:2297:1: ( rule__CSSType__DokuAssignment_0_1_0 )
            // InternalCssExtDsl.g:2297:2: rule__CSSType__DokuAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0_1__1"
    // InternalCssExtDsl.g:2307:1: rule__CSSType__Group_0_1__1 : rule__CSSType__Group_0_1__1__Impl ;
    public final void rule__CSSType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2311:1: ( rule__CSSType__Group_0_1__1__Impl )
            // InternalCssExtDsl.g:2312:2: rule__CSSType__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0_1__1"


    // $ANTLR start "rule__CSSType__Group_0_1__1__Impl"
    // InternalCssExtDsl.g:2318:1: rule__CSSType__Group_0_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2322:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2323:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2323:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2324:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalCssExtDsl.g:2325:1: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCssExtDsl.g:2325:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__0"
    // InternalCssExtDsl.g:2339:1: rule__CSSType__Group_1__0 : rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 ;
    public final void rule__CSSType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2343:1: ( rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 )
            // InternalCssExtDsl.g:2344:2: rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__0"


    // $ANTLR start "rule__CSSType__Group_1__0__Impl"
    // InternalCssExtDsl.g:2351:1: rule__CSSType__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2355:1: ( ( () ) )
            // InternalCssExtDsl.g:2356:1: ( () )
            {
            // InternalCssExtDsl.g:2356:1: ( () )
            // InternalCssExtDsl.g:2357:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }
            // InternalCssExtDsl.g:2358:1: ()
            // InternalCssExtDsl.g:2360:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1__1"
    // InternalCssExtDsl.g:2370:1: rule__CSSType__Group_1__1 : rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 ;
    public final void rule__CSSType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2374:1: ( rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 )
            // InternalCssExtDsl.g:2375:2: rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__1"


    // $ANTLR start "rule__CSSType__Group_1__1__Impl"
    // InternalCssExtDsl.g:2382:1: rule__CSSType__Group_1__1__Impl : ( ( rule__CSSType__Group_1_1__0 )? ) ;
    public final void rule__CSSType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2386:1: ( ( ( rule__CSSType__Group_1_1__0 )? ) )
            // InternalCssExtDsl.g:2387:1: ( ( rule__CSSType__Group_1_1__0 )? )
            {
            // InternalCssExtDsl.g:2387:1: ( ( rule__CSSType__Group_1_1__0 )? )
            // InternalCssExtDsl.g:2388:1: ( rule__CSSType__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:2389:1: ( rule__CSSType__Group_1_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_JDOC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCssExtDsl.g:2389:2: rule__CSSType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__2"
    // InternalCssExtDsl.g:2399:1: rule__CSSType__Group_1__2 : rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 ;
    public final void rule__CSSType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2403:1: ( rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 )
            // InternalCssExtDsl.g:2404:2: rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__CSSType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__2"


    // $ANTLR start "rule__CSSType__Group_1__2__Impl"
    // InternalCssExtDsl.g:2411:1: rule__CSSType__Group_1__2__Impl : ( ( rule__CSSType__TypeAssignment_1_2 ) ) ;
    public final void rule__CSSType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2415:1: ( ( ( rule__CSSType__TypeAssignment_1_2 ) ) )
            // InternalCssExtDsl.g:2416:1: ( ( rule__CSSType__TypeAssignment_1_2 ) )
            {
            // InternalCssExtDsl.g:2416:1: ( ( rule__CSSType__TypeAssignment_1_2 ) )
            // InternalCssExtDsl.g:2417:1: ( rule__CSSType__TypeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_2()); 
            }
            // InternalCssExtDsl.g:2418:1: ( rule__CSSType__TypeAssignment_1_2 )
            // InternalCssExtDsl.g:2418:2: rule__CSSType__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__2__Impl"


    // $ANTLR start "rule__CSSType__Group_1__3"
    // InternalCssExtDsl.g:2428:1: rule__CSSType__Group_1__3 : rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 ;
    public final void rule__CSSType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2432:1: ( rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 )
            // InternalCssExtDsl.g:2433:2: rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__3"


    // $ANTLR start "rule__CSSType__Group_1__3__Impl"
    // InternalCssExtDsl.g:2440:1: rule__CSSType__Group_1__3__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2444:1: ( ( '(' ) )
            // InternalCssExtDsl.g:2445:1: ( '(' )
            {
            // InternalCssExtDsl.g:2445:1: ( '(' )
            // InternalCssExtDsl.g:2446:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__3__Impl"


    // $ANTLR start "rule__CSSType__Group_1__4"
    // InternalCssExtDsl.g:2459:1: rule__CSSType__Group_1__4 : rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 ;
    public final void rule__CSSType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2463:1: ( rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 )
            // InternalCssExtDsl.g:2464:2: rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__4"


    // $ANTLR start "rule__CSSType__Group_1__4__Impl"
    // InternalCssExtDsl.g:2471:1: rule__CSSType__Group_1__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2475:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2476:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2476:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2477:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
            }
            // InternalCssExtDsl.g:2478:1: ( RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCssExtDsl.g:2478:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__4__Impl"


    // $ANTLR start "rule__CSSType__Group_1__5"
    // InternalCssExtDsl.g:2488:1: rule__CSSType__Group_1__5 : rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 ;
    public final void rule__CSSType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2492:1: ( rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 )
            // InternalCssExtDsl.g:2493:2: rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__5"


    // $ANTLR start "rule__CSSType__Group_1__5__Impl"
    // InternalCssExtDsl.g:2500:1: rule__CSSType__Group_1__5__Impl : ( ( rule__CSSType__FromAssignment_1_5 ) ) ;
    public final void rule__CSSType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2504:1: ( ( ( rule__CSSType__FromAssignment_1_5 ) ) )
            // InternalCssExtDsl.g:2505:1: ( ( rule__CSSType__FromAssignment_1_5 ) )
            {
            // InternalCssExtDsl.g:2505:1: ( ( rule__CSSType__FromAssignment_1_5 ) )
            // InternalCssExtDsl.g:2506:1: ( rule__CSSType__FromAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_1_5()); 
            }
            // InternalCssExtDsl.g:2507:1: ( rule__CSSType__FromAssignment_1_5 )
            // InternalCssExtDsl.g:2507:2: rule__CSSType__FromAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__FromAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__5__Impl"


    // $ANTLR start "rule__CSSType__Group_1__6"
    // InternalCssExtDsl.g:2517:1: rule__CSSType__Group_1__6 : rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 ;
    public final void rule__CSSType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2521:1: ( rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 )
            // InternalCssExtDsl.g:2522:2: rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__6"


    // $ANTLR start "rule__CSSType__Group_1__6__Impl"
    // InternalCssExtDsl.g:2529:1: rule__CSSType__Group_1__6__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2533:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2534:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2534:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2535:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
            }
            // InternalCssExtDsl.g:2536:1: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCssExtDsl.g:2536:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__6__Impl"


    // $ANTLR start "rule__CSSType__Group_1__7"
    // InternalCssExtDsl.g:2546:1: rule__CSSType__Group_1__7 : rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 ;
    public final void rule__CSSType__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2550:1: ( rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 )
            // InternalCssExtDsl.g:2551:2: rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__7"


    // $ANTLR start "rule__CSSType__Group_1__7__Impl"
    // InternalCssExtDsl.g:2558:1: rule__CSSType__Group_1__7__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2562:1: ( ( '->' ) )
            // InternalCssExtDsl.g:2563:1: ( '->' )
            {
            // InternalCssExtDsl.g:2563:1: ( '->' )
            // InternalCssExtDsl.g:2564:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__7__Impl"


    // $ANTLR start "rule__CSSType__Group_1__8"
    // InternalCssExtDsl.g:2577:1: rule__CSSType__Group_1__8 : rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 ;
    public final void rule__CSSType__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2581:1: ( rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 )
            // InternalCssExtDsl.g:2582:2: rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__8"


    // $ANTLR start "rule__CSSType__Group_1__8__Impl"
    // InternalCssExtDsl.g:2589:1: rule__CSSType__Group_1__8__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2593:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2594:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2594:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2595:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
            }
            // InternalCssExtDsl.g:2596:1: ( RULE_WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_WS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCssExtDsl.g:2596:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__8__Impl"


    // $ANTLR start "rule__CSSType__Group_1__9"
    // InternalCssExtDsl.g:2606:1: rule__CSSType__Group_1__9 : rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 ;
    public final void rule__CSSType__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2610:1: ( rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 )
            // InternalCssExtDsl.g:2611:2: rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__9"


    // $ANTLR start "rule__CSSType__Group_1__9__Impl"
    // InternalCssExtDsl.g:2618:1: rule__CSSType__Group_1__9__Impl : ( ( rule__CSSType__ToAssignment_1_9 ) ) ;
    public final void rule__CSSType__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2622:1: ( ( ( rule__CSSType__ToAssignment_1_9 ) ) )
            // InternalCssExtDsl.g:2623:1: ( ( rule__CSSType__ToAssignment_1_9 ) )
            {
            // InternalCssExtDsl.g:2623:1: ( ( rule__CSSType__ToAssignment_1_9 ) )
            // InternalCssExtDsl.g:2624:1: ( rule__CSSType__ToAssignment_1_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_1_9()); 
            }
            // InternalCssExtDsl.g:2625:1: ( rule__CSSType__ToAssignment_1_9 )
            // InternalCssExtDsl.g:2625:2: rule__CSSType__ToAssignment_1_9
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__ToAssignment_1_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_1_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__9__Impl"


    // $ANTLR start "rule__CSSType__Group_1__10"
    // InternalCssExtDsl.g:2635:1: rule__CSSType__Group_1__10 : rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11 ;
    public final void rule__CSSType__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2639:1: ( rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11 )
            // InternalCssExtDsl.g:2640:2: rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_1__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__10"


    // $ANTLR start "rule__CSSType__Group_1__10__Impl"
    // InternalCssExtDsl.g:2647:1: rule__CSSType__Group_1__10__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2651:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2652:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2652:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2653:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
            }
            // InternalCssExtDsl.g:2654:1: ( RULE_WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCssExtDsl.g:2654:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__10__Impl"


    // $ANTLR start "rule__CSSType__Group_1__11"
    // InternalCssExtDsl.g:2664:1: rule__CSSType__Group_1__11 : rule__CSSType__Group_1__11__Impl ;
    public final void rule__CSSType__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2668:1: ( rule__CSSType__Group_1__11__Impl )
            // InternalCssExtDsl.g:2669:2: rule__CSSType__Group_1__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__11"


    // $ANTLR start "rule__CSSType__Group_1__11__Impl"
    // InternalCssExtDsl.g:2675:1: rule__CSSType__Group_1__11__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2679:1: ( ( ')' ) )
            // InternalCssExtDsl.g:2680:1: ( ')' )
            {
            // InternalCssExtDsl.g:2680:1: ( ')' )
            // InternalCssExtDsl.g:2681:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__11__Impl"


    // $ANTLR start "rule__CSSType__Group_1_1__0"
    // InternalCssExtDsl.g:2718:1: rule__CSSType__Group_1_1__0 : rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1 ;
    public final void rule__CSSType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2722:1: ( rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1 )
            // InternalCssExtDsl.g:2723:2: rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1_1__0"


    // $ANTLR start "rule__CSSType__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:2730:1: rule__CSSType__Group_1_1__0__Impl : ( ( rule__CSSType__DokuAssignment_1_1_0 ) ) ;
    public final void rule__CSSType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2734:1: ( ( ( rule__CSSType__DokuAssignment_1_1_0 ) ) )
            // InternalCssExtDsl.g:2735:1: ( ( rule__CSSType__DokuAssignment_1_1_0 ) )
            {
            // InternalCssExtDsl.g:2735:1: ( ( rule__CSSType__DokuAssignment_1_1_0 ) )
            // InternalCssExtDsl.g:2736:1: ( rule__CSSType__DokuAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_1_1_0()); 
            }
            // InternalCssExtDsl.g:2737:1: ( rule__CSSType__DokuAssignment_1_1_0 )
            // InternalCssExtDsl.g:2737:2: rule__CSSType__DokuAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1_1__1"
    // InternalCssExtDsl.g:2747:1: rule__CSSType__Group_1_1__1 : rule__CSSType__Group_1_1__1__Impl ;
    public final void rule__CSSType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2751:1: ( rule__CSSType__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:2752:2: rule__CSSType__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1_1__1"


    // $ANTLR start "rule__CSSType__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:2758:1: rule__CSSType__Group_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2762:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2763:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2763:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2764:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
            }
            // InternalCssExtDsl.g:2765:1: ( RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCssExtDsl.g:2765:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2__0"
    // InternalCssExtDsl.g:2779:1: rule__CSSType__Group_2__0 : rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 ;
    public final void rule__CSSType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2783:1: ( rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 )
            // InternalCssExtDsl.g:2784:2: rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__CSSType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2__0"


    // $ANTLR start "rule__CSSType__Group_2__0__Impl"
    // InternalCssExtDsl.g:2791:1: rule__CSSType__Group_2__0__Impl : ( ( rule__CSSType__Group_2_0__0 )? ) ;
    public final void rule__CSSType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2795:1: ( ( ( rule__CSSType__Group_2_0__0 )? ) )
            // InternalCssExtDsl.g:2796:1: ( ( rule__CSSType__Group_2_0__0 )? )
            {
            // InternalCssExtDsl.g:2796:1: ( ( rule__CSSType__Group_2_0__0 )? )
            // InternalCssExtDsl.g:2797:1: ( rule__CSSType__Group_2_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_2_0()); 
            }
            // InternalCssExtDsl.g:2798:1: ( rule__CSSType__Group_2_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_JDOC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCssExtDsl.g:2798:2: rule__CSSType__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2__1"
    // InternalCssExtDsl.g:2808:1: rule__CSSType__Group_2__1 : rule__CSSType__Group_2__1__Impl ;
    public final void rule__CSSType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2812:1: ( rule__CSSType__Group_2__1__Impl )
            // InternalCssExtDsl.g:2813:2: rule__CSSType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2__1"


    // $ANTLR start "rule__CSSType__Group_2__1__Impl"
    // InternalCssExtDsl.g:2819:1: rule__CSSType__Group_2__1__Impl : ( ( rule__CSSType__Alternatives_2_1 ) ) ;
    public final void rule__CSSType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2823:1: ( ( ( rule__CSSType__Alternatives_2_1 ) ) )
            // InternalCssExtDsl.g:2824:1: ( ( rule__CSSType__Alternatives_2_1 ) )
            {
            // InternalCssExtDsl.g:2824:1: ( ( rule__CSSType__Alternatives_2_1 ) )
            // InternalCssExtDsl.g:2825:1: ( rule__CSSType__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives_2_1()); 
            }
            // InternalCssExtDsl.g:2826:1: ( rule__CSSType__Alternatives_2_1 )
            // InternalCssExtDsl.g:2826:2: rule__CSSType__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2_0__0"
    // InternalCssExtDsl.g:2840:1: rule__CSSType__Group_2_0__0 : rule__CSSType__Group_2_0__0__Impl rule__CSSType__Group_2_0__1 ;
    public final void rule__CSSType__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2844:1: ( rule__CSSType__Group_2_0__0__Impl rule__CSSType__Group_2_0__1 )
            // InternalCssExtDsl.g:2845:2: rule__CSSType__Group_2_0__0__Impl rule__CSSType__Group_2_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_0__0"


    // $ANTLR start "rule__CSSType__Group_2_0__0__Impl"
    // InternalCssExtDsl.g:2852:1: rule__CSSType__Group_2_0__0__Impl : ( ( rule__CSSType__DokuAssignment_2_0_0 ) ) ;
    public final void rule__CSSType__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2856:1: ( ( ( rule__CSSType__DokuAssignment_2_0_0 ) ) )
            // InternalCssExtDsl.g:2857:1: ( ( rule__CSSType__DokuAssignment_2_0_0 ) )
            {
            // InternalCssExtDsl.g:2857:1: ( ( rule__CSSType__DokuAssignment_2_0_0 ) )
            // InternalCssExtDsl.g:2858:1: ( rule__CSSType__DokuAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_2_0_0()); 
            }
            // InternalCssExtDsl.g:2859:1: ( rule__CSSType__DokuAssignment_2_0_0 )
            // InternalCssExtDsl.g:2859:2: rule__CSSType__DokuAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_0__1"
    // InternalCssExtDsl.g:2869:1: rule__CSSType__Group_2_0__1 : rule__CSSType__Group_2_0__1__Impl ;
    public final void rule__CSSType__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2873:1: ( rule__CSSType__Group_2_0__1__Impl )
            // InternalCssExtDsl.g:2874:2: rule__CSSType__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_0__1"


    // $ANTLR start "rule__CSSType__Group_2_0__1__Impl"
    // InternalCssExtDsl.g:2880:1: rule__CSSType__Group_2_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2884:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2885:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2885:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2886:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_0_1()); 
            }
            // InternalCssExtDsl.g:2887:1: ( RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCssExtDsl.g:2887:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_0__0"
    // InternalCssExtDsl.g:2901:1: rule__CSSType__Group_2_1_0__0 : rule__CSSType__Group_2_1_0__0__Impl rule__CSSType__Group_2_1_0__1 ;
    public final void rule__CSSType__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2905:1: ( rule__CSSType__Group_2_1_0__0__Impl rule__CSSType__Group_2_1_0__1 )
            // InternalCssExtDsl.g:2906:2: rule__CSSType__Group_2_1_0__0__Impl rule__CSSType__Group_2_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_2_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_0__0"


    // $ANTLR start "rule__CSSType__Group_2_1_0__0__Impl"
    // InternalCssExtDsl.g:2913:1: rule__CSSType__Group_2_1_0__0__Impl : ( ( rule__CSSType__TypeAssignment_2_1_0_0 ) ) ;
    public final void rule__CSSType__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2917:1: ( ( ( rule__CSSType__TypeAssignment_2_1_0_0 ) ) )
            // InternalCssExtDsl.g:2918:1: ( ( rule__CSSType__TypeAssignment_2_1_0_0 ) )
            {
            // InternalCssExtDsl.g:2918:1: ( ( rule__CSSType__TypeAssignment_2_1_0_0 ) )
            // InternalCssExtDsl.g:2919:1: ( rule__CSSType__TypeAssignment_2_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_0_0()); 
            }
            // InternalCssExtDsl.g:2920:1: ( rule__CSSType__TypeAssignment_2_1_0_0 )
            // InternalCssExtDsl.g:2920:2: rule__CSSType__TypeAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_2_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_0__1"
    // InternalCssExtDsl.g:2930:1: rule__CSSType__Group_2_1_0__1 : rule__CSSType__Group_2_1_0__1__Impl ;
    public final void rule__CSSType__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2934:1: ( rule__CSSType__Group_2_1_0__1__Impl )
            // InternalCssExtDsl.g:2935:2: rule__CSSType__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_0__1"


    // $ANTLR start "rule__CSSType__Group_2_1_0__1__Impl"
    // InternalCssExtDsl.g:2941:1: rule__CSSType__Group_2_1_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2945:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2946:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2946:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2947:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_0_1()); 
            }
            // InternalCssExtDsl.g:2948:1: ( RULE_WS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCssExtDsl.g:2948:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_1__0"
    // InternalCssExtDsl.g:2962:1: rule__CSSType__Group_2_1_1__0 : rule__CSSType__Group_2_1_1__0__Impl rule__CSSType__Group_2_1_1__1 ;
    public final void rule__CSSType__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2966:1: ( rule__CSSType__Group_2_1_1__0__Impl rule__CSSType__Group_2_1_1__1 )
            // InternalCssExtDsl.g:2967:2: rule__CSSType__Group_2_1_1__0__Impl rule__CSSType__Group_2_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_1__0"


    // $ANTLR start "rule__CSSType__Group_2_1_1__0__Impl"
    // InternalCssExtDsl.g:2974:1: rule__CSSType__Group_2_1_1__0__Impl : ( ( rule__CSSType__TypeAssignment_2_1_1_0 ) ) ;
    public final void rule__CSSType__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2978:1: ( ( ( rule__CSSType__TypeAssignment_2_1_1_0 ) ) )
            // InternalCssExtDsl.g:2979:1: ( ( rule__CSSType__TypeAssignment_2_1_1_0 ) )
            {
            // InternalCssExtDsl.g:2979:1: ( ( rule__CSSType__TypeAssignment_2_1_1_0 ) )
            // InternalCssExtDsl.g:2980:1: ( rule__CSSType__TypeAssignment_2_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_1_0()); 
            }
            // InternalCssExtDsl.g:2981:1: ( rule__CSSType__TypeAssignment_2_1_1_0 )
            // InternalCssExtDsl.g:2981:2: rule__CSSType__TypeAssignment_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_2_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_1__1"
    // InternalCssExtDsl.g:2991:1: rule__CSSType__Group_2_1_1__1 : rule__CSSType__Group_2_1_1__1__Impl ;
    public final void rule__CSSType__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:2995:1: ( rule__CSSType__Group_2_1_1__1__Impl )
            // InternalCssExtDsl.g:2996:2: rule__CSSType__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_1__1"


    // $ANTLR start "rule__CSSType__Group_2_1_1__1__Impl"
    // InternalCssExtDsl.g:3002:1: rule__CSSType__Group_2_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3006:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:3007:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:3007:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:3008:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1_1()); 
            }
            // InternalCssExtDsl.g:3009:1: ( RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCssExtDsl.g:3009:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_2__0"
    // InternalCssExtDsl.g:3023:1: rule__CSSType__Group_2_1_2__0 : rule__CSSType__Group_2_1_2__0__Impl rule__CSSType__Group_2_1_2__1 ;
    public final void rule__CSSType__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3027:1: ( rule__CSSType__Group_2_1_2__0__Impl rule__CSSType__Group_2_1_2__1 )
            // InternalCssExtDsl.g:3028:2: rule__CSSType__Group_2_1_2__0__Impl rule__CSSType__Group_2_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_2_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_2__0"


    // $ANTLR start "rule__CSSType__Group_2_1_2__0__Impl"
    // InternalCssExtDsl.g:3035:1: rule__CSSType__Group_2_1_2__0__Impl : ( ( rule__CSSType__TypeAssignment_2_1_2_0 ) ) ;
    public final void rule__CSSType__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3039:1: ( ( ( rule__CSSType__TypeAssignment_2_1_2_0 ) ) )
            // InternalCssExtDsl.g:3040:1: ( ( rule__CSSType__TypeAssignment_2_1_2_0 ) )
            {
            // InternalCssExtDsl.g:3040:1: ( ( rule__CSSType__TypeAssignment_2_1_2_0 ) )
            // InternalCssExtDsl.g:3041:1: ( rule__CSSType__TypeAssignment_2_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_2_0()); 
            }
            // InternalCssExtDsl.g:3042:1: ( rule__CSSType__TypeAssignment_2_1_2_0 )
            // InternalCssExtDsl.g:3042:2: rule__CSSType__TypeAssignment_2_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_2_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_2__1"
    // InternalCssExtDsl.g:3052:1: rule__CSSType__Group_2_1_2__1 : rule__CSSType__Group_2_1_2__1__Impl ;
    public final void rule__CSSType__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3056:1: ( rule__CSSType__Group_2_1_2__1__Impl )
            // InternalCssExtDsl.g:3057:2: rule__CSSType__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_2__1"


    // $ANTLR start "rule__CSSType__Group_2_1_2__1__Impl"
    // InternalCssExtDsl.g:3063:1: rule__CSSType__Group_2_1_2__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3067:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:3068:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:3068:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:3069:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_2_1()); 
            }
            // InternalCssExtDsl.g:3070:1: ( RULE_WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCssExtDsl.g:3070:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_3__0"
    // InternalCssExtDsl.g:3084:1: rule__CSSType__Group_2_1_3__0 : rule__CSSType__Group_2_1_3__0__Impl rule__CSSType__Group_2_1_3__1 ;
    public final void rule__CSSType__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3088:1: ( rule__CSSType__Group_2_1_3__0__Impl rule__CSSType__Group_2_1_3__1 )
            // InternalCssExtDsl.g:3089:2: rule__CSSType__Group_2_1_3__0__Impl rule__CSSType__Group_2_1_3__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSType__Group_2_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_3__0"


    // $ANTLR start "rule__CSSType__Group_2_1_3__0__Impl"
    // InternalCssExtDsl.g:3096:1: rule__CSSType__Group_2_1_3__0__Impl : ( ( rule__CSSType__TypeAssignment_2_1_3_0 ) ) ;
    public final void rule__CSSType__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3100:1: ( ( ( rule__CSSType__TypeAssignment_2_1_3_0 ) ) )
            // InternalCssExtDsl.g:3101:1: ( ( rule__CSSType__TypeAssignment_2_1_3_0 ) )
            {
            // InternalCssExtDsl.g:3101:1: ( ( rule__CSSType__TypeAssignment_2_1_3_0 ) )
            // InternalCssExtDsl.g:3102:1: ( rule__CSSType__TypeAssignment_2_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_3_0()); 
            }
            // InternalCssExtDsl.g:3103:1: ( rule__CSSType__TypeAssignment_2_1_3_0 )
            // InternalCssExtDsl.g:3103:2: rule__CSSType__TypeAssignment_2_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_2_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1_3__1"
    // InternalCssExtDsl.g:3113:1: rule__CSSType__Group_2_1_3__1 : rule__CSSType__Group_2_1_3__1__Impl ;
    public final void rule__CSSType__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3117:1: ( rule__CSSType__Group_2_1_3__1__Impl )
            // InternalCssExtDsl.g:3118:2: rule__CSSType__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_3__1"


    // $ANTLR start "rule__CSSType__Group_2_1_3__1__Impl"
    // InternalCssExtDsl.g:3124:1: rule__CSSType__Group_2_1_3__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3128:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:3129:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:3129:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:3130:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_3_1()); 
            }
            // InternalCssExtDsl.g:3131:1: ( RULE_WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCssExtDsl.g:3131:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__0"
    // InternalCssExtDsl.g:3145:1: rule__ElementDefinition__Group__0 : rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 ;
    public final void rule__ElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3149:1: ( rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 )
            // InternalCssExtDsl.g:3150:2: rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__0"


    // $ANTLR start "rule__ElementDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3157:1: rule__ElementDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3161:1: ( ( () ) )
            // InternalCssExtDsl.g:3162:1: ( () )
            {
            // InternalCssExtDsl.g:3162:1: ( () )
            // InternalCssExtDsl.g:3163:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3164:1: ()
            // InternalCssExtDsl.g:3166:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__1"
    // InternalCssExtDsl.g:3176:1: rule__ElementDefinition__Group__1 : rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 ;
    public final void rule__ElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3180:1: ( rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 )
            // InternalCssExtDsl.g:3181:2: rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__1"


    // $ANTLR start "rule__ElementDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3188:1: rule__ElementDefinition__Group__1__Impl : ( ( rule__ElementDefinition__DokuAssignment_1 )? ) ;
    public final void rule__ElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3192:1: ( ( ( rule__ElementDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3193:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3193:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3194:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3195:1: ( rule__ElementDefinition__DokuAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCssExtDsl.g:3195:2: rule__ElementDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__2"
    // InternalCssExtDsl.g:3205:1: rule__ElementDefinition__Group__2 : rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 ;
    public final void rule__ElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3209:1: ( rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 )
            // InternalCssExtDsl.g:3210:2: rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__2"


    // $ANTLR start "rule__ElementDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3217:1: rule__ElementDefinition__Group__2__Impl : ( ( rule__ElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3221:1: ( ( ( rule__ElementDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3222:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3222:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3223:1: ( rule__ElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3224:1: ( rule__ElementDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3224:2: rule__ElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__3"
    // InternalCssExtDsl.g:3234:1: rule__ElementDefinition__Group__3 : rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 ;
    public final void rule__ElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3238:1: ( rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 )
            // InternalCssExtDsl.g:3239:2: rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__3"


    // $ANTLR start "rule__ElementDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:3246:1: rule__ElementDefinition__Group__3__Impl : ( ( rule__ElementDefinition__Group_3__0 )? ) ;
    public final void rule__ElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3250:1: ( ( ( rule__ElementDefinition__Group_3__0 )? ) )
            // InternalCssExtDsl.g:3251:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            {
            // InternalCssExtDsl.g:3251:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            // InternalCssExtDsl.g:3252:1: ( rule__ElementDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }
            // InternalCssExtDsl.g:3253:1: ( rule__ElementDefinition__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCssExtDsl.g:3253:2: rule__ElementDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__4"
    // InternalCssExtDsl.g:3263:1: rule__ElementDefinition__Group__4 : rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 ;
    public final void rule__ElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3267:1: ( rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 )
            // InternalCssExtDsl.g:3268:2: rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__4"


    // $ANTLR start "rule__ElementDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:3275:1: rule__ElementDefinition__Group__4__Impl : ( ( rule__ElementDefinition__Group_4__0 )? ) ;
    public final void rule__ElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3279:1: ( ( ( rule__ElementDefinition__Group_4__0 )? ) )
            // InternalCssExtDsl.g:3280:1: ( ( rule__ElementDefinition__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:3280:1: ( ( rule__ElementDefinition__Group_4__0 )? )
            // InternalCssExtDsl.g:3281:1: ( rule__ElementDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:3282:1: ( rule__ElementDefinition__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCssExtDsl.g:3282:2: rule__ElementDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__5"
    // InternalCssExtDsl.g:3292:1: rule__ElementDefinition__Group__5 : rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 ;
    public final void rule__ElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3296:1: ( rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 )
            // InternalCssExtDsl.g:3297:2: rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__5"


    // $ANTLR start "rule__ElementDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:3304:1: rule__ElementDefinition__Group__5__Impl : ( '{' ) ;
    public final void rule__ElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3308:1: ( ( '{' ) )
            // InternalCssExtDsl.g:3309:1: ( '{' )
            {
            // InternalCssExtDsl.g:3309:1: ( '{' )
            // InternalCssExtDsl.g:3310:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__5__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__6"
    // InternalCssExtDsl.g:3323:1: rule__ElementDefinition__Group__6 : rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7 ;
    public final void rule__ElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3327:1: ( rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7 )
            // InternalCssExtDsl.g:3328:2: rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__ElementDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__6"


    // $ANTLR start "rule__ElementDefinition__Group__6__Impl"
    // InternalCssExtDsl.g:3335:1: rule__ElementDefinition__Group__6__Impl : ( ( rule__ElementDefinition__Alternatives_6 )* ) ;
    public final void rule__ElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3339:1: ( ( ( rule__ElementDefinition__Alternatives_6 )* ) )
            // InternalCssExtDsl.g:3340:1: ( ( rule__ElementDefinition__Alternatives_6 )* )
            {
            // InternalCssExtDsl.g:3340:1: ( ( rule__ElementDefinition__Alternatives_6 )* )
            // InternalCssExtDsl.g:3341:1: ( rule__ElementDefinition__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getAlternatives_6()); 
            }
            // InternalCssExtDsl.g:3342:1: ( rule__ElementDefinition__Alternatives_6 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==RULE_JDOC||LA38_0==RULE_PSEUDO||LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCssExtDsl.g:3342:2: rule__ElementDefinition__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ElementDefinition__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__6__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__7"
    // InternalCssExtDsl.g:3352:1: rule__ElementDefinition__Group__7 : rule__ElementDefinition__Group__7__Impl ;
    public final void rule__ElementDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3356:1: ( rule__ElementDefinition__Group__7__Impl )
            // InternalCssExtDsl.g:3357:2: rule__ElementDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__7"


    // $ANTLR start "rule__ElementDefinition__Group__7__Impl"
    // InternalCssExtDsl.g:3363:1: rule__ElementDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__ElementDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3367:1: ( ( '}' ) )
            // InternalCssExtDsl.g:3368:1: ( '}' )
            {
            // InternalCssExtDsl.g:3368:1: ( '}' )
            // InternalCssExtDsl.g:3369:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__7__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__0"
    // InternalCssExtDsl.g:3398:1: rule__ElementDefinition__Group_3__0 : rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 ;
    public final void rule__ElementDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3402:1: ( rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 )
            // InternalCssExtDsl.g:3403:2: rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ElementDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__0"


    // $ANTLR start "rule__ElementDefinition__Group_3__0__Impl"
    // InternalCssExtDsl.g:3410:1: rule__ElementDefinition__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ElementDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3414:1: ( ( 'extends' ) )
            // InternalCssExtDsl.g:3415:1: ( 'extends' )
            {
            // InternalCssExtDsl.g:3415:1: ( 'extends' )
            // InternalCssExtDsl.g:3416:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__1"
    // InternalCssExtDsl.g:3429:1: rule__ElementDefinition__Group_3__1 : rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 ;
    public final void rule__ElementDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3433:1: ( rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 )
            // InternalCssExtDsl.g:3434:2: rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2
            {
            pushFollow(FOLLOW_26);
            rule__ElementDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__1"


    // $ANTLR start "rule__ElementDefinition__Group_3__1__Impl"
    // InternalCssExtDsl.g:3441:1: rule__ElementDefinition__Group_3__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) ;
    public final void rule__ElementDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3445:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) )
            // InternalCssExtDsl.g:3446:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            {
            // InternalCssExtDsl.g:3446:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            // InternalCssExtDsl.g:3447:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }
            // InternalCssExtDsl.g:3448:1: ( rule__ElementDefinition__SuperAssignment_3_1 )
            // InternalCssExtDsl.g:3448:2: rule__ElementDefinition__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__SuperAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__2"
    // InternalCssExtDsl.g:3458:1: rule__ElementDefinition__Group_3__2 : rule__ElementDefinition__Group_3__2__Impl ;
    public final void rule__ElementDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3462:1: ( rule__ElementDefinition__Group_3__2__Impl )
            // InternalCssExtDsl.g:3463:2: rule__ElementDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__2"


    // $ANTLR start "rule__ElementDefinition__Group_3__2__Impl"
    // InternalCssExtDsl.g:3469:1: rule__ElementDefinition__Group_3__2__Impl : ( ( rule__ElementDefinition__Group_3_2__0 )* ) ;
    public final void rule__ElementDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3473:1: ( ( ( rule__ElementDefinition__Group_3_2__0 )* ) )
            // InternalCssExtDsl.g:3474:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            {
            // InternalCssExtDsl.g:3474:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            // InternalCssExtDsl.g:3475:1: ( rule__ElementDefinition__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }
            // InternalCssExtDsl.g:3476:1: ( rule__ElementDefinition__Group_3_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCssExtDsl.g:3476:2: rule__ElementDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ElementDefinition__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0"
    // InternalCssExtDsl.g:3492:1: rule__ElementDefinition__Group_3_2__0 : rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 ;
    public final void rule__ElementDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3496:1: ( rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 )
            // InternalCssExtDsl.g:3497:2: rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ElementDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0__Impl"
    // InternalCssExtDsl.g:3504:1: rule__ElementDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ElementDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3508:1: ( ( ',' ) )
            // InternalCssExtDsl.g:3509:1: ( ',' )
            {
            // InternalCssExtDsl.g:3509:1: ( ',' )
            // InternalCssExtDsl.g:3510:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1"
    // InternalCssExtDsl.g:3523:1: rule__ElementDefinition__Group_3_2__1 : rule__ElementDefinition__Group_3_2__1__Impl ;
    public final void rule__ElementDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3527:1: ( rule__ElementDefinition__Group_3_2__1__Impl )
            // InternalCssExtDsl.g:3528:2: rule__ElementDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1__Impl"
    // InternalCssExtDsl.g:3534:1: rule__ElementDefinition__Group_3_2__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) ;
    public final void rule__ElementDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3538:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) )
            // InternalCssExtDsl.g:3539:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            {
            // InternalCssExtDsl.g:3539:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            // InternalCssExtDsl.g:3540:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }
            // InternalCssExtDsl.g:3541:1: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            // InternalCssExtDsl.g:3541:2: rule__ElementDefinition__SuperAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__SuperAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_4__0"
    // InternalCssExtDsl.g:3555:1: rule__ElementDefinition__Group_4__0 : rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1 ;
    public final void rule__ElementDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3559:1: ( rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1 )
            // InternalCssExtDsl.g:3560:2: rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ElementDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_4__0"


    // $ANTLR start "rule__ElementDefinition__Group_4__0__Impl"
    // InternalCssExtDsl.g:3567:1: rule__ElementDefinition__Group_4__0__Impl : ( 'styleclass' ) ;
    public final void rule__ElementDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3571:1: ( ( 'styleclass' ) )
            // InternalCssExtDsl.g:3572:1: ( 'styleclass' )
            {
            // InternalCssExtDsl.g:3572:1: ( 'styleclass' )
            // InternalCssExtDsl.g:3573:1: 'styleclass'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_4__1"
    // InternalCssExtDsl.g:3586:1: rule__ElementDefinition__Group_4__1 : rule__ElementDefinition__Group_4__1__Impl ;
    public final void rule__ElementDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3590:1: ( rule__ElementDefinition__Group_4__1__Impl )
            // InternalCssExtDsl.g:3591:2: rule__ElementDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_4__1"


    // $ANTLR start "rule__ElementDefinition__Group_4__1__Impl"
    // InternalCssExtDsl.g:3597:1: rule__ElementDefinition__Group_4__1__Impl : ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) ) ;
    public final void rule__ElementDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3601:1: ( ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) ) )
            // InternalCssExtDsl.g:3602:1: ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) )
            {
            // InternalCssExtDsl.g:3602:1: ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) )
            // InternalCssExtDsl.g:3603:1: ( rule__ElementDefinition__StyleclassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:3604:1: ( rule__ElementDefinition__StyleclassAssignment_4_1 )
            // InternalCssExtDsl.g:3604:2: rule__ElementDefinition__StyleclassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__StyleclassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // InternalCssExtDsl.g:3618:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3622:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // InternalCssExtDsl.g:3623:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3630:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3634:1: ( ( () ) )
            // InternalCssExtDsl.g:3635:1: ( () )
            {
            // InternalCssExtDsl.g:3635:1: ( () )
            // InternalCssExtDsl.g:3636:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3637:1: ()
            // InternalCssExtDsl.g:3639:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // InternalCssExtDsl.g:3649:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3653:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // InternalCssExtDsl.g:3654:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3661:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3665:1: ( ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3666:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3666:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3667:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3668:1: ( rule__PropertyDefinition__DokuAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_JDOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCssExtDsl.g:3668:2: rule__PropertyDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // InternalCssExtDsl.g:3678:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3682:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // InternalCssExtDsl.g:3683:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3690:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3694:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3695:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3695:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3696:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3697:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3697:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // InternalCssExtDsl.g:3707:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3711:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // InternalCssExtDsl.g:3712:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:3719:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3723:1: ( ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) )
            // InternalCssExtDsl.g:3724:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            {
            // InternalCssExtDsl.g:3724:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            // InternalCssExtDsl.g:3725:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }
            // InternalCssExtDsl.g:3726:1: ( rule__PropertyDefinition__RuleAssignment_3 )
            // InternalCssExtDsl.g:3726:2: rule__PropertyDefinition__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__RuleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // InternalCssExtDsl.g:3736:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3740:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // InternalCssExtDsl.g:3741:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:3748:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3752:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // InternalCssExtDsl.g:3753:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:3753:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // InternalCssExtDsl.g:3754:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:3755:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCssExtDsl.g:3755:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // InternalCssExtDsl.g:3765:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3769:1: ( rule__PropertyDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:3770:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:3776:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3780:1: ( ( ';' ) )
            // InternalCssExtDsl.g:3781:1: ( ';' )
            {
            // InternalCssExtDsl.g:3781:1: ( ';' )
            // InternalCssExtDsl.g:3782:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // InternalCssExtDsl.g:3807:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3811:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // InternalCssExtDsl.g:3812:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // InternalCssExtDsl.g:3819:1: rule__PropertyDefinition__Group_4__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3823:1: ( ( 'default:' ) )
            // InternalCssExtDsl.g:3824:1: ( 'default:' )
            {
            // InternalCssExtDsl.g:3824:1: ( 'default:' )
            // InternalCssExtDsl.g:3825:1: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // InternalCssExtDsl.g:3838:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3842:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // InternalCssExtDsl.g:3843:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // InternalCssExtDsl.g:3849:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3853:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) )
            // InternalCssExtDsl.g:3854:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            {
            // InternalCssExtDsl.g:3854:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            // InternalCssExtDsl.g:3855:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:3856:1: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            // InternalCssExtDsl.g:3856:2: rule__PropertyDefinition__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0"
    // InternalCssExtDsl.g:3870:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3874:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // InternalCssExtDsl.g:3875:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__0"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3882:1: rule__PseudoClassDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3886:1: ( ( () ) )
            // InternalCssExtDsl.g:3887:1: ( () )
            {
            // InternalCssExtDsl.g:3887:1: ( () )
            // InternalCssExtDsl.g:3888:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3889:1: ()
            // InternalCssExtDsl.g:3891:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1"
    // InternalCssExtDsl.g:3901:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3905:1: ( rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 )
            // InternalCssExtDsl.g:3906:2: rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__PseudoClassDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__1"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3913:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3917:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3918:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3918:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3919:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3920:1: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_JDOC) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCssExtDsl.g:3920:2: rule__PseudoClassDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PseudoClassDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2"
    // InternalCssExtDsl.g:3930:1: rule__PseudoClassDefinition__Group__2 : rule__PseudoClassDefinition__Group__2__Impl ;
    public final void rule__PseudoClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3934:1: ( rule__PseudoClassDefinition__Group__2__Impl )
            // InternalCssExtDsl.g:3935:2: rule__PseudoClassDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__2"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3941:1: rule__PseudoClassDefinition__Group__2__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) ;
    public final void rule__PseudoClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3945:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3946:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3946:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3947:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3948:1: ( rule__PseudoClassDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3948:2: rule__PseudoClassDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // InternalCssExtDsl.g:3964:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3968:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // InternalCssExtDsl.g:3969:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__0"


    // $ANTLR start "rule__CSSRuleRef__Group__0__Impl"
    // InternalCssExtDsl.g:3976:1: rule__CSSRuleRef__Group__0__Impl : ( ( rule__CSSRuleRef__Group_0__0 )? ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3980:1: ( ( ( rule__CSSRuleRef__Group_0__0 )? ) )
            // InternalCssExtDsl.g:3981:1: ( ( rule__CSSRuleRef__Group_0__0 )? )
            {
            // InternalCssExtDsl.g:3981:1: ( ( rule__CSSRuleRef__Group_0__0 )? )
            // InternalCssExtDsl.g:3982:1: ( rule__CSSRuleRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup_0()); 
            }
            // InternalCssExtDsl.g:3983:1: ( rule__CSSRuleRef__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_JDOC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCssExtDsl.g:3983:2: rule__CSSRuleRef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleRef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__1"
    // InternalCssExtDsl.g:3993:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:3997:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // InternalCssExtDsl.g:3998:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__1"


    // $ANTLR start "rule__CSSRuleRef__Group__1__Impl"
    // InternalCssExtDsl.g:4005:1: rule__CSSRuleRef__Group__1__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4009:1: ( ( '<' ) )
            // InternalCssExtDsl.g:4010:1: ( '<' )
            {
            // InternalCssExtDsl.g:4010:1: ( '<' )
            // InternalCssExtDsl.g:4011:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__2"
    // InternalCssExtDsl.g:4024:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3 ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4028:1: ( rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3 )
            // InternalCssExtDsl.g:4029:2: rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__2"


    // $ANTLR start "rule__CSSRuleRef__Group__2__Impl"
    // InternalCssExtDsl.g:4036:1: rule__CSSRuleRef__Group__2__Impl : ( ( rule__CSSRuleRef__RefAssignment_2 ) ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4040:1: ( ( ( rule__CSSRuleRef__RefAssignment_2 ) ) )
            // InternalCssExtDsl.g:4041:1: ( ( rule__CSSRuleRef__RefAssignment_2 ) )
            {
            // InternalCssExtDsl.g:4041:1: ( ( rule__CSSRuleRef__RefAssignment_2 ) )
            // InternalCssExtDsl.g:4042:1: ( rule__CSSRuleRef__RefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_2()); 
            }
            // InternalCssExtDsl.g:4043:1: ( rule__CSSRuleRef__RefAssignment_2 )
            // InternalCssExtDsl.g:4043:2: rule__CSSRuleRef__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__RefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__3"
    // InternalCssExtDsl.g:4053:1: rule__CSSRuleRef__Group__3 : rule__CSSRuleRef__Group__3__Impl ;
    public final void rule__CSSRuleRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4057:1: ( rule__CSSRuleRef__Group__3__Impl )
            // InternalCssExtDsl.g:4058:2: rule__CSSRuleRef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__3"


    // $ANTLR start "rule__CSSRuleRef__Group__3__Impl"
    // InternalCssExtDsl.g:4064:1: rule__CSSRuleRef__Group__3__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4068:1: ( ( '>' ) )
            // InternalCssExtDsl.g:4069:1: ( '>' )
            {
            // InternalCssExtDsl.g:4069:1: ( '>' )
            // InternalCssExtDsl.g:4070:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group_0__0"
    // InternalCssExtDsl.g:4091:1: rule__CSSRuleRef__Group_0__0 : rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1 ;
    public final void rule__CSSRuleRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4095:1: ( rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1 )
            // InternalCssExtDsl.g:4096:2: rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSRuleRef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group_0__0"


    // $ANTLR start "rule__CSSRuleRef__Group_0__0__Impl"
    // InternalCssExtDsl.g:4103:1: rule__CSSRuleRef__Group_0__0__Impl : ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) ) ;
    public final void rule__CSSRuleRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4107:1: ( ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) ) )
            // InternalCssExtDsl.g:4108:1: ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) )
            {
            // InternalCssExtDsl.g:4108:1: ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) )
            // InternalCssExtDsl.g:4109:1: ( rule__CSSRuleRef__DokuAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getDokuAssignment_0_0()); 
            }
            // InternalCssExtDsl.g:4110:1: ( rule__CSSRuleRef__DokuAssignment_0_0 )
            // InternalCssExtDsl.g:4110:2: rule__CSSRuleRef__DokuAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__DokuAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getDokuAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group_0__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group_0__1"
    // InternalCssExtDsl.g:4120:1: rule__CSSRuleRef__Group_0__1 : rule__CSSRuleRef__Group_0__1__Impl ;
    public final void rule__CSSRuleRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4124:1: ( rule__CSSRuleRef__Group_0__1__Impl )
            // InternalCssExtDsl.g:4125:2: rule__CSSRuleRef__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group_0__1"


    // $ANTLR start "rule__CSSRuleRef__Group_0__1__Impl"
    // InternalCssExtDsl.g:4131:1: rule__CSSRuleRef__Group_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4135:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:4136:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:4136:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:4137:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
            }
            // InternalCssExtDsl.g:4138:1: ( RULE_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_WS) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCssExtDsl.g:4138:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__Group_0__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0"
    // InternalCssExtDsl.g:4152:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4156:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // InternalCssExtDsl.g:4157:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__0"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:4164:1: rule__CSSRuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4168:1: ( ( () ) )
            // InternalCssExtDsl.g:4169:1: ( () )
            {
            // InternalCssExtDsl.g:4169:1: ( () )
            // InternalCssExtDsl.g:4170:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:4171:1: ()
            // InternalCssExtDsl.g:4173:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1"
    // InternalCssExtDsl.g:4183:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4187:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // InternalCssExtDsl.g:4188:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__1"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:4195:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4199:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:4200:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:4200:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:4201:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:4202:1: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_JDOC) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCssExtDsl.g:4202:2: rule__CSSRuleDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2"
    // InternalCssExtDsl.g:4212:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4216:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // InternalCssExtDsl.g:4217:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__2"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:4224:1: rule__CSSRuleDefinition__Group__2__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4228:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:4229:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:4229:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:4230:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:4231:1: ( rule__CSSRuleDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:4231:2: rule__CSSRuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3"
    // InternalCssExtDsl.g:4241:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4245:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // InternalCssExtDsl.g:4246:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__3"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:4253:1: rule__CSSRuleDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4257:1: ( ( '=' ) )
            // InternalCssExtDsl.g:4258:1: ( '=' )
            {
            // InternalCssExtDsl.g:4258:1: ( '=' )
            // InternalCssExtDsl.g:4259:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4"
    // InternalCssExtDsl.g:4272:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4276:1: ( rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 )
            // InternalCssExtDsl.g:4277:2: rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__CSSRuleDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__4"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:4284:1: rule__CSSRuleDefinition__Group__4__Impl : ( ( rule__CSSRuleDefinition__Alternatives_4 ) ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4288:1: ( ( ( rule__CSSRuleDefinition__Alternatives_4 ) ) )
            // InternalCssExtDsl.g:4289:1: ( ( rule__CSSRuleDefinition__Alternatives_4 ) )
            {
            // InternalCssExtDsl.g:4289:1: ( ( rule__CSSRuleDefinition__Alternatives_4 ) )
            // InternalCssExtDsl.g:4290:1: ( rule__CSSRuleDefinition__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_4()); 
            }
            // InternalCssExtDsl.g:4291:1: ( rule__CSSRuleDefinition__Alternatives_4 )
            // InternalCssExtDsl.g:4291:2: rule__CSSRuleDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5"
    // InternalCssExtDsl.g:4301:1: rule__CSSRuleDefinition__Group__5 : rule__CSSRuleDefinition__Group__5__Impl ;
    public final void rule__CSSRuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4305:1: ( rule__CSSRuleDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:4306:2: rule__CSSRuleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__5"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:4312:1: rule__CSSRuleDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4316:1: ( ( ';' ) )
            // InternalCssExtDsl.g:4317:1: ( ';' )
            {
            // InternalCssExtDsl.g:4317:1: ( ';' )
            // InternalCssExtDsl.g:4318:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__0"
    // InternalCssExtDsl.g:4343:1: rule__CSSRuleFunc__Group__0 : rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 ;
    public final void rule__CSSRuleFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4347:1: ( rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 )
            // InternalCssExtDsl.g:4348:2: rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__0"


    // $ANTLR start "rule__CSSRuleFunc__Group__0__Impl"
    // InternalCssExtDsl.g:4355:1: rule__CSSRuleFunc__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4359:1: ( ( () ) )
            // InternalCssExtDsl.g:4360:1: ( () )
            {
            // InternalCssExtDsl.g:4360:1: ( () )
            // InternalCssExtDsl.g:4361:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }
            // InternalCssExtDsl.g:4362:1: ()
            // InternalCssExtDsl.g:4364:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__1"
    // InternalCssExtDsl.g:4374:1: rule__CSSRuleFunc__Group__1 : rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 ;
    public final void rule__CSSRuleFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4378:1: ( rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 )
            // InternalCssExtDsl.g:4379:2: rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CSSRuleFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__1"


    // $ANTLR start "rule__CSSRuleFunc__Group__1__Impl"
    // InternalCssExtDsl.g:4386:1: rule__CSSRuleFunc__Group__1__Impl : ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4390:1: ( ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) )
            // InternalCssExtDsl.g:4391:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            {
            // InternalCssExtDsl.g:4391:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            // InternalCssExtDsl.g:4392:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }
            // InternalCssExtDsl.g:4393:1: ( rule__CSSRuleFunc__NameAssignment_1 )
            // InternalCssExtDsl.g:4393:2: rule__CSSRuleFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__2"
    // InternalCssExtDsl.g:4403:1: rule__CSSRuleFunc__Group__2 : rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 ;
    public final void rule__CSSRuleFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4407:1: ( rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 )
            // InternalCssExtDsl.g:4408:2: rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__CSSRuleFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__2"


    // $ANTLR start "rule__CSSRuleFunc__Group__2__Impl"
    // InternalCssExtDsl.g:4415:1: rule__CSSRuleFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__CSSRuleFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4419:1: ( ( '(' ) )
            // InternalCssExtDsl.g:4420:1: ( '(' )
            {
            // InternalCssExtDsl.g:4420:1: ( '(' )
            // InternalCssExtDsl.g:4421:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__3"
    // InternalCssExtDsl.g:4434:1: rule__CSSRuleFunc__Group__3 : rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 ;
    public final void rule__CSSRuleFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4438:1: ( rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 )
            // InternalCssExtDsl.g:4439:2: rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__CSSRuleFunc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__3"


    // $ANTLR start "rule__CSSRuleFunc__Group__3__Impl"
    // InternalCssExtDsl.g:4446:1: rule__CSSRuleFunc__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4450:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:4451:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:4451:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:4452:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }
            // InternalCssExtDsl.g:4453:1: ( RULE_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_WS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCssExtDsl.g:4453:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__4"
    // InternalCssExtDsl.g:4463:1: rule__CSSRuleFunc__Group__4 : rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 ;
    public final void rule__CSSRuleFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4467:1: ( rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 )
            // InternalCssExtDsl.g:4468:2: rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__CSSRuleFunc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__4"


    // $ANTLR start "rule__CSSRuleFunc__Group__4__Impl"
    // InternalCssExtDsl.g:4475:1: rule__CSSRuleFunc__Group__4__Impl : ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) ;
    public final void rule__CSSRuleFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4479:1: ( ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) )
            // InternalCssExtDsl.g:4480:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            {
            // InternalCssExtDsl.g:4480:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            // InternalCssExtDsl.g:4481:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }
            // InternalCssExtDsl.g:4482:1: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            // InternalCssExtDsl.g:4482:2: rule__CSSRuleFunc__ParamsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__ParamsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__5"
    // InternalCssExtDsl.g:4492:1: rule__CSSRuleFunc__Group__5 : rule__CSSRuleFunc__Group__5__Impl ;
    public final void rule__CSSRuleFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4496:1: ( rule__CSSRuleFunc__Group__5__Impl )
            // InternalCssExtDsl.g:4497:2: rule__CSSRuleFunc__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__5"


    // $ANTLR start "rule__CSSRuleFunc__Group__5__Impl"
    // InternalCssExtDsl.g:4503:1: rule__CSSRuleFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__CSSRuleFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4507:1: ( ( ')' ) )
            // InternalCssExtDsl.g:4508:1: ( ')' )
            {
            // InternalCssExtDsl.g:4508:1: ( ')' )
            // InternalCssExtDsl.g:4509:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__0"
    // InternalCssExtDsl.g:4534:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4538:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // InternalCssExtDsl.g:4539:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group__0"


    // $ANTLR start "rule__CSSRuleOr__Group__0__Impl"
    // InternalCssExtDsl.g:4546:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4550:1: ( ( ruleCSSRuleXor ) )
            // InternalCssExtDsl.g:4551:1: ( ruleCSSRuleXor )
            {
            // InternalCssExtDsl.g:4551:1: ( ruleCSSRuleXor )
            // InternalCssExtDsl.g:4552:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__1"
    // InternalCssExtDsl.g:4563:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4567:1: ( rule__CSSRuleOr__Group__1__Impl )
            // InternalCssExtDsl.g:4568:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group__1"


    // $ANTLR start "rule__CSSRuleOr__Group__1__Impl"
    // InternalCssExtDsl.g:4574:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4578:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4579:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4579:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // InternalCssExtDsl.g:4580:1: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4581:1: ( rule__CSSRuleOr__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCssExtDsl.g:4581:2: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0"
    // InternalCssExtDsl.g:4595:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4599:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // InternalCssExtDsl.g:4600:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0__Impl"
    // InternalCssExtDsl.g:4607:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4611:1: ( ( () ) )
            // InternalCssExtDsl.g:4612:1: ( () )
            {
            // InternalCssExtDsl.g:4612:1: ( () )
            // InternalCssExtDsl.g:4613:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // InternalCssExtDsl.g:4614:1: ()
            // InternalCssExtDsl.g:4616:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1"
    // InternalCssExtDsl.g:4626:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4630:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // InternalCssExtDsl.g:4631:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1__Impl"
    // InternalCssExtDsl.g:4637:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4641:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:4642:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:4642:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:4643:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:4643:1: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // InternalCssExtDsl.g:4644:1: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4645:1: ( rule__CSSRuleOr__Group_1_1__0 )
            // InternalCssExtDsl.g:4645:2: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_40);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4648:1: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // InternalCssExtDsl.g:4649:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4650:1: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==35) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCssExtDsl.g:4650:2: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0"
    // InternalCssExtDsl.g:4665:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4669:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // InternalCssExtDsl.g:4670:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:4677:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4681:1: ( ( '|' ) )
            // InternalCssExtDsl.g:4682:1: ( '|' )
            {
            // InternalCssExtDsl.g:4682:1: ( '|' )
            // InternalCssExtDsl.g:4683:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1"
    // InternalCssExtDsl.g:4696:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4700:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:4701:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:4707:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4711:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:4712:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:4712:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:4713:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:4714:1: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // InternalCssExtDsl.g:4714:2: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__OrsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__0"
    // InternalCssExtDsl.g:4728:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4732:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // InternalCssExtDsl.g:4733:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group__0"


    // $ANTLR start "rule__CSSRuleXor__Group__0__Impl"
    // InternalCssExtDsl.g:4740:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4744:1: ( ( ruleCSSRuleConcat ) )
            // InternalCssExtDsl.g:4745:1: ( ruleCSSRuleConcat )
            {
            // InternalCssExtDsl.g:4745:1: ( ruleCSSRuleConcat )
            // InternalCssExtDsl.g:4746:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__1"
    // InternalCssExtDsl.g:4757:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4761:1: ( rule__CSSRuleXor__Group__1__Impl )
            // InternalCssExtDsl.g:4762:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group__1"


    // $ANTLR start "rule__CSSRuleXor__Group__1__Impl"
    // InternalCssExtDsl.g:4768:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4772:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4773:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4773:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // InternalCssExtDsl.g:4774:1: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4775:1: ( rule__CSSRuleXor__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCssExtDsl.g:4775:2: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleXor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0"
    // InternalCssExtDsl.g:4789:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4793:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // InternalCssExtDsl.g:4794:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0__Impl"
    // InternalCssExtDsl.g:4801:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4805:1: ( ( () ) )
            // InternalCssExtDsl.g:4806:1: ( () )
            {
            // InternalCssExtDsl.g:4806:1: ( () )
            // InternalCssExtDsl.g:4807:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // InternalCssExtDsl.g:4808:1: ()
            // InternalCssExtDsl.g:4810:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1"
    // InternalCssExtDsl.g:4820:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4824:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // InternalCssExtDsl.g:4825:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1__Impl"
    // InternalCssExtDsl.g:4831:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4835:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:4836:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:4836:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:4837:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:4837:1: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // InternalCssExtDsl.g:4838:1: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4839:1: ( rule__CSSRuleXor__Group_1_1__0 )
            // InternalCssExtDsl.g:4839:2: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_42);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4842:1: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // InternalCssExtDsl.g:4843:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4844:1: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==36) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCssExtDsl.g:4844:2: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0"
    // InternalCssExtDsl.g:4859:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4863:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // InternalCssExtDsl.g:4864:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:4871:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4875:1: ( ( '||' ) )
            // InternalCssExtDsl.g:4876:1: ( '||' )
            {
            // InternalCssExtDsl.g:4876:1: ( '||' )
            // InternalCssExtDsl.g:4877:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1"
    // InternalCssExtDsl.g:4890:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4894:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:4895:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:4901:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4905:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:4906:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:4906:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:4907:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:4908:1: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // InternalCssExtDsl.g:4908:2: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__XorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__0"
    // InternalCssExtDsl.g:4922:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4926:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // InternalCssExtDsl.g:4927:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group__0"


    // $ANTLR start "rule__CSSRuleConcat__Group__0__Impl"
    // InternalCssExtDsl.g:4934:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRuleConcatWithoutSpace ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4938:1: ( ( ruleCSSRuleConcatWithoutSpace ) )
            // InternalCssExtDsl.g:4939:1: ( ruleCSSRuleConcatWithoutSpace )
            {
            // InternalCssExtDsl.g:4939:1: ( ruleCSSRuleConcatWithoutSpace )
            // InternalCssExtDsl.g:4940:1: ruleCSSRuleConcatWithoutSpace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__1"
    // InternalCssExtDsl.g:4951:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4955:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // InternalCssExtDsl.g:4956:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group__1"


    // $ANTLR start "rule__CSSRuleConcat__Group__1__Impl"
    // InternalCssExtDsl.g:4962:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4966:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4967:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4967:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // InternalCssExtDsl.g:4968:1: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4969:1: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||(LA51_0>=RULE_JDOC && LA51_0<=RULE_INT)||LA51_0==RULE_REGEX||(LA51_0>=18 && LA51_0<=19)||LA51_0==32||LA51_0==38||(LA51_0>=41 && LA51_0<=44)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCssExtDsl.g:4969:2: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleConcat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0"
    // InternalCssExtDsl.g:4983:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4987:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // InternalCssExtDsl.g:4988:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0__Impl"
    // InternalCssExtDsl.g:4995:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:4999:1: ( ( () ) )
            // InternalCssExtDsl.g:5000:1: ( () )
            {
            // InternalCssExtDsl.g:5000:1: ( () )
            // InternalCssExtDsl.g:5001:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // InternalCssExtDsl.g:5002:1: ()
            // InternalCssExtDsl.g:5004:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1"
    // InternalCssExtDsl.g:5014:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5018:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // InternalCssExtDsl.g:5019:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1__Impl"
    // InternalCssExtDsl.g:5025:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5029:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // InternalCssExtDsl.g:5030:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // InternalCssExtDsl.g:5030:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // InternalCssExtDsl.g:5031:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // InternalCssExtDsl.g:5031:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // InternalCssExtDsl.g:5032:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:5033:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // InternalCssExtDsl.g:5033:2: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_43);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // InternalCssExtDsl.g:5036:1: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // InternalCssExtDsl.g:5037:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:5038:1: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||(LA52_0>=RULE_JDOC && LA52_0<=RULE_INT)||LA52_0==RULE_REGEX||(LA52_0>=18 && LA52_0<=19)||LA52_0==32||LA52_0==38||(LA52_0>=41 && LA52_0<=44)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCssExtDsl.g:5038:2: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__0"
    // InternalCssExtDsl.g:5053:1: rule__CSSRuleConcatWithoutSpace__Group__0 : rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5057:1: ( rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1 )
            // InternalCssExtDsl.g:5058:2: rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__CSSRuleConcatWithoutSpace__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__0__Impl"
    // InternalCssExtDsl.g:5065:1: rule__CSSRuleConcatWithoutSpace__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5069:1: ( ( ruleCSSRulePostfix ) )
            // InternalCssExtDsl.g:5070:1: ( ruleCSSRulePostfix )
            {
            // InternalCssExtDsl.g:5070:1: ( ruleCSSRulePostfix )
            // InternalCssExtDsl.g:5071:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__1"
    // InternalCssExtDsl.g:5082:1: rule__CSSRuleConcatWithoutSpace__Group__1 : rule__CSSRuleConcatWithoutSpace__Group__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5086:1: ( rule__CSSRuleConcatWithoutSpace__Group__1__Impl )
            // InternalCssExtDsl.g:5087:2: rule__CSSRuleConcatWithoutSpace__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__1__Impl"
    // InternalCssExtDsl.g:5093:1: rule__CSSRuleConcatWithoutSpace__Group__1__Impl : ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5097:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5098:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5098:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? )
            // InternalCssExtDsl.g:5099:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5100:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCssExtDsl.g:5100:2: rule__CSSRuleConcatWithoutSpace__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleConcatWithoutSpace__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__0"
    // InternalCssExtDsl.g:5114:1: rule__CSSRuleConcatWithoutSpace__Group_1__0 : rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5118:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1 )
            // InternalCssExtDsl.g:5119:2: rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl"
    // InternalCssExtDsl.g:5126:1: rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5130:1: ( ( () ) )
            // InternalCssExtDsl.g:5131:1: ( () )
            {
            // InternalCssExtDsl.g:5131:1: ( () )
            // InternalCssExtDsl.g:5132:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0()); 
            }
            // InternalCssExtDsl.g:5133:1: ()
            // InternalCssExtDsl.g:5135:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__1"
    // InternalCssExtDsl.g:5145:1: rule__CSSRuleConcatWithoutSpace__Group_1__1 : rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5149:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl )
            // InternalCssExtDsl.g:5150:2: rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl"
    // InternalCssExtDsl.g:5156:1: rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl : ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5160:1: ( ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:5161:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:5161:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:5162:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:5162:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) )
            // InternalCssExtDsl.g:5163:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:5164:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )
            // InternalCssExtDsl.g:5164:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__0
            {
            pushFollow(FOLLOW_45);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:5167:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* )
            // InternalCssExtDsl.g:5168:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:5169:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==37) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCssExtDsl.g:5169:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__CSSRuleConcatWithoutSpace__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__0"
    // InternalCssExtDsl.g:5184:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__0 : rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5188:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1 )
            // InternalCssExtDsl.g:5189:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:5196:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl : ( '~' ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5200:1: ( ( '~' ) )
            // InternalCssExtDsl.g:5201:1: ( '~' )
            {
            // InternalCssExtDsl.g:5201:1: ( '~' )
            // InternalCssExtDsl.g:5202:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__1"
    // InternalCssExtDsl.g:5215:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__1 : rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5219:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:5220:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:5226:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl : ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5230:1: ( ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:5231:1: ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:5231:1: ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:5232:1: ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:5233:1: ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 )
            // InternalCssExtDsl.g:5233:2: rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__0"
    // InternalCssExtDsl.g:5247:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5251:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // InternalCssExtDsl.g:5252:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group__0"


    // $ANTLR start "rule__CSSRulePostfix__Group__0__Impl"
    // InternalCssExtDsl.g:5259:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5263:1: ( ( ruleCSSRulePrimary ) )
            // InternalCssExtDsl.g:5264:1: ( ruleCSSRulePrimary )
            {
            // InternalCssExtDsl.g:5264:1: ( ruleCSSRulePrimary )
            // InternalCssExtDsl.g:5265:1: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__1"
    // InternalCssExtDsl.g:5276:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5280:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // InternalCssExtDsl.g:5281:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group__1"


    // $ANTLR start "rule__CSSRulePostfix__Group__1__Impl"
    // InternalCssExtDsl.g:5287:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5291:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5292:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5292:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // InternalCssExtDsl.g:5293:1: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5294:1: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=15 && LA55_0<=17)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCssExtDsl.g:5294:2: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRulePostfix__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0"
    // InternalCssExtDsl.g:5308:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5312:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // InternalCssExtDsl.g:5313:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0__Impl"
    // InternalCssExtDsl.g:5320:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5324:1: ( ( () ) )
            // InternalCssExtDsl.g:5325:1: ( () )
            {
            // InternalCssExtDsl.g:5325:1: ( () )
            // InternalCssExtDsl.g:5326:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // InternalCssExtDsl.g:5327:1: ()
            // InternalCssExtDsl.g:5329:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1"
    // InternalCssExtDsl.g:5339:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5343:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // InternalCssExtDsl.g:5344:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1__Impl"
    // InternalCssExtDsl.g:5350:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5354:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // InternalCssExtDsl.g:5355:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // InternalCssExtDsl.g:5355:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // InternalCssExtDsl.g:5356:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:5357:1: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // InternalCssExtDsl.g:5357:2: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__CardinalityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__0"
    // InternalCssExtDsl.g:5371:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5375:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // InternalCssExtDsl.g:5376:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__0"


    // $ANTLR start "rule__CSSRuleBracket__Group__0__Impl"
    // InternalCssExtDsl.g:5383:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5387:1: ( ( () ) )
            // InternalCssExtDsl.g:5388:1: ( () )
            {
            // InternalCssExtDsl.g:5388:1: ( () )
            // InternalCssExtDsl.g:5389:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // InternalCssExtDsl.g:5390:1: ()
            // InternalCssExtDsl.g:5392:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__1"
    // InternalCssExtDsl.g:5402:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5406:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // InternalCssExtDsl.g:5407:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__1"


    // $ANTLR start "rule__CSSRuleBracket__Group__1__Impl"
    // InternalCssExtDsl.g:5414:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5418:1: ( ( '[' ) )
            // InternalCssExtDsl.g:5419:1: ( '[' )
            {
            // InternalCssExtDsl.g:5419:1: ( '[' )
            // InternalCssExtDsl.g:5420:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__2"
    // InternalCssExtDsl.g:5433:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5437:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // InternalCssExtDsl.g:5438:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__2"


    // $ANTLR start "rule__CSSRuleBracket__Group__2__Impl"
    // InternalCssExtDsl.g:5445:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5449:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // InternalCssExtDsl.g:5450:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5450:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // InternalCssExtDsl.g:5451:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // InternalCssExtDsl.g:5452:1: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // InternalCssExtDsl.g:5452:2: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__InnerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__3"
    // InternalCssExtDsl.g:5462:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5466:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // InternalCssExtDsl.g:5467:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__3"


    // $ANTLR start "rule__CSSRuleBracket__Group__3__Impl"
    // InternalCssExtDsl.g:5473:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5477:1: ( ( ']' ) )
            // InternalCssExtDsl.g:5478:1: ( ']' )
            {
            // InternalCssExtDsl.g:5478:1: ( ']' )
            // InternalCssExtDsl.g:5479:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__3__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0"
    // InternalCssExtDsl.g:5500:1: rule__CSSRulePrimary__Group_6__0 : rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 ;
    public final void rule__CSSRulePrimary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5504:1: ( rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 )
            // InternalCssExtDsl.g:5505:2: rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__CSSRulePrimary__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0__Impl"
    // InternalCssExtDsl.g:5512:1: rule__CSSRulePrimary__Group_6__0__Impl : ( () ) ;
    public final void rule__CSSRulePrimary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5516:1: ( ( () ) )
            // InternalCssExtDsl.g:5517:1: ( () )
            {
            // InternalCssExtDsl.g:5517:1: ( () )
            // InternalCssExtDsl.g:5518:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }
            // InternalCssExtDsl.g:5519:1: ()
            // InternalCssExtDsl.g:5521:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1"
    // InternalCssExtDsl.g:5531:1: rule__CSSRulePrimary__Group_6__1 : rule__CSSRulePrimary__Group_6__1__Impl ;
    public final void rule__CSSRulePrimary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5535:1: ( rule__CSSRulePrimary__Group_6__1__Impl )
            // InternalCssExtDsl.g:5536:2: rule__CSSRulePrimary__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1__Impl"
    // InternalCssExtDsl.g:5542:1: rule__CSSRulePrimary__Group_6__1__Impl : ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) ;
    public final void rule__CSSRulePrimary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5546:1: ( ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) )
            // InternalCssExtDsl.g:5547:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            {
            // InternalCssExtDsl.g:5547:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            // InternalCssExtDsl.g:5548:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }
            // InternalCssExtDsl.g:5549:1: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            // InternalCssExtDsl.g:5549:2: rule__CSSRulePrimary__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__0"
    // InternalCssExtDsl.g:5563:1: rule__CSSRuleRegex__Group__0 : rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 ;
    public final void rule__CSSRuleRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5567:1: ( rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 )
            // InternalCssExtDsl.g:5568:2: rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__CSSRuleRegex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__0"


    // $ANTLR start "rule__CSSRuleRegex__Group__0__Impl"
    // InternalCssExtDsl.g:5575:1: rule__CSSRuleRegex__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5579:1: ( ( () ) )
            // InternalCssExtDsl.g:5580:1: ( () )
            {
            // InternalCssExtDsl.g:5580:1: ( () )
            // InternalCssExtDsl.g:5581:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }
            // InternalCssExtDsl.g:5582:1: ()
            // InternalCssExtDsl.g:5584:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__1"
    // InternalCssExtDsl.g:5594:1: rule__CSSRuleRegex__Group__1 : rule__CSSRuleRegex__Group__1__Impl ;
    public final void rule__CSSRuleRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5598:1: ( rule__CSSRuleRegex__Group__1__Impl )
            // InternalCssExtDsl.g:5599:2: rule__CSSRuleRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__1"


    // $ANTLR start "rule__CSSRuleRegex__Group__1__Impl"
    // InternalCssExtDsl.g:5605:1: rule__CSSRuleRegex__Group__1__Impl : ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) ;
    public final void rule__CSSRuleRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5609:1: ( ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) )
            // InternalCssExtDsl.g:5610:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            {
            // InternalCssExtDsl.g:5610:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            // InternalCssExtDsl.g:5611:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }
            // InternalCssExtDsl.g:5612:1: ( rule__CSSRuleRegex__RegexAssignment_1 )
            // InternalCssExtDsl.g:5612:2: rule__CSSRuleRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__RegexAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0"
    // InternalCssExtDsl.g:5626:1: rule__CSSRuleLiteral__Group__0 : rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 ;
    public final void rule__CSSRuleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5630:1: ( rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 )
            // InternalCssExtDsl.g:5631:2: rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CSSRuleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0__Impl"
    // InternalCssExtDsl.g:5638:1: rule__CSSRuleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5642:1: ( ( () ) )
            // InternalCssExtDsl.g:5643:1: ( () )
            {
            // InternalCssExtDsl.g:5643:1: ( () )
            // InternalCssExtDsl.g:5644:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }
            // InternalCssExtDsl.g:5645:1: ()
            // InternalCssExtDsl.g:5647:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1"
    // InternalCssExtDsl.g:5657:1: rule__CSSRuleLiteral__Group__1 : rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2 ;
    public final void rule__CSSRuleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5661:1: ( rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2 )
            // InternalCssExtDsl.g:5662:2: rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CSSRuleLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1__Impl"
    // InternalCssExtDsl.g:5669:1: rule__CSSRuleLiteral__Group__1__Impl : ( ( rule__CSSRuleLiteral__Group_1__0 )? ) ;
    public final void rule__CSSRuleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5673:1: ( ( ( rule__CSSRuleLiteral__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5674:1: ( ( rule__CSSRuleLiteral__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5674:1: ( ( rule__CSSRuleLiteral__Group_1__0 )? )
            // InternalCssExtDsl.g:5675:1: ( rule__CSSRuleLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5676:1: ( rule__CSSRuleLiteral__Group_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_JDOC) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCssExtDsl.g:5676:2: rule__CSSRuleLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__2"
    // InternalCssExtDsl.g:5686:1: rule__CSSRuleLiteral__Group__2 : rule__CSSRuleLiteral__Group__2__Impl ;
    public final void rule__CSSRuleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5690:1: ( rule__CSSRuleLiteral__Group__2__Impl )
            // InternalCssExtDsl.g:5691:2: rule__CSSRuleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__2"


    // $ANTLR start "rule__CSSRuleLiteral__Group__2__Impl"
    // InternalCssExtDsl.g:5697:1: rule__CSSRuleLiteral__Group__2__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) ) ;
    public final void rule__CSSRuleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5701:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) ) )
            // InternalCssExtDsl.g:5702:1: ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5702:1: ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) )
            // InternalCssExtDsl.g:5703:1: ( rule__CSSRuleLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_2()); 
            }
            // InternalCssExtDsl.g:5704:1: ( rule__CSSRuleLiteral__ValueAssignment_2 )
            // InternalCssExtDsl.g:5704:2: rule__CSSRuleLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__0"
    // InternalCssExtDsl.g:5720:1: rule__CSSRuleLiteral__Group_1__0 : rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1 ;
    public final void rule__CSSRuleLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5724:1: ( rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1 )
            // InternalCssExtDsl.g:5725:2: rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSRuleLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__0__Impl"
    // InternalCssExtDsl.g:5732:1: rule__CSSRuleLiteral__Group_1__0__Impl : ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) ) ;
    public final void rule__CSSRuleLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5736:1: ( ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) ) )
            // InternalCssExtDsl.g:5737:1: ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) )
            {
            // InternalCssExtDsl.g:5737:1: ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) )
            // InternalCssExtDsl.g:5738:1: ( rule__CSSRuleLiteral__DokuAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getDokuAssignment_1_0()); 
            }
            // InternalCssExtDsl.g:5739:1: ( rule__CSSRuleLiteral__DokuAssignment_1_0 )
            // InternalCssExtDsl.g:5739:2: rule__CSSRuleLiteral__DokuAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__DokuAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getDokuAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__1"
    // InternalCssExtDsl.g:5749:1: rule__CSSRuleLiteral__Group_1__1 : rule__CSSRuleLiteral__Group_1__1__Impl ;
    public final void rule__CSSRuleLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5753:1: ( rule__CSSRuleLiteral__Group_1__1__Impl )
            // InternalCssExtDsl.g:5754:2: rule__CSSRuleLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__1__Impl"
    // InternalCssExtDsl.g:5760:1: rule__CSSRuleLiteral__Group_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5764:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:5765:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:5765:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:5766:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
            }
            // InternalCssExtDsl.g:5767:1: ( RULE_WS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_WS) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCssExtDsl.g:5767:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0"
    // InternalCssExtDsl.g:5781:1: rule__CSSRuleSymbol__Group__0 : rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 ;
    public final void rule__CSSRuleSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5785:1: ( rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 )
            // InternalCssExtDsl.g:5786:2: rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__CSSRuleSymbol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0__Impl"
    // InternalCssExtDsl.g:5793:1: rule__CSSRuleSymbol__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5797:1: ( ( () ) )
            // InternalCssExtDsl.g:5798:1: ( () )
            {
            // InternalCssExtDsl.g:5798:1: ( () )
            // InternalCssExtDsl.g:5799:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }
            // InternalCssExtDsl.g:5800:1: ()
            // InternalCssExtDsl.g:5802:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1"
    // InternalCssExtDsl.g:5812:1: rule__CSSRuleSymbol__Group__1 : rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2 ;
    public final void rule__CSSRuleSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5816:1: ( rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2 )
            // InternalCssExtDsl.g:5817:2: rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__CSSRuleSymbol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1__Impl"
    // InternalCssExtDsl.g:5824:1: rule__CSSRuleSymbol__Group__1__Impl : ( ( rule__CSSRuleSymbol__Group_1__0 )? ) ;
    public final void rule__CSSRuleSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5828:1: ( ( ( rule__CSSRuleSymbol__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5829:1: ( ( rule__CSSRuleSymbol__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5829:1: ( ( rule__CSSRuleSymbol__Group_1__0 )? )
            // InternalCssExtDsl.g:5830:1: ( rule__CSSRuleSymbol__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5831:1: ( rule__CSSRuleSymbol__Group_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_JDOC) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCssExtDsl.g:5831:2: rule__CSSRuleSymbol__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleSymbol__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__2"
    // InternalCssExtDsl.g:5841:1: rule__CSSRuleSymbol__Group__2 : rule__CSSRuleSymbol__Group__2__Impl ;
    public final void rule__CSSRuleSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5845:1: ( rule__CSSRuleSymbol__Group__2__Impl )
            // InternalCssExtDsl.g:5846:2: rule__CSSRuleSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__2"


    // $ANTLR start "rule__CSSRuleSymbol__Group__2__Impl"
    // InternalCssExtDsl.g:5852:1: rule__CSSRuleSymbol__Group__2__Impl : ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) ) ;
    public final void rule__CSSRuleSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5856:1: ( ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) ) )
            // InternalCssExtDsl.g:5857:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5857:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) )
            // InternalCssExtDsl.g:5858:1: ( rule__CSSRuleSymbol__SymbolAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_2()); 
            }
            // InternalCssExtDsl.g:5859:1: ( rule__CSSRuleSymbol__SymbolAssignment_2 )
            // InternalCssExtDsl.g:5859:2: rule__CSSRuleSymbol__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__SymbolAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__0"
    // InternalCssExtDsl.g:5875:1: rule__CSSRuleSymbol__Group_1__0 : rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1 ;
    public final void rule__CSSRuleSymbol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5879:1: ( rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1 )
            // InternalCssExtDsl.g:5880:2: rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CSSRuleSymbol__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__0__Impl"
    // InternalCssExtDsl.g:5887:1: rule__CSSRuleSymbol__Group_1__0__Impl : ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) ) ;
    public final void rule__CSSRuleSymbol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5891:1: ( ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) ) )
            // InternalCssExtDsl.g:5892:1: ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) )
            {
            // InternalCssExtDsl.g:5892:1: ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) )
            // InternalCssExtDsl.g:5893:1: ( rule__CSSRuleSymbol__DokuAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getDokuAssignment_1_0()); 
            }
            // InternalCssExtDsl.g:5894:1: ( rule__CSSRuleSymbol__DokuAssignment_1_0 )
            // InternalCssExtDsl.g:5894:2: rule__CSSRuleSymbol__DokuAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__DokuAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getDokuAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__1"
    // InternalCssExtDsl.g:5904:1: rule__CSSRuleSymbol__Group_1__1 : rule__CSSRuleSymbol__Group_1__1__Impl ;
    public final void rule__CSSRuleSymbol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5908:1: ( rule__CSSRuleSymbol__Group_1__1__Impl )
            // InternalCssExtDsl.g:5909:2: rule__CSSRuleSymbol__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__1__Impl"
    // InternalCssExtDsl.g:5915:1: rule__CSSRuleSymbol__Group_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleSymbol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5919:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:5920:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:5920:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:5921:1: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1()); 
            }
            // InternalCssExtDsl.g:5922:1: ( RULE_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_WS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCssExtDsl.g:5922:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_13); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0"
    // InternalCssExtDsl.g:5936:1: rule__CSSDefaultValue__Group_0__0 : rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 ;
    public final void rule__CSSDefaultValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5940:1: ( rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 )
            // InternalCssExtDsl.g:5941:2: rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__CSSDefaultValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0__Impl"
    // InternalCssExtDsl.g:5948:1: rule__CSSDefaultValue__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSDefaultValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5952:1: ( ( () ) )
            // InternalCssExtDsl.g:5953:1: ( () )
            {
            // InternalCssExtDsl.g:5953:1: ( () )
            // InternalCssExtDsl.g:5954:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }
            // InternalCssExtDsl.g:5955:1: ()
            // InternalCssExtDsl.g:5957:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1"
    // InternalCssExtDsl.g:5967:1: rule__CSSDefaultValue__Group_0__1 : rule__CSSDefaultValue__Group_0__1__Impl ;
    public final void rule__CSSDefaultValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5971:1: ( rule__CSSDefaultValue__Group_0__1__Impl )
            // InternalCssExtDsl.g:5972:2: rule__CSSDefaultValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1__Impl"
    // InternalCssExtDsl.g:5978:1: rule__CSSDefaultValue__Group_0__1__Impl : ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) ;
    public final void rule__CSSDefaultValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:5982:1: ( ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) )
            // InternalCssExtDsl.g:5983:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            {
            // InternalCssExtDsl.g:5983:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            // InternalCssExtDsl.g:5984:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }
            // InternalCssExtDsl.g:5985:1: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            // InternalCssExtDsl.g:5985:2: rule__CSSDefaultValue__ValAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__ValAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__0"
    // InternalCssExtDsl.g:5999:1: rule__SubstructureSelector__Group__0 : rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1 ;
    public final void rule__SubstructureSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6003:1: ( rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1 )
            // InternalCssExtDsl.g:6004:2: rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SubstructureSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__0"


    // $ANTLR start "rule__SubstructureSelector__Group__0__Impl"
    // InternalCssExtDsl.g:6011:1: rule__SubstructureSelector__Group__0__Impl : ( () ) ;
    public final void rule__SubstructureSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6015:1: ( ( () ) )
            // InternalCssExtDsl.g:6016:1: ( () )
            {
            // InternalCssExtDsl.g:6016:1: ( () )
            // InternalCssExtDsl.g:6017:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0()); 
            }
            // InternalCssExtDsl.g:6018:1: ()
            // InternalCssExtDsl.g:6020:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__0__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__1"
    // InternalCssExtDsl.g:6030:1: rule__SubstructureSelector__Group__1 : rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2 ;
    public final void rule__SubstructureSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6034:1: ( rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2 )
            // InternalCssExtDsl.g:6035:2: rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__SubstructureSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__1"


    // $ANTLR start "rule__SubstructureSelector__Group__1__Impl"
    // InternalCssExtDsl.g:6042:1: rule__SubstructureSelector__Group__1__Impl : ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) ) ;
    public final void rule__SubstructureSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6046:1: ( ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) ) )
            // InternalCssExtDsl.g:6047:1: ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) )
            {
            // InternalCssExtDsl.g:6047:1: ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) )
            // InternalCssExtDsl.g:6048:1: ( rule__SubstructureSelector__SelectorNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSelectorNameAssignment_1()); 
            }
            // InternalCssExtDsl.g:6049:1: ( rule__SubstructureSelector__SelectorNameAssignment_1 )
            // InternalCssExtDsl.g:6049:2: rule__SubstructureSelector__SelectorNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__SelectorNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSelectorNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__2"
    // InternalCssExtDsl.g:6059:1: rule__SubstructureSelector__Group__2 : rule__SubstructureSelector__Group__2__Impl ;
    public final void rule__SubstructureSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6063:1: ( rule__SubstructureSelector__Group__2__Impl )
            // InternalCssExtDsl.g:6064:2: rule__SubstructureSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__2"


    // $ANTLR start "rule__SubstructureSelector__Group__2__Impl"
    // InternalCssExtDsl.g:6070:1: rule__SubstructureSelector__Group__2__Impl : ( ( rule__SubstructureSelector__Group_2__0 )? ) ;
    public final void rule__SubstructureSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6074:1: ( ( ( rule__SubstructureSelector__Group_2__0 )? ) )
            // InternalCssExtDsl.g:6075:1: ( ( rule__SubstructureSelector__Group_2__0 )? )
            {
            // InternalCssExtDsl.g:6075:1: ( ( rule__SubstructureSelector__Group_2__0 )? )
            // InternalCssExtDsl.g:6076:1: ( rule__SubstructureSelector__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getGroup_2()); 
            }
            // InternalCssExtDsl.g:6077:1: ( rule__SubstructureSelector__Group_2__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCssExtDsl.g:6077:2: rule__SubstructureSelector__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureSelector__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__2__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__0"
    // InternalCssExtDsl.g:6093:1: rule__SubstructureSelector__Group_2__0 : rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1 ;
    public final void rule__SubstructureSelector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6097:1: ( rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1 )
            // InternalCssExtDsl.g:6098:2: rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SubstructureSelector__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__0"


    // $ANTLR start "rule__SubstructureSelector__Group_2__0__Impl"
    // InternalCssExtDsl.g:6105:1: rule__SubstructureSelector__Group_2__0__Impl : ( '[' ) ;
    public final void rule__SubstructureSelector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6109:1: ( ( '[' ) )
            // InternalCssExtDsl.g:6110:1: ( '[' )
            {
            // InternalCssExtDsl.g:6110:1: ( '[' )
            // InternalCssExtDsl.g:6111:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__0__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__1"
    // InternalCssExtDsl.g:6124:1: rule__SubstructureSelector__Group_2__1 : rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2 ;
    public final void rule__SubstructureSelector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6128:1: ( rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2 )
            // InternalCssExtDsl.g:6129:2: rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2
            {
            pushFollow(FOLLOW_48);
            rule__SubstructureSelector__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__1"


    // $ANTLR start "rule__SubstructureSelector__Group_2__1__Impl"
    // InternalCssExtDsl.g:6136:1: rule__SubstructureSelector__Group_2__1__Impl : ( ( rule__SubstructureSelector__VarAssignment_2_1 ) ) ;
    public final void rule__SubstructureSelector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6140:1: ( ( ( rule__SubstructureSelector__VarAssignment_2_1 ) ) )
            // InternalCssExtDsl.g:6141:1: ( ( rule__SubstructureSelector__VarAssignment_2_1 ) )
            {
            // InternalCssExtDsl.g:6141:1: ( ( rule__SubstructureSelector__VarAssignment_2_1 ) )
            // InternalCssExtDsl.g:6142:1: ( rule__SubstructureSelector__VarAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getVarAssignment_2_1()); 
            }
            // InternalCssExtDsl.g:6143:1: ( rule__SubstructureSelector__VarAssignment_2_1 )
            // InternalCssExtDsl.g:6143:2: rule__SubstructureSelector__VarAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__VarAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getVarAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__2"
    // InternalCssExtDsl.g:6153:1: rule__SubstructureSelector__Group_2__2 : rule__SubstructureSelector__Group_2__2__Impl ;
    public final void rule__SubstructureSelector__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6157:1: ( rule__SubstructureSelector__Group_2__2__Impl )
            // InternalCssExtDsl.g:6158:2: rule__SubstructureSelector__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__2"


    // $ANTLR start "rule__SubstructureSelector__Group_2__2__Impl"
    // InternalCssExtDsl.g:6164:1: rule__SubstructureSelector__Group_2__2__Impl : ( ']' ) ;
    public final void rule__SubstructureSelector__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6168:1: ( ( ']' ) )
            // InternalCssExtDsl.g:6169:1: ( ']' )
            {
            // InternalCssExtDsl.g:6169:1: ( ']' )
            // InternalCssExtDsl.g:6170:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group_2__2__Impl"


    // $ANTLR start "rule__Substructure__Group__0"
    // InternalCssExtDsl.g:6189:1: rule__Substructure__Group__0 : rule__Substructure__Group__0__Impl rule__Substructure__Group__1 ;
    public final void rule__Substructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6193:1: ( rule__Substructure__Group__0__Impl rule__Substructure__Group__1 )
            // InternalCssExtDsl.g:6194:2: rule__Substructure__Group__0__Impl rule__Substructure__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Substructure__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__0"


    // $ANTLR start "rule__Substructure__Group__0__Impl"
    // InternalCssExtDsl.g:6201:1: rule__Substructure__Group__0__Impl : ( ( rule__Substructure__DokuAssignment_0 )? ) ;
    public final void rule__Substructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6205:1: ( ( ( rule__Substructure__DokuAssignment_0 )? ) )
            // InternalCssExtDsl.g:6206:1: ( ( rule__Substructure__DokuAssignment_0 )? )
            {
            // InternalCssExtDsl.g:6206:1: ( ( rule__Substructure__DokuAssignment_0 )? )
            // InternalCssExtDsl.g:6207:1: ( rule__Substructure__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getDokuAssignment_0()); 
            }
            // InternalCssExtDsl.g:6208:1: ( rule__Substructure__DokuAssignment_0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_JDOC) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCssExtDsl.g:6208:2: rule__Substructure__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Substructure__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getDokuAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__0__Impl"


    // $ANTLR start "rule__Substructure__Group__1"
    // InternalCssExtDsl.g:6218:1: rule__Substructure__Group__1 : rule__Substructure__Group__1__Impl rule__Substructure__Group__2 ;
    public final void rule__Substructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6222:1: ( rule__Substructure__Group__1__Impl rule__Substructure__Group__2 )
            // InternalCssExtDsl.g:6223:2: rule__Substructure__Group__1__Impl rule__Substructure__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Substructure__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__1"


    // $ANTLR start "rule__Substructure__Group__1__Impl"
    // InternalCssExtDsl.g:6230:1: rule__Substructure__Group__1__Impl : ( 'substructure' ) ;
    public final void rule__Substructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6234:1: ( ( 'substructure' ) )
            // InternalCssExtDsl.g:6235:1: ( 'substructure' )
            {
            // InternalCssExtDsl.g:6235:1: ( 'substructure' )
            // InternalCssExtDsl.g:6236:1: 'substructure'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getSubstructureKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getSubstructureKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__1__Impl"


    // $ANTLR start "rule__Substructure__Group__2"
    // InternalCssExtDsl.g:6249:1: rule__Substructure__Group__2 : rule__Substructure__Group__2__Impl rule__Substructure__Group__3 ;
    public final void rule__Substructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6253:1: ( rule__Substructure__Group__2__Impl rule__Substructure__Group__3 )
            // InternalCssExtDsl.g:6254:2: rule__Substructure__Group__2__Impl rule__Substructure__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Substructure__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__2"


    // $ANTLR start "rule__Substructure__Group__2__Impl"
    // InternalCssExtDsl.g:6261:1: rule__Substructure__Group__2__Impl : ( ( rule__Substructure__NameAssignment_2 ) ) ;
    public final void rule__Substructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6265:1: ( ( ( rule__Substructure__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:6266:1: ( ( rule__Substructure__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:6266:1: ( ( rule__Substructure__NameAssignment_2 ) )
            // InternalCssExtDsl.g:6267:1: ( rule__Substructure__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:6268:1: ( rule__Substructure__NameAssignment_2 )
            // InternalCssExtDsl.g:6268:2: rule__Substructure__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__2__Impl"


    // $ANTLR start "rule__Substructure__Group__3"
    // InternalCssExtDsl.g:6278:1: rule__Substructure__Group__3 : rule__Substructure__Group__3__Impl rule__Substructure__Group__4 ;
    public final void rule__Substructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6282:1: ( rule__Substructure__Group__3__Impl rule__Substructure__Group__4 )
            // InternalCssExtDsl.g:6283:2: rule__Substructure__Group__3__Impl rule__Substructure__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Substructure__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__3"


    // $ANTLR start "rule__Substructure__Group__3__Impl"
    // InternalCssExtDsl.g:6290:1: rule__Substructure__Group__3__Impl : ( '{' ) ;
    public final void rule__Substructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6294:1: ( ( '{' ) )
            // InternalCssExtDsl.g:6295:1: ( '{' )
            {
            // InternalCssExtDsl.g:6295:1: ( '{' )
            // InternalCssExtDsl.g:6296:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__3__Impl"


    // $ANTLR start "rule__Substructure__Group__4"
    // InternalCssExtDsl.g:6309:1: rule__Substructure__Group__4 : rule__Substructure__Group__4__Impl rule__Substructure__Group__5 ;
    public final void rule__Substructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6313:1: ( rule__Substructure__Group__4__Impl rule__Substructure__Group__5 )
            // InternalCssExtDsl.g:6314:2: rule__Substructure__Group__4__Impl rule__Substructure__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__Substructure__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__4"


    // $ANTLR start "rule__Substructure__Group__4__Impl"
    // InternalCssExtDsl.g:6321:1: rule__Substructure__Group__4__Impl : ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) ) ;
    public final void rule__Substructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6325:1: ( ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) ) )
            // InternalCssExtDsl.g:6326:1: ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) )
            {
            // InternalCssExtDsl.g:6326:1: ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) )
            // InternalCssExtDsl.g:6327:1: ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* )
            {
            // InternalCssExtDsl.g:6327:1: ( ( rule__Substructure__ChildsAssignment_4 ) )
            // InternalCssExtDsl.g:6328:1: ( rule__Substructure__ChildsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }
            // InternalCssExtDsl.g:6329:1: ( rule__Substructure__ChildsAssignment_4 )
            // InternalCssExtDsl.g:6329:2: rule__Substructure__ChildsAssignment_4
            {
            pushFollow(FOLLOW_53);
            rule__Substructure__ChildsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }

            }

            // InternalCssExtDsl.g:6332:1: ( ( rule__Substructure__ChildsAssignment_4 )* )
            // InternalCssExtDsl.g:6333:1: ( rule__Substructure__ChildsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }
            // InternalCssExtDsl.g:6334:1: ( rule__Substructure__ChildsAssignment_4 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID||LA62_0==RULE_JDOC) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCssExtDsl.g:6334:2: rule__Substructure__ChildsAssignment_4
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Substructure__ChildsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__4__Impl"


    // $ANTLR start "rule__Substructure__Group__5"
    // InternalCssExtDsl.g:6345:1: rule__Substructure__Group__5 : rule__Substructure__Group__5__Impl ;
    public final void rule__Substructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6349:1: ( rule__Substructure__Group__5__Impl )
            // InternalCssExtDsl.g:6350:2: rule__Substructure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__5"


    // $ANTLR start "rule__Substructure__Group__5__Impl"
    // InternalCssExtDsl.g:6356:1: rule__Substructure__Group__5__Impl : ( '}' ) ;
    public final void rule__Substructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6360:1: ( ( '}' ) )
            // InternalCssExtDsl.g:6361:1: ( '}' )
            {
            // InternalCssExtDsl.g:6361:1: ( '}' )
            // InternalCssExtDsl.g:6362:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__Group__5__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__0"
    // InternalCssExtDsl.g:6387:1: rule__SubstructureStyleclass__Group__0 : rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1 ;
    public final void rule__SubstructureStyleclass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6391:1: ( rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1 )
            // InternalCssExtDsl.g:6392:2: rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__SubstructureStyleclass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__0"


    // $ANTLR start "rule__SubstructureStyleclass__Group__0__Impl"
    // InternalCssExtDsl.g:6399:1: rule__SubstructureStyleclass__Group__0__Impl : ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? ) ;
    public final void rule__SubstructureStyleclass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6403:1: ( ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? ) )
            // InternalCssExtDsl.g:6404:1: ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? )
            {
            // InternalCssExtDsl.g:6404:1: ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? )
            // InternalCssExtDsl.g:6405:1: ( rule__SubstructureStyleclass__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getDokuAssignment_0()); 
            }
            // InternalCssExtDsl.g:6406:1: ( rule__SubstructureStyleclass__DokuAssignment_0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_JDOC) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCssExtDsl.g:6406:2: rule__SubstructureStyleclass__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureStyleclass__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getDokuAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__0__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__1"
    // InternalCssExtDsl.g:6416:1: rule__SubstructureStyleclass__Group__1 : rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2 ;
    public final void rule__SubstructureStyleclass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6420:1: ( rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2 )
            // InternalCssExtDsl.g:6421:2: rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__SubstructureStyleclass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__1"


    // $ANTLR start "rule__SubstructureStyleclass__Group__1__Impl"
    // InternalCssExtDsl.g:6428:1: rule__SubstructureStyleclass__Group__1__Impl : ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) ) ;
    public final void rule__SubstructureStyleclass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6432:1: ( ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) ) )
            // InternalCssExtDsl.g:6433:1: ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) )
            {
            // InternalCssExtDsl.g:6433:1: ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) )
            // InternalCssExtDsl.g:6434:1: ( rule__SubstructureStyleclass__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementAssignment_1()); 
            }
            // InternalCssExtDsl.g:6435:1: ( rule__SubstructureStyleclass__ElementAssignment_1 )
            // InternalCssExtDsl.g:6435:2: rule__SubstructureStyleclass__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__ElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__1__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__2"
    // InternalCssExtDsl.g:6445:1: rule__SubstructureStyleclass__Group__2 : rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3 ;
    public final void rule__SubstructureStyleclass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6449:1: ( rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3 )
            // InternalCssExtDsl.g:6450:2: rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubstructureStyleclass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__2"


    // $ANTLR start "rule__SubstructureStyleclass__Group__2__Impl"
    // InternalCssExtDsl.g:6457:1: rule__SubstructureStyleclass__Group__2__Impl : ( 'styleclass' ) ;
    public final void rule__SubstructureStyleclass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6461:1: ( ( 'styleclass' ) )
            // InternalCssExtDsl.g:6462:1: ( 'styleclass' )
            {
            // InternalCssExtDsl.g:6462:1: ( 'styleclass' )
            // InternalCssExtDsl.g:6463:1: 'styleclass'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__2__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__3"
    // InternalCssExtDsl.g:6476:1: rule__SubstructureStyleclass__Group__3 : rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4 ;
    public final void rule__SubstructureStyleclass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6480:1: ( rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4 )
            // InternalCssExtDsl.g:6481:2: rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SubstructureStyleclass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__3"


    // $ANTLR start "rule__SubstructureStyleclass__Group__3__Impl"
    // InternalCssExtDsl.g:6488:1: rule__SubstructureStyleclass__Group__3__Impl : ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) ) ;
    public final void rule__SubstructureStyleclass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6492:1: ( ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) ) )
            // InternalCssExtDsl.g:6493:1: ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) )
            {
            // InternalCssExtDsl.g:6493:1: ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) )
            // InternalCssExtDsl.g:6494:1: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* )
            {
            // InternalCssExtDsl.g:6494:1: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) )
            // InternalCssExtDsl.g:6495:1: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }
            // InternalCssExtDsl.g:6496:1: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )
            // InternalCssExtDsl.g:6496:2: rule__SubstructureStyleclass__SelectorsAssignment_3
            {
            pushFollow(FOLLOW_55);
            rule__SubstructureStyleclass__SelectorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }

            }

            // InternalCssExtDsl.g:6499:1: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* )
            // InternalCssExtDsl.g:6500:1: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }
            // InternalCssExtDsl.g:6501:1: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==EOF||LA64_2==RULE_ID||LA64_2==RULE_JDOC||(LA64_2>=23 && LA64_2<=24)||LA64_2==38) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalCssExtDsl.g:6501:2: rule__SubstructureStyleclass__SelectorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__SubstructureStyleclass__SelectorsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__3__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__4"
    // InternalCssExtDsl.g:6512:1: rule__SubstructureStyleclass__Group__4 : rule__SubstructureStyleclass__Group__4__Impl ;
    public final void rule__SubstructureStyleclass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6516:1: ( rule__SubstructureStyleclass__Group__4__Impl )
            // InternalCssExtDsl.g:6517:2: rule__SubstructureStyleclass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__4"


    // $ANTLR start "rule__SubstructureStyleclass__Group__4__Impl"
    // InternalCssExtDsl.g:6523:1: rule__SubstructureStyleclass__Group__4__Impl : ( ( rule__SubstructureStyleclass__Group_4__0 )? ) ;
    public final void rule__SubstructureStyleclass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6527:1: ( ( ( rule__SubstructureStyleclass__Group_4__0 )? ) )
            // InternalCssExtDsl.g:6528:1: ( ( rule__SubstructureStyleclass__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:6528:1: ( ( rule__SubstructureStyleclass__Group_4__0 )? )
            // InternalCssExtDsl.g:6529:1: ( rule__SubstructureStyleclass__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:6530:1: ( rule__SubstructureStyleclass__Group_4__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==23) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCssExtDsl.g:6530:2: rule__SubstructureStyleclass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureStyleclass__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group__4__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__0"
    // InternalCssExtDsl.g:6550:1: rule__SubstructureStyleclass__Group_4__0 : rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1 ;
    public final void rule__SubstructureStyleclass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6554:1: ( rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1 )
            // InternalCssExtDsl.g:6555:2: rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__SubstructureStyleclass__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__0"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__0__Impl"
    // InternalCssExtDsl.g:6562:1: rule__SubstructureStyleclass__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SubstructureStyleclass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6566:1: ( ( '{' ) )
            // InternalCssExtDsl.g:6567:1: ( '{' )
            {
            // InternalCssExtDsl.g:6567:1: ( '{' )
            // InternalCssExtDsl.g:6568:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__0__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__1"
    // InternalCssExtDsl.g:6581:1: rule__SubstructureStyleclass__Group_4__1 : rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2 ;
    public final void rule__SubstructureStyleclass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6585:1: ( rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2 )
            // InternalCssExtDsl.g:6586:2: rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2
            {
            pushFollow(FOLLOW_52);
            rule__SubstructureStyleclass__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__1"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__1__Impl"
    // InternalCssExtDsl.g:6593:1: rule__SubstructureStyleclass__Group_4__1__Impl : ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) ) ;
    public final void rule__SubstructureStyleclass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6597:1: ( ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) ) )
            // InternalCssExtDsl.g:6598:1: ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) )
            {
            // InternalCssExtDsl.g:6598:1: ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) )
            // InternalCssExtDsl.g:6599:1: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* )
            {
            // InternalCssExtDsl.g:6599:1: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) )
            // InternalCssExtDsl.g:6600:1: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:6601:1: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )
            // InternalCssExtDsl.g:6601:2: rule__SubstructureStyleclass__ChildsAssignment_4_1
            {
            pushFollow(FOLLOW_53);
            rule__SubstructureStyleclass__ChildsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }

            }

            // InternalCssExtDsl.g:6604:1: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* )
            // InternalCssExtDsl.g:6605:1: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:6606:1: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID||LA66_0==RULE_JDOC) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalCssExtDsl.g:6606:2: rule__SubstructureStyleclass__ChildsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__SubstructureStyleclass__ChildsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__1__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__2"
    // InternalCssExtDsl.g:6617:1: rule__SubstructureStyleclass__Group_4__2 : rule__SubstructureStyleclass__Group_4__2__Impl ;
    public final void rule__SubstructureStyleclass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6621:1: ( rule__SubstructureStyleclass__Group_4__2__Impl )
            // InternalCssExtDsl.g:6622:2: rule__SubstructureStyleclass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__2"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__2__Impl"
    // InternalCssExtDsl.g:6628:1: rule__SubstructureStyleclass__Group_4__2__Impl : ( '}' ) ;
    public final void rule__SubstructureStyleclass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6632:1: ( ( '}' ) )
            // InternalCssExtDsl.g:6633:1: ( '}' )
            {
            // InternalCssExtDsl.g:6633:1: ( '}' )
            // InternalCssExtDsl.g:6634:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__2__Impl"


    // $ANTLR start "rule__CssExtension__ImportsAssignment_0"
    // InternalCssExtDsl.g:6654:1: rule__CssExtension__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6658:1: ( ( ruleImport ) )
            // InternalCssExtDsl.g:6659:1: ( ruleImport )
            {
            // InternalCssExtDsl.g:6659:1: ( ruleImport )
            // InternalCssExtDsl.g:6660:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__ImportsAssignment_0"


    // $ANTLR start "rule__CssExtension__PackageDefAssignment_1"
    // InternalCssExtDsl.g:6669:1: rule__CssExtension__PackageDefAssignment_1 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6673:1: ( ( rulePackageDefinition ) )
            // InternalCssExtDsl.g:6674:1: ( rulePackageDefinition )
            {
            // InternalCssExtDsl.g:6674:1: ( rulePackageDefinition )
            // InternalCssExtDsl.g:6675:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssExtension__PackageDefAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalCssExtDsl.g:6684:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6688:1: ( ( ruleQualifiedNameWithWildCard ) )
            // InternalCssExtDsl.g:6689:1: ( ruleQualifiedNameWithWildCard )
            {
            // InternalCssExtDsl.g:6689:1: ( ruleQualifiedNameWithWildCard )
            // InternalCssExtDsl.g:6690:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDefinition__DokuAssignment_0_0"
    // InternalCssExtDsl.g:6699:1: rule__PackageDefinition__DokuAssignment_0_0 : ( ruleDoku ) ;
    public final void rule__PackageDefinition__DokuAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6703:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6704:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6704:1: ( ruleDoku )
            // InternalCssExtDsl.g:6705:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__DokuAssignment_0_0"


    // $ANTLR start "rule__PackageDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6714:1: rule__PackageDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6718:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6719:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:6719:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6720:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__NameAssignment_2"


    // $ANTLR start "rule__PackageDefinition__RulesAssignment_4_0"
    // InternalCssExtDsl.g:6729:1: rule__PackageDefinition__RulesAssignment_4_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6733:1: ( ( ruleCSSRuleDefinition ) )
            // InternalCssExtDsl.g:6734:1: ( ruleCSSRuleDefinition )
            {
            // InternalCssExtDsl.g:6734:1: ( ruleCSSRuleDefinition )
            // InternalCssExtDsl.g:6735:1: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__RulesAssignment_4_0"


    // $ANTLR start "rule__PackageDefinition__SubpackagesAssignment_4_1"
    // InternalCssExtDsl.g:6744:1: rule__PackageDefinition__SubpackagesAssignment_4_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6748:1: ( ( rulePackageDefinition ) )
            // InternalCssExtDsl.g:6749:1: ( rulePackageDefinition )
            {
            // InternalCssExtDsl.g:6749:1: ( rulePackageDefinition )
            // InternalCssExtDsl.g:6750:1: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__SubpackagesAssignment_4_1"


    // $ANTLR start "rule__PackageDefinition__ElementsAssignment_4_2"
    // InternalCssExtDsl.g:6759:1: rule__PackageDefinition__ElementsAssignment_4_2 : ( ruleElementDefinition ) ;
    public final void rule__PackageDefinition__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6763:1: ( ( ruleElementDefinition ) )
            // InternalCssExtDsl.g:6764:1: ( ruleElementDefinition )
            {
            // InternalCssExtDsl.g:6764:1: ( ruleElementDefinition )
            // InternalCssExtDsl.g:6765:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDefinition__ElementsAssignment_4_2"


    // $ANTLR start "rule__Doku__ContentAssignment"
    // InternalCssExtDsl.g:6774:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6778:1: ( ( RULE_JDOC ) )
            // InternalCssExtDsl.g:6779:1: ( RULE_JDOC )
            {
            // InternalCssExtDsl.g:6779:1: ( RULE_JDOC )
            // InternalCssExtDsl.g:6780:1: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doku__ContentAssignment"


    // $ANTLR start "rule__CSSType__DokuAssignment_0_1_0"
    // InternalCssExtDsl.g:6789:1: rule__CSSType__DokuAssignment_0_1_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6793:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6794:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6794:1: ( ruleDoku )
            // InternalCssExtDsl.g:6795:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__DokuAssignment_0_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_0_2"
    // InternalCssExtDsl.g:6804:1: rule__CSSType__TypeAssignment_0_2 : ( ( '@INT' ) ) ;
    public final void rule__CSSType__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6808:1: ( ( ( '@INT' ) ) )
            // InternalCssExtDsl.g:6809:1: ( ( '@INT' ) )
            {
            // InternalCssExtDsl.g:6809:1: ( ( '@INT' ) )
            // InternalCssExtDsl.g:6810:1: ( '@INT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }
            // InternalCssExtDsl.g:6811:1: ( '@INT' )
            // InternalCssExtDsl.g:6812:1: '@INT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_0_2"


    // $ANTLR start "rule__CSSType__FromAssignment_0_5"
    // InternalCssExtDsl.g:6827:1: rule__CSSType__FromAssignment_0_5 : ( RULE_INT ) ;
    public final void rule__CSSType__FromAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6831:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:6832:1: ( RULE_INT )
            {
            // InternalCssExtDsl.g:6832:1: ( RULE_INT )
            // InternalCssExtDsl.g:6833:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__FromAssignment_0_5"


    // $ANTLR start "rule__CSSType__ToAssignment_0_9"
    // InternalCssExtDsl.g:6842:1: rule__CSSType__ToAssignment_0_9 : ( RULE_INT ) ;
    public final void rule__CSSType__ToAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6846:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:6847:1: ( RULE_INT )
            {
            // InternalCssExtDsl.g:6847:1: ( RULE_INT )
            // InternalCssExtDsl.g:6848:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__ToAssignment_0_9"


    // $ANTLR start "rule__CSSType__DokuAssignment_1_1_0"
    // InternalCssExtDsl.g:6857:1: rule__CSSType__DokuAssignment_1_1_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6861:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6862:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6862:1: ( ruleDoku )
            // InternalCssExtDsl.g:6863:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__DokuAssignment_1_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_1_2"
    // InternalCssExtDsl.g:6872:1: rule__CSSType__TypeAssignment_1_2 : ( ( '@NUM' ) ) ;
    public final void rule__CSSType__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6876:1: ( ( ( '@NUM' ) ) )
            // InternalCssExtDsl.g:6877:1: ( ( '@NUM' ) )
            {
            // InternalCssExtDsl.g:6877:1: ( ( '@NUM' ) )
            // InternalCssExtDsl.g:6878:1: ( '@NUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }
            // InternalCssExtDsl.g:6879:1: ( '@NUM' )
            // InternalCssExtDsl.g:6880:1: '@NUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_1_2"


    // $ANTLR start "rule__CSSType__FromAssignment_1_5"
    // InternalCssExtDsl.g:6895:1: rule__CSSType__FromAssignment_1_5 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__FromAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6899:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:6900:1: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:6900:1: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:6901:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__FromAssignment_1_5"


    // $ANTLR start "rule__CSSType__ToAssignment_1_9"
    // InternalCssExtDsl.g:6910:1: rule__CSSType__ToAssignment_1_9 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__ToAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6914:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:6915:1: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:6915:1: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:6916:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__ToAssignment_1_9"


    // $ANTLR start "rule__CSSType__DokuAssignment_2_0_0"
    // InternalCssExtDsl.g:6925:1: rule__CSSType__DokuAssignment_2_0_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6929:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6930:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6930:1: ( ruleDoku )
            // InternalCssExtDsl.g:6931:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__DokuAssignment_2_0_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_1_0_0"
    // InternalCssExtDsl.g:6940:1: rule__CSSType__TypeAssignment_2_1_0_0 : ( ( '@INT' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6944:1: ( ( ( '@INT' ) ) )
            // InternalCssExtDsl.g:6945:1: ( ( '@INT' ) )
            {
            // InternalCssExtDsl.g:6945:1: ( ( '@INT' ) )
            // InternalCssExtDsl.g:6946:1: ( '@INT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0()); 
            }
            // InternalCssExtDsl.g:6947:1: ( '@INT' )
            // InternalCssExtDsl.g:6948:1: '@INT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_2_1_0_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_1_1_0"
    // InternalCssExtDsl.g:6963:1: rule__CSSType__TypeAssignment_2_1_1_0 : ( ( '@NUM' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6967:1: ( ( ( '@NUM' ) ) )
            // InternalCssExtDsl.g:6968:1: ( ( '@NUM' ) )
            {
            // InternalCssExtDsl.g:6968:1: ( ( '@NUM' ) )
            // InternalCssExtDsl.g:6969:1: ( '@NUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0()); 
            }
            // InternalCssExtDsl.g:6970:1: ( '@NUM' )
            // InternalCssExtDsl.g:6971:1: '@NUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_2_1_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_1_2_0"
    // InternalCssExtDsl.g:6986:1: rule__CSSType__TypeAssignment_2_1_2_0 : ( ( '@STRING' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:6990:1: ( ( ( '@STRING' ) ) )
            // InternalCssExtDsl.g:6991:1: ( ( '@STRING' ) )
            {
            // InternalCssExtDsl.g:6991:1: ( ( '@STRING' ) )
            // InternalCssExtDsl.g:6992:1: ( '@STRING' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0()); 
            }
            // InternalCssExtDsl.g:6993:1: ( '@STRING' )
            // InternalCssExtDsl.g:6994:1: '@STRING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_2_1_2_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_1_3_0"
    // InternalCssExtDsl.g:7009:1: rule__CSSType__TypeAssignment_2_1_3_0 : ( ( '@URL' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7013:1: ( ( ( '@URL' ) ) )
            // InternalCssExtDsl.g:7014:1: ( ( '@URL' ) )
            {
            // InternalCssExtDsl.g:7014:1: ( ( '@URL' ) )
            // InternalCssExtDsl.g:7015:1: ( '@URL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0()); 
            }
            // InternalCssExtDsl.g:7016:1: ( '@URL' )
            // InternalCssExtDsl.g:7017:1: '@URL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__TypeAssignment_2_1_3_0"


    // $ANTLR start "rule__ElementDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:7032:1: rule__ElementDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__ElementDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7036:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7037:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7037:1: ( ruleDoku )
            // InternalCssExtDsl.g:7038:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__DokuAssignment_1"


    // $ANTLR start "rule__ElementDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:7047:1: rule__ElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7051:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7052:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:7052:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7053:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_1"
    // InternalCssExtDsl.g:7062:1: rule__ElementDefinition__SuperAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7066:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:7067:1: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:7067:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7068:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }
            // InternalCssExtDsl.g:7069:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7070:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_1"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_2_1"
    // InternalCssExtDsl.g:7081:1: rule__ElementDefinition__SuperAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7085:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:7086:1: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:7086:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7087:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }
            // InternalCssExtDsl.g:7088:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7089:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_2_1"


    // $ANTLR start "rule__ElementDefinition__StyleclassAssignment_4_1"
    // InternalCssExtDsl.g:7100:1: rule__ElementDefinition__StyleclassAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__ElementDefinition__StyleclassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7104:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7105:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7105:1: ( RULE_ID )
            // InternalCssExtDsl.g:7106:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__StyleclassAssignment_4_1"


    // $ANTLR start "rule__ElementDefinition__PropertiesAssignment_6_0"
    // InternalCssExtDsl.g:7115:1: rule__ElementDefinition__PropertiesAssignment_6_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDefinition__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7119:1: ( ( rulePropertyDefinition ) )
            // InternalCssExtDsl.g:7120:1: ( rulePropertyDefinition )
            {
            // InternalCssExtDsl.g:7120:1: ( rulePropertyDefinition )
            // InternalCssExtDsl.g:7121:1: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__PropertiesAssignment_6_0"


    // $ANTLR start "rule__ElementDefinition__PseudoClassesAssignment_6_1"
    // InternalCssExtDsl.g:7130:1: rule__ElementDefinition__PseudoClassesAssignment_6_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDefinition__PseudoClassesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7134:1: ( ( rulePseudoClassDefinition ) )
            // InternalCssExtDsl.g:7135:1: ( rulePseudoClassDefinition )
            {
            // InternalCssExtDsl.g:7135:1: ( rulePseudoClassDefinition )
            // InternalCssExtDsl.g:7136:1: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__PseudoClassesAssignment_6_1"


    // $ANTLR start "rule__ElementDefinition__SubstructuresAssignment_6_2"
    // InternalCssExtDsl.g:7145:1: rule__ElementDefinition__SubstructuresAssignment_6_2 : ( ruleSubstructure ) ;
    public final void rule__ElementDefinition__SubstructuresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7149:1: ( ( ruleSubstructure ) )
            // InternalCssExtDsl.g:7150:1: ( ruleSubstructure )
            {
            // InternalCssExtDsl.g:7150:1: ( ruleSubstructure )
            // InternalCssExtDsl.g:7151:1: ruleSubstructure
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__SubstructuresAssignment_6_2"


    // $ANTLR start "rule__PropertyDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:7160:1: rule__PropertyDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7164:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7165:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7165:1: ( ruleDoku )
            // InternalCssExtDsl.g:7166:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:7175:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7179:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7180:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:7180:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7181:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__RuleAssignment_3"
    // InternalCssExtDsl.g:7190:1: rule__PropertyDefinition__RuleAssignment_3 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7194:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:7195:1: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:7195:1: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:7196:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__RuleAssignment_3"


    // $ANTLR start "rule__PropertyDefinition__DefaultAssignment_4_1"
    // InternalCssExtDsl.g:7205:1: rule__PropertyDefinition__DefaultAssignment_4_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7209:1: ( ( ruleCSSDefaultValue ) )
            // InternalCssExtDsl.g:7210:1: ( ruleCSSDefaultValue )
            {
            // InternalCssExtDsl.g:7210:1: ( ruleCSSDefaultValue )
            // InternalCssExtDsl.g:7211:1: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DefaultAssignment_4_1"


    // $ANTLR start "rule__PseudoClassDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:7220:1: rule__PseudoClassDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7224:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7225:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7225:1: ( ruleDoku )
            // InternalCssExtDsl.g:7226:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PseudoClassDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:7235:1: rule__PseudoClassDefinition__NameAssignment_2 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7239:1: ( ( RULE_PSEUDO ) )
            // InternalCssExtDsl.g:7240:1: ( RULE_PSEUDO )
            {
            // InternalCssExtDsl.g:7240:1: ( RULE_PSEUDO )
            // InternalCssExtDsl.g:7241:1: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleRef__DokuAssignment_0_0"
    // InternalCssExtDsl.g:7250:1: rule__CSSRuleRef__DokuAssignment_0_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleRef__DokuAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7254:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7255:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7255:1: ( ruleDoku )
            // InternalCssExtDsl.g:7256:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__DokuAssignment_0_0"


    // $ANTLR start "rule__CSSRuleRef__RefAssignment_2"
    // InternalCssExtDsl.g:7265:1: rule__CSSRuleRef__RefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7269:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:7270:1: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:7270:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7271:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
            }
            // InternalCssExtDsl.g:7272:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7273:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefDefinitionQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefDefinitionQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRef__RefAssignment_2"


    // $ANTLR start "rule__CSSRuleDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:7284:1: rule__CSSRuleDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7288:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7289:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7289:1: ( ruleDoku )
            // InternalCssExtDsl.g:7290:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__DokuAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:7299:1: rule__CSSRuleDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7303:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7304:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:7304:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7305:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleDefinition__RuleAssignment_4_0"
    // InternalCssExtDsl.g:7314:1: rule__CSSRuleDefinition__RuleAssignment_4_0 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RuleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7318:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:7319:1: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:7319:1: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:7320:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__RuleAssignment_4_0"


    // $ANTLR start "rule__CSSRuleDefinition__FuncAssignment_4_1"
    // InternalCssExtDsl.g:7329:1: rule__CSSRuleDefinition__FuncAssignment_4_1 : ( ruleCSSRuleFunc ) ;
    public final void rule__CSSRuleDefinition__FuncAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7333:1: ( ( ruleCSSRuleFunc ) )
            // InternalCssExtDsl.g:7334:1: ( ruleCSSRuleFunc )
            {
            // InternalCssExtDsl.g:7334:1: ( ruleCSSRuleFunc )
            // InternalCssExtDsl.g:7335:1: ruleCSSRuleFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__FuncAssignment_4_1"


    // $ANTLR start "rule__CSSRuleFunc__NameAssignment_1"
    // InternalCssExtDsl.g:7344:1: rule__CSSRuleFunc__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__CSSRuleFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7348:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:7349:1: ( ruleValidID )
            {
            // InternalCssExtDsl.g:7349:1: ( ruleValidID )
            // InternalCssExtDsl.g:7350:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleFunc__ParamsAssignment_4"
    // InternalCssExtDsl.g:7359:1: rule__CSSRuleFunc__ParamsAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleFunc__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7363:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:7364:1: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:7364:1: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:7365:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__ParamsAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // InternalCssExtDsl.g:7374:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7378:1: ( ( ruleCSSRuleXor ) )
            // InternalCssExtDsl.g:7379:1: ( ruleCSSRuleXor )
            {
            // InternalCssExtDsl.g:7379:1: ( ruleCSSRuleXor )
            // InternalCssExtDsl.g:7380:1: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__OrsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleXor__XorsAssignment_1_1_1"
    // InternalCssExtDsl.g:7389:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7393:1: ( ( ruleCSSRuleConcat ) )
            // InternalCssExtDsl.g:7394:1: ( ruleCSSRuleConcat )
            {
            // InternalCssExtDsl.g:7394:1: ( ruleCSSRuleConcat )
            // InternalCssExtDsl.g:7395:1: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__XorsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_1_1"
    // InternalCssExtDsl.g:7404:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRuleConcatWithoutSpace ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7408:1: ( ( ruleCSSRuleConcatWithoutSpace ) )
            // InternalCssExtDsl.g:7409:1: ( ruleCSSRuleConcatWithoutSpace )
            {
            // InternalCssExtDsl.g:7409:1: ( ruleCSSRuleConcatWithoutSpace )
            // InternalCssExtDsl.g:7410:1: ruleCSSRuleConcatWithoutSpace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_1_1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1"
    // InternalCssExtDsl.g:7419:1: rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7423:1: ( ( ruleCSSRulePostfix ) )
            // InternalCssExtDsl.g:7424:1: ( ruleCSSRulePostfix )
            {
            // InternalCssExtDsl.g:7424:1: ( ruleCSSRulePostfix )
            // InternalCssExtDsl.g:7425:1: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAssignment_1_1"
    // InternalCssExtDsl.g:7434:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7438:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // InternalCssExtDsl.g:7439:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalCssExtDsl.g:7439:1: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // InternalCssExtDsl.g:7440:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // InternalCssExtDsl.g:7441:1: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // InternalCssExtDsl.g:7441:2: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__CardinalityAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAssignment_1_1"


    // $ANTLR start "rule__CSSRuleBracket__InnerAssignment_2"
    // InternalCssExtDsl.g:7450:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7454:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:7455:1: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:7455:1: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:7456:1: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__InnerAssignment_2"


    // $ANTLR start "rule__CSSRulePrimary__ValueAssignment_6_1"
    // InternalCssExtDsl.g:7465:1: rule__CSSRulePrimary__ValueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__CSSRulePrimary__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7469:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:7470:1: ( RULE_INT )
            {
            // InternalCssExtDsl.g:7470:1: ( RULE_INT )
            // InternalCssExtDsl.g:7471:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__ValueAssignment_6_1"


    // $ANTLR start "rule__CSSRuleRegex__RegexAssignment_1"
    // InternalCssExtDsl.g:7480:1: rule__CSSRuleRegex__RegexAssignment_1 : ( RULE_REGEX ) ;
    public final void rule__CSSRuleRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7484:1: ( ( RULE_REGEX ) )
            // InternalCssExtDsl.g:7485:1: ( RULE_REGEX )
            {
            // InternalCssExtDsl.g:7485:1: ( RULE_REGEX )
            // InternalCssExtDsl.g:7486:1: RULE_REGEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGEX,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__RegexAssignment_1"


    // $ANTLR start "rule__CSSRuleLiteral__DokuAssignment_1_0"
    // InternalCssExtDsl.g:7495:1: rule__CSSRuleLiteral__DokuAssignment_1_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleLiteral__DokuAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7499:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7500:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7500:1: ( ruleDoku )
            // InternalCssExtDsl.g:7501:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__DokuAssignment_1_0"


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_2"
    // InternalCssExtDsl.g:7510:1: rule__CSSRuleLiteral__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7514:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7515:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7515:1: ( RULE_ID )
            // InternalCssExtDsl.g:7516:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__ValueAssignment_2"


    // $ANTLR start "rule__CSSRuleSymbol__DokuAssignment_1_0"
    // InternalCssExtDsl.g:7525:1: rule__CSSRuleSymbol__DokuAssignment_1_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleSymbol__DokuAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7529:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7530:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7530:1: ( ruleDoku )
            // InternalCssExtDsl.g:7531:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__DokuAssignment_1_0"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAssignment_2"
    // InternalCssExtDsl.g:7540:1: rule__CSSRuleSymbol__SymbolAssignment_2 : ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) ) ;
    public final void rule__CSSRuleSymbol__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7544:1: ( ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) ) )
            // InternalCssExtDsl.g:7545:1: ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) )
            {
            // InternalCssExtDsl.g:7545:1: ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) )
            // InternalCssExtDsl.g:7546:1: ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_2_0()); 
            }
            // InternalCssExtDsl.g:7547:1: ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 )
            // InternalCssExtDsl.g:7547:2: rule__CSSRuleSymbol__SymbolAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__SymbolAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__ValAssignment_0_1"
    // InternalCssExtDsl.g:7556:1: rule__CSSDefaultValue__ValAssignment_0_1 : ( ruleCSSRuleLiteral ) ;
    public final void rule__CSSDefaultValue__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7560:1: ( ( ruleCSSRuleLiteral ) )
            // InternalCssExtDsl.g:7561:1: ( ruleCSSRuleLiteral )
            {
            // InternalCssExtDsl.g:7561:1: ( ruleCSSRuleLiteral )
            // InternalCssExtDsl.g:7562:1: ruleCSSRuleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__ValAssignment_0_1"


    // $ANTLR start "rule__CSSDefaultValue__IvalAssignment_1"
    // InternalCssExtDsl.g:7571:1: rule__CSSDefaultValue__IvalAssignment_1 : ( RULE_INT ) ;
    public final void rule__CSSDefaultValue__IvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7575:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:7576:1: ( RULE_INT )
            {
            // InternalCssExtDsl.g:7576:1: ( RULE_INT )
            // InternalCssExtDsl.g:7577:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__IvalAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__DvalAssignment_2"
    // InternalCssExtDsl.g:7586:1: rule__CSSDefaultValue__DvalAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__CSSDefaultValue__DvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7590:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:7591:1: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:7591:1: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:7592:1: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__DvalAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__SvalAssignment_3"
    // InternalCssExtDsl.g:7601:1: rule__CSSDefaultValue__SvalAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CSSDefaultValue__SvalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7605:1: ( ( RULE_STRING ) )
            // InternalCssExtDsl.g:7606:1: ( RULE_STRING )
            {
            // InternalCssExtDsl.g:7606:1: ( RULE_STRING )
            // InternalCssExtDsl.g:7607:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__SvalAssignment_3"


    // $ANTLR start "rule__SubstructureSelector__SelectorNameAssignment_1"
    // InternalCssExtDsl.g:7616:1: rule__SubstructureSelector__SelectorNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubstructureSelector__SelectorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7620:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7621:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7621:1: ( RULE_ID )
            // InternalCssExtDsl.g:7622:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__SelectorNameAssignment_1"


    // $ANTLR start "rule__SubstructureSelector__VarAssignment_2_1"
    // InternalCssExtDsl.g:7631:1: rule__SubstructureSelector__VarAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__SubstructureSelector__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7635:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7636:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7636:1: ( RULE_ID )
            // InternalCssExtDsl.g:7637:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__VarAssignment_2_1"


    // $ANTLR start "rule__Substructure__DokuAssignment_0"
    // InternalCssExtDsl.g:7646:1: rule__Substructure__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__Substructure__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7650:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7651:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7651:1: ( ruleDoku )
            // InternalCssExtDsl.g:7652:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__DokuAssignment_0"


    // $ANTLR start "rule__Substructure__NameAssignment_2"
    // InternalCssExtDsl.g:7661:1: rule__Substructure__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Substructure__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7665:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7666:1: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7666:1: ( RULE_ID )
            // InternalCssExtDsl.g:7667:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__NameAssignment_2"


    // $ANTLR start "rule__Substructure__ChildsAssignment_4"
    // InternalCssExtDsl.g:7676:1: rule__Substructure__ChildsAssignment_4 : ( ruleSubstructureStyleclass ) ;
    public final void rule__Substructure__ChildsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7680:1: ( ( ruleSubstructureStyleclass ) )
            // InternalCssExtDsl.g:7681:1: ( ruleSubstructureStyleclass )
            {
            // InternalCssExtDsl.g:7681:1: ( ruleSubstructureStyleclass )
            // InternalCssExtDsl.g:7682:1: ruleSubstructureStyleclass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substructure__ChildsAssignment_4"


    // $ANTLR start "rule__SubstructureStyleclass__DokuAssignment_0"
    // InternalCssExtDsl.g:7691:1: rule__SubstructureStyleclass__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__SubstructureStyleclass__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7695:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7696:1: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7696:1: ( ruleDoku )
            // InternalCssExtDsl.g:7697:1: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__DokuAssignment_0"


    // $ANTLR start "rule__SubstructureStyleclass__ElementAssignment_1"
    // InternalCssExtDsl.g:7706:1: rule__SubstructureStyleclass__ElementAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubstructureStyleclass__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7710:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:7711:1: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:7711:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7712:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
            }
            // InternalCssExtDsl.g:7713:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7714:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__ElementAssignment_1"


    // $ANTLR start "rule__SubstructureStyleclass__SelectorsAssignment_3"
    // InternalCssExtDsl.g:7725:1: rule__SubstructureStyleclass__SelectorsAssignment_3 : ( ruleSubstructureSelector ) ;
    public final void rule__SubstructureStyleclass__SelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7729:1: ( ( ruleSubstructureSelector ) )
            // InternalCssExtDsl.g:7730:1: ( ruleSubstructureSelector )
            {
            // InternalCssExtDsl.g:7730:1: ( ruleSubstructureSelector )
            // InternalCssExtDsl.g:7731:1: ruleSubstructureSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__SelectorsAssignment_3"


    // $ANTLR start "rule__SubstructureStyleclass__ChildsAssignment_4_1"
    // InternalCssExtDsl.g:7740:1: rule__SubstructureStyleclass__ChildsAssignment_4_1 : ( ruleSubstructureStyleclass ) ;
    public final void rule__SubstructureStyleclass__ChildsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalCssExtDsl.g:7744:1: ( ( ruleSubstructureStyleclass ) )
            // InternalCssExtDsl.g:7745:1: ( ruleSubstructureStyleclass )
            {
            // InternalCssExtDsl.g:7745:1: ( ruleSubstructureStyleclass )
            // InternalCssExtDsl.g:7746:1: ruleSubstructureStyleclass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureStyleclass__ChildsAssignment_4_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\2\4\1\25\1\uffff\1\4\2\uffff\1\25";
    static final String dfa_3s = "\2\26\1\42\1\uffff\1\4\2\uffff\1\42";
    static final String dfa_4s = "\3\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1\17\uffff\1\3",
            "\1\2\1\3\20\uffff\1\3",
            "\1\4\1\uffff\1\6\4\uffff\2\6\4\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\6\4\uffff\2\6\4\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "985:1: rule__PackageDefinition__Alternatives_4 : ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) );";
        }
    }
    static final String dfa_7s = "\2\uffff\2\4\4\uffff";
    static final String dfa_8s = "\1\6\1\5\2\4\1\uffff\1\5\2\uffff";
    static final String dfa_9s = "\4\54\1\uffff\1\54\2\uffff";
    static final String dfa_10s = "\4\uffff\1\3\1\uffff\1\1\1\2";
    static final String[] dfa_11s = {
            "\1\1\42\uffff\1\2\1\3\2\4",
            "\1\5\43\uffff\1\2\1\3\2\4",
            "\4\4\2\uffff\1\4\4\uffff\5\4\5\uffff\1\6\1\uffff\1\4\2\uffff\3\4\2\uffff\5\4\1\uffff\4\4",
            "\4\4\2\uffff\1\4\4\uffff\5\4\5\uffff\1\7\1\uffff\1\4\2\uffff\3\4\2\uffff\5\4\1\uffff\4\4",
            "",
            "\1\5\43\uffff\1\2\1\3\2\4",
            "",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "1013:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) );";
        }
    }
    static final String dfa_12s = "\12\uffff";
    static final String dfa_13s = "\2\4\7\uffff\1\4";
    static final String dfa_14s = "\2\54\7\uffff\1\54";
    static final String dfa_15s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String dfa_16s = "\12\uffff}>";
    static final String[] dfa_17s = {
            "\1\4\1\uffff\1\1\1\10\2\uffff\1\7\7\uffff\2\5\14\uffff\1\2\5\uffff\1\3\2\uffff\4\6",
            "\1\4\1\11\14\uffff\2\5\14\uffff\1\2\10\uffff\4\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\11\14\uffff\2\5\14\uffff\1\2\10\uffff\4\6"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1159:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001400050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400052L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010001000250L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000252L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001E41000C04D0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000009D0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001E41000C04F0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00001E41000C04D2L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000250L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000012L});

}