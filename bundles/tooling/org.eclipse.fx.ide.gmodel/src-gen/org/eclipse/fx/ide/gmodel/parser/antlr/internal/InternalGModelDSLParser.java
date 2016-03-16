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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'type'", "'extends'", "', '", "'map'", "'Int'", "'Double'", "'String'", "'Boolean'", "'[]'", "'='", "';'", "'.'"
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
    public String getGrammarFileName() { return "InternalGModelDSL.g"; }



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
    // InternalGModelDSL.g:67:1: entryRuleGModel returns [EObject current=null] : iv_ruleGModel= ruleGModel EOF ;
    public final EObject entryRuleGModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGModel = null;


        try {
            // InternalGModelDSL.g:68:2: (iv_ruleGModel= ruleGModel EOF )
            // InternalGModelDSL.g:69:2: iv_ruleGModel= ruleGModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGModel=ruleGModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:76:1: ruleGModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleGModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_typeList_3_0 = null;


         enterRule(); 
            
        try {
            // InternalGModelDSL.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' ) )
            // InternalGModelDSL.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' )
            {
            // InternalGModelDSL.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}' )
            // InternalGModelDSL.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_typeList_3_0= ruleGDomainElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGModelAccess().getPackageKeyword_0());
                  
            }
            // InternalGModelDSL.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalGModelDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalGModelDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // InternalGModelDSL.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.eclipse.fx.ide.gmodel.GModelDSL.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGModelAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalGModelDSL.g:106:1: ( (lv_typeList_3_0= ruleGDomainElement ) )+
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
            	    // InternalGModelDSL.g:107:1: (lv_typeList_3_0= ruleGDomainElement )
            	    {
            	    // InternalGModelDSL.g:107:1: (lv_typeList_3_0= ruleGDomainElement )
            	    // InternalGModelDSL.g:108:3: lv_typeList_3_0= ruleGDomainElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGModelAccess().getTypeListGDomainElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
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
            	              		"org.eclipse.fx.ide.gmodel.GModelDSL.GDomainElement");
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

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalGModelDSL.g:136:1: entryRuleGDomainElement returns [EObject current=null] : iv_ruleGDomainElement= ruleGDomainElement EOF ;
    public final EObject entryRuleGDomainElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDomainElement = null;


        try {
            // InternalGModelDSL.g:137:2: (iv_ruleGDomainElement= ruleGDomainElement EOF )
            // InternalGModelDSL.g:138:2: iv_ruleGDomainElement= ruleGDomainElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDomainElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGDomainElement=ruleGDomainElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDomainElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:145:1: ruleGDomainElement returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* ) otherlv_9= '}' ) ;
    public final EObject ruleGDomainElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_map_7_0 = null;

        EObject lv_propertyList_8_0 = null;


         enterRule(); 
            
        try {
            // InternalGModelDSL.g:148:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* ) otherlv_9= '}' ) )
            // InternalGModelDSL.g:149:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* ) otherlv_9= '}' )
            {
            // InternalGModelDSL.g:149:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* ) otherlv_9= '}' )
            // InternalGModelDSL.g:149:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGDomainElementAccess().getTypeKeyword_0());
                  
            }
            // InternalGModelDSL.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalGModelDSL.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // InternalGModelDSL.g:154:1: (lv_name_1_0= RULE_ID )
            // InternalGModelDSL.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalGModelDSL.g:171:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGModelDSL.g:171:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getGDomainElementAccess().getExtendsKeyword_2_0());
                          
                    }
                    // InternalGModelDSL.g:175:1: ( (otherlv_3= RULE_ID ) )
                    // InternalGModelDSL.g:176:1: (otherlv_3= RULE_ID )
                    {
                    // InternalGModelDSL.g:176:1: (otherlv_3= RULE_ID )
                    // InternalGModelDSL.g:177:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainElementRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getGDomainElementAccess().getSuperTypeListGDomainElementCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // InternalGModelDSL.g:188:2: (otherlv_4= ', ' ( (otherlv_5= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGModelDSL.g:188:4: otherlv_4= ', ' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getGDomainElementAccess().getCommaSpaceKeyword_2_2_0());
                    	          
                    	    }
                    	    // InternalGModelDSL.g:192:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalGModelDSL.g:193:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalGModelDSL.g:193:1: (otherlv_5= RULE_ID )
                    	    // InternalGModelDSL.g:194:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getGDomainElementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getGDomainElementAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalGModelDSL.g:209:1: ( ( (lv_map_7_0= ruleGDomainMap ) ) | ( (lv_propertyList_8_0= ruleGDomainProperty ) )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==13||(LA5_0>=18 && LA5_0<=21)) ) {
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
                    // InternalGModelDSL.g:209:2: ( (lv_map_7_0= ruleGDomainMap ) )
                    {
                    // InternalGModelDSL.g:209:2: ( (lv_map_7_0= ruleGDomainMap ) )
                    // InternalGModelDSL.g:210:1: (lv_map_7_0= ruleGDomainMap )
                    {
                    // InternalGModelDSL.g:210:1: (lv_map_7_0= ruleGDomainMap )
                    // InternalGModelDSL.g:211:3: lv_map_7_0= ruleGDomainMap
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGDomainElementAccess().getMapGDomainMapParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
                    lv_map_7_0=ruleGDomainMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGDomainElementRule());
                      	        }
                             		set(
                             			current, 
                             			"map",
                              		lv_map_7_0, 
                              		"org.eclipse.fx.ide.gmodel.GModelDSL.GDomainMap");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGModelDSL.g:228:6: ( (lv_propertyList_8_0= ruleGDomainProperty ) )*
                    {
                    // InternalGModelDSL.g:228:6: ( (lv_propertyList_8_0= ruleGDomainProperty ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||(LA4_0>=18 && LA4_0<=21)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGModelDSL.g:229:1: (lv_propertyList_8_0= ruleGDomainProperty )
                    	    {
                    	    // InternalGModelDSL.g:229:1: (lv_propertyList_8_0= ruleGDomainProperty )
                    	    // InternalGModelDSL.g:230:3: lv_propertyList_8_0= ruleGDomainProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGDomainElementAccess().getPropertyListGDomainPropertyParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_propertyList_8_0=ruleGDomainProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGDomainElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"propertyList",
                    	              		lv_propertyList_8_0, 
                    	              		"org.eclipse.fx.ide.gmodel.GModelDSL.GDomainProperty");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getGDomainElementAccess().getRightCurlyBracketKeyword_5());
                  
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


    // $ANTLR start "entryRuleGDomainMap"
    // InternalGModelDSL.g:258:1: entryRuleGDomainMap returns [EObject current=null] : iv_ruleGDomainMap= ruleGDomainMap EOF ;
    public final EObject entryRuleGDomainMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDomainMap = null;


        try {
            // InternalGModelDSL.g:259:2: (iv_ruleGDomainMap= ruleGDomainMap EOF )
            // InternalGModelDSL.g:260:2: iv_ruleGDomainMap= ruleGDomainMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDomainMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGDomainMap=ruleGDomainMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDomainMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGDomainMap"


    // $ANTLR start "ruleGDomainMap"
    // InternalGModelDSL.g:267:1: ruleGDomainMap returns [EObject current=null] : (otherlv_0= 'map' ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGDomainMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_builtIn_1_1=null;
        Token lv_builtIn_1_2=null;
        Token lv_builtIn_1_3=null;
        Token lv_builtIn_1_4=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalGModelDSL.g:270:28: ( (otherlv_0= 'map' ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalGModelDSL.g:271:1: (otherlv_0= 'map' ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalGModelDSL.g:271:1: (otherlv_0= 'map' ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalGModelDSL.g:271:3: otherlv_0= 'map' ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGDomainMapAccess().getMapKeyword_0());
                  
            }
            // InternalGModelDSL.g:275:1: ( ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=18 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
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
                    // InternalGModelDSL.g:275:2: ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) )
                    {
                    // InternalGModelDSL.g:275:2: ( ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) ) )
                    // InternalGModelDSL.g:276:1: ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) )
                    {
                    // InternalGModelDSL.g:276:1: ( (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' ) )
                    // InternalGModelDSL.g:277:1: (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' )
                    {
                    // InternalGModelDSL.g:277:1: (lv_builtIn_1_1= 'Int' | lv_builtIn_1_2= 'Double' | lv_builtIn_1_3= 'String' | lv_builtIn_1_4= 'Boolean' )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt6=1;
                        }
                        break;
                    case 19:
                        {
                        alt6=2;
                        }
                        break;
                    case 20:
                        {
                        alt6=3;
                        }
                        break;
                    case 21:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalGModelDSL.g:278:3: lv_builtIn_1_1= 'Int'
                            {
                            lv_builtIn_1_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_1_1, grammarAccess.getGDomainMapAccess().getBuiltInIntKeyword_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainMapRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalGModelDSL.g:290:8: lv_builtIn_1_2= 'Double'
                            {
                            lv_builtIn_1_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_1_2, grammarAccess.getGDomainMapAccess().getBuiltInDoubleKeyword_1_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainMapRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_1_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // InternalGModelDSL.g:302:8: lv_builtIn_1_3= 'String'
                            {
                            lv_builtIn_1_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_1_3, grammarAccess.getGDomainMapAccess().getBuiltInStringKeyword_1_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainMapRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_1_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // InternalGModelDSL.g:314:8: lv_builtIn_1_4= 'Boolean'
                            {
                            lv_builtIn_1_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_builtIn_1_4, grammarAccess.getGDomainMapAccess().getBuiltInBooleanKeyword_1_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getGDomainMapRule());
                              	        }
                                     		setWithLastConsumed(current, "builtIn", lv_builtIn_1_4, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGModelDSL.g:330:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalGModelDSL.g:330:6: ( (otherlv_2= RULE_ID ) )
                    // InternalGModelDSL.g:331:1: (otherlv_2= RULE_ID )
                    {
                    // InternalGModelDSL.g:331:1: (otherlv_2= RULE_ID )
                    // InternalGModelDSL.g:332:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainMapRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getGDomainMapAccess().getRefGDomainElementCrossReference_1_1_0()); 
                      	
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
        }
        return current;
    }
    // $ANTLR end "ruleGDomainMap"


    // $ANTLR start "entryRuleGDomainProperty"
    // InternalGModelDSL.g:351:1: entryRuleGDomainProperty returns [EObject current=null] : iv_ruleGDomainProperty= ruleGDomainProperty EOF ;
    public final EObject entryRuleGDomainProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDomainProperty = null;


        try {
            // InternalGModelDSL.g:352:2: (iv_ruleGDomainProperty= ruleGDomainProperty EOF )
            // InternalGModelDSL.g:353:2: iv_ruleGDomainProperty= ruleGDomainProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDomainPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGDomainProperty=ruleGDomainProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDomainProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:360:1: ruleGDomainProperty returns [EObject current=null] : ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) ;
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
            // InternalGModelDSL.g:363:28: ( ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' ) )
            // InternalGModelDSL.g:364:1: ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            {
            // InternalGModelDSL.g:364:1: ( ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';' )
            // InternalGModelDSL.g:364:2: ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) ) otherlv_8= ';'
            {
            // InternalGModelDSL.g:364:2: ( ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? ) | ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=21)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
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
                    // InternalGModelDSL.g:364:3: ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? )
                    {
                    // InternalGModelDSL.g:364:3: ( ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )? )
                    // InternalGModelDSL.g:364:4: ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) ) ( (lv_list_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )?
                    {
                    // InternalGModelDSL.g:364:4: ( ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) ) )
                    // InternalGModelDSL.g:365:1: ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) )
                    {
                    // InternalGModelDSL.g:365:1: ( (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' ) )
                    // InternalGModelDSL.g:366:1: (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' )
                    {
                    // InternalGModelDSL.g:366:1: (lv_builtIn_0_1= 'Int' | lv_builtIn_0_2= 'Double' | lv_builtIn_0_3= 'String' | lv_builtIn_0_4= 'Boolean' )
                    int alt8=4;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt8=1;
                        }
                        break;
                    case 19:
                        {
                        alt8=2;
                        }
                        break;
                    case 20:
                        {
                        alt8=3;
                        }
                        break;
                    case 21:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalGModelDSL.g:367:3: lv_builtIn_0_1= 'Int'
                            {
                            lv_builtIn_0_1=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
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
                            // InternalGModelDSL.g:379:8: lv_builtIn_0_2= 'Double'
                            {
                            lv_builtIn_0_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
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
                            // InternalGModelDSL.g:391:8: lv_builtIn_0_3= 'String'
                            {
                            lv_builtIn_0_3=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
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
                            // InternalGModelDSL.g:403:8: lv_builtIn_0_4= 'Boolean'
                            {
                            lv_builtIn_0_4=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
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

                    // InternalGModelDSL.g:418:2: ( (lv_list_1_0= '[]' ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==22) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGModelDSL.g:419:1: (lv_list_1_0= '[]' )
                            {
                            // InternalGModelDSL.g:419:1: (lv_list_1_0= '[]' )
                            // InternalGModelDSL.g:420:3: lv_list_1_0= '[]'
                            {
                            lv_list_1_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
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

                    // InternalGModelDSL.g:433:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalGModelDSL.g:434:1: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGModelDSL.g:434:1: (lv_name_2_0= RULE_ID )
                    // InternalGModelDSL.g:435:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    // InternalGModelDSL.g:451:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGModelDSL.g:451:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleGDefault ) )
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getGDomainPropertyAccess().getEqualsSignKeyword_0_0_3_0());
                                  
                            }
                            // InternalGModelDSL.g:455:1: ( (lv_defaultValue_4_0= ruleGDefault ) )
                            // InternalGModelDSL.g:456:1: (lv_defaultValue_4_0= ruleGDefault )
                            {
                            // InternalGModelDSL.g:456:1: (lv_defaultValue_4_0= ruleGDefault )
                            // InternalGModelDSL.g:457:3: lv_defaultValue_4_0= ruleGDefault
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getGDomainPropertyAccess().getDefaultValueGDefaultParserRuleCall_0_0_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_16);
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
                                      		"org.eclipse.fx.ide.gmodel.GModelDSL.GDefault");
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
                    // InternalGModelDSL.g:474:6: ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) )
                    {
                    // InternalGModelDSL.g:474:6: ( ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) ) )
                    // InternalGModelDSL.g:474:7: ( (otherlv_5= RULE_ID ) ) ( (lv_list_6_0= '[]' ) )? ( (lv_name_7_0= RULE_ID ) )
                    {
                    // InternalGModelDSL.g:474:7: ( (otherlv_5= RULE_ID ) )
                    // InternalGModelDSL.g:475:1: (otherlv_5= RULE_ID )
                    {
                    // InternalGModelDSL.g:475:1: (otherlv_5= RULE_ID )
                    // InternalGModelDSL.g:476:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGDomainPropertyRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getGDomainPropertyAccess().getRefGDomainElementCrossReference_0_1_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalGModelDSL.g:487:2: ( (lv_list_6_0= '[]' ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGModelDSL.g:488:1: (lv_list_6_0= '[]' )
                            {
                            // InternalGModelDSL.g:488:1: (lv_list_6_0= '[]' )
                            // InternalGModelDSL.g:489:3: lv_list_6_0= '[]'
                            {
                            lv_list_6_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
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

                    // InternalGModelDSL.g:502:3: ( (lv_name_7_0= RULE_ID ) )
                    // InternalGModelDSL.g:503:1: (lv_name_7_0= RULE_ID )
                    {
                    // InternalGModelDSL.g:503:1: (lv_name_7_0= RULE_ID )
                    // InternalGModelDSL.g:504:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalGModelDSL.g:532:1: entryRuleGDefault returns [EObject current=null] : iv_ruleGDefault= ruleGDefault EOF ;
    public final EObject entryRuleGDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDefault = null;


        try {
            // InternalGModelDSL.g:533:2: (iv_ruleGDefault= ruleGDefault EOF )
            // InternalGModelDSL.g:534:2: iv_ruleGDefault= ruleGDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGDefault=ruleGDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGDefault; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:541:1: ruleGDefault returns [EObject current=null] : ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGDefault() throws RecognitionException {
        EObject current = null;

        Token lv_stringVal_0_0=null;
        Token lv_intVal_1_0=null;

         enterRule(); 
            
        try {
            // InternalGModelDSL.g:544:28: ( ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) ) )
            // InternalGModelDSL.g:545:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) )
            {
            // InternalGModelDSL.g:545:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_intVal_1_0= RULE_INT ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
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
                    // InternalGModelDSL.g:545:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    {
                    // InternalGModelDSL.g:545:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    // InternalGModelDSL.g:546:1: (lv_stringVal_0_0= RULE_STRING )
                    {
                    // InternalGModelDSL.g:546:1: (lv_stringVal_0_0= RULE_STRING )
                    // InternalGModelDSL.g:547:3: lv_stringVal_0_0= RULE_STRING
                    {
                    lv_stringVal_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGModelDSL.g:564:6: ( (lv_intVal_1_0= RULE_INT ) )
                    {
                    // InternalGModelDSL.g:564:6: ( (lv_intVal_1_0= RULE_INT ) )
                    // InternalGModelDSL.g:565:1: (lv_intVal_1_0= RULE_INT )
                    {
                    // InternalGModelDSL.g:565:1: (lv_intVal_1_0= RULE_INT )
                    // InternalGModelDSL.g:566:3: lv_intVal_1_0= RULE_INT
                    {
                    lv_intVal_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
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
    // InternalGModelDSL.g:590:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalGModelDSL.g:591:2: (iv_ruleValidID= ruleValidID EOF )
            // InternalGModelDSL.g:592:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:599:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalGModelDSL.g:602:28: (this_ID_0= RULE_ID )
            // InternalGModelDSL.g:603:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalGModelDSL.g:618:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGModelDSL.g:619:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGModelDSL.g:620:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGModelDSL.g:627:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // InternalGModelDSL.g:630:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalGModelDSL.g:631:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalGModelDSL.g:631:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalGModelDSL.g:632:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_17);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalGModelDSL.g:642:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) && (synpred1_InternalGModelDSL())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGModelDSL.g:642:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalGModelDSL.g:642:2: ( ( '.' )=>kw= '.' )
            	    // InternalGModelDSL.g:642:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_17);
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
            	    break loop14;
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
        // InternalGModelDSL.g:642:3: ( '.' )
        // InternalGModelDSL.g:643:2: '.'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E2010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C2010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});

}