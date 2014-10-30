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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RICH_TEXT", "RULE_RICH_TEXT_START", "RULE_RICH_TEXT_END", "RULE_RICH_TEXT_INBETWEEN", "RULE_STRING", "RULE_IN_RICH_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'package'", "'bundle'", "'default'", "'formatter'", "'('", "','", "')'", "'['", "']'", "':'", "'.'", "'ANY'", "'NUMBER'", "'DATE'", "'TEMPORAL'"
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:185:1: ruleNLSBundle returns [EObject current=null] : (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ otherlv_7= '}' ) ;
    public final EObject ruleNLSBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_lang_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_formatterList_5_0 = null;

        EObject lv_messageEntryList_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:188:28: ( (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ otherlv_7= '}' ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:1: (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ otherlv_7= '}' )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:1: (otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ otherlv_7= '}' )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:189:3: otherlv_0= 'bundle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'default' ( (lv_lang_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_formatterList_5_0= ruleNLSFormatter ) )* ( (lv_messageEntryList_6_0= ruleMessageEntry ) )+ otherlv_7= '}'
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

                if ( (LA3_0==21) ) {
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleNLSBundle489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_7());
                  
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:285:1: entryRuleNLSFormatter returns [EObject current=null] : iv_ruleNLSFormatter= ruleNLSFormatter EOF ;
    public final EObject entryRuleNLSFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNLSFormatter = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:286:2: (iv_ruleNLSFormatter= ruleNLSFormatter EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:287:2: iv_ruleNLSFormatter= ruleNLSFormatter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNLSFormatterRule()); 
            }
            pushFollow(FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter525);
            iv_ruleNLSFormatter=ruleNLSFormatter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNLSFormatter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNLSFormatter535); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:294:1: ruleNLSFormatter returns [EObject current=null] : (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNLSFormatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_classRef_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:297:28: ( (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:298:1: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:298:1: (otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:298:3: otherlv_0= 'formatter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_classRef_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNLSFormatter572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:303:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:303:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNLSFormatter589); if (state.failed) return current;
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

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:320:2: ( (lv_classRef_2_0= ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:321:1: (lv_classRef_2_0= ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:321:1: (lv_classRef_2_0= ruleQualifiedName )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:322:3: lv_classRef_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNLSFormatter615);
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:346:1: entryRuleMessageEntry returns [EObject current=null] : iv_ruleMessageEntry= ruleMessageEntry EOF ;
    public final EObject entryRuleMessageEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageEntry = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:347:2: (iv_ruleMessageEntry= ruleMessageEntry EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:348:2: iv_ruleMessageEntry= ruleMessageEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageEntryRule()); 
            }
            pushFollow(FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry651);
            iv_ruleMessageEntry=ruleMessageEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageEntry661); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:355:1: ruleMessageEntry returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) ) ;
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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:358:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )? ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:360:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:360:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:361:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageEntry703); if (state.failed) return current;
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

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:377:2: (otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:377:4: otherlv_1= '(' ( (lv_paramList_2_0= ruleMessageParam ) ) (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMessageEntry721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:381:1: ( (lv_paramList_2_0= ruleMessageParam ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:382:1: (lv_paramList_2_0= ruleMessageParam )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:382:1: (lv_paramList_2_0= ruleMessageParam )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:383:3: lv_paramList_2_0= ruleMessageParam
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMessageParam_in_ruleMessageEntry742);
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

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:399:2: (otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:399:4: otherlv_3= ',' ( (lv_paramList_4_0= ruleMessageParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleMessageEntry755); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:403:1: ( (lv_paramList_4_0= ruleMessageParam ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:404:1: (lv_paramList_4_0= ruleMessageParam )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:404:1: (lv_paramList_4_0= ruleMessageParam )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:405:3: lv_paramList_4_0= ruleMessageParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMessageParam_in_ruleMessageEntry776);
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleMessageEntry790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:425:3: ( (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' ) | (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:425:4: (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:425:4: (otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:425:6: otherlv_6= '{' ( (lv_messageList_7_0= ruleMessage ) ) (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMessageEntry806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:429:1: ( (lv_messageList_7_0= ruleMessage ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:430:1: (lv_messageList_7_0= ruleMessage )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:430:1: (lv_messageList_7_0= ruleMessage )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:431:3: lv_messageList_7_0= ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMessage_in_ruleMessageEntry827);
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

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:447:2: (otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:447:4: otherlv_8= ',' ( (lv_messageList_9_0= ruleMessage ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleMessageEntry840); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:451:1: ( (lv_messageList_9_0= ruleMessage ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:452:1: (lv_messageList_9_0= ruleMessage )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:452:1: (lv_messageList_9_0= ruleMessage )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:453:3: lv_messageList_9_0= ruleMessage
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleMessageEntry861);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleMessageEntry875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:474:6: (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:474:6: (otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:474:8: otherlv_11= '[' ( ( ruleQualifiedName ) ) otherlv_13= ']'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleMessageEntry895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0());
                          
                    }
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:478:1: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:479:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:479:1: ( ruleQualifiedName )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:480:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMessageEntryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMessageEntry918);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleMessageEntry930); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:505:1: entryRuleMessageParam returns [EObject current=null] : iv_ruleMessageParam= ruleMessageParam EOF ;
    public final EObject entryRuleMessageParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageParam = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:506:2: (iv_ruleMessageParam= ruleMessageParam EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:507:2: iv_ruleMessageParam= ruleMessageParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageParamRule()); 
            }
            pushFollow(FOLLOW_ruleMessageParam_in_entryRuleMessageParam968);
            iv_ruleMessageParam=ruleMessageParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessageParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageParam978); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:514:1: ruleMessageParam returns [EObject current=null] : ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMessageParam() throws RecognitionException {
        EObject current = null;

        Token lv_var_1_0=null;
        Enumerator lv_predefined_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:517:28: ( ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:518:1: ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:518:1: ( ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:518:2: ( (lv_predefined_0_0= rulePredefinedTypes ) ) ( (lv_var_1_0= RULE_ID ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:518:2: ( (lv_predefined_0_0= rulePredefinedTypes ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:519:1: (lv_predefined_0_0= rulePredefinedTypes )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:519:1: (lv_predefined_0_0= rulePredefinedTypes )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:520:3: lv_predefined_0_0= rulePredefinedTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePredefinedTypes_in_ruleMessageParam1024);
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

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:536:2: ( (lv_var_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:537:1: (lv_var_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:537:1: (lv_var_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:538:3: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageParam1041); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:562:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:563:2: (iv_ruleMessage= ruleMessage EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:564:2: iv_ruleMessage= ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage1082);
            iv_ruleMessage=ruleMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMessage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage1092); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:571:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_message_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:574:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_message_2_0= ruleRichString ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:575:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:576:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:576:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:577:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage1134); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMessage1151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:597:1: ( (lv_message_2_0= ruleRichString ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:598:1: (lv_message_2_0= ruleRichString )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:598:1: (lv_message_2_0= ruleRichString )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:599:3: lv_message_2_0= ruleRichString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRichString_in_ruleMessage1172);
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:623:1: entryRuleRichString returns [EObject current=null] : iv_ruleRichString= ruleRichString EOF ;
    public final EObject entryRuleRichString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichString = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:624:2: (iv_ruleRichString= ruleRichString EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:625:2: iv_ruleRichString= ruleRichString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringRule()); 
            }
            pushFollow(FOLLOW_ruleRichString_in_entryRuleRichString1208);
            iv_ruleRichString=ruleRichString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichString1218); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:632:1: ruleRichString returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) ) ;
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
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:635:28: ( ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:1: ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:1: ( ( (lv_expressions_0_0= ruleRichStringLiteral ) ) | ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_RICH_TEXT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_RICH_TEXT_START) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:2: ( (lv_expressions_0_0= ruleRichStringLiteral ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:636:2: ( (lv_expressions_0_0= ruleRichStringLiteral ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:637:1: (lv_expressions_0_0= ruleRichStringLiteral )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:637:1: (lv_expressions_0_0= ruleRichStringLiteral )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:638:3: lv_expressions_0_0= ruleRichStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteral_in_ruleRichString1264);
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
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:655:6: ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:655:6: ( ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:655:7: ( (lv_expressions_1_0= ruleRichStringLiteralStart ) ) ( (lv_expressions_2_0= ruleRichVarPart ) )? ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )* ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:655:7: ( (lv_expressions_1_0= ruleRichStringLiteralStart ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:656:1: (lv_expressions_1_0= ruleRichStringLiteralStart )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:656:1: (lv_expressions_1_0= ruleRichStringLiteralStart )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:657:3: lv_expressions_1_0= ruleRichStringLiteralStart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteralStart_in_ruleRichString1292);
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

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:673:2: ( (lv_expressions_2_0= ruleRichVarPart ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:1: (lv_expressions_2_0= ruleRichVarPart )
                            {
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:674:1: (lv_expressions_2_0= ruleRichVarPart )
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:675:3: lv_expressions_2_0= ruleRichVarPart
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRichVarPart_in_ruleRichString1313);
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

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:691:3: ( ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )? )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_RICH_TEXT_INBETWEEN) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:691:4: ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) ) ( (lv_expressions_4_0= ruleRichVarPart ) )?
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:691:4: ( (lv_expressions_3_0= ruleRichStringLiteralInbetween ) )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:692:1: (lv_expressions_3_0= ruleRichStringLiteralInbetween )
                    	    {
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:692:1: (lv_expressions_3_0= ruleRichStringLiteralInbetween )
                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:693:3: lv_expressions_3_0= ruleRichStringLiteralInbetween
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString1336);
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

                    	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:709:2: ( (lv_expressions_4_0= ruleRichVarPart ) )?
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==RULE_ID) ) {
                    	        alt10=1;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:710:1: (lv_expressions_4_0= ruleRichVarPart )
                    	            {
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:710:1: (lv_expressions_4_0= ruleRichVarPart )
                    	            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:711:3: lv_expressions_4_0= ruleRichVarPart
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleRichVarPart_in_ruleRichString1357);
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
                    	    break loop11;
                        }
                    } while (true);

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:727:5: ( (lv_expressions_5_0= ruleRichStringLiteralEnd ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:728:1: (lv_expressions_5_0= ruleRichStringLiteralEnd )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:728:1: (lv_expressions_5_0= ruleRichStringLiteralEnd )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:729:3: lv_expressions_5_0= ruleRichStringLiteralEnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString1381);
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:753:1: entryRuleRichStringLiteral returns [EObject current=null] : iv_ruleRichStringLiteral= ruleRichStringLiteral EOF ;
    public final EObject entryRuleRichStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteral = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:754:2: (iv_ruleRichStringLiteral= ruleRichStringLiteral EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:755:2: iv_ruleRichStringLiteral= ruleRichStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral1418);
            iv_ruleRichStringLiteral=ruleRichStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteral1428); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:762:1: ruleRichStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT ) ) ;
    public final EObject ruleRichStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:765:28: ( ( (lv_value_0_0= RULE_RICH_TEXT ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:766:1: ( (lv_value_0_0= RULE_RICH_TEXT ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:766:1: ( (lv_value_0_0= RULE_RICH_TEXT ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:767:1: (lv_value_0_0= RULE_RICH_TEXT )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:767:1: (lv_value_0_0= RULE_RICH_TEXT )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:768:3: lv_value_0_0= RULE_RICH_TEXT
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT,FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral1469); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:792:1: entryRuleRichStringLiteralStart returns [EObject current=null] : iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF ;
    public final EObject entryRuleRichStringLiteralStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralStart = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:793:2: (iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:794:2: iv_ruleRichStringLiteralStart= ruleRichStringLiteralStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralStartRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart1509);
            iv_ruleRichStringLiteralStart=ruleRichStringLiteralStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralStart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralStart1519); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:801:1: ruleRichStringLiteralStart returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) ;
    public final EObject ruleRichStringLiteralStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:804:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_START ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:805:1: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:805:1: ( (lv_value_0_0= RULE_RICH_TEXT_START ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:806:1: (lv_value_0_0= RULE_RICH_TEXT_START )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:806:1: (lv_value_0_0= RULE_RICH_TEXT_START )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:807:3: lv_value_0_0= RULE_RICH_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_START,FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart1560); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:831:1: entryRuleRichStringLiteralEnd returns [EObject current=null] : iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF ;
    public final EObject entryRuleRichStringLiteralEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralEnd = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:832:2: (iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:833:2: iv_ruleRichStringLiteralEnd= ruleRichStringLiteralEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralEndRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd1600);
            iv_ruleRichStringLiteralEnd=ruleRichStringLiteralEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralEnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralEnd1610); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:840:1: ruleRichStringLiteralEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) ;
    public final EObject ruleRichStringLiteralEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:843:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_END ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:844:1: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:844:1: ( (lv_value_0_0= RULE_RICH_TEXT_END ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:845:1: (lv_value_0_0= RULE_RICH_TEXT_END )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:845:1: (lv_value_0_0= RULE_RICH_TEXT_END )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:846:3: lv_value_0_0= RULE_RICH_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_END,FOLLOW_RULE_RICH_TEXT_END_in_ruleRichStringLiteralEnd1651); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:870:1: entryRuleRichStringLiteralInbetween returns [EObject current=null] : iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF ;
    public final EObject entryRuleRichStringLiteralInbetween() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichStringLiteralInbetween = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:871:2: (iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:872:2: iv_ruleRichStringLiteralInbetween= ruleRichStringLiteralInbetween EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichStringLiteralInbetweenRule()); 
            }
            pushFollow(FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween1691);
            iv_ruleRichStringLiteralInbetween=ruleRichStringLiteralInbetween();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichStringLiteralInbetween; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween1701); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:879:1: ruleRichStringLiteralInbetween returns [EObject current=null] : ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) ) ;
    public final EObject ruleRichStringLiteralInbetween() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:882:28: ( ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:883:1: ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:883:1: ( (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:884:1: (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:884:1: (lv_value_0_0= RULE_RICH_TEXT_INBETWEEN )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:885:3: lv_value_0_0= RULE_RICH_TEXT_INBETWEEN
            {
            lv_value_0_0=(Token)match(input,RULE_RICH_TEXT_INBETWEEN,FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_ruleRichStringLiteralInbetween1742); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:909:1: entryRuleRichVarPart returns [EObject current=null] : iv_ruleRichVarPart= ruleRichVarPart EOF ;
    public final EObject entryRuleRichVarPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRichVarPart = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:910:2: (iv_ruleRichVarPart= ruleRichVarPart EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:911:2: iv_ruleRichVarPart= ruleRichVarPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRichVarPartRule()); 
            }
            pushFollow(FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart1782);
            iv_ruleRichVarPart=ruleRichVarPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRichVarPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRichVarPart1792); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:918:1: ruleRichVarPart returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? ) ;
    public final EObject ruleRichVarPart() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_format_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:921:28: ( ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:1: ( ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )? )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:2: ( (lv_key_0_0= RULE_ID ) ) ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )?
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:922:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:923:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:923:1: (lv_key_0_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:924:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRichVarPart1834); if (state.failed) return current;
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

            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:940:2: ( ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:940:3: ( (lv_format_1_0= RULE_STRING ) ) ( ( ruleQualifiedName ) )?
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:940:3: ( (lv_format_1_0= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:941:1: (lv_format_1_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:941:1: (lv_format_1_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:942:3: lv_format_1_0= RULE_STRING
                    {
                    lv_format_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRichVarPart1857); if (state.failed) return current;
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

                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:958:2: ( ( ruleQualifiedName ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:959:1: ( ruleQualifiedName )
                            {
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:959:1: ( ruleQualifiedName )
                            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:960:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getRichVarPartRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRichVarPart1885);
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:981:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:982:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:983:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID1925);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID1936); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:990:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:993:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:994:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1975); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1009:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1010:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1011:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2020);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2031); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1018:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1021:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1022:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1022:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1023:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2078);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1033:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) && (synpred1_InternalNLSDsl())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1033:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1033:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1033:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedName2106); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName2129);
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
            	    break loop15;
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
    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1060:1: rulePredefinedTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) ) ;
    public final Enumerator rulePredefinedTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1062:28: ( ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) ) )
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1063:1: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) )
            {
            // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1063:1: ( (enumLiteral_0= 'ANY' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) | (enumLiteral_3= 'TEMPORAL' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            case 32:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1063:2: (enumLiteral_0= 'ANY' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1063:2: (enumLiteral_0= 'ANY' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1063:4: enumLiteral_0= 'ANY'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_rulePredefinedTypes2190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1069:6: (enumLiteral_1= 'NUMBER' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1069:6: (enumLiteral_1= 'NUMBER' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1069:8: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_rulePredefinedTypes2207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1075:6: (enumLiteral_2= 'DATE' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1075:6: (enumLiteral_2= 'DATE' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1075:8: enumLiteral_2= 'DATE'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_rulePredefinedTypes2224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1081:6: (enumLiteral_3= 'TEMPORAL' )
                    {
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1081:6: (enumLiteral_3= 'TEMPORAL' )
                    // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1081:8: enumLiteral_3= 'TEMPORAL'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_rulePredefinedTypes2241); if (state.failed) return current;
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
        // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1033:3: ( '.' )
        // ../org.eclipse.fx.ide.l10n/src-gen/org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.g:1034:2: '.'
        {
        match(input,28,FOLLOW_28_in_synpred1_InternalNLSDsl2097); if (state.failed) return ;

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
    public static final BitSet FOLLOW_16_in_ruleNLSBundle433 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_ruleNLSBundle454 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_ruleNLSBundle476 = new BitSet(new long[]{0x0000000000220010L});
    public static final BitSet FOLLOW_17_in_ruleNLSBundle489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNLSFormatter_in_entryRuleNLSFormatter525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNLSFormatter535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNLSFormatter572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNLSFormatter589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNLSFormatter615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageEntry_in_entryRuleMessageEntry651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageEntry661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageEntry703 = new BitSet(new long[]{0x0000000002410000L});
    public static final BitSet FOLLOW_22_in_ruleMessageEntry721 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleMessageParam_in_ruleMessageEntry742 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleMessageEntry755 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleMessageParam_in_ruleMessageEntry776 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleMessageEntry790 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleMessageEntry806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageEntry827 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_23_in_ruleMessageEntry840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessageEntry861 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_17_in_ruleMessageEntry875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMessageEntry895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageEntry918 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMessageEntry930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParam_in_entryRuleMessageParam968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageParam978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefinedTypes_in_ruleMessageParam1024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageParam1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage1134 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMessage1151 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleRichString_in_ruleMessage1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichString_in_entryRuleRichString1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichString1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_ruleRichString1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_ruleRichString1292 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_ruleRichString1313 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_ruleRichString1336 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_ruleRichString1357 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_ruleRichString1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteral_in_entryRuleRichStringLiteral1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteral1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_in_ruleRichStringLiteral1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralStart_in_entryRuleRichStringLiteralStart1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralStart1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_START_in_ruleRichStringLiteralStart1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralEnd_in_entryRuleRichStringLiteralEnd1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralEnd1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_END_in_ruleRichStringLiteralEnd1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichStringLiteralInbetween_in_entryRuleRichStringLiteralInbetween1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichStringLiteralInbetween1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RICH_TEXT_INBETWEEN_in_ruleRichStringLiteralInbetween1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRichVarPart_in_entryRuleRichVarPart1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRichVarPart1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRichVarPart1834 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRichVarPart1857 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRichVarPart1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2078 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedName2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName2129 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29_in_rulePredefinedTypes2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePredefinedTypes2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePredefinedTypes2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePredefinedTypes2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred1_InternalNLSDsl2097 = new BitSet(new long[]{0x0000000000000002L});

}