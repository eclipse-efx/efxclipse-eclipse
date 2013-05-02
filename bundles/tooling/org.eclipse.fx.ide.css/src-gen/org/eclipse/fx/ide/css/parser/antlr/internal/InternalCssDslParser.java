package org.eclipse.fx.ide.css.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CSSSTRING", "RULE_COLON", "RULE_COMMA", "RULE_WS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_HASHMARK", "RULE_IMPORTANT_SYM", "RULE_PLUS", "RULE_PERCENT", "RULE_DASH", "RULE_UNDERSCORE", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER", "RULE_ONE_INT", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "'@media'", "'@MEDIA'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'.'", "'*'", "'|'", "')'", "'('", "'not('", "'>'", "'~'", "'url('", "'/'", "'?'", "'@'", "'!'", "'$'", "'&'", "'not'", "'no'", "'url'", "'ur'", "'\\\\ '", "'\\\\('", "'\\\\)'", "'\\\\\\''", "'\\\\\"'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=8;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ONE_INT=18;
    public static final int RULE_PERCENT=13;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ONE_NON_HEX_LETTER=17;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_UNDERSCORE=15;
    public static final int RULE_PLUS=12;
    public static final int RULE_ONE_HEX_LETTER=16;
    public static final int RULE_COMMA=6;
    public static final int RULE_HASHMARK=10;
    public static final int RULE_ML_COMMENT=19;
    public static final int RULE_DASHMATCH=9;
    public static final int T__30=30;
    public static final int RULE_COLON=5;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_CSSSTRING=4;
    public static final int RULE_IMPORTANT_SYM=11;
    public static final int RULE_WS=7;
    public static final int RULE_DASH=14;

    // delegates
    // delegators


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g"; }



     	private CssDslGrammarAccess grammarAccess;
     	
        public InternalCssDslParser(TokenStream input, CssDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "stylesheet";	
       	}
       	
       	@Override
       	protected CssDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulestylesheet"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:67:1: entryRulestylesheet returns [EObject current=null] : iv_rulestylesheet= rulestylesheet EOF ;
    public final EObject entryRulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestylesheet = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:68:2: (iv_rulestylesheet= rulestylesheet EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:69:2: iv_rulestylesheet= rulestylesheet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStylesheetRule()); 
            }
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet75);
            iv_rulestylesheet=rulestylesheet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestylesheet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet85); if (state.failed) return current;

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
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:76:1: rulestylesheet returns [EObject current=null] : ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_charset_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_ruleset_2_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_page_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:79:28: ( ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=20 && LA1_0<=21)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:82:3: lv_charset_0_0= rulecharset
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecharset_in_rulestylesheet131);
                    lv_charset_0_0=rulecharset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
                      	        }
                             		set(
                             			current, 
                             			"charset",
                              		lv_charset_0_0, 
                              		"charset");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:98:3: ( (lv_imports_1_0= ruleimportExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=23 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:100:3: lv_imports_1_0= ruleimportExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleimportExpression_in_rulestylesheet153);
            	    lv_imports_1_0=ruleimportExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"importExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:116:3: ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_COLON:
                case RULE_HASHMARK:
                case RULE_DASH:
                case RULE_UNDERSCORE:
                case RULE_ONE_HEX_LETTER:
                case RULE_ONE_NON_HEX_LETTER:
                case 31:
                case 37:
                case 38:
                case 39:
                case 52:
                case 53:
                case 54:
                case 55:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 25:
                case 26:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:118:3: lv_ruleset_2_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulestylesheet176);
            	    lv_ruleset_2_0=ruleruleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ruleset",
            	              		lv_ruleset_2_0, 
            	              		"ruleset");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:137:3: lv_media_3_0= rulemedia
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemedia_in_rulestylesheet203);
            	    lv_media_3_0=rulemedia();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"media",
            	              		lv_media_3_0, 
            	              		"media");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:156:3: lv_page_4_0= rulepage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulepage_in_rulestylesheet230);
            	    lv_page_4_0=rulepage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"page",
            	              		lv_page_4_0, 
            	              		"page");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulecharset"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:180:1: entryRulecharset returns [EObject current=null] : iv_rulecharset= rulecharset EOF ;
    public final EObject entryRulecharset() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharset = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:181:2: (iv_rulecharset= rulecharset EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:182:2: iv_rulecharset= rulecharset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharsetRule()); 
            }
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset268);
            iv_rulecharset=rulecharset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset278); if (state.failed) return current;

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
    // $ANTLR end "entryRulecharset"


    // $ANTLR start "rulecharset"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:189:1: rulecharset returns [EObject current=null] : ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_CSSSTRING ) ) otherlv_3= ';' ) ;
    public final EObject rulecharset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_charset_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:192:28: ( ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_CSSSTRING ) ) otherlv_3= ';' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_CSSSTRING ) ) otherlv_3= ';' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_CSSSTRING ) ) otherlv_3= ';' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_CSSSTRING ) ) otherlv_3= ';'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:193:4: otherlv_0= '@charset'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulecharset316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:198:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_rulecharset334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:202:2: ( (lv_charset_2_0= RULE_CSSSTRING ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_CSSSTRING )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_CSSSTRING )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:204:3: lv_charset_2_0= RULE_CSSSTRING
            {
            lv_charset_2_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_RULE_CSSSTRING_in_rulecharset352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_charset_2_0, grammarAccess.getCharsetAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCharsetRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"charset",
                      		lv_charset_2_0, 
                      		"CSSSTRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulecharset369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:232:1: entryRuleimportExpression returns [EObject current=null] : iv_ruleimportExpression= ruleimportExpression EOF ;
    public final EObject entryRuleimportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportExpression = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:233:2: (iv_ruleimportExpression= ruleimportExpression EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:234:2: iv_ruleimportExpression= ruleimportExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression405);
            iv_ruleimportExpression=ruleimportExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimportExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression415); if (state.failed) return current;

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
    // $ANTLR end "entryRuleimportExpression"


    // $ANTLR start "ruleimportExpression"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:241:1: ruleimportExpression returns [EObject current=null] : ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' ) ;
    public final EObject ruleimportExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_5=null;
        EObject this_URLType_3 = null;

        AntlrDatatypeRuleToken lv_mediaList_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:244:28: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:245:2: (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) ) otherlv_5= ';'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:245:2: (otherlv_0= '@import' | otherlv_1= '@IMPORT' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:245:4: otherlv_0= '@import'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleimportExpression453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:250:7: otherlv_1= '@IMPORT'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleimportExpression471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:254:2: ( ( (lv_value_2_0= RULE_CSSSTRING ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CSSSTRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==45) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:254:3: ( (lv_value_2_0= RULE_CSSSTRING ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:254:3: ( (lv_value_2_0= RULE_CSSSTRING ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_CSSSTRING )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_CSSSTRING )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:256:3: lv_value_2_0= RULE_CSSSTRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_RULE_CSSSTRING_in_ruleimportExpression490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_2_0, grammarAccess.getImportExpressionAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"CSSSTRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:274:5: this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleURLType_in_ruleimportExpression524);
                    this_URLType_3=ruleURLType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_URLType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:282:1: ( (lv_mediaList_4_0= rulemedia_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_DASH && LA6_0<=RULE_ONE_NON_HEX_LETTER)||(LA6_0>=52 && LA6_0<=55)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:284:3: lv_mediaList_4_0= rulemedia_list
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemedia_list_in_ruleimportExpression544);
                            lv_mediaList_4_0=rulemedia_list();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"mediaList",
                                      		lv_mediaList_4_0, 
                                      		"media_list");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleimportExpression559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getImportExpressionAccess().getSemicolonKeyword_2());
                  
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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:312:1: entryRulepage returns [EObject current=null] : iv_rulepage= rulepage EOF ;
    public final EObject entryRulepage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepage = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:313:2: (iv_rulepage= rulepage EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:314:2: iv_rulepage= rulepage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_rulepage_in_entryRulepage595);
            iv_rulepage=rulepage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepage605); if (state.failed) return current;

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
    // $ANTLR end "entryRulepage"


    // $ANTLR start "rulepage"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:321:1: rulepage returns [EObject current=null] : ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) ;
    public final EObject rulepage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_pseudoPage_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_declarations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:324:28: ( ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:325:2: () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )* otherlv_8= '}'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:325:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:326:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPageAccess().getPageAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:331:2: (otherlv_1= '@page' | otherlv_2= '@PAGE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
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
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:331:4: otherlv_1= '@page'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulepage652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:336:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulepage670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:340:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:342:3: lv_pseudoPage_3_0= rulepseudo_page
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepseudo_page_in_rulepage692);
                    lv_pseudoPage_3_0=rulepseudo_page();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"pseudoPage",
                              		lv_pseudoPage_3_0, 
                              		"pseudo_page");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_rulepage705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:362:1: ( (lv_declarations_5_0= rulecss_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS||(LA10_0>=RULE_DASH && LA10_0<=RULE_ONE_NON_HEX_LETTER)||(LA10_0>=52 && LA10_0<=55)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_declaration )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_declaration )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:364:3: lv_declarations_5_0= rulecss_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_declaration_in_rulepage726);
                    lv_declarations_5_0=rulecss_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		add(
                             			current, 
                             			"declarations",
                              		lv_declarations_5_0, 
                              		"css_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:380:3: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:380:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulepage740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	          
            	    }
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:384:1: ( (lv_declarations_7_0= rulecss_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_WS||(LA11_0>=RULE_DASH && LA11_0<=RULE_ONE_NON_HEX_LETTER)||(LA11_0>=52 && LA11_0<=55)) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_declaration )
            	            {
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_declaration )
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:386:3: lv_declarations_7_0= rulecss_declaration
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_declarationParserRuleCall_5_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_rulecss_declaration_in_rulepage761);
            	            lv_declarations_7_0=rulecss_declaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"declarations",
            	                      		lv_declarations_7_0, 
            	                      		"css_declaration");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_rulepage776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:414:1: entryRulepseudo_page returns [String current=null] : iv_rulepseudo_page= rulepseudo_page EOF ;
    public final String entryRulepseudo_page() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepseudo_page = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:415:2: (iv_rulepseudo_page= rulepseudo_page EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:416:2: iv_rulepseudo_page= rulepseudo_page EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudo_pageRule()); 
            }
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page813);
            iv_rulepseudo_page=rulepseudo_page();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulepseudo_page.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page824); if (state.failed) return current;

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
    // $ANTLR end "entryRulepseudo_page"


    // $ANTLR start "rulepseudo_page"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:423:1: rulepseudo_page returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) ;
    public final AntlrDatatypeRuleToken rulepseudo_page() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:426:28: ( (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:427:1: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:427:1: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:427:6: this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulepseudo_page864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getPseudo_pageAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudo_pageAccess().getIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulepseudo_page891);
            this_Identifier_1=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:453:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:454:2: (iv_rulemedia= rulemedia EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:455:2: iv_rulemedia= rulemedia EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia936);
            iv_rulemedia=rulemedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia946); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedia"


    // $ANTLR start "rulemedia"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:462:1: rulemedia returns [EObject current=null] : ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) ;
    public final EObject rulemedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_medialist_2_0 = null;

        EObject lv_rulesets_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:465:28: ( ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:466:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:466:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:466:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:466:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:466:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulemedia984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:471:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulemedia1002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:475:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:476:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:476:1: (lv_medialist_2_0= rulemedia_list )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:477:3: lv_medialist_2_0= rulemedia_list
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1024);
            lv_medialist_2_0=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMediaRule());
              	        }
                     		set(
                     			current, 
                     			"medialist",
                      		lv_medialist_2_0, 
                      		"media_list");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulemedia1036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:497:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COLON||LA14_0==RULE_HASHMARK||(LA14_0>=RULE_DASH && LA14_0<=RULE_ONE_NON_HEX_LETTER)||LA14_0==31||(LA14_0>=37 && LA14_0<=39)||(LA14_0>=52 && LA14_0<=55)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:498:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:498:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:499:3: lv_rulesets_4_0= ruleruleset
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1057);
            	    lv_rulesets_4_0=ruleruleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rulesets",
            	              		lv_rulesets_4_0, 
            	              		"ruleset");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_rulemedia1070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:527:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:528:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:529:2: iv_rulemedia_list= rulemedia_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedia_listRule()); 
            }
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1107);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedia_list.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1118); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedia_list"


    // $ANTLR start "rulemedia_list"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:536:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:539:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:540:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:540:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:541:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1165);
            this_medium_0=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_medium_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:551:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:551:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1186); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1213);
            	    this_medium_2=rulemedium();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_medium_2);
            	          
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
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:577:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:578:2: (iv_rulemedium= rulemedium EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:579:2: iv_rulemedium= rulemedium EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediumRule()); 
            }
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1261);
            iv_rulemedium=rulemedium();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemedium.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1272); if (state.failed) return current;

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
    // $ANTLR end "entryRulemedium"


    // $ANTLR start "rulemedium"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:586:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:589:28: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:591:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMediumAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulemedium1318);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
        }
        return current;
    }
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:609:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:610:2: (iv_ruleruleset= ruleruleset EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:611:2: iv_ruleruleset= ruleruleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1362);
            iv_ruleruleset=ruleruleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleruleset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1372); if (state.failed) return current;

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
    // $ANTLR end "entryRuleruleset"


    // $ANTLR start "ruleruleset"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:618:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' ) ;
    public final EObject ruleruleset() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_COMMA_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_3_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_declarations_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:621:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:622:1: ( ( (lv_selectors_0_0= ruleselector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:622:1: ( ( (lv_selectors_0_0= ruleselector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:622:2: ( (lv_selectors_0_0= ruleselector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:622:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:623:1: (lv_selectors_0_0= ruleselector )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:623:1: (lv_selectors_0_0= ruleselector )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:624:3: lv_selectors_0_0= ruleselector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1418);
            lv_selectors_0_0=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRulesetRule());
              	        }
                     		add(
                     			current, 
                     			"selectors",
                      		lv_selectors_0_0, 
                      		"selector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:640:2: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:640:3: (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:640:3: (this_WS_1= RULE_WS )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_WS) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:640:4: this_WS_1= RULE_WS
            	    	    {
            	    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1431); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_1, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1()); 
            	          
            	    }
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:648:1: ( (lv_selectors_3_0= ruleselector ) )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:649:1: (lv_selectors_3_0= ruleselector )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:649:1: (lv_selectors_3_0= ruleselector )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:650:3: lv_selectors_3_0= ruleselector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1463);
            	    lv_selectors_3_0=ruleselector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"selectors",
            	              		lv_selectors_3_0, 
            	              		"selector");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:666:4: (this_WS_4= RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:666:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleruleset1477); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleruleset1490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:674:1: ( ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_WS||(LA21_0>=RULE_DASH && LA21_0<=RULE_ONE_NON_HEX_LETTER)||(LA21_0>=52 && LA21_0<=55)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:674:2: ( (lv_declarations_6_0= rulecss_declaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )* (otherlv_9= ';' )?
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:674:2: ( (lv_declarations_6_0= rulecss_declaration ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:675:1: (lv_declarations_6_0= rulecss_declaration )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:675:1: (lv_declarations_6_0= rulecss_declaration )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:676:3: lv_declarations_6_0= rulecss_declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1512);
                    lv_declarations_6_0=rulecss_declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
                      	        }
                             		add(
                             			current, 
                             			"declarations",
                              		lv_declarations_6_0, 
                              		"css_declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:692:2: (otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==22) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==RULE_WS||(LA19_1>=RULE_DASH && LA19_1<=RULE_ONE_NON_HEX_LETTER)||(LA19_1>=52 && LA19_1<=55)) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:692:4: otherlv_7= ';' ( (lv_declarations_8_0= rulecss_declaration ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleruleset1525); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:696:1: ( (lv_declarations_8_0= rulecss_declaration ) )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:697:1: (lv_declarations_8_0= rulecss_declaration )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:697:1: (lv_declarations_8_0= rulecss_declaration )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:698:3: lv_declarations_8_0= rulecss_declaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1546);
                    	    lv_declarations_8_0=rulecss_declaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRulesetRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_8_0, 
                    	              		"css_declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:714:4: (otherlv_9= ';' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==22) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:714:6: otherlv_9= ';'
                            {
                            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleruleset1561); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleruleset1577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:730:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:734:2: (iv_ruleselector= ruleselector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:735:2: iv_ruleselector= ruleselector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1619);
            iv_ruleselector=ruleselector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleselector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:745:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) ;
    public final EObject ruleselector() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_3_0 = null;

        AntlrDatatypeRuleToken lv_combinator_5_0 = null;

        EObject lv_selector_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:749:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:750:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:750:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )? )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:750:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:750:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:751:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:751:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:752:3: lv_simpleselectors_0_0= rulesimple_selector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1679);
            lv_simpleselectors_0_0=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectorRule());
              	        }
                     		add(
                     			current, 
                     			"simpleselectors",
                      		lv_simpleselectors_0_0, 
                      		"simple_selector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:768:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:768:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:768:3: ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:768:4: ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:768:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:769:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:769:1: (lv_combinator_1_0= rulecombinator )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:770:3: lv_combinator_1_0= rulecombinator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1702);
                    lv_combinator_1_0=rulecombinator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"combinator",
                              		lv_combinator_1_0, 
                              		"combinator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:786:2: (this_WS_2= RULE_WS )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_WS) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:786:3: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1714); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_2, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:790:3: ( (lv_selector_3_0= ruleselector ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:791:1: (lv_selector_3_0= ruleselector )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:791:1: (lv_selector_3_0= ruleselector )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:792:3: lv_selector_3_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1736);
                    lv_selector_3_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_3_0, 
                              		"selector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:809:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:809:6: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:809:7: (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:809:7: (this_WS_4= RULE_WS )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_WS) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:809:8: this_WS_4= RULE_WS
                    	    {
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1756); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_4, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:813:3: ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_PLUS||(LA25_0>=43 && LA25_0<=44)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:813:4: ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )*
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:813:4: ( (lv_combinator_5_0= rulecombinator ) )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:814:1: (lv_combinator_5_0= rulecombinator )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:814:1: (lv_combinator_5_0= rulecombinator )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:815:3: lv_combinator_5_0= rulecombinator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulecombinator_in_ruleselector1779);
                            lv_combinator_5_0=rulecombinator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"combinator",
                                      		lv_combinator_5_0, 
                                      		"combinator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:831:2: (this_WS_6= RULE_WS )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_WS) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:831:3: this_WS_6= RULE_WS
                            	    {
                            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1791); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_WS_6, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:835:5: ( (lv_selector_7_0= ruleselector ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_selector_7_0= ruleselector )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:836:1: (lv_selector_7_0= ruleselector )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:837:3: lv_selector_7_0= ruleselector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1815);
                    lv_selector_7_0=ruleselector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"selector",
                              		lv_selector_7_0, 
                              		"selector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRuleSimpleSelectorForNegation"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:864:1: entryRuleSimpleSelectorForNegation returns [EObject current=null] : iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF ;
    public final EObject entryRuleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectorForNegation = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:865:2: (iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:866:2: iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1858);
            iv_ruleSimpleSelectorForNegation=ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleSelectorForNegation"


    // $ANTLR start "ruleSimpleSelectorForNegation"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:873:1: ruleSimpleSelectorForNegation returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) ;
    public final EObject ruleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:876:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_DASH && LA30_0<=RULE_ONE_NON_HEX_LETTER)||(LA30_0>=38 && LA30_0<=39)||(LA30_0>=52 && LA30_0<=55)) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_COLON||LA30_0==RULE_HASHMARK||LA30_0==31||LA30_0==37) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt27=2;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:877:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:878:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:878:1: (lv_element_0_0= ruleElementSelector )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:879:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1916);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"element",
                                      		lv_element_0_0, 
                                      		"ElementSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:896:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:896:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:897:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:897:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:898:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1943);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"universal",
                                      		lv_universal_1_0, 
                                      		"UniversalSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:914:3: ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_COLON||LA28_0==RULE_HASHMARK||LA28_0==31||LA28_0==37) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:915:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:915:1: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:916:3: lv_subSelectors_2_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1965);
                    	    lv_subSelectors_2_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_2_0, 
                    	              		"SubSelectorForNegation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:933:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:933:6: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_HASHMARK) && (synpred1_InternalCssDsl())) {
                            alt29=1;
                        }
                        else if ( (LA29_0==37) && (synpred1_InternalCssDsl())) {
                            alt29=1;
                        }
                        else if ( (LA29_0==31) && (synpred1_InternalCssDsl())) {
                            alt29=1;
                        }
                        else if ( (LA29_0==RULE_COLON) && (synpred1_InternalCssDsl())) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:933:7: ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:938:1: (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:939:3: lv_subSelectors_3_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation2004);
                    	    lv_subSelectors_3_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_3_0, 
                    	              		"SubSelectorForNegation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


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
    // $ANTLR end "ruleSimpleSelectorForNegation"


    // $ANTLR start "entryRuleSubSelectorForNegation"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:963:1: entryRuleSubSelectorForNegation returns [EObject current=null] : iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF ;
    public final EObject entryRuleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectorForNegation = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:964:2: (iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:965:2: iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation2041);
            iv_ruleSubSelectorForNegation=ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelectorForNegation2051); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubSelectorForNegation"


    // $ANTLR start "ruleSubSelectorForNegation"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:972:1: ruleSubSelectorForNegation returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final EObject ruleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClass_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:975:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:976:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:976:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt31=1;
                }
                break;
            case 37:
                {
                alt31=2;
                }
                break;
            case 31:
                {
                alt31=3;
                }
                break;
            case RULE_COLON:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:977:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2098);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdSelector_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:987:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2125);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassSelector_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:997:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2152);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeSelector_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1007:5: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2179);
                    this_PseudoClass_3=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClass_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleSubSelectorForNegation"


    // $ANTLR start "entryRulesimple_selector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1023:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1027:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1028:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            }
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector2220);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_selector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector2230); if (state.failed) return current;

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
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1038:1: rulesimple_selector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1042:28: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:1: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_DASH && LA35_0<=RULE_ONE_NON_HEX_LETTER)||(LA35_0>=38 && LA35_0<=39)||(LA35_0>=52 && LA35_0<=55)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_COLON||LA35_0==RULE_HASHMARK||LA35_0==31||LA35_0==37) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:2: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:4: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1043:4: ( (lv_element_0_0= ruleElementSelector ) )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1044:1: (lv_element_0_0= ruleElementSelector )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1044:1: (lv_element_0_0= ruleElementSelector )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1045:3: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleElementSelector_in_rulesimple_selector2282);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"element",
                                      		lv_element_0_0, 
                                      		"ElementSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1062:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1062:6: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1063:1: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1063:1: (lv_universal_1_0= ruleUniversalSelector )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1064:3: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUniversalSelector_in_rulesimple_selector2309);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"universal",
                                      		lv_universal_1_0, 
                                      		"UniversalSelector");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1080:3: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_COLON||LA33_0==RULE_HASHMARK||LA33_0==31||LA33_0==37) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1081:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1081:1: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1082:3: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2331);
                    	    lv_subSelectors_2_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_2_0, 
                    	              		"SubSelector");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1099:6: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1099:6: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_COLON||LA34_0==RULE_HASHMARK||LA34_0==31||LA34_0==37) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1100:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1100:1: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1101:3: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSubSelector_in_rulesimple_selector2360);
                    	    lv_subSelectors_3_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subSelectors",
                    	              		lv_subSelectors_3_0, 
                    	              		"SubSelector");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


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
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleSubSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1128:1: entryRuleSubSelector returns [EObject current=null] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final EObject entryRuleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1129:2: (iv_ruleSubSelector= ruleSubSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1130:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSubSelector_in_entryRuleSubSelector2401);
            iv_ruleSubSelector=ruleSubSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSelector2411); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1137:1: ruleSubSelector returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) ;
    public final EObject ruleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClassOrFunc_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1140:28: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1141:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1141:1: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt36=1;
                }
                break;
            case 37:
                {
                alt36=2;
                }
                break;
            case 31:
                {
                alt36=3;
                }
                break;
            case RULE_COLON:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1142:5: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdSelector_in_ruleSubSelector2458);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdSelector_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1152:5: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSelector_in_ruleSubSelector2485);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassSelector_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1162:5: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeSelector_in_ruleSubSelector2512);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeSelector_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1172:5: this_PseudoClassOrFunc_3= rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2539);
                    this_PseudoClassOrFunc_3=rulePseudoClassOrFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassOrFunc_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1188:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1189:2: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1190:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2574);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSelector2584); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1197:1: ruleAttributeSelector returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1200:28: ( ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1201:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1201:1: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1201:2: () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1201:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1202:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAttributeSelector2630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1211:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1212:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1212:1: (lv_name_2_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1213:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2651);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1229:2: ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INCLUDES && LA39_0<=RULE_DASHMATCH)||(LA39_0>=32 && LA39_0<=35)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1229:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1229:3: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1230:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1230:1: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1231:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1231:1: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt37=6;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt37=1;
                        }
                        break;
                    case 33:
                        {
                        alt37=2;
                        }
                        break;
                    case 34:
                        {
                        alt37=3;
                        }
                        break;
                    case 35:
                        {
                        alt37=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt37=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt37=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1232:3: lv_op_3_1= '^='
                            {
                            lv_op_3_1=(Token)match(input,32,FOLLOW_32_in_ruleAttributeSelector2672); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_1, grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1244:8: lv_op_3_2= '$='
                            {
                            lv_op_3_2=(Token)match(input,33,FOLLOW_33_in_ruleAttributeSelector2701); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_2, grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1256:8: lv_op_3_3= '*='
                            {
                            lv_op_3_3=(Token)match(input,34,FOLLOW_34_in_ruleAttributeSelector2730); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_3, grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1268:8: lv_op_3_4= '='
                            {
                            lv_op_3_4=(Token)match(input,35,FOLLOW_35_in_ruleAttributeSelector2759); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_3_4, grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_3_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1280:8: lv_op_3_5= RULE_INCLUDES
                            {
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2787); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_op_3_5, grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"op",
                                      		lv_op_3_5, 
                                      		"INCLUDES");
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1295:8: lv_op_3_6= RULE_DASHMATCH
                            {
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2807); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_op_3_6, grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"op",
                                      		lv_op_3_6, 
                                      		"DASHMATCH");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1313:2: ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1314:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1314:1: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1315:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1315:1: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=RULE_DASH && LA38_0<=RULE_ONE_NON_HEX_LETTER)||(LA38_0>=52 && LA38_0<=55)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_CSSSTRING) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1316:3: lv_value_4_1= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIdentifier_in_ruleAttributeSelector2838);
                            lv_value_4_1=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_4_1, 
                                      		"Identifier");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1331:8: lv_value_4_2= RULE_CSSSTRING
                            {
                            lv_value_4_2=(Token)match(input,RULE_CSSSTRING,FOLLOW_RULE_CSSSTRING_in_ruleAttributeSelector2853); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_4_2, grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_4_2, 
                                      		"CSSSTRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleAttributeSelector2875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4());
                  
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
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1361:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1362:2: (iv_ruleClassSelector= ruleClassSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1363:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleClassSelector_in_entryRuleClassSelector2911);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSelector2921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1370:1: ruleClassSelector returns [EObject current=null] : ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1373:28: ( ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1374:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1374:1: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1374:2: () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1374:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1375:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassSelectorAccess().getClassSelectorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleClassSelector2967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1384:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1385:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1385:1: (lv_name_2_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1386:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleClassSelector2988);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1410:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1411:2: (iv_ruleElementSelector= ruleElementSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1412:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleElementSelector_in_entryRuleElementSelector3024);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementSelector3034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1419:1: ruleElementSelector returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1422:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1423:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1423:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1423:2: () ( (lv_name_1_0= ruleIdentifier ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1423:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1424:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1429:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1430:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1430:1: (lv_name_1_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1431:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleElementSelector3089);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1455:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1456:2: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1457:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3125);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniversalSelector3135); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1464:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1467:28: ( ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1468:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1468:1: ( () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1468:2: () ( (lv_namespace_1_0= rulecss_namespace_prefix ) )? otherlv_2= '*'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1468:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1469:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1474:2: ( (lv_namespace_1_0= rulecss_namespace_prefix ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_DASH && LA40_0<=RULE_ONE_NON_HEX_LETTER)||LA40_0==39||(LA40_0>=52 && LA40_0<=55)) ) {
                alt40=1;
            }
            else if ( (LA40_0==38) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==39) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1475:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1475:1: (lv_namespace_1_0= rulecss_namespace_prefix )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1476:3: lv_namespace_1_0= rulecss_namespace_prefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespaceCss_namespace_prefixParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3190);
                    lv_namespace_1_0=rulecss_namespace_prefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUniversalSelectorRule());
                      	        }
                             		set(
                             			current, 
                             			"namespace",
                              		lv_namespace_1_0, 
                              		"css_namespace_prefix");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleUniversalSelector3203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
                  
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
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1504:1: entryRuleIdSelector returns [EObject current=null] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final EObject entryRuleIdSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSelector = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1505:2: (iv_ruleIdSelector= ruleIdSelector EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1506:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleIdSelector_in_entryRuleIdSelector3239);
            iv_ruleIdSelector=ruleIdSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdSelector3249); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1513:1: ruleIdSelector returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleIdSelector() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1516:28: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1517:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1517:1: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1517:2: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1517:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1518:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdSelectorAccess().getIdSelectorAction_0(),
                          current);
                  
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleIdSelector3294); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_1, grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1527:1: ( (lv_name_2_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1528:1: (lv_name_2_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1528:1: (lv_name_2_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1529:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdSelector3314);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdSelectorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"Identifier");
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
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRulecss_namespace_prefix"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1553:1: entryRulecss_namespace_prefix returns [String current=null] : iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF ;
    public final String entryRulecss_namespace_prefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_namespace_prefix = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1554:2: (iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1555:2: iv_rulecss_namespace_prefix= rulecss_namespace_prefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_namespace_prefixRule()); 
            }
            pushFollow(FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3351);
            iv_rulecss_namespace_prefix=rulecss_namespace_prefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_namespace_prefix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_namespace_prefix3362); if (state.failed) return current;

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
    // $ANTLR end "entryRulecss_namespace_prefix"


    // $ANTLR start "rulecss_namespace_prefix"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1562:1: rulecss_namespace_prefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) ;
    public final AntlrDatatypeRuleToken rulecss_namespace_prefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1565:28: ( ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1566:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1566:1: ( (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1566:2: (this_Identifier_0= ruleIdentifier | kw= '*' )? kw= '|'
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1566:2: (this_Identifier_0= ruleIdentifier | kw= '*' )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_DASH && LA41_0<=RULE_ONE_NON_HEX_LETTER)||(LA41_0>=52 && LA41_0<=55)) ) {
                alt41=1;
            }
            else if ( (LA41_0==38) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1567:5: this_Identifier_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCss_namespace_prefixAccess().getIdentifierParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3410);
                    this_Identifier_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Identifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1579:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulecss_namespace_prefix3434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getAsteriskKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_39_in_rulecss_namespace_prefix3449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCss_namespace_prefixAccess().getVerticalLineKeyword_1()); 
                  
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
    // $ANTLR end "rulecss_namespace_prefix"


    // $ANTLR start "entryRulecss_declaration"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1598:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1602:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1603:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_declarationRule()); 
            }
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration3495);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration3505); if (state.failed) return current;

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
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1613:1: rulecss_declaration returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_COLON_3=null;
        Token lv_important_5_0=null;
        EObject lv_property_1_0 = null;

        EObject lv_valueTokens_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1617:28: ( ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1618:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1618:1: ( (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )? )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1618:2: (this_WS_0= RULE_WS )* ( (lv_property_1_0= rulecss_property ) ) (this_WS_2= RULE_WS )* this_COLON_3= RULE_COLON ( (lv_valueTokens_4_0= ruleCssTok ) )+ ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1618:2: (this_WS_0= RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1618:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3546); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1622:3: ( (lv_property_1_0= rulecss_property ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1623:1: (lv_property_1_0= rulecss_property )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1623:1: (lv_property_1_0= rulecss_property )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1624:3: lv_property_1_0= rulecss_property
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_declarationAccess().getPropertyCss_propertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulecss_property_in_rulecss_declaration3568);
            lv_property_1_0=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCss_declarationRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_1_0, 
                      		"css_property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1640:2: (this_WS_2= RULE_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_WS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1640:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecss_declaration3580); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulecss_declaration3592); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getCss_declarationAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1648:1: ( (lv_valueTokens_4_0= ruleCssTok ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_CSSSTRING||(LA44_0>=RULE_COMMA && LA44_0<=RULE_WS)||LA44_0==RULE_HASHMARK||(LA44_0>=RULE_PLUS && LA44_0<=RULE_ONE_INT)||LA44_0==37||LA44_0==45||(LA44_0>=52 && LA44_0<=55)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1649:1: (lv_valueTokens_4_0= ruleCssTok )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1649:1: (lv_valueTokens_4_0= ruleCssTok )
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1650:3: lv_valueTokens_4_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCss_declarationAccess().getValueTokensCssTokParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCssTok_in_rulecss_declaration3612);
            	    lv_valueTokens_4_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCss_declarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valueTokens",
            	              		lv_valueTokens_4_0, 
            	              		"CssTok");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1666:3: ( (lv_important_5_0= RULE_IMPORTANT_SYM ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_IMPORTANT_SYM) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1667:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1667:1: (lv_important_5_0= RULE_IMPORTANT_SYM )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1668:3: lv_important_5_0= RULE_IMPORTANT_SYM
                    {
                    lv_important_5_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_important_5_0, grammarAccess.getCss_declarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCss_declarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"important",
                              		true, 
                              		"IMPORTANT_SYM");
                      	    
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
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_property"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1695:1: entryRulecss_property returns [EObject current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final EObject entryRulecss_property() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_property = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1696:2: (iv_rulecss_property= rulecss_property EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1697:2: iv_rulecss_property= rulecss_property EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCss_propertyRule()); 
            }
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3676);
            iv_rulecss_property=rulecss_property();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecss_property; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3686); if (state.failed) return current;

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
    // $ANTLR end "entryRulecss_property"


    // $ANTLR start "rulecss_property"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1704:1: rulecss_property returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject rulecss_property() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1707:28: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1708:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1708:1: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1708:2: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1708:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1709:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCss_propertyAccess().getCss_propertyAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1714:2: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1715:1: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1715:1: (lv_name_1_0= ruleValidPropertyIdent )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1716:3: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCss_propertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_rulecss_property3741);
            lv_name_1_0=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCss_propertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidPropertyIdent");
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
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1740:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1741:2: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1742:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3778);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidPropertyIdent3789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1749:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1752:28: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1754:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3835);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
        }
        return current;
    }
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClassOrFunc"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1772:1: entryRulePseudoClassOrFunc returns [EObject current=null] : iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF ;
    public final EObject entryRulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassOrFunc = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1773:2: (iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1774:2: iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3879);
            iv_rulePseudoClassOrFunc=rulePseudoClassOrFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassOrFunc; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassOrFunc3889); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClassOrFunc"


    // $ANTLR start "rulePseudoClassOrFunc"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1781:1: rulePseudoClassOrFunc returns [EObject current=null] : (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) ;
    public final EObject rulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject this_PseudoClass_0 = null;

        EObject this_PseudoClassFunction_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1784:28: ( (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1785:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1785:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1786:5: this_PseudoClass_0= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3936);
                    this_PseudoClass_0=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClass_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1796:5: this_PseudoClassFunction_1= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3963);
                    this_PseudoClassFunction_1=rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PseudoClassFunction_1; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "rulePseudoClassOrFunc"


    // $ANTLR start "entryRulePseudoClass"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1812:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1813:2: (iv_rulePseudoClass= rulePseudoClass EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1814:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClass_in_entryRulePseudoClass3998);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClass4008); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1821:1: rulePseudoClass returns [EObject current=null] : (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token this_COLON_0=null;
        Token this_COLON_1=null;
        EObject this_PseudoClassName_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1824:28: ( (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1825:1: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1825:1: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1825:2: this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? this_PseudoClassName_2= rulePseudoClassName
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClass4044); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1829:1: (this_COLON_1= RULE_COLON )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_COLON) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1829:2: this_COLON_1= RULE_COLON
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClass4055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_1, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPseudoClassAccess().getPseudoClassNameParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_rulePseudoClass4078);
            this_PseudoClassName_2=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PseudoClassName_2; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1850:1: entryRulePseudoClassName returns [EObject current=null] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final EObject entryRulePseudoClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassName = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1851:2: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1852:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4113);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassName4123); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1859:1: rulePseudoClassName returns [EObject current=null] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final EObject rulePseudoClassName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1862:28: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1863:1: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1863:1: ( (lv_name_0_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1864:1: (lv_name_0_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1864:1: (lv_name_0_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1865:3: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPseudoClassNameAccess().getNameIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassName4168);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPseudoClassNameRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1889:1: entryRulePseudoClassFunction returns [EObject current=null] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final EObject entryRulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassFunction = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1890:2: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1891:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4203);
            iv_rulePseudoClassFunction=rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePseudoClassFunction4213); if (state.failed) return current;

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
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1898:1: rulePseudoClassFunction returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) ;
    public final EObject rulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_paramSelector_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1901:28: ( ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:1: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:1: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_COLON) ) {
                int LA49_1 = input.LA(2);

                if ( ((LA49_1>=RULE_DASH && LA49_1<=RULE_ONE_NON_HEX_LETTER)||(LA49_1>=52 && LA49_1<=55)) ) {
                    alt49=2;
                }
                else if ( (LA49_1==42) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:2: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:2: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:3: ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')'
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1902:3: ( (lv_not_0_0= ruleNotFunctionCall ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1903:1: (lv_not_0_0= ruleNotFunctionCall )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1903:1: (lv_not_0_0= ruleNotFunctionCall )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1904:3: lv_not_0_0= ruleNotFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotFunctionCall_in_rulePseudoClassFunction4260);
                    lv_not_0_0=ruleNotFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"not",
                              		true, 
                              		"NotFunctionCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1920:2: ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1921:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1921:1: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1922:3: lv_paramSelector_1_0= ruleSimpleSelectorForNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4281);
                    lv_paramSelector_1_0=ruleSimpleSelectorForNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"paramSelector",
                              		lv_paramSelector_1_0, 
                              		"SimpleSelectorForNegation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction4293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1943:6: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1943:6: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1943:7: this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')'
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePseudoClassFunction4312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1947:1: ( (lv_name_4_0= ruleIdentifier ) )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1948:1: (lv_name_4_0= ruleIdentifier )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1948:1: (lv_name_4_0= ruleIdentifier )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1949:3: lv_name_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4332);
                    lv_name_4_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_41_in_rulePseudoClassFunction4344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1969:1: ( (lv_params_6_0= ruleCssTok ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_CSSSTRING||(LA48_0>=RULE_COMMA && LA48_0<=RULE_WS)||LA48_0==RULE_HASHMARK||(LA48_0>=RULE_PLUS && LA48_0<=RULE_ONE_INT)||LA48_0==37||LA48_0==45||(LA48_0>=52 && LA48_0<=55)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1970:1: (lv_params_6_0= ruleCssTok )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1970:1: (lv_params_6_0= ruleCssTok )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1971:3: lv_params_6_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_rulePseudoClassFunction4365);
                    	    lv_params_6_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_6_0, 
                    	              		"CssTok");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_rulePseudoClassFunction4378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4());
                          
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
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRuleNotFunctionCall"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:1999:1: entryRuleNotFunctionCall returns [String current=null] : iv_ruleNotFunctionCall= ruleNotFunctionCall EOF ;
    public final String entryRuleNotFunctionCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotFunctionCall = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2003:2: (iv_ruleNotFunctionCall= ruleNotFunctionCall EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2004:2: iv_ruleNotFunctionCall= ruleNotFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleNotFunctionCall_in_entryRuleNotFunctionCall4422);
            iv_ruleNotFunctionCall=ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotFunctionCall.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotFunctionCall4433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotFunctionCall"


    // $ANTLR start "ruleNotFunctionCall"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2014:1: ruleNotFunctionCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON kw= 'not(' ) ;
    public final AntlrDatatypeRuleToken ruleNotFunctionCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2018:28: ( (this_COLON_0= RULE_COLON kw= 'not(' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2019:1: (this_COLON_0= RULE_COLON kw= 'not(' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2019:1: (this_COLON_0= RULE_COLON kw= 'not(' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2019:6: this_COLON_0= RULE_COLON kw= 'not('
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleNotFunctionCall4477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COLON_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_0, grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleNotFunctionCall4495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNotFunctionCallAccess().getNotKeyword_1()); 
                  
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
    // $ANTLR end "ruleNotFunctionCall"


    // $ANTLR start "entryRulecombinator"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2043:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2044:2: (iv_rulecombinator= rulecombinator EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2045:2: iv_rulecombinator= rulecombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator4540);
            iv_rulecombinator=rulecombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecombinator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator4551); if (state.failed) return current;

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
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2052:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2055:28: ( (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2056:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2056:1: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt50=1;
                }
                break;
            case 43:
                {
                alt50=2;
                }
                break;
            case 44:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2056:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulecombinator4591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2065:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulecombinator4615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2072:2: kw= '~'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulecombinator4634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_2()); 
                          
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
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleSymbolTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2089:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2090:2: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2091:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4678);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolTok4688); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2098:1: ruleSymbolTok returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2101:28: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2102:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2102:1: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2102:2: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2102:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2108:2: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2109:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2109:1: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2110:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2110:1: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_COMMA) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_PERCENT) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2111:3: lv_symbol_1_1= RULE_COMMA
                    {
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSymbolTok4741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_symbol_1_1, grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSymbolTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"symbol",
                              		lv_symbol_1_1, 
                              		"COMMA");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2126:8: lv_symbol_1_2= RULE_PERCENT
                    {
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSymbolTok4761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_symbol_1_2, grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSymbolTokRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"symbol",
                              		lv_symbol_1_2, 
                              		"PERCENT");
                      	    
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
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2152:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2153:2: (iv_ruleWSTok= ruleWSTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2154:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_ruleWSTok_in_entryRuleWSTok4805);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWSTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWSTok4815); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2161:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2164:28: ( ( () this_WS_1= RULE_WS ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2165:1: ( () this_WS_1= RULE_WS )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2165:1: ( () this_WS_1= RULE_WS )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2165:2: () this_WS_1= RULE_WS
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2165:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2166:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWSTokAccess().getWSTokAction_0(),
                          current);
                  
            }

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleWSTok4860); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WS_1, grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2183:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2184:2: (iv_ruleStringTok= ruleStringTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2185:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_ruleStringTok_in_entryRuleStringTok4895);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTok4905); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2192:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2195:28: ( ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2196:1: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2196:1: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2196:2: () ( (lv_value_1_0= RULE_CSSSTRING ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2196:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2197:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTokAccess().getStringTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2202:2: ( (lv_value_1_0= RULE_CSSSTRING ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2203:1: (lv_value_1_0= RULE_CSSSTRING )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2203:1: (lv_value_1_0= RULE_CSSSTRING )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2204:3: lv_value_1_0= RULE_CSSSTRING
            {
            lv_value_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_RULE_CSSSTRING_in_ruleStringTok4956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringTokRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"CSSSTRING");
              	    
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
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleNumberTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2228:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2232:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2233:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_ruleNumberTok_in_entryRuleNumberTok5003);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberTok5013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2243:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_val_1_0= ruleNum ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2247:28: ( ( () ( (lv_val_1_0= ruleNum ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2248:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2248:1: ( () ( (lv_val_1_0= ruleNum ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2248:2: () ( (lv_val_1_0= ruleNum ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2248:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2249:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2254:2: ( (lv_val_1_0= ruleNum ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2255:1: (lv_val_1_0= ruleNum )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2255:1: (lv_val_1_0= ruleNum )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2256:3: lv_val_1_0= ruleNum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNum_in_ruleNumberTok5072);
            lv_val_1_0=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberTokRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_1_0, 
                      		"Num");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleUrlTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2283:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2284:2: (iv_ruleUrlTok= ruleUrlTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2285:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_ruleUrlTok_in_entryRuleUrlTok5112);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUrlTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlTok5122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2292:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2295:28: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2296:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2296:1: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2296:2: () ( (lv_url_1_0= ruleURLType ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2296:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2297:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2302:2: ( (lv_url_1_0= ruleURLType ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2303:1: (lv_url_1_0= ruleURLType )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2303:1: (lv_url_1_0= ruleURLType )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2304:3: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleURLType_in_ruleUrlTok5177);
            lv_url_1_0=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUrlTokRule());
              	        }
                     		set(
                     			current, 
                     			"url",
                      		lv_url_1_0, 
                      		"URLType");
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
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2328:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2332:2: (iv_ruleColorTok= ruleColorTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2333:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_ruleColorTok_in_entryRuleColorTok5219);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorTok5229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2343:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_value_1_0= ruleHex ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2347:28: ( ( () ( (lv_value_1_0= ruleHex ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2348:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2348:1: ( () ( (lv_value_1_0= ruleHex ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2348:2: () ( (lv_value_1_0= ruleHex ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2348:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2349:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColorTokAccess().getColorTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2354:2: ( (lv_value_1_0= ruleHex ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2355:1: (lv_value_1_0= ruleHex )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2355:1: (lv_value_1_0= ruleHex )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2356:3: lv_value_1_0= ruleHex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHex_in_ruleColorTok5288);
            lv_value_1_0=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColorTokRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Hex");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleIdentifierOrFuncTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2383:1: entryRuleIdentifierOrFuncTok returns [EObject current=null] : iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF ;
    public final EObject entryRuleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierOrFuncTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2387:2: (iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2388:2: iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5334);
            iv_ruleIdentifierOrFuncTok=ruleIdentifierOrFuncTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierOrFuncTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5344); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifierOrFuncTok"


    // $ANTLR start "ruleIdentifierOrFuncTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2398:1: ruleIdentifierOrFuncTok returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) ;
    public final EObject ruleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2402:28: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2403:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2403:1: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2403:2: () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2403:2: ()
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2404:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2409:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2410:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2410:1: (lv_name_1_0= ruleIdentifier )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2411:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5403);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2427:2: ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2427:3: () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')'
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2427:3: ()
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2428:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleIdentifierOrFuncTok5425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2437:1: ( (lv_params_4_0= ruleCssTok ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_CSSSTRING||(LA52_0>=RULE_COMMA && LA52_0<=RULE_WS)||LA52_0==RULE_HASHMARK||(LA52_0>=RULE_PLUS && LA52_0<=RULE_ONE_INT)||LA52_0==37||LA52_0==45||(LA52_0>=52 && LA52_0<=55)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2438:1: (lv_params_4_0= ruleCssTok )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2438:1: (lv_params_4_0= ruleCssTok )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2439:3: lv_params_4_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5446);
                    	    lv_params_4_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"CssTok");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleIdentifierOrFuncTok5459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3());
                          
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
    // $ANTLR end "ruleIdentifierOrFuncTok"


    // $ANTLR start "entryRuleCssTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2470:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2474:2: (iv_ruleCssTok= ruleCssTok EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2475:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_ruleCssTok_in_entryRuleCssTok5507);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssTok; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCssTok5517); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2485:1: ruleCssTok returns [EObject current=null] : (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) ;
    public final EObject ruleCssTok() throws RecognitionException {
        EObject current = null;

        EObject this_IdentifierOrFuncTok_0 = null;

        EObject this_SymbolTok_1 = null;

        EObject this_WSTok_2 = null;

        EObject this_StringTok_3 = null;

        EObject this_NumberTok_4 = null;

        EObject this_UrlTok_5 = null;

        EObject this_ColorTok_6 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2489:28: ( (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2490:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2490:1: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            int alt54=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ONE_INT||LA54_1==37) ) {
                    alt54=5;
                }
                else if ( ((LA54_1>=RULE_UNDERSCORE && LA54_1<=RULE_ONE_NON_HEX_LETTER)||(LA54_1>=52 && LA54_1<=55)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNDERSCORE:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt54=1;
                }
                break;
            case RULE_COMMA:
            case RULE_PERCENT:
                {
                alt54=2;
                }
                break;
            case RULE_WS:
                {
                alt54=3;
                }
                break;
            case RULE_CSSSTRING:
                {
                alt54=4;
                }
                break;
            case RULE_PLUS:
            case RULE_ONE_INT:
            case 37:
                {
                alt54=5;
                }
                break;
            case 45:
                {
                alt54=6;
                }
                break;
            case RULE_HASHMARK:
                {
                alt54=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2491:5: this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5568);
                    this_IdentifierOrFuncTok_0=ruleIdentifierOrFuncTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentifierOrFuncTok_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2501:5: this_SymbolTok_1= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSymbolTok_in_ruleCssTok5595);
                    this_SymbolTok_1=ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SymbolTok_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2511:5: this_WSTok_2= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWSTok_in_ruleCssTok5622);
                    this_WSTok_2=ruleWSTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WSTok_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2521:5: this_StringTok_3= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTok_in_ruleCssTok5649);
                    this_StringTok_3=ruleStringTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringTok_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2531:5: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberTok_in_ruleCssTok5676);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberTok_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2541:5: this_UrlTok_5= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUrlTok_in_ruleCssTok5703);
                    this_UrlTok_5=ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UrlTok_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2551:5: this_ColorTok_6= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColorTok_in_ruleCssTok5730);
                    this_ColorTok_6=ruleColorTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ColorTok_6; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRuleURLType"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2570:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2574:2: (iv_ruleURLType= ruleURLType EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2575:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType5775);
            iv_ruleURLType=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType5785); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2585:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2589:28: ( (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2590:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2590:1: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2590:3: otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleURLType5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2594:1: ( (lv_url_1_0= ruleValidURL ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2595:1: (lv_url_1_0= ruleValidURL )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2595:1: (lv_url_1_0= ruleValidURL )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2596:3: lv_url_1_0= ruleValidURL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidURL_in_ruleURLType5847);
            lv_url_1_0=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getURLTypeRule());
              	        }
                     		set(
                     			current, 
                     			"url",
                      		lv_url_1_0, 
                      		"ValidURL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleURLType5859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleValidURLSymbol"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2627:1: entryRuleValidURLSymbol returns [String current=null] : iv_ruleValidURLSymbol= ruleValidURLSymbol EOF ;
    public final String entryRuleValidURLSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURLSymbol = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2628:2: (iv_ruleValidURLSymbol= ruleValidURLSymbol EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2629:2: iv_ruleValidURLSymbol= ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5900);
            iv_ruleValidURLSymbol=ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURLSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURLSymbol5911); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidURLSymbol"


    // $ANTLR start "ruleValidURLSymbol"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2636:1: ruleValidURLSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) ) ;
    public final AntlrDatatypeRuleToken ruleValidURLSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token kw=null;
        Token this_UNDERSCORE_2=null;
        Token this_COLON_4=null;
        Token this_HASHMARK_7=null;
        Token this_PLUS_15=null;
        Token this_COMMA_16=null;
        AntlrDatatypeRuleToken this_KeywordHack_19 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2639:28: ( (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2640:1: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2640:1: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' this_KeywordHack_19= ruleKeywordHack ) )
            int alt55=19;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                alt55=1;
                }
                break;
            case 37:
                {
                alt55=2;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt55=3;
                }
                break;
            case 44:
                {
                alt55=4;
                }
                break;
            case RULE_COLON:
                {
                alt55=5;
                }
                break;
            case 46:
                {
                alt55=6;
                }
                break;
            case 47:
                {
                alt55=7;
                }
                break;
            case RULE_HASHMARK:
                {
                alt55=8;
                }
                break;
            case 31:
                {
                alt55=9;
                }
                break;
            case 36:
                {
                alt55=10;
                }
                break;
            case 48:
                {
                alt55=11;
                }
                break;
            case 49:
                {
                alt55=12;
                }
                break;
            case 50:
                {
                alt55=13;
                }
                break;
            case 51:
                {
                alt55=14;
                }
                break;
            case 38:
                {
                alt55=15;
                }
                break;
            case RULE_PLUS:
                {
                alt55=16;
                }
                break;
            case RULE_COMMA:
                {
                alt55=17;
                }
                break;
            case 22:
                {
                alt55=18;
                }
                break;
            case 35:
                {
                alt55=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2640:6: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleValidURLSymbol5951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_0, grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2649:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleValidURLSymbol5975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2655:10: this_UNDERSCORE_2= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleValidURLSymbol5996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_2, grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2664:2: kw= '~'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleValidURLSymbol6020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2670:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleValidURLSymbol6041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2679:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValidURLSymbol6065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2686:2: kw= '?'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleValidURLSymbol6084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2692:10: this_HASHMARK_7= RULE_HASHMARK
                    {
                    this_HASHMARK_7=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleValidURLSymbol6105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASHMARK_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASHMARK_7, grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2701:2: kw= '['
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleValidURLSymbol6129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2708:2: kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleValidURLSymbol6148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2715:2: kw= '@'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleValidURLSymbol6167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2722:2: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleValidURLSymbol6186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2729:2: kw= '$'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleValidURLSymbol6205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2736:2: kw= '&'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleValidURLSymbol6224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2743:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleValidURLSymbol6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2749:10: this_PLUS_15= RULE_PLUS
                    {
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleValidURLSymbol6264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_15, grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2757:10: this_COMMA_16= RULE_COMMA
                    {
                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleValidURLSymbol6290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_16, grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2766:2: kw= ';'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleValidURLSymbol6314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2772:6: (kw= '=' this_KeywordHack_19= ruleKeywordHack )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2772:6: (kw= '=' this_KeywordHack_19= ruleKeywordHack )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2773:2: kw= '=' this_KeywordHack_19= ruleKeywordHack
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleValidURLSymbol6334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeywordHack_in_ruleValidURLSymbol6356);
                    this_KeywordHack_19=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KeywordHack_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleKeywordHack"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2797:1: entryRuleKeywordHack returns [String current=null] : iv_ruleKeywordHack= ruleKeywordHack EOF ;
    public final String entryRuleKeywordHack() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeywordHack = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2798:2: (iv_ruleKeywordHack= ruleKeywordHack EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2799:2: iv_ruleKeywordHack= ruleKeywordHack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeywordHackRule()); 
            }
            pushFollow(FOLLOW_ruleKeywordHack_in_entryRuleKeywordHack6403);
            iv_ruleKeywordHack=ruleKeywordHack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeywordHack.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywordHack6414); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeywordHack"


    // $ANTLR start "ruleKeywordHack"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2806:1: ruleKeywordHack returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) ;
    public final AntlrDatatypeRuleToken ruleKeywordHack() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2809:28: ( (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2810:1: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2810:1: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt56=1;
                }
                break;
            case 53:
                {
                alt56=2;
                }
                break;
            case 54:
                {
                alt56=3;
                }
                break;
            case 55:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2811:2: kw= 'not'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleKeywordHack6452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNotKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2818:2: kw= 'no'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleKeywordHack6471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNoKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2825:2: kw= 'url'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleKeywordHack6490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrlKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2832:2: kw= 'ur'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleKeywordHack6509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrKeyword_3()); 
                          
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
    // $ANTLR end "ruleKeywordHack"


    // $ANTLR start "entryRuleValidURL"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2845:1: entryRuleValidURL returns [String current=null] : iv_ruleValidURL= ruleValidURL EOF ;
    public final String entryRuleValidURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURL = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2849:2: (iv_ruleValidURL= ruleValidURL EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2850:2: iv_ruleValidURL= ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLRule()); 
            }
            pushFollow(FOLLOW_ruleValidURL_in_entryRuleValidURL6556);
            iv_ruleValidURL=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidURL6567); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidURL"


    // $ANTLR start "ruleValidURL"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2860:1: ruleValidURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleValidURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CSSSTRING_0=null;
        Token this_ONE_HEX_LETTER_3=null;
        Token this_ONE_NON_HEX_LETTER_4=null;
        Token this_ONE_INT_5=null;
        Token kw=null;
        Token this_PERCENT_11=null;
        Token this_ONE_INT_12=null;
        Token this_ONE_HEX_LETTER_13=null;
        Token this_ONE_INT_14=null;
        Token this_ONE_HEX_LETTER_15=null;
        AntlrDatatypeRuleToken this_ValidURLSymbol_1 = null;

        AntlrDatatypeRuleToken this_KeywordHack_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2864:28: ( (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2865:1: (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2865:1: (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_CSSSTRING) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_COLON && LA60_0<=RULE_COMMA)||LA60_0==RULE_HASHMARK||(LA60_0>=RULE_PLUS && LA60_0<=RULE_ONE_INT)||LA60_0==22||LA60_0==31||(LA60_0>=35 && LA60_0<=38)||LA60_0==44||(LA60_0>=46 && LA60_0<=60)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2865:6: this_CSSSTRING_0= RULE_CSSSTRING
                    {
                    this_CSSSTRING_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_RULE_CSSSTRING_in_ruleValidURL6611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CSSSTRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CSSSTRING_0, grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2873:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2873:6: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=12;
                        switch ( input.LA(1) ) {
                        case RULE_COLON:
                        case RULE_COMMA:
                        case RULE_HASHMARK:
                        case RULE_PLUS:
                        case RULE_DASH:
                        case RULE_UNDERSCORE:
                        case 22:
                        case 31:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 44:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                            {
                            alt59=1;
                            }
                            break;
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            {
                            alt59=2;
                            }
                            break;
                        case RULE_ONE_HEX_LETTER:
                            {
                            alt59=3;
                            }
                            break;
                        case RULE_ONE_NON_HEX_LETTER:
                            {
                            alt59=4;
                            }
                            break;
                        case RULE_ONE_INT:
                            {
                            alt59=5;
                            }
                            break;
                        case 56:
                            {
                            alt59=6;
                            }
                            break;
                        case 57:
                            {
                            alt59=7;
                            }
                            break;
                        case 58:
                            {
                            alt59=8;
                            }
                            break;
                        case 59:
                            {
                            alt59=9;
                            }
                            break;
                        case 60:
                            {
                            alt59=10;
                            }
                            break;
                        case RULE_PERCENT:
                            {
                            alt59=11;
                            }
                            break;

                        }

                        switch (alt59) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2874:5: this_ValidURLSymbol_1= ruleValidURLSymbol
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleValidURLSymbol_in_ruleValidURL6645);
                    	    this_ValidURLSymbol_1=ruleValidURLSymbol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ValidURLSymbol_1);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2886:5: this_KeywordHack_2= ruleKeywordHack
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleKeywordHack_in_ruleValidURL6678);
                    	    this_KeywordHack_2=ruleKeywordHack();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_KeywordHack_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2897:10: this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER
                    	    {
                    	    this_ONE_HEX_LETTER_3=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6704); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_HEX_LETTER_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_HEX_LETTER_3, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2905:10: this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER
                    	    {
                    	    this_ONE_NON_HEX_LETTER_4=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6730); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_NON_HEX_LETTER_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_NON_HEX_LETTER_4, grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2913:10: this_ONE_INT_5= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_5=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6756); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_5, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2922:2: kw= '\\\\ '
                    	    {
                    	    kw=(Token)match(input,56,FOLLOW_56_in_ruleValidURL6780); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2929:2: kw= '\\\\('
                    	    {
                    	    kw=(Token)match(input,57,FOLLOW_57_in_ruleValidURL6799); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2936:2: kw= '\\\\)'
                    	    {
                    	    kw=(Token)match(input,58,FOLLOW_58_in_ruleValidURL6818); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2943:2: kw= '\\\\\\''
                    	    {
                    	    kw=(Token)match(input,59,FOLLOW_59_in_ruleValidURL6837); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2950:2: kw= '\\\\\"'
                    	    {
                    	    kw=(Token)match(input,60,FOLLOW_60_in_ruleValidURL6856); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9()); 
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 11 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2956:6: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    {
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2956:6: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2956:11: this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    {
                    	    this_PERCENT_11=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleValidURL6878); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_PERCENT_11);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_PERCENT_11, grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0()); 
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2963:1: (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER )
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==RULE_ONE_INT) ) {
                    	        alt57=1;
                    	    }
                    	    else if ( (LA57_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt57=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 57, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2963:6: this_ONE_INT_12= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_12=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6899); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_12);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_12, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2971:10: this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_13=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6925); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_13);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_13, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2978:2: (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==RULE_ONE_INT) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt58=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 58, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2978:7: this_ONE_INT_14= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_14=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleValidURL6947); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_INT_14);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_INT_14, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0()); 
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:2986:10: this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_15=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6973); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              		current.merge(this_ONE_HEX_LETTER_15);
                    	                  
                    	            }
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                  newLeafNode(this_ONE_HEX_LETTER_15, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1()); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);


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
    // $ANTLR end "ruleValidURL"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3004:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3008:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3009:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier7033);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier7044); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3019:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token this_UNDERSCORE_5=null;
        Token this_DASH_6=null;
        Token this_ONE_HEX_LETTER_7=null;
        Token this_ONE_NON_HEX_LETTER_8=null;
        Token this_ONE_INT_9=null;
        AntlrDatatypeRuleToken this_KeywordHack_4 = null;

        AntlrDatatypeRuleToken this_KeywordHack_10 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3023:28: ( ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3024:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3024:1: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3024:2: (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3024:2: (this_DASH_0= RULE_DASH )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_DASH) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3024:7: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier7089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_0, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3031:3: (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack )
            int alt62=4;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt62=1;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt62=2;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt62=3;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt62=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3031:8: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_1, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3039:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    {
                    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_HEX_LETTER_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3047:10: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    {
                    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_NON_HEX_LETTER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_NON_HEX_LETTER_3, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3056:5: this_KeywordHack_4= ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleKeywordHack_in_ruleIdentifier7197);
                    this_KeywordHack_4=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_KeywordHack_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3071:26: (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    int alt63=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_UNDERSCORE:
            	        {
            	        alt63=1;
            	        }
            	        break;
            	    case RULE_DASH:
            	        {
            	        alt63=2;
            	        }
            	        break;
            	    case RULE_ONE_HEX_LETTER:
            	        {
            	        alt63=3;
            	        }
            	        break;
            	    case RULE_ONE_NON_HEX_LETTER:
            	        {
            	        alt63=4;
            	        }
            	        break;
            	    case RULE_ONE_INT:
            	        {
            	        alt63=5;
            	        }
            	        break;
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	        {
            	        alt63=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt63) {
            	        case 1 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3071:31: this_UNDERSCORE_5= RULE_UNDERSCORE
            	            {
            	            this_UNDERSCORE_5=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7267); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_UNDERSCORE_5);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_UNDERSCORE_5, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3079:10: this_DASH_6= RULE_DASH
            	            {
            	            this_DASH_6=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleIdentifier7293); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_DASH_6);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_DASH_6, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3087:10: this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_7=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7319); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_HEX_LETTER_7);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_HEX_LETTER_7, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3095:10: this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER
            	            {
            	            this_ONE_NON_HEX_LETTER_8=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7345); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_NON_HEX_LETTER_8);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_NON_HEX_LETTER_8, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3103:10: this_ONE_INT_9= RULE_ONE_INT
            	            {
            	            this_ONE_INT_9=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleIdentifier7371); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_9);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_9, grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3112:5: this_KeywordHack_10= ruleKeywordHack
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleKeywordHack_in_ruleIdentifier7404);
            	            this_KeywordHack_10=ruleKeywordHack();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_KeywordHack_10);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNum"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3133:1: entryRuleNum returns [String current=null] : iv_ruleNum= ruleNum EOF ;
    public final String entryRuleNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNum = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3137:2: (iv_ruleNum= ruleNum EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3138:2: iv_ruleNum= ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumRule()); 
            }
            pushFollow(FOLLOW_ruleNum_in_entryRuleNum7463);
            iv_ruleNum=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNum.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNum7474); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3148:1: ruleNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleNum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        Token kw=null;
        Token this_ONE_INT_3=null;
        Token this_ONE_INT_4=null;
        Token this_ONE_INT_6=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3152:28: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3153:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3153:1: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3153:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3153:2: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_PLUS) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_DASH) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3153:7: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleNum7519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3161:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleNum7545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3168:3: ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==37) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ONE_INT) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3168:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3168:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3169:2: kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7567); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_0_0()); 
                          
                    }
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3174:1: ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_ONE_INT) ) {
                            int LA66_2 = input.LA(2);

                            if ( (synpred3_InternalCssDsl()) ) {
                                alt66=1;
                            }


                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3174:2: ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_3=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7588); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_3, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:6: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    {
                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:7: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_ONE_INT) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred4_InternalCssDsl()) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:8: ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7624); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ONE_INT_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ONE_INT_4, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3189:3: ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==37) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==RULE_ONE_INT) ) {
                            int LA69_3 = input.LA(3);

                            if ( (synpred5_InternalCssDsl()) ) {
                                alt69=1;
                            }
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3189:4: ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            {
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3189:4: ( ( '.' )=>kw= '.' )
                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3189:5: ( '.' )=>kw= '.'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleNum7654); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0()); 
                                  
                            }

                            }

                            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3197:2: ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            int cnt68=0;
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==RULE_ONE_INT) ) {
                                    int LA68_2 = input.LA(2);

                                    if ( (synpred6_InternalCssDsl()) ) {
                                        alt68=1;
                                    }


                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3197:3: ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT
                            	    {
                            	    this_ONE_INT_6=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleNum7676); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_ONE_INT_6);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_ONE_INT_6, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt68 >= 1 ) break loop68;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(68, input);
                                        throw eee;
                                }
                                cnt68++;
                            } while (true);


                            }
                            break;

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
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleHex"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3215:1: entryRuleHex returns [String current=null] : iv_ruleHex= ruleHex EOF ;
    public final String entryRuleHex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHex = null;


        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3216:2: (iv_ruleHex= ruleHex EOF )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3217:2: iv_ruleHex= ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexRule()); 
            }
            pushFollow(FOLLOW_ruleHex_in_entryRuleHex7732);
            iv_ruleHex=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHex.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHex7743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHex"


    // $ANTLR start "ruleHex"
    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3224:1: ruleHex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleHex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASHMARK_0=null;
        Token this_ONE_INT_1=null;
        Token this_ONE_HEX_LETTER_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3227:28: ( (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3228:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            {
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3228:1: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3228:6: this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            {
            this_HASHMARK_0=(Token)match(input,RULE_HASHMARK,FOLLOW_RULE_HASHMARK_in_ruleHex7783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HASHMARK_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HASHMARK_0, grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0()); 
                  
            }
            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3235:1: ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ONE_HEX_LETTER) ) {
                    int LA72_2 = input.LA(2);

                    if ( (synpred7_InternalCssDsl()) ) {
                        alt72=1;
                    }


                }
                else if ( (LA72_0==RULE_ONE_INT) ) {
                    int LA72_3 = input.LA(2);

                    if ( (synpred7_InternalCssDsl()) ) {
                        alt72=1;
                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3235:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    {
            	    // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3236:30: (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_ONE_INT) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==RULE_ONE_HEX_LETTER) ) {
            	        alt71=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3236:35: this_ONE_INT_1= RULE_ONE_INT
            	            {
            	            this_ONE_INT_1=(Token)match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_ruleHex7820); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_INT_1);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_INT_1, grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3244:10: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7846); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ONE_HEX_LETTER_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // $ANTLR end "ruleHex"

    // $ANTLR start synpred1_InternalCssDsl
    public final void synpred1_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:933:7: ( ( ruleSubSelectorForNegation ) )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:934:1: ( ruleSubSelectorForNegation )
        {
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:934:1: ( ruleSubSelectorForNegation )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:935:1: ruleSubSelectorForNegation
        {
        pushFollow(FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1987);
        ruleSubSelectorForNegation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCssDsl

    // $ANTLR start synpred2_InternalCssDsl
    public final void synpred2_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:3: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:4: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        {
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:4: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        int alt73=6;
        switch ( input.LA(1) ) {
        case RULE_UNDERSCORE:
            {
            alt73=1;
            }
            break;
        case RULE_DASH:
            {
            alt73=2;
            }
            break;
        case RULE_ONE_HEX_LETTER:
            {
            alt73=3;
            }
            break;
        case RULE_ONE_NON_HEX_LETTER:
            {
            alt73=4;
            }
            break;
        case RULE_ONE_INT:
            {
            alt73=5;
            }
            break;
        case 52:
        case 53:
        case 54:
        case 55:
            {
            alt73=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 73, 0, input);

            throw nvae;
        }

        switch (alt73) {
            case 1 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3066:6: RULE_UNDERSCORE
                {
                match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_synpred2_InternalCssDsl7216); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3067:7: RULE_DASH
                {
                match(input,RULE_DASH,FOLLOW_RULE_DASH_in_synpred2_InternalCssDsl7224); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3068:7: RULE_ONE_HEX_LETTER
                {
                match(input,RULE_ONE_HEX_LETTER,FOLLOW_RULE_ONE_HEX_LETTER_in_synpred2_InternalCssDsl7232); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3069:7: RULE_ONE_NON_HEX_LETTER
                {
                match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_RULE_ONE_NON_HEX_LETTER_in_synpred2_InternalCssDsl7240); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3070:7: RULE_ONE_INT
                {
                match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred2_InternalCssDsl7248); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3071:7: ruleKeywordHack
                {
                pushFollow(FOLLOW_ruleKeywordHack_in_synpred2_InternalCssDsl7256);
                ruleKeywordHack();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred2_InternalCssDsl

    // $ANTLR start synpred3_InternalCssDsl
    public final void synpred3_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3174:2: ( RULE_ONE_INT )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3174:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred3_InternalCssDsl7579); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalCssDsl

    // $ANTLR start synpred4_InternalCssDsl
    public final void synpred4_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:8: ( RULE_ONE_INT )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3182:10: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred4_InternalCssDsl7615); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCssDsl

    // $ANTLR start synpred5_InternalCssDsl
    public final void synpred5_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3189:5: ( '.' )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3190:2: '.'
        {
        match(input,37,FOLLOW_37_in_synpred5_InternalCssDsl7645); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCssDsl

    // $ANTLR start synpred6_InternalCssDsl
    public final void synpred6_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3197:3: ( RULE_ONE_INT )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3197:5: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_RULE_ONE_INT_in_synpred6_InternalCssDsl7667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCssDsl

    // $ANTLR start synpred7_InternalCssDsl
    public final void synpred7_InternalCssDsl_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3235:2: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )
        // ../org.eclipse.fx.ide.css/src-gen/org/eclipse/fx/ide/css/parser/antlr/internal/InternalCssDsl.g:3235:3: ( RULE_ONE_INT | RULE_ONE_HEX_LETTER )
        {
        if ( input.LA(1)==RULE_ONE_HEX_LETTER||input.LA(1)==RULE_ONE_INT ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred7_InternalCssDsl

    // Delegated rules

    public final boolean synpred7_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\6\2\uffff";
    static final String DFA17_maxS =
        "\2\33\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\1\1\23\uffff\1\2",
            "\1\3\1\1\23\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 640:2: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleselector ) ) )*";
        }
    }
    static final String DFA26_eotS =
        "\5\uffff";
    static final String DFA26_eofS =
        "\1\3\4\uffff";
    static final String DFA26_minS =
        "\1\6\1\uffff\1\5\2\uffff";
    static final String DFA26_maxS =
        "\1\54\1\uffff\1\67\2\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String DFA26_specialS =
        "\5\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\1\2\4\uffff\1\1\16\uffff\1\3\17\uffff\2\1",
            "",
            "\1\4\1\3\1\2\2\uffff\1\4\1\uffff\1\4\1\uffff\4\4\11\uffff\1"+
            "\3\3\uffff\1\4\5\uffff\3\4\3\uffff\2\4\7\uffff\4\4",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "768:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleselector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= rulecombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleselector ) ) ) )?";
        }
    }
    static final String DFA27_eotS =
        "\24\uffff";
    static final String DFA27_eofS =
        "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String DFA27_minS =
        "\1\16\1\17\7\5\1\uffff\11\5\1\uffff";
    static final String DFA27_maxS =
        "\11\67\1\uffff\11\67\1\uffff";
    static final String DFA27_acceptS =
        "\11\uffff\1\2\11\uffff\1\1";
    static final String DFA27_specialS =
        "\24\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\2\1\3\1\4\24\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\42\uffff\1\5\1\6\1\7\1\10",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
            "\1\23\4\uffff\1\23\3\uffff\1\13\1\12\1\14\1\15\1\16\14\uffff"+
            "\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21"+
            "\1\22",
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
            return "877:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\24\uffff";
    static final String DFA32_eofS =
        "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String DFA32_minS =
        "\1\16\1\17\7\5\1\uffff\11\5\1\uffff";
    static final String DFA32_maxS =
        "\11\67\1\uffff\11\67\1\uffff";
    static final String DFA32_acceptS =
        "\11\uffff\1\2\11\uffff\1\1";
    static final String DFA32_specialS =
        "\24\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\1\2\1\3\1\4\24\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\42\uffff\1\5\1\6\1\7\1\10",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\3\23\2\uffff\1\23\1\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15"+
            "\1\16\10\uffff\1\23\3\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3"+
            "\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1043:3: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String DFA46_eotS =
        "\25\uffff";
    static final String DFA46_eofS =
        "\5\uffff\20\3";
    static final String DFA46_minS =
        "\2\5\2\uffff\1\17\20\5";
    static final String DFA46_maxS =
        "\1\5\1\67\2\uffff\21\67";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\1\1\21\uffff";
    static final String DFA46_specialS =
        "\25\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\4\1\5\1\6\1\7\30\uffff\1\2\11\uffff\1\10\1"+
            "\11\1\12\1\13",
            "",
            "",
            "\1\5\1\6\1\7\42\uffff\1\10\1\11\1\12\1\13",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24",
            "\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\15\1\14\1\16\1\17\1"+
            "\20\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\1\2\1\uffff"+
            "\2\3\7\uffff\1\21\1\22\1\23\1\24"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1785:1: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )";
        }
    }
    static final String DFA64_eotS =
        "\14\uffff";
    static final String DFA64_eofS =
        "\1\1\13\uffff";
    static final String DFA64_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA64_maxS =
        "\1\67\1\uffff\11\0\1\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA64_specialS =
        "\2\uffff\1\10\1\1\1\2\1\4\1\6\1\7\1\3\1\5\1\0\1\uffff}>";
    static final String[] DFA64_transitionS = {
            "\12\1\1\2\1\3\1\4\1\5\1\12\3\uffff\1\1\4\uffff\2\1\2\uffff\7"+
            "\1\1\uffff\3\1\1\uffff\3\1\6\uffff\1\6\1\7\1\10\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()* loopback of 3066:2: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_10 = input.LA(1);

                         
                        int index64_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_8 = input.LA(1);

                         
                        int index64_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA64_9 = input.LA(1);

                         
                        int index64_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA64_7 = input.LA(1);

                         
                        int index64_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x00F000E0E783C422L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x00F000E0E783C422L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x00F000E0E603C422L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CSSSTRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleimportExpression453 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_24_in_ruleimportExpression471 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_CSSSTRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression524 = new BitSet(new long[]{0x00F000000043C000L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleimportExpression559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulepage652 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_26_in_rulepage670 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulepage705 = new BitSet(new long[]{0x00F000001043C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_rulepage740 = new BitSet(new long[]{0x00F000001043C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulepseudo_page864 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulepseudo_page891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulemedia984 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_30_in_rulemedia1002 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1024 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulemedia1036 = new BitSet(new long[]{0x00F000E09003C420L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1057 = new BitSet(new long[]{0x00F000E09003C420L});
    public static final BitSet FOLLOW_28_in_rulemedia1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1165 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list1186 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1213 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulemedium1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1418 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1431 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1443 = new BitSet(new long[]{0x00F000E08003C420L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1463 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleruleset1477 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_27_in_ruleruleset1490 = new BitSet(new long[]{0x00F000001003C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1512 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleruleset1525 = new BitSet(new long[]{0x00F000000003C080L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1546 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleruleset1561 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleruleset1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1679 = new BitSet(new long[]{0x0000180000001082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1702 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1714 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1756 = new BitSet(new long[]{0x00F018E08003D4A0L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1779 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1791 = new BitSet(new long[]{0x00F000E08003C4A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_entryRuleSimpleSelectorForNegation1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleSelectorForNegation1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_ruleSimpleSelectorForNegation1916 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_ruleSimpleSelectorForNegation1943 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation1965 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_ruleSimpleSelectorForNegation2004 = new BitSet(new long[]{0x0000002080000422L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_entryRuleSubSelectorForNegation2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelectorForNegation2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelectorForNegation2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelectorForNegation2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelectorForNegation2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_ruleSubSelectorForNegation2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_rulesimple_selector2282 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_rulesimple_selector2309 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2331 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_rulesimple_selector2360 = new BitSet(new long[]{0x00F000E08003C422L});
    public static final BitSet FOLLOW_ruleSubSelector_in_entryRuleSubSelector2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSelector2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_ruleSubSelector2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_ruleSubSelector2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_ruleSubSelector2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_ruleSubSelector2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSelector_in_entryRuleAttributeSelector2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSelector2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeSelector2630 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2651 = new BitSet(new long[]{0x0000001F00000300L});
    public static final BitSet FOLLOW_32_in_ruleAttributeSelector2672 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_33_in_ruleAttributeSelector2701 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_34_in_ruleAttributeSelector2730 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_35_in_ruleAttributeSelector2759 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_ruleAttributeSelector2787 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_ruleAttributeSelector2807 = new BitSet(new long[]{0x00F000000003C010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAttributeSelector2838 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_CSSSTRING_in_ruleAttributeSelector2853 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAttributeSelector2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSelector_in_entryRuleClassSelector2911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSelector2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClassSelector2967 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleClassSelector2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementSelector_in_entryRuleElementSelector3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementSelector3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleElementSelector3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniversalSelector_in_entryRuleUniversalSelector3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniversalSelector3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_ruleUniversalSelector3190 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUniversalSelector3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdSelector_in_entryRuleIdSelector3239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdSelector3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleIdSelector3294 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdSelector3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_namespace_prefix_in_entryRulecss_namespace_prefix3351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_namespace_prefix3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulecss_namespace_prefix3410 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38_in_rulecss_namespace_prefix3434 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulecss_namespace_prefix3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration3495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3546 = new BitSet(new long[]{0x00F000000003C080L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_declaration3568 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecss_declaration3580 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulecss_declaration3592 = new BitSet(new long[]{0x00F020200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulecss_declaration3612 = new BitSet(new long[]{0x00F020200007FCD2L});
    public static final BitSet FOLLOW_RULE_IMPORTANT_SYM_in_rulecss_declaration3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_rulecss_property3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidPropertyIdent_in_entryRuleValidPropertyIdent3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidPropertyIdent3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleValidPropertyIdent3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassOrFunc_in_entryRulePseudoClassOrFunc3879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassOrFunc3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_rulePseudoClassOrFunc3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_rulePseudoClassOrFunc3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClass_in_entryRulePseudoClass3998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClass4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClass4044 = new BitSet(new long[]{0x00F000000003C020L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClass4055 = new BitSet(new long[]{0x00F000000003C020L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_rulePseudoClass4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassName_in_entryRulePseudoClassName4113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassName4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassName4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePseudoClassFunction_in_entryRulePseudoClassFunction4203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePseudoClassFunction4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotFunctionCall_in_rulePseudoClassFunction4260 = new BitSet(new long[]{0x00F000E08003C420L});
    public static final BitSet FOLLOW_ruleSimpleSelectorForNegation_in_rulePseudoClassFunction4281 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePseudoClassFunction4312 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePseudoClassFunction4332 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePseudoClassFunction4344 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_rulePseudoClassFunction4365 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_40_in_rulePseudoClassFunction4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotFunctionCall_in_entryRuleNotFunctionCall4422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotFunctionCall4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleNotFunctionCall4477 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNotFunctionCall4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulecombinator4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulecombinator4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulecombinator4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_entryRuleSymbolTok4678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolTok4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSymbolTok4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSymbolTok4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_entryRuleWSTok4805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWSTok4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleWSTok4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_entryRuleStringTok4895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTok4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CSSSTRING_in_ruleStringTok4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_entryRuleNumberTok5003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberTok5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNum_in_ruleNumberTok5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_entryRuleUrlTok5112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlTok5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleUrlTok5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_entryRuleColorTok5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorTok5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHex_in_ruleColorTok5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_entryRuleIdentifierOrFuncTok5334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrFuncTok5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIdentifierOrFuncTok5403 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleIdentifierOrFuncTok5425 = new BitSet(new long[]{0x00F020200007F4D0L});
    public static final BitSet FOLLOW_ruleCssTok_in_ruleIdentifierOrFuncTok5446 = new BitSet(new long[]{0x00F021200007F4D0L});
    public static final BitSet FOLLOW_40_in_ruleIdentifierOrFuncTok5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCssTok_in_entryRuleCssTok5507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCssTok5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierOrFuncTok_in_ruleCssTok5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolTok_in_ruleCssTok5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWSTok_in_ruleCssTok5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTok_in_ruleCssTok5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberTok_in_ruleCssTok5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlTok_in_ruleCssTok5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorTok_in_ruleCssTok5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType5775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleURLType5826 = new BitSet(new long[]{0x1FFFD0788047F470L});
    public static final BitSet FOLLOW_ruleValidURL_in_ruleURLType5847 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleURLType5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_entryRuleValidURLSymbol5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURLSymbol5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleValidURLSymbol5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleValidURLSymbol5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleValidURLSymbol5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValidURLSymbol6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleValidURLSymbol6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValidURLSymbol6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValidURLSymbol6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleValidURLSymbol6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleValidURLSymbol6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleValidURLSymbol6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValidURLSymbol6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValidURLSymbol6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValidURLSymbol6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValidURLSymbol6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleValidURLSymbol6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleValidURLSymbol6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleValidURLSymbol6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValidURLSymbol6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleValidURLSymbol6334 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleValidURLSymbol6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_entryRuleKeywordHack6403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywordHack6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleKeywordHack6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleKeywordHack6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleKeywordHack6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleKeywordHack6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURL_in_entryRuleValidURL6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidURL6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CSSSTRING_in_ruleValidURL6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidURLSymbol_in_ruleValidURL6645 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleValidURL6678 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6704 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleValidURL6730 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6756 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_56_in_ruleValidURL6780 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_57_in_ruleValidURL6799 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_58_in_ruleValidURL6818 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_59_in_ruleValidURL6837 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_60_in_ruleValidURL6856 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleValidURL6878 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6899 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6925 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleValidURL6947 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleValidURL6973 = new BitSet(new long[]{0x1FFFD0788047F462L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier7033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier7089 = new BitSet(new long[]{0x00F000000003C000L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7112 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7138 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7164 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleIdentifier7197 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleIdentifier7267 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleIdentifier7293 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleIdentifier7319 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_ruleIdentifier7345 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleIdentifier7371 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_ruleIdentifier7404 = new BitSet(new long[]{0x00F000000007C002L});
    public static final BitSet FOLLOW_ruleNum_in_entryRuleNum7463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNum7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleNum7519 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleNum7545 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_ruleNum7567 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7588 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7624 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_37_in_ruleNum7654 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleNum7676 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleHex_in_entryRuleHex7732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHex7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASHMARK_in_ruleHex7783 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_ruleHex7820 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_ruleHex7846 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleSubSelectorForNegation_in_synpred1_InternalCssDsl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_synpred2_InternalCssDsl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_synpred2_InternalCssDsl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_HEX_LETTER_in_synpred2_InternalCssDsl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_NON_HEX_LETTER_in_synpred2_InternalCssDsl7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred2_InternalCssDsl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordHack_in_synpred2_InternalCssDsl7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred3_InternalCssDsl7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred4_InternalCssDsl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred5_InternalCssDsl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_INT_in_synpred6_InternalCssDsl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalCssDsl7799 = new BitSet(new long[]{0x0000000000000002L});

}