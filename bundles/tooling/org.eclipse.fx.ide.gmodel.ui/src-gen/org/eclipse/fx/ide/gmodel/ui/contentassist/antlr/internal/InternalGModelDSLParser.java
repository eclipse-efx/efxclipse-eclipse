package org.eclipse.fx.ide.gmodel.ui.contentassist.antlr.internal; 

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
import org.eclipse.fx.ide.gmodel.services.GModelDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGModelDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Double'", "'String'", "'Boolean'", "'package'", "'{'", "'}'", "'type'", "'extends'", "', '", "';'", "'='", "'.'", "'[]'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGModelDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGModelDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGModelDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g"; }


     
     	private GModelDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GModelDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleGModel"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:61:1: entryRuleGModel : ruleGModel EOF ;
    public final void entryRuleGModel() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:62:1: ( ruleGModel EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:63:1: ruleGModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelRule()); 
            }
            pushFollow(FOLLOW_ruleGModel_in_entryRuleGModel67);
            ruleGModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGModel"


    // $ANTLR start "ruleGModel"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:70:1: ruleGModel : ( ( rule__GModel__Group__0 ) ) ;
    public final void ruleGModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:74:2: ( ( ( rule__GModel__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:75:1: ( ( rule__GModel__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:75:1: ( ( rule__GModel__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:76:1: ( rule__GModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:77:1: ( rule__GModel__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:77:2: rule__GModel__Group__0
            {
            pushFollow(FOLLOW_rule__GModel__Group__0_in_ruleGModel100);
            rule__GModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGModel"


    // $ANTLR start "entryRuleGDomainElement"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:89:1: entryRuleGDomainElement : ruleGDomainElement EOF ;
    public final void entryRuleGDomainElement() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:90:1: ( ruleGDomainElement EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:91:1: ruleGDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainElement_in_entryRuleGDomainElement127);
            ruleGDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGDomainElement"


    // $ANTLR start "ruleGDomainElement"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:98:1: ruleGDomainElement : ( ( rule__GDomainElement__Group__0 ) ) ;
    public final void ruleGDomainElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:102:2: ( ( ( rule__GDomainElement__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:103:1: ( ( rule__GDomainElement__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:103:1: ( ( rule__GDomainElement__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:104:1: ( rule__GDomainElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:105:1: ( rule__GDomainElement__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:105:2: rule__GDomainElement__Group__0
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__0_in_ruleGDomainElement160);
            rule__GDomainElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDomainElement"


    // $ANTLR start "entryRuleGDomainProperty"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:117:1: entryRuleGDomainProperty : ruleGDomainProperty EOF ;
    public final void entryRuleGDomainProperty() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:118:1: ( ruleGDomainProperty EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:119:1: ruleGDomainProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty187);
            ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainProperty194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGDomainProperty"


    // $ANTLR start "ruleGDomainProperty"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:126:1: ruleGDomainProperty : ( ( rule__GDomainProperty__Group__0 ) ) ;
    public final void ruleGDomainProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:130:2: ( ( ( rule__GDomainProperty__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:131:1: ( ( rule__GDomainProperty__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:131:1: ( ( rule__GDomainProperty__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:132:1: ( rule__GDomainProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:133:1: ( rule__GDomainProperty__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:133:2: rule__GDomainProperty__Group__0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__0_in_ruleGDomainProperty220);
            rule__GDomainProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDomainProperty"


    // $ANTLR start "entryRuleGDefault"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:145:1: entryRuleGDefault : ruleGDefault EOF ;
    public final void entryRuleGDefault() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:146:1: ( ruleGDefault EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:147:1: ruleGDefault EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleGDefault_in_entryRuleGDefault247);
            ruleGDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDefaultRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDefault254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGDefault"


    // $ANTLR start "ruleGDefault"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:154:1: ruleGDefault : ( ( rule__GDefault__Alternatives ) ) ;
    public final void ruleGDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:158:2: ( ( ( rule__GDefault__Alternatives ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:159:1: ( ( rule__GDefault__Alternatives ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:159:1: ( ( rule__GDefault__Alternatives ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:160:1: ( rule__GDefault__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getAlternatives()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:161:1: ( rule__GDefault__Alternatives )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:161:2: rule__GDefault__Alternatives
            {
            pushFollow(FOLLOW_rule__GDefault__Alternatives_in_ruleGDefault280);
            rule__GDefault__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDefaultAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDefault"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:173:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:174:1: ( ruleValidID EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:175:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID307);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID314); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:182:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:186:2: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:187:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:187:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:188:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID340); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:201:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:202:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:203:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName366);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName373); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:210:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:214:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:215:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:215:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:216:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:217:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:217:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName399);
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


    // $ANTLR start "rule__GDomainProperty__Alternatives_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:229:1: rule__GDomainProperty__Alternatives_0 : ( ( ( rule__GDomainProperty__Group_0_0__0 ) ) | ( ( rule__GDomainProperty__Group_0_1__0 ) ) );
    public final void rule__GDomainProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:233:1: ( ( ( rule__GDomainProperty__Group_0_0__0 ) ) | ( ( rule__GDomainProperty__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:234:1: ( ( rule__GDomainProperty__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:234:1: ( ( rule__GDomainProperty__Group_0_0__0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:235:1: ( rule__GDomainProperty__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getGroup_0_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:236:1: ( rule__GDomainProperty__Group_0_0__0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:236:2: rule__GDomainProperty__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__0_in_rule__GDomainProperty__Alternatives_0435);
                    rule__GDomainProperty__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:240:6: ( ( rule__GDomainProperty__Group_0_1__0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:240:6: ( ( rule__GDomainProperty__Group_0_1__0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:241:1: ( rule__GDomainProperty__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getGroup_0_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:242:1: ( rule__GDomainProperty__Group_0_1__0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:242:2: rule__GDomainProperty__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__0_in_rule__GDomainProperty__Alternatives_0453);
                    rule__GDomainProperty__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__GDomainProperty__Alternatives_0"


    // $ANTLR start "rule__GDomainProperty__BuiltInAlternatives_0_0_0_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:251:1: rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 : ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) );
    public final void rule__GDomainProperty__BuiltInAlternatives_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:255:1: ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:256:1: ( 'Int' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:256:1: ( 'Int' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:257:1: 'Int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInIntKeyword_0_0_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0487); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInIntKeyword_0_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:264:6: ( 'Double' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:264:6: ( 'Double' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:265:1: 'Double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInDoubleKeyword_0_0_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0507); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInDoubleKeyword_0_0_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:272:6: ( 'String' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:272:6: ( 'String' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:273:1: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInStringKeyword_0_0_0_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0527); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInStringKeyword_0_0_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:280:6: ( 'Boolean' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:280:6: ( 'Boolean' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:281:1: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInBooleanKeyword_0_0_0_0_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0547); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInBooleanKeyword_0_0_0_0_3()); 
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
    // $ANTLR end "rule__GDomainProperty__BuiltInAlternatives_0_0_0_0"


    // $ANTLR start "rule__GDefault__Alternatives"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:293:1: rule__GDefault__Alternatives : ( ( ( rule__GDefault__StringValAssignment_0 ) ) | ( ( rule__GDefault__IntValAssignment_1 ) ) );
    public final void rule__GDefault__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:297:1: ( ( ( rule__GDefault__StringValAssignment_0 ) ) | ( ( rule__GDefault__IntValAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:298:1: ( ( rule__GDefault__StringValAssignment_0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:298:1: ( ( rule__GDefault__StringValAssignment_0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:299:1: ( rule__GDefault__StringValAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDefaultAccess().getStringValAssignment_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:300:1: ( rule__GDefault__StringValAssignment_0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:300:2: rule__GDefault__StringValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__GDefault__StringValAssignment_0_in_rule__GDefault__Alternatives581);
                    rule__GDefault__StringValAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDefaultAccess().getStringValAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:304:6: ( ( rule__GDefault__IntValAssignment_1 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:304:6: ( ( rule__GDefault__IntValAssignment_1 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:305:1: ( rule__GDefault__IntValAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDefaultAccess().getIntValAssignment_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:306:1: ( rule__GDefault__IntValAssignment_1 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:306:2: rule__GDefault__IntValAssignment_1
                    {
                    pushFollow(FOLLOW_rule__GDefault__IntValAssignment_1_in_rule__GDefault__Alternatives599);
                    rule__GDefault__IntValAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDefaultAccess().getIntValAssignment_1()); 
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
    // $ANTLR end "rule__GDefault__Alternatives"


    // $ANTLR start "rule__GModel__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:317:1: rule__GModel__Group__0 : rule__GModel__Group__0__Impl rule__GModel__Group__1 ;
    public final void rule__GModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:321:1: ( rule__GModel__Group__0__Impl rule__GModel__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:322:2: rule__GModel__Group__0__Impl rule__GModel__Group__1
            {
            pushFollow(FOLLOW_rule__GModel__Group__0__Impl_in_rule__GModel__Group__0630);
            rule__GModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__1_in_rule__GModel__Group__0633);
            rule__GModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__0"


    // $ANTLR start "rule__GModel__Group__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:329:1: rule__GModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__GModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:333:1: ( ( 'package' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:334:1: ( 'package' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:334:1: ( 'package' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:335:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getPackageKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__GModel__Group__0__Impl661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__0__Impl"


    // $ANTLR start "rule__GModel__Group__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:348:1: rule__GModel__Group__1 : rule__GModel__Group__1__Impl rule__GModel__Group__2 ;
    public final void rule__GModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:352:1: ( rule__GModel__Group__1__Impl rule__GModel__Group__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:353:2: rule__GModel__Group__1__Impl rule__GModel__Group__2
            {
            pushFollow(FOLLOW_rule__GModel__Group__1__Impl_in_rule__GModel__Group__1692);
            rule__GModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__2_in_rule__GModel__Group__1695);
            rule__GModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__1"


    // $ANTLR start "rule__GModel__Group__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:360:1: rule__GModel__Group__1__Impl : ( ( rule__GModel__NameAssignment_1 ) ) ;
    public final void rule__GModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:364:1: ( ( ( rule__GModel__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:365:1: ( ( rule__GModel__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:365:1: ( ( rule__GModel__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:366:1: ( rule__GModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:367:1: ( rule__GModel__NameAssignment_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:367:2: rule__GModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GModel__NameAssignment_1_in_rule__GModel__Group__1__Impl722);
            rule__GModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__1__Impl"


    // $ANTLR start "rule__GModel__Group__2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:377:1: rule__GModel__Group__2 : rule__GModel__Group__2__Impl rule__GModel__Group__3 ;
    public final void rule__GModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:381:1: ( rule__GModel__Group__2__Impl rule__GModel__Group__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:382:2: rule__GModel__Group__2__Impl rule__GModel__Group__3
            {
            pushFollow(FOLLOW_rule__GModel__Group__2__Impl_in_rule__GModel__Group__2752);
            rule__GModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__3_in_rule__GModel__Group__2755);
            rule__GModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__2"


    // $ANTLR start "rule__GModel__Group__2__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:389:1: rule__GModel__Group__2__Impl : ( '{' ) ;
    public final void rule__GModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:393:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:394:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:394:1: ( '{' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:395:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__GModel__Group__2__Impl783); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__2__Impl"


    // $ANTLR start "rule__GModel__Group__3"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:408:1: rule__GModel__Group__3 : rule__GModel__Group__3__Impl rule__GModel__Group__4 ;
    public final void rule__GModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:412:1: ( rule__GModel__Group__3__Impl rule__GModel__Group__4 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:413:2: rule__GModel__Group__3__Impl rule__GModel__Group__4
            {
            pushFollow(FOLLOW_rule__GModel__Group__3__Impl_in_rule__GModel__Group__3814);
            rule__GModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__4_in_rule__GModel__Group__3817);
            rule__GModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__3"


    // $ANTLR start "rule__GModel__Group__3__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:420:1: rule__GModel__Group__3__Impl : ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) ) ;
    public final void rule__GModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:424:1: ( ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:425:1: ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:425:1: ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:426:1: ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:426:1: ( ( rule__GModel__TypeListAssignment_3 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:427:1: ( rule__GModel__TypeListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:428:1: ( rule__GModel__TypeListAssignment_3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:428:2: rule__GModel__TypeListAssignment_3
            {
            pushFollow(FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl846);
            rule__GModel__TypeListAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }

            }

            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:431:1: ( ( rule__GModel__TypeListAssignment_3 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:432:1: ( rule__GModel__TypeListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:433:1: ( rule__GModel__TypeListAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:433:2: rule__GModel__TypeListAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl858);
            	    rule__GModel__TypeListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
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
    // $ANTLR end "rule__GModel__Group__3__Impl"


    // $ANTLR start "rule__GModel__Group__4"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:444:1: rule__GModel__Group__4 : rule__GModel__Group__4__Impl ;
    public final void rule__GModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:448:1: ( rule__GModel__Group__4__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:449:2: rule__GModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GModel__Group__4__Impl_in_rule__GModel__Group__4891);
            rule__GModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__4"


    // $ANTLR start "rule__GModel__Group__4__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:455:1: rule__GModel__Group__4__Impl : ( '}' ) ;
    public final void rule__GModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:459:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:460:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:460:1: ( '}' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:461:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__GModel__Group__4__Impl919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__Group__4__Impl"


    // $ANTLR start "rule__GDomainElement__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:484:1: rule__GDomainElement__Group__0 : rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1 ;
    public final void rule__GDomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:488:1: ( rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:489:2: rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__0__Impl_in_rule__GDomainElement__Group__0960);
            rule__GDomainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__1_in_rule__GDomainElement__Group__0963);
            rule__GDomainElement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__0"


    // $ANTLR start "rule__GDomainElement__Group__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:496:1: rule__GDomainElement__Group__0__Impl : ( 'type' ) ;
    public final void rule__GDomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:500:1: ( ( 'type' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:501:1: ( 'type' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:501:1: ( 'type' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:502:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getTypeKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__GDomainElement__Group__0__Impl991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__0__Impl"


    // $ANTLR start "rule__GDomainElement__Group__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:515:1: rule__GDomainElement__Group__1 : rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2 ;
    public final void rule__GDomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:519:1: ( rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:520:2: rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__1__Impl_in_rule__GDomainElement__Group__11022);
            rule__GDomainElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__2_in_rule__GDomainElement__Group__11025);
            rule__GDomainElement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__1"


    // $ANTLR start "rule__GDomainElement__Group__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:527:1: rule__GDomainElement__Group__1__Impl : ( ( rule__GDomainElement__NameAssignment_1 ) ) ;
    public final void rule__GDomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:531:1: ( ( ( rule__GDomainElement__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:532:1: ( ( rule__GDomainElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:532:1: ( ( rule__GDomainElement__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:533:1: ( rule__GDomainElement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:534:1: ( rule__GDomainElement__NameAssignment_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:534:2: rule__GDomainElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__NameAssignment_1_in_rule__GDomainElement__Group__1__Impl1052);
            rule__GDomainElement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__1__Impl"


    // $ANTLR start "rule__GDomainElement__Group__2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:544:1: rule__GDomainElement__Group__2 : rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3 ;
    public final void rule__GDomainElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:548:1: ( rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:549:2: rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__2__Impl_in_rule__GDomainElement__Group__21082);
            rule__GDomainElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__3_in_rule__GDomainElement__Group__21085);
            rule__GDomainElement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__2"


    // $ANTLR start "rule__GDomainElement__Group__2__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:556:1: rule__GDomainElement__Group__2__Impl : ( ( rule__GDomainElement__Group_2__0 )? ) ;
    public final void rule__GDomainElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:560:1: ( ( ( rule__GDomainElement__Group_2__0 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:561:1: ( ( rule__GDomainElement__Group_2__0 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:561:1: ( ( rule__GDomainElement__Group_2__0 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:562:1: ( rule__GDomainElement__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getGroup_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:563:1: ( rule__GDomainElement__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:563:2: rule__GDomainElement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GDomainElement__Group_2__0_in_rule__GDomainElement__Group__2__Impl1112);
                    rule__GDomainElement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__2__Impl"


    // $ANTLR start "rule__GDomainElement__Group__3"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:573:1: rule__GDomainElement__Group__3 : rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4 ;
    public final void rule__GDomainElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:577:1: ( rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:578:2: rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__3__Impl_in_rule__GDomainElement__Group__31143);
            rule__GDomainElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__4_in_rule__GDomainElement__Group__31146);
            rule__GDomainElement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__3"


    // $ANTLR start "rule__GDomainElement__Group__3__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:585:1: rule__GDomainElement__Group__3__Impl : ( '{' ) ;
    public final void rule__GDomainElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:589:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:590:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:590:1: ( '{' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:591:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__GDomainElement__Group__3__Impl1174); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__3__Impl"


    // $ANTLR start "rule__GDomainElement__Group__4"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:604:1: rule__GDomainElement__Group__4 : rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5 ;
    public final void rule__GDomainElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:608:1: ( rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:609:2: rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__4__Impl_in_rule__GDomainElement__Group__41205);
            rule__GDomainElement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__5_in_rule__GDomainElement__Group__41208);
            rule__GDomainElement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__4"


    // $ANTLR start "rule__GDomainElement__Group__4__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:616:1: rule__GDomainElement__Group__4__Impl : ( ( rule__GDomainElement__PropertyListAssignment_4 )* ) ;
    public final void rule__GDomainElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:620:1: ( ( ( rule__GDomainElement__PropertyListAssignment_4 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:621:1: ( ( rule__GDomainElement__PropertyListAssignment_4 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:621:1: ( ( rule__GDomainElement__PropertyListAssignment_4 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:622:1: ( rule__GDomainElement__PropertyListAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getPropertyListAssignment_4()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:623:1: ( rule__GDomainElement__PropertyListAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:623:2: rule__GDomainElement__PropertyListAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GDomainElement__PropertyListAssignment_4_in_rule__GDomainElement__Group__4__Impl1235);
            	    rule__GDomainElement__PropertyListAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getPropertyListAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__4__Impl"


    // $ANTLR start "rule__GDomainElement__Group__5"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:633:1: rule__GDomainElement__Group__5 : rule__GDomainElement__Group__5__Impl ;
    public final void rule__GDomainElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:637:1: ( rule__GDomainElement__Group__5__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:638:2: rule__GDomainElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__5__Impl_in_rule__GDomainElement__Group__51266);
            rule__GDomainElement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__5"


    // $ANTLR start "rule__GDomainElement__Group__5__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:644:1: rule__GDomainElement__Group__5__Impl : ( '}' ) ;
    public final void rule__GDomainElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:648:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:649:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:649:1: ( '}' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:650:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_17_in_rule__GDomainElement__Group__5__Impl1294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group__5__Impl"


    // $ANTLR start "rule__GDomainElement__Group_2__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:675:1: rule__GDomainElement__Group_2__0 : rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1 ;
    public final void rule__GDomainElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:679:1: ( rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:680:2: rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__0__Impl_in_rule__GDomainElement__Group_2__01337);
            rule__GDomainElement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__1_in_rule__GDomainElement__Group_2__01340);
            rule__GDomainElement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__0"


    // $ANTLR start "rule__GDomainElement__Group_2__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:687:1: rule__GDomainElement__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__GDomainElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:691:1: ( ( 'extends' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:692:1: ( 'extends' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:692:1: ( 'extends' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:693:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getExtendsKeyword_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__GDomainElement__Group_2__0__Impl1368); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getExtendsKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__0__Impl"


    // $ANTLR start "rule__GDomainElement__Group_2__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:706:1: rule__GDomainElement__Group_2__1 : rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2 ;
    public final void rule__GDomainElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:710:1: ( rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:711:2: rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__1__Impl_in_rule__GDomainElement__Group_2__11399);
            rule__GDomainElement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__2_in_rule__GDomainElement__Group_2__11402);
            rule__GDomainElement__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__1"


    // $ANTLR start "rule__GDomainElement__Group_2__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:718:1: rule__GDomainElement__Group_2__1__Impl : ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) ) ;
    public final void rule__GDomainElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:722:1: ( ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:723:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:723:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:724:1: ( rule__GDomainElement__SuperTypeListAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:725:1: ( rule__GDomainElement__SuperTypeListAssignment_2_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:725:2: rule__GDomainElement__SuperTypeListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_1_in_rule__GDomainElement__Group_2__1__Impl1429);
            rule__GDomainElement__SuperTypeListAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__1__Impl"


    // $ANTLR start "rule__GDomainElement__Group_2__2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:735:1: rule__GDomainElement__Group_2__2 : rule__GDomainElement__Group_2__2__Impl ;
    public final void rule__GDomainElement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:739:1: ( rule__GDomainElement__Group_2__2__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:740:2: rule__GDomainElement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__2__Impl_in_rule__GDomainElement__Group_2__21459);
            rule__GDomainElement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__2"


    // $ANTLR start "rule__GDomainElement__Group_2__2__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:746:1: rule__GDomainElement__Group_2__2__Impl : ( ( rule__GDomainElement__Group_2_2__0 )* ) ;
    public final void rule__GDomainElement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:750:1: ( ( ( rule__GDomainElement__Group_2_2__0 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:751:1: ( ( rule__GDomainElement__Group_2_2__0 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:751:1: ( ( rule__GDomainElement__Group_2_2__0 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:752:1: ( rule__GDomainElement__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getGroup_2_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:753:1: ( rule__GDomainElement__Group_2_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:753:2: rule__GDomainElement__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__0_in_rule__GDomainElement__Group_2__2__Impl1486);
            	    rule__GDomainElement__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2__2__Impl"


    // $ANTLR start "rule__GDomainElement__Group_2_2__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:769:1: rule__GDomainElement__Group_2_2__0 : rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1 ;
    public final void rule__GDomainElement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:773:1: ( rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:774:2: rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__0__Impl_in_rule__GDomainElement__Group_2_2__01523);
            rule__GDomainElement__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__1_in_rule__GDomainElement__Group_2_2__01526);
            rule__GDomainElement__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2_2__0"


    // $ANTLR start "rule__GDomainElement__Group_2_2__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:781:1: rule__GDomainElement__Group_2_2__0__Impl : ( ', ' ) ;
    public final void rule__GDomainElement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:785:1: ( ( ', ' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:786:1: ( ', ' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:786:1: ( ', ' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:787:1: ', '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getCommaSpaceKeyword_2_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__GDomainElement__Group_2_2__0__Impl1554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getCommaSpaceKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2_2__0__Impl"


    // $ANTLR start "rule__GDomainElement__Group_2_2__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:800:1: rule__GDomainElement__Group_2_2__1 : rule__GDomainElement__Group_2_2__1__Impl ;
    public final void rule__GDomainElement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:804:1: ( rule__GDomainElement__Group_2_2__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:805:2: rule__GDomainElement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__1__Impl_in_rule__GDomainElement__Group_2_2__11585);
            rule__GDomainElement__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2_2__1"


    // $ANTLR start "rule__GDomainElement__Group_2_2__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:811:1: rule__GDomainElement__Group_2_2__1__Impl : ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) ) ;
    public final void rule__GDomainElement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:815:1: ( ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:816:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:816:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:817:1: ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_2_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:818:1: ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:818:2: rule__GDomainElement__SuperTypeListAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_2_1_in_rule__GDomainElement__Group_2_2__1__Impl1612);
            rule__GDomainElement__SuperTypeListAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__Group_2_2__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:832:1: rule__GDomainProperty__Group__0 : rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1 ;
    public final void rule__GDomainProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:836:1: ( rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:837:2: rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__0__Impl_in_rule__GDomainProperty__Group__01646);
            rule__GDomainProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group__1_in_rule__GDomainProperty__Group__01649);
            rule__GDomainProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group__0"


    // $ANTLR start "rule__GDomainProperty__Group__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:844:1: rule__GDomainProperty__Group__0__Impl : ( ( rule__GDomainProperty__Alternatives_0 ) ) ;
    public final void rule__GDomainProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:848:1: ( ( ( rule__GDomainProperty__Alternatives_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:849:1: ( ( rule__GDomainProperty__Alternatives_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:849:1: ( ( rule__GDomainProperty__Alternatives_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:850:1: ( rule__GDomainProperty__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getAlternatives_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:851:1: ( rule__GDomainProperty__Alternatives_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:851:2: rule__GDomainProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Alternatives_0_in_rule__GDomainProperty__Group__0__Impl1676);
            rule__GDomainProperty__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group__0__Impl"


    // $ANTLR start "rule__GDomainProperty__Group__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:861:1: rule__GDomainProperty__Group__1 : rule__GDomainProperty__Group__1__Impl ;
    public final void rule__GDomainProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:865:1: ( rule__GDomainProperty__Group__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:866:2: rule__GDomainProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__1__Impl_in_rule__GDomainProperty__Group__11706);
            rule__GDomainProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group__1"


    // $ANTLR start "rule__GDomainProperty__Group__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:872:1: rule__GDomainProperty__Group__1__Impl : ( ';' ) ;
    public final void rule__GDomainProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:876:1: ( ( ';' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:877:1: ( ';' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:877:1: ( ';' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:878:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getSemicolonKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__GDomainProperty__Group__1__Impl1734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:895:1: rule__GDomainProperty__Group_0_0__0 : rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1 ;
    public final void rule__GDomainProperty__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:899:1: ( rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:900:2: rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__0__Impl_in_rule__GDomainProperty__Group_0_0__01769);
            rule__GDomainProperty__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__1_in_rule__GDomainProperty__Group_0_0__01772);
            rule__GDomainProperty__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__0"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:907:1: rule__GDomainProperty__Group_0_0__0__Impl : ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) ) ;
    public final void rule__GDomainProperty__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:911:1: ( ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:912:1: ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:912:1: ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:913:1: ( rule__GDomainProperty__BuiltInAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getBuiltInAssignment_0_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:914:1: ( rule__GDomainProperty__BuiltInAssignment_0_0_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:914:2: rule__GDomainProperty__BuiltInAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__BuiltInAssignment_0_0_0_in_rule__GDomainProperty__Group_0_0__0__Impl1799);
            rule__GDomainProperty__BuiltInAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getBuiltInAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__0__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:924:1: rule__GDomainProperty__Group_0_0__1 : rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2 ;
    public final void rule__GDomainProperty__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:928:1: ( rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:929:2: rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__1__Impl_in_rule__GDomainProperty__Group_0_0__11829);
            rule__GDomainProperty__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__2_in_rule__GDomainProperty__Group_0_0__11832);
            rule__GDomainProperty__Group_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__1"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:936:1: rule__GDomainProperty__Group_0_0__1__Impl : ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? ) ;
    public final void rule__GDomainProperty__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:940:1: ( ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:941:1: ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:941:1: ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:942:1: ( rule__GDomainProperty__ListAssignment_0_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_0_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:943:1: ( rule__GDomainProperty__ListAssignment_0_0_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:943:2: rule__GDomainProperty__ListAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__ListAssignment_0_0_1_in_rule__GDomainProperty__Group_0_0__1__Impl1859);
                    rule__GDomainProperty__ListAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:953:1: rule__GDomainProperty__Group_0_0__2 : rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3 ;
    public final void rule__GDomainProperty__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:957:1: ( rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:958:2: rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__2__Impl_in_rule__GDomainProperty__Group_0_0__21890);
            rule__GDomainProperty__Group_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__3_in_rule__GDomainProperty__Group_0_0__21893);
            rule__GDomainProperty__Group_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__2"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__2__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:965:1: rule__GDomainProperty__Group_0_0__2__Impl : ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) ) ;
    public final void rule__GDomainProperty__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:969:1: ( ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:970:1: ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:970:1: ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:971:1: ( rule__GDomainProperty__NameAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_0_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:972:1: ( rule__GDomainProperty__NameAssignment_0_0_2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:972:2: rule__GDomainProperty__NameAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__NameAssignment_0_0_2_in_rule__GDomainProperty__Group_0_0__2__Impl1920);
            rule__GDomainProperty__NameAssignment_0_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__2__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__3"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:982:1: rule__GDomainProperty__Group_0_0__3 : rule__GDomainProperty__Group_0_0__3__Impl ;
    public final void rule__GDomainProperty__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:986:1: ( rule__GDomainProperty__Group_0_0__3__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:987:2: rule__GDomainProperty__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__3__Impl_in_rule__GDomainProperty__Group_0_0__31950);
            rule__GDomainProperty__Group_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__3"


    // $ANTLR start "rule__GDomainProperty__Group_0_0__3__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:993:1: rule__GDomainProperty__Group_0_0__3__Impl : ( ( rule__GDomainProperty__Group_0_0_3__0 )? ) ;
    public final void rule__GDomainProperty__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:997:1: ( ( ( rule__GDomainProperty__Group_0_0_3__0 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:998:1: ( ( rule__GDomainProperty__Group_0_0_3__0 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:998:1: ( ( rule__GDomainProperty__Group_0_0_3__0 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:999:1: ( rule__GDomainProperty__Group_0_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getGroup_0_0_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1000:1: ( rule__GDomainProperty__Group_0_0_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1000:2: rule__GDomainProperty__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__0_in_rule__GDomainProperty__Group_0_0__3__Impl1977);
                    rule__GDomainProperty__Group_0_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getGroup_0_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0__3__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0_3__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1018:1: rule__GDomainProperty__Group_0_0_3__0 : rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1 ;
    public final void rule__GDomainProperty__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1022:1: ( rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1023:2: rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__0__Impl_in_rule__GDomainProperty__Group_0_0_3__02016);
            rule__GDomainProperty__Group_0_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__1_in_rule__GDomainProperty__Group_0_0_3__02019);
            rule__GDomainProperty__Group_0_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0_3__0"


    // $ANTLR start "rule__GDomainProperty__Group_0_0_3__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1030:1: rule__GDomainProperty__Group_0_0_3__0__Impl : ( '=' ) ;
    public final void rule__GDomainProperty__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1034:1: ( ( '=' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1035:1: ( '=' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1035:1: ( '=' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1036:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getEqualsSignKeyword_0_0_3_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__GDomainProperty__Group_0_0_3__0__Impl2047); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getEqualsSignKeyword_0_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0_3__0__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_0_3__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1049:1: rule__GDomainProperty__Group_0_0_3__1 : rule__GDomainProperty__Group_0_0_3__1__Impl ;
    public final void rule__GDomainProperty__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1053:1: ( rule__GDomainProperty__Group_0_0_3__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1054:2: rule__GDomainProperty__Group_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__1__Impl_in_rule__GDomainProperty__Group_0_0_3__12078);
            rule__GDomainProperty__Group_0_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0_3__1"


    // $ANTLR start "rule__GDomainProperty__Group_0_0_3__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1060:1: rule__GDomainProperty__Group_0_0_3__1__Impl : ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) ) ;
    public final void rule__GDomainProperty__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1064:1: ( ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1065:1: ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1065:1: ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1066:1: ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getDefaultValueAssignment_0_0_3_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1067:1: ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1067:2: rule__GDomainProperty__DefaultValueAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__DefaultValueAssignment_0_0_3_1_in_rule__GDomainProperty__Group_0_0_3__1__Impl2105);
            rule__GDomainProperty__DefaultValueAssignment_0_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getDefaultValueAssignment_0_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_0_3__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1081:1: rule__GDomainProperty__Group_0_1__0 : rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1 ;
    public final void rule__GDomainProperty__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1085:1: ( rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1086:2: rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__0__Impl_in_rule__GDomainProperty__Group_0_1__02139);
            rule__GDomainProperty__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__1_in_rule__GDomainProperty__Group_0_1__02142);
            rule__GDomainProperty__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__0"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1093:1: rule__GDomainProperty__Group_0_1__0__Impl : ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) ) ;
    public final void rule__GDomainProperty__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1097:1: ( ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1098:1: ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1098:1: ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1099:1: ( rule__GDomainProperty__RefAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefAssignment_0_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1100:1: ( rule__GDomainProperty__RefAssignment_0_1_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1100:2: rule__GDomainProperty__RefAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__RefAssignment_0_1_0_in_rule__GDomainProperty__Group_0_1__0__Impl2169);
            rule__GDomainProperty__RefAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getRefAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__0__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1110:1: rule__GDomainProperty__Group_0_1__1 : rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2 ;
    public final void rule__GDomainProperty__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1114:1: ( rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1115:2: rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__1__Impl_in_rule__GDomainProperty__Group_0_1__12199);
            rule__GDomainProperty__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__2_in_rule__GDomainProperty__Group_0_1__12202);
            rule__GDomainProperty__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__1"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1122:1: rule__GDomainProperty__Group_0_1__1__Impl : ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? ) ;
    public final void rule__GDomainProperty__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1126:1: ( ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1127:1: ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1127:1: ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1128:1: ( rule__GDomainProperty__ListAssignment_0_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_1_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1129:1: ( rule__GDomainProperty__ListAssignment_0_1_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1129:2: rule__GDomainProperty__ListAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__ListAssignment_0_1_1_in_rule__GDomainProperty__Group_0_1__1__Impl2229);
                    rule__GDomainProperty__ListAssignment_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1139:1: rule__GDomainProperty__Group_0_1__2 : rule__GDomainProperty__Group_0_1__2__Impl ;
    public final void rule__GDomainProperty__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1143:1: ( rule__GDomainProperty__Group_0_1__2__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1144:2: rule__GDomainProperty__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__2__Impl_in_rule__GDomainProperty__Group_0_1__22260);
            rule__GDomainProperty__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__2"


    // $ANTLR start "rule__GDomainProperty__Group_0_1__2__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1150:1: rule__GDomainProperty__Group_0_1__2__Impl : ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) ) ;
    public final void rule__GDomainProperty__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1154:1: ( ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1155:1: ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1155:1: ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1156:1: ( rule__GDomainProperty__NameAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_1_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1157:1: ( rule__GDomainProperty__NameAssignment_0_1_2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1157:2: rule__GDomainProperty__NameAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__NameAssignment_0_1_2_in_rule__GDomainProperty__Group_0_1__2__Impl2287);
            rule__GDomainProperty__NameAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__Group_0_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1173:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1177:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1178:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02323);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02326);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1185:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1189:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1190:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1190:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1191:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2353);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1202:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1206:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1207:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12382);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1213:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1217:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1218:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1218:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1219:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1220:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1220:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2409);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1234:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1238:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1239:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02444);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02447);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1246:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1250:1: ( ( ( '.' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1251:1: ( ( '.' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1251:1: ( ( '.' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1252:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1253:1: ( '.' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1254:2: '.'
            {
            match(input,23,FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl2476); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1265:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1269:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1270:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12508);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1276:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1280:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1281:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1281:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1282:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2535);
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


    // $ANTLR start "rule__GModel__NameAssignment_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1298:1: rule__GModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1302:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1303:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1303:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1304:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GModel__NameAssignment_12573);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__NameAssignment_1"


    // $ANTLR start "rule__GModel__TypeListAssignment_3"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1313:1: rule__GModel__TypeListAssignment_3 : ( ruleGDomainElement ) ;
    public final void rule__GModel__TypeListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1317:1: ( ( ruleGDomainElement ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1318:1: ( ruleGDomainElement )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1318:1: ( ruleGDomainElement )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1319:1: ruleGDomainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListGDomainElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGDomainElement_in_rule__GModel__TypeListAssignment_32604);
            ruleGDomainElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getTypeListGDomainElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GModel__TypeListAssignment_3"


    // $ANTLR start "rule__GDomainElement__NameAssignment_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1328:1: rule__GDomainElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GDomainElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1332:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1333:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1333:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1334:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__NameAssignment_12635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__NameAssignment_1"


    // $ANTLR start "rule__GDomainElement__SuperTypeListAssignment_2_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1343:1: rule__GDomainElement__SuperTypeListAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainElement__SuperTypeListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1347:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1348:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1348:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1349:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1350:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1351:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_12670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__SuperTypeListAssignment_2_1"


    // $ANTLR start "rule__GDomainElement__SuperTypeListAssignment_2_2_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1362:1: rule__GDomainElement__SuperTypeListAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainElement__SuperTypeListAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1366:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1367:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1367:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1368:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_2_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1369:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1370:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_2_12709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__SuperTypeListAssignment_2_2_1"


    // $ANTLR start "rule__GDomainElement__PropertyListAssignment_4"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1381:1: rule__GDomainElement__PropertyListAssignment_4 : ( ruleGDomainProperty ) ;
    public final void rule__GDomainElement__PropertyListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1385:1: ( ( ruleGDomainProperty ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1386:1: ( ruleGDomainProperty )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1386:1: ( ruleGDomainProperty )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1387:1: ruleGDomainProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleGDomainProperty_in_rule__GDomainElement__PropertyListAssignment_42744);
            ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__PropertyListAssignment_4"


    // $ANTLR start "rule__GDomainProperty__BuiltInAssignment_0_0_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1396:1: rule__GDomainProperty__BuiltInAssignment_0_0_0 : ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) ) ;
    public final void rule__GDomainProperty__BuiltInAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1400:1: ( ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1401:1: ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1401:1: ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1402:1: ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getBuiltInAlternatives_0_0_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1403:1: ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1403:2: rule__GDomainProperty__BuiltInAlternatives_0_0_0_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0_in_rule__GDomainProperty__BuiltInAssignment_0_0_02775);
            rule__GDomainProperty__BuiltInAlternatives_0_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getBuiltInAlternatives_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__BuiltInAssignment_0_0_0"


    // $ANTLR start "rule__GDomainProperty__ListAssignment_0_0_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1412:1: rule__GDomainProperty__ListAssignment_0_0_1 : ( ( '[]' ) ) ;
    public final void rule__GDomainProperty__ListAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1416:1: ( ( ( '[]' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1417:1: ( ( '[]' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1417:1: ( ( '[]' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1418:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1419:1: ( '[]' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1420:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GDomainProperty__ListAssignment_0_0_12813); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__ListAssignment_0_0_1"


    // $ANTLR start "rule__GDomainProperty__NameAssignment_0_0_2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1435:1: rule__GDomainProperty__NameAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__GDomainProperty__NameAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1439:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1440:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1440:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1441:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_0_22852); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__NameAssignment_0_0_2"


    // $ANTLR start "rule__GDomainProperty__DefaultValueAssignment_0_0_3_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1450:1: rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 : ( ruleGDefault ) ;
    public final void rule__GDomainProperty__DefaultValueAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1454:1: ( ( ruleGDefault ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1455:1: ( ruleGDefault )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1455:1: ( ruleGDefault )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1456:1: ruleGDefault
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getDefaultValueGDefaultParserRuleCall_0_0_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleGDefault_in_rule__GDomainProperty__DefaultValueAssignment_0_0_3_12883);
            ruleGDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getDefaultValueGDefaultParserRuleCall_0_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__DefaultValueAssignment_0_0_3_1"


    // $ANTLR start "rule__GDomainProperty__RefAssignment_0_1_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1465:1: rule__GDomainProperty__RefAssignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainProperty__RefAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1469:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1470:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1470:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1471:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementCrossReference_0_1_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1472:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1473:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementIDTerminalRuleCall_0_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__RefAssignment_0_1_02918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementIDTerminalRuleCall_0_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementCrossReference_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__RefAssignment_0_1_0"


    // $ANTLR start "rule__GDomainProperty__ListAssignment_0_1_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1484:1: rule__GDomainProperty__ListAssignment_0_1_1 : ( ( '[]' ) ) ;
    public final void rule__GDomainProperty__ListAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1488:1: ( ( ( '[]' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1489:1: ( ( '[]' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1489:1: ( ( '[]' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1490:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1491:1: ( '[]' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1492:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__GDomainProperty__ListAssignment_0_1_12958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__ListAssignment_0_1_1"


    // $ANTLR start "rule__GDomainProperty__NameAssignment_0_1_2"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1507:1: rule__GDomainProperty__NameAssignment_0_1_2 : ( RULE_ID ) ;
    public final void rule__GDomainProperty__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1511:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1512:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1512:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1513:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_1_22997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainProperty__NameAssignment_0_1_2"


    // $ANTLR start "rule__GDefault__StringValAssignment_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1522:1: rule__GDefault__StringValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__GDefault__StringValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1526:1: ( ( RULE_STRING ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1527:1: ( RULE_STRING )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1527:1: ( RULE_STRING )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1528:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GDefault__StringValAssignment_03028); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDefaultAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDefault__StringValAssignment_0"


    // $ANTLR start "rule__GDefault__IntValAssignment_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1537:1: rule__GDefault__IntValAssignment_1 : ( RULE_INT ) ;
    public final void rule__GDefault__IntValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1541:1: ( ( RULE_INT ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1542:1: ( RULE_INT )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1542:1: ( RULE_INT )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1543:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getIntValINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GDefault__IntValAssignment_13059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDefaultAccess().getIntValINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDefault__IntValAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGModel_in_entryRuleGModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__0_in_ruleGModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainElement_in_entryRuleGDomainElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__0_in_ruleGDomainElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainProperty194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__0_in_ruleGDomainProperty220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDefault_in_entryRuleGDefault247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDefault254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__Alternatives_in_ruleGDefault280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__0_in_rule__GDomainProperty__Alternatives_0435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__0_in_rule__GDomainProperty__Alternatives_0453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__StringValAssignment_0_in_rule__GDefault__Alternatives581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__IntValAssignment_1_in_rule__GDefault__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__0__Impl_in_rule__GModel__Group__0630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GModel__Group__1_in_rule__GModel__Group__0633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GModel__Group__0__Impl661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__1__Impl_in_rule__GModel__Group__1692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GModel__Group__2_in_rule__GModel__Group__1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__NameAssignment_1_in_rule__GModel__Group__1__Impl722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__2__Impl_in_rule__GModel__Group__2752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GModel__Group__3_in_rule__GModel__Group__2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GModel__Group__2__Impl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__3__Impl_in_rule__GModel__Group__3814 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GModel__Group__4_in_rule__GModel__Group__3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl846 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl858 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GModel__Group__4__Impl_in_rule__GModel__Group__4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GModel__Group__4__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__0__Impl_in_rule__GDomainElement__Group__0960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__1_in_rule__GDomainElement__Group__0963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GDomainElement__Group__0__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__1__Impl_in_rule__GDomainElement__Group__11022 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__2_in_rule__GDomainElement__Group__11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__NameAssignment_1_in_rule__GDomainElement__Group__1__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__2__Impl_in_rule__GDomainElement__Group__21082 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__3_in_rule__GDomainElement__Group__21085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__0_in_rule__GDomainElement__Group__2__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__3__Impl_in_rule__GDomainElement__Group__31143 = new BitSet(new long[]{0x0000000000027810L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__4_in_rule__GDomainElement__Group__31146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GDomainElement__Group__3__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__4__Impl_in_rule__GDomainElement__Group__41205 = new BitSet(new long[]{0x0000000000027810L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__5_in_rule__GDomainElement__Group__41208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__PropertyListAssignment_4_in_rule__GDomainElement__Group__4__Impl1235 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__5__Impl_in_rule__GDomainElement__Group__51266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GDomainElement__Group__5__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__0__Impl_in_rule__GDomainElement__Group_2__01337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__1_in_rule__GDomainElement__Group_2__01340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GDomainElement__Group_2__0__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__1__Impl_in_rule__GDomainElement__Group_2__11399 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__2_in_rule__GDomainElement__Group_2__11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_1_in_rule__GDomainElement__Group_2__1__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__2__Impl_in_rule__GDomainElement__Group_2__21459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__0_in_rule__GDomainElement__Group_2__2__Impl1486 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__0__Impl_in_rule__GDomainElement__Group_2_2__01523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__1_in_rule__GDomainElement__Group_2_2__01526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GDomainElement__Group_2_2__0__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__1__Impl_in_rule__GDomainElement__Group_2_2__11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_2_1_in_rule__GDomainElement__Group_2_2__1__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__0__Impl_in_rule__GDomainProperty__Group__01646 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__1_in_rule__GDomainProperty__Group__01649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Alternatives_0_in_rule__GDomainProperty__Group__0__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__1__Impl_in_rule__GDomainProperty__Group__11706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GDomainProperty__Group__1__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__0__Impl_in_rule__GDomainProperty__Group_0_0__01769 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__1_in_rule__GDomainProperty__Group_0_0__01772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__BuiltInAssignment_0_0_0_in_rule__GDomainProperty__Group_0_0__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__1__Impl_in_rule__GDomainProperty__Group_0_0__11829 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__2_in_rule__GDomainProperty__Group_0_0__11832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__ListAssignment_0_0_1_in_rule__GDomainProperty__Group_0_0__1__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__2__Impl_in_rule__GDomainProperty__Group_0_0__21890 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__3_in_rule__GDomainProperty__Group_0_0__21893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__NameAssignment_0_0_2_in_rule__GDomainProperty__Group_0_0__2__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__3__Impl_in_rule__GDomainProperty__Group_0_0__31950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__0_in_rule__GDomainProperty__Group_0_0__3__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__0__Impl_in_rule__GDomainProperty__Group_0_0_3__02016 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__1_in_rule__GDomainProperty__Group_0_0_3__02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GDomainProperty__Group_0_0_3__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__1__Impl_in_rule__GDomainProperty__Group_0_0_3__12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__DefaultValueAssignment_0_0_3_1_in_rule__GDomainProperty__Group_0_0_3__1__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__0__Impl_in_rule__GDomainProperty__Group_0_1__02139 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__1_in_rule__GDomainProperty__Group_0_1__02142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__RefAssignment_0_1_0_in_rule__GDomainProperty__Group_0_1__0__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__1__Impl_in_rule__GDomainProperty__Group_0_1__12199 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__2_in_rule__GDomainProperty__Group_0_1__12202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__ListAssignment_0_1_1_in_rule__GDomainProperty__Group_0_1__1__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__2__Impl_in_rule__GDomainProperty__Group_0_1__22260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__NameAssignment_0_1_2_in_rule__GDomainProperty__Group_0_1__2__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2409 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GModel__NameAssignment_12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainElement_in_rule__GModel__TypeListAssignment_32604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__NameAssignment_12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_12670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_2_12709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_rule__GDomainElement__PropertyListAssignment_42744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0_in_rule__GDomainProperty__BuiltInAssignment_0_0_02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GDomainProperty__ListAssignment_0_0_12813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_0_22852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDefault_in_rule__GDomainProperty__DefaultValueAssignment_0_0_3_12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__RefAssignment_0_1_02918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GDomainProperty__ListAssignment_0_1_12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_1_22997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GDefault__StringValAssignment_03028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GDefault__IntValAssignment_13059 = new BitSet(new long[]{0x0000000000000002L});

}