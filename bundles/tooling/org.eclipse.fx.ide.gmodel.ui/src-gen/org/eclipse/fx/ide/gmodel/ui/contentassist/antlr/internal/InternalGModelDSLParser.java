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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'Double'", "'String'", "'Boolean'", "'package'", "'{'", "'}'", "'type'", "'extends'", "', '", "'map'", "';'", "'='", "'.'", "'[]'"
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
    public static final int T__25=25;
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


    // $ANTLR start "entryRuleGDomainMap"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:117:1: entryRuleGDomainMap : ruleGDomainMap EOF ;
    public final void entryRuleGDomainMap() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:118:1: ( ruleGDomainMap EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:119:1: ruleGDomainMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainMap_in_entryRuleGDomainMap187);
            ruleGDomainMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainMap194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGDomainMap"


    // $ANTLR start "ruleGDomainMap"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:126:1: ruleGDomainMap : ( ( rule__GDomainMap__Group__0 ) ) ;
    public final void ruleGDomainMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:130:2: ( ( ( rule__GDomainMap__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:131:1: ( ( rule__GDomainMap__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:131:1: ( ( rule__GDomainMap__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:132:1: ( rule__GDomainMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:133:1: ( rule__GDomainMap__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:133:2: rule__GDomainMap__Group__0
            {
            pushFollow(FOLLOW_rule__GDomainMap__Group__0_in_ruleGDomainMap220);
            rule__GDomainMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDomainMap"


    // $ANTLR start "entryRuleGDomainProperty"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:145:1: entryRuleGDomainProperty : ruleGDomainProperty EOF ;
    public final void entryRuleGDomainProperty() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:146:1: ( ruleGDomainProperty EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:147:1: ruleGDomainProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty247);
            ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainProperty254); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:154:1: ruleGDomainProperty : ( ( rule__GDomainProperty__Group__0 ) ) ;
    public final void ruleGDomainProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:158:2: ( ( ( rule__GDomainProperty__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:159:1: ( ( rule__GDomainProperty__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:159:1: ( ( rule__GDomainProperty__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:160:1: ( rule__GDomainProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:161:1: ( rule__GDomainProperty__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:161:2: rule__GDomainProperty__Group__0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__0_in_ruleGDomainProperty280);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:173:1: entryRuleGDefault : ruleGDefault EOF ;
    public final void entryRuleGDefault() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:174:1: ( ruleGDefault EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:175:1: ruleGDefault EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleGDefault_in_entryRuleGDefault307);
            ruleGDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDefaultRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDefault314); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:182:1: ruleGDefault : ( ( rule__GDefault__Alternatives ) ) ;
    public final void ruleGDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:186:2: ( ( ( rule__GDefault__Alternatives ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:187:1: ( ( rule__GDefault__Alternatives ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:187:1: ( ( rule__GDefault__Alternatives ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:188:1: ( rule__GDefault__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getAlternatives()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:189:1: ( rule__GDefault__Alternatives )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:189:2: rule__GDefault__Alternatives
            {
            pushFollow(FOLLOW_rule__GDefault__Alternatives_in_ruleGDefault340);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:201:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:202:1: ( ruleValidID EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:203:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID367);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID374); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:210:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:214:2: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:215:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:215:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:216:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID400); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:229:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:230:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:231:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName426);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName433); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:238:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:242:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:243:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:243:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:244:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:245:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:245:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName459);
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


    // $ANTLR start "rule__GDomainElement__Alternatives_4"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:257:1: rule__GDomainElement__Alternatives_4 : ( ( ( rule__GDomainElement__MapAssignment_4_0 ) ) | ( ( rule__GDomainElement__PropertyListAssignment_4_1 )* ) );
    public final void rule__GDomainElement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:261:1: ( ( ( rule__GDomainElement__MapAssignment_4_0 ) ) | ( ( rule__GDomainElement__PropertyListAssignment_4_1 )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=11 && LA2_0<=14)||LA2_0==17) ) {
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:262:1: ( ( rule__GDomainElement__MapAssignment_4_0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:262:1: ( ( rule__GDomainElement__MapAssignment_4_0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:263:1: ( rule__GDomainElement__MapAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainElementAccess().getMapAssignment_4_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:264:1: ( rule__GDomainElement__MapAssignment_4_0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:264:2: rule__GDomainElement__MapAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__GDomainElement__MapAssignment_4_0_in_rule__GDomainElement__Alternatives_4495);
                    rule__GDomainElement__MapAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainElementAccess().getMapAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:268:6: ( ( rule__GDomainElement__PropertyListAssignment_4_1 )* )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:268:6: ( ( rule__GDomainElement__PropertyListAssignment_4_1 )* )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:269:1: ( rule__GDomainElement__PropertyListAssignment_4_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainElementAccess().getPropertyListAssignment_4_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:270:1: ( rule__GDomainElement__PropertyListAssignment_4_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=14)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:270:2: rule__GDomainElement__PropertyListAssignment_4_1
                    	    {
                    	    pushFollow(FOLLOW_rule__GDomainElement__PropertyListAssignment_4_1_in_rule__GDomainElement__Alternatives_4513);
                    	    rule__GDomainElement__PropertyListAssignment_4_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainElementAccess().getPropertyListAssignment_4_1()); 
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
    // $ANTLR end "rule__GDomainElement__Alternatives_4"


    // $ANTLR start "rule__GDomainMap__Alternatives_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:279:1: rule__GDomainMap__Alternatives_1 : ( ( ( rule__GDomainMap__BuiltInAssignment_1_0 ) ) | ( ( rule__GDomainMap__RefAssignment_1_1 ) ) );
    public final void rule__GDomainMap__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:283:1: ( ( ( rule__GDomainMap__BuiltInAssignment_1_0 ) ) | ( ( rule__GDomainMap__RefAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=14)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:284:1: ( ( rule__GDomainMap__BuiltInAssignment_1_0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:284:1: ( ( rule__GDomainMap__BuiltInAssignment_1_0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:285:1: ( rule__GDomainMap__BuiltInAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getBuiltInAssignment_1_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:286:1: ( rule__GDomainMap__BuiltInAssignment_1_0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:286:2: rule__GDomainMap__BuiltInAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GDomainMap__BuiltInAssignment_1_0_in_rule__GDomainMap__Alternatives_1547);
                    rule__GDomainMap__BuiltInAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getBuiltInAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:290:6: ( ( rule__GDomainMap__RefAssignment_1_1 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:290:6: ( ( rule__GDomainMap__RefAssignment_1_1 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:291:1: ( rule__GDomainMap__RefAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getRefAssignment_1_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:292:1: ( rule__GDomainMap__RefAssignment_1_1 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:292:2: rule__GDomainMap__RefAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GDomainMap__RefAssignment_1_1_in_rule__GDomainMap__Alternatives_1565);
                    rule__GDomainMap__RefAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getRefAssignment_1_1()); 
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
    // $ANTLR end "rule__GDomainMap__Alternatives_1"


    // $ANTLR start "rule__GDomainMap__BuiltInAlternatives_1_0_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:301:1: rule__GDomainMap__BuiltInAlternatives_1_0_0 : ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) );
    public final void rule__GDomainMap__BuiltInAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:305:1: ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:306:1: ( 'Int' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:306:1: ( 'Int' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:307:1: 'Int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getBuiltInIntKeyword_1_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__GDomainMap__BuiltInAlternatives_1_0_0599); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getBuiltInIntKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:314:6: ( 'Double' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:314:6: ( 'Double' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:315:1: 'Double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getBuiltInDoubleKeyword_1_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__GDomainMap__BuiltInAlternatives_1_0_0619); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getBuiltInDoubleKeyword_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:322:6: ( 'String' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:322:6: ( 'String' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:323:1: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getBuiltInStringKeyword_1_0_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__GDomainMap__BuiltInAlternatives_1_0_0639); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getBuiltInStringKeyword_1_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:330:6: ( 'Boolean' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:330:6: ( 'Boolean' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:331:1: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainMapAccess().getBuiltInBooleanKeyword_1_0_0_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__GDomainMap__BuiltInAlternatives_1_0_0659); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainMapAccess().getBuiltInBooleanKeyword_1_0_0_3()); 
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
    // $ANTLR end "rule__GDomainMap__BuiltInAlternatives_1_0_0"


    // $ANTLR start "rule__GDomainProperty__Alternatives_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:343:1: rule__GDomainProperty__Alternatives_0 : ( ( ( rule__GDomainProperty__Group_0_0__0 ) ) | ( ( rule__GDomainProperty__Group_0_1__0 ) ) );
    public final void rule__GDomainProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:347:1: ( ( ( rule__GDomainProperty__Group_0_0__0 ) ) | ( ( rule__GDomainProperty__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=14)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:348:1: ( ( rule__GDomainProperty__Group_0_0__0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:348:1: ( ( rule__GDomainProperty__Group_0_0__0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:349:1: ( rule__GDomainProperty__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getGroup_0_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:350:1: ( rule__GDomainProperty__Group_0_0__0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:350:2: rule__GDomainProperty__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__0_in_rule__GDomainProperty__Alternatives_0693);
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:354:6: ( ( rule__GDomainProperty__Group_0_1__0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:354:6: ( ( rule__GDomainProperty__Group_0_1__0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:355:1: ( rule__GDomainProperty__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getGroup_0_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:356:1: ( rule__GDomainProperty__Group_0_1__0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:356:2: rule__GDomainProperty__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__0_in_rule__GDomainProperty__Alternatives_0711);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:365:1: rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 : ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) );
    public final void rule__GDomainProperty__BuiltInAlternatives_0_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:369:1: ( ( 'Int' ) | ( 'Double' ) | ( 'String' ) | ( 'Boolean' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:370:1: ( 'Int' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:370:1: ( 'Int' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:371:1: 'Int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInIntKeyword_0_0_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0745); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInIntKeyword_0_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:378:6: ( 'Double' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:378:6: ( 'Double' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:379:1: 'Double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInDoubleKeyword_0_0_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0765); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInDoubleKeyword_0_0_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:386:6: ( 'String' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:386:6: ( 'String' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:387:1: 'String'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInStringKeyword_0_0_0_0_2()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0785); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGDomainPropertyAccess().getBuiltInStringKeyword_0_0_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:394:6: ( 'Boolean' )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:394:6: ( 'Boolean' )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:395:1: 'Boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDomainPropertyAccess().getBuiltInBooleanKeyword_0_0_0_0_3()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0805); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:407:1: rule__GDefault__Alternatives : ( ( ( rule__GDefault__StringValAssignment_0 ) ) | ( ( rule__GDefault__IntValAssignment_1 ) ) );
    public final void rule__GDefault__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:411:1: ( ( ( rule__GDefault__StringValAssignment_0 ) ) | ( ( rule__GDefault__IntValAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:412:1: ( ( rule__GDefault__StringValAssignment_0 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:412:1: ( ( rule__GDefault__StringValAssignment_0 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:413:1: ( rule__GDefault__StringValAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDefaultAccess().getStringValAssignment_0()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:414:1: ( rule__GDefault__StringValAssignment_0 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:414:2: rule__GDefault__StringValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__GDefault__StringValAssignment_0_in_rule__GDefault__Alternatives839);
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
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:418:6: ( ( rule__GDefault__IntValAssignment_1 ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:418:6: ( ( rule__GDefault__IntValAssignment_1 ) )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:419:1: ( rule__GDefault__IntValAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGDefaultAccess().getIntValAssignment_1()); 
                    }
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:420:1: ( rule__GDefault__IntValAssignment_1 )
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:420:2: rule__GDefault__IntValAssignment_1
                    {
                    pushFollow(FOLLOW_rule__GDefault__IntValAssignment_1_in_rule__GDefault__Alternatives857);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:431:1: rule__GModel__Group__0 : rule__GModel__Group__0__Impl rule__GModel__Group__1 ;
    public final void rule__GModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:435:1: ( rule__GModel__Group__0__Impl rule__GModel__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:436:2: rule__GModel__Group__0__Impl rule__GModel__Group__1
            {
            pushFollow(FOLLOW_rule__GModel__Group__0__Impl_in_rule__GModel__Group__0888);
            rule__GModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__1_in_rule__GModel__Group__0891);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:443:1: rule__GModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__GModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:447:1: ( ( 'package' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:448:1: ( 'package' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:448:1: ( 'package' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:449:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getPackageKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__GModel__Group__0__Impl919); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:462:1: rule__GModel__Group__1 : rule__GModel__Group__1__Impl rule__GModel__Group__2 ;
    public final void rule__GModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:466:1: ( rule__GModel__Group__1__Impl rule__GModel__Group__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:467:2: rule__GModel__Group__1__Impl rule__GModel__Group__2
            {
            pushFollow(FOLLOW_rule__GModel__Group__1__Impl_in_rule__GModel__Group__1950);
            rule__GModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__2_in_rule__GModel__Group__1953);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:474:1: rule__GModel__Group__1__Impl : ( ( rule__GModel__NameAssignment_1 ) ) ;
    public final void rule__GModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:478:1: ( ( ( rule__GModel__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:479:1: ( ( rule__GModel__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:479:1: ( ( rule__GModel__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:480:1: ( rule__GModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:481:1: ( rule__GModel__NameAssignment_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:481:2: rule__GModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GModel__NameAssignment_1_in_rule__GModel__Group__1__Impl980);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:491:1: rule__GModel__Group__2 : rule__GModel__Group__2__Impl rule__GModel__Group__3 ;
    public final void rule__GModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:495:1: ( rule__GModel__Group__2__Impl rule__GModel__Group__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:496:2: rule__GModel__Group__2__Impl rule__GModel__Group__3
            {
            pushFollow(FOLLOW_rule__GModel__Group__2__Impl_in_rule__GModel__Group__21010);
            rule__GModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__3_in_rule__GModel__Group__21013);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:503:1: rule__GModel__Group__2__Impl : ( '{' ) ;
    public final void rule__GModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:507:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:508:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:508:1: ( '{' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:509:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__GModel__Group__2__Impl1041); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:522:1: rule__GModel__Group__3 : rule__GModel__Group__3__Impl rule__GModel__Group__4 ;
    public final void rule__GModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:526:1: ( rule__GModel__Group__3__Impl rule__GModel__Group__4 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:527:2: rule__GModel__Group__3__Impl rule__GModel__Group__4
            {
            pushFollow(FOLLOW_rule__GModel__Group__3__Impl_in_rule__GModel__Group__31072);
            rule__GModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GModel__Group__4_in_rule__GModel__Group__31075);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:534:1: rule__GModel__Group__3__Impl : ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) ) ;
    public final void rule__GModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:538:1: ( ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:539:1: ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:539:1: ( ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:540:1: ( ( rule__GModel__TypeListAssignment_3 ) ) ( ( rule__GModel__TypeListAssignment_3 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:540:1: ( ( rule__GModel__TypeListAssignment_3 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:541:1: ( rule__GModel__TypeListAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:542:1: ( rule__GModel__TypeListAssignment_3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:542:2: rule__GModel__TypeListAssignment_3
            {
            pushFollow(FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl1104);
            rule__GModel__TypeListAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }

            }

            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:545:1: ( ( rule__GModel__TypeListAssignment_3 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:546:1: ( rule__GModel__TypeListAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListAssignment_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:547:1: ( rule__GModel__TypeListAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:547:2: rule__GModel__TypeListAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl1116);
            	    rule__GModel__TypeListAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:558:1: rule__GModel__Group__4 : rule__GModel__Group__4__Impl ;
    public final void rule__GModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:562:1: ( rule__GModel__Group__4__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:563:2: rule__GModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GModel__Group__4__Impl_in_rule__GModel__Group__41149);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:569:1: rule__GModel__Group__4__Impl : ( '}' ) ;
    public final void rule__GModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:573:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:574:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:574:1: ( '}' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:575:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__GModel__Group__4__Impl1177); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:598:1: rule__GDomainElement__Group__0 : rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1 ;
    public final void rule__GDomainElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:602:1: ( rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:603:2: rule__GDomainElement__Group__0__Impl rule__GDomainElement__Group__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__0__Impl_in_rule__GDomainElement__Group__01218);
            rule__GDomainElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__1_in_rule__GDomainElement__Group__01221);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:610:1: rule__GDomainElement__Group__0__Impl : ( 'type' ) ;
    public final void rule__GDomainElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:614:1: ( ( 'type' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:615:1: ( 'type' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:615:1: ( 'type' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:616:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getTypeKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__GDomainElement__Group__0__Impl1249); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:629:1: rule__GDomainElement__Group__1 : rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2 ;
    public final void rule__GDomainElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:633:1: ( rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:634:2: rule__GDomainElement__Group__1__Impl rule__GDomainElement__Group__2
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__1__Impl_in_rule__GDomainElement__Group__11280);
            rule__GDomainElement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__2_in_rule__GDomainElement__Group__11283);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:641:1: rule__GDomainElement__Group__1__Impl : ( ( rule__GDomainElement__NameAssignment_1 ) ) ;
    public final void rule__GDomainElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:645:1: ( ( ( rule__GDomainElement__NameAssignment_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:646:1: ( ( rule__GDomainElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:646:1: ( ( rule__GDomainElement__NameAssignment_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:647:1: ( rule__GDomainElement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getNameAssignment_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:648:1: ( rule__GDomainElement__NameAssignment_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:648:2: rule__GDomainElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__NameAssignment_1_in_rule__GDomainElement__Group__1__Impl1310);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:658:1: rule__GDomainElement__Group__2 : rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3 ;
    public final void rule__GDomainElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:662:1: ( rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:663:2: rule__GDomainElement__Group__2__Impl rule__GDomainElement__Group__3
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__2__Impl_in_rule__GDomainElement__Group__21340);
            rule__GDomainElement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__3_in_rule__GDomainElement__Group__21343);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:670:1: rule__GDomainElement__Group__2__Impl : ( ( rule__GDomainElement__Group_2__0 )? ) ;
    public final void rule__GDomainElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:674:1: ( ( ( rule__GDomainElement__Group_2__0 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:675:1: ( ( rule__GDomainElement__Group_2__0 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:675:1: ( ( rule__GDomainElement__Group_2__0 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:676:1: ( rule__GDomainElement__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getGroup_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:677:1: ( rule__GDomainElement__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:677:2: rule__GDomainElement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__GDomainElement__Group_2__0_in_rule__GDomainElement__Group__2__Impl1370);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:687:1: rule__GDomainElement__Group__3 : rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4 ;
    public final void rule__GDomainElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:691:1: ( rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:692:2: rule__GDomainElement__Group__3__Impl rule__GDomainElement__Group__4
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__3__Impl_in_rule__GDomainElement__Group__31401);
            rule__GDomainElement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__4_in_rule__GDomainElement__Group__31404);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:699:1: rule__GDomainElement__Group__3__Impl : ( '{' ) ;
    public final void rule__GDomainElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:703:1: ( ( '{' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:704:1: ( '{' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:704:1: ( '{' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:705:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__GDomainElement__Group__3__Impl1432); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:718:1: rule__GDomainElement__Group__4 : rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5 ;
    public final void rule__GDomainElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:722:1: ( rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:723:2: rule__GDomainElement__Group__4__Impl rule__GDomainElement__Group__5
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__4__Impl_in_rule__GDomainElement__Group__41463);
            rule__GDomainElement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group__5_in_rule__GDomainElement__Group__41466);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:730:1: rule__GDomainElement__Group__4__Impl : ( ( rule__GDomainElement__Alternatives_4 ) ) ;
    public final void rule__GDomainElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:734:1: ( ( ( rule__GDomainElement__Alternatives_4 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:735:1: ( ( rule__GDomainElement__Alternatives_4 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:735:1: ( ( rule__GDomainElement__Alternatives_4 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:736:1: ( rule__GDomainElement__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getAlternatives_4()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:737:1: ( rule__GDomainElement__Alternatives_4 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:737:2: rule__GDomainElement__Alternatives_4
            {
            pushFollow(FOLLOW_rule__GDomainElement__Alternatives_4_in_rule__GDomainElement__Group__4__Impl1493);
            rule__GDomainElement__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getAlternatives_4()); 
            }

            }


            }

        }
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:747:1: rule__GDomainElement__Group__5 : rule__GDomainElement__Group__5__Impl ;
    public final void rule__GDomainElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:751:1: ( rule__GDomainElement__Group__5__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:752:2: rule__GDomainElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group__5__Impl_in_rule__GDomainElement__Group__51523);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:758:1: rule__GDomainElement__Group__5__Impl : ( '}' ) ;
    public final void rule__GDomainElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:762:1: ( ( '}' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:763:1: ( '}' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:763:1: ( '}' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:764:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_17_in_rule__GDomainElement__Group__5__Impl1551); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:789:1: rule__GDomainElement__Group_2__0 : rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1 ;
    public final void rule__GDomainElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:793:1: ( rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:794:2: rule__GDomainElement__Group_2__0__Impl rule__GDomainElement__Group_2__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__0__Impl_in_rule__GDomainElement__Group_2__01594);
            rule__GDomainElement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__1_in_rule__GDomainElement__Group_2__01597);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:801:1: rule__GDomainElement__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__GDomainElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:805:1: ( ( 'extends' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:806:1: ( 'extends' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:806:1: ( 'extends' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:807:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getExtendsKeyword_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__GDomainElement__Group_2__0__Impl1625); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:820:1: rule__GDomainElement__Group_2__1 : rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2 ;
    public final void rule__GDomainElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:824:1: ( rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:825:2: rule__GDomainElement__Group_2__1__Impl rule__GDomainElement__Group_2__2
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__1__Impl_in_rule__GDomainElement__Group_2__11656);
            rule__GDomainElement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__2_in_rule__GDomainElement__Group_2__11659);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:832:1: rule__GDomainElement__Group_2__1__Impl : ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) ) ;
    public final void rule__GDomainElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:836:1: ( ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:837:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:837:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:838:1: ( rule__GDomainElement__SuperTypeListAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:839:1: ( rule__GDomainElement__SuperTypeListAssignment_2_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:839:2: rule__GDomainElement__SuperTypeListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_1_in_rule__GDomainElement__Group_2__1__Impl1686);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:849:1: rule__GDomainElement__Group_2__2 : rule__GDomainElement__Group_2__2__Impl ;
    public final void rule__GDomainElement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:853:1: ( rule__GDomainElement__Group_2__2__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:854:2: rule__GDomainElement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2__2__Impl_in_rule__GDomainElement__Group_2__21716);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:860:1: rule__GDomainElement__Group_2__2__Impl : ( ( rule__GDomainElement__Group_2_2__0 )* ) ;
    public final void rule__GDomainElement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:864:1: ( ( ( rule__GDomainElement__Group_2_2__0 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:865:1: ( ( rule__GDomainElement__Group_2_2__0 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:865:1: ( ( rule__GDomainElement__Group_2_2__0 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:866:1: ( rule__GDomainElement__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getGroup_2_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:867:1: ( rule__GDomainElement__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:867:2: rule__GDomainElement__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__0_in_rule__GDomainElement__Group_2__2__Impl1743);
            	    rule__GDomainElement__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:883:1: rule__GDomainElement__Group_2_2__0 : rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1 ;
    public final void rule__GDomainElement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:887:1: ( rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:888:2: rule__GDomainElement__Group_2_2__0__Impl rule__GDomainElement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__0__Impl_in_rule__GDomainElement__Group_2_2__01780);
            rule__GDomainElement__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__1_in_rule__GDomainElement__Group_2_2__01783);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:895:1: rule__GDomainElement__Group_2_2__0__Impl : ( ', ' ) ;
    public final void rule__GDomainElement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:899:1: ( ( ', ' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:900:1: ( ', ' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:900:1: ( ', ' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:901:1: ', '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getCommaSpaceKeyword_2_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__GDomainElement__Group_2_2__0__Impl1811); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:914:1: rule__GDomainElement__Group_2_2__1 : rule__GDomainElement__Group_2_2__1__Impl ;
    public final void rule__GDomainElement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:918:1: ( rule__GDomainElement__Group_2_2__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:919:2: rule__GDomainElement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainElement__Group_2_2__1__Impl_in_rule__GDomainElement__Group_2_2__11842);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:925:1: rule__GDomainElement__Group_2_2__1__Impl : ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) ) ;
    public final void rule__GDomainElement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:929:1: ( ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:930:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:930:1: ( ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:931:1: ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListAssignment_2_2_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:932:1: ( rule__GDomainElement__SuperTypeListAssignment_2_2_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:932:2: rule__GDomainElement__SuperTypeListAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_2_1_in_rule__GDomainElement__Group_2_2__1__Impl1869);
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


    // $ANTLR start "rule__GDomainMap__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:946:1: rule__GDomainMap__Group__0 : rule__GDomainMap__Group__0__Impl rule__GDomainMap__Group__1 ;
    public final void rule__GDomainMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:950:1: ( rule__GDomainMap__Group__0__Impl rule__GDomainMap__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:951:2: rule__GDomainMap__Group__0__Impl rule__GDomainMap__Group__1
            {
            pushFollow(FOLLOW_rule__GDomainMap__Group__0__Impl_in_rule__GDomainMap__Group__01903);
            rule__GDomainMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainMap__Group__1_in_rule__GDomainMap__Group__01906);
            rule__GDomainMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__Group__0"


    // $ANTLR start "rule__GDomainMap__Group__0__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:958:1: rule__GDomainMap__Group__0__Impl : ( 'map' ) ;
    public final void rule__GDomainMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:962:1: ( ( 'map' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:963:1: ( 'map' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:963:1: ( 'map' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:964:1: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getMapKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__GDomainMap__Group__0__Impl1934); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getMapKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__Group__0__Impl"


    // $ANTLR start "rule__GDomainMap__Group__1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:977:1: rule__GDomainMap__Group__1 : rule__GDomainMap__Group__1__Impl ;
    public final void rule__GDomainMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:981:1: ( rule__GDomainMap__Group__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:982:2: rule__GDomainMap__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainMap__Group__1__Impl_in_rule__GDomainMap__Group__11965);
            rule__GDomainMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__Group__1"


    // $ANTLR start "rule__GDomainMap__Group__1__Impl"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:988:1: rule__GDomainMap__Group__1__Impl : ( ( rule__GDomainMap__Alternatives_1 ) ) ;
    public final void rule__GDomainMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:992:1: ( ( ( rule__GDomainMap__Alternatives_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:993:1: ( ( rule__GDomainMap__Alternatives_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:993:1: ( ( rule__GDomainMap__Alternatives_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:994:1: ( rule__GDomainMap__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getAlternatives_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:995:1: ( rule__GDomainMap__Alternatives_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:995:2: rule__GDomainMap__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GDomainMap__Alternatives_1_in_rule__GDomainMap__Group__1__Impl1992);
            rule__GDomainMap__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__Group__1__Impl"


    // $ANTLR start "rule__GDomainProperty__Group__0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1009:1: rule__GDomainProperty__Group__0 : rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1 ;
    public final void rule__GDomainProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1013:1: ( rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1014:2: rule__GDomainProperty__Group__0__Impl rule__GDomainProperty__Group__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__0__Impl_in_rule__GDomainProperty__Group__02026);
            rule__GDomainProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group__1_in_rule__GDomainProperty__Group__02029);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1021:1: rule__GDomainProperty__Group__0__Impl : ( ( rule__GDomainProperty__Alternatives_0 ) ) ;
    public final void rule__GDomainProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1025:1: ( ( ( rule__GDomainProperty__Alternatives_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1026:1: ( ( rule__GDomainProperty__Alternatives_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1026:1: ( ( rule__GDomainProperty__Alternatives_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1027:1: ( rule__GDomainProperty__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getAlternatives_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1028:1: ( rule__GDomainProperty__Alternatives_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1028:2: rule__GDomainProperty__Alternatives_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Alternatives_0_in_rule__GDomainProperty__Group__0__Impl2056);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1038:1: rule__GDomainProperty__Group__1 : rule__GDomainProperty__Group__1__Impl ;
    public final void rule__GDomainProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1042:1: ( rule__GDomainProperty__Group__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1043:2: rule__GDomainProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group__1__Impl_in_rule__GDomainProperty__Group__12086);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1049:1: rule__GDomainProperty__Group__1__Impl : ( ';' ) ;
    public final void rule__GDomainProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1053:1: ( ( ';' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1054:1: ( ';' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1054:1: ( ';' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1055:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getSemicolonKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__GDomainProperty__Group__1__Impl2114); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1072:1: rule__GDomainProperty__Group_0_0__0 : rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1 ;
    public final void rule__GDomainProperty__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1076:1: ( rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1077:2: rule__GDomainProperty__Group_0_0__0__Impl rule__GDomainProperty__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__0__Impl_in_rule__GDomainProperty__Group_0_0__02149);
            rule__GDomainProperty__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__1_in_rule__GDomainProperty__Group_0_0__02152);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1084:1: rule__GDomainProperty__Group_0_0__0__Impl : ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) ) ;
    public final void rule__GDomainProperty__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1088:1: ( ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1089:1: ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1089:1: ( ( rule__GDomainProperty__BuiltInAssignment_0_0_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1090:1: ( rule__GDomainProperty__BuiltInAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getBuiltInAssignment_0_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1091:1: ( rule__GDomainProperty__BuiltInAssignment_0_0_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1091:2: rule__GDomainProperty__BuiltInAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__BuiltInAssignment_0_0_0_in_rule__GDomainProperty__Group_0_0__0__Impl2179);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1101:1: rule__GDomainProperty__Group_0_0__1 : rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2 ;
    public final void rule__GDomainProperty__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1105:1: ( rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1106:2: rule__GDomainProperty__Group_0_0__1__Impl rule__GDomainProperty__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__1__Impl_in_rule__GDomainProperty__Group_0_0__12209);
            rule__GDomainProperty__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__2_in_rule__GDomainProperty__Group_0_0__12212);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1113:1: rule__GDomainProperty__Group_0_0__1__Impl : ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? ) ;
    public final void rule__GDomainProperty__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1117:1: ( ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1118:1: ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1118:1: ( ( rule__GDomainProperty__ListAssignment_0_0_1 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1119:1: ( rule__GDomainProperty__ListAssignment_0_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_0_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1120:1: ( rule__GDomainProperty__ListAssignment_0_0_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1120:2: rule__GDomainProperty__ListAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__ListAssignment_0_0_1_in_rule__GDomainProperty__Group_0_0__1__Impl2239);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1130:1: rule__GDomainProperty__Group_0_0__2 : rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3 ;
    public final void rule__GDomainProperty__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1134:1: ( rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1135:2: rule__GDomainProperty__Group_0_0__2__Impl rule__GDomainProperty__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__2__Impl_in_rule__GDomainProperty__Group_0_0__22270);
            rule__GDomainProperty__Group_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__3_in_rule__GDomainProperty__Group_0_0__22273);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1142:1: rule__GDomainProperty__Group_0_0__2__Impl : ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) ) ;
    public final void rule__GDomainProperty__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1146:1: ( ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1147:1: ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1147:1: ( ( rule__GDomainProperty__NameAssignment_0_0_2 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1148:1: ( rule__GDomainProperty__NameAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_0_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1149:1: ( rule__GDomainProperty__NameAssignment_0_0_2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1149:2: rule__GDomainProperty__NameAssignment_0_0_2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__NameAssignment_0_0_2_in_rule__GDomainProperty__Group_0_0__2__Impl2300);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1159:1: rule__GDomainProperty__Group_0_0__3 : rule__GDomainProperty__Group_0_0__3__Impl ;
    public final void rule__GDomainProperty__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1163:1: ( rule__GDomainProperty__Group_0_0__3__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1164:2: rule__GDomainProperty__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0__3__Impl_in_rule__GDomainProperty__Group_0_0__32330);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1170:1: rule__GDomainProperty__Group_0_0__3__Impl : ( ( rule__GDomainProperty__Group_0_0_3__0 )? ) ;
    public final void rule__GDomainProperty__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1174:1: ( ( ( rule__GDomainProperty__Group_0_0_3__0 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1175:1: ( ( rule__GDomainProperty__Group_0_0_3__0 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1175:1: ( ( rule__GDomainProperty__Group_0_0_3__0 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1176:1: ( rule__GDomainProperty__Group_0_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getGroup_0_0_3()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1177:1: ( rule__GDomainProperty__Group_0_0_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1177:2: rule__GDomainProperty__Group_0_0_3__0
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__0_in_rule__GDomainProperty__Group_0_0__3__Impl2357);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1195:1: rule__GDomainProperty__Group_0_0_3__0 : rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1 ;
    public final void rule__GDomainProperty__Group_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1199:1: ( rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1200:2: rule__GDomainProperty__Group_0_0_3__0__Impl rule__GDomainProperty__Group_0_0_3__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__0__Impl_in_rule__GDomainProperty__Group_0_0_3__02396);
            rule__GDomainProperty__Group_0_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__1_in_rule__GDomainProperty__Group_0_0_3__02399);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1207:1: rule__GDomainProperty__Group_0_0_3__0__Impl : ( '=' ) ;
    public final void rule__GDomainProperty__Group_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1211:1: ( ( '=' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1212:1: ( '=' )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1212:1: ( '=' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1213:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getEqualsSignKeyword_0_0_3_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__GDomainProperty__Group_0_0_3__0__Impl2427); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1226:1: rule__GDomainProperty__Group_0_0_3__1 : rule__GDomainProperty__Group_0_0_3__1__Impl ;
    public final void rule__GDomainProperty__Group_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1230:1: ( rule__GDomainProperty__Group_0_0_3__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1231:2: rule__GDomainProperty__Group_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_0_3__1__Impl_in_rule__GDomainProperty__Group_0_0_3__12458);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1237:1: rule__GDomainProperty__Group_0_0_3__1__Impl : ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) ) ;
    public final void rule__GDomainProperty__Group_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1241:1: ( ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1242:1: ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1242:1: ( ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1243:1: ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getDefaultValueAssignment_0_0_3_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1244:1: ( rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1244:2: rule__GDomainProperty__DefaultValueAssignment_0_0_3_1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__DefaultValueAssignment_0_0_3_1_in_rule__GDomainProperty__Group_0_0_3__1__Impl2485);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1258:1: rule__GDomainProperty__Group_0_1__0 : rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1 ;
    public final void rule__GDomainProperty__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1262:1: ( rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1263:2: rule__GDomainProperty__Group_0_1__0__Impl rule__GDomainProperty__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__0__Impl_in_rule__GDomainProperty__Group_0_1__02519);
            rule__GDomainProperty__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__1_in_rule__GDomainProperty__Group_0_1__02522);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1270:1: rule__GDomainProperty__Group_0_1__0__Impl : ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) ) ;
    public final void rule__GDomainProperty__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1274:1: ( ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1275:1: ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1275:1: ( ( rule__GDomainProperty__RefAssignment_0_1_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1276:1: ( rule__GDomainProperty__RefAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefAssignment_0_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1277:1: ( rule__GDomainProperty__RefAssignment_0_1_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1277:2: rule__GDomainProperty__RefAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__RefAssignment_0_1_0_in_rule__GDomainProperty__Group_0_1__0__Impl2549);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1287:1: rule__GDomainProperty__Group_0_1__1 : rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2 ;
    public final void rule__GDomainProperty__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1291:1: ( rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1292:2: rule__GDomainProperty__Group_0_1__1__Impl rule__GDomainProperty__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__1__Impl_in_rule__GDomainProperty__Group_0_1__12579);
            rule__GDomainProperty__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__2_in_rule__GDomainProperty__Group_0_1__12582);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1299:1: rule__GDomainProperty__Group_0_1__1__Impl : ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? ) ;
    public final void rule__GDomainProperty__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1303:1: ( ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1304:1: ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1304:1: ( ( rule__GDomainProperty__ListAssignment_0_1_1 )? )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1305:1: ( rule__GDomainProperty__ListAssignment_0_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListAssignment_0_1_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1306:1: ( rule__GDomainProperty__ListAssignment_0_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1306:2: rule__GDomainProperty__ListAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__GDomainProperty__ListAssignment_0_1_1_in_rule__GDomainProperty__Group_0_1__1__Impl2609);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1316:1: rule__GDomainProperty__Group_0_1__2 : rule__GDomainProperty__Group_0_1__2__Impl ;
    public final void rule__GDomainProperty__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1320:1: ( rule__GDomainProperty__Group_0_1__2__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1321:2: rule__GDomainProperty__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GDomainProperty__Group_0_1__2__Impl_in_rule__GDomainProperty__Group_0_1__22640);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1327:1: rule__GDomainProperty__Group_0_1__2__Impl : ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) ) ;
    public final void rule__GDomainProperty__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1331:1: ( ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1332:1: ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1332:1: ( ( rule__GDomainProperty__NameAssignment_0_1_2 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1333:1: ( rule__GDomainProperty__NameAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameAssignment_0_1_2()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1334:1: ( rule__GDomainProperty__NameAssignment_0_1_2 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1334:2: rule__GDomainProperty__NameAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__GDomainProperty__NameAssignment_0_1_2_in_rule__GDomainProperty__Group_0_1__2__Impl2667);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1350:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1354:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1355:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02703);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02706);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1362:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1366:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1367:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1367:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1368:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2733);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1379:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1383:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1384:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12762);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1390:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1394:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1395:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1395:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1396:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1397:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1397:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2789);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1411:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1415:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1416:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02824);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02827);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1423:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1427:1: ( ( ( '.' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1428:1: ( ( '.' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1428:1: ( ( '.' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1429:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1430:1: ( '.' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1431:2: '.'
            {
            match(input,24,FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl2856); if (state.failed) return ;

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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1442:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1446:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1447:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12888);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1453:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1457:1: ( ( ruleValidID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1458:1: ( ruleValidID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1458:1: ( ruleValidID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1459:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2915);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1475:1: rule__GModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1479:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1480:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1480:1: ( ruleQualifiedName )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1481:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GModel__NameAssignment_12953);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1490:1: rule__GModel__TypeListAssignment_3 : ( ruleGDomainElement ) ;
    public final void rule__GModel__TypeListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1494:1: ( ( ruleGDomainElement ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1495:1: ( ruleGDomainElement )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1495:1: ( ruleGDomainElement )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1496:1: ruleGDomainElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGModelAccess().getTypeListGDomainElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleGDomainElement_in_rule__GModel__TypeListAssignment_32984);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1505:1: rule__GDomainElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GDomainElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1509:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1510:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1510:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1511:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__NameAssignment_13015); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1520:1: rule__GDomainElement__SuperTypeListAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainElement__SuperTypeListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1524:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1525:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1525:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1526:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1527:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1528:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_13050); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1539:1: rule__GDomainElement__SuperTypeListAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainElement__SuperTypeListAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1543:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1544:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1544:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1545:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_2_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1546:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1547:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementIDTerminalRuleCall_2_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_2_13089); if (state.failed) return ;
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


    // $ANTLR start "rule__GDomainElement__MapAssignment_4_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1558:1: rule__GDomainElement__MapAssignment_4_0 : ( ruleGDomainMap ) ;
    public final void rule__GDomainElement__MapAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1562:1: ( ( ruleGDomainMap ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1563:1: ( ruleGDomainMap )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1563:1: ( ruleGDomainMap )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1564:1: ruleGDomainMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getMapGDomainMapParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleGDomainMap_in_rule__GDomainElement__MapAssignment_4_03124);
            ruleGDomainMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getMapGDomainMapParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__MapAssignment_4_0"


    // $ANTLR start "rule__GDomainElement__PropertyListAssignment_4_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1573:1: rule__GDomainElement__PropertyListAssignment_4_1 : ( ruleGDomainProperty ) ;
    public final void rule__GDomainElement__PropertyListAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1577:1: ( ( ruleGDomainProperty ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1578:1: ( ruleGDomainProperty )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1578:1: ( ruleGDomainProperty )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1579:1: ruleGDomainProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleGDomainProperty_in_rule__GDomainElement__PropertyListAssignment_4_13155);
            ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainElement__PropertyListAssignment_4_1"


    // $ANTLR start "rule__GDomainMap__BuiltInAssignment_1_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1588:1: rule__GDomainMap__BuiltInAssignment_1_0 : ( ( rule__GDomainMap__BuiltInAlternatives_1_0_0 ) ) ;
    public final void rule__GDomainMap__BuiltInAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1592:1: ( ( ( rule__GDomainMap__BuiltInAlternatives_1_0_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1593:1: ( ( rule__GDomainMap__BuiltInAlternatives_1_0_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1593:1: ( ( rule__GDomainMap__BuiltInAlternatives_1_0_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1594:1: ( rule__GDomainMap__BuiltInAlternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getBuiltInAlternatives_1_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1595:1: ( rule__GDomainMap__BuiltInAlternatives_1_0_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1595:2: rule__GDomainMap__BuiltInAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__GDomainMap__BuiltInAlternatives_1_0_0_in_rule__GDomainMap__BuiltInAssignment_1_03186);
            rule__GDomainMap__BuiltInAlternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getBuiltInAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__BuiltInAssignment_1_0"


    // $ANTLR start "rule__GDomainMap__RefAssignment_1_1"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1604:1: rule__GDomainMap__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainMap__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1608:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1609:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1609:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1610:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getRefGDomainElementCrossReference_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1611:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1612:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainMapAccess().getRefGDomainElementIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainMap__RefAssignment_1_13223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getRefGDomainElementIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGDomainMapAccess().getRefGDomainElementCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDomainMap__RefAssignment_1_1"


    // $ANTLR start "rule__GDomainProperty__BuiltInAssignment_0_0_0"
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1623:1: rule__GDomainProperty__BuiltInAssignment_0_0_0 : ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) ) ;
    public final void rule__GDomainProperty__BuiltInAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1627:1: ( ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1628:1: ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1628:1: ( ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1629:1: ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getBuiltInAlternatives_0_0_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1630:1: ( rule__GDomainProperty__BuiltInAlternatives_0_0_0_0 )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1630:2: rule__GDomainProperty__BuiltInAlternatives_0_0_0_0
            {
            pushFollow(FOLLOW_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0_in_rule__GDomainProperty__BuiltInAssignment_0_0_03258);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1639:1: rule__GDomainProperty__ListAssignment_0_0_1 : ( ( '[]' ) ) ;
    public final void rule__GDomainProperty__ListAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1643:1: ( ( ( '[]' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1644:1: ( ( '[]' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1644:1: ( ( '[]' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1645:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1646:1: ( '[]' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1647:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GDomainProperty__ListAssignment_0_0_13296); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1662:1: rule__GDomainProperty__NameAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__GDomainProperty__NameAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1666:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1667:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1667:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1668:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_0_23335); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1677:1: rule__GDomainProperty__DefaultValueAssignment_0_0_3_1 : ( ruleGDefault ) ;
    public final void rule__GDomainProperty__DefaultValueAssignment_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1681:1: ( ( ruleGDefault ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1682:1: ( ruleGDefault )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1682:1: ( ruleGDefault )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1683:1: ruleGDefault
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getDefaultValueGDefaultParserRuleCall_0_0_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleGDefault_in_rule__GDomainProperty__DefaultValueAssignment_0_0_3_13366);
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1692:1: rule__GDomainProperty__RefAssignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__GDomainProperty__RefAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1696:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1697:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1697:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1698:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementCrossReference_0_1_0_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1699:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getRefGDomainElementIDTerminalRuleCall_0_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__RefAssignment_0_1_03401); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1711:1: rule__GDomainProperty__ListAssignment_0_1_1 : ( ( '[]' ) ) ;
    public final void rule__GDomainProperty__ListAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1715:1: ( ( ( '[]' ) ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1716:1: ( ( '[]' ) )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1716:1: ( ( '[]' ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1717:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1718:1: ( '[]' )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1719:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__GDomainProperty__ListAssignment_0_1_13441); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1734:1: rule__GDomainProperty__NameAssignment_0_1_2 : ( RULE_ID ) ;
    public final void rule__GDomainProperty__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1738:1: ( ( RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1739:1: ( RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1739:1: ( RULE_ID )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1740:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_1_23480); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1749:1: rule__GDefault__StringValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__GDefault__StringValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1753:1: ( ( RULE_STRING ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1754:1: ( RULE_STRING )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1754:1: ( RULE_STRING )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1755:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GDefault__StringValAssignment_03511); if (state.failed) return ;
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
    // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1764:1: rule__GDefault__IntValAssignment_1 : ( RULE_INT ) ;
    public final void rule__GDefault__IntValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1768:1: ( ( RULE_INT ) )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1769:1: ( RULE_INT )
            {
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1769:1: ( RULE_INT )
            // ../org.eclipse.fx.ide.gmodel.ui/src-gen/org/eclipse/fx/ide/gmodel/ui/contentassist/antlr/internal/InternalGModelDSL.g:1770:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGDefaultAccess().getIntValINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GDefault__IntValAssignment_13542); if (state.failed) return ;
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
    public static final BitSet FOLLOW_ruleGDomainMap_in_entryRuleGDomainMap187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainMap194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__Group__0_in_ruleGDomainMap220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainProperty254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__0_in_ruleGDomainProperty280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDefault_in_entryRuleGDefault307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDefault314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__Alternatives_in_ruleGDefault340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__MapAssignment_4_0_in_rule__GDomainElement__Alternatives_4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__PropertyListAssignment_4_1_in_rule__GDomainElement__Alternatives_4513 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_rule__GDomainMap__BuiltInAssignment_1_0_in_rule__GDomainMap__Alternatives_1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__RefAssignment_1_1_in_rule__GDomainMap__Alternatives_1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__GDomainMap__BuiltInAlternatives_1_0_0599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GDomainMap__BuiltInAlternatives_1_0_0619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GDomainMap__BuiltInAlternatives_1_0_0639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GDomainMap__BuiltInAlternatives_1_0_0659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__0_in_rule__GDomainProperty__Alternatives_0693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__0_in_rule__GDomainProperty__Alternatives_0711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__StringValAssignment_0_in_rule__GDefault__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDefault__IntValAssignment_1_in_rule__GDefault__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__0__Impl_in_rule__GModel__Group__0888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GModel__Group__1_in_rule__GModel__Group__0891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GModel__Group__0__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__1__Impl_in_rule__GModel__Group__1950 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GModel__Group__2_in_rule__GModel__Group__1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__NameAssignment_1_in_rule__GModel__Group__1__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__2__Impl_in_rule__GModel__Group__21010 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__GModel__Group__3_in_rule__GModel__Group__21013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GModel__Group__2__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__Group__3__Impl_in_rule__GModel__Group__31072 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GModel__Group__4_in_rule__GModel__Group__31075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl1104 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GModel__TypeListAssignment_3_in_rule__GModel__Group__3__Impl1116 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__GModel__Group__4__Impl_in_rule__GModel__Group__41149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GModel__Group__4__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__0__Impl_in_rule__GDomainElement__Group__01218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__1_in_rule__GDomainElement__Group__01221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__GDomainElement__Group__0__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__1__Impl_in_rule__GDomainElement__Group__11280 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__2_in_rule__GDomainElement__Group__11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__NameAssignment_1_in_rule__GDomainElement__Group__1__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__2__Impl_in_rule__GDomainElement__Group__21340 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__3_in_rule__GDomainElement__Group__21343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__0_in_rule__GDomainElement__Group__2__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__3__Impl_in_rule__GDomainElement__Group__31401 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__4_in_rule__GDomainElement__Group__31404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GDomainElement__Group__3__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__4__Impl_in_rule__GDomainElement__Group__41463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__5_in_rule__GDomainElement__Group__41466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Alternatives_4_in_rule__GDomainElement__Group__4__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group__5__Impl_in_rule__GDomainElement__Group__51523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GDomainElement__Group__5__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__0__Impl_in_rule__GDomainElement__Group_2__01594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__1_in_rule__GDomainElement__Group_2__01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__GDomainElement__Group_2__0__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__1__Impl_in_rule__GDomainElement__Group_2__11656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__2_in_rule__GDomainElement__Group_2__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_1_in_rule__GDomainElement__Group_2__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2__2__Impl_in_rule__GDomainElement__Group_2__21716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__0_in_rule__GDomainElement__Group_2__2__Impl1743 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__0__Impl_in_rule__GDomainElement__Group_2_2__01780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__1_in_rule__GDomainElement__Group_2_2__01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GDomainElement__Group_2_2__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__Group_2_2__1__Impl_in_rule__GDomainElement__Group_2_2__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainElement__SuperTypeListAssignment_2_2_1_in_rule__GDomainElement__Group_2_2__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__Group__0__Impl_in_rule__GDomainMap__Group__01903 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__GDomainMap__Group__1_in_rule__GDomainMap__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GDomainMap__Group__0__Impl1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__Group__1__Impl_in_rule__GDomainMap__Group__11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__Alternatives_1_in_rule__GDomainMap__Group__1__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__0__Impl_in_rule__GDomainProperty__Group__02026 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__1_in_rule__GDomainProperty__Group__02029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Alternatives_0_in_rule__GDomainProperty__Group__0__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group__1__Impl_in_rule__GDomainProperty__Group__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GDomainProperty__Group__1__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__0__Impl_in_rule__GDomainProperty__Group_0_0__02149 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__1_in_rule__GDomainProperty__Group_0_0__02152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__BuiltInAssignment_0_0_0_in_rule__GDomainProperty__Group_0_0__0__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__1__Impl_in_rule__GDomainProperty__Group_0_0__12209 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__2_in_rule__GDomainProperty__Group_0_0__12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__ListAssignment_0_0_1_in_rule__GDomainProperty__Group_0_0__1__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__2__Impl_in_rule__GDomainProperty__Group_0_0__22270 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__3_in_rule__GDomainProperty__Group_0_0__22273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__NameAssignment_0_0_2_in_rule__GDomainProperty__Group_0_0__2__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0__3__Impl_in_rule__GDomainProperty__Group_0_0__32330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__0_in_rule__GDomainProperty__Group_0_0__3__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__0__Impl_in_rule__GDomainProperty__Group_0_0_3__02396 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__1_in_rule__GDomainProperty__Group_0_0_3__02399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GDomainProperty__Group_0_0_3__0__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_0_3__1__Impl_in_rule__GDomainProperty__Group_0_0_3__12458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__DefaultValueAssignment_0_0_3_1_in_rule__GDomainProperty__Group_0_0_3__1__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__0__Impl_in_rule__GDomainProperty__Group_0_1__02519 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__1_in_rule__GDomainProperty__Group_0_1__02522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__RefAssignment_0_1_0_in_rule__GDomainProperty__Group_0_1__0__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__1__Impl_in_rule__GDomainProperty__Group_0_1__12579 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__2_in_rule__GDomainProperty__Group_0_1__12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__ListAssignment_0_1_1_in_rule__GDomainProperty__Group_0_1__1__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__Group_0_1__2__Impl_in_rule__GDomainProperty__Group_0_1__22640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__NameAssignment_0_1_2_in_rule__GDomainProperty__Group_0_1__2__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02703 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group__0__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2789 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_rule__QualifiedName__Group_1__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GModel__NameAssignment_12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainElement_in_rule__GModel__TypeListAssignment_32984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__NameAssignment_13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainElement__SuperTypeListAssignment_2_2_13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainMap_in_rule__GDomainElement__MapAssignment_4_03124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_rule__GDomainElement__PropertyListAssignment_4_13155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainMap__BuiltInAlternatives_1_0_0_in_rule__GDomainMap__BuiltInAssignment_1_03186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainMap__RefAssignment_1_13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GDomainProperty__BuiltInAlternatives_0_0_0_0_in_rule__GDomainProperty__BuiltInAssignment_0_0_03258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GDomainProperty__ListAssignment_0_0_13296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_0_23335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDefault_in_rule__GDomainProperty__DefaultValueAssignment_0_0_3_13366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__RefAssignment_0_1_03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GDomainProperty__ListAssignment_0_1_13441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GDomainProperty__NameAssignment_0_1_23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GDefault__StringValAssignment_03511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GDefault__IntValAssignment_13542 = new BitSet(new long[]{0x0000000000000002L});

}