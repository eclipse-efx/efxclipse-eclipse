package org.eclipse.fx.ide.css.cssext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "'package'", "'{'", "'}'", "'@INT'", "'('", "'->'", "')'", "'@NUM'", "'@STRING'", "'@URL'", "'extends'", "','", "'styleclass'", "'default:'", "';'", "'<'", "'>'", "'='", "'|'", "'||'", "'~'", "'+'", "'?'", "'['", "']'", "'%'", "'substructure'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_REGEX=10;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_PSEUDO=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=11;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=5;
    public static final int RULE_JDOC=6;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g"; }



     	private CssExtDslGrammarAccess grammarAccess;
     	
        public InternalCssExtDslParser(TokenStream input, CssExtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CssExtension";	
       	}
       	
       	@Override
       	protected CssExtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:67:1: entryRuleCssExtension returns [EObject current=null] : iv_ruleCssExtension= ruleCssExtension EOF ;
    public final EObject entryRuleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssExtension = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:68:2: (iv_ruleCssExtension= ruleCssExtension EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:69:2: iv_ruleCssExtension= ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_ruleCssExtension_in_entryRuleCssExtension75);
            iv_ruleCssExtension=ruleCssExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssExtension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssExtension85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:76:1: ruleCssExtension returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) ;
    public final EObject ruleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_packageDef_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleCssExtension131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:98:3: ( (lv_packageDef_1_0= rulePackageDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_JDOC||LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:99:1: (lv_packageDef_1_0= rulePackageDefinition )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:100:3: lv_packageDef_1_0= rulePackageDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackageDefinition_in_ruleCssExtension153);
                    lv_packageDef_1_0=rulePackageDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCssExtensionRule());
                      	        }
                             		set(
                             			current, 
                             			"packageDef",
                              		lv_packageDef_1_0, 
                              		"PackageDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:167:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:168:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:169:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID295);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:176:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:179:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:180:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:195:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:196:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:197:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:204:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:207:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:208:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:209:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName448);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) && (synpred1_InternalCssExtDsl())) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName499);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:246:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:247:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:248:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:255:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:258:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:259:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:260:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:270:1: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:271:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildCard637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:290:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:291:2: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:292:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDefinition689); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:299:1: rulePackageDefinition returns [EObject current=null] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_doku_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_subpackages_6_0 = null;

        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:302:28: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_JDOC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:3: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:303:3: ( (lv_doku_0_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:304:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:304:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:305:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePackageDefinition736);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:321:2: (this_WS_1= RULE_WS )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_WS) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:321:3: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePackageDefinition748); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_1, grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_rulePackageDefinition763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:329:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:330:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:331:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDefinition784);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePackageDefinition796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:351:1: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*
            loop7:
            do {
                int alt7=4;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:351:2: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:351:2: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:352:1: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:352:1: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:353:3: lv_rules_5_0= ruleCSSRuleDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition818);
            	    lv_rules_5_0=ruleCSSRuleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rules",
            	              		lv_rules_5_0, 
            	              		"CSSRuleDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:370:6: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:370:6: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:371:1: (lv_subpackages_6_0= rulePackageDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:371:1: (lv_subpackages_6_0= rulePackageDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:372:3: lv_subpackages_6_0= rulePackageDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePackageDefinition_in_rulePackageDefinition845);
            	    lv_subpackages_6_0=rulePackageDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subpackages",
            	              		lv_subpackages_6_0, 
            	              		"PackageDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:389:6: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:389:6: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:390:1: (lv_elements_7_0= ruleElementDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:390:1: (lv_elements_7_0= ruleElementDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:391:3: lv_elements_7_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementDefinition_in_rulePackageDefinition872);
            	    lv_elements_7_0=ruleElementDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_7_0, 
            	              		"ElementDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_rulePackageDefinition886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:419:1: entryRuleDoku returns [EObject current=null] : iv_ruleDoku= ruleDoku EOF ;
    public final EObject entryRuleDoku() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoku = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:420:2: (iv_ruleDoku= ruleDoku EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:421:2: iv_ruleDoku= ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_ruleDoku_in_entryRuleDoku922);
            iv_ruleDoku=ruleDoku();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoku; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoku932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:428:1: ruleDoku returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDoku() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:431:28: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:432:1: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:432:1: ( (lv_content_0_0= RULE_JDOC ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:433:1: (lv_content_0_0= RULE_JDOC )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:433:1: (lv_content_0_0= RULE_JDOC )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:434:3: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_RULE_JDOC_in_ruleDoku973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_content_0_0, grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDokuRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"content",
                      		lv_content_0_0, 
                      		"JDOC");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:458:1: entryRuleCSSBaseType returns [EObject current=null] : iv_ruleCSSBaseType= ruleCSSBaseType EOF ;
    public final EObject entryRuleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSBaseType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:462:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:463:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType1019);
            iv_ruleCSSBaseType=ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSBaseType1029); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:473:1: ruleCSSBaseType returns [EObject current=null] : this_CSSType_0= ruleCSSType ;
    public final EObject ruleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject this_CSSType_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:477:28: (this_CSSType_0= ruleCSSType )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:479:5: this_CSSType_0= ruleCSSType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSType_in_ruleCSSBaseType1079);
            this_CSSType_0=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSType_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:498:1: entryRuleCSSType returns [EObject current=null] : iv_ruleCSSType= ruleCSSType EOF ;
    public final EObject entryRuleCSSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:502:2: (iv_ruleCSSType= ruleCSSType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:503:2: iv_ruleCSSType= ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCSSType_in_entryRuleCSSType1123);
            iv_ruleCSSType=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSType1133); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:513:1: ruleCSSType returns [EObject current=null] : ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) ) ;
    public final EObject ruleCSSType() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_from_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token lv_to_10_0=null;
        Token this_WS_11=null;
        Token otherlv_12=null;
        Token this_WS_15=null;
        Token lv_type_16_0=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token lv_from_19_0=null;
        Token this_WS_20=null;
        Token otherlv_21=null;
        Token this_WS_22=null;
        Token lv_to_23_0=null;
        Token this_WS_24=null;
        Token otherlv_25=null;
        Token this_WS_27=null;
        Token lv_type_28_0=null;
        Token this_WS_29=null;
        Token lv_type_30_0=null;
        Token this_WS_31=null;
        Token lv_type_32_0=null;
        Token this_WS_33=null;
        Token lv_type_34_0=null;
        Token this_WS_35=null;
        EObject lv_doku_1_0 = null;

        EObject lv_doku_14_0 = null;

        EObject lv_doku_26_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:517:28: ( ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:518:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:519:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:2: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_JDOC) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:3: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:524:3: ( (lv_doku_1_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_doku_1_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:525:1: (lv_doku_1_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:526:3: lv_doku_1_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1194);
                            lv_doku_1_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_1_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:542:2: (this_WS_2= RULE_WS )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_WS) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:542:3: this_WS_2= RULE_WS
                            	    {
                            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1206); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_2, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:546:5: ( (lv_type_3_0= '@INT' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:547:1: (lv_type_3_0= '@INT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:547:1: (lv_type_3_0= '@INT' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:548:3: lv_type_3_0= '@INT'
                    {
                    lv_type_3_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_3_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_3_0, "@INT");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:565:1: (this_WS_5= RULE_WS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:565:2: this_WS_5= RULE_WS
                    	    {
                    	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1264); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_5, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:569:3: ( (lv_from_6_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:570:1: (lv_from_6_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:570:1: (lv_from_6_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:571:3: lv_from_6_0= RULE_INT
                    {
                    lv_from_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_6_0, grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_6_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:587:2: (this_WS_7= RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:587:3: this_WS_7= RULE_WS
                    	    {
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1299); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_7, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:595:1: (this_WS_9= RULE_WS )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:595:2: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1324); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_9, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:599:3: ( (lv_to_10_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:600:1: (lv_to_10_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:600:1: (lv_to_10_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:601:3: lv_to_10_0= RULE_INT
                    {
                    lv_to_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSType1342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_10_0, grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_10_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:617:2: (this_WS_11= RULE_WS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_WS) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:617:3: this_WS_11= RULE_WS
                    	    {
                    	    this_WS_11=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1359); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_11, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:626:6: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:626:6: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:626:7: () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:626:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:627:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:632:2: ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_JDOC) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:632:3: ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:632:3: ( (lv_doku_14_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:633:1: (lv_doku_14_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:633:1: (lv_doku_14_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:634:3: lv_doku_14_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1411);
                            lv_doku_14_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_14_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:650:2: (this_WS_15= RULE_WS )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_WS) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:650:3: this_WS_15= RULE_WS
                            	    {
                            	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1423); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_15, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:654:5: ( (lv_type_16_0= '@NUM' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:655:1: (lv_type_16_0= '@NUM' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:655:1: (lv_type_16_0= '@NUM' )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:656:3: lv_type_16_0= '@NUM'
                    {
                    lv_type_16_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_type_16_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(current, "type", lv_type_16_0, "@NUM");
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleCSSType1469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:673:1: (this_WS_18= RULE_WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:673:2: this_WS_18= RULE_WS
                    	    {
                    	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1481); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_18, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:677:3: ( (lv_from_19_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:678:1: (lv_from_19_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:678:1: (lv_from_19_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:679:3: lv_from_19_0= RULE_DOUBLE
                    {
                    lv_from_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_from_19_0, grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"from",
                              		lv_from_19_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:695:2: (this_WS_20= RULE_WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:695:3: this_WS_20= RULE_WS
                    	    {
                    	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1516); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_20, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,23,FOLLOW_23_in_ruleCSSType1529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:703:1: (this_WS_22= RULE_WS )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:703:2: this_WS_22= RULE_WS
                    	    {
                    	    this_WS_22=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1541); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_22, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:707:3: ( (lv_to_23_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:708:1: (lv_to_23_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:708:1: (lv_to_23_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:709:3: lv_to_23_0= RULE_DOUBLE
                    {
                    lv_to_23_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSType1559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_to_23_0, grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"to",
                              		lv_to_23_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:725:2: (this_WS_24= RULE_WS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:725:3: this_WS_24= RULE_WS
                    	    {
                    	    this_WS_24=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1576); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_24, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleCSSType1589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:6: ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:6: ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:7: ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:7: ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_JDOC) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:8: ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:734:8: ( (lv_doku_26_0= ruleDoku ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:735:1: (lv_doku_26_0= ruleDoku )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:735:1: (lv_doku_26_0= ruleDoku )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:736:3: lv_doku_26_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDoku_in_ruleCSSType1619);
                            lv_doku_26_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"doku",
                                      		lv_doku_26_0, 
                                      		"Doku");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:752:2: (this_WS_27= RULE_WS )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_WS) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:752:3: this_WS_27= RULE_WS
                            	    {
                            	    this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1631); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_27, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_0_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:5: ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) )
                    int alt26=4;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt26=1;
                        }
                        break;
                    case 25:
                        {
                        alt26=2;
                        }
                        break;
                    case 26:
                        {
                        alt26=3;
                        }
                        break;
                    case 27:
                        {
                        alt26=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:6: ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:6: ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:7: ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:756:7: ( (lv_type_28_0= '@INT' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:757:1: (lv_type_28_0= '@INT' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:757:1: (lv_type_28_0= '@INT' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:758:3: lv_type_28_0= '@INT'
                            {
                            lv_type_28_0=(Token)match(input,21,FOLLOW_21_in_ruleCSSType1654); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_28_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_2_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_28_0, "@INT");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:771:2: (this_WS_29= RULE_WS )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_WS) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:771:3: this_WS_29= RULE_WS
                            	    {
                            	    this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1679); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_29, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_0_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:776:6: ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:776:6: ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:776:7: ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:776:7: ( (lv_type_30_0= '@NUM' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:777:1: (lv_type_30_0= '@NUM' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:777:1: (lv_type_30_0= '@NUM' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:778:3: lv_type_30_0= '@NUM'
                            {
                            lv_type_30_0=(Token)match(input,25,FOLLOW_25_in_ruleCSSType1706); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_30_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_2_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_30_0, "@NUM");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:791:2: (this_WS_31= RULE_WS )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_WS) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:791:3: this_WS_31= RULE_WS
                            	    {
                            	    this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1731); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_31, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:796:6: ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:796:6: ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:796:7: ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:796:7: ( (lv_type_32_0= '@STRING' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:797:1: (lv_type_32_0= '@STRING' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:797:1: (lv_type_32_0= '@STRING' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:798:3: lv_type_32_0= '@STRING'
                            {
                            lv_type_32_0=(Token)match(input,26,FOLLOW_26_in_ruleCSSType1758); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_32_0, grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_2_1_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_32_0, "@STRING");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:811:2: (this_WS_33= RULE_WS )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_WS) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:811:3: this_WS_33= RULE_WS
                            	    {
                            	    this_WS_33=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1783); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_33, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_2_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 4 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:816:6: ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:816:6: ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:816:7: ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:816:7: ( (lv_type_34_0= '@URL' ) )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:817:1: (lv_type_34_0= '@URL' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:817:1: (lv_type_34_0= '@URL' )
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:818:3: lv_type_34_0= '@URL'
                            {
                            lv_type_34_0=(Token)match(input,27,FOLLOW_27_in_ruleCSSType1810); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_34_0, grammarAccess.getCSSTypeAccess().getTypeURLKeyword_2_1_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSTypeRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_34_0, "@URL");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:831:2: (this_WS_35= RULE_WS )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_WS) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:831:3: this_WS_35= RULE_WS
                            	    {
                            	    this_WS_35=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSType1835); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_35, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_3_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:846:1: entryRuleElementDefinition returns [EObject current=null] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final EObject entryRuleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:847:2: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:848:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1879);
            iv_ruleElementDefinition=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition1889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:855:1: ruleElementDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_styleclass_8_0=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_pseudoClasses_11_0 = null;

        EObject lv_substructures_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:858:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:859:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:859:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:859:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:859:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:860:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:865:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_JDOC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:866:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:866:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:867:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleElementDefinition1944);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:883:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:884:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:884:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:885:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition1966);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:901:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:901:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleElementDefinition1979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:905:1: ( ( ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:906:1: ( ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:906:1: ( ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:907:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition2002);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:920:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==29) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:920:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleElementDefinition2015); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:924:1: ( ( ruleQualifiedName ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:925:1: ( ruleQualifiedName )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:925:1: ( ruleQualifiedName )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:926:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleElementDefinition2038);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:939:6: (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:939:8: otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleElementDefinition2055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:943:1: ( (lv_styleclass_8_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:944:1: (lv_styleclass_8_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:944:1: (lv_styleclass_8_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:945:3: lv_styleclass_8_0= RULE_ID
                    {
                    lv_styleclass_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementDefinition2072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_styleclass_8_0, grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getElementDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"styleclass",
                              		lv_styleclass_8_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleElementDefinition2091); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:965:1: ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )*
            loop32:
            do {
                int alt32=4;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_PSEUDO:
                        {
                        alt32=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt32=1;
                        }
                        break;
                    case 44:
                        {
                        alt32=3;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    alt32=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt32=2;
                    }
                    break;
                case 44:
                    {
                    alt32=3;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:965:2: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:965:2: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:966:1: (lv_properties_10_0= rulePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:966:1: (lv_properties_10_0= rulePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:967:3: lv_properties_10_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleElementDefinition2113);
            	    lv_properties_10_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_10_0, 
            	              		"PropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:984:6: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:984:6: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:985:1: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:985:1: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:986:3: lv_pseudoClasses_11_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition2140);
            	    lv_pseudoClasses_11_0=rulePseudoClassDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pseudoClasses",
            	              		lv_pseudoClasses_11_0, 
            	              		"PseudoClassDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1003:6: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1003:6: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1004:1: (lv_substructures_12_0= ruleSubstructure )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1004:1: (lv_substructures_12_0= ruleSubstructure )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1005:3: lv_substructures_12_0= ruleSubstructure
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructure_in_ruleElementDefinition2167);
            	    lv_substructures_12_0=ruleSubstructure();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"substructures",
            	              		lv_substructures_12_0, 
            	              		"Substructure");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleElementDefinition2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1033:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1034:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1035:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition2217);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition2227); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1042:1: rulePropertyDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1045:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1046:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1046:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1046:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1046:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1047:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1052:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_JDOC) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1053:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1053:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1054:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePropertyDefinition2282);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1070:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1071:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1071:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1072:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyDefinition2304);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1088:2: ( (lv_rule_3_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1089:1: (lv_rule_3_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1089:1: (lv_rule_3_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1090:3: lv_rule_3_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition2325);
            lv_rule_3_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"rule",
                      		lv_rule_3_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1106:2: (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1106:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePropertyDefinition2338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1110:1: ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1111:1: (lv_default_5_0= ruleCSSDefaultValue )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1111:1: (lv_default_5_0= ruleCSSDefaultValue )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1112:3: lv_default_5_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2359);
                    lv_default_5_0=ruleCSSDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_5_0, 
                              		"CSSDefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_rulePropertyDefinition2373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1140:1: entryRulePseudoClassDefinition returns [EObject current=null] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final EObject entryRulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1141:2: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1142:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2409);
            iv_rulePseudoClassDefinition=rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassDefinition2419); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1149:1: rulePseudoClassDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) ;
    public final EObject rulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1152:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1153:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1153:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1153:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1153:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1154:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1159:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1160:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1160:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1161:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_rulePseudoClassDefinition2474);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1177:3: ( (lv_name_2_0= RULE_PSEUDO ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1178:1: (lv_name_2_0= RULE_PSEUDO )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1178:1: (lv_name_2_0= RULE_PSEUDO )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1179:3: lv_name_2_0= RULE_PSEUDO
            {
            lv_name_2_0=(Token)match(input,RULE_PSEUDO,FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPseudoClassDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"PSEUDO");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1203:1: entryRuleCSSRuleRef returns [EObject current=null] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final EObject entryRuleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1207:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1208:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2539);
            iv_ruleCSSRuleRef=ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRef2549); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1218:1: ruleCSSRuleRef returns [EObject current=null] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) ;
    public final EObject ruleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_doku_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1222:28: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:1: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:2: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_JDOC) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:3: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1223:3: ( (lv_doku_0_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1224:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1224:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1225:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleRef2600);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleRefRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1241:2: (this_WS_1= RULE_WS )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_WS) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1241:3: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleRef2612); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_1, grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCSSRuleRef2627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1249:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1250:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1250:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1251:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRefRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2650);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCSSRuleRef2662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1279:1: entryRuleCSSRuleDefinition returns [EObject current=null] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final EObject entryRuleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1283:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1284:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2708);
            iv_ruleCSSRuleDefinition=ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleDefinition2718); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1294:1: ruleCSSRuleDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_func_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1298:28: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1299:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1299:1: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1299:2: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1299:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1300:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1305:2: ( (lv_doku_1_0= ruleDoku ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_JDOC) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1306:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1306:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1307:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2777);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1323:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1324:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1324:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1325:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCSSRuleDefinition2799);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleCSSRuleDefinition2811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:1: ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_JDOC && LA39_0<=RULE_INT)||LA39_0==RULE_REGEX||LA39_0==21||(LA39_0>=25 && LA39_0<=27)||LA39_0==29||LA39_0==33||LA39_0==41||LA39_0==43) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==22) ) {
                    alt39=2;
                }
                else if ( (LA39_2==RULE_ID||(LA39_2>=RULE_JDOC && LA39_2<=RULE_INT)||LA39_2==RULE_REGEX||LA39_2==17||LA39_2==21||(LA39_2>=25 && LA39_2<=27)||LA39_2==29||(LA39_2>=32 && LA39_2<=33)||(LA39_2>=36 && LA39_2<=41)||LA39_2==43) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:2: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1345:2: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1346:1: (lv_rule_4_0= ruleCSSRuleOr )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1346:1: (lv_rule_4_0= ruleCSSRuleOr )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1347:3: lv_rule_4_0= ruleCSSRuleOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2833);
                    lv_rule_4_0=ruleCSSRuleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"rule",
                              		lv_rule_4_0, 
                              		"CSSRuleOr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1364:6: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1364:6: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1365:1: (lv_func_5_0= ruleCSSRuleFunc )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1365:1: (lv_func_5_0= ruleCSSRuleFunc )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1366:3: lv_func_5_0= ruleCSSRuleFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2860);
                    lv_func_5_0=ruleCSSRuleFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"func",
                              		lv_func_5_0, 
                              		"CSSRuleFunc");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleCSSRuleDefinition2873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1397:1: entryRuleCSSRuleFunc returns [EObject current=null] : iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF ;
    public final EObject entryRuleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleFunc = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1401:2: (iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1402:2: iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2919);
            iv_ruleCSSRuleFunc=ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleFunc2929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1412:1: ruleCSSRuleFunc returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) ;
    public final EObject ruleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1416:28: ( ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1417:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1417:1: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1417:2: () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1417:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1418:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1423:2: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1424:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1424:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1425:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleCSSRuleFunc2988);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCSSRuleFunc3000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1445:1: (this_WS_3= RULE_WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1445:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleFunc3012); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1449:3: ( (lv_params_4_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1450:1: (lv_params_4_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1450:1: (lv_params_4_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1451:3: lv_params_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc3034);
            lv_params_4_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              	        }
                     		set(
                     			current, 
                     			"params",
                      		lv_params_4_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCSSRuleFunc3046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1482:1: entryRuleCSSRuleOr returns [EObject current=null] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final EObject entryRuleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleOr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1486:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1487:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr3092);
            iv_ruleCSSRuleOr=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleOr3102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1497:1: ruleCSSRuleOr returns [EObject current=null] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final EObject ruleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleXor_0 = null;

        EObject lv_ors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1501:28: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1502:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1502:1: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1503:5: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3153);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleXor_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1511:1: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1511:2: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1511:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1512:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1517:2: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==36) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1517:4: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleCSSRuleOr3175); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1521:1: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1522:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1522:1: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1523:3: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3196);
                    	    lv_ors_3_0=ruleCSSRuleXor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleOrRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ors",
                    	              		lv_ors_3_0, 
                    	              		"CSSRuleXor");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1550:1: entryRuleCSSRuleXor returns [EObject current=null] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final EObject entryRuleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleXor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1554:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1555:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor3246);
            iv_ruleCSSRuleXor=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleXor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleXor3256); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1565:1: ruleCSSRuleXor returns [EObject current=null] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final EObject ruleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleConcat_0 = null;

        EObject lv_xors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1569:28: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1570:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1570:1: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1571:5: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3307);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1579:1: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1579:2: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1579:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1580:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1585:2: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==37) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1585:4: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleCSSRuleXor3329); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1589:1: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1590:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1590:1: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1591:3: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3350);
                    	    lv_xors_3_0=ruleCSSRuleConcat();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleXorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"xors",
                    	              		lv_xors_3_0, 
                    	              		"CSSRuleConcat");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1618:1: entryRuleCSSRuleConcat returns [EObject current=null] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final EObject entryRuleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcat = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1622:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1623:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3400);
            iv_ruleCSSRuleConcat=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcat3410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1633:1: ruleCSSRuleConcat returns [EObject current=null] : (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) ;
    public final EObject ruleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRuleConcatWithoutSpace_0 = null;

        EObject lv_conc_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1637:28: ( (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1638:1: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1638:1: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1639:5: this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3461);
            this_CSSRuleConcatWithoutSpace_0=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRuleConcatWithoutSpace_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1647:1: ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||(LA46_0>=RULE_JDOC && LA46_0<=RULE_INT)||LA46_0==RULE_REGEX||LA46_0==21||(LA46_0>=25 && LA46_0<=27)||LA46_0==29||LA46_0==33||LA46_0==41||LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1647:2: () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1647:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1648:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1653:2: ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_ID||(LA45_0>=RULE_JDOC && LA45_0<=RULE_INT)||LA45_0==RULE_REGEX||LA45_0==21||(LA45_0>=25 && LA45_0<=27)||LA45_0==29||LA45_0==33||LA45_0==41||LA45_0==43) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1654:1: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1654:1: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1655:3: lv_conc_2_0= ruleCSSRuleConcatWithoutSpace
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3491);
                    	    lv_conc_2_0=ruleCSSRuleConcatWithoutSpace();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleConcatRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conc",
                    	              		lv_conc_2_0, 
                    	              		"CSSRuleConcatWithoutSpace");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1682:1: entryRuleCSSRuleConcatWithoutSpace returns [EObject current=null] : iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF ;
    public final EObject entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcatWithoutSpace = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1686:2: (iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1687:2: iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleConcatWithoutSpace_in_entryRuleCSSRuleConcatWithoutSpace3540);
            iv_ruleCSSRuleConcatWithoutSpace=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcatWithoutSpace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleConcatWithoutSpace3550); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1697:1: ruleCSSRuleConcatWithoutSpace returns [EObject current=null] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) ;
    public final EObject ruleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRulePostfix_0 = null;

        EObject lv_conc_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1701:28: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1702:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1702:1: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1703:5: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3601);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePostfix_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1711:1: ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1711:2: () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1711:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1712:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1717:2: (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==38) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1717:4: otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCSSRuleConcatWithoutSpace3623); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1721:1: ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1722:1: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1722:1: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1723:3: lv_conc_3_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3644);
                    	    lv_conc_3_0=ruleCSSRulePostfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCSSRuleConcatWithoutSpaceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conc",
                    	              		lv_conc_3_0, 
                    	              		"CSSRulePostfix");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1750:1: entryRuleCSSRulePostfix returns [EObject current=null] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final EObject entryRuleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePostfix = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1754:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1755:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3694);
            iv_ruleCSSRulePostfix=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePostfix3704); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1765:1: ruleCSSRulePostfix returns [EObject current=null] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final EObject ruleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_CSSRulePrimary_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1769:28: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1770:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1770:1: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1771:5: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3755);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CSSRulePrimary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1779:1: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==17||(LA50_0>=39 && LA50_0<=40)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1779:2: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1779:2: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1780:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1785:2: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1786:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1786:1: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1787:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1787:1: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    int alt49=3;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt49=1;
                        }
                        break;
                    case 39:
                        {
                        alt49=2;
                        }
                        break;
                    case 40:
                        {
                        alt49=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }

                    switch (alt49) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1788:3: lv_cardinality_2_1= '*'
                            {
                            lv_cardinality_2_1=(Token)match(input,17,FOLLOW_17_in_ruleCSSRulePostfix3784); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_1, grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1800:8: lv_cardinality_2_2= '+'
                            {
                            lv_cardinality_2_2=(Token)match(input,39,FOLLOW_39_in_ruleCSSRulePostfix3813); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_2, grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1812:8: lv_cardinality_2_3= '?'
                            {
                            lv_cardinality_2_3=(Token)match(input,40,FOLLOW_40_in_ruleCSSRulePostfix3842); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_cardinality_2_3, grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              	        }
                                     		setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1838:1: entryRuleCSSRuleBracket returns [EObject current=null] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final EObject entryRuleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleBracket = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1842:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1843:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3906);
            iv_ruleCSSRuleBracket=ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleBracket3916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1853:1: ruleCSSRuleBracket returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final EObject ruleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1857:28: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1858:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1858:1: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1858:2: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1858:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1859:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleCSSRuleBracket3966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1868:1: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1869:1: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1869:1: (lv_inner_2_0= ruleCSSRuleOr )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1870:3: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3987);
            lv_inner_2_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCSSRuleBracketRule());
              	        }
                     		set(
                     			current, 
                     			"inner",
                      		lv_inner_2_0, 
                      		"CSSRuleOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleCSSRuleBracket3999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1901:1: entryRuleCSSRulePrimary returns [EObject current=null] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final EObject entryRuleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePrimary = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1905:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1906:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary4045);
            iv_ruleCSSRulePrimary=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRulePrimary4055); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1916:1: ruleCSSRulePrimary returns [EObject current=null] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        EObject this_CSSRuleRef_0 = null;

        EObject this_CSSRuleBracket_1 = null;

        EObject this_CSSRuleLiteral_2 = null;

        EObject this_CSSRuleSymbol_3 = null;

        EObject this_CSSBaseType_4 = null;

        EObject this_CSSRuleRegex_5 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1920:28: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1921:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1921:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt51=7;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1922:5: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary4106);
                    this_CSSRuleRef_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1932:5: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary4133);
                    this_CSSRuleBracket_1=ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleBracket_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1942:5: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary4160);
                    this_CSSRuleLiteral_2=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1952:5: this_CSSRuleSymbol_3= ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary4187);
                    this_CSSRuleSymbol_3=ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleSymbol_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1962:5: this_CSSBaseType_4= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary4214);
                    this_CSSBaseType_4=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSBaseType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1972:5: this_CSSRuleRegex_5= ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary4241);
                    this_CSSRuleRegex_5=ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CSSRuleRegex_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:7: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1981:7: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1982:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1987:2: ( (lv_value_7_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1988:1: (lv_value_7_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1988:1: (lv_value_7_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:1989:3: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSRulePrimary4273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRulePrimaryRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2016:1: entryRuleCSSRuleRegex returns [EObject current=null] : iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF ;
    public final EObject entryRuleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRegex = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2020:2: (iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2021:2: iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex4325);
            iv_ruleCSSRuleRegex=ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRegex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleRegex4335); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2031:1: ruleCSSRuleRegex returns [EObject current=null] : ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) ;
    public final EObject ruleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        Token lv_regex_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2035:28: ( ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2036:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2036:1: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2036:2: () ( (lv_regex_1_0= RULE_REGEX ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2036:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2042:2: ( (lv_regex_1_0= RULE_REGEX ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2043:1: (lv_regex_1_0= RULE_REGEX )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2043:1: (lv_regex_1_0= RULE_REGEX )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2044:3: lv_regex_1_0= RULE_REGEX
            {
            lv_regex_1_0=(Token)match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex4390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_regex_1_0, grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleRegexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"regex",
                      		lv_regex_1_0, 
                      		"REGEX");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2071:1: entryRuleCSSRuleLiteral returns [EObject current=null] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final EObject entryRuleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2072:2: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2073:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral4435);
            iv_ruleCSSRuleLiteral=ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleLiteral4445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2080:1: ruleCSSRuleLiteral returns [EObject current=null] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_value_3_0=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2083:28: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2084:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2084:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2084:2: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2084:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2085:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2090:2: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_JDOC) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2090:3: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2090:3: ( (lv_doku_1_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2091:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2091:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2092:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleLiteral4501);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2108:2: (this_WS_2= RULE_WS )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_WS) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2108:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleLiteral4513); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2112:5: ( (lv_value_3_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2113:1: (lv_value_3_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2113:1: (lv_value_3_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2114:3: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_3_0, grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCSSRuleLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2138:1: entryRuleCSSRuleSymbol returns [EObject current=null] : iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF ;
    public final EObject entryRuleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleSymbol = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2139:2: (iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2140:2: iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4574);
            iv_ruleCSSRuleSymbol=ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleSymbol; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSRuleSymbol4584); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2147:1: ruleCSSRuleSymbol returns [EObject current=null] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) ;
    public final EObject ruleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_symbol_3_1=null;
        Token lv_symbol_3_2=null;
        EObject lv_doku_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2150:28: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2151:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2151:1: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2151:2: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2151:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2152:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2157:2: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_JDOC) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2157:3: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2157:3: ( (lv_doku_1_0= ruleDoku ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2158:1: (lv_doku_1_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2158:1: (lv_doku_1_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2159:3: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleCSSRuleSymbol4640);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSRuleSymbolRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_1_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2175:2: (this_WS_2= RULE_WS )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_WS) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2175:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleCSSRuleSymbol4652); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2179:5: ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2180:1: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2180:1: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2181:1: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2181:1: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==29) ) {
                alt56=1;
            }
            else if ( (LA56_0==43) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2182:3: lv_symbol_3_1= ','
                    {
                    lv_symbol_3_1=(Token)match(input,29,FOLLOW_29_in_ruleCSSRuleSymbol4675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_3_1, grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_3_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2194:8: lv_symbol_3_2= '%'
                    {
                    lv_symbol_3_2=(Token)match(input,43,FOLLOW_43_in_ruleCSSRuleSymbol4704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_3_2, grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_3_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2217:1: entryRuleCSSDefaultValue returns [EObject current=null] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final EObject entryRuleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSDefaultValue = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2218:2: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2219:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4756);
            iv_ruleCSSDefaultValue=ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSSDefaultValue4766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2226:1: ruleCSSDefaultValue returns [EObject current=null] : ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        Token lv_ival_2_0=null;
        Token lv_dval_3_0=null;
        Token lv_sval_4_0=null;
        EObject lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2229:28: ( ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:1: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_JDOC:
                {
                alt57=1;
                }
                break;
            case RULE_INT:
                {
                alt57=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt57=3;
                }
                break;
            case RULE_STRING:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:2: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:3: () ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2230:3: ()
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2231:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2236:2: ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2237:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2237:1: (lv_val_1_0= ruleCSSRuleLiteral )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2238:3: lv_val_1_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4822);
                    lv_val_1_0=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_1_0, 
                              		"CSSRuleLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2255:6: ( (lv_ival_2_0= RULE_INT ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2255:6: ( (lv_ival_2_0= RULE_INT ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2256:1: (lv_ival_2_0= RULE_INT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2256:1: (lv_ival_2_0= RULE_INT )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2257:3: lv_ival_2_0= RULE_INT
                    {
                    lv_ival_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCSSDefaultValue4846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ival_2_0, grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ival",
                              		lv_ival_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2274:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2274:6: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2275:1: (lv_dval_3_0= RULE_DOUBLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2275:1: (lv_dval_3_0= RULE_DOUBLE )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2276:3: lv_dval_3_0= RULE_DOUBLE
                    {
                    lv_dval_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_dval_3_0, grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"dval",
                              		lv_dval_3_0, 
                              		"DOUBLE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2293:6: ( (lv_sval_4_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2293:6: ( (lv_sval_4_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2294:1: (lv_sval_4_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2294:1: (lv_sval_4_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2295:3: lv_sval_4_0= RULE_STRING
                    {
                    lv_sval_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sval_4_0, grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sval",
                              		lv_sval_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2319:1: entryRuleSubstructureSelector returns [EObject current=null] : iv_ruleSubstructureSelector= ruleSubstructureSelector EOF ;
    public final EObject entryRuleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureSelector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2323:2: (iv_ruleSubstructureSelector= ruleSubstructureSelector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2324:2: iv_ruleSubstructureSelector= ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructureSelector_in_entryRuleSubstructureSelector4949);
            iv_ruleSubstructureSelector=ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructureSelector4959); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2334:1: ruleSubstructureSelector returns [EObject current=null] : ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        Token lv_selectorName_1_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2338:28: ( ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2339:1: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2339:1: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2339:2: () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2339:2: ()
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2340:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2345:2: ( (lv_selectorName_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2346:1: (lv_selectorName_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2346:1: (lv_selectorName_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2347:3: lv_selectorName_1_0= RULE_ID
            {
            lv_selectorName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructureSelector5014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_selectorName_1_0, grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureSelectorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"selectorName",
                      		lv_selectorName_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2363:2: (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2363:4: otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleSubstructureSelector5032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2367:1: ( (lv_var_3_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2368:1: (lv_var_3_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2368:1: (lv_var_3_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2369:3: lv_var_3_0= RULE_ID
                    {
                    lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructureSelector5049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_var_3_0, grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubstructureSelectorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"var",
                              		lv_var_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleSubstructureSelector5066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2400:1: entryRuleSubstructure returns [EObject current=null] : iv_ruleSubstructure= ruleSubstructure EOF ;
    public final EObject entryRuleSubstructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2401:2: (iv_ruleSubstructure= ruleSubstructure EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2402:2: iv_ruleSubstructure= ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructure_in_entryRuleSubstructure5108);
            iv_ruleSubstructure=ruleSubstructure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructure5118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2409:1: ruleSubstructure returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSubstructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        EObject lv_childs_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2412:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2413:1: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2413:1: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2413:2: ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2413:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_JDOC) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2414:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2414:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2415:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleSubstructure5164);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubstructureRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleSubstructure5177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubstructureAccess().getSubstructureKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2435:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2436:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2436:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2437:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstructure5194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSubstructure5211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2457:1: ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID||LA60_0==RULE_JDOC) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2458:1: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2458:1: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2459:3: lv_childs_4_0= ruleSubstructureStyleclass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructure5232);
            	    lv_childs_4_0=ruleSubstructureStyleclass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubstructureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"childs",
            	              		lv_childs_4_0, 
            	              		"SubstructureStyleclass");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSubstructure5245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2487:1: entryRuleSubstructureStyleclass returns [EObject current=null] : iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF ;
    public final EObject entryRuleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureStyleclass = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2488:2: (iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2489:2: iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureStyleclassRule()); 
            }
            pushFollow(FOLLOW_ruleSubstructureStyleclass_in_entryRuleSubstructureStyleclass5281);
            iv_ruleSubstructureStyleclass=ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureStyleclass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstructureStyleclass5291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2496:1: ruleSubstructureStyleclass returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_0_0 = null;

        EObject lv_selectors_3_0 = null;

        EObject lv_childs_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2499:28: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2500:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2500:1: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2500:2: ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2500:2: ( (lv_doku_0_0= ruleDoku ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_JDOC) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2501:1: (lv_doku_0_0= ruleDoku )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2501:1: (lv_doku_0_0= ruleDoku )
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2502:3: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDoku_in_ruleSubstructureStyleclass5337);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                      	        }
                             		set(
                             			current, 
                             			"doku",
                              		lv_doku_0_0, 
                              		"Doku");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2518:3: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2519:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2519:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2520:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstructureStyleclassRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubstructureStyleclass5361);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSubstructureStyleclass5373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2537:1: ( (lv_selectors_3_0= ruleSubstructureSelector ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==EOF||LA62_2==RULE_ID||LA62_2==RULE_JDOC||(LA62_2>=19 && LA62_2<=20)||LA62_2==41) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2538:1: (lv_selectors_3_0= ruleSubstructureSelector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2538:1: (lv_selectors_3_0= ruleSubstructureSelector )
            	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2539:3: lv_selectors_3_0= ruleSubstructureSelector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubstructureSelector_in_ruleSubstructureStyleclass5394);
            	    lv_selectors_3_0=ruleSubstructureSelector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"selectors",
            	              		lv_selectors_3_0, 
            	              		"SubstructureSelector");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2555:3: (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2555:5: otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSubstructureStyleclass5408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2559:1: ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID||LA63_0==RULE_JDOC) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2560:1: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2560:1: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:2561:3: lv_childs_5_0= ruleSubstructureStyleclass
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructureStyleclass5429);
                    	    lv_childs_5_0=ruleSubstructureStyleclass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"childs",
                    	              		lv_childs_5_0, 
                    	              		"SubstructureStyleclass");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleSubstructureStyleclass5442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubstructureStyleclass"

    // $ANTLR start synpred1_InternalCssExtDsl
    public final void synpred1_InternalCssExtDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:219:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.css.cssext/src-gen/at/bestsolution/efxclipse/tooling/css/cssext/parser/antlr/internal/InternalCssExtDsl.g:220:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred1_InternalCssExtDsl467); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCssExtDsl

    // Delegated rules

    public final boolean synpred1_InternalCssExtDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssExtDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA7_eotS =
        "\11\uffff";
    static final String DFA7_eofS =
        "\11\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\4\1\20\1\uffff\1\4\2\uffff\1\20";
    static final String DFA7_maxS =
        "\1\24\1\uffff\1\22\1\43\1\uffff\1\4\2\uffff\1\43";
    static final String DFA7_acceptS =
        "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String DFA7_specialS =
        "\11\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\uffff\1\2\13\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3\1\4\14\uffff\1\4",
            "\1\5\2\uffff\1\7\10\uffff\1\7\1\uffff\1\7\4\uffff\1\6",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\7\10\uffff\1\7\1\uffff\1\7\4\uffff\1\6"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 351:1: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*";
        }
    }
    static final String DFA27_eotS =
        "\10\uffff";
    static final String DFA27_eofS =
        "\2\uffff\2\4\4\uffff";
    static final String DFA27_minS =
        "\1\6\1\5\2\4\1\uffff\1\5\2\uffff";
    static final String DFA27_maxS =
        "\2\33\2\53\1\uffff\1\33\2\uffff";
    static final String DFA27_acceptS =
        "\4\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA27_specialS =
        "\10\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\16\uffff\1\2\3\uffff\1\3\2\4",
            "\1\5\17\uffff\1\2\3\uffff\1\3\2\4",
            "\4\4\2\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\6\1\uffff\4\4\1"+
            "\uffff\1\4\1\uffff\3\4\2\uffff\10\4",
            "\4\4\2\uffff\1\4\6\uffff\1\4\3\uffff\1\4\1\7\1\uffff\4\4\1"+
            "\uffff\1\4\1\uffff\3\4\2\uffff\10\4",
            "",
            "\1\5\17\uffff\1\2\3\uffff\1\3\2\4",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "518:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( ( ( (lv_doku_26_0= ruleDoku ) ) (this_WS_27= RULE_WS )* )? ( ( ( (lv_type_28_0= '@INT' ) ) (this_WS_29= RULE_WS )* ) | ( ( (lv_type_30_0= '@NUM' ) ) (this_WS_31= RULE_WS )* ) | ( ( (lv_type_32_0= '@STRING' ) ) (this_WS_33= RULE_WS )* ) | ( ( (lv_type_34_0= '@URL' ) ) (this_WS_35= RULE_WS )* ) ) ) )";
        }
    }
    static final String DFA51_eotS =
        "\12\uffff";
    static final String DFA51_eofS =
        "\12\uffff";
    static final String DFA51_minS =
        "\2\4\7\uffff\1\4";
    static final String DFA51_maxS =
        "\2\53\7\uffff\1\53";
    static final String DFA51_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA51_specialS =
        "\12\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\4\1\uffff\1\1\1\10\2\uffff\1\7\12\uffff\1\6\3\uffff\3\6\1"+
            "\uffff\1\5\3\uffff\1\2\7\uffff\1\3\1\uffff\1\5",
            "\1\4\1\11\17\uffff\1\6\3\uffff\3\6\1\uffff\1\5\3\uffff\1\2"+
            "\11\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\11\17\uffff\1\6\3\uffff\3\6\1\uffff\1\5\3\uffff\1\2"+
            "\11\uffff\1\5"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "1921:1: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleCssExtension_in_entryRuleCssExtension75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssExtension85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCssExtension131 = new BitSet(new long[]{0x0000000000048042L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_ruleCssExtension153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName448 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard605 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildCard637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_entryRulePackageDefinition679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDefinition689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePackageDefinition736 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePackageDefinition748 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_rulePackageDefinition763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDefinition784 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePackageDefinition796 = new BitSet(new long[]{0x0000000000140050L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_rulePackageDefinition818 = new BitSet(new long[]{0x0000000000140050L});
    public static final BitSet FOLLOW_rulePackageDefinition_in_rulePackageDefinition845 = new BitSet(new long[]{0x0000000000140050L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rulePackageDefinition872 = new BitSet(new long[]{0x0000000000140050L});
    public static final BitSet FOLLOW_20_in_rulePackageDefinition886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_entryRuleDoku922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoku932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JDOC_in_ruleDoku973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_entryRuleCSSBaseType1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSBaseType1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_ruleCSSBaseType1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSType_in_entryRuleCSSType1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSType1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1194 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1206 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1227 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1252 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1264 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1282 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1299 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1312 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1324 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSType1342 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1359 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1411 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1423 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1444 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSType1469 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1481 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1499 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1516 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleCSSType1529 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1541 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSType1559 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1576 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleCSSType1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSType1619 = new BitSet(new long[]{0x000000000E200020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1631 = new BitSet(new long[]{0x000000000E200020L});
    public static final BitSet FOLLOW_21_in_ruleCSSType1654 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1679 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25_in_ruleCSSType1706 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1731 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26_in_ruleCSSType1758 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1783 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_27_in_ruleCSSType1810 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSType1835 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition1879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleElementDefinition1944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition1966 = new BitSet(new long[]{0x0000000050080000L});
    public static final BitSet FOLLOW_28_in_ruleElementDefinition1979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition2002 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_29_in_ruleElementDefinition2015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleElementDefinition2038 = new BitSet(new long[]{0x0000000060080000L});
    public static final BitSet FOLLOW_30_in_ruleElementDefinition2055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementDefinition2072 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleElementDefinition2091 = new BitSet(new long[]{0x0000100000100250L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleElementDefinition2113 = new BitSet(new long[]{0x0000100000100250L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_ruleElementDefinition2140 = new BitSet(new long[]{0x0000100000100250L});
    public static final BitSet FOLLOW_ruleSubstructure_in_ruleElementDefinition2167 = new BitSet(new long[]{0x0000100000100250L});
    public static final BitSet FOLLOW_20_in_ruleElementDefinition2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition2217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePropertyDefinition2282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyDefinition2304 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_rulePropertyDefinition2325 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyDefinition2338 = new BitSet(new long[]{0x00000000000009D0L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_rulePropertyDefinition2359 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePropertyDefinition2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassDefinition_in_entryRulePseudoClassDefinition2409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassDefinition2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_rulePseudoClassDefinition2474 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_PSEUDO_in_rulePseudoClassDefinition2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_entryRuleCSSRuleRef2539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRef2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleRef2600 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleRef2612 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleCSSRuleRef2627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleRef2650 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCSSRuleRef2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleDefinition_in_entryRuleCSSRuleDefinition2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleDefinition2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleDefinition2777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCSSRuleDefinition2799 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCSSRuleDefinition2811 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleDefinition2833 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_ruleCSSRuleDefinition2860 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCSSRuleDefinition2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleFunc_in_entryRuleCSSRuleFunc2919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleFunc2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCSSRuleFunc2988 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCSSRuleFunc3000 = new BitSet(new long[]{0x00000A022E2004F0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleFunc3012 = new BitSet(new long[]{0x00000A022E2004F0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleFunc3034 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCSSRuleFunc3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_entryRuleCSSRuleOr3092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleOr3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3153 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleCSSRuleOr3175 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_ruleCSSRuleOr3196 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleXor_in_entryRuleCSSRuleXor3246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleXor3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3307 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleCSSRuleXor3329 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_ruleCSSRuleXor3350 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcat_in_entryRuleCSSRuleConcat3400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcat3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3461 = new BitSet(new long[]{0x00000A022E2004D2L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_ruleCSSRuleConcat3491 = new BitSet(new long[]{0x00000A022E2004D2L});
    public static final BitSet FOLLOW_ruleCSSRuleConcatWithoutSpace_in_entryRuleCSSRuleConcatWithoutSpace3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleConcatWithoutSpace3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3601 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleCSSRuleConcatWithoutSpace3623 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_ruleCSSRuleConcatWithoutSpace3644 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePostfix_in_entryRuleCSSRulePostfix3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePostfix3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_ruleCSSRulePostfix3755 = new BitSet(new long[]{0x0000018000020002L});
    public static final BitSet FOLLOW_17_in_ruleCSSRulePostfix3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCSSRulePostfix3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCSSRulePostfix3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_entryRuleCSSRuleBracket3906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleBracket3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCSSRuleBracket3966 = new BitSet(new long[]{0x00000A022E2004D0L});
    public static final BitSet FOLLOW_ruleCSSRuleOr_in_ruleCSSRuleBracket3987 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCSSRuleBracket3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRulePrimary_in_entryRuleCSSRulePrimary4045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRulePrimary4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRef_in_ruleCSSRulePrimary4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleBracket_in_ruleCSSRulePrimary4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSRulePrimary4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_ruleCSSRulePrimary4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSBaseType_in_ruleCSSRulePrimary4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_ruleCSSRulePrimary4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSRulePrimary4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleRegex_in_entryRuleCSSRuleRegex4325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleRegex4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_ruleCSSRuleRegex4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_entryRuleCSSRuleLiteral4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleLiteral4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleLiteral4501 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleLiteral4513 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCSSRuleLiteral4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleSymbol_in_entryRuleCSSRuleSymbol4574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSRuleSymbol4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleCSSRuleSymbol4640 = new BitSet(new long[]{0x0000080020000020L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleCSSRuleSymbol4652 = new BitSet(new long[]{0x0000080020000020L});
    public static final BitSet FOLLOW_29_in_ruleCSSRuleSymbol4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCSSRuleSymbol4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSDefaultValue_in_entryRuleCSSDefaultValue4756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSSDefaultValue4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSSRuleLiteral_in_ruleCSSDefaultValue4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCSSDefaultValue4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCSSDefaultValue4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSSDefaultValue4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructureSelector_in_entryRuleSubstructureSelector4949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructureSelector4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructureSelector5014 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleSubstructureSelector5032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructureSelector5049 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSubstructureSelector5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructure_in_entryRuleSubstructure5108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructure5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleSubstructure5164 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSubstructure5177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstructure5194 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSubstructure5211 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructure5232 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_20_in_ruleSubstructure5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_entryRuleSubstructureStyleclass5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstructureStyleclass5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoku_in_ruleSubstructureStyleclass5337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubstructureStyleclass5361 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSubstructureStyleclass5373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSubstructureSelector_in_ruleSubstructureStyleclass5394 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_19_in_ruleSubstructureStyleclass5408 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleSubstructureStyleclass_in_ruleSubstructureStyleclass5429 = new BitSet(new long[]{0x0000000000100050L});
    public static final BitSet FOLLOW_20_in_ruleSubstructureStyleclass5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalCssExtDsl467 = new BitSet(new long[]{0x0000000000000002L});

}