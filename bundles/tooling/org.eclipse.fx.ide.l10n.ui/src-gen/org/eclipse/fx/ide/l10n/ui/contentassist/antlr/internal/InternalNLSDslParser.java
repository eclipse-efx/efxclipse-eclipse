package org.eclipse.fx.ide.l10n.ui.contentassist.antlr.internal; 

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
import org.eclipse.fx.ide.l10n.services.NLSDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNLSDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", "RULE_RICH_TEXT_INBETWEEN", "RULE_STRING", "RULE_IN_RICH_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ANY'", "'NUMBER'", "'DATE'", "'TEMPORAL'", "'{'", "'}'", "'package'", "'bundle'", "'default'", "'included-bundles'", "','", "'formatter'", "'('", "')'", "'['", "']'", "':'", "'.'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_IN_RICH_STRING=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_RICH_TEXT=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_RICH_TEXT_END=7;
    public static final int RULE_RICH_TEXT_START=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_RICH_TEXT_INBETWEEN=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNLSDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNLSDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNLSDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g"; }


     
     	private NLSDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(NLSDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleNLS"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:61:1: entryRuleNLS : ruleNLS EOF ;
    public final void entryRuleNLS() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:62:1: ( ruleNLS EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:63:1: ruleNLS EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSRule()); 
            }
            pushFollow(FOLLOW_ruleNLS_in_entryRuleNLS67);
            ruleNLS();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLS74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNLS"


    // $ANTLR start "ruleNLS"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:70:1: ruleNLS : ( ( rule__NLS__Group__0 ) ) ;
    public final void ruleNLS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:74:2: ( ( ( rule__NLS__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:75:1: ( ( rule__NLS__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:75:1: ( ( rule__NLS__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:76:1: ( rule__NLS__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:77:1: ( rule__NLS__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:77:2: rule__NLS__Group__0
            {
            pushFollow(FOLLOW_rule__NLS__Group__0_in_ruleNLS100);
            rule__NLS__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getGroup()); 
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
    // $ANTLR end "ruleNLS"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:89:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:90:1: ( rulePackageDeclaration EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:91:1: rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration127);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration134); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:98:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:102:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:103:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:103:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:104:1: ( rule__PackageDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:105:1: ( rule__PackageDeclaration__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:105:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration160);
            rule__PackageDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getGroup()); 
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleNLSBundle"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:117:1: entryRuleNLSBundle : ruleNLSBundle EOF ;
    public final void entryRuleNLSBundle() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:118:1: ( ruleNLSBundle EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:119:1: ruleNLSBundle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleRule()); 
            }
            pushFollow(FOLLOW_ruleNLSBundle_in_entryRuleNLSBundle187);
            ruleNLSBundle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLSBundle194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNLSBundle"


    // $ANTLR start "ruleNLSBundle"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:126:1: ruleNLSBundle : ( ( rule__NLSBundle__Group__0 ) ) ;
    public final void ruleNLSBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:130:2: ( ( ( rule__NLSBundle__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:131:1: ( ( rule__NLSBundle__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:131:1: ( ( rule__NLSBundle__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:132:1: ( rule__NLSBundle__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:133:1: ( rule__NLSBundle__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:133:2: rule__NLSBundle__Group__0
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__0_in_ruleNLSBundle220);
            rule__NLSBundle__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getGroup()); 
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
    // $ANTLR end "ruleNLSBundle"


    // $ANTLR start "entryRuleNLSFormatter"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:145:1: entryRuleNLSFormatter : ruleNLSFormatter EOF ;
    public final void entryRuleNLSFormatter() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:146:1: ( ruleNLSFormatter EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:147:1: ruleNLSFormatter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterRule()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter247);
            ruleNLSFormatter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLSFormatter254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNLSFormatter"


    // $ANTLR start "ruleNLSFormatter"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:154:1: ruleNLSFormatter : ( ( rule__NLSFormatter__Group__0 ) ) ;
    public final void ruleNLSFormatter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:158:2: ( ( ( rule__NLSFormatter__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:159:1: ( ( rule__NLSFormatter__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:159:1: ( ( rule__NLSFormatter__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:160:1: ( rule__NLSFormatter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:161:1: ( rule__NLSFormatter__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:161:2: rule__NLSFormatter__Group__0
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__0_in_ruleNLSFormatter280);
            rule__NLSFormatter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getGroup()); 
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
    // $ANTLR end "ruleNLSFormatter"


    // $ANTLR start "entryRuleMessageEntry"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:173:1: entryRuleMessageEntry : ruleMessageEntry EOF ;
    public final void entryRuleMessageEntry() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:174:1: ( ruleMessageEntry EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:175:1: ruleMessageEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryRule()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry307);
            ruleMessageEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageEntry314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessageEntry"


    // $ANTLR start "ruleMessageEntry"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:182:1: ruleMessageEntry : ( ( rule__MessageEntry__Group__0 ) ) ;
    public final void ruleMessageEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:186:2: ( ( ( rule__MessageEntry__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:187:1: ( ( rule__MessageEntry__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:187:1: ( ( rule__MessageEntry__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:188:1: ( rule__MessageEntry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:189:1: ( rule__MessageEntry__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:189:2: rule__MessageEntry__Group__0
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__0_in_ruleMessageEntry340);
            rule__MessageEntry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getGroup()); 
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
    // $ANTLR end "ruleMessageEntry"


    // $ANTLR start "entryRuleMessageParam"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:201:1: entryRuleMessageParam : ruleMessageParam EOF ;
    public final void entryRuleMessageParam() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:202:1: ( ruleMessageParam EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:203:1: ruleMessageParam EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamRule()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_entryRuleMessageParam367);
            ruleMessageParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageParam374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessageParam"


    // $ANTLR start "ruleMessageParam"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:210:1: ruleMessageParam : ( ( rule__MessageParam__Group__0 ) ) ;
    public final void ruleMessageParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:214:2: ( ( ( rule__MessageParam__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:215:1: ( ( rule__MessageParam__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:215:1: ( ( rule__MessageParam__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:216:1: ( rule__MessageParam__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:217:1: ( rule__MessageParam__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:217:2: rule__MessageParam__Group__0
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__0_in_ruleMessageParam400);
            rule__MessageParam__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamAccess().getGroup()); 
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
    // $ANTLR end "ruleMessageParam"


    // $ANTLR start "entryRuleMessage"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:229:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:230:1: ( ruleMessage EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:231:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage427);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:238:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:242:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:243:1: ( ( rule__Message__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:243:1: ( ( rule__Message__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:244:1: ( rule__Message__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:245:1: ( rule__Message__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:245:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage460);
            rule__Message__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getGroup()); 
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleRichString"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:257:1: entryRuleRichString : ruleRichString EOF ;
    public final void entryRuleRichString() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:258:1: ( ruleRichString EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:259:1: ruleRichString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringRule()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_entryRuleRichString487);
            ruleRichString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichString494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichString"


    // $ANTLR start "ruleRichString"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:266:1: ruleRichString : ( ( rule__RichString__Alternatives ) ) ;
    public final void ruleRichString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:270:2: ( ( ( rule__RichString__Alternatives ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:271:1: ( ( rule__RichString__Alternatives ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:271:1: ( ( rule__RichString__Alternatives ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:272:1: ( rule__RichString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getAlternatives()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:273:1: ( rule__RichString__Alternatives )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:273:2: rule__RichString__Alternatives
            {
            pushFollow(FOLLOW_rule__RichString__Alternatives_in_ruleRichString520);
            rule__RichString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRichString"


    // $ANTLR start "entryRuleRichStringLiteral"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:285:1: entryRuleRichStringLiteral : ruleRichStringLiteral EOF ;
    public final void entryRuleRichStringLiteral() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:286:1: ( ruleRichStringLiteral EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:287:1: ruleRichStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral547);
            ruleRichStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteral554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichStringLiteral"


    // $ANTLR start "ruleRichStringLiteral"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:294:1: ruleRichStringLiteral : ( ( rule__RichStringLiteral__ValueAssignment ) ) ;
    public final void ruleRichStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:298:2: ( ( ( rule__RichStringLiteral__ValueAssignment ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:299:1: ( ( rule__RichStringLiteral__ValueAssignment ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:299:1: ( ( rule__RichStringLiteral__ValueAssignment ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:300:1: ( rule__RichStringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:301:1: ( rule__RichStringLiteral__ValueAssignment )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:301:2: rule__RichStringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RichStringLiteral__ValueAssignment_in_ruleRichStringLiteral580);
            rule__RichStringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleRichStringLiteral"


    // $ANTLR start "entryRuleRichStringLiteralStart"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:313:1: entryRuleRichStringLiteralStart : ruleRichStringLiteralStart EOF ;
    public final void entryRuleRichStringLiteralStart() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:314:1: ( ruleRichStringLiteralStart EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:315:1: ruleRichStringLiteralStart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralStartRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart607);
            ruleRichStringLiteralStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralStartRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralStart614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichStringLiteralStart"


    // $ANTLR start "ruleRichStringLiteralStart"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:322:1: ruleRichStringLiteralStart : ( ( rule__RichStringLiteralStart__ValueAssignment ) ) ;
    public final void ruleRichStringLiteralStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:326:2: ( ( ( rule__RichStringLiteralStart__ValueAssignment ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:327:1: ( ( rule__RichStringLiteralStart__ValueAssignment ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:327:1: ( ( rule__RichStringLiteralStart__ValueAssignment ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:328:1: ( rule__RichStringLiteralStart__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralStartAccess().getValueAssignment()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:329:1: ( rule__RichStringLiteralStart__ValueAssignment )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:329:2: rule__RichStringLiteralStart__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RichStringLiteralStart__ValueAssignment_in_ruleRichStringLiteralStart640);
            rule__RichStringLiteralStart__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralStartAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleRichStringLiteralStart"


    // $ANTLR start "entryRuleRichStringLiteralEnd"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:341:1: entryRuleRichStringLiteralEnd : ruleRichStringLiteralEnd EOF ;
    public final void entryRuleRichStringLiteralEnd() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:342:1: ( ruleRichStringLiteralEnd EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:343:1: ruleRichStringLiteralEnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralEndRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd667);
            ruleRichStringLiteralEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralEndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralEnd674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichStringLiteralEnd"


    // $ANTLR start "ruleRichStringLiteralEnd"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:350:1: ruleRichStringLiteralEnd : ( ( rule__RichStringLiteralEnd__ValueAssignment ) ) ;
    public final void ruleRichStringLiteralEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:354:2: ( ( ( rule__RichStringLiteralEnd__ValueAssignment ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:355:1: ( ( rule__RichStringLiteralEnd__ValueAssignment ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:355:1: ( ( rule__RichStringLiteralEnd__ValueAssignment ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:356:1: ( rule__RichStringLiteralEnd__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralEndAccess().getValueAssignment()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:357:1: ( rule__RichStringLiteralEnd__ValueAssignment )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:357:2: rule__RichStringLiteralEnd__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RichStringLiteralEnd__ValueAssignment_in_ruleRichStringLiteralEnd700);
            rule__RichStringLiteralEnd__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralEndAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleRichStringLiteralEnd"


    // $ANTLR start "entryRuleRichStringLiteralInbetween"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:369:1: entryRuleRichStringLiteralInbetween : ruleRichStringLiteralInbetween EOF ;
    public final void entryRuleRichStringLiteralInbetween() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:370:1: ( ruleRichStringLiteralInbetween EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:371:1: ruleRichStringLiteralInbetween EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralInbetweenRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween727);
            ruleRichStringLiteralInbetween();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralInbetweenRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichStringLiteralInbetween"


    // $ANTLR start "ruleRichStringLiteralInbetween"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:378:1: ruleRichStringLiteralInbetween : ( ( rule__RichStringLiteralInbetween__ValueAssignment ) ) ;
    public final void ruleRichStringLiteralInbetween() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:382:2: ( ( ( rule__RichStringLiteralInbetween__ValueAssignment ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:383:1: ( ( rule__RichStringLiteralInbetween__ValueAssignment ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:383:1: ( ( rule__RichStringLiteralInbetween__ValueAssignment ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:384:1: ( rule__RichStringLiteralInbetween__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralInbetweenAccess().getValueAssignment()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:385:1: ( rule__RichStringLiteralInbetween__ValueAssignment )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:385:2: rule__RichStringLiteralInbetween__ValueAssignment
            {
            pushFollow(FOLLOW_rule__RichStringLiteralInbetween__ValueAssignment_in_ruleRichStringLiteralInbetween760);
            rule__RichStringLiteralInbetween__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralInbetweenAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleRichStringLiteralInbetween"


    // $ANTLR start "entryRuleRichVarPart"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:397:1: entryRuleRichVarPart : ruleRichVarPart EOF ;
    public final void entryRuleRichVarPart() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:398:1: ( ruleRichVarPart EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:399:1: ruleRichVarPart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartRule()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart787);
            ruleRichVarPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichVarPart794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRichVarPart"


    // $ANTLR start "ruleRichVarPart"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:406:1: ruleRichVarPart : ( ( rule__RichVarPart__Group__0 ) ) ;
    public final void ruleRichVarPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:410:2: ( ( ( rule__RichVarPart__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:411:1: ( ( rule__RichVarPart__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:411:1: ( ( rule__RichVarPart__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:412:1: ( rule__RichVarPart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:413:1: ( rule__RichVarPart__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:413:2: rule__RichVarPart__Group__0
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__0_in_ruleRichVarPart820);
            rule__RichVarPart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getGroup()); 
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
    // $ANTLR end "ruleRichVarPart"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:425:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:426:1: ( ruleValidID EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:427:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID847);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID854); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:434:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:438:2: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:439:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:439:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:440:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID880); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:454:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:455:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName906);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName913); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:462:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:466:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:467:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:468:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:469:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:469:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName939);
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


    // $ANTLR start "rulePredefinedTypes"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:482:1: rulePredefinedTypes : ( ( rule__PredefinedTypes__Alternatives ) ) ;
    public final void rulePredefinedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:486:1: ( ( ( rule__PredefinedTypes__Alternatives ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:487:1: ( ( rule__PredefinedTypes__Alternatives ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:487:1: ( ( rule__PredefinedTypes__Alternatives ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:488:1: ( rule__PredefinedTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefinedTypesAccess().getAlternatives()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:489:1: ( rule__PredefinedTypes__Alternatives )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:489:2: rule__PredefinedTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__PredefinedTypes__Alternatives_in_rulePredefinedTypes976);
            rule__PredefinedTypes__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredefinedTypesAccess().getAlternatives()); 
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
    // $ANTLR end "rulePredefinedTypes"


    // $ANTLR start "rule__MessageEntry__Alternatives_2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:500:1: rule__MessageEntry__Alternatives_2 : ( ( ( rule__MessageEntry__Group_2_0__0 ) ) | ( ( rule__MessageEntry__Group_2_1__0 ) ) );
    public final void rule__MessageEntry__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:504:1: ( ( ( rule__MessageEntry__Group_2_0__0 ) ) | ( ( rule__MessageEntry__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:505:1: ( ( rule__MessageEntry__Group_2_0__0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:505:1: ( ( rule__MessageEntry__Group_2_0__0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:506:1: ( rule__MessageEntry__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageEntryAccess().getGroup_2_0()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:507:1: ( rule__MessageEntry__Group_2_0__0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:507:2: rule__MessageEntry__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__0_in_rule__MessageEntry__Alternatives_21011);
                    rule__MessageEntry__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageEntryAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:511:6: ( ( rule__MessageEntry__Group_2_1__0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:511:6: ( ( rule__MessageEntry__Group_2_1__0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:512:1: ( rule__MessageEntry__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageEntryAccess().getGroup_2_1()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:513:1: ( rule__MessageEntry__Group_2_1__0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:513:2: rule__MessageEntry__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__0_in_rule__MessageEntry__Alternatives_21029);
                    rule__MessageEntry__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageEntryAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__MessageEntry__Alternatives_2"


    // $ANTLR start "rule__RichString__Alternatives"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:522:1: rule__RichString__Alternatives : ( ( ( rule__RichString__ExpressionsAssignment_0 ) ) | ( ( rule__RichString__Group_1__0 ) ) );
    public final void rule__RichString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:526:1: ( ( ( rule__RichString__ExpressionsAssignment_0 ) ) | ( ( rule__RichString__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_RICH_TEXT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_RICH_TEXT_START) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:527:1: ( ( rule__RichString__ExpressionsAssignment_0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:527:1: ( ( rule__RichString__ExpressionsAssignment_0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:528:1: ( rule__RichString__ExpressionsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRichStringAccess().getExpressionsAssignment_0()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:529:1: ( rule__RichString__ExpressionsAssignment_0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:529:2: rule__RichString__ExpressionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_0_in_rule__RichString__Alternatives1062);
                    rule__RichString__ExpressionsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRichStringAccess().getExpressionsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:533:6: ( ( rule__RichString__Group_1__0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:533:6: ( ( rule__RichString__Group_1__0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:534:1: ( rule__RichString__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRichStringAccess().getGroup_1()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:535:1: ( rule__RichString__Group_1__0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:535:2: rule__RichString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RichString__Group_1__0_in_rule__RichString__Alternatives1080);
                    rule__RichString__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRichStringAccess().getGroup_1()); 
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
    // $ANTLR end "rule__RichString__Alternatives"


    // $ANTLR start "rule__PredefinedTypes__Alternatives"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:544:1: rule__PredefinedTypes__Alternatives : ( ( ( 'ANY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) | ( ( 'TEMPORAL' ) ) );
    public final void rule__PredefinedTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:548:1: ( ( ( 'ANY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) | ( ( 'TEMPORAL' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
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
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:549:1: ( ( 'ANY' ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:549:1: ( ( 'ANY' ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:550:1: ( 'ANY' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:551:1: ( 'ANY' )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:551:3: 'ANY'
                    {
                    match(input,16,FOLLOW_16_in_rule__PredefinedTypes__Alternatives1114); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:556:6: ( ( 'NUMBER' ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:556:6: ( ( 'NUMBER' ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:557:1: ( 'NUMBER' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:558:1: ( 'NUMBER' )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:558:3: 'NUMBER'
                    {
                    match(input,17,FOLLOW_17_in_rule__PredefinedTypes__Alternatives1135); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:563:6: ( ( 'DATE' ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:563:6: ( ( 'DATE' ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:564:1: ( 'DATE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:565:1: ( 'DATE' )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:565:3: 'DATE'
                    {
                    match(input,18,FOLLOW_18_in_rule__PredefinedTypes__Alternatives1156); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:570:6: ( ( 'TEMPORAL' ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:570:6: ( ( 'TEMPORAL' ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:571:1: ( 'TEMPORAL' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:572:1: ( 'TEMPORAL' )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:572:3: 'TEMPORAL'
                    {
                    match(input,19,FOLLOW_19_in_rule__PredefinedTypes__Alternatives1177); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__PredefinedTypes__Alternatives"


    // $ANTLR start "rule__NLS__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:584:1: rule__NLS__Group__0 : rule__NLS__Group__0__Impl rule__NLS__Group__1 ;
    public final void rule__NLS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:588:1: ( rule__NLS__Group__0__Impl rule__NLS__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:589:2: rule__NLS__Group__0__Impl rule__NLS__Group__1
            {
            pushFollow(FOLLOW_rule__NLS__Group__0__Impl_in_rule__NLS__Group__01210);
            rule__NLS__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__1_in_rule__NLS__Group__01213);
            rule__NLS__Group__1();

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
    // $ANTLR end "rule__NLS__Group__0"


    // $ANTLR start "rule__NLS__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:596:1: rule__NLS__Group__0__Impl : ( ( rule__NLS__PackageAssignment_0 )? ) ;
    public final void rule__NLS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:600:1: ( ( ( rule__NLS__PackageAssignment_0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:601:1: ( ( rule__NLS__PackageAssignment_0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:601:1: ( ( rule__NLS__PackageAssignment_0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:602:1: ( rule__NLS__PackageAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getPackageAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:603:1: ( rule__NLS__PackageAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:603:2: rule__NLS__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NLS__PackageAssignment_0_in_rule__NLS__Group__0__Impl1240);
                    rule__NLS__PackageAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getPackageAssignment_0()); 
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
    // $ANTLR end "rule__NLS__Group__0__Impl"


    // $ANTLR start "rule__NLS__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:613:1: rule__NLS__Group__1 : rule__NLS__Group__1__Impl rule__NLS__Group__2 ;
    public final void rule__NLS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:617:1: ( rule__NLS__Group__1__Impl rule__NLS__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:618:2: rule__NLS__Group__1__Impl rule__NLS__Group__2
            {
            pushFollow(FOLLOW_rule__NLS__Group__1__Impl_in_rule__NLS__Group__11271);
            rule__NLS__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__2_in_rule__NLS__Group__11274);
            rule__NLS__Group__2();

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
    // $ANTLR end "rule__NLS__Group__1"


    // $ANTLR start "rule__NLS__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:625:1: rule__NLS__Group__1__Impl : ( '{' ) ;
    public final void rule__NLS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:629:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:630:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:630:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:631:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__NLS__Group__1__Impl1302); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__NLS__Group__1__Impl"


    // $ANTLR start "rule__NLS__Group__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:644:1: rule__NLS__Group__2 : rule__NLS__Group__2__Impl rule__NLS__Group__3 ;
    public final void rule__NLS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:648:1: ( rule__NLS__Group__2__Impl rule__NLS__Group__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:649:2: rule__NLS__Group__2__Impl rule__NLS__Group__3
            {
            pushFollow(FOLLOW_rule__NLS__Group__2__Impl_in_rule__NLS__Group__21333);
            rule__NLS__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__3_in_rule__NLS__Group__21336);
            rule__NLS__Group__3();

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
    // $ANTLR end "rule__NLS__Group__2"


    // $ANTLR start "rule__NLS__Group__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:656:1: rule__NLS__Group__2__Impl : ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) ) ;
    public final void rule__NLS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:660:1: ( ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:661:1: ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:661:1: ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:662:1: ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:662:1: ( ( rule__NLS__BundleListAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:663:1: ( rule__NLS__BundleListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:664:1: ( rule__NLS__BundleListAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:664:2: rule__NLS__BundleListAssignment_2
            {
            pushFollow(FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1365);
            rule__NLS__BundleListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }

            }

            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:667:1: ( ( rule__NLS__BundleListAssignment_2 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:668:1: ( rule__NLS__BundleListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:669:1: ( rule__NLS__BundleListAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:669:2: rule__NLS__BundleListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1377);
            	    rule__NLS__BundleListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
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
    // $ANTLR end "rule__NLS__Group__2__Impl"


    // $ANTLR start "rule__NLS__Group__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:680:1: rule__NLS__Group__3 : rule__NLS__Group__3__Impl ;
    public final void rule__NLS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:684:1: ( rule__NLS__Group__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:685:2: rule__NLS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NLS__Group__3__Impl_in_rule__NLS__Group__31410);
            rule__NLS__Group__3__Impl();

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
    // $ANTLR end "rule__NLS__Group__3"


    // $ANTLR start "rule__NLS__Group__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:691:1: rule__NLS__Group__3__Impl : ( '}' ) ;
    public final void rule__NLS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:695:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:696:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:696:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:697:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__NLS__Group__3__Impl1438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__NLS__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:718:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:722:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:723:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01477);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01480);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:730:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:734:1: ( ( 'package' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:735:1: ( 'package' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:735:1: ( 'package' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:736:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl1508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:749:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:753:1: ( rule__PackageDeclaration__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:754:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11539);
            rule__PackageDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:760:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:764:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:765:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:765:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:766:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:767:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:767:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1566);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__NLSBundle__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:781:1: rule__NLSBundle__Group__0 : rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1 ;
    public final void rule__NLSBundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:785:1: ( rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:786:2: rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__0__Impl_in_rule__NLSBundle__Group__01600);
            rule__NLSBundle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__1_in_rule__NLSBundle__Group__01603);
            rule__NLSBundle__Group__1();

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
    // $ANTLR end "rule__NLSBundle__Group__0"


    // $ANTLR start "rule__NLSBundle__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:793:1: rule__NLSBundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__NLSBundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:797:1: ( ( 'bundle' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:798:1: ( 'bundle' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:798:1: ( 'bundle' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:799:1: 'bundle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getBundleKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__NLSBundle__Group__0__Impl1631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getBundleKeyword_0()); 
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
    // $ANTLR end "rule__NLSBundle__Group__0__Impl"


    // $ANTLR start "rule__NLSBundle__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:812:1: rule__NLSBundle__Group__1 : rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2 ;
    public final void rule__NLSBundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:816:1: ( rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:817:2: rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__1__Impl_in_rule__NLSBundle__Group__11662);
            rule__NLSBundle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__2_in_rule__NLSBundle__Group__11665);
            rule__NLSBundle__Group__2();

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
    // $ANTLR end "rule__NLSBundle__Group__1"


    // $ANTLR start "rule__NLSBundle__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:824:1: rule__NLSBundle__Group__1__Impl : ( ( rule__NLSBundle__NameAssignment_1 ) ) ;
    public final void rule__NLSBundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:828:1: ( ( ( rule__NLSBundle__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:829:1: ( ( rule__NLSBundle__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:829:1: ( ( rule__NLSBundle__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:830:1: ( rule__NLSBundle__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:831:1: ( rule__NLSBundle__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:831:2: rule__NLSBundle__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NLSBundle__NameAssignment_1_in_rule__NLSBundle__Group__1__Impl1692);
            rule__NLSBundle__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__NLSBundle__Group__1__Impl"


    // $ANTLR start "rule__NLSBundle__Group__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:841:1: rule__NLSBundle__Group__2 : rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3 ;
    public final void rule__NLSBundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:845:1: ( rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:846:2: rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__2__Impl_in_rule__NLSBundle__Group__21722);
            rule__NLSBundle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__3_in_rule__NLSBundle__Group__21725);
            rule__NLSBundle__Group__3();

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
    // $ANTLR end "rule__NLSBundle__Group__2"


    // $ANTLR start "rule__NLSBundle__Group__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:853:1: rule__NLSBundle__Group__2__Impl : ( 'default' ) ;
    public final void rule__NLSBundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:857:1: ( ( 'default' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:858:1: ( 'default' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:858:1: ( 'default' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:859:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getDefaultKeyword_2()); 
            }
            match(input,24,FOLLOW_24_in_rule__NLSBundle__Group__2__Impl1753); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getDefaultKeyword_2()); 
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
    // $ANTLR end "rule__NLSBundle__Group__2__Impl"


    // $ANTLR start "rule__NLSBundle__Group__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:872:1: rule__NLSBundle__Group__3 : rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4 ;
    public final void rule__NLSBundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:876:1: ( rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:877:2: rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__3__Impl_in_rule__NLSBundle__Group__31784);
            rule__NLSBundle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__4_in_rule__NLSBundle__Group__31787);
            rule__NLSBundle__Group__4();

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
    // $ANTLR end "rule__NLSBundle__Group__3"


    // $ANTLR start "rule__NLSBundle__Group__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:884:1: rule__NLSBundle__Group__3__Impl : ( ( rule__NLSBundle__LangAssignment_3 ) ) ;
    public final void rule__NLSBundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:888:1: ( ( ( rule__NLSBundle__LangAssignment_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:889:1: ( ( rule__NLSBundle__LangAssignment_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:889:1: ( ( rule__NLSBundle__LangAssignment_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:890:1: ( rule__NLSBundle__LangAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLangAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:891:1: ( rule__NLSBundle__LangAssignment_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:891:2: rule__NLSBundle__LangAssignment_3
            {
            pushFollow(FOLLOW_rule__NLSBundle__LangAssignment_3_in_rule__NLSBundle__Group__3__Impl1814);
            rule__NLSBundle__LangAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getLangAssignment_3()); 
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
    // $ANTLR end "rule__NLSBundle__Group__3__Impl"


    // $ANTLR start "rule__NLSBundle__Group__4"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:901:1: rule__NLSBundle__Group__4 : rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5 ;
    public final void rule__NLSBundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:905:1: ( rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:906:2: rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__4__Impl_in_rule__NLSBundle__Group__41844);
            rule__NLSBundle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__5_in_rule__NLSBundle__Group__41847);
            rule__NLSBundle__Group__5();

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
    // $ANTLR end "rule__NLSBundle__Group__4"


    // $ANTLR start "rule__NLSBundle__Group__4__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:913:1: rule__NLSBundle__Group__4__Impl : ( '{' ) ;
    public final void rule__NLSBundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:917:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:918:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:918:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:919:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__NLSBundle__Group__4__Impl1875); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__NLSBundle__Group__4__Impl"


    // $ANTLR start "rule__NLSBundle__Group__5"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:932:1: rule__NLSBundle__Group__5 : rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6 ;
    public final void rule__NLSBundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:936:1: ( rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:937:2: rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__5__Impl_in_rule__NLSBundle__Group__51906);
            rule__NLSBundle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__6_in_rule__NLSBundle__Group__51909);
            rule__NLSBundle__Group__6();

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
    // $ANTLR end "rule__NLSBundle__Group__5"


    // $ANTLR start "rule__NLSBundle__Group__5__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:944:1: rule__NLSBundle__Group__5__Impl : ( ( rule__NLSBundle__FormatterListAssignment_5 )* ) ;
    public final void rule__NLSBundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:948:1: ( ( ( rule__NLSBundle__FormatterListAssignment_5 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:949:1: ( ( rule__NLSBundle__FormatterListAssignment_5 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:949:1: ( ( rule__NLSBundle__FormatterListAssignment_5 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:950:1: ( rule__NLSBundle__FormatterListAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getFormatterListAssignment_5()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:951:1: ( rule__NLSBundle__FormatterListAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:951:2: rule__NLSBundle__FormatterListAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__NLSBundle__FormatterListAssignment_5_in_rule__NLSBundle__Group__5__Impl1936);
            	    rule__NLSBundle__FormatterListAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getFormatterListAssignment_5()); 
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
    // $ANTLR end "rule__NLSBundle__Group__5__Impl"


    // $ANTLR start "rule__NLSBundle__Group__6"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:961:1: rule__NLSBundle__Group__6 : rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7 ;
    public final void rule__NLSBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:965:1: ( rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:966:2: rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__6__Impl_in_rule__NLSBundle__Group__61967);
            rule__NLSBundle__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__7_in_rule__NLSBundle__Group__61970);
            rule__NLSBundle__Group__7();

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
    // $ANTLR end "rule__NLSBundle__Group__6"


    // $ANTLR start "rule__NLSBundle__Group__6__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:973:1: rule__NLSBundle__Group__6__Impl : ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) ) ;
    public final void rule__NLSBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:977:1: ( ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:978:1: ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:978:1: ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:979:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:979:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:980:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:981:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:981:2: rule__NLSBundle__MessageEntryListAssignment_6
            {
            pushFollow(FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1999);
            rule__NLSBundle__MessageEntryListAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }

            }

            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:984:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:985:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:986:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:986:2: rule__NLSBundle__MessageEntryListAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl2011);
            	    rule__NLSBundle__MessageEntryListAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
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
    // $ANTLR end "rule__NLSBundle__Group__6__Impl"


    // $ANTLR start "rule__NLSBundle__Group__7"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:997:1: rule__NLSBundle__Group__7 : rule__NLSBundle__Group__7__Impl rule__NLSBundle__Group__8 ;
    public final void rule__NLSBundle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1001:1: ( rule__NLSBundle__Group__7__Impl rule__NLSBundle__Group__8 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1002:2: rule__NLSBundle__Group__7__Impl rule__NLSBundle__Group__8
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72044);
            rule__NLSBundle__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__8_in_rule__NLSBundle__Group__72047);
            rule__NLSBundle__Group__8();

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
    // $ANTLR end "rule__NLSBundle__Group__7"


    // $ANTLR start "rule__NLSBundle__Group__7__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1009:1: rule__NLSBundle__Group__7__Impl : ( ( rule__NLSBundle__Group_7__0 )? ) ;
    public final void rule__NLSBundle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1013:1: ( ( ( rule__NLSBundle__Group_7__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1014:1: ( ( rule__NLSBundle__Group_7__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1014:1: ( ( rule__NLSBundle__Group_7__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1015:1: ( rule__NLSBundle__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getGroup_7()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1016:1: ( rule__NLSBundle__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1016:2: rule__NLSBundle__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__NLSBundle__Group_7__0_in_rule__NLSBundle__Group__7__Impl2074);
                    rule__NLSBundle__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getGroup_7()); 
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
    // $ANTLR end "rule__NLSBundle__Group__7__Impl"


    // $ANTLR start "rule__NLSBundle__Group__8"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1026:1: rule__NLSBundle__Group__8 : rule__NLSBundle__Group__8__Impl ;
    public final void rule__NLSBundle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1030:1: ( rule__NLSBundle__Group__8__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1031:2: rule__NLSBundle__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__8__Impl_in_rule__NLSBundle__Group__82105);
            rule__NLSBundle__Group__8__Impl();

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
    // $ANTLR end "rule__NLSBundle__Group__8"


    // $ANTLR start "rule__NLSBundle__Group__8__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1037:1: rule__NLSBundle__Group__8__Impl : ( '}' ) ;
    public final void rule__NLSBundle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1041:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1042:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1042:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1043:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FOLLOW_21_in_rule__NLSBundle__Group__8__Impl2133); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__NLSBundle__Group__8__Impl"


    // $ANTLR start "rule__NLSBundle__Group_7__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1074:1: rule__NLSBundle__Group_7__0 : rule__NLSBundle__Group_7__0__Impl rule__NLSBundle__Group_7__1 ;
    public final void rule__NLSBundle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1078:1: ( rule__NLSBundle__Group_7__0__Impl rule__NLSBundle__Group_7__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1079:2: rule__NLSBundle__Group_7__0__Impl rule__NLSBundle__Group_7__1
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group_7__0__Impl_in_rule__NLSBundle__Group_7__02182);
            rule__NLSBundle__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group_7__1_in_rule__NLSBundle__Group_7__02185);
            rule__NLSBundle__Group_7__1();

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
    // $ANTLR end "rule__NLSBundle__Group_7__0"


    // $ANTLR start "rule__NLSBundle__Group_7__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1086:1: rule__NLSBundle__Group_7__0__Impl : ( 'included-bundles' ) ;
    public final void rule__NLSBundle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1090:1: ( ( 'included-bundles' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1091:1: ( 'included-bundles' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1091:1: ( 'included-bundles' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1092:1: 'included-bundles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundlesKeyword_7_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__NLSBundle__Group_7__0__Impl2213); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundlesKeyword_7_0()); 
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
    // $ANTLR end "rule__NLSBundle__Group_7__0__Impl"


    // $ANTLR start "rule__NLSBundle__Group_7__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1105:1: rule__NLSBundle__Group_7__1 : rule__NLSBundle__Group_7__1__Impl rule__NLSBundle__Group_7__2 ;
    public final void rule__NLSBundle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1109:1: ( rule__NLSBundle__Group_7__1__Impl rule__NLSBundle__Group_7__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1110:2: rule__NLSBundle__Group_7__1__Impl rule__NLSBundle__Group_7__2
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group_7__1__Impl_in_rule__NLSBundle__Group_7__12244);
            rule__NLSBundle__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group_7__2_in_rule__NLSBundle__Group_7__12247);
            rule__NLSBundle__Group_7__2();

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
    // $ANTLR end "rule__NLSBundle__Group_7__1"


    // $ANTLR start "rule__NLSBundle__Group_7__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1117:1: rule__NLSBundle__Group_7__1__Impl : ( ( rule__NLSBundle__IncludedBundleListAssignment_7_1 ) ) ;
    public final void rule__NLSBundle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1121:1: ( ( ( rule__NLSBundle__IncludedBundleListAssignment_7_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1122:1: ( ( rule__NLSBundle__IncludedBundleListAssignment_7_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1122:1: ( ( rule__NLSBundle__IncludedBundleListAssignment_7_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1123:1: ( rule__NLSBundle__IncludedBundleListAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListAssignment_7_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1124:1: ( rule__NLSBundle__IncludedBundleListAssignment_7_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1124:2: rule__NLSBundle__IncludedBundleListAssignment_7_1
            {
            pushFollow(FOLLOW_rule__NLSBundle__IncludedBundleListAssignment_7_1_in_rule__NLSBundle__Group_7__1__Impl2274);
            rule__NLSBundle__IncludedBundleListAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListAssignment_7_1()); 
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
    // $ANTLR end "rule__NLSBundle__Group_7__1__Impl"


    // $ANTLR start "rule__NLSBundle__Group_7__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1134:1: rule__NLSBundle__Group_7__2 : rule__NLSBundle__Group_7__2__Impl ;
    public final void rule__NLSBundle__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1138:1: ( rule__NLSBundle__Group_7__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1139:2: rule__NLSBundle__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group_7__2__Impl_in_rule__NLSBundle__Group_7__22304);
            rule__NLSBundle__Group_7__2__Impl();

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
    // $ANTLR end "rule__NLSBundle__Group_7__2"


    // $ANTLR start "rule__NLSBundle__Group_7__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1145:1: rule__NLSBundle__Group_7__2__Impl : ( ( rule__NLSBundle__Group_7_2__0 )* ) ;
    public final void rule__NLSBundle__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1149:1: ( ( ( rule__NLSBundle__Group_7_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1150:1: ( ( rule__NLSBundle__Group_7_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1150:1: ( ( rule__NLSBundle__Group_7_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1151:1: ( rule__NLSBundle__Group_7_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getGroup_7_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1152:1: ( rule__NLSBundle__Group_7_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1152:2: rule__NLSBundle__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NLSBundle__Group_7_2__0_in_rule__NLSBundle__Group_7__2__Impl2331);
            	    rule__NLSBundle__Group_7_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getGroup_7_2()); 
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
    // $ANTLR end "rule__NLSBundle__Group_7__2__Impl"


    // $ANTLR start "rule__NLSBundle__Group_7_2__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1168:1: rule__NLSBundle__Group_7_2__0 : rule__NLSBundle__Group_7_2__0__Impl rule__NLSBundle__Group_7_2__1 ;
    public final void rule__NLSBundle__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1172:1: ( rule__NLSBundle__Group_7_2__0__Impl rule__NLSBundle__Group_7_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1173:2: rule__NLSBundle__Group_7_2__0__Impl rule__NLSBundle__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group_7_2__0__Impl_in_rule__NLSBundle__Group_7_2__02368);
            rule__NLSBundle__Group_7_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group_7_2__1_in_rule__NLSBundle__Group_7_2__02371);
            rule__NLSBundle__Group_7_2__1();

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
    // $ANTLR end "rule__NLSBundle__Group_7_2__0"


    // $ANTLR start "rule__NLSBundle__Group_7_2__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1180:1: rule__NLSBundle__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__NLSBundle__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1184:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1185:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1185:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1186:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getCommaKeyword_7_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__NLSBundle__Group_7_2__0__Impl2399); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getCommaKeyword_7_2_0()); 
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
    // $ANTLR end "rule__NLSBundle__Group_7_2__0__Impl"


    // $ANTLR start "rule__NLSBundle__Group_7_2__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1199:1: rule__NLSBundle__Group_7_2__1 : rule__NLSBundle__Group_7_2__1__Impl ;
    public final void rule__NLSBundle__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1203:1: ( rule__NLSBundle__Group_7_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1204:2: rule__NLSBundle__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group_7_2__1__Impl_in_rule__NLSBundle__Group_7_2__12430);
            rule__NLSBundle__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__NLSBundle__Group_7_2__1"


    // $ANTLR start "rule__NLSBundle__Group_7_2__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1210:1: rule__NLSBundle__Group_7_2__1__Impl : ( ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 ) ) ;
    public final void rule__NLSBundle__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1214:1: ( ( ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1215:1: ( ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1215:1: ( ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1216:1: ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListAssignment_7_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1217:1: ( rule__NLSBundle__IncludedBundleListAssignment_7_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1217:2: rule__NLSBundle__IncludedBundleListAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__NLSBundle__IncludedBundleListAssignment_7_2_1_in_rule__NLSBundle__Group_7_2__1__Impl2457);
            rule__NLSBundle__IncludedBundleListAssignment_7_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListAssignment_7_2_1()); 
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
    // $ANTLR end "rule__NLSBundle__Group_7_2__1__Impl"


    // $ANTLR start "rule__NLSFormatter__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1231:1: rule__NLSFormatter__Group__0 : rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 ;
    public final void rule__NLSFormatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1235:1: ( rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1236:2: rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02491);
            rule__NLSFormatter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02494);
            rule__NLSFormatter__Group__1();

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
    // $ANTLR end "rule__NLSFormatter__Group__0"


    // $ANTLR start "rule__NLSFormatter__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1243:1: rule__NLSFormatter__Group__0__Impl : ( 'formatter' ) ;
    public final void rule__NLSFormatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1247:1: ( ( 'formatter' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1248:1: ( 'formatter' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1248:1: ( 'formatter' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1249:1: 'formatter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__NLSFormatter__Group__0__Impl2522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0()); 
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
    // $ANTLR end "rule__NLSFormatter__Group__0__Impl"


    // $ANTLR start "rule__NLSFormatter__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1262:1: rule__NLSFormatter__Group__1 : rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 ;
    public final void rule__NLSFormatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1266:1: ( rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1267:2: rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12553);
            rule__NLSFormatter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12556);
            rule__NLSFormatter__Group__2();

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
    // $ANTLR end "rule__NLSFormatter__Group__1"


    // $ANTLR start "rule__NLSFormatter__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1274:1: rule__NLSFormatter__Group__1__Impl : ( ( rule__NLSFormatter__NameAssignment_1 ) ) ;
    public final void rule__NLSFormatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1278:1: ( ( ( rule__NLSFormatter__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1279:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1279:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1280:1: ( rule__NLSFormatter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1281:1: ( rule__NLSFormatter__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1281:2: rule__NLSFormatter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2583);
            rule__NLSFormatter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__NLSFormatter__Group__1__Impl"


    // $ANTLR start "rule__NLSFormatter__Group__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1291:1: rule__NLSFormatter__Group__2 : rule__NLSFormatter__Group__2__Impl ;
    public final void rule__NLSFormatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1295:1: ( rule__NLSFormatter__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1296:2: rule__NLSFormatter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22613);
            rule__NLSFormatter__Group__2__Impl();

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
    // $ANTLR end "rule__NLSFormatter__Group__2"


    // $ANTLR start "rule__NLSFormatter__Group__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1302:1: rule__NLSFormatter__Group__2__Impl : ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) ;
    public final void rule__NLSFormatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1306:1: ( ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1307:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1307:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1308:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1309:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1309:2: rule__NLSFormatter__ClassRefAssignment_2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2640);
            rule__NLSFormatter__ClassRefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getClassRefAssignment_2()); 
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
    // $ANTLR end "rule__NLSFormatter__Group__2__Impl"


    // $ANTLR start "rule__MessageEntry__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1325:1: rule__MessageEntry__Group__0 : rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 ;
    public final void rule__MessageEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1329:1: ( rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1330:2: rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02676);
            rule__MessageEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02679);
            rule__MessageEntry__Group__1();

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
    // $ANTLR end "rule__MessageEntry__Group__0"


    // $ANTLR start "rule__MessageEntry__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1337:1: rule__MessageEntry__Group__0__Impl : ( ( rule__MessageEntry__NameAssignment_0 ) ) ;
    public final void rule__MessageEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1341:1: ( ( ( rule__MessageEntry__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1342:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1342:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1343:1: ( rule__MessageEntry__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1344:1: ( rule__MessageEntry__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1344:2: rule__MessageEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2706);
            rule__MessageEntry__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1354:1: rule__MessageEntry__Group__1 : rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 ;
    public final void rule__MessageEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1358:1: ( rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1359:2: rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12736);
            rule__MessageEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12739);
            rule__MessageEntry__Group__2();

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
    // $ANTLR end "rule__MessageEntry__Group__1"


    // $ANTLR start "rule__MessageEntry__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1366:1: rule__MessageEntry__Group__1__Impl : ( ( rule__MessageEntry__Group_1__0 )? ) ;
    public final void rule__MessageEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1370:1: ( ( ( rule__MessageEntry__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1371:1: ( ( rule__MessageEntry__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1371:1: ( ( rule__MessageEntry__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1372:1: ( rule__MessageEntry__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1373:1: ( rule__MessageEntry__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1373:2: rule__MessageEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2766);
                    rule__MessageEntry__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1383:1: rule__MessageEntry__Group__2 : rule__MessageEntry__Group__2__Impl ;
    public final void rule__MessageEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1387:1: ( rule__MessageEntry__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1388:2: rule__MessageEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22797);
            rule__MessageEntry__Group__2__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group__2"


    // $ANTLR start "rule__MessageEntry__Group__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1394:1: rule__MessageEntry__Group__2__Impl : ( ( rule__MessageEntry__Alternatives_2 ) ) ;
    public final void rule__MessageEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1398:1: ( ( ( rule__MessageEntry__Alternatives_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1399:1: ( ( rule__MessageEntry__Alternatives_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1399:1: ( ( rule__MessageEntry__Alternatives_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1400:1: ( rule__MessageEntry__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getAlternatives_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1401:1: ( rule__MessageEntry__Alternatives_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1401:2: rule__MessageEntry__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Alternatives_2_in_rule__MessageEntry__Group__2__Impl2824);
            rule__MessageEntry__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__MessageEntry__Group__2__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1417:1: rule__MessageEntry__Group_1__0 : rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 ;
    public final void rule__MessageEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1421:1: ( rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1422:2: rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02860);
            rule__MessageEntry__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02863);
            rule__MessageEntry__Group_1__1();

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
    // $ANTLR end "rule__MessageEntry__Group_1__0"


    // $ANTLR start "rule__MessageEntry__Group_1__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1429:1: rule__MessageEntry__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MessageEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1433:1: ( ( '(' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1434:1: ( '(' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1434:1: ( '(' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1435:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MessageEntry__Group_1__0__Impl2891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1448:1: rule__MessageEntry__Group_1__1 : rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 ;
    public final void rule__MessageEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1452:1: ( rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1453:2: rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12922);
            rule__MessageEntry__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12925);
            rule__MessageEntry__Group_1__2();

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
    // $ANTLR end "rule__MessageEntry__Group_1__1"


    // $ANTLR start "rule__MessageEntry__Group_1__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1460:1: rule__MessageEntry__Group_1__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) ;
    public final void rule__MessageEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1464:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1465:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1465:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1466:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1467:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1467:2: rule__MessageEntry__ParamListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2952);
            rule__MessageEntry__ParamListAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1477:1: rule__MessageEntry__Group_1__2 : rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 ;
    public final void rule__MessageEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1481:1: ( rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1482:2: rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22982);
            rule__MessageEntry__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22985);
            rule__MessageEntry__Group_1__3();

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
    // $ANTLR end "rule__MessageEntry__Group_1__2"


    // $ANTLR start "rule__MessageEntry__Group_1__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1489:1: rule__MessageEntry__Group_1__2__Impl : ( ( rule__MessageEntry__Group_1_2__0 )* ) ;
    public final void rule__MessageEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1493:1: ( ( ( rule__MessageEntry__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1494:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1494:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1495:1: ( rule__MessageEntry__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1496:1: ( rule__MessageEntry__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1496:2: rule__MessageEntry__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl3012);
            	    rule__MessageEntry__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1__2__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1506:1: rule__MessageEntry__Group_1__3 : rule__MessageEntry__Group_1__3__Impl ;
    public final void rule__MessageEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1510:1: ( rule__MessageEntry__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1511:2: rule__MessageEntry__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__33043);
            rule__MessageEntry__Group_1__3__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group_1__3"


    // $ANTLR start "rule__MessageEntry__Group_1__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1517:1: rule__MessageEntry__Group_1__3__Impl : ( ')' ) ;
    public final void rule__MessageEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1521:1: ( ( ')' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1522:1: ( ')' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1522:1: ( ')' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1523:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__MessageEntry__Group_1__3__Impl3071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1__3__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1_2__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1544:1: rule__MessageEntry__Group_1_2__0 : rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 ;
    public final void rule__MessageEntry__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1548:1: ( rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1549:2: rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__03110);
            rule__MessageEntry__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__03113);
            rule__MessageEntry__Group_1_2__1();

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
    // $ANTLR end "rule__MessageEntry__Group_1_2__0"


    // $ANTLR start "rule__MessageEntry__Group_1_2__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1556:1: rule__MessageEntry__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1560:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1561:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1561:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1562:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MessageEntry__Group_1_2__0__Impl3141); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1_2__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1_2__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1575:1: rule__MessageEntry__Group_1_2__1 : rule__MessageEntry__Group_1_2__1__Impl ;
    public final void rule__MessageEntry__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1579:1: ( rule__MessageEntry__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1580:2: rule__MessageEntry__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__13172);
            rule__MessageEntry__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group_1_2__1"


    // $ANTLR start "rule__MessageEntry__Group_1_2__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1586:1: rule__MessageEntry__Group_1_2__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) ;
    public final void rule__MessageEntry__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1590:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1591:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1591:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1592:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1593:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1593:2: rule__MessageEntry__ParamListAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl3199);
            rule__MessageEntry__ParamListAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_2_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group_1_2__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1607:1: rule__MessageEntry__Group_2_0__0 : rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1 ;
    public final void rule__MessageEntry__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1611:1: ( rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1612:2: rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__0__Impl_in_rule__MessageEntry__Group_2_0__03233);
            rule__MessageEntry__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__1_in_rule__MessageEntry__Group_2_0__03236);
            rule__MessageEntry__Group_2_0__1();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0__0"


    // $ANTLR start "rule__MessageEntry__Group_2_0__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1619:1: rule__MessageEntry__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__MessageEntry__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1623:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1624:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1624:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1625:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__MessageEntry__Group_2_0__0__Impl3264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1638:1: rule__MessageEntry__Group_2_0__1 : rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2 ;
    public final void rule__MessageEntry__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1642:1: ( rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1643:2: rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__1__Impl_in_rule__MessageEntry__Group_2_0__13295);
            rule__MessageEntry__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__2_in_rule__MessageEntry__Group_2_0__13298);
            rule__MessageEntry__Group_2_0__2();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0__1"


    // $ANTLR start "rule__MessageEntry__Group_2_0__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1650:1: rule__MessageEntry__Group_2_0__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) ) ;
    public final void rule__MessageEntry__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1654:1: ( ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1655:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1655:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1656:1: ( rule__MessageEntry__MessageListAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1657:1: ( rule__MessageEntry__MessageListAssignment_2_0_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1657:2: rule__MessageEntry__MessageListAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_1_in_rule__MessageEntry__Group_2_0__1__Impl3325);
            rule__MessageEntry__MessageListAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1667:1: rule__MessageEntry__Group_2_0__2 : rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3 ;
    public final void rule__MessageEntry__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1671:1: ( rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1672:2: rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__2__Impl_in_rule__MessageEntry__Group_2_0__23355);
            rule__MessageEntry__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__3_in_rule__MessageEntry__Group_2_0__23358);
            rule__MessageEntry__Group_2_0__3();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0__2"


    // $ANTLR start "rule__MessageEntry__Group_2_0__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1679:1: rule__MessageEntry__Group_2_0__2__Impl : ( ( rule__MessageEntry__Group_2_0_2__0 )* ) ;
    public final void rule__MessageEntry__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1683:1: ( ( ( rule__MessageEntry__Group_2_0_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1684:1: ( ( rule__MessageEntry__Group_2_0_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1684:1: ( ( rule__MessageEntry__Group_2_0_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1685:1: ( rule__MessageEntry__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_2_0_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1686:1: ( rule__MessageEntry__Group_2_0_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1686:2: rule__MessageEntry__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__0_in_rule__MessageEntry__Group_2_0__2__Impl3385);
            	    rule__MessageEntry__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getGroup_2_0_2()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0__2__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1696:1: rule__MessageEntry__Group_2_0__3 : rule__MessageEntry__Group_2_0__3__Impl ;
    public final void rule__MessageEntry__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1700:1: ( rule__MessageEntry__Group_2_0__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1701:2: rule__MessageEntry__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__3__Impl_in_rule__MessageEntry__Group_2_0__33416);
            rule__MessageEntry__Group_2_0__3__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0__3"


    // $ANTLR start "rule__MessageEntry__Group_2_0__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1707:1: rule__MessageEntry__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__MessageEntry__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1711:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1712:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1712:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1713:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__MessageEntry__Group_2_0__3__Impl3444); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0__3__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0_2__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1734:1: rule__MessageEntry__Group_2_0_2__0 : rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1 ;
    public final void rule__MessageEntry__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1738:1: ( rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1739:2: rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__0__Impl_in_rule__MessageEntry__Group_2_0_2__03483);
            rule__MessageEntry__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__1_in_rule__MessageEntry__Group_2_0_2__03486);
            rule__MessageEntry__Group_2_0_2__1();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0_2__0"


    // $ANTLR start "rule__MessageEntry__Group_2_0_2__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1746:1: rule__MessageEntry__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1750:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1751:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1751:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1752:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MessageEntry__Group_2_0_2__0__Impl3514); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_0_2__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1765:1: rule__MessageEntry__Group_2_0_2__1 : rule__MessageEntry__Group_2_0_2__1__Impl ;
    public final void rule__MessageEntry__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1769:1: ( rule__MessageEntry__Group_2_0_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1770:2: rule__MessageEntry__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__1__Impl_in_rule__MessageEntry__Group_2_0_2__13545);
            rule__MessageEntry__Group_2_0_2__1__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group_2_0_2__1"


    // $ANTLR start "rule__MessageEntry__Group_2_0_2__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1776:1: rule__MessageEntry__Group_2_0_2__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) ) ;
    public final void rule__MessageEntry__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1780:1: ( ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1781:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1781:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1782:1: ( rule__MessageEntry__MessageListAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1783:1: ( rule__MessageEntry__MessageListAssignment_2_0_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1783:2: rule__MessageEntry__MessageListAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_2_1_in_rule__MessageEntry__Group_2_0_2__1__Impl3572);
            rule__MessageEntry__MessageListAssignment_2_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_2_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1797:1: rule__MessageEntry__Group_2_1__0 : rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1 ;
    public final void rule__MessageEntry__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1801:1: ( rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1802:2: rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__0__Impl_in_rule__MessageEntry__Group_2_1__03606);
            rule__MessageEntry__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__1_in_rule__MessageEntry__Group_2_1__03609);
            rule__MessageEntry__Group_2_1__1();

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
    // $ANTLR end "rule__MessageEntry__Group_2_1__0"


    // $ANTLR start "rule__MessageEntry__Group_2_1__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1809:1: rule__MessageEntry__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__MessageEntry__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1813:1: ( ( '[' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1814:1: ( '[' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1814:1: ( '[' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1815:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__MessageEntry__Group_2_1__0__Impl3637); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_1__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_1__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1828:1: rule__MessageEntry__Group_2_1__1 : rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2 ;
    public final void rule__MessageEntry__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1832:1: ( rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1833:2: rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__1__Impl_in_rule__MessageEntry__Group_2_1__13668);
            rule__MessageEntry__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__2_in_rule__MessageEntry__Group_2_1__13671);
            rule__MessageEntry__Group_2_1__2();

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
    // $ANTLR end "rule__MessageEntry__Group_2_1__1"


    // $ANTLR start "rule__MessageEntry__Group_2_1__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1840:1: rule__MessageEntry__Group_2_1__1__Impl : ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) ) ;
    public final void rule__MessageEntry__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1844:1: ( ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1845:1: ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1845:1: ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1846:1: ( rule__MessageEntry__EntryRefAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_2_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1847:1: ( rule__MessageEntry__EntryRefAssignment_2_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1847:2: rule__MessageEntry__EntryRefAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__EntryRefAssignment_2_1_1_in_rule__MessageEntry__Group_2_1__1__Impl3698);
            rule__MessageEntry__EntryRefAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_2_1_1()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_1__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_2_1__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1857:1: rule__MessageEntry__Group_2_1__2 : rule__MessageEntry__Group_2_1__2__Impl ;
    public final void rule__MessageEntry__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1861:1: ( rule__MessageEntry__Group_2_1__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1862:2: rule__MessageEntry__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__2__Impl_in_rule__MessageEntry__Group_2_1__23728);
            rule__MessageEntry__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__MessageEntry__Group_2_1__2"


    // $ANTLR start "rule__MessageEntry__Group_2_1__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1868:1: rule__MessageEntry__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__MessageEntry__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1872:1: ( ( ']' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1873:1: ( ']' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1873:1: ( ']' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1874:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_2_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__MessageEntry__Group_2_1__2__Impl3756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_2_1_2()); 
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
    // $ANTLR end "rule__MessageEntry__Group_2_1__2__Impl"


    // $ANTLR start "rule__MessageParam__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1893:1: rule__MessageParam__Group__0 : rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 ;
    public final void rule__MessageParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1897:1: ( rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1898:2: rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03793);
            rule__MessageParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03796);
            rule__MessageParam__Group__1();

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
    // $ANTLR end "rule__MessageParam__Group__0"


    // $ANTLR start "rule__MessageParam__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1905:1: rule__MessageParam__Group__0__Impl : ( ( rule__MessageParam__PredefinedAssignment_0 ) ) ;
    public final void rule__MessageParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1909:1: ( ( ( rule__MessageParam__PredefinedAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1910:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1910:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1911:1: ( rule__MessageParam__PredefinedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1912:1: ( rule__MessageParam__PredefinedAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1912:2: rule__MessageParam__PredefinedAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3823);
            rule__MessageParam__PredefinedAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamAccess().getPredefinedAssignment_0()); 
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
    // $ANTLR end "rule__MessageParam__Group__0__Impl"


    // $ANTLR start "rule__MessageParam__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1922:1: rule__MessageParam__Group__1 : rule__MessageParam__Group__1__Impl ;
    public final void rule__MessageParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1926:1: ( rule__MessageParam__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1927:2: rule__MessageParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13853);
            rule__MessageParam__Group__1__Impl();

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
    // $ANTLR end "rule__MessageParam__Group__1"


    // $ANTLR start "rule__MessageParam__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1933:1: rule__MessageParam__Group__1__Impl : ( ( rule__MessageParam__VarAssignment_1 ) ) ;
    public final void rule__MessageParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1937:1: ( ( ( rule__MessageParam__VarAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1938:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1938:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1939:1: ( rule__MessageParam__VarAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1940:1: ( rule__MessageParam__VarAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1940:2: rule__MessageParam__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3880);
            rule__MessageParam__VarAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamAccess().getVarAssignment_1()); 
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
    // $ANTLR end "rule__MessageParam__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1954:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1958:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1959:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03914);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03917);
            rule__Message__Group__1();

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1966:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1970:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1971:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1971:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1972:1: ( rule__Message__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1973:1: ( rule__Message__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1973:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3944);
            rule__Message__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1983:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1987:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1988:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13974);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13977);
            rule__Message__Group__2();

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1995:1: rule__Message__Group__1__Impl : ( ':' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1999:1: ( ( ':' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2000:1: ( ':' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2000:1: ( ':' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2001:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getColonKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Message__Group__1__Impl4005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2014:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2018:1: ( rule__Message__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2019:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24036);
            rule__Message__Group__2__Impl();

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2025:1: rule__Message__Group__2__Impl : ( ( rule__Message__MessageAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2029:1: ( ( ( rule__Message__MessageAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2030:1: ( ( rule__Message__MessageAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2030:1: ( ( rule__Message__MessageAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2031:1: ( rule__Message__MessageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2032:1: ( rule__Message__MessageAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2032:2: rule__Message__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl4063);
            rule__Message__MessageAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageAssignment_2()); 
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
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__RichString__Group_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2048:1: rule__RichString__Group_1__0 : rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 ;
    public final void rule__RichString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2052:1: ( rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2053:2: rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__04099);
            rule__RichString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__04102);
            rule__RichString__Group_1__1();

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
    // $ANTLR end "rule__RichString__Group_1__0"


    // $ANTLR start "rule__RichString__Group_1__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2060:1: rule__RichString__Group_1__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__RichString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2064:1: ( ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2065:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2065:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2066:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2067:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2067:2: rule__RichString__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl4129);
            rule__RichString__ExpressionsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_0()); 
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
    // $ANTLR end "rule__RichString__Group_1__0__Impl"


    // $ANTLR start "rule__RichString__Group_1__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2077:1: rule__RichString__Group_1__1 : rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 ;
    public final void rule__RichString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2081:1: ( rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2082:2: rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__14159);
            rule__RichString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__14162);
            rule__RichString__Group_1__2();

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
    // $ANTLR end "rule__RichString__Group_1__1"


    // $ANTLR start "rule__RichString__Group_1__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2089:1: rule__RichString__Group_1__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) ;
    public final void rule__RichString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2093:1: ( ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2094:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2094:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2095:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2096:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2096:2: rule__RichString__ExpressionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl4189);
                    rule__RichString__ExpressionsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_1()); 
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
    // $ANTLR end "rule__RichString__Group_1__1__Impl"


    // $ANTLR start "rule__RichString__Group_1__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2106:1: rule__RichString__Group_1__2 : rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 ;
    public final void rule__RichString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2110:1: ( rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2111:2: rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__24220);
            rule__RichString__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__24223);
            rule__RichString__Group_1__3();

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
    // $ANTLR end "rule__RichString__Group_1__2"


    // $ANTLR start "rule__RichString__Group_1__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2118:1: rule__RichString__Group_1__2__Impl : ( ( rule__RichString__Group_1_2__0 )* ) ;
    public final void rule__RichString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2122:1: ( ( ( rule__RichString__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2123:1: ( ( rule__RichString__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2123:1: ( ( rule__RichString__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2124:1: ( rule__RichString__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2125:1: ( rule__RichString__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_RICH_TEXT_INBETWEEN) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2125:2: rule__RichString__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl4250);
            	    rule__RichString__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__RichString__Group_1__2__Impl"


    // $ANTLR start "rule__RichString__Group_1__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2135:1: rule__RichString__Group_1__3 : rule__RichString__Group_1__3__Impl ;
    public final void rule__RichString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2139:1: ( rule__RichString__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2140:2: rule__RichString__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__34281);
            rule__RichString__Group_1__3__Impl();

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
    // $ANTLR end "rule__RichString__Group_1__3"


    // $ANTLR start "rule__RichString__Group_1__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2146:1: rule__RichString__Group_1__3__Impl : ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) ;
    public final void rule__RichString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2150:1: ( ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2151:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2151:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2152:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2153:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2153:2: rule__RichString__ExpressionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl4308);
            rule__RichString__ExpressionsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_3()); 
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
    // $ANTLR end "rule__RichString__Group_1__3__Impl"


    // $ANTLR start "rule__RichString__Group_1_2__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2171:1: rule__RichString__Group_1_2__0 : rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 ;
    public final void rule__RichString__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2175:1: ( rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2176:2: rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__04346);
            rule__RichString__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__04349);
            rule__RichString__Group_1_2__1();

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
    // $ANTLR end "rule__RichString__Group_1_2__0"


    // $ANTLR start "rule__RichString__Group_1_2__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2183:1: rule__RichString__Group_1_2__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) ;
    public final void rule__RichString__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2187:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2188:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2188:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2189:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2190:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2190:2: rule__RichString__ExpressionsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4376);
            rule__RichString__ExpressionsAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_0()); 
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
    // $ANTLR end "rule__RichString__Group_1_2__0__Impl"


    // $ANTLR start "rule__RichString__Group_1_2__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2200:1: rule__RichString__Group_1_2__1 : rule__RichString__Group_1_2__1__Impl ;
    public final void rule__RichString__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2204:1: ( rule__RichString__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2205:2: rule__RichString__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14406);
            rule__RichString__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__RichString__Group_1_2__1"


    // $ANTLR start "rule__RichString__Group_1_2__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2211:1: rule__RichString__Group_1_2__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) ;
    public final void rule__RichString__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2215:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2216:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2216:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2217:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2218:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2218:2: rule__RichString__ExpressionsAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4433);
                    rule__RichString__ExpressionsAssignment_1_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__RichString__Group_1_2__1__Impl"


    // $ANTLR start "rule__RichVarPart__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2232:1: rule__RichVarPart__Group__0 : rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 ;
    public final void rule__RichVarPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2236:1: ( rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2237:2: rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04468);
            rule__RichVarPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04471);
            rule__RichVarPart__Group__1();

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
    // $ANTLR end "rule__RichVarPart__Group__0"


    // $ANTLR start "rule__RichVarPart__Group__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2244:1: rule__RichVarPart__Group__0__Impl : ( ( rule__RichVarPart__KeyAssignment_0 ) ) ;
    public final void rule__RichVarPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2248:1: ( ( ( rule__RichVarPart__KeyAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2249:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2249:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2250:1: ( rule__RichVarPart__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2251:1: ( rule__RichVarPart__KeyAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2251:2: rule__RichVarPart__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4498);
            rule__RichVarPart__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__RichVarPart__Group__0__Impl"


    // $ANTLR start "rule__RichVarPart__Group__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2261:1: rule__RichVarPart__Group__1 : rule__RichVarPart__Group__1__Impl ;
    public final void rule__RichVarPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2265:1: ( rule__RichVarPart__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2266:2: rule__RichVarPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14528);
            rule__RichVarPart__Group__1__Impl();

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
    // $ANTLR end "rule__RichVarPart__Group__1"


    // $ANTLR start "rule__RichVarPart__Group__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2272:1: rule__RichVarPart__Group__1__Impl : ( ( rule__RichVarPart__Group_1__0 )? ) ;
    public final void rule__RichVarPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2276:1: ( ( ( rule__RichVarPart__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2277:1: ( ( rule__RichVarPart__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2277:1: ( ( rule__RichVarPart__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2278:1: ( rule__RichVarPart__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2279:1: ( rule__RichVarPart__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2279:2: rule__RichVarPart__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4555);
                    rule__RichVarPart__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getGroup_1()); 
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
    // $ANTLR end "rule__RichVarPart__Group__1__Impl"


    // $ANTLR start "rule__RichVarPart__Group_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2293:1: rule__RichVarPart__Group_1__0 : rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 ;
    public final void rule__RichVarPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2297:1: ( rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2298:2: rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04590);
            rule__RichVarPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04593);
            rule__RichVarPart__Group_1__1();

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
    // $ANTLR end "rule__RichVarPart__Group_1__0"


    // $ANTLR start "rule__RichVarPart__Group_1__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2305:1: rule__RichVarPart__Group_1__0__Impl : ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) ;
    public final void rule__RichVarPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2309:1: ( ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2310:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2310:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2311:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2312:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2312:2: rule__RichVarPart__FormatAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4620);
            rule__RichVarPart__FormatAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getFormatAssignment_1_0()); 
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
    // $ANTLR end "rule__RichVarPart__Group_1__0__Impl"


    // $ANTLR start "rule__RichVarPart__Group_1__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2322:1: rule__RichVarPart__Group_1__1 : rule__RichVarPart__Group_1__1__Impl ;
    public final void rule__RichVarPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2326:1: ( rule__RichVarPart__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2327:2: rule__RichVarPart__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14650);
            rule__RichVarPart__Group_1__1__Impl();

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
    // $ANTLR end "rule__RichVarPart__Group_1__1"


    // $ANTLR start "rule__RichVarPart__Group_1__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2333:1: rule__RichVarPart__Group_1__1__Impl : ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) ;
    public final void rule__RichVarPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2337:1: ( ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2338:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2338:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2339:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2340:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2340:2: rule__RichVarPart__FormatterClassAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4677);
                    rule__RichVarPart__FormatterClassAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getFormatterClassAssignment_1_1()); 
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
    // $ANTLR end "rule__RichVarPart__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2354:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2358:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2359:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04712);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04715);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2366:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2370:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2371:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2371:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2372:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4742);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2383:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2387:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2388:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14771);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2394:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2398:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2399:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2399:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2400:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2401:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2401:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4798);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2415:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2419:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2420:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04833);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04836);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2427:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2431:1: ( ( ( '.' ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2432:1: ( ( '.' ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2432:1: ( ( '.' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2433:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2434:1: ( '.' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2435:2: '.'
            {
            match(input,33,FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl4865); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2446:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2450:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2451:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14897);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2457:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2461:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2462:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2462:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2463:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4924);
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


    // $ANTLR start "rule__NLS__PackageAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2479:1: rule__NLS__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__NLS__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2483:1: ( ( rulePackageDeclaration ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2484:1: ( rulePackageDeclaration )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2484:1: ( rulePackageDeclaration )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2485:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04962);
            rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__NLS__PackageAssignment_0"


    // $ANTLR start "rule__NLS__BundleListAssignment_2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2494:1: rule__NLS__BundleListAssignment_2 : ( ruleNLSBundle ) ;
    public final void rule__NLS__BundleListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2498:1: ( ( ruleNLSBundle ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2499:1: ( ruleNLSBundle )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2499:1: ( ruleNLSBundle )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2500:1: ruleNLSBundle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24993);
            ruleNLSBundle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__NLS__BundleListAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2509:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2513:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2514:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2514:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2515:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_15024);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__NLSBundle__NameAssignment_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2524:1: rule__NLSBundle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSBundle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2528:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2529:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2529:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2530:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_15055); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NLSBundle__NameAssignment_1"


    // $ANTLR start "rule__NLSBundle__LangAssignment_3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2539:1: rule__NLSBundle__LangAssignment_3 : ( RULE_ID ) ;
    public final void rule__NLSBundle__LangAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2543:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2544:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2544:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2545:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_35086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__NLSBundle__LangAssignment_3"


    // $ANTLR start "rule__NLSBundle__FormatterListAssignment_5"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2554:1: rule__NLSBundle__FormatterListAssignment_5 : ( ruleNLSFormatter ) ;
    public final void rule__NLSBundle__FormatterListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2558:1: ( ( ruleNLSFormatter ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2559:1: ( ruleNLSFormatter )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2559:1: ( ruleNLSFormatter )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2560:1: ruleNLSFormatter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_55117);
            ruleNLSFormatter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__NLSBundle__FormatterListAssignment_5"


    // $ANTLR start "rule__NLSBundle__MessageEntryListAssignment_6"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2569:1: rule__NLSBundle__MessageEntryListAssignment_6 : ( ruleMessageEntry ) ;
    public final void rule__NLSBundle__MessageEntryListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2573:1: ( ( ruleMessageEntry ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2574:1: ( ruleMessageEntry )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2574:1: ( ruleMessageEntry )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2575:1: ruleMessageEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_65148);
            ruleMessageEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__NLSBundle__MessageEntryListAssignment_6"


    // $ANTLR start "rule__NLSBundle__IncludedBundleListAssignment_7_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2584:1: rule__NLSBundle__IncludedBundleListAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NLSBundle__IncludedBundleListAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2588:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2589:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2589:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2590:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2591:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2592:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleQualifiedNameParserRuleCall_7_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NLSBundle__IncludedBundleListAssignment_7_15183);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleQualifiedNameParserRuleCall_7_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_1_0()); 
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
    // $ANTLR end "rule__NLSBundle__IncludedBundleListAssignment_7_1"


    // $ANTLR start "rule__NLSBundle__IncludedBundleListAssignment_7_2_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2603:1: rule__NLSBundle__IncludedBundleListAssignment_7_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NLSBundle__IncludedBundleListAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2607:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2608:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2608:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2609:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_2_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2610:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2611:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleQualifiedNameParserRuleCall_7_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NLSBundle__IncludedBundleListAssignment_7_2_15222);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleQualifiedNameParserRuleCall_7_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_2_1_0()); 
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
    // $ANTLR end "rule__NLSBundle__IncludedBundleListAssignment_7_2_1"


    // $ANTLR start "rule__NLSFormatter__NameAssignment_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2622:1: rule__NLSFormatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSFormatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2626:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2627:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2627:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2628:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_15257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NLSFormatter__NameAssignment_1"


    // $ANTLR start "rule__NLSFormatter__ClassRefAssignment_2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2637:1: rule__NLSFormatter__ClassRefAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NLSFormatter__ClassRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2641:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2642:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2642:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2643:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_25288);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__NLSFormatter__ClassRefAssignment_2"


    // $ANTLR start "rule__MessageEntry__NameAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2652:1: rule__MessageEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2656:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2657:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2657:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2658:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_05319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__MessageEntry__NameAssignment_0"


    // $ANTLR start "rule__MessageEntry__ParamListAssignment_1_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2667:1: rule__MessageEntry__ParamListAssignment_1_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2671:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2672:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2672:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2673:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_15350);
            ruleMessageParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__ParamListAssignment_1_1"


    // $ANTLR start "rule__MessageEntry__ParamListAssignment_1_2_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2682:1: rule__MessageEntry__ParamListAssignment_1_2_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2686:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2687:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2687:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2688:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_15381);
            ruleMessageParam();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__ParamListAssignment_1_2_1"


    // $ANTLR start "rule__MessageEntry__MessageListAssignment_2_0_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2697:1: rule__MessageEntry__MessageListAssignment_2_0_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2701:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2702:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2702:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2703:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_15412);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__MessageListAssignment_2_0_1"


    // $ANTLR start "rule__MessageEntry__MessageListAssignment_2_0_2_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2712:1: rule__MessageEntry__MessageListAssignment_2_0_2_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2716:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2717:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2717:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2718:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_2_15443);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__MessageListAssignment_2_0_2_1"


    // $ANTLR start "rule__MessageEntry__EntryRefAssignment_2_1_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2727:1: rule__MessageEntry__EntryRefAssignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MessageEntry__EntryRefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2731:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2732:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2732:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2733:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2734:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2735:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryQualifiedNameParserRuleCall_2_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_2_1_15478);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryQualifiedNameParserRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
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
    // $ANTLR end "rule__MessageEntry__EntryRefAssignment_2_1_1"


    // $ANTLR start "rule__MessageParam__PredefinedAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2746:1: rule__MessageParam__PredefinedAssignment_0 : ( rulePredefinedTypes ) ;
    public final void rule__MessageParam__PredefinedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2750:1: ( ( rulePredefinedTypes ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2751:1: ( rulePredefinedTypes )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2751:1: ( rulePredefinedTypes )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2752:1: rulePredefinedTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05513);
            rulePredefinedTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__MessageParam__PredefinedAssignment_0"


    // $ANTLR start "rule__MessageParam__VarAssignment_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2761:1: rule__MessageParam__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageParam__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2765:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2766:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2766:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2767:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15544); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MessageParam__VarAssignment_1"


    // $ANTLR start "rule__Message__NameAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2776:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2780:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2781:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2781:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2782:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05575); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Message__NameAssignment_0"


    // $ANTLR start "rule__Message__MessageAssignment_2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2791:1: rule__Message__MessageAssignment_2 : ( ruleRichString ) ;
    public final void rule__Message__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2795:1: ( ( ruleRichString ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2796:1: ( ruleRichString )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2796:1: ( ruleRichString )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2797:1: ruleRichString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25606);
            ruleRichString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Message__MessageAssignment_2"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2806:1: rule__RichString__ExpressionsAssignment_0 : ( ruleRichStringLiteral ) ;
    public final void rule__RichString__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2810:1: ( ( ruleRichStringLiteral ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2811:1: ( ruleRichStringLiteral )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2811:1: ( ruleRichStringLiteral )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2812:1: ruleRichStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05637);
            ruleRichStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_0"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_1_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2821:1: rule__RichString__ExpressionsAssignment_1_0 : ( ruleRichStringLiteralStart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2825:1: ( ( ruleRichStringLiteralStart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2826:1: ( ruleRichStringLiteralStart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2826:1: ( ruleRichStringLiteralStart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2827:1: ruleRichStringLiteralStart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05668);
            ruleRichStringLiteralStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_1_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2836:1: rule__RichString__ExpressionsAssignment_1_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2840:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2841:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2841:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2842:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15699);
            ruleRichVarPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_1_2_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2851:1: rule__RichString__ExpressionsAssignment_1_2_0 : ( ruleRichStringLiteralInbetween ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2855:1: ( ( ruleRichStringLiteralInbetween ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2856:1: ( ruleRichStringLiteralInbetween )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2856:1: ( ruleRichStringLiteralInbetween )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2857:1: ruleRichStringLiteralInbetween
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05730);
            ruleRichStringLiteralInbetween();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_1_2_0"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_1_2_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2866:1: rule__RichString__ExpressionsAssignment_1_2_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2870:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2871:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2871:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2872:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15761);
            ruleRichVarPart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_1_2_1"


    // $ANTLR start "rule__RichString__ExpressionsAssignment_1_3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2881:1: rule__RichString__ExpressionsAssignment_1_3 : ( ruleRichStringLiteralEnd ) ;
    public final void rule__RichString__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2885:1: ( ( ruleRichStringLiteralEnd ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2886:1: ( ruleRichStringLiteralEnd )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2886:1: ( ruleRichStringLiteralEnd )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2887:1: ruleRichStringLiteralEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35792);
            ruleRichStringLiteralEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__RichString__ExpressionsAssignment_1_3"


    // $ANTLR start "rule__RichStringLiteral__ValueAssignment"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2896:1: rule__RichStringLiteral__ValueAssignment : ( RULE_RICH_TEXT ) ;
    public final void rule__RichStringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2900:1: ( ( RULE_RICH_TEXT ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2901:1: ( RULE_RICH_TEXT )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2901:1: ( RULE_RICH_TEXT )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2902:1: RULE_RICH_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5823); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__RichStringLiteral__ValueAssignment"


    // $ANTLR start "rule__RichStringLiteralStart__ValueAssignment"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2911:1: rule__RichStringLiteralStart__ValueAssignment : ( RULE_RICH_TEXT_START ) ;
    public final void rule__RichStringLiteralStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2915:1: ( ( RULE_RICH_TEXT_START ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2916:1: ( RULE_RICH_TEXT_START )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2916:1: ( RULE_RICH_TEXT_START )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2917:1: RULE_RICH_TEXT_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__RichStringLiteralStart__ValueAssignment"


    // $ANTLR start "rule__RichStringLiteralEnd__ValueAssignment"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2926:1: rule__RichStringLiteralEnd__ValueAssignment : ( RULE_RICH_TEXT_END ) ;
    public final void rule__RichStringLiteralEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2930:1: ( ( RULE_RICH_TEXT_END ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2931:1: ( RULE_RICH_TEXT_END )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2931:1: ( RULE_RICH_TEXT_END )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2932:1: RULE_RICH_TEXT_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_END,FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__RichStringLiteralEnd__ValueAssignment"


    // $ANTLR start "rule__RichStringLiteralInbetween__ValueAssignment"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2941:1: rule__RichStringLiteralInbetween__ValueAssignment : ( RULE_RICH_TEXT_INBETWEEN ) ;
    public final void rule__RichStringLiteralInbetween__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2945:1: ( ( RULE_RICH_TEXT_INBETWEEN ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2946:1: ( RULE_RICH_TEXT_INBETWEEN )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2946:1: ( RULE_RICH_TEXT_INBETWEEN )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2947:1: RULE_RICH_TEXT_INBETWEEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_INBETWEEN,FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__RichStringLiteralInbetween__ValueAssignment"


    // $ANTLR start "rule__RichVarPart__KeyAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2956:1: rule__RichVarPart__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__RichVarPart__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2960:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2961:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2961:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2962:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__RichVarPart__KeyAssignment_0"


    // $ANTLR start "rule__RichVarPart__FormatAssignment_1_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2971:1: rule__RichVarPart__FormatAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__RichVarPart__FormatAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2975:1: ( ( RULE_STRING ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2976:1: ( RULE_STRING )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2976:1: ( RULE_STRING )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2977:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__RichVarPart__FormatAssignment_1_0"


    // $ANTLR start "rule__RichVarPart__FormatterClassAssignment_1_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2986:1: rule__RichVarPart__FormatterClassAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RichVarPart__FormatterClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2990:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2991:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2991:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2992:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2993:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2994:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_16013);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
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
    // $ANTLR end "rule__RichVarPart__FormatterClassAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNLS_in_entryRuleNLS67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLS74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__0_in_ruleNLS100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_entryRuleNLSBundle187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLSBundle194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__0_in_ruleNLSBundle220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLSFormatter254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__0_in_ruleNLSFormatter280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageEntry314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__0_in_ruleMessageEntry340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_entryRuleMessageParam367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageParam374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__0_in_ruleMessageParam400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_entryRuleRichString487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichString494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Alternatives_in_ruleRichString520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteral554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichStringLiteral__ValueAssignment_in_ruleRichStringLiteral580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralStart614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichStringLiteralStart__ValueAssignment_in_ruleRichStringLiteralStart640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralEnd674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichStringLiteralEnd__ValueAssignment_in_ruleRichStringLiteralEnd700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichStringLiteralInbetween__ValueAssignment_in_ruleRichStringLiteralInbetween760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichVarPart794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__0_in_ruleRichVarPart820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredefinedTypes__Alternatives_in_rulePredefinedTypes976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__0_in_rule__MessageEntry__Alternatives_21011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__0_in_rule__MessageEntry__Alternatives_21029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_0_in_rule__RichString__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__0_in_rule__RichString__Alternatives1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PredefinedTypes__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PredefinedTypes__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PredefinedTypes__Alternatives1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PredefinedTypes__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__0__Impl_in_rule__NLS__Group__01210 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NLS__Group__1_in_rule__NLS__Group__01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__PackageAssignment_0_in_rule__NLS__Group__0__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__1__Impl_in_rule__NLS__Group__11271 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NLS__Group__2_in_rule__NLS__Group__11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NLS__Group__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__2__Impl_in_rule__NLS__Group__21333 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NLS__Group__3_in_rule__NLS__Group__21336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1365 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1377 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__NLS__Group__3__Impl_in_rule__NLS__Group__31410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NLS__Group__3__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__0__Impl_in_rule__NLSBundle__Group__01600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__1_in_rule__NLSBundle__Group__01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NLSBundle__Group__0__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__1__Impl_in_rule__NLSBundle__Group__11662 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__2_in_rule__NLSBundle__Group__11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__NameAssignment_1_in_rule__NLSBundle__Group__1__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__2__Impl_in_rule__NLSBundle__Group__21722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__3_in_rule__NLSBundle__Group__21725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NLSBundle__Group__2__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__3__Impl_in_rule__NLSBundle__Group__31784 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__4_in_rule__NLSBundle__Group__31787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__LangAssignment_3_in_rule__NLSBundle__Group__3__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__4__Impl_in_rule__NLSBundle__Group__41844 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5_in_rule__NLSBundle__Group__41847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NLSBundle__Group__4__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5__Impl_in_rule__NLSBundle__Group__51906 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6_in_rule__NLSBundle__Group__51909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__FormatterListAssignment_5_in_rule__NLSBundle__Group__5__Impl1936 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6__Impl_in_rule__NLSBundle__Group__61967 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7_in_rule__NLSBundle__Group__61970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1999 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl2011 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72044 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__8_in_rule__NLSBundle__Group__72047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__0_in_rule__NLSBundle__Group__7__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__8__Impl_in_rule__NLSBundle__Group__82105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NLSBundle__Group__8__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__0__Impl_in_rule__NLSBundle__Group_7__02182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__1_in_rule__NLSBundle__Group_7__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NLSBundle__Group_7__0__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__1__Impl_in_rule__NLSBundle__Group_7__12244 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__2_in_rule__NLSBundle__Group_7__12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__IncludedBundleListAssignment_7_1_in_rule__NLSBundle__Group_7__1__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7__2__Impl_in_rule__NLSBundle__Group_7__22304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7_2__0_in_rule__NLSBundle__Group_7__2__Impl2331 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7_2__0__Impl_in_rule__NLSBundle__Group_7_2__02368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7_2__1_in_rule__NLSBundle__Group_7_2__02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NLSBundle__Group_7_2__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group_7_2__1__Impl_in_rule__NLSBundle__Group_7_2__12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__IncludedBundleListAssignment_7_2_1_in_rule__NLSBundle__Group_7_2__1__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NLSFormatter__Group__0__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02676 = new BitSet(new long[]{0x0000000050100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12736 = new BitSet(new long[]{0x0000000050100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Alternatives_2_in_rule__MessageEntry__Group__2__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02860 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageEntry__Group_1__0__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12922 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22982 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl3012 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__33043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MessageEntry__Group_1__3__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__03110 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__03113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MessageEntry__Group_1_2__0__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__13172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__0__Impl_in_rule__MessageEntry__Group_2_0__03233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__1_in_rule__MessageEntry__Group_2_0__03236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MessageEntry__Group_2_0__0__Impl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__1__Impl_in_rule__MessageEntry__Group_2_0__13295 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__2_in_rule__MessageEntry__Group_2_0__13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_1_in_rule__MessageEntry__Group_2_0__1__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__2__Impl_in_rule__MessageEntry__Group_2_0__23355 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__3_in_rule__MessageEntry__Group_2_0__23358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__0_in_rule__MessageEntry__Group_2_0__2__Impl3385 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__3__Impl_in_rule__MessageEntry__Group_2_0__33416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MessageEntry__Group_2_0__3__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__0__Impl_in_rule__MessageEntry__Group_2_0_2__03483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__1_in_rule__MessageEntry__Group_2_0_2__03486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MessageEntry__Group_2_0_2__0__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__1__Impl_in_rule__MessageEntry__Group_2_0_2__13545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_2_1_in_rule__MessageEntry__Group_2_0_2__1__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__0__Impl_in_rule__MessageEntry__Group_2_1__03606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__1_in_rule__MessageEntry__Group_2_1__03609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageEntry__Group_2_1__0__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__1__Impl_in_rule__MessageEntry__Group_2_1__13668 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__2_in_rule__MessageEntry__Group_2_1__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__EntryRefAssignment_2_1_1_in_rule__MessageEntry__Group_2_1__1__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__2__Impl_in_rule__MessageEntry__Group_2_1__23728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MessageEntry__Group_2_1__2__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03914 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13974 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Message__Group__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__04099 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__04102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__14159 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__14162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__24220 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__24223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl4250 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__34281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__04346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__04349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04468 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4798 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_15024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_35086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_55117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_65148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NLSBundle__IncludedBundleListAssignment_7_15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NLSBundle__IncludedBundleListAssignment_7_2_15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_25288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_05319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_15350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_15381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_2_15443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_2_1_15478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_16013 = new BitSet(new long[]{0x0000000000000002L});

}