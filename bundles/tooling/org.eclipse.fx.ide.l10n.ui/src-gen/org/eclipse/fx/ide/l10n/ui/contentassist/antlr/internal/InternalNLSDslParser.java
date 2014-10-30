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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", "RULE_RICH_TEXT_INBETWEEN", "RULE_STRING", "RULE_IN_RICH_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ANY'", "'NUMBER'", "'DATE'", "'TEMPORAL'", "'{'", "'}'", "'package'", "'bundle'", "'default'", "'formatter'", "'('", "')'", "','", "'['", "']'", "':'", "'.'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_IN_RICH_STRING=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
            else if ( (LA1_0==29) ) {
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

                if ( (LA6_0==25) ) {
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:997:1: rule__NLSBundle__Group__7 : rule__NLSBundle__Group__7__Impl ;
    public final void rule__NLSBundle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1001:1: ( rule__NLSBundle__Group__7__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1002:2: rule__NLSBundle__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72044);
            rule__NLSBundle__Group__7__Impl();

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1008:1: rule__NLSBundle__Group__7__Impl : ( '}' ) ;
    public final void rule__NLSBundle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1012:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1013:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1013:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1014:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FOLLOW_21_in_rule__NLSBundle__Group__7__Impl2072); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__NLSFormatter__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1043:1: rule__NLSFormatter__Group__0 : rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 ;
    public final void rule__NLSFormatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1047:1: ( rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1048:2: rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02119);
            rule__NLSFormatter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02122);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1055:1: rule__NLSFormatter__Group__0__Impl : ( 'formatter' ) ;
    public final void rule__NLSFormatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1059:1: ( ( 'formatter' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1060:1: ( 'formatter' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1060:1: ( 'formatter' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1061:1: 'formatter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__NLSFormatter__Group__0__Impl2150); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1074:1: rule__NLSFormatter__Group__1 : rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 ;
    public final void rule__NLSFormatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1078:1: ( rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1079:2: rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12181);
            rule__NLSFormatter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12184);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1086:1: rule__NLSFormatter__Group__1__Impl : ( ( rule__NLSFormatter__NameAssignment_1 ) ) ;
    public final void rule__NLSFormatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1090:1: ( ( ( rule__NLSFormatter__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1091:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1091:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1092:1: ( rule__NLSFormatter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1093:1: ( rule__NLSFormatter__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1093:2: rule__NLSFormatter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2211);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1103:1: rule__NLSFormatter__Group__2 : rule__NLSFormatter__Group__2__Impl ;
    public final void rule__NLSFormatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1107:1: ( rule__NLSFormatter__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1108:2: rule__NLSFormatter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22241);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1114:1: rule__NLSFormatter__Group__2__Impl : ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) ;
    public final void rule__NLSFormatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1118:1: ( ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1119:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1119:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1120:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1121:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1121:2: rule__NLSFormatter__ClassRefAssignment_2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2268);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1137:1: rule__MessageEntry__Group__0 : rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 ;
    public final void rule__MessageEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1141:1: ( rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1142:2: rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02304);
            rule__MessageEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02307);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1149:1: rule__MessageEntry__Group__0__Impl : ( ( rule__MessageEntry__NameAssignment_0 ) ) ;
    public final void rule__MessageEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1153:1: ( ( ( rule__MessageEntry__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1154:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1154:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1155:1: ( rule__MessageEntry__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1156:1: ( rule__MessageEntry__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1156:2: rule__MessageEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2334);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1166:1: rule__MessageEntry__Group__1 : rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 ;
    public final void rule__MessageEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1170:1: ( rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1171:2: rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12364);
            rule__MessageEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12367);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1178:1: rule__MessageEntry__Group__1__Impl : ( ( rule__MessageEntry__Group_1__0 )? ) ;
    public final void rule__MessageEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1182:1: ( ( ( rule__MessageEntry__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1183:1: ( ( rule__MessageEntry__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1183:1: ( ( rule__MessageEntry__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1184:1: ( rule__MessageEntry__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1185:1: ( rule__MessageEntry__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1185:2: rule__MessageEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2394);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1195:1: rule__MessageEntry__Group__2 : rule__MessageEntry__Group__2__Impl ;
    public final void rule__MessageEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1199:1: ( rule__MessageEntry__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1200:2: rule__MessageEntry__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22425);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1206:1: rule__MessageEntry__Group__2__Impl : ( ( rule__MessageEntry__Alternatives_2 ) ) ;
    public final void rule__MessageEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1210:1: ( ( ( rule__MessageEntry__Alternatives_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1211:1: ( ( rule__MessageEntry__Alternatives_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1211:1: ( ( rule__MessageEntry__Alternatives_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1212:1: ( rule__MessageEntry__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getAlternatives_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1213:1: ( rule__MessageEntry__Alternatives_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1213:2: rule__MessageEntry__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Alternatives_2_in_rule__MessageEntry__Group__2__Impl2452);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1229:1: rule__MessageEntry__Group_1__0 : rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 ;
    public final void rule__MessageEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1233:1: ( rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1234:2: rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02488);
            rule__MessageEntry__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02491);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1241:1: rule__MessageEntry__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MessageEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1245:1: ( ( '(' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1246:1: ( '(' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1246:1: ( '(' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1247:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MessageEntry__Group_1__0__Impl2519); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1260:1: rule__MessageEntry__Group_1__1 : rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 ;
    public final void rule__MessageEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1264:1: ( rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1265:2: rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12550);
            rule__MessageEntry__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12553);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1272:1: rule__MessageEntry__Group_1__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) ;
    public final void rule__MessageEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1276:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1277:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1277:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1278:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1279:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1279:2: rule__MessageEntry__ParamListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2580);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1289:1: rule__MessageEntry__Group_1__2 : rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 ;
    public final void rule__MessageEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1293:1: ( rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1294:2: rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22610);
            rule__MessageEntry__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22613);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1301:1: rule__MessageEntry__Group_1__2__Impl : ( ( rule__MessageEntry__Group_1_2__0 )* ) ;
    public final void rule__MessageEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1305:1: ( ( ( rule__MessageEntry__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1306:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1306:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1307:1: ( rule__MessageEntry__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1308:1: ( rule__MessageEntry__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1308:2: rule__MessageEntry__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl2640);
            	    rule__MessageEntry__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1318:1: rule__MessageEntry__Group_1__3 : rule__MessageEntry__Group_1__3__Impl ;
    public final void rule__MessageEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1322:1: ( rule__MessageEntry__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1323:2: rule__MessageEntry__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__32671);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1329:1: rule__MessageEntry__Group_1__3__Impl : ( ')' ) ;
    public final void rule__MessageEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1333:1: ( ( ')' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1334:1: ( ')' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1334:1: ( ')' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1335:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__MessageEntry__Group_1__3__Impl2699); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1356:1: rule__MessageEntry__Group_1_2__0 : rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 ;
    public final void rule__MessageEntry__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1360:1: ( rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1361:2: rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__02738);
            rule__MessageEntry__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__02741);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1368:1: rule__MessageEntry__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1372:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1373:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1373:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1374:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MessageEntry__Group_1_2__0__Impl2769); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1387:1: rule__MessageEntry__Group_1_2__1 : rule__MessageEntry__Group_1_2__1__Impl ;
    public final void rule__MessageEntry__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1391:1: ( rule__MessageEntry__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1392:2: rule__MessageEntry__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__12800);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1398:1: rule__MessageEntry__Group_1_2__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) ;
    public final void rule__MessageEntry__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1402:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1403:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1403:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1404:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1405:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1405:2: rule__MessageEntry__ParamListAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl2827);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1419:1: rule__MessageEntry__Group_2_0__0 : rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1 ;
    public final void rule__MessageEntry__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1423:1: ( rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1424:2: rule__MessageEntry__Group_2_0__0__Impl rule__MessageEntry__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__0__Impl_in_rule__MessageEntry__Group_2_0__02861);
            rule__MessageEntry__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__1_in_rule__MessageEntry__Group_2_0__02864);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1431:1: rule__MessageEntry__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__MessageEntry__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1435:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1436:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1436:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1437:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__MessageEntry__Group_2_0__0__Impl2892); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1450:1: rule__MessageEntry__Group_2_0__1 : rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2 ;
    public final void rule__MessageEntry__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1454:1: ( rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1455:2: rule__MessageEntry__Group_2_0__1__Impl rule__MessageEntry__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__1__Impl_in_rule__MessageEntry__Group_2_0__12923);
            rule__MessageEntry__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__2_in_rule__MessageEntry__Group_2_0__12926);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1462:1: rule__MessageEntry__Group_2_0__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) ) ;
    public final void rule__MessageEntry__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1466:1: ( ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1467:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1467:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1468:1: ( rule__MessageEntry__MessageListAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1469:1: ( rule__MessageEntry__MessageListAssignment_2_0_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1469:2: rule__MessageEntry__MessageListAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_1_in_rule__MessageEntry__Group_2_0__1__Impl2953);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1479:1: rule__MessageEntry__Group_2_0__2 : rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3 ;
    public final void rule__MessageEntry__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1483:1: ( rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1484:2: rule__MessageEntry__Group_2_0__2__Impl rule__MessageEntry__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__2__Impl_in_rule__MessageEntry__Group_2_0__22983);
            rule__MessageEntry__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__3_in_rule__MessageEntry__Group_2_0__22986);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1491:1: rule__MessageEntry__Group_2_0__2__Impl : ( ( rule__MessageEntry__Group_2_0_2__0 )* ) ;
    public final void rule__MessageEntry__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1495:1: ( ( ( rule__MessageEntry__Group_2_0_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1496:1: ( ( rule__MessageEntry__Group_2_0_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1496:1: ( ( rule__MessageEntry__Group_2_0_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1497:1: ( rule__MessageEntry__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_2_0_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1498:1: ( rule__MessageEntry__Group_2_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1498:2: rule__MessageEntry__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__0_in_rule__MessageEntry__Group_2_0__2__Impl3013);
            	    rule__MessageEntry__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1508:1: rule__MessageEntry__Group_2_0__3 : rule__MessageEntry__Group_2_0__3__Impl ;
    public final void rule__MessageEntry__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1512:1: ( rule__MessageEntry__Group_2_0__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1513:2: rule__MessageEntry__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0__3__Impl_in_rule__MessageEntry__Group_2_0__33044);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1519:1: rule__MessageEntry__Group_2_0__3__Impl : ( '}' ) ;
    public final void rule__MessageEntry__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1523:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1524:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1524:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1525:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__MessageEntry__Group_2_0__3__Impl3072); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1546:1: rule__MessageEntry__Group_2_0_2__0 : rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1 ;
    public final void rule__MessageEntry__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1550:1: ( rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1551:2: rule__MessageEntry__Group_2_0_2__0__Impl rule__MessageEntry__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__0__Impl_in_rule__MessageEntry__Group_2_0_2__03111);
            rule__MessageEntry__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__1_in_rule__MessageEntry__Group_2_0_2__03114);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1558:1: rule__MessageEntry__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1562:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1563:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1563:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1564:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MessageEntry__Group_2_0_2__0__Impl3142); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1577:1: rule__MessageEntry__Group_2_0_2__1 : rule__MessageEntry__Group_2_0_2__1__Impl ;
    public final void rule__MessageEntry__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1581:1: ( rule__MessageEntry__Group_2_0_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1582:2: rule__MessageEntry__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_0_2__1__Impl_in_rule__MessageEntry__Group_2_0_2__13173);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1588:1: rule__MessageEntry__Group_2_0_2__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) ) ;
    public final void rule__MessageEntry__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1592:1: ( ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1593:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1593:1: ( ( rule__MessageEntry__MessageListAssignment_2_0_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1594:1: ( rule__MessageEntry__MessageListAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_2_0_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1595:1: ( rule__MessageEntry__MessageListAssignment_2_0_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1595:2: rule__MessageEntry__MessageListAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_2_1_in_rule__MessageEntry__Group_2_0_2__1__Impl3200);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1609:1: rule__MessageEntry__Group_2_1__0 : rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1 ;
    public final void rule__MessageEntry__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1613:1: ( rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1614:2: rule__MessageEntry__Group_2_1__0__Impl rule__MessageEntry__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__0__Impl_in_rule__MessageEntry__Group_2_1__03234);
            rule__MessageEntry__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__1_in_rule__MessageEntry__Group_2_1__03237);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1621:1: rule__MessageEntry__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__MessageEntry__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1625:1: ( ( '[' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1626:1: ( '[' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1626:1: ( '[' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1627:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MessageEntry__Group_2_1__0__Impl3265); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1640:1: rule__MessageEntry__Group_2_1__1 : rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2 ;
    public final void rule__MessageEntry__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1644:1: ( rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1645:2: rule__MessageEntry__Group_2_1__1__Impl rule__MessageEntry__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__1__Impl_in_rule__MessageEntry__Group_2_1__13296);
            rule__MessageEntry__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__2_in_rule__MessageEntry__Group_2_1__13299);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1652:1: rule__MessageEntry__Group_2_1__1__Impl : ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) ) ;
    public final void rule__MessageEntry__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1656:1: ( ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1657:1: ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1657:1: ( ( rule__MessageEntry__EntryRefAssignment_2_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1658:1: ( rule__MessageEntry__EntryRefAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_2_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1659:1: ( rule__MessageEntry__EntryRefAssignment_2_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1659:2: rule__MessageEntry__EntryRefAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__EntryRefAssignment_2_1_1_in_rule__MessageEntry__Group_2_1__1__Impl3326);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1669:1: rule__MessageEntry__Group_2_1__2 : rule__MessageEntry__Group_2_1__2__Impl ;
    public final void rule__MessageEntry__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1673:1: ( rule__MessageEntry__Group_2_1__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1674:2: rule__MessageEntry__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_2_1__2__Impl_in_rule__MessageEntry__Group_2_1__23356);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1680:1: rule__MessageEntry__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__MessageEntry__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1684:1: ( ( ']' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1685:1: ( ']' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1685:1: ( ']' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1686:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_2_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MessageEntry__Group_2_1__2__Impl3384); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1705:1: rule__MessageParam__Group__0 : rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 ;
    public final void rule__MessageParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1709:1: ( rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1710:2: rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03421);
            rule__MessageParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03424);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1717:1: rule__MessageParam__Group__0__Impl : ( ( rule__MessageParam__PredefinedAssignment_0 ) ) ;
    public final void rule__MessageParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1721:1: ( ( ( rule__MessageParam__PredefinedAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1722:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1722:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1723:1: ( rule__MessageParam__PredefinedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1724:1: ( rule__MessageParam__PredefinedAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1724:2: rule__MessageParam__PredefinedAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3451);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1734:1: rule__MessageParam__Group__1 : rule__MessageParam__Group__1__Impl ;
    public final void rule__MessageParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1738:1: ( rule__MessageParam__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1739:2: rule__MessageParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13481);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1745:1: rule__MessageParam__Group__1__Impl : ( ( rule__MessageParam__VarAssignment_1 ) ) ;
    public final void rule__MessageParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1749:1: ( ( ( rule__MessageParam__VarAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1750:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1750:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1751:1: ( rule__MessageParam__VarAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1752:1: ( rule__MessageParam__VarAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1752:2: rule__MessageParam__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3508);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1766:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1770:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1771:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03542);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03545);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1778:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1782:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1783:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1783:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1784:1: ( rule__Message__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1785:1: ( rule__Message__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1785:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3572);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1795:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1799:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1800:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13602);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13605);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1807:1: rule__Message__Group__1__Impl : ( ':' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1811:1: ( ( ':' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1812:1: ( ':' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1812:1: ( ':' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1813:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getColonKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Message__Group__1__Impl3633); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1826:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1830:1: ( rule__Message__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1831:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23664);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1837:1: rule__Message__Group__2__Impl : ( ( rule__Message__MessageAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1841:1: ( ( ( rule__Message__MessageAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1842:1: ( ( rule__Message__MessageAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1842:1: ( ( rule__Message__MessageAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1843:1: ( rule__Message__MessageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1844:1: ( rule__Message__MessageAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1844:2: rule__Message__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl3691);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1860:1: rule__RichString__Group_1__0 : rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 ;
    public final void rule__RichString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1864:1: ( rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1865:2: rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__03727);
            rule__RichString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__03730);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1872:1: rule__RichString__Group_1__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__RichString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1876:1: ( ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1877:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1877:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1878:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1879:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1879:2: rule__RichString__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl3757);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1889:1: rule__RichString__Group_1__1 : rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 ;
    public final void rule__RichString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1893:1: ( rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1894:2: rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__13787);
            rule__RichString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__13790);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1901:1: rule__RichString__Group_1__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) ;
    public final void rule__RichString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1905:1: ( ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1906:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1906:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1907:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1908:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1908:2: rule__RichString__ExpressionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl3817);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1918:1: rule__RichString__Group_1__2 : rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 ;
    public final void rule__RichString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1922:1: ( rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1923:2: rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__23848);
            rule__RichString__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__23851);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1930:1: rule__RichString__Group_1__2__Impl : ( ( rule__RichString__Group_1_2__0 )* ) ;
    public final void rule__RichString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1934:1: ( ( ( rule__RichString__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1935:1: ( ( rule__RichString__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1935:1: ( ( rule__RichString__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1936:1: ( rule__RichString__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1937:1: ( rule__RichString__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_RICH_TEXT_INBETWEEN) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1937:2: rule__RichString__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl3878);
            	    rule__RichString__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1947:1: rule__RichString__Group_1__3 : rule__RichString__Group_1__3__Impl ;
    public final void rule__RichString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1951:1: ( rule__RichString__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1952:2: rule__RichString__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__33909);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1958:1: rule__RichString__Group_1__3__Impl : ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) ;
    public final void rule__RichString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1962:1: ( ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1963:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1963:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1964:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1965:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1965:2: rule__RichString__ExpressionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl3936);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1983:1: rule__RichString__Group_1_2__0 : rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 ;
    public final void rule__RichString__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1987:1: ( rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1988:2: rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__03974);
            rule__RichString__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__03977);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1995:1: rule__RichString__Group_1_2__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) ;
    public final void rule__RichString__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1999:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2000:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2000:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2001:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2002:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2002:2: rule__RichString__ExpressionsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4004);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2012:1: rule__RichString__Group_1_2__1 : rule__RichString__Group_1_2__1__Impl ;
    public final void rule__RichString__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2016:1: ( rule__RichString__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2017:2: rule__RichString__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14034);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2023:1: rule__RichString__Group_1_2__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) ;
    public final void rule__RichString__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2027:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2028:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2028:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2029:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2030:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2030:2: rule__RichString__ExpressionsAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4061);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2044:1: rule__RichVarPart__Group__0 : rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 ;
    public final void rule__RichVarPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2048:1: ( rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2049:2: rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04096);
            rule__RichVarPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04099);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2056:1: rule__RichVarPart__Group__0__Impl : ( ( rule__RichVarPart__KeyAssignment_0 ) ) ;
    public final void rule__RichVarPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2060:1: ( ( ( rule__RichVarPart__KeyAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2061:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2061:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2062:1: ( rule__RichVarPart__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2063:1: ( rule__RichVarPart__KeyAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2063:2: rule__RichVarPart__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4126);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2073:1: rule__RichVarPart__Group__1 : rule__RichVarPart__Group__1__Impl ;
    public final void rule__RichVarPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2077:1: ( rule__RichVarPart__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2078:2: rule__RichVarPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14156);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2084:1: rule__RichVarPart__Group__1__Impl : ( ( rule__RichVarPart__Group_1__0 )? ) ;
    public final void rule__RichVarPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2088:1: ( ( ( rule__RichVarPart__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2089:1: ( ( rule__RichVarPart__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2089:1: ( ( rule__RichVarPart__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2090:1: ( rule__RichVarPart__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2091:1: ( rule__RichVarPart__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2091:2: rule__RichVarPart__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4183);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2105:1: rule__RichVarPart__Group_1__0 : rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 ;
    public final void rule__RichVarPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2109:1: ( rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2110:2: rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04218);
            rule__RichVarPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04221);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2117:1: rule__RichVarPart__Group_1__0__Impl : ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) ;
    public final void rule__RichVarPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2121:1: ( ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2122:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2122:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2123:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2124:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2124:2: rule__RichVarPart__FormatAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4248);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2134:1: rule__RichVarPart__Group_1__1 : rule__RichVarPart__Group_1__1__Impl ;
    public final void rule__RichVarPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2138:1: ( rule__RichVarPart__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2139:2: rule__RichVarPart__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14278);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2145:1: rule__RichVarPart__Group_1__1__Impl : ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) ;
    public final void rule__RichVarPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2149:1: ( ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2150:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2150:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2151:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2152:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2152:2: rule__RichVarPart__FormatterClassAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4305);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2166:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2170:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2171:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04340);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04343);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2178:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2182:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2183:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2183:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2184:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4370);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2195:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2199:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2200:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14399);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2206:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2210:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2211:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2211:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2212:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2213:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2213:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4426);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2227:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2231:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2232:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04461);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04464);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2239:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2243:1: ( ( ( '.' ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2244:1: ( ( '.' ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2244:1: ( ( '.' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2245:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2246:1: ( '.' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2247:2: '.'
            {
            match(input,32,FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl4493); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2258:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2262:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2263:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14525);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2269:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2273:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2274:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2274:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2275:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4552);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2291:1: rule__NLS__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__NLS__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2295:1: ( ( rulePackageDeclaration ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2296:1: ( rulePackageDeclaration )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2296:1: ( rulePackageDeclaration )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2297:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04590);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2306:1: rule__NLS__BundleListAssignment_2 : ( ruleNLSBundle ) ;
    public final void rule__NLS__BundleListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2310:1: ( ( ruleNLSBundle ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2311:1: ( ruleNLSBundle )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2311:1: ( ruleNLSBundle )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2312:1: ruleNLSBundle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24621);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2321:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2325:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2326:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2326:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2327:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14652);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2336:1: rule__NLSBundle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSBundle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2340:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2341:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2341:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2342:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_14683); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2351:1: rule__NLSBundle__LangAssignment_3 : ( RULE_ID ) ;
    public final void rule__NLSBundle__LangAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2355:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2356:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2356:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2357:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_34714); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2366:1: rule__NLSBundle__FormatterListAssignment_5 : ( ruleNLSFormatter ) ;
    public final void rule__NLSBundle__FormatterListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2370:1: ( ( ruleNLSFormatter ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2371:1: ( ruleNLSFormatter )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2371:1: ( ruleNLSFormatter )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2372:1: ruleNLSFormatter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_54745);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2381:1: rule__NLSBundle__MessageEntryListAssignment_6 : ( ruleMessageEntry ) ;
    public final void rule__NLSBundle__MessageEntryListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2385:1: ( ( ruleMessageEntry ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2386:1: ( ruleMessageEntry )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2386:1: ( ruleMessageEntry )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2387:1: ruleMessageEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_64776);
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


    // $ANTLR start "rule__NLSFormatter__NameAssignment_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2396:1: rule__NLSFormatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSFormatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2400:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2401:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2401:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2402:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_14807); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2411:1: rule__NLSFormatter__ClassRefAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NLSFormatter__ClassRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2415:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2416:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2416:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2417:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_24838);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2426:1: rule__MessageEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2430:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2431:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2431:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2432:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_04869); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2441:1: rule__MessageEntry__ParamListAssignment_1_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2445:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2446:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2446:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2447:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_14900);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2456:1: rule__MessageEntry__ParamListAssignment_1_2_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2460:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2461:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2461:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2462:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_14931);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2471:1: rule__MessageEntry__MessageListAssignment_2_0_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2475:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2476:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2476:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2477:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_14962);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2486:1: rule__MessageEntry__MessageListAssignment_2_0_2_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2490:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2491:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2491:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2492:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_2_14993);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2501:1: rule__MessageEntry__EntryRefAssignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MessageEntry__EntryRefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2505:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2506:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2506:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2507:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2508:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2509:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryQualifiedNameParserRuleCall_2_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_2_1_15028);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2520:1: rule__MessageParam__PredefinedAssignment_0 : ( rulePredefinedTypes ) ;
    public final void rule__MessageParam__PredefinedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2524:1: ( ( rulePredefinedTypes ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2525:1: ( rulePredefinedTypes )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2525:1: ( rulePredefinedTypes )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2526:1: rulePredefinedTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05063);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2535:1: rule__MessageParam__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageParam__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2539:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2540:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2540:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2541:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15094); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2550:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2554:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2555:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2555:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2556:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05125); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2565:1: rule__Message__MessageAssignment_2 : ( ruleRichString ) ;
    public final void rule__Message__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2569:1: ( ( ruleRichString ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2570:1: ( ruleRichString )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2570:1: ( ruleRichString )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2571:1: ruleRichString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25156);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2580:1: rule__RichString__ExpressionsAssignment_0 : ( ruleRichStringLiteral ) ;
    public final void rule__RichString__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2584:1: ( ( ruleRichStringLiteral ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2585:1: ( ruleRichStringLiteral )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2585:1: ( ruleRichStringLiteral )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2586:1: ruleRichStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05187);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2595:1: rule__RichString__ExpressionsAssignment_1_0 : ( ruleRichStringLiteralStart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2599:1: ( ( ruleRichStringLiteralStart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2600:1: ( ruleRichStringLiteralStart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2600:1: ( ruleRichStringLiteralStart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2601:1: ruleRichStringLiteralStart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05218);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2610:1: rule__RichString__ExpressionsAssignment_1_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2614:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2615:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2615:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2616:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15249);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2625:1: rule__RichString__ExpressionsAssignment_1_2_0 : ( ruleRichStringLiteralInbetween ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2629:1: ( ( ruleRichStringLiteralInbetween ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2630:1: ( ruleRichStringLiteralInbetween )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2630:1: ( ruleRichStringLiteralInbetween )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2631:1: ruleRichStringLiteralInbetween
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05280);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2640:1: rule__RichString__ExpressionsAssignment_1_2_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2644:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2645:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2645:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2646:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15311);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2655:1: rule__RichString__ExpressionsAssignment_1_3 : ( ruleRichStringLiteralEnd ) ;
    public final void rule__RichString__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2659:1: ( ( ruleRichStringLiteralEnd ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2660:1: ( ruleRichStringLiteralEnd )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2660:1: ( ruleRichStringLiteralEnd )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2661:1: ruleRichStringLiteralEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35342);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2670:1: rule__RichStringLiteral__ValueAssignment : ( RULE_RICH_TEXT ) ;
    public final void rule__RichStringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2674:1: ( ( RULE_RICH_TEXT ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2675:1: ( RULE_RICH_TEXT )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2675:1: ( RULE_RICH_TEXT )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2676:1: RULE_RICH_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5373); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2685:1: rule__RichStringLiteralStart__ValueAssignment : ( RULE_RICH_TEXT_START ) ;
    public final void rule__RichStringLiteralStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2689:1: ( ( RULE_RICH_TEXT_START ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2690:1: ( RULE_RICH_TEXT_START )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2690:1: ( RULE_RICH_TEXT_START )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2691:1: RULE_RICH_TEXT_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5404); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2700:1: rule__RichStringLiteralEnd__ValueAssignment : ( RULE_RICH_TEXT_END ) ;
    public final void rule__RichStringLiteralEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2704:1: ( ( RULE_RICH_TEXT_END ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2705:1: ( RULE_RICH_TEXT_END )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2705:1: ( RULE_RICH_TEXT_END )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2706:1: RULE_RICH_TEXT_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_END,FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5435); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2715:1: rule__RichStringLiteralInbetween__ValueAssignment : ( RULE_RICH_TEXT_INBETWEEN ) ;
    public final void rule__RichStringLiteralInbetween__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2719:1: ( ( RULE_RICH_TEXT_INBETWEEN ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2720:1: ( RULE_RICH_TEXT_INBETWEEN )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2720:1: ( RULE_RICH_TEXT_INBETWEEN )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2721:1: RULE_RICH_TEXT_INBETWEEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_INBETWEEN,FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5466); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2730:1: rule__RichVarPart__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__RichVarPart__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2734:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2735:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2735:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2736:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05497); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2745:1: rule__RichVarPart__FormatAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__RichVarPart__FormatAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2749:1: ( ( RULE_STRING ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2750:1: ( RULE_STRING )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2750:1: ( RULE_STRING )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2751:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05528); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2760:1: rule__RichVarPart__FormatterClassAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RichVarPart__FormatterClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2764:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2765:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2765:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2766:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2767:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2768:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_15563);
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
    public static final BitSet FOLLOW_rule__NLSBundle__Group__4__Impl_in_rule__NLSBundle__Group__41844 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5_in_rule__NLSBundle__Group__41847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NLSBundle__Group__4__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5__Impl_in_rule__NLSBundle__Group__51906 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6_in_rule__NLSBundle__Group__51909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__FormatterListAssignment_5_in_rule__NLSBundle__Group__5__Impl1936 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6__Impl_in_rule__NLSBundle__Group__61967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7_in_rule__NLSBundle__Group__61970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1999 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl2011 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NLSBundle__Group__7__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NLSFormatter__Group__0__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02304 = new BitSet(new long[]{0x0000000024100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12364 = new BitSet(new long[]{0x0000000024100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Alternatives_2_in_rule__MessageEntry__Group__2__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02488 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MessageEntry__Group_1__0__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12550 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22610 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl2640 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__32671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MessageEntry__Group_1__3__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__02738 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__02741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageEntry__Group_1_2__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__0__Impl_in_rule__MessageEntry__Group_2_0__02861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__1_in_rule__MessageEntry__Group_2_0__02864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MessageEntry__Group_2_0__0__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__1__Impl_in_rule__MessageEntry__Group_2_0__12923 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__2_in_rule__MessageEntry__Group_2_0__12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_1_in_rule__MessageEntry__Group_2_0__1__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__2__Impl_in_rule__MessageEntry__Group_2_0__22983 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__3_in_rule__MessageEntry__Group_2_0__22986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__0_in_rule__MessageEntry__Group_2_0__2__Impl3013 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0__3__Impl_in_rule__MessageEntry__Group_2_0__33044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MessageEntry__Group_2_0__3__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__0__Impl_in_rule__MessageEntry__Group_2_0_2__03111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__1_in_rule__MessageEntry__Group_2_0_2__03114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageEntry__Group_2_0_2__0__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_0_2__1__Impl_in_rule__MessageEntry__Group_2_0_2__13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_2_0_2_1_in_rule__MessageEntry__Group_2_0_2__1__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__0__Impl_in_rule__MessageEntry__Group_2_1__03234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__1_in_rule__MessageEntry__Group_2_1__03237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MessageEntry__Group_2_1__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__1__Impl_in_rule__MessageEntry__Group_2_1__13296 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__2_in_rule__MessageEntry__Group_2_1__13299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__EntryRefAssignment_2_1_1_in_rule__MessageEntry__Group_2_1__1__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_2_1__2__Impl_in_rule__MessageEntry__Group_2_1__23356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageEntry__Group_2_1__2__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03542 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13602 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Message__Group__1__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__03727 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__03730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__13787 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__23848 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__23851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl3878 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__33909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__03974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04096 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04340 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4426 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_34714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_54745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_64776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_14807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_24838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_04869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_14900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_14931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_2_0_2_14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_2_1_15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_15563 = new BitSet(new long[]{0x0000000000000002L});

}