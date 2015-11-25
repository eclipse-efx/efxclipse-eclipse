package org.eclipse.fx.ide.gmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.fx.ide.gmodel.services.GModelDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGModelDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'type'", "'extends'", "', '", "'Int'", "'Double'", "'String'", "'Boolean'", "'[]'", "'='", "';'", "'.'"
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
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g"; }



     	private GModelDSLGrammarAccess grammarAccess;
     	
        public InternalGModelDSLParser(TokenStream input, GModelDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GModel";	
       	}
       	
       	@Override
       	protected GModelDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGModel"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:67:1: entryRuleGModel returns [EObject current=null] : iv_ruleGModel= ruleGModel EOF ;
    public final EObject entryRuleGModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGModel = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:68:2: (iv_ruleGModel= ruleGModel EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:69:2: iv_ruleGModel= ruleGModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGModelRule()); 
            }
            pushFollow(FOLLOW_ruleGModel_in_entryRuleGModel75);
            iv_ruleGModel=ruleGModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGModel"


    // $ANTLR start "ruleGModel"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:76:1: ruleGModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_typeList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGModelAccess().getPackageKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGModelRule());
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGModel155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGModelAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:106:1: ( (lv_typeList_3_0= ruleGDomainElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:107:1: (lv_typeList_3_0= ruleGDomainElement )
            	    {
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:107:1: (lv_typeList_3_0= ruleGDomainElement )
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:108:3: lv_typeList_3_0= ruleGDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGModelAccess().getTypeListGDomainElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGDomainElement_in_ruleGModel176);
            	    lv_typeList_3_0=ruleGDomainElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeList",
            	              		lv_typeList_3_0, 
            	              		"GDomainElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGModel189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGModelAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleGModel"


    // $ANTLR start "entryRuleGDomainElement"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:136:1: entryRuleGDomainElement returns [EObject current=null] : iv_ruleGDomainElement= ruleGDomainElement EOF ;
    public final EObject entryRuleGDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDomainElement = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:137:2: (iv_ruleGDomainElement= ruleGDomainElement EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:138:2: iv_ruleGDomainElement= ruleGDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDomainElementRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainElement_in_entryRuleGDomainElement225);
            iv_ruleGDomainElement=ruleGDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDomainElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainElement235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDomainElement"


    // $ANTLR start "ruleGDomainElement"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:145:1: ruleGDomainElement returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_propertyList_7_0= ruleGDomainProperty ) )* otherlv_8= '}' ) ;
    public final EObject ruleGDomainElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_propertyList_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:148:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_propertyList_7_0= ruleGDomainProperty ) )* otherlv_8= '}' ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:149:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_propertyList_7_0= ruleGDomainProperty ) )* otherlv_8= '}' )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:149:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_propertyList_7_0= ruleGDomainProperty ) )* otherlv_8= '}' )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:149:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( (lv_propertyList_7_0= ruleGDomainProperty ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGDomainElement272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGDomainElementAccess().getTypeKeyword_0());
                  
            }
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:154:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainElement289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGDomainElementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGDomainElementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:171:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:171:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleGDomainElement307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getGDomainElementAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:175:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:176:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:176:1: (otherlv_3= RULE_ID )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:177:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainElementRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainElement327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:188:2: (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:188:4: otherlv_4= ', ' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleGDomainElement340); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getGDomainElementAccess().getCommaSpaceKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:192:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:193:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:193:1: (otherlv_5= RULE_ID )
                    	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:194:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getGDomainElementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainElement360); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleGDomainElement376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGDomainElementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:209:1: ( (lv_propertyList_7_0= ruleGDomainProperty ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=17 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:210:1: (lv_propertyList_7_0= ruleGDomainProperty )
            	    {
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:210:1: (lv_propertyList_7_0= ruleGDomainProperty )
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:211:3: lv_propertyList_7_0= ruleGDomainProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGDomainProperty_in_ruleGDomainElement397);
            	    lv_propertyList_7_0=ruleGDomainProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGDomainElementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"propertyList",
            	              		lv_propertyList_7_0, 
            	              		"GDomainProperty");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleGDomainElement410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGDomainElementAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleGDomainElement"


    // $ANTLR start "entryRuleGDomainProperty"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:239:1: entryRuleGDomainProperty returns [EObject current=null] : iv_ruleGDomainProperty= ruleGDomainProperty EOF ;
    public final EObject entryRuleGDomainProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDomainProperty = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:240:2: (iv_ruleGDomainProperty= ruleGDomainProperty EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:241:2: iv_ruleGDomainProperty= ruleGDomainProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDomainPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty446);
            iv_ruleGDomainProperty=ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDomainProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDomainProperty456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDomainProperty"


    // $ANTLR start "ruleGDomainProperty"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:248:1: ruleGDomainProperty returns [EObject current=null] : ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) ;
    public final EObject ruleGDomainProperty() throws RecognitionException {
        EObject current = null;

        Token lv_builtIn_0_1=null;
        Token lv_builtIn_0_2=null;
        Token lv_builtIn_0_3=null;
        Token lv_builtIn_0_4=null;
        Token lv_list_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_list_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:251:28: ( ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:1: ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:1: ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:2: ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';'
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:2: ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=17 && LA9_0<=20)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:3: ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:3: ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:4: ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )?
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:252:4: ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:253:1: ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:253:1: ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:254:1: (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:254:1: (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt5=1;
                        }
                        break;
                    case 18:
                        {
                        alt5=2;
                        }
                        break;
                    case 19:
                        {
                        alt5=3;
                        }
                        break;
                    case 20:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:255:3: lv_builtIn_0_1= 'Int'
                            {
                            lv_builtIn_0_1=(Token)match(input,17,FOLLOW_17_in_ruleGDomainProperty503); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_0_1, grammarAccess.getGDomainPropertyAccess().getBuiltInIntKeyword_0_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_0_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:267:8: lv_builtIn_0_2= 'Double'
                            {
                            lv_builtIn_0_2=(Token)match(input,18,FOLLOW_18_in_ruleGDomainProperty532); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_0_2, grammarAccess.getGDomainPropertyAccess().getBuiltInDoubleKeyword_0_0_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:279:8: lv_builtIn_0_3= 'String'
                            {
                            lv_builtIn_0_3=(Token)match(input,19,FOLLOW_19_in_ruleGDomainProperty561); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_0_3, grammarAccess.getGDomainPropertyAccess().getBuiltInStringKeyword_0_0_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_0_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:291:8: lv_builtIn_0_4= 'Boolean'
                            {
                            lv_builtIn_0_4=(Token)match(input,20,FOLLOW_20_in_ruleGDomainProperty590); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_0_4, grammarAccess.getGDomainPropertyAccess().getBuiltInBooleanKeyword_0_0_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_0_4, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:306:2: ( (lv_list_1_0= '[]' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:307:1: (lv_list_1_0= '[]' )
                            {
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:307:1: (lv_list_1_0= '[]' )
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:308:3: lv_list_1_0= '[]'
                            {
                            lv_list_1_0=(Token)match(input,21,FOLLOW_21_in_ruleGDomainProperty624); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_list_1_0, grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "list", true, "[]");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:321:3: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:322:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:322:1: (lv_name_2_0= RULE_ID )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:323:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainProperty655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:339:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:339:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) )
                            {
                            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleGDomainProperty673); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getGDomainPropertyAccess().getEqualsSignKeyword_0_0_3_0());
                                  
                            }
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:343:1: ( (lv_defaultValue_4_0= ruleGDefault ) )
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:344:1: (lv_defaultValue_4_0= ruleGDefault )
                            {
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:344:1: (lv_defaultValue_4_0= ruleGDefault )
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:345:3: lv_defaultValue_4_0= ruleGDefault
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGDomainPropertyAccess().getDefaultValueGDefaultParserRuleCall_0_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleGDefault_in_ruleGDomainProperty694);
                            lv_defaultValue_4_0=ruleGDefault();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"defaultValue",
                                      		lv_defaultValue_4_0, 
                                      		"GDefault");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:362:6: ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:362:6: ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:362:7: ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:362:7: ( (otherlv_5= RULE_ID ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:363:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:363:1: (otherlv_5= RULE_ID )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:364:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainProperty724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getGDomainPropertyAccess().getRefGDomainElementCrossReference_0_1_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:375:2: ( (lv_list_6_0= '[]' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:376:1: (lv_list_6_0= '[]' )
                            {
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:376:1: (lv_list_6_0= '[]' )
                            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:377:3: lv_list_6_0= '[]'
                            {
                            lv_list_6_0=(Token)match(input,21,FOLLOW_21_in_ruleGDomainProperty742); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_list_6_0, grammarAccess.getGDomainPropertyAccess().getListLeftSquareBracketRightSquareBracketKeyword_0_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "list", true, "[]");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:390:3: ( (lv_name_7_0= RULE_ID ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:391:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:391:1: (lv_name_7_0= RULE_ID )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:392:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGDomainProperty773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getGDomainPropertyAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleGDomainProperty792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGDomainPropertyAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleGDomainProperty"


    // $ANTLR start "entryRuleGDefault"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:420:1: entryRuleGDefault returns [EObject current=null] : iv_ruleGDefault= ruleGDefault EOF ;
    public final EObject entryRuleGDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDefault = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:421:2: (iv_ruleGDefault= ruleGDefault EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:422:2: iv_ruleGDefault= ruleGDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleGDefault_in_entryRuleGDefault828);
            iv_ruleGDefault=ruleGDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGDefault838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDefault"


    // $ANTLR start "ruleGDefault"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:429:1: ruleGDefault returns [EObject current=null] : ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGDefault() throws RecognitionException {
        EObject current = null;

        Token lv_stringVal_0_0=null;
        Token lv_intVal_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:432:28: ( ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:433:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:433:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
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
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:433:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:433:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:434:1: (lv_stringVal_0_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:434:1: (lv_stringVal_0_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:435:3: lv_stringVal_0_0= RULE_STRING
                    {
                    lv_stringVal_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGDefault880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringVal_0_0, grammarAccess.getGDefaultAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDefaultRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringVal",
                              		lv_stringVal_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:452:6: ( (lv_intVal_1_0= RULE_INT ) )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:452:6: ( (lv_intVal_1_0= RULE_INT ) )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:453:1: (lv_intVal_1_0= RULE_INT )
                    {
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:453:1: (lv_intVal_1_0= RULE_INT )
                    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:454:3: lv_intVal_1_0= RULE_INT
                    {
                    lv_intVal_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGDefault908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_intVal_1_0, grammarAccess.getGDefaultAccess().getIntValINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDefaultRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"intVal",
                              		lv_intVal_1_0, 
                              		"INT");
                      	    
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
    // $ANTLR end "ruleGDefault"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:478:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:479:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:480:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID950);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID961); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:487:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:490:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:491:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID1000); if (state.failed) return current;
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
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:506:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:507:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:508:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1045);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1056); if (state.failed) return current;

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
    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:515:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:518:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:519:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:519:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:520:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1103);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:530:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) && (synpred1_InternalGModelDSL())) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:530:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:530:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:530:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedName1131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName1154);
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
            	    break loop11;
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

    // $ANTLR start synpred1_InternalGModelDSL
    public final void synpred1_InternalGModelDSL_fragment() throws RecognitionException {   
        // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:530:3: ( '.' )
        // ../org.eclipse.fx.ide.gmodel/src-gen/org/eclipse/fx/ide/gmodel/parser/antlr/internal/InternalGModelDSL.g:531:2: '.'
        {
        match(input,24,FOLLOW_24_in_synpred1_InternalGModelDSL1122); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGModelDSL

    // Delegated rules

    public final boolean synpred1_InternalGModelDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGModelDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleGModel_in_entryRuleGModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGModel143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGModel155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleGDomainElement_in_ruleGModel176 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleGModel189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainElement_in_entryRuleGDomainElement225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainElement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGDomainElement272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainElement289 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleGDomainElement307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainElement327 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleGDomainElement340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainElement360 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleGDomainElement376 = new BitSet(new long[]{0x00000000001E2010L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_ruleGDomainElement397 = new BitSet(new long[]{0x00000000001E2010L});
    public static final BitSet FOLLOW_13_in_ruleGDomainElement410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDomainProperty_in_entryRuleGDomainProperty446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDomainProperty456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGDomainProperty503 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18_in_ruleGDomainProperty532 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_19_in_ruleGDomainProperty561 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20_in_ruleGDomainProperty590 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleGDomainProperty624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainProperty655 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleGDomainProperty673 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleGDefault_in_ruleGDomainProperty694 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainProperty724 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleGDomainProperty742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGDomainProperty773 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGDomainProperty792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGDefault_in_entryRuleGDefault828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGDefault838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGDefault880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGDefault908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1103 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedName1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName1154 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_synpred1_InternalGModelDSL1122 = new BitSet(new long[]{0x0000000000000002L});

}