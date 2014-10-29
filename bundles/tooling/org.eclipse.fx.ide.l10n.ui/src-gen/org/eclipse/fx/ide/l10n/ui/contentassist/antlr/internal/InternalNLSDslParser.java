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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", "RULE_RICH_TEXT_INBETWEEN", "RULE_STRING", "RULE_IN_RICH_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ANY'", "'NUMBER'", "'DATE'", "'{'", "'}'", "'package'", "'bundle'", "'default'", "'formatter'", "':'", "'('", "')'", "','", "'['", "']'", "'.'"
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


    // $ANTLR start "rule__MessageEntry__Alternatives_3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:500:1: rule__MessageEntry__Alternatives_3 : ( ( ( rule__MessageEntry__Group_3_0__0 ) ) | ( ( rule__MessageEntry__Group_3_1__0 ) ) );
    public final void rule__MessageEntry__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:504:1: ( ( ( rule__MessageEntry__Group_3_0__0 ) ) | ( ( rule__MessageEntry__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
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
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:505:1: ( ( rule__MessageEntry__Group_3_0__0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:505:1: ( ( rule__MessageEntry__Group_3_0__0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:506:1: ( rule__MessageEntry__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageEntryAccess().getGroup_3_0()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:507:1: ( rule__MessageEntry__Group_3_0__0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:507:2: rule__MessageEntry__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__0_in_rule__MessageEntry__Alternatives_31011);
                    rule__MessageEntry__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageEntryAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:511:6: ( ( rule__MessageEntry__Group_3_1__0 ) )
                    {
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:511:6: ( ( rule__MessageEntry__Group_3_1__0 ) )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:512:1: ( rule__MessageEntry__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageEntryAccess().getGroup_3_1()); 
                    }
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:513:1: ( rule__MessageEntry__Group_3_1__0 )
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:513:2: rule__MessageEntry__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__0_in_rule__MessageEntry__Alternatives_31029);
                    rule__MessageEntry__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageEntryAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__MessageEntry__Alternatives_3"


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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:544:1: rule__PredefinedTypes__Alternatives : ( ( ( 'ANY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) );
    public final void rule__PredefinedTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:548:1: ( ( ( 'ANY' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) )
            int alt3=3;
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

            }
        }
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:577:1: rule__NLS__Group__0 : rule__NLS__Group__0__Impl rule__NLS__Group__1 ;
    public final void rule__NLS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:581:1: ( rule__NLS__Group__0__Impl rule__NLS__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:582:2: rule__NLS__Group__0__Impl rule__NLS__Group__1
            {
            pushFollow(FOLLOW_rule__NLS__Group__0__Impl_in_rule__NLS__Group__01189);
            rule__NLS__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__1_in_rule__NLS__Group__01192);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:589:1: rule__NLS__Group__0__Impl : ( ( rule__NLS__PackageAssignment_0 )? ) ;
    public final void rule__NLS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:593:1: ( ( ( rule__NLS__PackageAssignment_0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:594:1: ( ( rule__NLS__PackageAssignment_0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:594:1: ( ( rule__NLS__PackageAssignment_0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:595:1: ( rule__NLS__PackageAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getPackageAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:596:1: ( rule__NLS__PackageAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:596:2: rule__NLS__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NLS__PackageAssignment_0_in_rule__NLS__Group__0__Impl1219);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:606:1: rule__NLS__Group__1 : rule__NLS__Group__1__Impl rule__NLS__Group__2 ;
    public final void rule__NLS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:610:1: ( rule__NLS__Group__1__Impl rule__NLS__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:611:2: rule__NLS__Group__1__Impl rule__NLS__Group__2
            {
            pushFollow(FOLLOW_rule__NLS__Group__1__Impl_in_rule__NLS__Group__11250);
            rule__NLS__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__2_in_rule__NLS__Group__11253);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:618:1: rule__NLS__Group__1__Impl : ( '{' ) ;
    public final void rule__NLS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:622:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:623:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:623:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:624:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__NLS__Group__1__Impl1281); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:637:1: rule__NLS__Group__2 : rule__NLS__Group__2__Impl rule__NLS__Group__3 ;
    public final void rule__NLS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:641:1: ( rule__NLS__Group__2__Impl rule__NLS__Group__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:642:2: rule__NLS__Group__2__Impl rule__NLS__Group__3
            {
            pushFollow(FOLLOW_rule__NLS__Group__2__Impl_in_rule__NLS__Group__21312);
            rule__NLS__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLS__Group__3_in_rule__NLS__Group__21315);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:649:1: rule__NLS__Group__2__Impl : ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) ) ;
    public final void rule__NLS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:653:1: ( ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:654:1: ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:654:1: ( ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:655:1: ( ( rule__NLS__BundleListAssignment_2 ) ) ( ( rule__NLS__BundleListAssignment_2 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:655:1: ( ( rule__NLS__BundleListAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:656:1: ( rule__NLS__BundleListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:657:1: ( rule__NLS__BundleListAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:657:2: rule__NLS__BundleListAssignment_2
            {
            pushFollow(FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1344);
            rule__NLS__BundleListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }

            }

            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:660:1: ( ( rule__NLS__BundleListAssignment_2 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:661:1: ( rule__NLS__BundleListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:662:1: ( rule__NLS__BundleListAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:662:2: rule__NLS__BundleListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1356);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:673:1: rule__NLS__Group__3 : rule__NLS__Group__3__Impl ;
    public final void rule__NLS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:677:1: ( rule__NLS__Group__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:678:2: rule__NLS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NLS__Group__3__Impl_in_rule__NLS__Group__31389);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:684:1: rule__NLS__Group__3__Impl : ( '}' ) ;
    public final void rule__NLS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:688:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:689:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:689:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:690:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__NLS__Group__3__Impl1417); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:711:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:715:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:716:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01456);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01459);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:723:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:727:1: ( ( 'package' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:728:1: ( 'package' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:728:1: ( 'package' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:729:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl1487); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:742:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:746:1: ( rule__PackageDeclaration__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:747:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11518);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:753:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:757:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:758:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:758:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:759:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:760:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:760:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1545);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:774:1: rule__NLSBundle__Group__0 : rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1 ;
    public final void rule__NLSBundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:778:1: ( rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:779:2: rule__NLSBundle__Group__0__Impl rule__NLSBundle__Group__1
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__0__Impl_in_rule__NLSBundle__Group__01579);
            rule__NLSBundle__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__1_in_rule__NLSBundle__Group__01582);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:786:1: rule__NLSBundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__NLSBundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:790:1: ( ( 'bundle' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:791:1: ( 'bundle' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:791:1: ( 'bundle' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:792:1: 'bundle'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getBundleKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__NLSBundle__Group__0__Impl1610); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:805:1: rule__NLSBundle__Group__1 : rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2 ;
    public final void rule__NLSBundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:809:1: ( rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:810:2: rule__NLSBundle__Group__1__Impl rule__NLSBundle__Group__2
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__1__Impl_in_rule__NLSBundle__Group__11641);
            rule__NLSBundle__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__2_in_rule__NLSBundle__Group__11644);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:817:1: rule__NLSBundle__Group__1__Impl : ( ( rule__NLSBundle__NameAssignment_1 ) ) ;
    public final void rule__NLSBundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:821:1: ( ( ( rule__NLSBundle__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:822:1: ( ( rule__NLSBundle__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:822:1: ( ( rule__NLSBundle__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:823:1: ( rule__NLSBundle__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:824:1: ( rule__NLSBundle__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:824:2: rule__NLSBundle__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NLSBundle__NameAssignment_1_in_rule__NLSBundle__Group__1__Impl1671);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:834:1: rule__NLSBundle__Group__2 : rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3 ;
    public final void rule__NLSBundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:838:1: ( rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:839:2: rule__NLSBundle__Group__2__Impl rule__NLSBundle__Group__3
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__2__Impl_in_rule__NLSBundle__Group__21701);
            rule__NLSBundle__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__3_in_rule__NLSBundle__Group__21704);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:846:1: rule__NLSBundle__Group__2__Impl : ( 'default' ) ;
    public final void rule__NLSBundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:850:1: ( ( 'default' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:851:1: ( 'default' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:851:1: ( 'default' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:852:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getDefaultKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__NLSBundle__Group__2__Impl1732); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:865:1: rule__NLSBundle__Group__3 : rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4 ;
    public final void rule__NLSBundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:869:1: ( rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:870:2: rule__NLSBundle__Group__3__Impl rule__NLSBundle__Group__4
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__3__Impl_in_rule__NLSBundle__Group__31763);
            rule__NLSBundle__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__4_in_rule__NLSBundle__Group__31766);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:877:1: rule__NLSBundle__Group__3__Impl : ( ( rule__NLSBundle__LangAssignment_3 ) ) ;
    public final void rule__NLSBundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:881:1: ( ( ( rule__NLSBundle__LangAssignment_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:882:1: ( ( rule__NLSBundle__LangAssignment_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:882:1: ( ( rule__NLSBundle__LangAssignment_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:883:1: ( rule__NLSBundle__LangAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLangAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:884:1: ( rule__NLSBundle__LangAssignment_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:884:2: rule__NLSBundle__LangAssignment_3
            {
            pushFollow(FOLLOW_rule__NLSBundle__LangAssignment_3_in_rule__NLSBundle__Group__3__Impl1793);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:894:1: rule__NLSBundle__Group__4 : rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5 ;
    public final void rule__NLSBundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:898:1: ( rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:899:2: rule__NLSBundle__Group__4__Impl rule__NLSBundle__Group__5
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__4__Impl_in_rule__NLSBundle__Group__41823);
            rule__NLSBundle__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__5_in_rule__NLSBundle__Group__41826);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:906:1: rule__NLSBundle__Group__4__Impl : ( '{' ) ;
    public final void rule__NLSBundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:910:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:911:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:911:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:912:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__NLSBundle__Group__4__Impl1854); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:925:1: rule__NLSBundle__Group__5 : rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6 ;
    public final void rule__NLSBundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:929:1: ( rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:930:2: rule__NLSBundle__Group__5__Impl rule__NLSBundle__Group__6
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__5__Impl_in_rule__NLSBundle__Group__51885);
            rule__NLSBundle__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__6_in_rule__NLSBundle__Group__51888);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:937:1: rule__NLSBundle__Group__5__Impl : ( ( rule__NLSBundle__FormatterListAssignment_5 )* ) ;
    public final void rule__NLSBundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:941:1: ( ( ( rule__NLSBundle__FormatterListAssignment_5 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:942:1: ( ( rule__NLSBundle__FormatterListAssignment_5 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:942:1: ( ( rule__NLSBundle__FormatterListAssignment_5 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:943:1: ( rule__NLSBundle__FormatterListAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getFormatterListAssignment_5()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:944:1: ( rule__NLSBundle__FormatterListAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:944:2: rule__NLSBundle__FormatterListAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__NLSBundle__FormatterListAssignment_5_in_rule__NLSBundle__Group__5__Impl1915);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:954:1: rule__NLSBundle__Group__6 : rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7 ;
    public final void rule__NLSBundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:958:1: ( rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:959:2: rule__NLSBundle__Group__6__Impl rule__NLSBundle__Group__7
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__6__Impl_in_rule__NLSBundle__Group__61946);
            rule__NLSBundle__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSBundle__Group__7_in_rule__NLSBundle__Group__61949);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:966:1: rule__NLSBundle__Group__6__Impl : ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) ) ;
    public final void rule__NLSBundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:970:1: ( ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:971:1: ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:971:1: ( ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:972:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) ) ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:972:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:973:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:974:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:974:2: rule__NLSBundle__MessageEntryListAssignment_6
            {
            pushFollow(FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1978);
            rule__NLSBundle__MessageEntryListAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }

            }

            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:977:1: ( ( rule__NLSBundle__MessageEntryListAssignment_6 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:978:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListAssignment_6()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:979:1: ( rule__NLSBundle__MessageEntryListAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:979:2: rule__NLSBundle__MessageEntryListAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1990);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:990:1: rule__NLSBundle__Group__7 : rule__NLSBundle__Group__7__Impl ;
    public final void rule__NLSBundle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:994:1: ( rule__NLSBundle__Group__7__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:995:2: rule__NLSBundle__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72023);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1001:1: rule__NLSBundle__Group__7__Impl : ( '}' ) ;
    public final void rule__NLSBundle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1005:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1006:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1006:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1007:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,20,FOLLOW_20_in_rule__NLSBundle__Group__7__Impl2051); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1036:1: rule__NLSFormatter__Group__0 : rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 ;
    public final void rule__NLSFormatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1040:1: ( rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1041:2: rule__NLSFormatter__Group__0__Impl rule__NLSFormatter__Group__1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02098);
            rule__NLSFormatter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02101);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1048:1: rule__NLSFormatter__Group__0__Impl : ( 'formatter' ) ;
    public final void rule__NLSFormatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1052:1: ( ( 'formatter' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1053:1: ( 'formatter' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1053:1: ( 'formatter' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1054:1: 'formatter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__NLSFormatter__Group__0__Impl2129); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1067:1: rule__NLSFormatter__Group__1 : rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 ;
    public final void rule__NLSFormatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1071:1: ( rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1072:2: rule__NLSFormatter__Group__1__Impl rule__NLSFormatter__Group__2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12160);
            rule__NLSFormatter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12163);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1079:1: rule__NLSFormatter__Group__1__Impl : ( ( rule__NLSFormatter__NameAssignment_1 ) ) ;
    public final void rule__NLSFormatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1083:1: ( ( ( rule__NLSFormatter__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1084:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1084:1: ( ( rule__NLSFormatter__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1085:1: ( rule__NLSFormatter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1086:1: ( rule__NLSFormatter__NameAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1086:2: rule__NLSFormatter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2190);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1096:1: rule__NLSFormatter__Group__2 : rule__NLSFormatter__Group__2__Impl ;
    public final void rule__NLSFormatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1100:1: ( rule__NLSFormatter__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1101:2: rule__NLSFormatter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22220);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1107:1: rule__NLSFormatter__Group__2__Impl : ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) ;
    public final void rule__NLSFormatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1111:1: ( ( ( rule__NLSFormatter__ClassRefAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1112:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1112:1: ( ( rule__NLSFormatter__ClassRefAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1113:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1114:1: ( rule__NLSFormatter__ClassRefAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1114:2: rule__NLSFormatter__ClassRefAssignment_2
            {
            pushFollow(FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2247);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1130:1: rule__MessageEntry__Group__0 : rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 ;
    public final void rule__MessageEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1134:1: ( rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1135:2: rule__MessageEntry__Group__0__Impl rule__MessageEntry__Group__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02283);
            rule__MessageEntry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02286);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1142:1: rule__MessageEntry__Group__0__Impl : ( ( rule__MessageEntry__NameAssignment_0 ) ) ;
    public final void rule__MessageEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1146:1: ( ( ( rule__MessageEntry__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1147:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1147:1: ( ( rule__MessageEntry__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1148:1: ( rule__MessageEntry__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1149:1: ( rule__MessageEntry__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1149:2: rule__MessageEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2313);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1159:1: rule__MessageEntry__Group__1 : rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 ;
    public final void rule__MessageEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1163:1: ( rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1164:2: rule__MessageEntry__Group__1__Impl rule__MessageEntry__Group__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12343);
            rule__MessageEntry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12346);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1171:1: rule__MessageEntry__Group__1__Impl : ( ( rule__MessageEntry__Group_1__0 )? ) ;
    public final void rule__MessageEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1175:1: ( ( ( rule__MessageEntry__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1176:1: ( ( rule__MessageEntry__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1176:1: ( ( rule__MessageEntry__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1177:1: ( rule__MessageEntry__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1178:1: ( rule__MessageEntry__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1178:2: rule__MessageEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2373);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1188:1: rule__MessageEntry__Group__2 : rule__MessageEntry__Group__2__Impl rule__MessageEntry__Group__3 ;
    public final void rule__MessageEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1192:1: ( rule__MessageEntry__Group__2__Impl rule__MessageEntry__Group__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1193:2: rule__MessageEntry__Group__2__Impl rule__MessageEntry__Group__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22404);
            rule__MessageEntry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group__3_in_rule__MessageEntry__Group__22407);
            rule__MessageEntry__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1200:1: rule__MessageEntry__Group__2__Impl : ( ':' ) ;
    public final void rule__MessageEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1204:1: ( ( ':' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1205:1: ( ':' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1205:1: ( ':' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1206:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getColonKeyword_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__MessageEntry__Group__2__Impl2435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getColonKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MessageEntry__Group__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1219:1: rule__MessageEntry__Group__3 : rule__MessageEntry__Group__3__Impl ;
    public final void rule__MessageEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1223:1: ( rule__MessageEntry__Group__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1224:2: rule__MessageEntry__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group__3__Impl_in_rule__MessageEntry__Group__32466);
            rule__MessageEntry__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group__3"


    // $ANTLR start "rule__MessageEntry__Group__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1230:1: rule__MessageEntry__Group__3__Impl : ( ( rule__MessageEntry__Alternatives_3 ) ) ;
    public final void rule__MessageEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1234:1: ( ( ( rule__MessageEntry__Alternatives_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1235:1: ( ( rule__MessageEntry__Alternatives_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1235:1: ( ( rule__MessageEntry__Alternatives_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1236:1: ( rule__MessageEntry__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getAlternatives_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1237:1: ( rule__MessageEntry__Alternatives_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1237:2: rule__MessageEntry__Alternatives_3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Alternatives_3_in_rule__MessageEntry__Group__3__Impl2493);
            rule__MessageEntry__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group__3__Impl"


    // $ANTLR start "rule__MessageEntry__Group_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1255:1: rule__MessageEntry__Group_1__0 : rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 ;
    public final void rule__MessageEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1259:1: ( rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1260:2: rule__MessageEntry__Group_1__0__Impl rule__MessageEntry__Group_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02531);
            rule__MessageEntry__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02534);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1267:1: rule__MessageEntry__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MessageEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1271:1: ( ( '(' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1272:1: ( '(' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1272:1: ( '(' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1273:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MessageEntry__Group_1__0__Impl2562); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1286:1: rule__MessageEntry__Group_1__1 : rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 ;
    public final void rule__MessageEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1290:1: ( rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1291:2: rule__MessageEntry__Group_1__1__Impl rule__MessageEntry__Group_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12593);
            rule__MessageEntry__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12596);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1298:1: rule__MessageEntry__Group_1__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) ;
    public final void rule__MessageEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1302:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1303:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1303:1: ( ( rule__MessageEntry__ParamListAssignment_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1304:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1305:1: ( rule__MessageEntry__ParamListAssignment_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1305:2: rule__MessageEntry__ParamListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2623);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1315:1: rule__MessageEntry__Group_1__2 : rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 ;
    public final void rule__MessageEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1319:1: ( rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1320:2: rule__MessageEntry__Group_1__2__Impl rule__MessageEntry__Group_1__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22653);
            rule__MessageEntry__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22656);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1327:1: rule__MessageEntry__Group_1__2__Impl : ( ( rule__MessageEntry__Group_1_2__0 )* ) ;
    public final void rule__MessageEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1331:1: ( ( ( rule__MessageEntry__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1332:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1332:1: ( ( rule__MessageEntry__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1333:1: ( rule__MessageEntry__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1334:1: ( rule__MessageEntry__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1334:2: rule__MessageEntry__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl2683);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1344:1: rule__MessageEntry__Group_1__3 : rule__MessageEntry__Group_1__3__Impl ;
    public final void rule__MessageEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1348:1: ( rule__MessageEntry__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1349:2: rule__MessageEntry__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__32714);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1355:1: rule__MessageEntry__Group_1__3__Impl : ( ')' ) ;
    public final void rule__MessageEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1359:1: ( ( ')' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1360:1: ( ')' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1360:1: ( ')' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1361:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__MessageEntry__Group_1__3__Impl2742); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1382:1: rule__MessageEntry__Group_1_2__0 : rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 ;
    public final void rule__MessageEntry__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1386:1: ( rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1387:2: rule__MessageEntry__Group_1_2__0__Impl rule__MessageEntry__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__02781);
            rule__MessageEntry__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__02784);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1394:1: rule__MessageEntry__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1398:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1399:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1399:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1400:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MessageEntry__Group_1_2__0__Impl2812); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1413:1: rule__MessageEntry__Group_1_2__1 : rule__MessageEntry__Group_1_2__1__Impl ;
    public final void rule__MessageEntry__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1417:1: ( rule__MessageEntry__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1418:2: rule__MessageEntry__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__12843);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1424:1: rule__MessageEntry__Group_1_2__1__Impl : ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) ;
    public final void rule__MessageEntry__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1428:1: ( ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1429:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1429:1: ( ( rule__MessageEntry__ParamListAssignment_1_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1430:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1431:1: ( rule__MessageEntry__ParamListAssignment_1_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1431:2: rule__MessageEntry__ParamListAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl2870);
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


    // $ANTLR start "rule__MessageEntry__Group_3_0__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1445:1: rule__MessageEntry__Group_3_0__0 : rule__MessageEntry__Group_3_0__0__Impl rule__MessageEntry__Group_3_0__1 ;
    public final void rule__MessageEntry__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1449:1: ( rule__MessageEntry__Group_3_0__0__Impl rule__MessageEntry__Group_3_0__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1450:2: rule__MessageEntry__Group_3_0__0__Impl rule__MessageEntry__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__0__Impl_in_rule__MessageEntry__Group_3_0__02904);
            rule__MessageEntry__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__1_in_rule__MessageEntry__Group_3_0__02907);
            rule__MessageEntry__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__0"


    // $ANTLR start "rule__MessageEntry__Group_3_0__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1457:1: rule__MessageEntry__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__MessageEntry__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1461:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1462:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1462:1: ( '{' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1463:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__MessageEntry__Group_3_0__0__Impl2935); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_0__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1476:1: rule__MessageEntry__Group_3_0__1 : rule__MessageEntry__Group_3_0__1__Impl rule__MessageEntry__Group_3_0__2 ;
    public final void rule__MessageEntry__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1480:1: ( rule__MessageEntry__Group_3_0__1__Impl rule__MessageEntry__Group_3_0__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1481:2: rule__MessageEntry__Group_3_0__1__Impl rule__MessageEntry__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__1__Impl_in_rule__MessageEntry__Group_3_0__12966);
            rule__MessageEntry__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__2_in_rule__MessageEntry__Group_3_0__12969);
            rule__MessageEntry__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__1"


    // $ANTLR start "rule__MessageEntry__Group_3_0__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1488:1: rule__MessageEntry__Group_3_0__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_3_0_1 ) ) ;
    public final void rule__MessageEntry__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1492:1: ( ( ( rule__MessageEntry__MessageListAssignment_3_0_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1493:1: ( ( rule__MessageEntry__MessageListAssignment_3_0_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1493:1: ( ( rule__MessageEntry__MessageListAssignment_3_0_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1494:1: ( rule__MessageEntry__MessageListAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1495:1: ( rule__MessageEntry__MessageListAssignment_3_0_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1495:2: rule__MessageEntry__MessageListAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_3_0_1_in_rule__MessageEntry__Group_3_0__1__Impl2996);
            rule__MessageEntry__MessageListAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_0__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1505:1: rule__MessageEntry__Group_3_0__2 : rule__MessageEntry__Group_3_0__2__Impl rule__MessageEntry__Group_3_0__3 ;
    public final void rule__MessageEntry__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1509:1: ( rule__MessageEntry__Group_3_0__2__Impl rule__MessageEntry__Group_3_0__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1510:2: rule__MessageEntry__Group_3_0__2__Impl rule__MessageEntry__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__2__Impl_in_rule__MessageEntry__Group_3_0__23026);
            rule__MessageEntry__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__3_in_rule__MessageEntry__Group_3_0__23029);
            rule__MessageEntry__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__2"


    // $ANTLR start "rule__MessageEntry__Group_3_0__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1517:1: rule__MessageEntry__Group_3_0__2__Impl : ( ( rule__MessageEntry__Group_3_0_2__0 )* ) ;
    public final void rule__MessageEntry__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1521:1: ( ( ( rule__MessageEntry__Group_3_0_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1522:1: ( ( rule__MessageEntry__Group_3_0_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1522:1: ( ( rule__MessageEntry__Group_3_0_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1523:1: ( rule__MessageEntry__Group_3_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getGroup_3_0_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1524:1: ( rule__MessageEntry__Group_3_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1524:2: rule__MessageEntry__Group_3_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageEntry__Group_3_0_2__0_in_rule__MessageEntry__Group_3_0__2__Impl3056);
            	    rule__MessageEntry__Group_3_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getGroup_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__2__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_0__3"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1534:1: rule__MessageEntry__Group_3_0__3 : rule__MessageEntry__Group_3_0__3__Impl ;
    public final void rule__MessageEntry__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1538:1: ( rule__MessageEntry__Group_3_0__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1539:2: rule__MessageEntry__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0__3__Impl_in_rule__MessageEntry__Group_3_0__33087);
            rule__MessageEntry__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__3"


    // $ANTLR start "rule__MessageEntry__Group_3_0__3__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1545:1: rule__MessageEntry__Group_3_0__3__Impl : ( '}' ) ;
    public final void rule__MessageEntry__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1549:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1550:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1550:1: ( '}' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1551:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_3_0_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__MessageEntry__Group_3_0__3__Impl3115); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0__3__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_0_2__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1572:1: rule__MessageEntry__Group_3_0_2__0 : rule__MessageEntry__Group_3_0_2__0__Impl rule__MessageEntry__Group_3_0_2__1 ;
    public final void rule__MessageEntry__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1576:1: ( rule__MessageEntry__Group_3_0_2__0__Impl rule__MessageEntry__Group_3_0_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1577:2: rule__MessageEntry__Group_3_0_2__0__Impl rule__MessageEntry__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0_2__0__Impl_in_rule__MessageEntry__Group_3_0_2__03154);
            rule__MessageEntry__Group_3_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0_2__1_in_rule__MessageEntry__Group_3_0_2__03157);
            rule__MessageEntry__Group_3_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0_2__0"


    // $ANTLR start "rule__MessageEntry__Group_3_0_2__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1584:1: rule__MessageEntry__Group_3_0_2__0__Impl : ( ',' ) ;
    public final void rule__MessageEntry__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1588:1: ( ( ',' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1589:1: ( ',' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1589:1: ( ',' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1590:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getCommaKeyword_3_0_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MessageEntry__Group_3_0_2__0__Impl3185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getCommaKeyword_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_0_2__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1603:1: rule__MessageEntry__Group_3_0_2__1 : rule__MessageEntry__Group_3_0_2__1__Impl ;
    public final void rule__MessageEntry__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1607:1: ( rule__MessageEntry__Group_3_0_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1608:2: rule__MessageEntry__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_0_2__1__Impl_in_rule__MessageEntry__Group_3_0_2__13216);
            rule__MessageEntry__Group_3_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0_2__1"


    // $ANTLR start "rule__MessageEntry__Group_3_0_2__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1614:1: rule__MessageEntry__Group_3_0_2__1__Impl : ( ( rule__MessageEntry__MessageListAssignment_3_0_2_1 ) ) ;
    public final void rule__MessageEntry__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1618:1: ( ( ( rule__MessageEntry__MessageListAssignment_3_0_2_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1619:1: ( ( rule__MessageEntry__MessageListAssignment_3_0_2_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1619:1: ( ( rule__MessageEntry__MessageListAssignment_3_0_2_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1620:1: ( rule__MessageEntry__MessageListAssignment_3_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1621:1: ( rule__MessageEntry__MessageListAssignment_3_0_2_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1621:2: rule__MessageEntry__MessageListAssignment_3_0_2_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__MessageListAssignment_3_0_2_1_in_rule__MessageEntry__Group_3_0_2__1__Impl3243);
            rule__MessageEntry__MessageListAssignment_3_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListAssignment_3_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_1__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1635:1: rule__MessageEntry__Group_3_1__0 : rule__MessageEntry__Group_3_1__0__Impl rule__MessageEntry__Group_3_1__1 ;
    public final void rule__MessageEntry__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1639:1: ( rule__MessageEntry__Group_3_1__0__Impl rule__MessageEntry__Group_3_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1640:2: rule__MessageEntry__Group_3_1__0__Impl rule__MessageEntry__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__0__Impl_in_rule__MessageEntry__Group_3_1__03277);
            rule__MessageEntry__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__1_in_rule__MessageEntry__Group_3_1__03280);
            rule__MessageEntry__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__0"


    // $ANTLR start "rule__MessageEntry__Group_3_1__0__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1647:1: rule__MessageEntry__Group_3_1__0__Impl : ( '[' ) ;
    public final void rule__MessageEntry__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1651:1: ( ( '[' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1652:1: ( '[' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1652:1: ( '[' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1653:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_3_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MessageEntry__Group_3_1__0__Impl3308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__0__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_1__1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1666:1: rule__MessageEntry__Group_3_1__1 : rule__MessageEntry__Group_3_1__1__Impl rule__MessageEntry__Group_3_1__2 ;
    public final void rule__MessageEntry__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1670:1: ( rule__MessageEntry__Group_3_1__1__Impl rule__MessageEntry__Group_3_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1671:2: rule__MessageEntry__Group_3_1__1__Impl rule__MessageEntry__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__1__Impl_in_rule__MessageEntry__Group_3_1__13339);
            rule__MessageEntry__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__2_in_rule__MessageEntry__Group_3_1__13342);
            rule__MessageEntry__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__1"


    // $ANTLR start "rule__MessageEntry__Group_3_1__1__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1678:1: rule__MessageEntry__Group_3_1__1__Impl : ( ( rule__MessageEntry__EntryRefAssignment_3_1_1 ) ) ;
    public final void rule__MessageEntry__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1682:1: ( ( ( rule__MessageEntry__EntryRefAssignment_3_1_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1683:1: ( ( rule__MessageEntry__EntryRefAssignment_3_1_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1683:1: ( ( rule__MessageEntry__EntryRefAssignment_3_1_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1684:1: ( rule__MessageEntry__EntryRefAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_3_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1685:1: ( rule__MessageEntry__EntryRefAssignment_3_1_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1685:2: rule__MessageEntry__EntryRefAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__MessageEntry__EntryRefAssignment_3_1_1_in_rule__MessageEntry__Group_3_1__1__Impl3369);
            rule__MessageEntry__EntryRefAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__1__Impl"


    // $ANTLR start "rule__MessageEntry__Group_3_1__2"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1695:1: rule__MessageEntry__Group_3_1__2 : rule__MessageEntry__Group_3_1__2__Impl ;
    public final void rule__MessageEntry__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1699:1: ( rule__MessageEntry__Group_3_1__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1700:2: rule__MessageEntry__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageEntry__Group_3_1__2__Impl_in_rule__MessageEntry__Group_3_1__23399);
            rule__MessageEntry__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__2"


    // $ANTLR start "rule__MessageEntry__Group_3_1__2__Impl"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1706:1: rule__MessageEntry__Group_3_1__2__Impl : ( ']' ) ;
    public final void rule__MessageEntry__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1710:1: ( ( ']' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1711:1: ( ']' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1711:1: ( ']' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1712:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_3_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MessageEntry__Group_3_1__2__Impl3427); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__Group_3_1__2__Impl"


    // $ANTLR start "rule__MessageParam__Group__0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1731:1: rule__MessageParam__Group__0 : rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 ;
    public final void rule__MessageParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1735:1: ( rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1736:2: rule__MessageParam__Group__0__Impl rule__MessageParam__Group__1
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03464);
            rule__MessageParam__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03467);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1743:1: rule__MessageParam__Group__0__Impl : ( ( rule__MessageParam__PredefinedAssignment_0 ) ) ;
    public final void rule__MessageParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1747:1: ( ( ( rule__MessageParam__PredefinedAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1748:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1748:1: ( ( rule__MessageParam__PredefinedAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1749:1: ( rule__MessageParam__PredefinedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1750:1: ( rule__MessageParam__PredefinedAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1750:2: rule__MessageParam__PredefinedAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3494);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1760:1: rule__MessageParam__Group__1 : rule__MessageParam__Group__1__Impl ;
    public final void rule__MessageParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1764:1: ( rule__MessageParam__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1765:2: rule__MessageParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13524);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1771:1: rule__MessageParam__Group__1__Impl : ( ( rule__MessageParam__VarAssignment_1 ) ) ;
    public final void rule__MessageParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1775:1: ( ( ( rule__MessageParam__VarAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1776:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1776:1: ( ( rule__MessageParam__VarAssignment_1 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1777:1: ( rule__MessageParam__VarAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1778:1: ( rule__MessageParam__VarAssignment_1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1778:2: rule__MessageParam__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3551);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1792:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1796:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1797:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03585);
            rule__Message__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03588);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1804:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1808:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1809:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1809:1: ( ( rule__Message__NameAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1810:1: ( rule__Message__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1811:1: ( rule__Message__NameAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1811:2: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3615);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1821:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1825:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1826:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13645);
            rule__Message__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13648);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1833:1: rule__Message__Group__1__Impl : ( ':' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1837:1: ( ( ':' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1838:1: ( ':' )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1838:1: ( ':' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1839:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getColonKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Message__Group__1__Impl3676); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1852:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1856:1: ( rule__Message__Group__2__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1857:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23707);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1863:1: rule__Message__Group__2__Impl : ( ( rule__Message__MessageAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1867:1: ( ( ( rule__Message__MessageAssignment_2 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1868:1: ( ( rule__Message__MessageAssignment_2 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1868:1: ( ( rule__Message__MessageAssignment_2 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1869:1: ( rule__Message__MessageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageAssignment_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1870:1: ( rule__Message__MessageAssignment_2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1870:2: rule__Message__MessageAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl3734);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1886:1: rule__RichString__Group_1__0 : rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 ;
    public final void rule__RichString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1890:1: ( rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1891:2: rule__RichString__Group_1__0__Impl rule__RichString__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__03770);
            rule__RichString__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__03773);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1898:1: rule__RichString__Group_1__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__RichString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1902:1: ( ( ( rule__RichString__ExpressionsAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1903:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1903:1: ( ( rule__RichString__ExpressionsAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1904:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1905:1: ( rule__RichString__ExpressionsAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1905:2: rule__RichString__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl3800);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1915:1: rule__RichString__Group_1__1 : rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 ;
    public final void rule__RichString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1919:1: ( rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1920:2: rule__RichString__Group_1__1__Impl rule__RichString__Group_1__2
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__13830);
            rule__RichString__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__13833);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1927:1: rule__RichString__Group_1__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) ;
    public final void rule__RichString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1931:1: ( ( ( rule__RichString__ExpressionsAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1932:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1932:1: ( ( rule__RichString__ExpressionsAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1933:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1934:1: ( rule__RichString__ExpressionsAssignment_1_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1934:2: rule__RichString__ExpressionsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl3860);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1944:1: rule__RichString__Group_1__2 : rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 ;
    public final void rule__RichString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1948:1: ( rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1949:2: rule__RichString__Group_1__2__Impl rule__RichString__Group_1__3
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__23891);
            rule__RichString__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__23894);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1956:1: rule__RichString__Group_1__2__Impl : ( ( rule__RichString__Group_1_2__0 )* ) ;
    public final void rule__RichString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1960:1: ( ( ( rule__RichString__Group_1_2__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1961:1: ( ( rule__RichString__Group_1_2__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1961:1: ( ( rule__RichString__Group_1_2__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1962:1: ( rule__RichString__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getGroup_1_2()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1963:1: ( rule__RichString__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_RICH_TEXT_INBETWEEN) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1963:2: rule__RichString__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl3921);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1973:1: rule__RichString__Group_1__3 : rule__RichString__Group_1__3__Impl ;
    public final void rule__RichString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1977:1: ( rule__RichString__Group_1__3__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1978:2: rule__RichString__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__33952);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1984:1: rule__RichString__Group_1__3__Impl : ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) ;
    public final void rule__RichString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1988:1: ( ( ( rule__RichString__ExpressionsAssignment_1_3 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1989:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1989:1: ( ( rule__RichString__ExpressionsAssignment_1_3 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1990:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_3()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1991:1: ( rule__RichString__ExpressionsAssignment_1_3 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:1991:2: rule__RichString__ExpressionsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl3979);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2009:1: rule__RichString__Group_1_2__0 : rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 ;
    public final void rule__RichString__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2013:1: ( rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2014:2: rule__RichString__Group_1_2__0__Impl rule__RichString__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__04017);
            rule__RichString__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__04020);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2021:1: rule__RichString__Group_1_2__0__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) ;
    public final void rule__RichString__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2025:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2026:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2026:1: ( ( rule__RichString__ExpressionsAssignment_1_2_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2027:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2028:1: ( rule__RichString__ExpressionsAssignment_1_2_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2028:2: rule__RichString__ExpressionsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4047);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2038:1: rule__RichString__Group_1_2__1 : rule__RichString__Group_1_2__1__Impl ;
    public final void rule__RichString__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2042:1: ( rule__RichString__Group_1_2__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2043:2: rule__RichString__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14077);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2049:1: rule__RichString__Group_1_2__1__Impl : ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) ;
    public final void rule__RichString__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2053:1: ( ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2054:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2054:1: ( ( rule__RichString__ExpressionsAssignment_1_2_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2055:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsAssignment_1_2_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2056:1: ( rule__RichString__ExpressionsAssignment_1_2_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2056:2: rule__RichString__ExpressionsAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4104);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2070:1: rule__RichVarPart__Group__0 : rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 ;
    public final void rule__RichVarPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2074:1: ( rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2075:2: rule__RichVarPart__Group__0__Impl rule__RichVarPart__Group__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04139);
            rule__RichVarPart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04142);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2082:1: rule__RichVarPart__Group__0__Impl : ( ( rule__RichVarPart__KeyAssignment_0 ) ) ;
    public final void rule__RichVarPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2086:1: ( ( ( rule__RichVarPart__KeyAssignment_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2087:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2087:1: ( ( rule__RichVarPart__KeyAssignment_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2088:1: ( rule__RichVarPart__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyAssignment_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2089:1: ( rule__RichVarPart__KeyAssignment_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2089:2: rule__RichVarPart__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4169);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2099:1: rule__RichVarPart__Group__1 : rule__RichVarPart__Group__1__Impl ;
    public final void rule__RichVarPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2103:1: ( rule__RichVarPart__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2104:2: rule__RichVarPart__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14199);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2110:1: rule__RichVarPart__Group__1__Impl : ( ( rule__RichVarPart__Group_1__0 )? ) ;
    public final void rule__RichVarPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2114:1: ( ( ( rule__RichVarPart__Group_1__0 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2115:1: ( ( rule__RichVarPart__Group_1__0 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2115:1: ( ( rule__RichVarPart__Group_1__0 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2116:1: ( rule__RichVarPart__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2117:1: ( rule__RichVarPart__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2117:2: rule__RichVarPart__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4226);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2131:1: rule__RichVarPart__Group_1__0 : rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 ;
    public final void rule__RichVarPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2135:1: ( rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2136:2: rule__RichVarPart__Group_1__0__Impl rule__RichVarPart__Group_1__1
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04261);
            rule__RichVarPart__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04264);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2143:1: rule__RichVarPart__Group_1__0__Impl : ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) ;
    public final void rule__RichVarPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2147:1: ( ( ( rule__RichVarPart__FormatAssignment_1_0 ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2148:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2148:1: ( ( rule__RichVarPart__FormatAssignment_1_0 ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2149:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatAssignment_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2150:1: ( rule__RichVarPart__FormatAssignment_1_0 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2150:2: rule__RichVarPart__FormatAssignment_1_0
            {
            pushFollow(FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4291);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2160:1: rule__RichVarPart__Group_1__1 : rule__RichVarPart__Group_1__1__Impl ;
    public final void rule__RichVarPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2164:1: ( rule__RichVarPart__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2165:2: rule__RichVarPart__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14321);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2171:1: rule__RichVarPart__Group_1__1__Impl : ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) ;
    public final void rule__RichVarPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2175:1: ( ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2176:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2176:1: ( ( rule__RichVarPart__FormatterClassAssignment_1_1 )? )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2177:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassAssignment_1_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2178:1: ( rule__RichVarPart__FormatterClassAssignment_1_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2178:2: rule__RichVarPart__FormatterClassAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4348);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2192:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2196:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2197:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04383);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04386);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2204:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2208:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2209:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2209:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2210:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4413);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2221:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2225:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2226:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14442);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2232:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2236:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2237:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2237:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2238:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2239:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2239:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4469);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2253:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2257:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2258:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04504);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04507);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2265:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2269:1: ( ( ( '.' ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2270:1: ( ( '.' ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2270:1: ( ( '.' ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2271:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2272:1: ( '.' )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2273:2: '.'
            {
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl4536); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2284:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2288:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2289:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14568);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2295:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2299:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2300:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2300:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2301:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4595);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2317:1: rule__NLS__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__NLS__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2321:1: ( ( rulePackageDeclaration ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2322:1: ( rulePackageDeclaration )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2322:1: ( rulePackageDeclaration )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2323:1: rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04633);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2332:1: rule__NLS__BundleListAssignment_2 : ( ruleNLSBundle ) ;
    public final void rule__NLS__BundleListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2336:1: ( ( ruleNLSBundle ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2337:1: ( ruleNLSBundle )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2337:1: ( ruleNLSBundle )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2338:1: ruleNLSBundle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24664);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2347:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2351:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2352:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2352:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2353:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14695);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2362:1: rule__NLSBundle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSBundle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2366:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2367:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2367:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2368:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_14726); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2377:1: rule__NLSBundle__LangAssignment_3 : ( RULE_ID ) ;
    public final void rule__NLSBundle__LangAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2381:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2382:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2382:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2383:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_34757); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2392:1: rule__NLSBundle__FormatterListAssignment_5 : ( ruleNLSFormatter ) ;
    public final void rule__NLSBundle__FormatterListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2396:1: ( ( ruleNLSFormatter ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2397:1: ( ruleNLSFormatter )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2397:1: ( ruleNLSFormatter )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2398:1: ruleNLSFormatter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_54788);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2407:1: rule__NLSBundle__MessageEntryListAssignment_6 : ( ruleMessageEntry ) ;
    public final void rule__NLSBundle__MessageEntryListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2411:1: ( ( ruleMessageEntry ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2412:1: ( ruleMessageEntry )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2412:1: ( ruleMessageEntry )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2413:1: ruleMessageEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_64819);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2422:1: rule__NLSFormatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NLSFormatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2426:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2427:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2427:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2428:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_14850); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2437:1: rule__NLSFormatter__ClassRefAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NLSFormatter__ClassRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2441:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2442:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2442:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2443:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_24881);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2452:1: rule__MessageEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2456:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2457:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2457:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2458:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_04912); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2467:1: rule__MessageEntry__ParamListAssignment_1_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2471:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2472:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2472:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2473:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_14943);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2482:1: rule__MessageEntry__ParamListAssignment_1_2_1 : ( ruleMessageParam ) ;
    public final void rule__MessageEntry__ParamListAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2486:1: ( ( ruleMessageParam ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2487:1: ( ruleMessageParam )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2487:1: ( ruleMessageParam )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2488:1: ruleMessageParam
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_14974);
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


    // $ANTLR start "rule__MessageEntry__MessageListAssignment_3_0_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2497:1: rule__MessageEntry__MessageListAssignment_3_0_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2501:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2502:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2502:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2503:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_3_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_3_0_15005);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__MessageListAssignment_3_0_1"


    // $ANTLR start "rule__MessageEntry__MessageListAssignment_3_0_2_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2512:1: rule__MessageEntry__MessageListAssignment_3_0_2_1 : ( ruleMessage ) ;
    public final void rule__MessageEntry__MessageListAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2516:1: ( ( ruleMessage ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2517:1: ( ruleMessage )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2517:1: ( ruleMessage )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2518:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_3_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_3_0_2_15036);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_3_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__MessageListAssignment_3_0_2_1"


    // $ANTLR start "rule__MessageEntry__EntryRefAssignment_3_1_1"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2527:1: rule__MessageEntry__EntryRefAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MessageEntry__EntryRefAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2531:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2532:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2532:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2533:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_3_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2534:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2535:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_3_1_15071);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryQualifiedNameParserRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageEntry__EntryRefAssignment_3_1_1"


    // $ANTLR start "rule__MessageParam__PredefinedAssignment_0"
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2546:1: rule__MessageParam__PredefinedAssignment_0 : ( rulePredefinedTypes ) ;
    public final void rule__MessageParam__PredefinedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2550:1: ( ( rulePredefinedTypes ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2551:1: ( rulePredefinedTypes )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2551:1: ( rulePredefinedTypes )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2552:1: rulePredefinedTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05106);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2561:1: rule__MessageParam__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageParam__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2565:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2566:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2566:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2567:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15137); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2576:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2580:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2581:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2581:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05168); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2591:1: rule__Message__MessageAssignment_2 : ( ruleRichString ) ;
    public final void rule__Message__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2595:1: ( ( ruleRichString ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2596:1: ( ruleRichString )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2596:1: ( ruleRichString )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2597:1: ruleRichString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25199);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2606:1: rule__RichString__ExpressionsAssignment_0 : ( ruleRichStringLiteral ) ;
    public final void rule__RichString__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2610:1: ( ( ruleRichStringLiteral ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2611:1: ( ruleRichStringLiteral )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2611:1: ( ruleRichStringLiteral )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2612:1: ruleRichStringLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05230);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2621:1: rule__RichString__ExpressionsAssignment_1_0 : ( ruleRichStringLiteralStart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2625:1: ( ( ruleRichStringLiteralStart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2626:1: ( ruleRichStringLiteralStart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2626:1: ( ruleRichStringLiteralStart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2627:1: ruleRichStringLiteralStart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05261);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2636:1: rule__RichString__ExpressionsAssignment_1_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2640:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2641:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2641:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2642:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15292);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2651:1: rule__RichString__ExpressionsAssignment_1_2_0 : ( ruleRichStringLiteralInbetween ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2655:1: ( ( ruleRichStringLiteralInbetween ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2656:1: ( ruleRichStringLiteralInbetween )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2656:1: ( ruleRichStringLiteralInbetween )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2657:1: ruleRichStringLiteralInbetween
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05323);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2666:1: rule__RichString__ExpressionsAssignment_1_2_1 : ( ruleRichVarPart ) ;
    public final void rule__RichString__ExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2670:1: ( ( ruleRichVarPart ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2671:1: ( ruleRichVarPart )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2671:1: ( ruleRichVarPart )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2672:1: ruleRichVarPart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15354);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2681:1: rule__RichString__ExpressionsAssignment_1_3 : ( ruleRichStringLiteralEnd ) ;
    public final void rule__RichString__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2685:1: ( ( ruleRichStringLiteralEnd ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2686:1: ( ruleRichStringLiteralEnd )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2686:1: ( ruleRichStringLiteralEnd )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2687:1: ruleRichStringLiteralEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35385);
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2696:1: rule__RichStringLiteral__ValueAssignment : ( RULE_RICH_TEXT ) ;
    public final void rule__RichStringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2700:1: ( ( RULE_RICH_TEXT ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2701:1: ( RULE_RICH_TEXT )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2701:1: ( RULE_RICH_TEXT )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2702:1: RULE_RICH_TEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5416); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2711:1: rule__RichStringLiteralStart__ValueAssignment : ( RULE_RICH_TEXT_START ) ;
    public final void rule__RichStringLiteralStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2715:1: ( ( RULE_RICH_TEXT_START ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2716:1: ( RULE_RICH_TEXT_START )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2716:1: ( RULE_RICH_TEXT_START )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2717:1: RULE_RICH_TEXT_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5447); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2726:1: rule__RichStringLiteralEnd__ValueAssignment : ( RULE_RICH_TEXT_END ) ;
    public final void rule__RichStringLiteralEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2730:1: ( ( RULE_RICH_TEXT_END ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2731:1: ( RULE_RICH_TEXT_END )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2731:1: ( RULE_RICH_TEXT_END )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2732:1: RULE_RICH_TEXT_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_END,FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5478); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2741:1: rule__RichStringLiteralInbetween__ValueAssignment : ( RULE_RICH_TEXT_INBETWEEN ) ;
    public final void rule__RichStringLiteralInbetween__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2745:1: ( ( RULE_RICH_TEXT_INBETWEEN ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2746:1: ( RULE_RICH_TEXT_INBETWEEN )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2746:1: ( RULE_RICH_TEXT_INBETWEEN )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2747:1: RULE_RICH_TEXT_INBETWEEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
            }
            match(input,RULE_RICH_TEXT_INBETWEEN,FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5509); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2756:1: rule__RichVarPart__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__RichVarPart__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2760:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2761:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2761:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05540); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2771:1: rule__RichVarPart__FormatAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__RichVarPart__FormatAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2775:1: ( ( RULE_STRING ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2776:1: ( RULE_STRING )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2776:1: ( RULE_STRING )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2777:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05571); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2786:1: rule__RichVarPart__FormatterClassAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RichVarPart__FormatterClassAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2790:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2791:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2791:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2792:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2793:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n.ui/src-gen/org/eclipse/fx/ide/l10n/ui/contentassist/antlr/internal/InternalNLSDsl.g:2794:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_15606);
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
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__0_in_rule__MessageEntry__Alternatives_31011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__0_in_rule__MessageEntry__Alternatives_31029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_0_in_rule__RichString__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__0_in_rule__RichString__Alternatives1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PredefinedTypes__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PredefinedTypes__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PredefinedTypes__Alternatives1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__0__Impl_in_rule__NLS__Group__01189 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NLS__Group__1_in_rule__NLS__Group__01192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__PackageAssignment_0_in_rule__NLS__Group__0__Impl1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__1__Impl_in_rule__NLS__Group__11250 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NLS__Group__2_in_rule__NLS__Group__11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NLS__Group__1__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__Group__2__Impl_in_rule__NLS__Group__21312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NLS__Group__3_in_rule__NLS__Group__21315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1344 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__NLS__BundleListAssignment_2_in_rule__NLS__Group__2__Impl1356 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__NLS__Group__3__Impl_in_rule__NLS__Group__31389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NLS__Group__3__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__0__Impl_in_rule__NLSBundle__Group__01579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__1_in_rule__NLSBundle__Group__01582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NLSBundle__Group__0__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__1__Impl_in_rule__NLSBundle__Group__11641 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__2_in_rule__NLSBundle__Group__11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__NameAssignment_1_in_rule__NLSBundle__Group__1__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__2__Impl_in_rule__NLSBundle__Group__21701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__3_in_rule__NLSBundle__Group__21704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NLSBundle__Group__2__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__3__Impl_in_rule__NLSBundle__Group__31763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__4_in_rule__NLSBundle__Group__31766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__LangAssignment_3_in_rule__NLSBundle__Group__3__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__4__Impl_in_rule__NLSBundle__Group__41823 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5_in_rule__NLSBundle__Group__41826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NLSBundle__Group__4__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__5__Impl_in_rule__NLSBundle__Group__51885 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6_in_rule__NLSBundle__Group__51888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__FormatterListAssignment_5_in_rule__NLSBundle__Group__5__Impl1915 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__6__Impl_in_rule__NLSBundle__Group__61946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7_in_rule__NLSBundle__Group__61949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1978 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__MessageEntryListAssignment_6_in_rule__NLSBundle__Group__6__Impl1990 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__NLSBundle__Group__7__Impl_in_rule__NLSBundle__Group__72023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NLSBundle__Group__7__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__0__Impl_in_rule__NLSFormatter__Group__02098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1_in_rule__NLSFormatter__Group__02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NLSFormatter__Group__0__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__1__Impl_in_rule__NLSFormatter__Group__12160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2_in_rule__NLSFormatter__Group__12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__NameAssignment_1_in_rule__NLSFormatter__Group__1__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__Group__2__Impl_in_rule__NLSFormatter__Group__22220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NLSFormatter__ClassRefAssignment_2_in_rule__NLSFormatter__Group__2__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__0__Impl_in_rule__MessageEntry__Group__02283 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1_in_rule__MessageEntry__Group__02286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__NameAssignment_0_in_rule__MessageEntry__Group__0__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__1__Impl_in_rule__MessageEntry__Group__12343 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2_in_rule__MessageEntry__Group__12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0_in_rule__MessageEntry__Group__1__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__2__Impl_in_rule__MessageEntry__Group__22404 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__3_in_rule__MessageEntry__Group__22407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MessageEntry__Group__2__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group__3__Impl_in_rule__MessageEntry__Group__32466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Alternatives_3_in_rule__MessageEntry__Group__3__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__0__Impl_in_rule__MessageEntry__Group_1__02531 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1_in_rule__MessageEntry__Group_1__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MessageEntry__Group_1__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__1__Impl_in_rule__MessageEntry__Group_1__12593 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2_in_rule__MessageEntry__Group_1__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_1_in_rule__MessageEntry__Group_1__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__2__Impl_in_rule__MessageEntry__Group_1__22653 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3_in_rule__MessageEntry__Group_1__22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0_in_rule__MessageEntry__Group_1__2__Impl2683 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1__3__Impl_in_rule__MessageEntry__Group_1__32714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MessageEntry__Group_1__3__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__0__Impl_in_rule__MessageEntry__Group_1_2__02781 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1_in_rule__MessageEntry__Group_1_2__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageEntry__Group_1_2__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_1_2__1__Impl_in_rule__MessageEntry__Group_1_2__12843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__ParamListAssignment_1_2_1_in_rule__MessageEntry__Group_1_2__1__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__0__Impl_in_rule__MessageEntry__Group_3_0__02904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__1_in_rule__MessageEntry__Group_3_0__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MessageEntry__Group_3_0__0__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__1__Impl_in_rule__MessageEntry__Group_3_0__12966 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__2_in_rule__MessageEntry__Group_3_0__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_3_0_1_in_rule__MessageEntry__Group_3_0__1__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__2__Impl_in_rule__MessageEntry__Group_3_0__23026 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__3_in_rule__MessageEntry__Group_3_0__23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0_2__0_in_rule__MessageEntry__Group_3_0__2__Impl3056 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0__3__Impl_in_rule__MessageEntry__Group_3_0__33087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MessageEntry__Group_3_0__3__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0_2__0__Impl_in_rule__MessageEntry__Group_3_0_2__03154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0_2__1_in_rule__MessageEntry__Group_3_0_2__03157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MessageEntry__Group_3_0_2__0__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_0_2__1__Impl_in_rule__MessageEntry__Group_3_0_2__13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__MessageListAssignment_3_0_2_1_in_rule__MessageEntry__Group_3_0_2__1__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__0__Impl_in_rule__MessageEntry__Group_3_1__03277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__1_in_rule__MessageEntry__Group_3_1__03280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MessageEntry__Group_3_1__0__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__1__Impl_in_rule__MessageEntry__Group_3_1__13339 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__2_in_rule__MessageEntry__Group_3_1__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__EntryRefAssignment_3_1_1_in_rule__MessageEntry__Group_3_1__1__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageEntry__Group_3_1__2__Impl_in_rule__MessageEntry__Group_3_1__23399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MessageEntry__Group_3_1__2__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__0__Impl_in_rule__MessageParam__Group__03464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1_in_rule__MessageParam__Group__03467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__PredefinedAssignment_0_in_rule__MessageParam__Group__0__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__Group__1__Impl_in_rule__MessageParam__Group__13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParam__VarAssignment_1_in_rule__MessageParam__Group__1__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__03585 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__03588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__NameAssignment_0_in_rule__Message__Group__0__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__13645 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__13648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Message__Group__1__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__23707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__MessageAssignment_2_in_rule__Message__Group__2__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__0__Impl_in_rule__RichString__Group_1__03770 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1_in_rule__RichString__Group_1__03773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_0_in_rule__RichString__Group_1__0__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__1__Impl_in_rule__RichString__Group_1__13830 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2_in_rule__RichString__Group_1__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_1_in_rule__RichString__Group_1__1__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__2__Impl_in_rule__RichString__Group_1__23891 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3_in_rule__RichString__Group_1__23894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0_in_rule__RichString__Group_1__2__Impl3921 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__RichString__Group_1__3__Impl_in_rule__RichString__Group_1__33952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_3_in_rule__RichString__Group_1__3__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__0__Impl_in_rule__RichString__Group_1_2__04017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1_in_rule__RichString__Group_1_2__04020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_0_in_rule__RichString__Group_1_2__0__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__Group_1_2__1__Impl_in_rule__RichString__Group_1_2__14077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichString__ExpressionsAssignment_1_2_1_in_rule__RichString__Group_1_2__1__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__0__Impl_in_rule__RichVarPart__Group__04139 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1_in_rule__RichVarPart__Group__04142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__KeyAssignment_0_in_rule__RichVarPart__Group__0__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group__1__Impl_in_rule__RichVarPart__Group__14199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0_in_rule__RichVarPart__Group__1__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__0__Impl_in_rule__RichVarPart__Group_1__04261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1_in_rule__RichVarPart__Group_1__04264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatAssignment_1_0_in_rule__RichVarPart__Group_1__0__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__Group_1__1__Impl_in_rule__RichVarPart__Group_1__14321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RichVarPart__FormatterClassAssignment_1_1_in_rule__RichVarPart__Group_1__1__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04383 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4469 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__NLS__PackageAssignment_04633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_rule__NLS__BundleListAssignment_24664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_14695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__NameAssignment_14726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSBundle__LangAssignment_34757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_rule__NLSBundle__FormatterListAssignment_54788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_rule__NLSBundle__MessageEntryListAssignment_64819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NLSFormatter__NameAssignment_14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NLSFormatter__ClassRefAssignment_24881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageEntry__NameAssignment_04912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_14943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_rule__MessageEntry__ParamListAssignment_1_2_14974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_3_0_15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__MessageEntry__MessageListAssignment_3_0_2_15036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MessageEntry__EntryRefAssignment_3_1_15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedTypes_in_rule__MessageParam__PredefinedAssignment_05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageParam__VarAssignment_15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__NameAssignment_05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_rule__Message__MessageAssignment_25199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_rule__RichString__ExpressionsAssignment_05230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_rule__RichString__ExpressionsAssignment_1_05261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_15292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_rule__RichString__ExpressionsAssignment_1_2_05323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_rule__RichString__ExpressionsAssignment_1_2_15354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_rule__RichString__ExpressionsAssignment_1_35385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_rule__RichStringLiteral__ValueAssignment5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_rule__RichStringLiteralStart__ValueAssignment5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_END_in_rule__RichStringLiteralEnd__ValueAssignment5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_rule__RichStringLiteralInbetween__ValueAssignment5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RichVarPart__KeyAssignment_05540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RichVarPart__FormatAssignment_1_05571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RichVarPart__FormatterClassAssignment_1_15606 = new BitSet(new long[]{0x0000000000000002L});

}