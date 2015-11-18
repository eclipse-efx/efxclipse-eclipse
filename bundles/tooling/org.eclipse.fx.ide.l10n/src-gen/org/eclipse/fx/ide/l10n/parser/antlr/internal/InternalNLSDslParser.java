package org.eclipse.fx.ide.l10n.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.fx.ide.l10n.services.NLSDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNLSDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", "RULE_RICH_TEXT_INBETWEEN", "RULE_STRING", "RULE_IN_RICH_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'package'", "'bundle'", "'default'", "'included-bundles'", "','", "'formatter'", "'('", "')'", "'['", "']'", "':'", "'.'", "'ANY'", "'NUMBER'", "'DATE'", "'TEMPORAL'"
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
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g"; }



     	private NLSDslGrammarAccess grammarAccess;
     	
        public InternalNLSDslParser(TokenStream input, NLSDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NLS";	
       	}
       	
       	@Override
       	protected NLSDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNLS"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:68:1: entryRuleNLS returns [EObject current=null] : iv_ruleNLS= ruleNLS EOF ;
    public final EObject entryRuleNLS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLS = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:69:2: (iv_ruleNLS= ruleNLS EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:70:2: iv_ruleNLS= ruleNLS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNLSRule()); 
            }
            pushFollow(FOLLOW_ruleNLS_in_entryRuleNLS75);
            iv_ruleNLS=ruleNLS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNLS; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLS85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNLS"


    // $ANTLR start "ruleNLS"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:77:1: ruleNLS returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) )? otherlv_1= '{' ( (lv_bundleList_2_0= ruleNLSBundle ) )+ otherlv_3= '}' ) ;
    public final EObject ruleNLS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_package_0_0 = null;

        EObject lv_bundleList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:80:28: ( ( ( (lv_package_0_0= rulePackageDeclaration ) )? otherlv_1= '{' ( (lv_bundleList_2_0= ruleNLSBundle ) )+ otherlv_3= '}' ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:81:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? otherlv_1= '{' ( (lv_bundleList_2_0= ruleNLSBundle ) )+ otherlv_3= '}' )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:81:1: ( ( (lv_package_0_0= rulePackageDeclaration ) )? otherlv_1= '{' ( (lv_bundleList_2_0= ruleNLSBundle ) )+ otherlv_3= '}' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:81:2: ( (lv_package_0_0= rulePackageDeclaration ) )? otherlv_1= '{' ( (lv_bundleList_2_0= ruleNLSBundle ) )+ otherlv_3= '}'
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:81:2: ( (lv_package_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:82:1: (lv_package_0_0= rulePackageDeclaration )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:82:1: (lv_package_0_0= rulePackageDeclaration )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:83:3: lv_package_0_0= rulePackageDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleNLS131);
                    lv_package_0_0=rulePackageDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNLSRule());
                      	        }
                             		set(
                             			current, 
                             			"package",
                              		lv_package_0_0, 
                              		"PackageDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleNLS144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNLSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:103:1: ( (lv_bundleList_2_0= ruleNLSBundle ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:104:1: (lv_bundleList_2_0= ruleNLSBundle )
            	    {
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:104:1: (lv_bundleList_2_0= ruleNLSBundle )
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:105:3: lv_bundleList_2_0= ruleNLSBundle
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNLSBundle_in_ruleNLS165);
            	    lv_bundleList_2_0=ruleNLSBundle();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNLSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bundleList",
            	              		lv_bundleList_2_0, 
            	              		"NLSBundle");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNLS178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNLSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleNLS"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:133:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:134:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:135:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration214);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration224); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:142:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:145:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:146:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:146:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:146:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePackageDeclaration261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:150:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:151:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:151:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:152:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration282);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleNLSBundle"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:176:1: entryRuleNLSBundle returns [EObject current=null] : iv_ruleNLSBundle= ruleNLSBundle EOF ;
    public final EObject entryRuleNLSBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLSBundle = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:177:2: (iv_ruleNLSBundle= ruleNLSBundle EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:178:2: iv_ruleNLSBundle= ruleNLSBundle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNLSBundleRule()); 
            }
            pushFollow(FOLLOW_ruleNLSBundle_in_entryRuleNLSBundle318);
            iv_ruleNLSBundle=ruleNLSBundle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNLSBundle; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLSBundle328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNLSBundle"


    // $ANTLR start "ruleNLSBundle"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:185:1: ruleNLSBundle returns [EObject current=null] : (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleNLSBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lang_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_formatterList_5_0 = null;

        EObject lv_messageEntryList_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:188:28: ( (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '}' ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:1: (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '}' )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:1: (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '}' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:3: otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNLSBundle365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNLSBundleAccess().getBundleKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:194:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:194:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNLSBundle382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNLSBundleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleNLSBundle399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNLSBundleAccess().getDefaultKeyword_2());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:215:1: ( (lv_lang_3_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:216:1: (lv_lang_3_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:216:1: (lv_lang_3_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:217:3: lv_lang_3_0= RULE_ID
            {
            lv_lang_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNLSBundle416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lang_3_0, grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNLSBundleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lang",
                      		lv_lang_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleNLSBundle433); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNLSBundleAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:237:1: ( (lv_formatterList_5_0= ruleNLSFormatter ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:238:1: (lv_formatterList_5_0= ruleNLSFormatter )
            	    {
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:238:1: (lv_formatterList_5_0= ruleNLSFormatter )
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:239:3: lv_formatterList_5_0= ruleNLSFormatter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNLSFormatter_in_ruleNLSBundle454);
            	    lv_formatterList_5_0=ruleNLSFormatter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNLSBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formatterList",
            	              		lv_formatterList_5_0, 
            	              		"NLSFormatter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:255:3: ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:256:1: (lv_messageEntryList_6_0= ruleMessageEntry )
            	    {
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:256:1: (lv_messageEntryList_6_0= ruleMessageEntry )
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:257:3: lv_messageEntryList_6_0= ruleMessageEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMessageEntry_in_ruleNLSBundle476);
            	    lv_messageEntryList_6_0=ruleMessageEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNLSBundleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"messageEntryList",
            	              		lv_messageEntryList_6_0, 
            	              		"MessageEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:273:3: (otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:273:5: otherlv_7= 'included-bundles' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleNLSBundle490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNLSBundleAccess().getIncludedBundlesKeyword_7_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:277:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:278:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:278:1: ( ruleQualifiedName )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:279:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getNLSBundleRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNLSBundle513);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:292:2: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:292:4: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleNLSBundle526); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getNLSBundleAccess().getCommaKeyword_7_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:296:1: ( ( ruleQualifiedName ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:297:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:297:1: ( ruleQualifiedName )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:298:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getNLSBundleRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNLSBundleAccess().getIncludedBundleListNLSBundleCrossReference_7_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNLSBundle549);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleNLSBundle565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleNLSBundle"


    // $ANTLR start "entryRuleNLSFormatter"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:323:1: entryRuleNLSFormatter returns [EObject current=null] : iv_ruleNLSFormatter= ruleNLSFormatter EOF ;
    public final EObject entryRuleNLSFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLSFormatter = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:324:2: (iv_ruleNLSFormatter= ruleNLSFormatter EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:325:2: iv_ruleNLSFormatter= ruleNLSFormatter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNLSFormatterRule()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter601);
            iv_ruleNLSFormatter=ruleNLSFormatter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNLSFormatter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLSFormatter611); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNLSFormatter"


    // $ANTLR start "ruleNLSFormatter"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:332:1: ruleNLSFormatter returns [EObject current=null] : (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNLSFormatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_classRef_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:335:28: ( (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:336:1: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:336:1: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:336:3: otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNLSFormatter648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:340:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:341:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:341:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNLSFormatter665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNLSFormatterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:358:2: ( (lv_classRef_2_0= ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:1: (lv_classRef_2_0= ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:1: (lv_classRef_2_0= ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:360:3: lv_classRef_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNLSFormatter691);
            lv_classRef_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNLSFormatterRule());
              	        }
                     		set(
                     			current, 
                     			"classRef",
                      		lv_classRef_2_0, 
                      		"QualifiedName");
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
    // $ANTLR end "ruleNLSFormatter"


    // $ANTLR start "entryRuleMessageEntry"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:384:1: entryRuleMessageEntry returns [EObject current=null] : iv_ruleMessageEntry= ruleMessageEntry EOF ;
    public final EObject entryRuleMessageEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageEntry = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:385:2: (iv_ruleMessageEntry= ruleMessageEntry EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:386:2: iv_ruleMessageEntry= ruleMessageEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageEntryRule()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry727);
            iv_ruleMessageEntry=ruleMessageEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageEntry737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessageEntry"


    // $ANTLR start "ruleMessageEntry"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:393:1: ruleMessageEntry returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) ) ;
    public final EObject ruleMessageEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_paramList_2_0 = null;

        EObject lv_paramList_4_0 = null;

        EObject lv_messageList_7_0 = null;

        EObject lv_messageList_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:396:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:397:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:397:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:397:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:397:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:398:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:398:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:399:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageEntry779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageEntryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:415:2: (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:415:4: otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMessageEntry797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:419:1: ( (lv_paramList_2_0= ruleMessageParam ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:420:1: (lv_paramList_2_0= ruleMessageParam )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:420:1: (lv_paramList_2_0= ruleMessageParam )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:421:3: lv_paramList_2_0= ruleMessageParam
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMessageParam_in_ruleMessageEntry818);
                    lv_paramList_2_0=ruleMessageParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMessageEntryRule());
                      	        }
                             		add(
                             			current, 
                             			"paramList",
                              		lv_paramList_2_0, 
                              		"MessageParam");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:437:2: (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:437:4: otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMessageEntry831); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:441:1: ( (lv_paramList_4_0= ruleMessageParam ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:442:1: (lv_paramList_4_0= ruleMessageParam )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:442:1: (lv_paramList_4_0= ruleMessageParam )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:443:3: lv_paramList_4_0= ruleMessageParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMessageParam_in_ruleMessageEntry852);
                    	    lv_paramList_4_0=ruleMessageParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMessageEntryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramList",
                    	              		lv_paramList_4_0, 
                    	              		"MessageParam");
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

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleMessageEntry866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:463:3: ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:463:4: (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:463:4: (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:463:6: otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMessageEntry882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:467:1: ( (lv_messageList_7_0= ruleMessage ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:468:1: (lv_messageList_7_0= ruleMessage )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:468:1: (lv_messageList_7_0= ruleMessage )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:469:3: lv_messageList_7_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageEntry903);
                    lv_messageList_7_0=ruleMessage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMessageEntryRule());
                      	        }
                             		add(
                             			current, 
                             			"messageList",
                              		lv_messageList_7_0, 
                              		"Message");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:485:2: (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:485:4: otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleMessageEntry916); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:489:1: ( (lv_messageList_9_0= ruleMessage ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:490:1: (lv_messageList_9_0= ruleMessage )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:490:1: (lv_messageList_9_0= ruleMessage )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:491:3: lv_messageList_9_0= ruleMessage
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleMessageEntry937);
                    	    lv_messageList_9_0=ruleMessage();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMessageEntryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"messageList",
                    	              		lv_messageList_9_0, 
                    	              		"Message");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleMessageEntry951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:512:6: (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:512:6: (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:512:8: otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleMessageEntry971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:516:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:517:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:517:1: ( ruleQualifiedName )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:518:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMessageEntryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMessageEntry994);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleMessageEntry1006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_2_1_2());
                          
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
    // $ANTLR end "ruleMessageEntry"


    // $ANTLR start "entryRuleMessageParam"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:543:1: entryRuleMessageParam returns [EObject current=null] : iv_ruleMessageParam= ruleMessageParam EOF ;
    public final EObject entryRuleMessageParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageParam = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:544:2: (iv_ruleMessageParam= ruleMessageParam EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:545:2: iv_ruleMessageParam= ruleMessageParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageParamRule()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_entryRuleMessageParam1044);
            iv_ruleMessageParam=ruleMessageParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageParam1054); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessageParam"


    // $ANTLR start "ruleMessageParam"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:552:1: ruleMessageParam returns [EObject current=null] : ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMessageParam() throws RecognitionException {
        EObject current = null;

        Token lv_var_1_0=null;
        Enumerator lv_predefined_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:555:28: ( ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:556:1: ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:556:1: ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:556:2: ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:556:2: ( (lv_predefined_0_0= rulePredefinedTypes ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:557:1: (lv_predefined_0_0= rulePredefinedTypes )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:557:1: (lv_predefined_0_0= rulePredefinedTypes )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:558:3: lv_predefined_0_0= rulePredefinedTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePredefinedTypes_in_ruleMessageParam1100);
            lv_predefined_0_0=rulePredefinedTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageParamRule());
              	        }
                     		set(
                     			current, 
                     			"predefined",
                      		lv_predefined_0_0, 
                      		"PredefinedTypes");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:574:2: ( (lv_var_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:1: (lv_var_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:1: (lv_var_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:576:3: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageParam1117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var_1_0, grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageParamRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
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
    // $ANTLR end "ruleMessageParam"


    // $ANTLR start "entryRuleMessage"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:600:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:601:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:602:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1158);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:609:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_message_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:612:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:614:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:614:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:615:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMessageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMessage1227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:635:1: ( (lv_message_2_0= ruleRichString ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:1: (lv_message_2_0= ruleRichString )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:1: (lv_message_2_0= ruleRichString )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:637:3: lv_message_2_0= ruleRichString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRichString_in_ruleMessage1248);
            lv_message_2_0=ruleRichString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMessageRule());
              	        }
                     		set(
                     			current, 
                     			"message",
                      		lv_message_2_0, 
                      		"RichString");
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleRichString"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:661:1: entryRuleRichString returns [EObject current=null] : iv_ruleRichString= ruleRichString EOF ;
    public final EObject entryRuleRichString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichString = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:662:2: (iv_ruleRichString= ruleRichString EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:663:2: iv_ruleRichString= ruleRichString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringRule()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_entryRuleRichString1284);
            iv_ruleRichString=ruleRichString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichString1294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichString"


    // $ANTLR start "ruleRichString"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:670:1: ruleRichString returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) ) ;
    public final EObject ruleRichString() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_expressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:673:28: ( ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:1: ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:1: ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_RICH_TEXT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_RICH_TEXT_START) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:2: ( (lv_expressions_0_0= ruleRichStringLiteral ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:2: ( (lv_expressions_0_0= ruleRichStringLiteral ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:675:1: (lv_expressions_0_0= ruleRichStringLiteral )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:675:1: (lv_expressions_0_0= ruleRichStringLiteral )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:676:3: lv_expressions_0_0= ruleRichStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteral_in_ruleRichString1340);
                    lv_expressions_0_0=ruleRichStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_0_0, 
                              		"RichStringLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:693:6: ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:693:6: ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:693:7: ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:693:7: ( (lv_expressions_1_0= ruleRichStringLiteralStart ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:694:1: (lv_expressions_1_0= ruleRichStringLiteralStart )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:694:1: (lv_expressions_1_0= ruleRichStringLiteralStart )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:695:3: lv_expressions_1_0= ruleRichStringLiteralStart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteralStart_in_ruleRichString1368);
                    lv_expressions_1_0=ruleRichStringLiteralStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_1_0, 
                              		"RichStringLiteralStart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:711:2: ( (lv_expressions_2_0= ruleRichVarPart ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:712:1: (lv_expressions_2_0= ruleRichVarPart )
                            {
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:712:1: (lv_expressions_2_0= ruleRichVarPart )
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:713:3: lv_expressions_2_0= ruleRichVarPart
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRichVarPart_in_ruleRichString1389);
                            lv_expressions_2_0=ruleRichVarPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"expressions",
                                      		lv_expressions_2_0, 
                                      		"RichVarPart");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:729:3: ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_RICH_TEXT_INBETWEEN) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:729:4: ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )?
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:729:4: ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:730:1: (lv_expressions_3_0= ruleRichStringLiteralInbetween )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:730:1: (lv_expressions_3_0= ruleRichStringLiteralInbetween )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:731:3: lv_expressions_3_0= ruleRichStringLiteralInbetween
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString1412);
                    	    lv_expressions_3_0=ruleRichStringLiteralInbetween();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_3_0, 
                    	              		"RichStringLiteralInbetween");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:747:2: ( (lv_expressions_4_0= ruleRichVarPart ) )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==RULE_ID) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:748:1: (lv_expressions_4_0= ruleRichVarPart )
                    	            {
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:748:1: (lv_expressions_4_0= ruleRichVarPart )
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:749:3: lv_expressions_4_0= ruleRichVarPart
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleRichVarPart_in_ruleRichString1433);
                    	            lv_expressions_4_0=ruleRichVarPart();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"expressions",
                    	                      		lv_expressions_4_0, 
                    	                      		"RichVarPart");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:765:5: ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:766:1: (lv_expressions_5_0= ruleRichStringLiteralEnd )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:766:1: (lv_expressions_5_0= ruleRichStringLiteralEnd )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:767:3: lv_expressions_5_0= ruleRichStringLiteralEnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString1457);
                    lv_expressions_5_0=ruleRichStringLiteralEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRichStringRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_5_0, 
                              		"RichStringLiteralEnd");
                      	        afterParserOrEnumRuleCall();
                      	    
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
        }
        return current;
    }
    // $ANTLR end "ruleRichString"


    // $ANTLR start "entryRuleRichStringLiteral"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:791:1: entryRuleRichStringLiteral returns [EObject current=null] : iv_ruleRichStringLiteral= ruleRichStringLiteral EOF ;
    public final EObject entryRuleRichStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteral = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:792:2: (iv_ruleRichStringLiteral= ruleRichStringLiteral EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:793:2: iv_ruleRichStringLiteral= ruleRichStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral1494);
            iv_ruleRichStringLiteral=ruleRichStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteral1504); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichStringLiteral"


    // $ANTLR start "ruleRichStringLiteral"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:800:1: ruleRichStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT ) ) ;
    public final EObject ruleRichStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:803:28: ( ( (lv_value_0_0= RULE_RICH_TEXT ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:804:1: ( (lv_value_0_0= RULE_RICH_TEXT ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:804:1: ( (lv_value_0_0= RULE_RICH_TEXT ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:805:1: (lv_value_0_0= RULE_RICH_TEXT )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:805:1: (lv_value_0_0= RULE_RICH_TEXT )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:806:3: lv_value_0_0= RULE_RICH_TEXT
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral1545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRichStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"RICH_TEXT");
              	    
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
    // $ANTLR end "ruleRichStringLiteral"


    // $ANTLR start "entryRuleRichStringLiteralStart"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:830:1: entryRuleRichStringLiteralStart returns [EObject current=null] : iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF ;
    public final EObject entryRuleRichStringLiteralStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralStart = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:831:2: (iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:832:2: iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralStartRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart1585);
            iv_ruleRichStringLiteralStart=ruleRichStringLiteralStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralStart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralStart1595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichStringLiteralStart"


    // $ANTLR start "ruleRichStringLiteralStart"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:839:1: ruleRichStringLiteralStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleRichStringLiteralStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:842:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:843:1: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:843:1: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:844:1: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:844:1: (lv_value_0_0= RULE_RICH_TEXT_START )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:845:3: lv_value_0_0= RULE_RICH_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart1636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRichStringLiteralStartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"RICH_TEXT_START");
              	    
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
    // $ANTLR end "ruleRichStringLiteralStart"


    // $ANTLR start "entryRuleRichStringLiteralEnd"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:869:1: entryRuleRichStringLiteralEnd returns [EObject current=null] : iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF ;
    public final EObject entryRuleRichStringLiteralEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralEnd = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:870:2: (iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:871:2: iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralEndRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd1676);
            iv_ruleRichStringLiteralEnd=ruleRichStringLiteralEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralEnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralEnd1686); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichStringLiteralEnd"


    // $ANTLR start "ruleRichStringLiteralEnd"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:878:1: ruleRichStringLiteralEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleRichStringLiteralEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:881:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:882:1: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:882:1: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:883:1: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:883:1: (lv_value_0_0= RULE_RICH_TEXT_END )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:884:3: lv_value_0_0= RULE_RICH_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_END,FOLLOW_RULE_RICH_TEXT_END_in_ruleRichStringLiteralEnd1727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRichStringLiteralEndRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"RICH_TEXT_END");
              	    
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
    // $ANTLR end "ruleRichStringLiteralEnd"


    // $ANTLR start "entryRuleRichStringLiteralInbetween"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:908:1: entryRuleRichStringLiteralInbetween returns [EObject current=null] : iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF ;
    public final EObject entryRuleRichStringLiteralInbetween() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralInbetween = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:909:2: (iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:910:2: iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralInbetweenRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween1767);
            iv_ruleRichStringLiteralInbetween=ruleRichStringLiteralInbetween();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralInbetween; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween1777); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichStringLiteralInbetween"


    // $ANTLR start "ruleRichStringLiteralInbetween"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:917:1: ruleRichStringLiteralInbetween returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) ) ;
    public final EObject ruleRichStringLiteralInbetween() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:920:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:921:1: ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:921:1: ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:1: (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:1: (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:923:3: lv_value_0_0= RULE_RICH_TEXT_INBETWEEN
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_INBETWEEN,FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_ruleRichStringLiteralInbetween1818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRichStringLiteralInbetweenRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"RICH_TEXT_INBETWEEN");
              	    
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
    // $ANTLR end "ruleRichStringLiteralInbetween"


    // $ANTLR start "entryRuleRichVarPart"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:947:1: entryRuleRichVarPart returns [EObject current=null] : iv_ruleRichVarPart= ruleRichVarPart EOF ;
    public final EObject entryRuleRichVarPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichVarPart = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:948:2: (iv_ruleRichVarPart= ruleRichVarPart EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:949:2: iv_ruleRichVarPart= ruleRichVarPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichVarPartRule()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart1858);
            iv_ruleRichVarPart=ruleRichVarPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichVarPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichVarPart1868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRichVarPart"


    // $ANTLR start "ruleRichVarPart"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:956:1: ruleRichVarPart returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? ) ;
    public final EObject ruleRichVarPart() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_format_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:959:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:960:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:960:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:960:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )?
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:960:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:961:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:961:1: (lv_key_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:962:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRichVarPart1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRichVarPartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:978:2: ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:978:3: ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )?
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:978:3: ( (lv_format_1_0= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:979:1: (lv_format_1_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:979:1: (lv_format_1_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:980:3: lv_format_1_0= RULE_STRING
                    {
                    lv_format_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRichVarPart1933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_1_0, grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRichVarPartRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:996:2: ( ( ruleQualifiedName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:997:1: ( ruleQualifiedName )
                            {
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:997:1: ( ruleQualifiedName )
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:998:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getRichVarPartRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRichVarPart1961);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

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
    // $ANTLR end "ruleRichVarPart"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1019:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1020:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1021:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID2001);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID2012); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1028:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1031:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1032:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID2051); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1047:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1048:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1049:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2096);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2107); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1056:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1059:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1060:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1060:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1061:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2154);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1071:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) && (synpred1_InternalNLSDsl())) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1071:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1071:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1071:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName2182); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2205);
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
            	    break loop17;
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


    // $ANTLR start "rulePredefinedTypes"
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1098:1: rulePredefinedTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) ) ;
    public final Enumerator rulePredefinedTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1100:28: ( ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1101:1: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1101:1: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1101:2: (enumLiteral_0= 'ANY' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1101:2: (enumLiteral_0= 'ANY' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1101:4: enumLiteral_0= 'ANY'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_rulePredefinedTypes2266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1107:6: (enumLiteral_1= 'NUMBER' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1107:6: (enumLiteral_1= 'NUMBER' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1107:8: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_rulePredefinedTypes2283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1113:6: (enumLiteral_2= 'DATE' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1113:6: (enumLiteral_2= 'DATE' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1113:8: enumLiteral_2= 'DATE'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_rulePredefinedTypes2300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1119:6: (enumLiteral_3= 'TEMPORAL' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1119:6: (enumLiteral_3= 'TEMPORAL' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1119:8: enumLiteral_3= 'TEMPORAL'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_33_in_rulePredefinedTypes2317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "rulePredefinedTypes"

    // $ANTLR start synpred1_InternalNLSDsl
    public final void synpred1_InternalNLSDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1071:3: ( '.' )
        // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1072:2: '.'
        {
        match(input,29,FOLLOW_29_in_synpred1_InternalNLSDsl2173); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNLSDsl

    // Delegated rules

    public final boolean synpred1_InternalNLSDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNLSDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleNLS_in_entryRuleNLS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleNLS131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNLS144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_ruleNLS165 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleNLS178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSBundle_in_entryRuleNLSBundle318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLSBundle328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNLSBundle365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNLSBundle382 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNLSBundle399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNLSBundle416 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNLSBundle433 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_ruleNLSBundle454 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_ruleNLSBundle476 = new BitSet(new long[]{0x0000000000A20010L});
    public static final BitSet FOLLOW_21_in_ruleNLSBundle490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNLSBundle513 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleNLSBundle526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNLSBundle549 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleNLSBundle565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLSFormatter611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNLSFormatter648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNLSFormatter665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNLSFormatter691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageEntry737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageEntry779 = new BitSet(new long[]{0x0000000005010000L});
    public static final BitSet FOLLOW_24_in_ruleMessageEntry797 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleMessageParam_in_ruleMessageEntry818 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleMessageEntry831 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleMessageParam_in_ruleMessageEntry852 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_ruleMessageEntry866 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleMessageEntry882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageEntry903 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleMessageEntry916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageEntry937 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleMessageEntry951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMessageEntry971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageEntry994 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessageEntry1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_entryRuleMessageParam1044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageParam1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedTypes_in_ruleMessageParam1100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageParam1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1210 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMessage1227 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleRichString_in_ruleMessage1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_entryRuleRichString1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichString1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_ruleRichString1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_ruleRichString1368 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_ruleRichString1389 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString1412 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_ruleRichString1433 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteral1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralStart1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralEnd1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_END_in_ruleRichStringLiteralEnd1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween1767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_ruleRichStringLiteralInbetween1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichVarPart1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRichVarPart1910 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRichVarPart1933 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRichVarPart1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2154 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName2182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2205 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30_in_rulePredefinedTypes2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePredefinedTypes2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredefinedTypes2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePredefinedTypes2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred1_InternalNLSDsl2173 = new BitSet(new long[]{0x0000000000000002L});

}