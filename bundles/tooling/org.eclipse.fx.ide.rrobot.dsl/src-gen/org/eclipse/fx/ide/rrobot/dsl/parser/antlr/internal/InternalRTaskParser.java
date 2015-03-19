package org.eclipse.fx.ide.rrobot.dsl.parser.antlr.internal; 

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
import org.eclipse.fx.ide.rrobot.dsl.services.RTaskGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRTaskParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_DOC", "RULE_STRING", "RULE_ID", "RULE_INLINE_SCRIPT", "RULE_SIGNED_INT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotTask'", "'{'", "'variables'", "'='", "','", "'}'", "'projects'", "'default'", "'SimpleProject'", "'resources'", "'excluded-if'", "'Folder'", "'children'", "'TemplatedFile'", "'generatorType'", "'DataFile'", "'content'", "'URLFile'", "'DynamicFile'", "'generated-from'", "'by'", "'ComponentDefinition'", "'name'", "'class'", "'services'", "'references'", "'bind'", "'unbind'", "'cardinality'", "'policy'", "'BundleProject'", "'manifest'", "'build'", "'pluginxml'", "'rootfragments'", "'compilation-units'", "'fragment'", "'in'", "'FeatureProject'", "'feature'", "'lazy'", "'singleton'", "'ManifestFile'", "'bundlename'", "'vendor'", "'activatorClass'", "'exportedPackages'", "'importedPackages'", "'requiredBundles'", "'PluginXMLFile'", "'extensions'", "'BuildProperties'", "'binIncludes'", "'launchable'", "'ProductFileFeaturebase'", "'vmArgs'", "'programArgs'", "'productName'", "'application'", "'version'", "'startconfigurations'", "'features'", "'FeatureFile'", "'featurename'", "'description'", "'copyright'", "'license'", "'license-feature'", "'license-feature-version'", "'plugins'", "'required'", "'included'", "'('", "'['", "')'", "']'", "'id'", "'elements'", "'attributes'", "'LinkedString'", "'unpacked'", "'autostarted'", "'at'", "'.'", "'BOOLEAN'", "'DOUBLE'", "'INT'", "'STRING'", "'SINGLE_OPTIONAL'", "'SINGLE_REQUIRED'", "'MULTI_OPTIONAL'", "'MULTI_REQUIRED'", "'DYNAMIC'", "'STATIC'", "'none'", "'equivalent'", "'compatible'", "'perfect'", "'greaterOrEqual'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SIGNED_INT=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_INLINE_SCRIPT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_DOC=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalRTaskParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRTaskParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRTaskParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g"; }



     	private RTaskGrammarAccess grammarAccess;
     	
        public InternalRTaskParser(TokenStream input, RTaskGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RobotTask";	
       	}
       	
       	@Override
       	protected RTaskGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRobotTask"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:68:1: entryRuleRobotTask returns [EObject current=null] : iv_ruleRobotTask= ruleRobotTask EOF ;
    public final EObject entryRuleRobotTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotTask = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:69:2: (iv_ruleRobotTask= ruleRobotTask EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:70:2: iv_ruleRobotTask= ruleRobotTask EOF
            {
             newCompositeNode(grammarAccess.getRobotTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRobotTask_in_entryRuleRobotTask75);
            iv_ruleRobotTask=ruleRobotTask();

            state._fsp--;

             current =iv_ruleRobotTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRobotTask85); 

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
    // $ANTLR end "entryRuleRobotTask"


    // $ANTLR start "ruleRobotTask"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:77:1: ruleRobotTask returns [EObject current=null] : ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleRobotTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_variables_6_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_projects_13_0 = null;

        EObject lv_projects_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:80:28: ( ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:1: ( () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: () otherlv_1= 'RobotTask' otherlv_2= '{' (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )? (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:81:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRobotTaskAccess().getRobotTaskAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRobotTask131); 

                	newLeafNode(otherlv_1, grammarAccess.getRobotTaskAccess().getRobotTaskKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask143); 

                	newLeafNode(otherlv_2, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:1: (otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:95:3: otherlv_3= 'variables' otherlv_4= '=' otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRobotTask156); 

                        	newLeafNode(otherlv_3, grammarAccess.getRobotTaskAccess().getVariablesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask168); 

                        	newLeafNode(otherlv_4, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask180); 

                        	newLeafNode(otherlv_5, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:107:1: ( (lv_variables_6_0= ruleVariable ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_variables_6_0= ruleVariable )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:108:1: (lv_variables_6_0= ruleVariable )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:109:3: lv_variables_6_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getVariablesVariableParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRobotTask201);
                    lv_variables_6_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_6_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:2: (otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:125:4: otherlv_7= ',' ( (lv_variables_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask214); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRobotTaskAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:129:1: ( (lv_variables_8_0= ruleVariable ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_variables_8_0= ruleVariable )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:130:1: (lv_variables_8_0= ruleVariable )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:131:3: lv_variables_8_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getVariablesVariableParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRobotTask235);
                    	    lv_variables_8_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_8_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask249); 

                        	newLeafNode(otherlv_9, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:3: (otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:151:5: otherlv_10= 'projects' otherlv_11= '=' otherlv_12= '{' ( (lv_projects_13_0= ruleGenericProject ) ) (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRobotTask264); 

                        	newLeafNode(otherlv_10, grammarAccess.getRobotTaskAccess().getProjectsKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRobotTask276); 

                        	newLeafNode(otherlv_11, grammarAccess.getRobotTaskAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRobotTask288); 

                        	newLeafNode(otherlv_12, grammarAccess.getRobotTaskAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:163:1: ( (lv_projects_13_0= ruleGenericProject ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:164:1: (lv_projects_13_0= ruleGenericProject )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:164:1: (lv_projects_13_0= ruleGenericProject )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:165:3: lv_projects_13_0= ruleGenericProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask309);
                    lv_projects_13_0=ruleGenericProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_13_0, 
                            		"GenericProject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:181:2: (otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:181:4: otherlv_14= ',' ( (lv_projects_15_0= ruleGenericProject ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRobotTask322); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getRobotTaskAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:185:1: ( (lv_projects_15_0= ruleGenericProject ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:186:1: (lv_projects_15_0= ruleGenericProject )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:186:1: (lv_projects_15_0= ruleGenericProject )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:187:3: lv_projects_15_0= ruleGenericProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRobotTaskAccess().getProjectsGenericProjectParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_ruleRobotTask343);
                    	    lv_projects_15_0=ruleGenericProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRobotTaskRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_15_0, 
                    	            		"GenericProject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask357); 

                        	newLeafNode(otherlv_16, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRobotTask371); 

                	newLeafNode(otherlv_17, grammarAccess.getRobotTaskAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotTask"


    // $ANTLR start "entryRuleVariable"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:219:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:220:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:221:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable407);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable417); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:228:1: ruleVariable returns [EObject current=null] : ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_defaultValue_4_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:231:28: ( ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:1: ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:1: ( ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:2: ( (lv_description_0_0= RULE_SL_DOC ) ) ( (lv_type_1_0= ruleType ) ) ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:232:2: ( (lv_description_0_0= RULE_SL_DOC ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:233:1: (lv_description_0_0= RULE_SL_DOC )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:233:1: (lv_description_0_0= RULE_SL_DOC )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:234:3: lv_description_0_0= RULE_SL_DOC
            {
            lv_description_0_0=(Token)match(input,RULE_SL_DOC,FollowSets000.FOLLOW_RULE_SL_DOC_in_ruleVariable459); 

            			newLeafNode(lv_description_0_0, grammarAccess.getVariableAccess().getDescriptionSL_DOCTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_0_0, 
                    		"SL_DOC");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:250:2: ( (lv_type_1_0= ruleType ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:251:1: (lv_type_1_0= ruleType )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:251:1: (lv_type_1_0= ruleType )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:252:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleVariable485);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:268:2: ( (lv_key_2_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:269:1: (lv_key_2_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:269:1: (lv_key_2_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:270:3: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable502); 

            			newLeafNode(lv_key_2_0, grammarAccess.getVariableAccess().getKeySTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:286:2: (otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:286:4: otherlv_3= 'default' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariable520); 

                        	newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getDefaultKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:290:1: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:291:1: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:291:1: (lv_defaultValue_4_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:292:3: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable537); 

                    			newLeafNode(lv_defaultValue_4_0, grammarAccess.getVariableAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleGenericProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:316:1: entryRuleGenericProject returns [EObject current=null] : iv_ruleGenericProject= ruleGenericProject EOF ;
    public final EObject entryRuleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericProject = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:317:2: (iv_ruleGenericProject= ruleGenericProject EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:318:2: iv_ruleGenericProject= ruleGenericProject EOF
            {
             newCompositeNode(grammarAccess.getGenericProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericProject_in_entryRuleGenericProject580);
            iv_ruleGenericProject=ruleGenericProject();

            state._fsp--;

             current =iv_ruleGenericProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericProject590); 

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
    // $ANTLR end "entryRuleGenericProject"


    // $ANTLR start "ruleGenericProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:325:1: ruleGenericProject returns [EObject current=null] : (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) ;
    public final EObject ruleGenericProject() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_BundleProject_1 = null;

        EObject this_FeatureProject_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:328:28: ( (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:329:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:329:1: (this_Project_0= ruleProject | this_BundleProject_1= ruleBundleProject | this_FeatureProject_2= ruleFeatureProject )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 52:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:330:5: this_Project_0= ruleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getProjectParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProject_in_ruleGenericProject637);
                    this_Project_0=ruleProject();

                    state._fsp--;

                     
                            current = this_Project_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:340:5: this_BundleProject_1= ruleBundleProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getBundleProjectParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_ruleGenericProject664);
                    this_BundleProject_1=ruleBundleProject();

                    state._fsp--;

                     
                            current = this_BundleProject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:350:5: this_FeatureProject_2= ruleFeatureProject
                    {
                     
                            newCompositeNode(grammarAccess.getGenericProjectAccess().getFeatureProjectParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_ruleGenericProject691);
                    this_FeatureProject_2=ruleFeatureProject();

                    state._fsp--;

                     
                            current = this_FeatureProject_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericProject"


    // $ANTLR start "entryRuleResource"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:366:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:367:2: (iv_ruleResource= ruleResource EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:368:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResource_in_entryRuleResource726);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResource736); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:375:1: ruleResource returns [EObject current=null] : (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile | this_ComponentDefinitionFile_8= ruleComponentDefinitionFile ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Folder_0 = null;

        EObject this_TemplatedFile_1 = null;

        EObject this_DataFile_2 = null;

        EObject this_URLFile_3 = null;

        EObject this_DynamicFile_4 = null;

        EObject this_ManifestFile_5 = null;

        EObject this_ProductFileFeaturebase_6 = null;

        EObject this_PluginXMLFile_7 = null;

        EObject this_ComponentDefinitionFile_8 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:378:28: ( (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile | this_ComponentDefinitionFile_8= ruleComponentDefinitionFile ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:379:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile | this_ComponentDefinitionFile_8= ruleComponentDefinitionFile )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:379:1: (this_Folder_0= ruleFolder | this_TemplatedFile_1= ruleTemplatedFile | this_DataFile_2= ruleDataFile | this_URLFile_3= ruleURLFile | this_DynamicFile_4= ruleDynamicFile | this_ManifestFile_5= ruleManifestFile | this_ProductFileFeaturebase_6= ruleProductFileFeaturebase | this_PluginXMLFile_7= rulePluginXMLFile | this_ComponentDefinitionFile_8= ruleComponentDefinitionFile )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            case 54:
            case 55:
            case 56:
                {
                alt7=6;
                }
                break;
            case 67:
            case 68:
                {
                alt7=7;
                }
                break;
            case 63:
                {
                alt7=8;
                }
                break;
            case 35:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:380:5: this_Folder_0= ruleFolder
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getFolderParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFolder_in_ruleResource783);
                    this_Folder_0=ruleFolder();

                    state._fsp--;

                     
                            current = this_Folder_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:390:5: this_TemplatedFile_1= ruleTemplatedFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getTemplatedFileParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_ruleResource810);
                    this_TemplatedFile_1=ruleTemplatedFile();

                    state._fsp--;

                     
                            current = this_TemplatedFile_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:400:5: this_DataFile_2= ruleDataFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDataFileParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_ruleResource837);
                    this_DataFile_2=ruleDataFile();

                    state._fsp--;

                     
                            current = this_DataFile_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:410:5: this_URLFile_3= ruleURLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getURLFileParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_ruleResource864);
                    this_URLFile_3=ruleURLFile();

                    state._fsp--;

                     
                            current = this_URLFile_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:420:5: this_DynamicFile_4= ruleDynamicFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getDynamicFileParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_ruleResource891);
                    this_DynamicFile_4=ruleDynamicFile();

                    state._fsp--;

                     
                            current = this_DynamicFile_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:430:5: this_ManifestFile_5= ruleManifestFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getManifestFileParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleResource918);
                    this_ManifestFile_5=ruleManifestFile();

                    state._fsp--;

                     
                            current = this_ManifestFile_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:440:5: this_ProductFileFeaturebase_6= ruleProductFileFeaturebase
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getProductFileFeaturebaseParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_ruleResource945);
                    this_ProductFileFeaturebase_6=ruleProductFileFeaturebase();

                    state._fsp--;

                     
                            current = this_ProductFileFeaturebase_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:450:5: this_PluginXMLFile_7= rulePluginXMLFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getPluginXMLFileParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleResource972);
                    this_PluginXMLFile_7=rulePluginXMLFile();

                    state._fsp--;

                     
                            current = this_PluginXMLFile_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:460:5: this_ComponentDefinitionFile_8= ruleComponentDefinitionFile
                    {
                     
                            newCompositeNode(grammarAccess.getResourceAccess().getComponentDefinitionFileParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentDefinitionFile_in_ruleResource999);
                    this_ComponentDefinitionFile_8=ruleComponentDefinitionFile();

                    state._fsp--;

                     
                            current = this_ComponentDefinitionFile_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:476:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:477:2: (iv_ruleProject= ruleProject EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:478:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject1034);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject1044); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:485:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_resources_7_0 = null;

        EObject lv_resources_9_0 = null;

        EObject lv_excludeExpression_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:488:28: ( ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:489:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:489:1: ( () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:489:2: () otherlv_1= 'SimpleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )? otherlv_11= '}' (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:489:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:490:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProjectAccess().getProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProject1090); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getSimpleProjectKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:499:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:500:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:500:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:501:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProject1111);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject1123); 

                	newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:521:1: (otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:521:3: otherlv_4= 'resources' otherlv_5= '=' otherlv_6= '{' ( (lv_resources_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleProject1136); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getResourcesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProject1148); 

                        	newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProject1160); 

                        	newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:533:1: ( (lv_resources_7_0= ruleResource ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:534:1: (lv_resources_7_0= ruleResource )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:534:1: (lv_resources_7_0= ruleResource )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:535:3: lv_resources_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject1181);
                    lv_resources_7_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_7_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:551:2: (otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:551:4: otherlv_8= ',' ( (lv_resources_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProject1194); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:555:1: ( (lv_resources_9_0= ruleResource ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:556:1: (lv_resources_9_0= ruleResource )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:556:1: (lv_resources_9_0= ruleResource )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:557:3: lv_resources_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourceParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleProject1215);
                    	    lv_resources_9_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_9_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProject1229); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProject1243); 

                	newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:581:1: (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:581:3: otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProject1256); 

                        	newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getExcludedIfKeyword_6_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:585:1: ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:586:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:586:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:587:3: lv_excludeExpression_13_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getExcludeExpressionBooleanExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleProject1277);
                    lv_excludeExpression_13_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_13_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEString"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:611:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:612:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:613:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1316);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1327); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:620:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:623:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:624:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:624:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:624:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1367); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:632:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1393); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFolder"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:647:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:648:2: (iv_ruleFolder= ruleFolder EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:649:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFolder_in_entryRuleFolder1438);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFolder1448); 

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
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:656:1: ruleFolder returns [EObject current=null] : ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )? ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_children_7_0 = null;

        EObject lv_children_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:659:28: ( ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:1: ( () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:2: () otherlv_1= 'Folder' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:660:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:661:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFolderAccess().getFolderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFolder1494); 

                	newLeafNode(otherlv_1, grammarAccess.getFolderAccess().getFolderKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:670:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:671:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:672:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFolderAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFolder1515);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFolderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:688:2: (otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:688:4: otherlv_3= '{' otherlv_4= 'children' otherlv_5= '=' otherlv_6= '{' ( (lv_children_7_0= ruleResource ) ) (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )* otherlv_10= '}' otherlv_11= '}'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFolder1528); 

                        	newLeafNode(otherlv_3, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFolder1540); 

                        	newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getChildrenKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFolder1552); 

                        	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getEqualsSignKeyword_3_2());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFolder1564); 

                        	newLeafNode(otherlv_6, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_3_3());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:704:1: ( (lv_children_7_0= ruleResource ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:705:1: (lv_children_7_0= ruleResource )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:705:1: (lv_children_7_0= ruleResource )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:706:3: lv_children_7_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1585);
                    lv_children_7_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_7_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:722:2: (otherlv_8= ',' ( (lv_children_9_0= ruleResource ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:722:4: otherlv_8= ',' ( (lv_children_9_0= ruleResource ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFolder1598); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getFolderAccess().getCommaKeyword_3_5_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:726:1: ( (lv_children_9_0= ruleResource ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:727:1: (lv_children_9_0= ruleResource )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:727:1: (lv_children_9_0= ruleResource )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:728:3: lv_children_9_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFolderAccess().getChildrenResourceParserRuleCall_3_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFolder1619);
                    	    lv_children_9_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFolderRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFolder1633); 

                        	newLeafNode(otherlv_10, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_3_6());
                        
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFolder1645); 

                        	newLeafNode(otherlv_11, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_3_7());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleTemplatedFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:760:1: entryRuleTemplatedFile returns [EObject current=null] : iv_ruleTemplatedFile= ruleTemplatedFile EOF ;
    public final EObject entryRuleTemplatedFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplatedFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:761:2: (iv_ruleTemplatedFile= ruleTemplatedFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:762:2: iv_ruleTemplatedFile= ruleTemplatedFile EOF
            {
             newCompositeNode(grammarAccess.getTemplatedFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1683);
            iv_ruleTemplatedFile=ruleTemplatedFile();

            state._fsp--;

             current =iv_ruleTemplatedFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplatedFile1693); 

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
    // $ANTLR end "entryRuleTemplatedFile"


    // $ANTLR start "ruleTemplatedFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:769:1: ruleTemplatedFile returns [EObject current=null] : ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleTemplatedFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_generatorType_6_0 = null;

        EObject lv_excludeExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:772:28: ( ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:1: ( () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:2: () otherlv_1= 'TemplatedFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:773:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:774:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemplatedFileAccess().getTemplatedFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTemplatedFile1739); 

                	newLeafNode(otherlv_1, grammarAccess.getTemplatedFileAccess().getTemplatedFileKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:783:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:784:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:784:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:785:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1760);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplatedFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTemplatedFile1772); 

                	newLeafNode(otherlv_3, grammarAccess.getTemplatedFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:805:1: (otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:805:3: otherlv_4= 'generatorType' otherlv_5= '=' ( (lv_generatorType_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTemplatedFile1785); 

                        	newLeafNode(otherlv_4, grammarAccess.getTemplatedFileAccess().getGeneratorTypeKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTemplatedFile1797); 

                        	newLeafNode(otherlv_5, grammarAccess.getTemplatedFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:813:1: ( (lv_generatorType_6_0= ruleEString ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:814:1: (lv_generatorType_6_0= ruleEString )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:814:1: (lv_generatorType_6_0= ruleEString )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:815:3: lv_generatorType_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getGeneratorTypeEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTemplatedFile1818);
                    lv_generatorType_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplatedFileRule());
                    	        }
                           		set(
                           			current, 
                           			"generatorType",
                            		lv_generatorType_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTemplatedFile1832); 

                	newLeafNode(otherlv_7, grammarAccess.getTemplatedFileAccess().getRightCurlyBracketKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:835:1: (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:835:3: otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTemplatedFile1845); 

                        	newLeafNode(otherlv_8, grammarAccess.getTemplatedFileAccess().getExcludedIfKeyword_6_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:839:1: ( (lv_excludeExpression_9_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:840:1: (lv_excludeExpression_9_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:840:1: (lv_excludeExpression_9_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:841:3: lv_excludeExpression_9_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplatedFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleTemplatedFile1866);
                    lv_excludeExpression_9_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplatedFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_9_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplatedFile"


    // $ANTLR start "entryRuleDataFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:865:1: entryRuleDataFile returns [EObject current=null] : iv_ruleDataFile= ruleDataFile EOF ;
    public final EObject entryRuleDataFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:866:2: (iv_ruleDataFile= ruleDataFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:867:2: iv_ruleDataFile= ruleDataFile EOF
            {
             newCompositeNode(grammarAccess.getDataFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_entryRuleDataFile1904);
            iv_ruleDataFile=ruleDataFile();

            state._fsp--;

             current =iv_ruleDataFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataFile1914); 

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
    // $ANTLR end "entryRuleDataFile"


    // $ANTLR start "ruleDataFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:874:1: ruleDataFile returns [EObject current=null] : ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleDataFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_content_6_0 = null;

        EObject lv_excludeExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:877:28: ( ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:878:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:878:1: ( () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:878:2: () otherlv_1= 'DataFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )? otherlv_7= '}' (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:878:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:879:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataFileAccess().getDataFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataFile1960); 

                	newLeafNode(otherlv_1, grammarAccess.getDataFileAccess().getDataFileKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:888:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:889:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:889:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:890:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataFile1981);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataFile1993); 

                	newLeafNode(otherlv_3, grammarAccess.getDataFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:910:1: (otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:910:3: otherlv_4= 'content' otherlv_5= '=' ( (lv_content_6_0= ruleEByteArray ) )
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataFile2006); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataFileAccess().getContentKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataFile2018); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataFileAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:918:1: ( (lv_content_6_0= ruleEByteArray ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:919:1: (lv_content_6_0= ruleEByteArray )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:919:1: (lv_content_6_0= ruleEByteArray )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:920:3: lv_content_6_0= ruleEByteArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataFileAccess().getContentEByteArrayParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_ruleDataFile2039);
                    lv_content_6_0=ruleEByteArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataFileRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_6_0, 
                            		"EByteArray");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataFile2053); 

                	newLeafNode(otherlv_7, grammarAccess.getDataFileAccess().getRightCurlyBracketKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:940:1: (otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:940:3: otherlv_8= 'excluded-if' ( (lv_excludeExpression_9_0= ruleBooleanExpression ) )
                    {
                    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataFile2066); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataFileAccess().getExcludedIfKeyword_6_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:944:1: ( (lv_excludeExpression_9_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:945:1: (lv_excludeExpression_9_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:945:1: (lv_excludeExpression_9_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:946:3: lv_excludeExpression_9_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleDataFile2087);
                    lv_excludeExpression_9_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_9_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataFile"


    // $ANTLR start "entryRuleURLFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:970:1: entryRuleURLFile returns [EObject current=null] : iv_ruleURLFile= ruleURLFile EOF ;
    public final EObject entryRuleURLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:971:2: (iv_ruleURLFile= ruleURLFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:972:2: iv_ruleURLFile= ruleURLFile EOF
            {
             newCompositeNode(grammarAccess.getURLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_entryRuleURLFile2125);
            iv_ruleURLFile=ruleURLFile();

            state._fsp--;

             current =iv_ruleURLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURLFile2135); 

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
    // $ANTLR end "entryRuleURLFile"


    // $ANTLR start "ruleURLFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:979:1: ruleURLFile returns [EObject current=null] : ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleURLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;

        EObject lv_excludeExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:982:28: ( ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:983:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:983:1: ( () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:983:2: () otherlv_1= 'URLFile' ( (lv_name_2_0= ruleEString ) ) ( (lv_uri_3_0= ruleEString ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:983:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURLFileAccess().getURLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleURLFile2181); 

                	newLeafNode(otherlv_1, grammarAccess.getURLFileAccess().getURLFileKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:993:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:994:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:994:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:995:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getURLFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile2202);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURLFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1011:2: ( (lv_uri_3_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1012:1: (lv_uri_3_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1012:1: (lv_uri_3_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1013:3: lv_uri_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getURLFileAccess().getUriEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleURLFile2223);
            lv_uri_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURLFileRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1029:2: (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1029:4: otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleURLFile2236); 

                        	newLeafNode(otherlv_4, grammarAccess.getURLFileAccess().getExcludedIfKeyword_4_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1033:1: ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1034:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1034:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1035:3: lv_excludeExpression_5_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getURLFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleURLFile2257);
                    lv_excludeExpression_5_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getURLFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_5_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURLFile"


    // $ANTLR start "entryRuleDynamicFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1059:1: entryRuleDynamicFile returns [EObject current=null] : iv_ruleDynamicFile= ruleDynamicFile EOF ;
    public final EObject entryRuleDynamicFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1060:2: (iv_ruleDynamicFile= ruleDynamicFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1061:2: iv_ruleDynamicFile= ruleDynamicFile EOF
            {
             newCompositeNode(grammarAccess.getDynamicFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2295);
            iv_ruleDynamicFile=ruleDynamicFile();

            state._fsp--;

             current =iv_ruleDynamicFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDynamicFile2305); 

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
    // $ANTLR end "entryRuleDynamicFile"


    // $ANTLR start "ruleDynamicFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1068:1: ruleDynamicFile returns [EObject current=null] : ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleDynamicFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_executionURI_4_0=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_excludeExpression_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1071:28: ( ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1072:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1072:1: ( () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1072:2: () otherlv_1= 'DynamicFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'generated-from' ( (lv_executionURI_4_0= RULE_STRING ) ) otherlv_5= 'by' ( (lv_type_6_0= RULE_STRING ) ) (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )? (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1072:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1073:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDynamicFileAccess().getDynamicFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDynamicFile2351); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamicFileAccess().getDynamicFileKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1082:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1083:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1083:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1084:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDynamicFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDynamicFile2372);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDynamicFile2384); 

                	newLeafNode(otherlv_3, grammarAccess.getDynamicFileAccess().getGeneratedFromKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1104:1: ( (lv_executionURI_4_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1105:1: (lv_executionURI_4_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1105:1: (lv_executionURI_4_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1106:3: lv_executionURI_4_0= RULE_STRING
            {
            lv_executionURI_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2401); 

            			newLeafNode(lv_executionURI_4_0, grammarAccess.getDynamicFileAccess().getExecutionURISTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionURI",
                    		lv_executionURI_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDynamicFile2418); 

                	newLeafNode(otherlv_5, grammarAccess.getDynamicFileAccess().getByKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1126:1: ( (lv_type_6_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1127:1: (lv_type_6_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1127:1: (lv_type_6_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1128:3: lv_type_6_0= RULE_STRING
            {
            lv_type_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDynamicFile2435); 

            			newLeafNode(lv_type_6_0, grammarAccess.getDynamicFileAccess().getTypeSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDynamicFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1144:2: (otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1144:4: otherlv_7= '{' ( (lv_variables_8_0= ruleVariable ) ) (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDynamicFile2453); 

                        	newLeafNode(otherlv_7, grammarAccess.getDynamicFileAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1148:1: ( (lv_variables_8_0= ruleVariable ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1149:1: (lv_variables_8_0= ruleVariable )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1149:1: (lv_variables_8_0= ruleVariable )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1150:3: lv_variables_8_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2474);
                    lv_variables_8_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_8_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1166:2: (otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1166:4: otherlv_9= ',' ( (lv_variables_10_0= ruleVariable ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDynamicFile2487); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getDynamicFileAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1170:1: ( (lv_variables_10_0= ruleVariable ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1171:1: (lv_variables_10_0= ruleVariable )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1171:1: (lv_variables_10_0= ruleVariable )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1172:3: lv_variables_10_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getVariablesVariableParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDynamicFile2508);
                    	    lv_variables_10_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_10_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDynamicFile2522); 

                        	newLeafNode(otherlv_11, grammarAccess.getDynamicFileAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1192:3: (otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1192:5: otherlv_12= 'excluded-if' ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDynamicFile2537); 

                        	newLeafNode(otherlv_12, grammarAccess.getDynamicFileAccess().getExcludedIfKeyword_8_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1196:1: ( (lv_excludeExpression_13_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1197:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1197:1: (lv_excludeExpression_13_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1198:3: lv_excludeExpression_13_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDynamicFileAccess().getExcludeExpressionBooleanExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2558);
                    lv_excludeExpression_13_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDynamicFileRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_13_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicFile"


    // $ANTLR start "entryRuleComponentDefinitionFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1222:1: entryRuleComponentDefinitionFile returns [EObject current=null] : iv_ruleComponentDefinitionFile= ruleComponentDefinitionFile EOF ;
    public final EObject entryRuleComponentDefinitionFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDefinitionFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1223:2: (iv_ruleComponentDefinitionFile= ruleComponentDefinitionFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1224:2: iv_ruleComponentDefinitionFile= ruleComponentDefinitionFile EOF
            {
             newCompositeNode(grammarAccess.getComponentDefinitionFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentDefinitionFile_in_entryRuleComponentDefinitionFile2596);
            iv_ruleComponentDefinitionFile=ruleComponentDefinitionFile();

            state._fsp--;

             current =iv_ruleComponentDefinitionFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentDefinitionFile2606); 

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
    // $ANTLR end "entryRuleComponentDefinitionFile"


    // $ANTLR start "ruleComponentDefinitionFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1231:1: ruleComponentDefinitionFile returns [EObject current=null] : ( () otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= 'services' otherlv_12= '=' otherlv_13= '{' ( (lv_serviceInterfaceList_14_0= ruleEString ) ) (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )* otherlv_17= '}' otherlv_18= 'references' otherlv_19= '=' otherlv_20= '{' ( (lv_referenceList_21_0= ruleComponentReference ) ) (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleComponentDefinitionFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        AntlrDatatypeRuleToken lv_componentClass_10_0 = null;

        AntlrDatatypeRuleToken lv_serviceInterfaceList_14_0 = null;

        AntlrDatatypeRuleToken lv_serviceInterfaceList_16_0 = null;

        EObject lv_referenceList_21_0 = null;

        EObject lv_referenceList_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1234:28: ( ( () otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= 'services' otherlv_12= '=' otherlv_13= '{' ( (lv_serviceInterfaceList_14_0= ruleEString ) ) (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )* otherlv_17= '}' otherlv_18= 'references' otherlv_19= '=' otherlv_20= '{' ( (lv_referenceList_21_0= ruleComponentReference ) ) (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1235:1: ( () otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= 'services' otherlv_12= '=' otherlv_13= '{' ( (lv_serviceInterfaceList_14_0= ruleEString ) ) (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )* otherlv_17= '}' otherlv_18= 'references' otherlv_19= '=' otherlv_20= '{' ( (lv_referenceList_21_0= ruleComponentReference ) ) (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1235:1: ( () otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= 'services' otherlv_12= '=' otherlv_13= '{' ( (lv_serviceInterfaceList_14_0= ruleEString ) ) (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )* otherlv_17= '}' otherlv_18= 'references' otherlv_19= '=' otherlv_20= '{' ( (lv_referenceList_21_0= ruleComponentReference ) ) (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1235:2: () otherlv_1= 'ComponentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= 'services' otherlv_12= '=' otherlv_13= '{' ( (lv_serviceInterfaceList_14_0= ruleEString ) ) (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )* otherlv_17= '}' otherlv_18= 'references' otherlv_19= '=' otherlv_20= '{' ( (lv_referenceList_21_0= ruleComponentReference ) ) (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1235:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1236:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentDefinitionFileAccess().getComponentDefinitionFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleComponentDefinitionFile2652); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentDefinitionFileAccess().getComponentDefinitionKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1245:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1246:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1246:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1247:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentDefinitionFile2673);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponentDefinitionFile2685); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentDefinitionFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1267:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1269:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1269:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1270:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1273:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1274:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1274:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1276:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1276:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1277:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinitionFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1277:120: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1278:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1281:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1281:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinitionFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1281:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1281:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_id_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComponentDefinitionFile2743); 

            	        	newLeafNode(otherlv_5, grammarAccess.getComponentDefinitionFileAccess().getNameKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentDefinitionFile2755); 

            	        	newLeafNode(otherlv_6, grammarAccess.getComponentDefinitionFileAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1289:1: ( (lv_id_7_0= ruleEString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1290:1: (lv_id_7_0= ruleEString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1290:1: (lv_id_7_0= ruleEString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1291:3: lv_id_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getIdEStringParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentDefinitionFile2776);
            	    lv_id_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"id",
            	            		lv_id_7_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1314:4: ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1314:4: ({...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1315:5: {...}? => ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinitionFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1315:120: ( ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1316:6: ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1319:6: ({...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1319:7: {...}? => (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDefinitionFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1319:16: (otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1319:18: otherlv_8= 'class' otherlv_9= '=' ( (lv_componentClass_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComponentDefinitionFile2844); 

            	        	newLeafNode(otherlv_8, grammarAccess.getComponentDefinitionFileAccess().getClassKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentDefinitionFile2856); 

            	        	newLeafNode(otherlv_9, grammarAccess.getComponentDefinitionFileAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1327:1: ( (lv_componentClass_10_0= ruleEString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1328:1: (lv_componentClass_10_0= ruleEString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1328:1: (lv_componentClass_10_0= ruleEString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1329:3: lv_componentClass_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getComponentClassEStringParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentDefinitionFile2877);
            	    lv_componentClass_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"componentClass",
            	            		lv_componentClass_10_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleComponentDefinitionFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getComponentDefinitionFileAccess().getUnorderedGroup_4());
            	

            }

            otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleComponentDefinitionFile2936); 

                	newLeafNode(otherlv_11, grammarAccess.getComponentDefinitionFileAccess().getServicesKeyword_5());
                
            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentDefinitionFile2948); 

                	newLeafNode(otherlv_12, grammarAccess.getComponentDefinitionFileAccess().getEqualsSignKeyword_6());
                
            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponentDefinitionFile2960); 

                	newLeafNode(otherlv_13, grammarAccess.getComponentDefinitionFileAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1372:1: ( (lv_serviceInterfaceList_14_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1373:1: (lv_serviceInterfaceList_14_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1373:1: (lv_serviceInterfaceList_14_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1374:3: lv_serviceInterfaceList_14_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getServiceInterfaceListEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentDefinitionFile2981);
            lv_serviceInterfaceList_14_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	        }
                   		add(
                   			current, 
                   			"serviceInterfaceList",
                    		lv_serviceInterfaceList_14_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1390:2: (otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1390:4: otherlv_15= ',' ( (lv_serviceInterfaceList_16_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponentDefinitionFile2994); 

            	        	newLeafNode(otherlv_15, grammarAccess.getComponentDefinitionFileAccess().getCommaKeyword_9_0());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1394:1: ( (lv_serviceInterfaceList_16_0= ruleEString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:1: (lv_serviceInterfaceList_16_0= ruleEString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1395:1: (lv_serviceInterfaceList_16_0= ruleEString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1396:3: lv_serviceInterfaceList_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getServiceInterfaceListEStringParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentDefinitionFile3015);
            	    lv_serviceInterfaceList_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceInterfaceList",
            	            		lv_serviceInterfaceList_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentDefinitionFile3029); 

                	newLeafNode(otherlv_17, grammarAccess.getComponentDefinitionFileAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_18=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleComponentDefinitionFile3041); 

                	newLeafNode(otherlv_18, grammarAccess.getComponentDefinitionFileAccess().getReferencesKeyword_11());
                
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentDefinitionFile3053); 

                	newLeafNode(otherlv_19, grammarAccess.getComponentDefinitionFileAccess().getEqualsSignKeyword_12());
                
            otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponentDefinitionFile3065); 

                	newLeafNode(otherlv_20, grammarAccess.getComponentDefinitionFileAccess().getLeftCurlyBracketKeyword_13());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1428:1: ( (lv_referenceList_21_0= ruleComponentReference ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1429:1: (lv_referenceList_21_0= ruleComponentReference )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1429:1: (lv_referenceList_21_0= ruleComponentReference )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1430:3: lv_referenceList_21_0= ruleComponentReference
            {
             
            	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getReferenceListComponentReferenceParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_ruleComponentDefinitionFile3086);
            lv_referenceList_21_0=ruleComponentReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	        }
                   		add(
                   			current, 
                   			"referenceList",
                    		lv_referenceList_21_0, 
                    		"ComponentReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1446:2: (otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1446:4: otherlv_22= ',' ( (lv_referenceList_23_0= ruleComponentReference ) )
            	    {
            	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponentDefinitionFile3099); 

            	        	newLeafNode(otherlv_22, grammarAccess.getComponentDefinitionFileAccess().getCommaKeyword_15_0());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1450:1: ( (lv_referenceList_23_0= ruleComponentReference ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:1: (lv_referenceList_23_0= ruleComponentReference )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1451:1: (lv_referenceList_23_0= ruleComponentReference )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1452:3: lv_referenceList_23_0= ruleComponentReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentDefinitionFileAccess().getReferenceListComponentReferenceParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_ruleComponentDefinitionFile3120);
            	    lv_referenceList_23_0=ruleComponentReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentDefinitionFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"referenceList",
            	            		lv_referenceList_23_0, 
            	            		"ComponentReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentDefinitionFile3134); 

                	newLeafNode(otherlv_24, grammarAccess.getComponentDefinitionFileAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentDefinitionFile3146); 

                	newLeafNode(otherlv_25, grammarAccess.getComponentDefinitionFileAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDefinitionFile"


    // $ANTLR start "entryRuleComponentReference"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1484:1: entryRuleComponentReference returns [EObject current=null] : iv_ruleComponentReference= ruleComponentReference EOF ;
    public final EObject entryRuleComponentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentReference = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1485:2: (iv_ruleComponentReference= ruleComponentReference EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1486:2: iv_ruleComponentReference= ruleComponentReference EOF
            {
             newCompositeNode(grammarAccess.getComponentReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentReference_in_entryRuleComponentReference3182);
            iv_ruleComponentReference=ruleComponentReference();

            state._fsp--;

             current =iv_ruleComponentReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentReference3192); 

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
    // $ANTLR end "entryRuleComponentReference"


    // $ANTLR start "ruleComponentReference"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1493:1: ruleComponentReference returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '}' ) ;
    public final EObject ruleComponentReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_bind_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_unbind_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_typeName_12_0 = null;

        Enumerator lv_cardinality_15_0 = null;

        Enumerator lv_policy_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1496:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1497:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1497:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1497:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1497:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1498:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentReferenceAccess().getComponentReferenceAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1503:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1504:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1504:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1505:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentReference3243); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponentReference3260); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentReferenceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1525:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1527:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1527:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1528:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1531:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1532:3: ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1532:3: ( ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=6;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 4) ) {
                    alt25=5;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1534:4: ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1534:4: ({...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1535:5: {...}? => ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1535:115: ( ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1536:6: ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1539:6: ({...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1539:7: {...}? => (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1539:16: (otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1539:18: otherlv_4= 'bind' otherlv_5= '=' ( (lv_bind_6_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleComponentReference3318); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComponentReferenceAccess().getBindKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentReference3330); 

            	        	newLeafNode(otherlv_5, grammarAccess.getComponentReferenceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1547:1: ( (lv_bind_6_0= RULE_ID ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1548:1: (lv_bind_6_0= RULE_ID )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1548:1: (lv_bind_6_0= RULE_ID )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1549:3: lv_bind_6_0= RULE_ID
            	    {
            	    lv_bind_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentReference3347); 

            	    			newLeafNode(lv_bind_6_0, grammarAccess.getComponentReferenceAccess().getBindIDTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentReferenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"bind",
            	            		lv_bind_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1572:4: ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1572:4: ({...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1573:5: {...}? => ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1573:115: ( ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1574:6: ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1577:6: ({...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1577:7: {...}? => (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1577:16: (otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1577:18: otherlv_7= 'unbind' otherlv_8= '=' ( (lv_unbind_9_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleComponentReference3420); 

            	        	newLeafNode(otherlv_7, grammarAccess.getComponentReferenceAccess().getUnbindKeyword_3_1_0());
            	        
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentReference3432); 

            	        	newLeafNode(otherlv_8, grammarAccess.getComponentReferenceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1585:1: ( (lv_unbind_9_0= RULE_ID ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1586:1: (lv_unbind_9_0= RULE_ID )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1586:1: (lv_unbind_9_0= RULE_ID )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1587:3: lv_unbind_9_0= RULE_ID
            	    {
            	    lv_unbind_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentReference3449); 

            	    			newLeafNode(lv_unbind_9_0, grammarAccess.getComponentReferenceAccess().getUnbindIDTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentReferenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"unbind",
            	            		lv_unbind_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1610:4: ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1610:4: ({...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1611:5: {...}? => ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1611:115: ( ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1612:6: ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1615:6: ({...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1615:7: {...}? => (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1615:16: (otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1615:18: otherlv_10= 'class' otherlv_11= '=' ( (lv_typeName_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComponentReference3522); 

            	        	newLeafNode(otherlv_10, grammarAccess.getComponentReferenceAccess().getClassKeyword_3_2_0());
            	        
            	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentReference3534); 

            	        	newLeafNode(otherlv_11, grammarAccess.getComponentReferenceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1623:1: ( (lv_typeName_12_0= ruleEString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1624:1: (lv_typeName_12_0= ruleEString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1624:1: (lv_typeName_12_0= ruleEString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1625:3: lv_typeName_12_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentReferenceAccess().getTypeNameEStringParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentReference3555);
            	    lv_typeName_12_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"typeName",
            	            		lv_typeName_12_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1648:4: ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1648:4: ({...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1649:5: {...}? => ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1649:115: ( ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1650:6: ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1653:6: ({...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1653:7: {...}? => (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1653:16: (otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1653:18: otherlv_13= 'cardinality' otherlv_14= '=' ( (lv_cardinality_15_0= ruleCardinality ) )
            	    {
            	    otherlv_13=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComponentReference3623); 

            	        	newLeafNode(otherlv_13, grammarAccess.getComponentReferenceAccess().getCardinalityKeyword_3_3_0());
            	        
            	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentReference3635); 

            	        	newLeafNode(otherlv_14, grammarAccess.getComponentReferenceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1661:1: ( (lv_cardinality_15_0= ruleCardinality ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1662:1: (lv_cardinality_15_0= ruleCardinality )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1662:1: (lv_cardinality_15_0= ruleCardinality )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1663:3: lv_cardinality_15_0= ruleCardinality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentReferenceAccess().getCardinalityCardinalityEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCardinality_in_ruleComponentReference3656);
            	    lv_cardinality_15_0=ruleCardinality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"cardinality",
            	            		lv_cardinality_15_0, 
            	            		"Cardinality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1686:4: ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1686:4: ({...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1687:5: {...}? => ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1687:115: ( ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1688:6: ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1691:6: ({...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1691:7: {...}? => (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentReference", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1691:16: (otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1691:18: otherlv_16= 'policy' otherlv_17= '=' ( (lv_policy_18_0= rulePolicy ) )
            	    {
            	    otherlv_16=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleComponentReference3724); 

            	        	newLeafNode(otherlv_16, grammarAccess.getComponentReferenceAccess().getPolicyKeyword_3_4_0());
            	        
            	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponentReference3736); 

            	        	newLeafNode(otherlv_17, grammarAccess.getComponentReferenceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1699:1: ( (lv_policy_18_0= rulePolicy ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1700:1: (lv_policy_18_0= rulePolicy )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1700:1: (lv_policy_18_0= rulePolicy )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1701:3: lv_policy_18_0= rulePolicy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentReferenceAccess().getPolicyPolicyEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePolicy_in_ruleComponentReference3757);
            	    lv_policy_18_0=rulePolicy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentReferenceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"policy",
            	            		lv_policy_18_0, 
            	            		"Policy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleComponentReference", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getComponentReferenceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentReference3816); 

                	newLeafNode(otherlv_19, grammarAccess.getComponentReferenceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentReference"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1744:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1745:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1746:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3852);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression3862); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1753:1: ruleBooleanExpression returns [EObject current=null] : (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ReferencingBooleanExpression_0 = null;

        EObject this_InlineBooleanExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1756:28: ( (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1757:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1757:1: (this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression | this_InlineBooleanExpression_1= ruleInlineBooleanExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INLINE_SCRIPT) ) {
                    alt26=2;
                }
                else if ( (LA26_1==34) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1758:5: this_ReferencingBooleanExpression_0= ruleReferencingBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getReferencingBooleanExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression3909);
                    this_ReferencingBooleanExpression_0=ruleReferencingBooleanExpression();

                    state._fsp--;

                     
                            current = this_ReferencingBooleanExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1768:5: this_InlineBooleanExpression_1= ruleInlineBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBooleanExpressionAccess().getInlineBooleanExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression3936);
                    this_InlineBooleanExpression_1=ruleInlineBooleanExpression();

                    state._fsp--;

                     
                            current = this_InlineBooleanExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleReferencingBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1784:1: entryRuleReferencingBooleanExpression returns [EObject current=null] : iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF ;
    public final EObject entryRuleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencingBooleanExpression = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1785:2: (iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1786:2: iv_ruleReferencingBooleanExpression= ruleReferencingBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getReferencingBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression3971);
            iv_ruleReferencingBooleanExpression=ruleReferencingBooleanExpression();

            state._fsp--;

             current =iv_ruleReferencingBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferencingBooleanExpression3981); 

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
    // $ANTLR end "entryRuleReferencingBooleanExpression"


    // $ANTLR start "ruleReferencingBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1793:1: ruleReferencingBooleanExpression returns [EObject current=null] : ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleReferencingBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_executionURI_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1796:28: ( ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1797:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1797:1: ( ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1797:2: ( (lv_executionURI_0_0= RULE_STRING ) ) otherlv_1= 'by' ( (lv_type_2_0= RULE_STRING ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1797:2: ( (lv_executionURI_0_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1798:1: (lv_executionURI_0_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1798:1: (lv_executionURI_0_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1799:3: lv_executionURI_0_0= RULE_STRING
            {
            lv_executionURI_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression4023); 

            			newLeafNode(lv_executionURI_0_0, grammarAccess.getReferencingBooleanExpressionAccess().getExecutionURISTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencingBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionURI",
                    		lv_executionURI_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleReferencingBooleanExpression4040); 

                	newLeafNode(otherlv_1, grammarAccess.getReferencingBooleanExpressionAccess().getByKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1819:1: ( (lv_type_2_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1820:1: (lv_type_2_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1820:1: (lv_type_2_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1821:3: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression4057); 

            			newLeafNode(lv_type_2_0, grammarAccess.getReferencingBooleanExpressionAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferencingBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferencingBooleanExpression"


    // $ANTLR start "entryRuleInlineBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1845:1: entryRuleInlineBooleanExpression returns [EObject current=null] : iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF ;
    public final EObject entryRuleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineBooleanExpression = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1846:2: (iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1847:2: iv_ruleInlineBooleanExpression= ruleInlineBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getInlineBooleanExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression4098);
            iv_ruleInlineBooleanExpression=ruleInlineBooleanExpression();

            state._fsp--;

             current =iv_ruleInlineBooleanExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInlineBooleanExpression4108); 

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
    // $ANTLR end "entryRuleInlineBooleanExpression"


    // $ANTLR start "ruleInlineBooleanExpression"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1854:1: ruleInlineBooleanExpression returns [EObject current=null] : ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) ;
    public final EObject ruleInlineBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_expression_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1857:28: ( ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1858:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1858:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1858:2: ( (lv_type_0_0= RULE_STRING ) ) ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1858:2: ( (lv_type_0_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1859:1: (lv_type_0_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1859:1: (lv_type_0_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1860:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression4150); 

            			newLeafNode(lv_type_0_0, grammarAccess.getInlineBooleanExpressionAccess().getTypeSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1876:2: ( (lv_expression_1_0= RULE_INLINE_SCRIPT ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1877:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1877:1: (lv_expression_1_0= RULE_INLINE_SCRIPT )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1878:3: lv_expression_1_0= RULE_INLINE_SCRIPT
            {
            lv_expression_1_0=(Token)match(input,RULE_INLINE_SCRIPT,FollowSets000.FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression4172); 

            			newLeafNode(lv_expression_1_0, grammarAccess.getInlineBooleanExpressionAccess().getExpressionINLINE_SCRIPTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInlineBooleanExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"INLINE_SCRIPT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineBooleanExpression"


    // $ANTLR start "entryRuleEByteArray"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1902:1: entryRuleEByteArray returns [String current=null] : iv_ruleEByteArray= ruleEByteArray EOF ;
    public final String entryRuleEByteArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEByteArray = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1903:2: (iv_ruleEByteArray= ruleEByteArray EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1904:2: iv_ruleEByteArray= ruleEByteArray EOF
            {
             newCompositeNode(grammarAccess.getEByteArrayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEByteArray_in_entryRuleEByteArray4214);
            iv_ruleEByteArray=ruleEByteArray();

            state._fsp--;

             current =iv_ruleEByteArray.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEByteArray4225); 

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
    // $ANTLR end "entryRuleEByteArray"


    // $ANTLR start "ruleEByteArray"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1911:1: ruleEByteArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EString_0= ruleEString ;
    public final AntlrDatatypeRuleToken ruleEByteArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1914:28: (this_EString_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1916:5: this_EString_0= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getEByteArrayAccess().getEStringParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEByteArray4271);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEByteArray"


    // $ANTLR start "entryRuleBundleProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1934:1: entryRuleBundleProject returns [EObject current=null] : iv_ruleBundleProject= ruleBundleProject EOF ;
    public final EObject entryRuleBundleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleProject = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1935:2: (iv_ruleBundleProject= ruleBundleProject EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1936:2: iv_ruleBundleProject= ruleBundleProject EOF
            {
             newCompositeNode(grammarAccess.getBundleProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleProject_in_entryRuleBundleProject4315);
            iv_ruleBundleProject=ruleBundleProject();

            state._fsp--;

             current =iv_ruleBundleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleProject4325); 

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
    // $ANTLR end "entryRuleBundleProject"


    // $ANTLR start "ruleBundleProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1943:1: ruleBundleProject returns [EObject current=null] : ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'rootfragments' otherlv_22= '=' otherlv_23= '{' ( (lv_sourceFragments_24_0= ruleSourceFragment ) ) (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )* otherlv_27= '}' (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )? otherlv_35= '}' (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleBundleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_manifest_7_0 = null;

        EObject lv_buildProperties_10_0 = null;

        EObject lv_pluginxml_13_0 = null;

        EObject lv_resources_17_0 = null;

        EObject lv_resources_19_0 = null;

        EObject lv_sourceFragments_24_0 = null;

        EObject lv_sourceFragments_26_0 = null;

        EObject lv_compilationUnits_31_0 = null;

        EObject lv_compilationUnits_33_0 = null;

        EObject lv_excludeExpression_37_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1946:28: ( ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'rootfragments' otherlv_22= '=' otherlv_23= '{' ( (lv_sourceFragments_24_0= ruleSourceFragment ) ) (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )* otherlv_27= '}' (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )? otherlv_35= '}' (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1947:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'rootfragments' otherlv_22= '=' otherlv_23= '{' ( (lv_sourceFragments_24_0= ruleSourceFragment ) ) (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )* otherlv_27= '}' (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )? otherlv_35= '}' (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1947:1: ( () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'rootfragments' otherlv_22= '=' otherlv_23= '{' ( (lv_sourceFragments_24_0= ruleSourceFragment ) ) (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )* otherlv_27= '}' (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )? otherlv_35= '}' (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1947:2: () otherlv_1= 'BundleProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )? otherlv_21= 'rootfragments' otherlv_22= '=' otherlv_23= '{' ( (lv_sourceFragments_24_0= ruleSourceFragment ) ) (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )* otherlv_27= '}' (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )? otherlv_35= '}' (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1947:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1948:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBundleProjectAccess().getBundleProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBundleProject4371); 

                	newLeafNode(otherlv_1, grammarAccess.getBundleProjectAccess().getBundleProjectKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1957:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1958:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1958:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1959:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleProject4392);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject4404); 

                	newLeafNode(otherlv_3, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1979:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1981:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1981:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1982:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1985:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1986:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1986:3: ( ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
                    alt27=3;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1988:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1988:4: ({...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1989:5: {...}? => ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1989:110: ( ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1990:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1993:6: ({...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1993:7: {...}? => (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1993:16: (otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:1993:18: otherlv_5= 'manifest' otherlv_6= '=' ( (lv_manifest_7_0= ruleManifestFile ) )
            	    {
            	    otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleBundleProject4462); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBundleProjectAccess().getManifestKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4474); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2001:1: ( (lv_manifest_7_0= ruleManifestFile ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:1: (lv_manifest_7_0= ruleManifestFile )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2002:1: (lv_manifest_7_0= ruleManifestFile )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2003:3: lv_manifest_7_0= ruleManifestFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getManifestManifestFileParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_ruleBundleProject4495);
            	    lv_manifest_7_0=ruleManifestFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"manifest",
            	            		lv_manifest_7_0, 
            	            		"ManifestFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2026:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2026:4: ({...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2027:5: {...}? => ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2027:110: ( ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2028:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2031:6: ({...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2031:7: {...}? => (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2031:16: (otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2031:18: otherlv_8= 'build' otherlv_9= '=' ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    {
            	    otherlv_8=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBundleProject4563); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBundleProjectAccess().getBuildKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4575); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2039:1: ( (lv_buildProperties_10_0= ruleBuildProperties ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2040:1: (lv_buildProperties_10_0= ruleBuildProperties )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2041:3: lv_buildProperties_10_0= ruleBuildProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getBuildPropertiesBuildPropertiesParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_ruleBundleProject4596);
            	    lv_buildProperties_10_0=ruleBuildProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"buildProperties",
            	            		lv_buildProperties_10_0, 
            	            		"BuildProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2064:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2064:4: ({...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2065:5: {...}? => ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2065:110: ( ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2066:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2069:6: ({...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2069:7: {...}? => (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBundleProject", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2069:16: (otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2069:18: otherlv_11= 'pluginxml' otherlv_12= '=' ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    {
            	    otherlv_11=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleBundleProject4664); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBundleProjectAccess().getPluginxmlKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4676); 

            	        	newLeafNode(otherlv_12, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2077:1: ( (lv_pluginxml_13_0= rulePluginXMLFile ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2078:1: (lv_pluginxml_13_0= rulePluginXMLFile )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2079:3: lv_pluginxml_13_0= rulePluginXMLFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getPluginxmlPluginXMLFileParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_ruleBundleProject4697);
            	    lv_pluginxml_13_0=rulePluginXMLFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pluginxml",
            	            		lv_pluginxml_13_0, 
            	            		"PluginXMLFile");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBundleProject", "getUnorderedGroupHelper().canLeave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBundleProjectAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2110:2: (otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2110:4: otherlv_14= 'resources' otherlv_15= '=' otherlv_16= '{' ( (lv_resources_17_0= ruleResource ) ) (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )* otherlv_20= '}'
                    {
                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBundleProject4757); 

                        	newLeafNode(otherlv_14, grammarAccess.getBundleProjectAccess().getResourcesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4769); 

                        	newLeafNode(otherlv_15, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject4781); 

                        	newLeafNode(otherlv_16, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2122:1: ( (lv_resources_17_0= ruleResource ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2123:1: (lv_resources_17_0= ruleResource )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2123:1: (lv_resources_17_0= ruleResource )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2124:3: lv_resources_17_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject4802);
                    lv_resources_17_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_17_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2140:2: (otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==18) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2140:4: otherlv_18= ',' ( (lv_resources_19_0= ruleResource ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject4815); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getBundleProjectAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2144:1: ( (lv_resources_19_0= ruleResource ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2145:1: (lv_resources_19_0= ruleResource )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2145:1: (lv_resources_19_0= ruleResource )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2146:3: lv_resources_19_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getResourcesResourceParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleBundleProject4836);
                    	    lv_resources_19_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_19_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject4850); 

                        	newLeafNode(otherlv_20, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBundleProject4864); 

                	newLeafNode(otherlv_21, grammarAccess.getBundleProjectAccess().getRootfragmentsKeyword_6());
                
            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4876); 

                	newLeafNode(otherlv_22, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_7());
                
            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject4888); 

                	newLeafNode(otherlv_23, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2178:1: ( (lv_sourceFragments_24_0= ruleSourceFragment ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2179:1: (lv_sourceFragments_24_0= ruleSourceFragment )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2179:1: (lv_sourceFragments_24_0= ruleSourceFragment )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2180:3: lv_sourceFragments_24_0= ruleSourceFragment
            {
             
            	        newCompositeNode(grammarAccess.getBundleProjectAccess().getSourceFragmentsSourceFragmentParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSourceFragment_in_ruleBundleProject4909);
            lv_sourceFragments_24_0=ruleSourceFragment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	        }
                   		add(
                   			current, 
                   			"sourceFragments",
                    		lv_sourceFragments_24_0, 
                    		"SourceFragment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2196:2: (otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2196:4: otherlv_25= ',' ( (lv_sourceFragments_26_0= ruleSourceFragment ) )
            	    {
            	    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject4922); 

            	        	newLeafNode(otherlv_25, grammarAccess.getBundleProjectAccess().getCommaKeyword_10_0());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2200:1: ( (lv_sourceFragments_26_0= ruleSourceFragment ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2201:1: (lv_sourceFragments_26_0= ruleSourceFragment )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2201:1: (lv_sourceFragments_26_0= ruleSourceFragment )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2202:3: lv_sourceFragments_26_0= ruleSourceFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getSourceFragmentsSourceFragmentParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSourceFragment_in_ruleBundleProject4943);
            	    lv_sourceFragments_26_0=ruleSourceFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sourceFragments",
            	            		lv_sourceFragments_26_0, 
            	            		"SourceFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject4957); 

                	newLeafNode(otherlv_27, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_11());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2222:1: (otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2222:3: otherlv_28= 'compilation-units' otherlv_29= '=' otherlv_30= '{' ( (lv_compilationUnits_31_0= ruleCompilationUnit ) ) (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )* otherlv_34= '}'
                    {
                    otherlv_28=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBundleProject4970); 

                        	newLeafNode(otherlv_28, grammarAccess.getBundleProjectAccess().getCompilationUnitsKeyword_12_0());
                        
                    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBundleProject4982); 

                        	newLeafNode(otherlv_29, grammarAccess.getBundleProjectAccess().getEqualsSignKeyword_12_1());
                        
                    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBundleProject4994); 

                        	newLeafNode(otherlv_30, grammarAccess.getBundleProjectAccess().getLeftCurlyBracketKeyword_12_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2234:1: ( (lv_compilationUnits_31_0= ruleCompilationUnit ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2235:1: (lv_compilationUnits_31_0= ruleCompilationUnit )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2235:1: (lv_compilationUnits_31_0= ruleCompilationUnit )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2236:3: lv_compilationUnits_31_0= ruleCompilationUnit
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getCompilationUnitsCompilationUnitParserRuleCall_12_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCompilationUnit_in_ruleBundleProject5015);
                    lv_compilationUnits_31_0=ruleCompilationUnit();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"compilationUnits",
                            		lv_compilationUnits_31_0, 
                            		"CompilationUnit");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2252:2: (otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==18) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2252:4: otherlv_32= ',' ( (lv_compilationUnits_33_0= ruleCompilationUnit ) )
                    	    {
                    	    otherlv_32=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleProject5028); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getBundleProjectAccess().getCommaKeyword_12_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2256:1: ( (lv_compilationUnits_33_0= ruleCompilationUnit ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2257:1: (lv_compilationUnits_33_0= ruleCompilationUnit )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2257:1: (lv_compilationUnits_33_0= ruleCompilationUnit )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2258:3: lv_compilationUnits_33_0= ruleCompilationUnit
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getCompilationUnitsCompilationUnitParserRuleCall_12_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompilationUnit_in_ruleBundleProject5049);
                    	    lv_compilationUnits_33_0=ruleCompilationUnit();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compilationUnits",
                    	            		lv_compilationUnits_33_0, 
                    	            		"CompilationUnit");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject5063); 

                        	newLeafNode(otherlv_34, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_12_5());
                        

                    }
                    break;

            }

            otherlv_35=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBundleProject5077); 

                	newLeafNode(otherlv_35, grammarAccess.getBundleProjectAccess().getRightCurlyBracketKeyword_13());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2282:1: (otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2282:3: otherlv_36= 'excluded-if' ( (lv_excludeExpression_37_0= ruleBooleanExpression ) )
                    {
                    otherlv_36=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBundleProject5090); 

                        	newLeafNode(otherlv_36, grammarAccess.getBundleProjectAccess().getExcludedIfKeyword_14_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2286:1: ( (lv_excludeExpression_37_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2287:1: (lv_excludeExpression_37_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2287:1: (lv_excludeExpression_37_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2288:3: lv_excludeExpression_37_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBundleProjectAccess().getExcludeExpressionBooleanExpressionParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleBundleProject5111);
                    lv_excludeExpression_37_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBundleProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_37_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBundleProject"


    // $ANTLR start "entryRuleSourceFragment"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2312:1: entryRuleSourceFragment returns [EObject current=null] : iv_ruleSourceFragment= ruleSourceFragment EOF ;
    public final EObject entryRuleSourceFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFragment = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2313:2: (iv_ruleSourceFragment= ruleSourceFragment EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2314:2: iv_ruleSourceFragment= ruleSourceFragment EOF
            {
             newCompositeNode(grammarAccess.getSourceFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSourceFragment_in_entryRuleSourceFragment5149);
            iv_ruleSourceFragment=ruleSourceFragment();

            state._fsp--;

             current =iv_ruleSourceFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSourceFragment5159); 

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
    // $ANTLR end "entryRuleSourceFragment"


    // $ANTLR start "ruleSourceFragment"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2321:1: ruleSourceFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_STRING ) ) ) ;
    public final EObject ruleSourceFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2324:28: ( (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_STRING ) ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2325:1: (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_STRING ) ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2325:1: (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_STRING ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2325:3: otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSourceFragment5196); 

                	newLeafNode(otherlv_0, grammarAccess.getSourceFragmentAccess().getFragmentKeyword_0());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2329:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2330:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2330:1: (lv_name_1_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2331:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSourceFragmentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSourceFragment5217);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceFragmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2347:2: ( (otherlv_2= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2348:1: (otherlv_2= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2348:1: (otherlv_2= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2349:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSourceFragmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSourceFragment5237); 

            		newLeafNode(otherlv_2, grammarAccess.getSourceFragmentAccess().getFolderFolderCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFragment"


    // $ANTLR start "entryRuleCompilationUnit"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2368:1: entryRuleCompilationUnit returns [EObject current=null] : iv_ruleCompilationUnit= ruleCompilationUnit EOF ;
    public final EObject entryRuleCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompilationUnit = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2369:2: (iv_ruleCompilationUnit= ruleCompilationUnit EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2370:2: iv_ruleCompilationUnit= ruleCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getCompilationUnitRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit5273);
            iv_ruleCompilationUnit=ruleCompilationUnit();

            state._fsp--;

             current =iv_ruleCompilationUnit; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompilationUnit5283); 

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
    // $ANTLR end "entryRuleCompilationUnit"


    // $ANTLR start "ruleCompilationUnit"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2377:1: ruleCompilationUnit returns [EObject current=null] : ( ( (lv_packagename_0_0= RULE_STRING ) ) otherlv_1= 'in' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) ) otherlv_5= '}' (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleCompilationUnit() throws RecognitionException {
        EObject current = null;

        Token lv_packagename_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_file_4_1 = null;

        EObject lv_file_4_2 = null;

        EObject lv_file_4_3 = null;

        EObject lv_file_4_4 = null;

        EObject lv_excludeExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2380:28: ( ( ( (lv_packagename_0_0= RULE_STRING ) ) otherlv_1= 'in' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) ) otherlv_5= '}' (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:1: ( ( (lv_packagename_0_0= RULE_STRING ) ) otherlv_1= 'in' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) ) otherlv_5= '}' (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:1: ( ( (lv_packagename_0_0= RULE_STRING ) ) otherlv_1= 'in' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) ) otherlv_5= '}' (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:2: ( (lv_packagename_0_0= RULE_STRING ) ) otherlv_1= 'in' ( (otherlv_2= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) ) otherlv_5= '}' (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2381:2: ( (lv_packagename_0_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2382:1: (lv_packagename_0_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2382:1: (lv_packagename_0_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2383:3: lv_packagename_0_0= RULE_STRING
            {
            lv_packagename_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCompilationUnit5325); 

            			newLeafNode(lv_packagename_0_0, grammarAccess.getCompilationUnitAccess().getPackagenameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompilationUnitRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"packagename",
                    		lv_packagename_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCompilationUnit5342); 

                	newLeafNode(otherlv_1, grammarAccess.getCompilationUnitAccess().getInKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2403:1: ( (otherlv_2= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2404:1: (otherlv_2= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2404:1: (otherlv_2= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2405:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompilationUnitRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCompilationUnit5362); 

            		newLeafNode(otherlv_2, grammarAccess.getCompilationUnitAccess().getSourcefragmentSourceFragmentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompilationUnit5374); 

                	newLeafNode(otherlv_3, grammarAccess.getCompilationUnitAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2420:1: ( ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2421:1: ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2421:1: ( (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2422:1: (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2422:1: (lv_file_4_1= ruleTemplatedFile | lv_file_4_2= ruleDataFile | lv_file_4_3= ruleURLFile | lv_file_4_4= ruleDynamicFile )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            case 31:
                {
                alt34=3;
                }
                break;
            case 32:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2423:3: lv_file_4_1= ruleTemplatedFile
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getFileTemplatedFileParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTemplatedFile_in_ruleCompilationUnit5397);
                    lv_file_4_1=ruleTemplatedFile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_1, 
                            		"TemplatedFile");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2438:8: lv_file_4_2= ruleDataFile
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getFileDataFileParserRuleCall_4_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDataFile_in_ruleCompilationUnit5416);
                    lv_file_4_2=ruleDataFile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_2, 
                            		"DataFile");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2453:8: lv_file_4_3= ruleURLFile
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getFileURLFileParserRuleCall_4_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleURLFile_in_ruleCompilationUnit5435);
                    lv_file_4_3=ruleURLFile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_3, 
                            		"URLFile");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2468:8: lv_file_4_4= ruleDynamicFile
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getFileDynamicFileParserRuleCall_4_0_3()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDynamicFile_in_ruleCompilationUnit5454);
                    lv_file_4_4=ruleDynamicFile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_4, 
                            		"DynamicFile");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCompilationUnit5469); 

                	newLeafNode(otherlv_5, grammarAccess.getCompilationUnitAccess().getRightCurlyBracketKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2490:1: (otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2490:3: otherlv_6= 'excluded-if' ( (lv_excludeExpression_7_0= ruleBooleanExpression ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCompilationUnit5482); 

                        	newLeafNode(otherlv_6, grammarAccess.getCompilationUnitAccess().getExcludedIfKeyword_6_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2494:1: ( (lv_excludeExpression_7_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2495:1: (lv_excludeExpression_7_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2495:1: (lv_excludeExpression_7_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2496:3: lv_excludeExpression_7_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompilationUnitAccess().getExcludeExpressionBooleanExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleCompilationUnit5503);
                    lv_excludeExpression_7_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompilationUnitRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_7_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompilationUnit"


    // $ANTLR start "entryRuleFeatureProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2520:1: entryRuleFeatureProject returns [EObject current=null] : iv_ruleFeatureProject= ruleFeatureProject EOF ;
    public final EObject entryRuleFeatureProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureProject = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2521:2: (iv_ruleFeatureProject= ruleFeatureProject EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2522:2: iv_ruleFeatureProject= ruleFeatureProject EOF
            {
             newCompositeNode(grammarAccess.getFeatureProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject5541);
            iv_ruleFeatureProject=ruleFeatureProject();

            state._fsp--;

             current =iv_ruleFeatureProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureProject5551); 

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
    // $ANTLR end "entryRuleFeatureProject"


    // $ANTLR start "ruleFeatureProject"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2529:1: ruleFeatureProject returns [EObject current=null] : ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleFeatureProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_feature_6_0 = null;

        EObject lv_resources_10_0 = null;

        EObject lv_resources_12_0 = null;

        EObject lv_excludeExpression_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2532:28: ( ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2533:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2533:1: ( () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2533:2: () otherlv_1= 'FeatureProject' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'feature' otherlv_5= '=' ( (lv_feature_6_0= ruleFeatureFile ) ) (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )? otherlv_14= '}' (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2533:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2534:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureProjectAccess().getFeatureProjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFeatureProject5597); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureProjectAccess().getFeatureProjectKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2543:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2544:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2544:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2545:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFeatureProject5618);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureProject5630); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleFeatureProject5642); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureProjectAccess().getFeatureKeyword_4());
                
            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureProject5654); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2573:1: ( (lv_feature_6_0= ruleFeatureFile ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2574:1: (lv_feature_6_0= ruleFeatureFile )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2574:1: (lv_feature_6_0= ruleFeatureFile )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2575:3: lv_feature_6_0= ruleFeatureFile
            {
             
            	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getFeatureFeatureFileParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_ruleFeatureProject5675);
            lv_feature_6_0=ruleFeatureFile();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
            	        }
                   		set(
                   			current, 
                   			"feature",
                    		lv_feature_6_0, 
                    		"FeatureFile");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2591:2: (otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2591:4: otherlv_7= 'resources' otherlv_8= '=' otherlv_9= '{' ( (lv_resources_10_0= ruleResource ) ) (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )* otherlv_13= '}'
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFeatureProject5688); 

                        	newLeafNode(otherlv_7, grammarAccess.getFeatureProjectAccess().getResourcesKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureProject5700); 

                        	newLeafNode(otherlv_8, grammarAccess.getFeatureProjectAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureProject5712); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureProjectAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2603:1: ( (lv_resources_10_0= ruleResource ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2604:1: (lv_resources_10_0= ruleResource )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2604:1: (lv_resources_10_0= ruleResource )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2605:3: lv_resources_10_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject5733);
                    lv_resources_10_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_10_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2621:2: (otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2621:4: otherlv_11= ',' ( (lv_resources_12_0= ruleResource ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureProject5746); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getFeatureProjectAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2625:1: ( (lv_resources_12_0= ruleResource ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2626:1: (lv_resources_12_0= ruleResource )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2626:1: (lv_resources_12_0= ruleResource )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2627:3: lv_resources_12_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getResourcesResourceParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleFeatureProject5767);
                    	    lv_resources_12_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_12_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureProject5781); 

                        	newLeafNode(otherlv_13, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureProject5795); 

                	newLeafNode(otherlv_14, grammarAccess.getFeatureProjectAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2651:1: (otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2651:3: otherlv_15= 'excluded-if' ( (lv_excludeExpression_16_0= ruleBooleanExpression ) )
                    {
                    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFeatureProject5808); 

                        	newLeafNode(otherlv_15, grammarAccess.getFeatureProjectAccess().getExcludedIfKeyword_9_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2655:1: ( (lv_excludeExpression_16_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2656:1: (lv_excludeExpression_16_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2656:1: (lv_excludeExpression_16_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2657:3: lv_excludeExpression_16_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureProjectAccess().getExcludeExpressionBooleanExpressionParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleFeatureProject5829);
                    lv_excludeExpression_16_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_16_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureProject"


    // $ANTLR start "entryRuleManifestFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2681:1: entryRuleManifestFile returns [EObject current=null] : iv_ruleManifestFile= ruleManifestFile EOF ;
    public final EObject entryRuleManifestFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManifestFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2682:2: (iv_ruleManifestFile= ruleManifestFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2683:2: iv_ruleManifestFile= ruleManifestFile EOF
            {
             newCompositeNode(grammarAccess.getManifestFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManifestFile_in_entryRuleManifestFile5867);
            iv_ruleManifestFile=ruleManifestFile();

            state._fsp--;

             current =iv_ruleManifestFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManifestFile5877); 

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
    // $ANTLR end "entryRuleManifestFile"


    // $ANTLR start "ruleManifestFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2690:1: ruleManifestFile returns [EObject current=null] : ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleManifestFile() throws RecognitionException {
        EObject current = null;

        Token lv_lazy_1_0=null;
        Token lv_singleton_2_0=null;
        Token otherlv_3=null;
        Token lv_symbolicname_4_0=null;
        Token lv_version_5_0=null;
        Token lv_executionEnvironment_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_bundlename_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_vendor_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_activatorClass_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_exportedPackages_21_0 = null;

        EObject lv_exportedPackages_23_0 = null;

        EObject lv_importedPackages_28_0 = null;

        EObject lv_importedPackages_30_0 = null;

        EObject lv_requiredBundles_35_0 = null;

        EObject lv_requiredBundles_37_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2693:28: ( ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2694:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2694:1: ( () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2694:2: () ( (lv_lazy_1_0= 'lazy' ) )? ( (lv_singleton_2_0= 'singleton' ) )? otherlv_3= 'ManifestFile' ( (lv_symbolicname_4_0= RULE_STRING ) ) ( (lv_version_5_0= RULE_STRING ) ) ( (lv_executionEnvironment_6_0= RULE_STRING ) ) otherlv_7= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )? (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )? (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2694:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2695:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getManifestFileAccess().getManifestFileAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2700:2: ( (lv_lazy_1_0= 'lazy' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2701:1: (lv_lazy_1_0= 'lazy' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2701:1: (lv_lazy_1_0= 'lazy' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2702:3: lv_lazy_1_0= 'lazy'
                    {
                    lv_lazy_1_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleManifestFile5929); 

                            newLeafNode(lv_lazy_1_0, grammarAccess.getManifestFileAccess().getLazyLazyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "lazy", true, "lazy");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2715:3: ( (lv_singleton_2_0= 'singleton' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==55) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2716:1: (lv_singleton_2_0= 'singleton' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2716:1: (lv_singleton_2_0= 'singleton' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2717:3: lv_singleton_2_0= 'singleton'
                    {
                    lv_singleton_2_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleManifestFile5961); 

                            newLeafNode(lv_singleton_2_0, grammarAccess.getManifestFileAccess().getSingletonSingletonKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManifestFileRule());
                    	        }
                           		setWithLastConsumed(current, "singleton", true, "singleton");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleManifestFile5987); 

                	newLeafNode(otherlv_3, grammarAccess.getManifestFileAccess().getManifestFileKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2734:1: ( (lv_symbolicname_4_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2735:1: (lv_symbolicname_4_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2735:1: (lv_symbolicname_4_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2736:3: lv_symbolicname_4_0= RULE_STRING
            {
            lv_symbolicname_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6004); 

            			newLeafNode(lv_symbolicname_4_0, grammarAccess.getManifestFileAccess().getSymbolicnameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"symbolicname",
                    		lv_symbolicname_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2752:2: ( (lv_version_5_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2753:1: (lv_version_5_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2753:1: (lv_version_5_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2754:3: lv_version_5_0= RULE_STRING
            {
            lv_version_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6026); 

            			newLeafNode(lv_version_5_0, grammarAccess.getManifestFileAccess().getVersionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2770:2: ( (lv_executionEnvironment_6_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:1: (lv_executionEnvironment_6_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2771:1: (lv_executionEnvironment_6_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2772:3: lv_executionEnvironment_6_0= RULE_STRING
            {
            lv_executionEnvironment_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6048); 

            			newLeafNode(lv_executionEnvironment_6_0, grammarAccess.getManifestFileAccess().getExecutionEnvironmentSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getManifestFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"executionEnvironment",
                    		lv_executionEnvironment_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile6065); 

                	newLeafNode(otherlv_7, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2792:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2794:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2794:1: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2795:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2798:2: ( ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2799:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2799:3: ( ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=4;
                int LA41_0 = input.LA(1);

                if ( LA41_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
                    alt41=3;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2801:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2801:4: ({...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2802:5: {...}? => ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2802:109: ( ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2803:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2806:6: ({...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2806:7: {...}? => (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2806:16: (otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2806:18: otherlv_9= 'bundlename' otherlv_10= '=' ( (lv_bundlename_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleManifestFile6123); 

            	        	newLeafNode(otherlv_9, grammarAccess.getManifestFileAccess().getBundlenameKeyword_8_0_0());
            	        
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6135); 

            	        	newLeafNode(otherlv_10, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2814:1: ( (lv_bundlename_11_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2815:1: (lv_bundlename_11_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2815:1: (lv_bundlename_11_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2816:3: lv_bundlename_11_0= RULE_STRING
            	    {
            	    lv_bundlename_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6152); 

            	    			newLeafNode(lv_bundlename_11_0, grammarAccess.getManifestFileAccess().getBundlenameSTRINGTerminalRuleCall_8_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"bundlename",
            	            		lv_bundlename_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2839:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2839:4: ({...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2840:5: {...}? => ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2840:109: ( ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2841:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2844:6: ({...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2844:7: {...}? => (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2844:16: (otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2844:18: otherlv_12= 'vendor' otherlv_13= '=' ( (lv_vendor_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleManifestFile6225); 

            	        	newLeafNode(otherlv_12, grammarAccess.getManifestFileAccess().getVendorKeyword_8_1_0());
            	        
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6237); 

            	        	newLeafNode(otherlv_13, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2852:1: ( (lv_vendor_14_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2853:1: (lv_vendor_14_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2853:1: (lv_vendor_14_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2854:3: lv_vendor_14_0= RULE_STRING
            	    {
            	    lv_vendor_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6254); 

            	    			newLeafNode(lv_vendor_14_0, grammarAccess.getManifestFileAccess().getVendorSTRINGTerminalRuleCall_8_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vendor",
            	            		lv_vendor_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2877:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2877:4: ({...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2878:5: {...}? => ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2878:109: ( ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2879:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getManifestFileAccess().getUnorderedGroup_8(), 2);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2882:6: ({...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2882:7: {...}? => (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleManifestFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2882:16: (otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2882:18: otherlv_15= 'activatorClass' otherlv_16= '=' ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleManifestFile6327); 

            	        	newLeafNode(otherlv_15, grammarAccess.getManifestFileAccess().getActivatorClassKeyword_8_2_0());
            	        
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6339); 

            	        	newLeafNode(otherlv_16, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_8_2_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2890:1: ( (lv_activatorClass_17_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2891:1: (lv_activatorClass_17_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2891:1: (lv_activatorClass_17_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2892:3: lv_activatorClass_17_0= RULE_STRING
            	    {
            	    lv_activatorClass_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleManifestFile6356); 

            	    			newLeafNode(lv_activatorClass_17_0, grammarAccess.getManifestFileAccess().getActivatorClassSTRINGTerminalRuleCall_8_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getManifestFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"activatorClass",
            	            		lv_activatorClass_17_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8()) ) {
                throw new FailedPredicateException(input, "ruleManifestFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getManifestFileAccess().getUnorderedGroup_8());
            	

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:2: (otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2923:4: otherlv_18= 'exportedPackages' otherlv_19= '=' otherlv_20= '{' ( (lv_exportedPackages_21_0= ruleExportedPackage ) ) (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )* otherlv_24= '}'
                    {
                    otherlv_18=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleManifestFile6421); 

                        	newLeafNode(otherlv_18, grammarAccess.getManifestFileAccess().getExportedPackagesKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6433); 

                        	newLeafNode(otherlv_19, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_9_1());
                        
                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile6445); 

                        	newLeafNode(otherlv_20, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_9_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2935:1: ( (lv_exportedPackages_21_0= ruleExportedPackage ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2936:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2936:1: (lv_exportedPackages_21_0= ruleExportedPackage )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2937:3: lv_exportedPackages_21_0= ruleExportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile6466);
                    lv_exportedPackages_21_0=ruleExportedPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"exportedPackages",
                            		lv_exportedPackages_21_0, 
                            		"ExportedPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2953:2: (otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2953:4: otherlv_22= ',' ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    {
                    	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile6479); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getManifestFileAccess().getCommaKeyword_9_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2957:1: ( (lv_exportedPackages_23_0= ruleExportedPackage ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2958:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2958:1: (lv_exportedPackages_23_0= ruleExportedPackage )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2959:3: lv_exportedPackages_23_0= ruleExportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getExportedPackagesExportedPackageParserRuleCall_9_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_ruleManifestFile6500);
                    	    lv_exportedPackages_23_0=ruleExportedPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exportedPackages",
                    	            		lv_exportedPackages_23_0, 
                    	            		"ExportedPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile6514); 

                        	newLeafNode(otherlv_24, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_9_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2979:3: (otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==61) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2979:5: otherlv_25= 'importedPackages' otherlv_26= '=' otherlv_27= '{' ( (lv_importedPackages_28_0= ruleImportedPackage ) ) (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )* otherlv_31= '}'
                    {
                    otherlv_25=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleManifestFile6529); 

                        	newLeafNode(otherlv_25, grammarAccess.getManifestFileAccess().getImportedPackagesKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6541); 

                        	newLeafNode(otherlv_26, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_10_1());
                        
                    otherlv_27=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile6553); 

                        	newLeafNode(otherlv_27, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_10_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2991:1: ( (lv_importedPackages_28_0= ruleImportedPackage ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2992:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2992:1: (lv_importedPackages_28_0= ruleImportedPackage )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:2993:3: lv_importedPackages_28_0= ruleImportedPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile6574);
                    lv_importedPackages_28_0=ruleImportedPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"importedPackages",
                            		lv_importedPackages_28_0, 
                            		"ImportedPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3009:2: (otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==18) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3009:4: otherlv_29= ',' ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    {
                    	    otherlv_29=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile6587); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getManifestFileAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3013:1: ( (lv_importedPackages_30_0= ruleImportedPackage ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3014:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3014:1: (lv_importedPackages_30_0= ruleImportedPackage )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3015:3: lv_importedPackages_30_0= ruleImportedPackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getImportedPackagesImportedPackageParserRuleCall_10_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_ruleManifestFile6608);
                    	    lv_importedPackages_30_0=ruleImportedPackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"importedPackages",
                    	            		lv_importedPackages_30_0, 
                    	            		"ImportedPackage");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile6622); 

                        	newLeafNode(otherlv_31, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_10_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3035:3: (otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3035:5: otherlv_32= 'requiredBundles' otherlv_33= '=' otherlv_34= '{' ( (lv_requiredBundles_35_0= ruleRequiredBundle ) ) (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )* otherlv_38= '}'
                    {
                    otherlv_32=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleManifestFile6637); 

                        	newLeafNode(otherlv_32, grammarAccess.getManifestFileAccess().getRequiredBundlesKeyword_11_0());
                        
                    otherlv_33=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleManifestFile6649); 

                        	newLeafNode(otherlv_33, grammarAccess.getManifestFileAccess().getEqualsSignKeyword_11_1());
                        
                    otherlv_34=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleManifestFile6661); 

                        	newLeafNode(otherlv_34, grammarAccess.getManifestFileAccess().getLeftCurlyBracketKeyword_11_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3047:1: ( (lv_requiredBundles_35_0= ruleRequiredBundle ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3048:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3048:1: (lv_requiredBundles_35_0= ruleRequiredBundle )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3049:3: lv_requiredBundles_35_0= ruleRequiredBundle
                    {
                     
                    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile6682);
                    lv_requiredBundles_35_0=ruleRequiredBundle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredBundles",
                            		lv_requiredBundles_35_0, 
                            		"RequiredBundle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3065:2: (otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==18) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3065:4: otherlv_36= ',' ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    {
                    	    otherlv_36=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleManifestFile6695); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getManifestFileAccess().getCommaKeyword_11_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3069:1: ( (lv_requiredBundles_37_0= ruleRequiredBundle ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3070:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3070:1: (lv_requiredBundles_37_0= ruleRequiredBundle )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3071:3: lv_requiredBundles_37_0= ruleRequiredBundle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getManifestFileAccess().getRequiredBundlesRequiredBundleParserRuleCall_11_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_ruleManifestFile6716);
                    	    lv_requiredBundles_37_0=ruleRequiredBundle();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getManifestFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredBundles",
                    	            		lv_requiredBundles_37_0, 
                    	            		"RequiredBundle");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile6730); 

                        	newLeafNode(otherlv_38, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_11_5());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleManifestFile6744); 

                	newLeafNode(otherlv_39, grammarAccess.getManifestFileAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManifestFile"


    // $ANTLR start "entryRulePluginXMLFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3103:1: entryRulePluginXMLFile returns [EObject current=null] : iv_rulePluginXMLFile= rulePluginXMLFile EOF ;
    public final EObject entryRulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePluginXMLFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3104:2: (iv_rulePluginXMLFile= rulePluginXMLFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3105:2: iv_rulePluginXMLFile= rulePluginXMLFile EOF
            {
             newCompositeNode(grammarAccess.getPluginXMLFileRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile6780);
            iv_rulePluginXMLFile=rulePluginXMLFile();

            state._fsp--;

             current =iv_rulePluginXMLFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePluginXMLFile6790); 

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
    // $ANTLR end "entryRulePluginXMLFile"


    // $ANTLR start "rulePluginXMLFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3112:1: rulePluginXMLFile returns [EObject current=null] : ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject rulePluginXMLFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_extensions_6_0 = null;

        EObject lv_extensions_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3115:28: ( ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3116:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3116:1: ( () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3116:2: () otherlv_1= 'PluginXMLFile' otherlv_2= '{' (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3116:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3117:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPluginXMLFileAccess().getPluginXMLFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulePluginXMLFile6836); 

                	newLeafNode(otherlv_1, grammarAccess.getPluginXMLFileAccess().getPluginXMLFileKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePluginXMLFile6848); 

                	newLeafNode(otherlv_2, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3130:1: (otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3130:3: otherlv_3= 'extensions' otherlv_4= '=' otherlv_5= '{' ( (lv_extensions_6_0= ruleExtension ) ) (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulePluginXMLFile6861); 

                        	newLeafNode(otherlv_3, grammarAccess.getPluginXMLFileAccess().getExtensionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePluginXMLFile6873); 

                        	newLeafNode(otherlv_4, grammarAccess.getPluginXMLFileAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePluginXMLFile6885); 

                        	newLeafNode(otherlv_5, grammarAccess.getPluginXMLFileAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3142:1: ( (lv_extensions_6_0= ruleExtension ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3143:1: (lv_extensions_6_0= ruleExtension )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3143:1: (lv_extensions_6_0= ruleExtension )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3144:3: lv_extensions_6_0= ruleExtension
                    {
                     
                    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile6906);
                    lv_extensions_6_0=ruleExtension();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPluginXMLFileRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_6_0, 
                            		"Extension");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3160:2: (otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==18) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3160:4: otherlv_7= ',' ( (lv_extensions_8_0= ruleExtension ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePluginXMLFile6919); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPluginXMLFileAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3164:1: ( (lv_extensions_8_0= ruleExtension ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3165:1: (lv_extensions_8_0= ruleExtension )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3165:1: (lv_extensions_8_0= ruleExtension )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3166:3: lv_extensions_8_0= ruleExtension
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPluginXMLFileAccess().getExtensionsExtensionParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExtension_in_rulePluginXMLFile6940);
                    	    lv_extensions_8_0=ruleExtension();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPluginXMLFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_8_0, 
                    	            		"Extension");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePluginXMLFile6954); 

                        	newLeafNode(otherlv_9, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePluginXMLFile6968); 

                	newLeafNode(otherlv_10, grammarAccess.getPluginXMLFileAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluginXMLFile"


    // $ANTLR start "entryRuleBuildProperties"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3198:1: entryRuleBuildProperties returns [EObject current=null] : iv_ruleBuildProperties= ruleBuildProperties EOF ;
    public final EObject entryRuleBuildProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildProperties = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3199:2: (iv_ruleBuildProperties= ruleBuildProperties EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3200:2: iv_ruleBuildProperties= ruleBuildProperties EOF
            {
             newCompositeNode(grammarAccess.getBuildPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties7004);
            iv_ruleBuildProperties=ruleBuildProperties();

            state._fsp--;

             current =iv_ruleBuildProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBuildProperties7014); 

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
    // $ANTLR end "entryRuleBuildProperties"


    // $ANTLR start "ruleBuildProperties"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3207:1: ruleBuildProperties returns [EObject current=null] : ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleBuildProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3210:28: ( ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3211:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3211:1: ( () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3211:2: () otherlv_1= 'BuildProperties' otherlv_2= '{' (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3211:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3212:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuildPropertiesAccess().getBuildPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleBuildProperties7060); 

                	newLeafNode(otherlv_1, grammarAccess.getBuildPropertiesAccess().getBuildPropertiesKeyword_1());
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBuildProperties7072); 

                	newLeafNode(otherlv_2, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3225:1: (otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==66) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3225:3: otherlv_3= 'binIncludes' otherlv_4= '=' otherlv_5= '{' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleBuildProperties7085); 

                        	newLeafNode(otherlv_3, grammarAccess.getBuildPropertiesAccess().getBinIncludesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBuildProperties7097); 

                        	newLeafNode(otherlv_4, grammarAccess.getBuildPropertiesAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBuildProperties7109); 

                        	newLeafNode(otherlv_5, grammarAccess.getBuildPropertiesAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3237:1: ( (otherlv_6= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3238:1: (otherlv_6= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3238:1: (otherlv_6= RULE_STRING )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3239:3: otherlv_6= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties7129); 

                    		newLeafNode(otherlv_6, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_3_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3250:2: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==18) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3250:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBuildProperties7142); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getBuildPropertiesAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3254:1: ( (otherlv_8= RULE_STRING ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3255:1: (otherlv_8= RULE_STRING )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3255:1: (otherlv_8= RULE_STRING )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3256:3: otherlv_8= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBuildPropertiesRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBuildProperties7162); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getBuildPropertiesAccess().getBinIncludesResourceCrossReference_3_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBuildProperties7176); 

                        	newLeafNode(otherlv_9, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBuildProperties7190); 

                	newLeafNode(otherlv_10, grammarAccess.getBuildPropertiesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuildProperties"


    // $ANTLR start "entryRuleProductFileFeaturebase"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3283:1: entryRuleProductFileFeaturebase returns [EObject current=null] : iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF ;
    public final EObject entryRuleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFileFeaturebase = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3284:2: (iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3285:2: iv_ruleProductFileFeaturebase= ruleProductFileFeaturebase EOF
            {
             newCompositeNode(grammarAccess.getProductFileFeaturebaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase7226);
            iv_ruleProductFileFeaturebase=ruleProductFileFeaturebase();

            state._fsp--;

             current =iv_ruleProductFileFeaturebase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFileFeaturebase7236); 

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
    // $ANTLR end "entryRuleProductFileFeaturebase"


    // $ANTLR start "ruleProductFileFeaturebase"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3292:1: ruleProductFileFeaturebase returns [EObject current=null] : ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
    public final EObject ruleProductFileFeaturebase() throws RecognitionException {
        EObject current = null;

        Token lv_includeLaunchers_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_vmArgs_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_programArgs_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_productName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_application_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_version_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        EObject lv_startconfigurations_24_0 = null;

        EObject lv_startconfigurations_26_0 = null;

        EObject lv_features_31_0 = null;

        EObject lv_features_33_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3295:28: ( ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3296:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3296:1: ( () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3296:2: () ( (lv_includeLaunchers_1_0= 'launchable' ) )? otherlv_2= 'ProductFileFeaturebase' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )? (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3296:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3297:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3302:2: ( (lv_includeLaunchers_1_0= 'launchable' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==67) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3303:1: (lv_includeLaunchers_1_0= 'launchable' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3303:1: (lv_includeLaunchers_1_0= 'launchable' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3304:3: lv_includeLaunchers_1_0= 'launchable'
                    {
                    lv_includeLaunchers_1_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleProductFileFeaturebase7288); 

                            newLeafNode(lv_includeLaunchers_1_0, grammarAccess.getProductFileFeaturebaseAccess().getIncludeLaunchersLaunchableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		setWithLastConsumed(current, "includeLaunchers", true, "launchable");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleProductFileFeaturebase7314); 

                	newLeafNode(otherlv_2, grammarAccess.getProductFileFeaturebaseAccess().getProductFileFeaturebaseKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3321:1: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3322:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3322:1: (lv_id_3_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3323:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7331); 

            			newLeafNode(lv_id_3_0, grammarAccess.getProductFileFeaturebaseAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase7348); 

                	newLeafNode(otherlv_4, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3343:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3345:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3345:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3346:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3349:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3350:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3350:3: ( ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=6;
                int LA53_0 = input.LA(1);

                if ( LA53_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
                    alt53=3;
                }
                else if ( LA53_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
                    alt53=4;
                }
                else if ( LA53_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
                    alt53=5;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3352:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3352:4: ({...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3353:5: {...}? => ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3353:119: ( ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3354:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:6: ({...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:7: {...}? => (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:16: (otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3357:18: otherlv_6= 'vmArgs' otherlv_7= '=' ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleProductFileFeaturebase7406); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsKeyword_5_0_0());
            	        
            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7418); 

            	        	newLeafNode(otherlv_7, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3365:1: ( (lv_vmArgs_8_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3366:1: (lv_vmArgs_8_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3366:1: (lv_vmArgs_8_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3367:3: lv_vmArgs_8_0= RULE_STRING
            	    {
            	    lv_vmArgs_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7435); 

            	    			newLeafNode(lv_vmArgs_8_0, grammarAccess.getProductFileFeaturebaseAccess().getVmArgsSTRINGTerminalRuleCall_5_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vmArgs",
            	            		lv_vmArgs_8_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3390:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3390:4: ({...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3391:5: {...}? => ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3391:119: ( ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3392:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3395:6: ({...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3395:7: {...}? => (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3395:16: (otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3395:18: otherlv_9= 'programArgs' otherlv_10= '=' ( (lv_programArgs_11_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleProductFileFeaturebase7508); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsKeyword_5_1_0());
            	        
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7520); 

            	        	newLeafNode(otherlv_10, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3403:1: ( (lv_programArgs_11_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3404:1: (lv_programArgs_11_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3404:1: (lv_programArgs_11_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3405:3: lv_programArgs_11_0= RULE_STRING
            	    {
            	    lv_programArgs_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7537); 

            	    			newLeafNode(lv_programArgs_11_0, grammarAccess.getProductFileFeaturebaseAccess().getProgramArgsSTRINGTerminalRuleCall_5_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"programArgs",
            	            		lv_programArgs_11_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3428:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3428:4: ({...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3429:5: {...}? => ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3429:119: ( ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3430:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:6: ({...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:7: {...}? => (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:16: (otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3433:18: otherlv_12= 'productName' otherlv_13= '=' ( (lv_productName_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleProductFileFeaturebase7610); 

            	        	newLeafNode(otherlv_12, grammarAccess.getProductFileFeaturebaseAccess().getProductNameKeyword_5_2_0());
            	        
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7622); 

            	        	newLeafNode(otherlv_13, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_2_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3441:1: ( (lv_productName_14_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3442:1: (lv_productName_14_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3442:1: (lv_productName_14_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3443:3: lv_productName_14_0= RULE_STRING
            	    {
            	    lv_productName_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7639); 

            	    			newLeafNode(lv_productName_14_0, grammarAccess.getProductFileFeaturebaseAccess().getProductNameSTRINGTerminalRuleCall_5_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"productName",
            	            		lv_productName_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3466:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3466:4: ({...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3467:5: {...}? => ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3467:119: ( ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3468:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3471:6: ({...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3471:7: {...}? => (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3471:16: (otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3471:18: otherlv_15= 'application' otherlv_16= '=' ( (lv_application_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleProductFileFeaturebase7712); 

            	        	newLeafNode(otherlv_15, grammarAccess.getProductFileFeaturebaseAccess().getApplicationKeyword_5_3_0());
            	        
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7724); 

            	        	newLeafNode(otherlv_16, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_3_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3479:1: ( (lv_application_17_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3480:1: (lv_application_17_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3480:1: (lv_application_17_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3481:3: lv_application_17_0= RULE_STRING
            	    {
            	    lv_application_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7741); 

            	    			newLeafNode(lv_application_17_0, grammarAccess.getProductFileFeaturebaseAccess().getApplicationSTRINGTerminalRuleCall_5_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"application",
            	            		lv_application_17_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3504:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3504:4: ({...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3505:5: {...}? => ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canSelect(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3505:119: ( ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3506:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3509:6: ({...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3509:7: {...}? => (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3509:16: (otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3509:18: otherlv_18= 'version' otherlv_19= '=' ( (lv_version_20_0= RULE_STRING ) )
            	    {
            	    otherlv_18=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleProductFileFeaturebase7814); 

            	        	newLeafNode(otherlv_18, grammarAccess.getProductFileFeaturebaseAccess().getVersionKeyword_5_4_0());
            	        
            	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7826); 

            	        	newLeafNode(otherlv_19, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_5_4_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3517:1: ( (lv_version_20_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3518:1: (lv_version_20_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3518:1: (lv_version_20_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3519:3: lv_version_20_0= RULE_STRING
            	    {
            	    lv_version_20_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7843); 

            	    			newLeafNode(lv_version_20_0, grammarAccess.getProductFileFeaturebaseAccess().getVersionSTRINGTerminalRuleCall_5_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductFileFeaturebaseRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"version",
            	            		lv_version_20_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleProductFileFeaturebase", "getUnorderedGroupHelper().canLeave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getProductFileFeaturebaseAccess().getUnorderedGroup_5());
            	

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3550:2: (otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==74) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3550:4: otherlv_21= 'startconfigurations' otherlv_22= '=' otherlv_23= '{' ( (lv_startconfigurations_24_0= ruleProductStartConfig ) ) (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )* otherlv_27= '}'
                    {
                    otherlv_21=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleProductFileFeaturebase7908); 

                        	newLeafNode(otherlv_21, grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsKeyword_6_0());
                        
                    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase7920); 

                        	newLeafNode(otherlv_22, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase7932); 

                        	newLeafNode(otherlv_23, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3562:1: ( (lv_startconfigurations_24_0= ruleProductStartConfig ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3563:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3563:1: (lv_startconfigurations_24_0= ruleProductStartConfig )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3564:3: lv_startconfigurations_24_0= ruleProductStartConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase7953);
                    lv_startconfigurations_24_0=ruleProductStartConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		add(
                           			current, 
                           			"startconfigurations",
                            		lv_startconfigurations_24_0, 
                            		"ProductStartConfig");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3580:2: (otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==18) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3580:4: otherlv_25= ',' ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase7966); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3584:1: ( (lv_startconfigurations_26_0= ruleProductStartConfig ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3585:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3585:1: (lv_startconfigurations_26_0= ruleProductStartConfig )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3586:3: lv_startconfigurations_26_0= ruleProductStartConfig
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getStartconfigurationsProductStartConfigParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase7987);
                    	    lv_startconfigurations_26_0=ruleProductStartConfig();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startconfigurations",
                    	            		lv_startconfigurations_26_0, 
                    	            		"ProductStartConfig");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase8001); 

                        	newLeafNode(otherlv_27, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3606:3: (otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==75) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3606:5: otherlv_28= 'features' otherlv_29= '=' otherlv_30= '{' ( (lv_features_31_0= ruleProductFeature ) ) (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )* otherlv_34= '}'
                    {
                    otherlv_28=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleProductFileFeaturebase8016); 

                        	newLeafNode(otherlv_28, grammarAccess.getProductFileFeaturebaseAccess().getFeaturesKeyword_7_0());
                        
                    otherlv_29=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProductFileFeaturebase8028); 

                        	newLeafNode(otherlv_29, grammarAccess.getProductFileFeaturebaseAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProductFileFeaturebase8040); 

                        	newLeafNode(otherlv_30, grammarAccess.getProductFileFeaturebaseAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3618:1: ( (lv_features_31_0= ruleProductFeature ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3619:1: (lv_features_31_0= ruleProductFeature )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3619:1: (lv_features_31_0= ruleProductFeature )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3620:3: lv_features_31_0= ruleProductFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase8061);
                    lv_features_31_0=ruleProductFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_31_0, 
                            		"ProductFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3636:2: (otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==18) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3636:4: otherlv_32= ',' ( (lv_features_33_0= ruleProductFeature ) )
                    	    {
                    	    otherlv_32=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProductFileFeaturebase8074); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getProductFileFeaturebaseAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3640:1: ( (lv_features_33_0= ruleProductFeature ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3641:1: (lv_features_33_0= ruleProductFeature )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3641:1: (lv_features_33_0= ruleProductFeature )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3642:3: lv_features_33_0= ruleProductFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProductFileFeaturebaseAccess().getFeaturesProductFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase8095);
                    	    lv_features_33_0=ruleProductFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProductFileFeaturebaseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_33_0, 
                    	            		"ProductFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase8109); 

                        	newLeafNode(otherlv_34, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_35=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProductFileFeaturebase8123); 

                	newLeafNode(otherlv_35, grammarAccess.getProductFileFeaturebaseAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductFileFeaturebase"


    // $ANTLR start "entryRuleFeatureFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3674:1: entryRuleFeatureFile returns [EObject current=null] : iv_ruleFeatureFile= ruleFeatureFile EOF ;
    public final EObject entryRuleFeatureFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureFile = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3675:2: (iv_ruleFeatureFile= ruleFeatureFile EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3676:2: iv_ruleFeatureFile= ruleFeatureFile EOF
            {
             newCompositeNode(grammarAccess.getFeatureFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile8159);
            iv_ruleFeatureFile=ruleFeatureFile();

            state._fsp--;

             current =iv_ruleFeatureFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureFile8169); 

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
    // $ANTLR end "entryRuleFeatureFile"


    // $ANTLR start "ruleFeatureFile"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3683:1: ruleFeatureFile returns [EObject current=null] : ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) ;
    public final EObject ruleFeatureFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_featureid_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_version_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_featurename_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_vendor_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_license_feature_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        EObject lv_description_16_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_license_22_0 = null;

        AntlrDatatypeRuleToken lv_license_feature_version_29_0 = null;

        EObject lv_plugins_33_0 = null;

        EObject lv_plugins_35_0 = null;

        EObject lv_requiredfeatures_40_0 = null;

        EObject lv_requiredfeatures_42_0 = null;

        EObject lv_includedfeatures_47_0 = null;

        EObject lv_includedfeatures_49_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3686:28: ( ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3687:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3687:1: ( () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3687:2: () otherlv_1= 'FeatureFile' ( (lv_featureid_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) ) (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )? (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )? (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )? otherlv_51= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3687:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureFileAccess().getFeatureFileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleFeatureFile8215); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureFileAccess().getFeatureFileKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3697:1: ( (lv_featureid_2_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3698:1: (lv_featureid_2_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3698:1: (lv_featureid_2_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3699:3: lv_featureid_2_0= RULE_STRING
            {
            lv_featureid_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile8232); 

            			newLeafNode(lv_featureid_2_0, grammarAccess.getFeatureFileAccess().getFeatureidSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureid",
                    		lv_featureid_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile8249); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3719:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3721:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3721:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3722:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3725:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3726:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3726:3: ( ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=8;
                int LA59_0 = input.LA(1);

                if ( LA59_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
                    alt59=2;
                }
                else if ( LA59_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
                    alt59=3;
                }
                else if ( LA59_0 ==78 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
                    alt59=4;
                }
                else if ( LA59_0 ==79 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
                    alt59=5;
                }
                else if ( LA59_0 ==80 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
                    alt59=6;
                }
                else if ( LA59_0 >=81 && LA59_0<=82 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
                    alt59=7;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3728:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3728:4: ({...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3729:5: {...}? => ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3729:108: ( ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3730:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3733:6: ({...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3733:7: {...}? => (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3733:16: (otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3733:18: otherlv_5= 'version' otherlv_6= '=' ( (lv_version_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleFeatureFile8307); 

            	        	newLeafNode(otherlv_5, grammarAccess.getFeatureFileAccess().getVersionKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8319); 

            	        	newLeafNode(otherlv_6, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3741:1: ( (lv_version_7_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3742:1: (lv_version_7_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3742:1: (lv_version_7_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3743:3: lv_version_7_0= RULE_STRING
            	    {
            	    lv_version_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile8336); 

            	    			newLeafNode(lv_version_7_0, grammarAccess.getFeatureFileAccess().getVersionSTRINGTerminalRuleCall_4_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"version",
            	            		lv_version_7_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3766:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3766:4: ({...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3767:5: {...}? => ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3767:108: ( ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3768:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3771:6: ({...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3771:7: {...}? => (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3771:16: (otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3771:18: otherlv_8= 'featurename' otherlv_9= '=' ( (lv_featurename_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleFeatureFile8409); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFeatureFileAccess().getFeaturenameKeyword_4_1_0());
            	        
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8421); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3779:1: ( (lv_featurename_10_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3780:1: (lv_featurename_10_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3780:1: (lv_featurename_10_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3781:3: lv_featurename_10_0= RULE_STRING
            	    {
            	    lv_featurename_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile8438); 

            	    			newLeafNode(lv_featurename_10_0, grammarAccess.getFeatureFileAccess().getFeaturenameSTRINGTerminalRuleCall_4_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"featurename",
            	            		lv_featurename_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3804:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3804:4: ({...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3805:5: {...}? => ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3805:108: ( ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3806:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3809:6: ({...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3809:7: {...}? => (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3809:16: (otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3809:18: otherlv_11= 'vendor' otherlv_12= '=' ( (lv_vendor_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleFeatureFile8511); 

            	        	newLeafNode(otherlv_11, grammarAccess.getFeatureFileAccess().getVendorKeyword_4_2_0());
            	        
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8523); 

            	        	newLeafNode(otherlv_12, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3817:1: ( (lv_vendor_13_0= RULE_STRING ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3818:1: (lv_vendor_13_0= RULE_STRING )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3818:1: (lv_vendor_13_0= RULE_STRING )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3819:3: lv_vendor_13_0= RULE_STRING
            	    {
            	    lv_vendor_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile8540); 

            	    			newLeafNode(lv_vendor_13_0, grammarAccess.getFeatureFileAccess().getVendorSTRINGTerminalRuleCall_4_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"vendor",
            	            		lv_vendor_13_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3842:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3842:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3843:5: {...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3843:108: ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3844:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3847:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3847:7: {...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3847:16: (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3847:18: otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= ruleLinkedString ) )
            	    {
            	    otherlv_14=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleFeatureFile8613); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFeatureFileAccess().getDescriptionKeyword_4_3_0());
            	        
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8625); 

            	        	newLeafNode(otherlv_15, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_3_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3855:1: ( (lv_description_16_0= ruleLinkedString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3856:1: (lv_description_16_0= ruleLinkedString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3856:1: (lv_description_16_0= ruleLinkedString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3857:3: lv_description_16_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getDescriptionLinkedStringParserRuleCall_4_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile8646);
            	    lv_description_16_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_16_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3880:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3880:4: ({...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:5: {...}? => ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3881:108: ( ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3882:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3885:6: ({...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3885:7: {...}? => (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3885:16: (otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3885:18: otherlv_17= 'copyright' otherlv_18= '=' ( (lv_copyright_19_0= ruleLinkedString ) )
            	    {
            	    otherlv_17=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleFeatureFile8714); 

            	        	newLeafNode(otherlv_17, grammarAccess.getFeatureFileAccess().getCopyrightKeyword_4_4_0());
            	        
            	    otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8726); 

            	        	newLeafNode(otherlv_18, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_4_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3893:1: ( (lv_copyright_19_0= ruleLinkedString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3894:1: (lv_copyright_19_0= ruleLinkedString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3894:1: (lv_copyright_19_0= ruleLinkedString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3895:3: lv_copyright_19_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getCopyrightLinkedStringParserRuleCall_4_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile8747);
            	    lv_copyright_19_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"copyright",
            	            		lv_copyright_19_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3918:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3918:4: ({...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3919:5: {...}? => ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3919:108: ( ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3920:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:6: ({...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:7: {...}? => (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:16: (otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3923:18: otherlv_20= 'license' otherlv_21= '=' ( (lv_license_22_0= ruleLinkedString ) )
            	    {
            	    otherlv_20=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleFeatureFile8815); 

            	        	newLeafNode(otherlv_20, grammarAccess.getFeatureFileAccess().getLicenseKeyword_4_5_0());
            	        
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8827); 

            	        	newLeafNode(otherlv_21, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_5_1());
            	        
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3931:1: ( (lv_license_22_0= ruleLinkedString ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3932:1: (lv_license_22_0= ruleLinkedString )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3932:1: (lv_license_22_0= ruleLinkedString )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3933:3: lv_license_22_0= ruleLinkedString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicenseLinkedStringParserRuleCall_4_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_ruleFeatureFile8848);
            	    lv_license_22_0=ruleLinkedString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"license",
            	            		lv_license_22_0, 
            	            		"LinkedString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3956:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3956:4: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3957:5: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3957:108: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3958:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3961:6: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3961:7: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    }
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3961:16: ( ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) ) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3963:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3963:1: ( ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?) )
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3964:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3967:2: ( ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?)
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3968:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+ {...}?
            	    {
            	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3968:3: ( ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) ) )+
            	    int cnt58=0;
            	    loop58:
            	    do {
            	        int alt58=3;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==81) ) {
            	            int LA58_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	                alt58=1;
            	            }


            	        }
            	        else if ( (LA58_0==82) ) {
            	            int LA58_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	                alt58=2;
            	            }


            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3970:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3970:4: ({...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3971:5: {...}? => ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0)");
            	    	    }
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3971:110: ( ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3972:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 0);
            	    	    	 				
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3975:6: ({...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3975:7: {...}? => (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3975:16: (otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3975:18: otherlv_24= 'license-feature' otherlv_25= '=' ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleFeatureFile8961); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureFileAccess().getLicenseFeatureKeyword_4_6_0_0());
            	    	        
            	    	    otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile8973); 

            	    	        	newLeafNode(otherlv_25, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_0_1());
            	    	        
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3983:1: ( (lv_license_feature_26_0= RULE_STRING ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3984:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    {
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3984:1: (lv_license_feature_26_0= RULE_STRING )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:3985:3: lv_license_feature_26_0= RULE_STRING
            	    	    {
            	    	    lv_license_feature_26_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeatureFile8990); 

            	    	    			newLeafNode(lv_license_feature_26_0, grammarAccess.getFeatureFileAccess().getLicense_featureSTRINGTerminalRuleCall_4_6_0_2_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getFeatureFileRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"license_feature",
            	    	            		lv_license_feature_26_0, 
            	    	            		"STRING");
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4008:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    {
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4008:4: ({...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4009:5: {...}? => ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1)");
            	    	    }
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4009:110: ( ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4010:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6(), 1);
            	    	    	 				
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4013:6: ({...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4013:7: {...}? => (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFeatureFile", "true");
            	    	    }
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4013:16: (otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4013:18: otherlv_27= 'license-feature-version' otherlv_28= '=' ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleFeatureFile9063); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getFeatureFileAccess().getLicenseFeatureVersionKeyword_4_6_1_0());
            	    	        
            	    	    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile9075); 

            	    	        	newLeafNode(otherlv_28, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_4_6_1_1());
            	    	        
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4021:1: ( (lv_license_feature_version_29_0= ruleVersion ) )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4022:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    {
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4022:1: (lv_license_feature_version_29_0= ruleVersion )
            	    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4023:3: lv_license_feature_version_29_0= ruleVersion
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getLicense_feature_versionVersionParserRuleCall_4_6_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleFeatureFile9096);
            	    	    lv_license_feature_version_29_0=ruleVersion();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
            	    	    	        }
            	    	           		set(
            	    	           			current, 
            	    	           			"license_feature_version",
            	    	            		lv_license_feature_version_29_0, 
            	    	            		"Version");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt58 >= 1 ) break loop58;
            	                EarlyExitException eee =
            	                    new EarlyExitException(58, input);
            	                throw eee;
            	        }
            	        cnt58++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6()) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4_6());
            	    	

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleFeatureFile", "getUnorderedGroupHelper().canLeave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFeatureFileAccess().getUnorderedGroup_4());
            	

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4069:2: (otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==83) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4069:4: otherlv_30= 'plugins' otherlv_31= '=' otherlv_32= '{' ( (lv_plugins_33_0= ruleFeaturePlugin ) ) (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleFeatureFile9202); 

                        	newLeafNode(otherlv_30, grammarAccess.getFeatureFileAccess().getPluginsKeyword_5_0());
                        
                    otherlv_31=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile9214); 

                        	newLeafNode(otherlv_31, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile9226); 

                        	newLeafNode(otherlv_32, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4081:1: ( (lv_plugins_33_0= ruleFeaturePlugin ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4082:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4082:1: (lv_plugins_33_0= ruleFeaturePlugin )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4083:3: lv_plugins_33_0= ruleFeaturePlugin
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile9247);
                    lv_plugins_33_0=ruleFeaturePlugin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"plugins",
                            		lv_plugins_33_0, 
                            		"FeaturePlugin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4099:2: (otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==18) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4099:4: otherlv_34= ',' ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    {
                    	    otherlv_34=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile9260); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getFeatureFileAccess().getCommaKeyword_5_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4103:1: ( (lv_plugins_35_0= ruleFeaturePlugin ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4104:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4104:1: (lv_plugins_35_0= ruleFeaturePlugin )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4105:3: lv_plugins_35_0= ruleFeaturePlugin
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getPluginsFeaturePluginParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile9281);
                    	    lv_plugins_35_0=ruleFeaturePlugin();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plugins",
                    	            		lv_plugins_35_0, 
                    	            		"FeaturePlugin");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile9295); 

                        	newLeafNode(otherlv_36, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_5_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4125:3: (otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==84) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4125:5: otherlv_37= 'required' otherlv_38= '=' otherlv_39= '{' ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) ) (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )* otherlv_43= '}'
                    {
                    otherlv_37=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleFeatureFile9310); 

                        	newLeafNode(otherlv_37, grammarAccess.getFeatureFileAccess().getRequiredKeyword_6_0());
                        
                    otherlv_38=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile9322); 

                        	newLeafNode(otherlv_38, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile9334); 

                        	newLeafNode(otherlv_39, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_6_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4137:1: ( (lv_requiredfeatures_40_0= ruleRequiredFeature ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4138:1: (lv_requiredfeatures_40_0= ruleRequiredFeature )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4139:3: lv_requiredfeatures_40_0= ruleRequiredFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile9355);
                    lv_requiredfeatures_40_0=ruleRequiredFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredfeatures",
                            		lv_requiredfeatures_40_0, 
                            		"RequiredFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4155:2: (otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==18) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4155:4: otherlv_41= ',' ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    {
                    	    otherlv_41=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile9368); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getFeatureFileAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4159:1: ( (lv_requiredfeatures_42_0= ruleRequiredFeature ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4160:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4160:1: (lv_requiredfeatures_42_0= ruleRequiredFeature )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4161:3: lv_requiredfeatures_42_0= ruleRequiredFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getRequiredfeaturesRequiredFeatureParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_ruleFeatureFile9389);
                    	    lv_requiredfeatures_42_0=ruleRequiredFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredfeatures",
                    	            		lv_requiredfeatures_42_0, 
                    	            		"RequiredFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile9403); 

                        	newLeafNode(otherlv_43, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4181:3: (otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==85) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4181:5: otherlv_44= 'included' otherlv_45= '=' otherlv_46= '{' ( (lv_includedfeatures_47_0= ruleIncludedFeature ) ) (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )* otherlv_50= '}'
                    {
                    otherlv_44=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleFeatureFile9418); 

                        	newLeafNode(otherlv_44, grammarAccess.getFeatureFileAccess().getIncludedKeyword_7_0());
                        
                    otherlv_45=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFeatureFile9430); 

                        	newLeafNode(otherlv_45, grammarAccess.getFeatureFileAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_46=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureFile9442); 

                        	newLeafNode(otherlv_46, grammarAccess.getFeatureFileAccess().getLeftCurlyBracketKeyword_7_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4193:1: ( (lv_includedfeatures_47_0= ruleIncludedFeature ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4194:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4194:1: (lv_includedfeatures_47_0= ruleIncludedFeature )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4195:3: lv_includedfeatures_47_0= ruleIncludedFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile9463);
                    lv_includedfeatures_47_0=ruleIncludedFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	        }
                           		add(
                           			current, 
                           			"includedfeatures",
                            		lv_includedfeatures_47_0, 
                            		"IncludedFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4211:2: (otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==18) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4211:4: otherlv_48= ',' ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    {
                    	    otherlv_48=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeatureFile9476); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getFeatureFileAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4215:1: ( (lv_includedfeatures_49_0= ruleIncludedFeature ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4216:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4216:1: (lv_includedfeatures_49_0= ruleIncludedFeature )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4217:3: lv_includedfeatures_49_0= ruleIncludedFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureFileAccess().getIncludedfeaturesIncludedFeatureParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_ruleFeatureFile9497);
                    	    lv_includedfeatures_49_0=ruleIncludedFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"includedfeatures",
                    	            		lv_includedfeatures_49_0, 
                    	            		"IncludedFeature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_50=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile9511); 

                        	newLeafNode(otherlv_50, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_51=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFeatureFile9525); 

                	newLeafNode(otherlv_51, grammarAccess.getFeatureFileAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureFile"


    // $ANTLR start "entryRuleImportedPackage"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4249:1: entryRuleImportedPackage returns [EObject current=null] : iv_ruleImportedPackage= ruleImportedPackage EOF ;
    public final EObject entryRuleImportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportedPackage = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4250:2: (iv_ruleImportedPackage= ruleImportedPackage EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4251:2: iv_ruleImportedPackage= ruleImportedPackage EOF
            {
             newCompositeNode(grammarAccess.getImportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage9561);
            iv_ruleImportedPackage=ruleImportedPackage();

            state._fsp--;

             current =iv_ruleImportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportedPackage9571); 

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
    // $ANTLR end "entryRuleImportedPackage"


    // $ANTLR start "ruleImportedPackage"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4258:1: ruleImportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleImportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_minExclusive_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_maxExclusive_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_minVersion_4_0 = null;

        AntlrDatatypeRuleToken lv_maxVersion_6_0 = null;

        EObject lv_excludeExpression_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4261:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4262:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4262:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4262:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4262:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4263:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportedPackageAccess().getImportedPackageAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4268:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4269:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4269:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4270:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportedPackage9622); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImportedPackageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportedPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4286:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_INT||(LA72_0>=86 && LA72_0<=87)) ) {
                alt72=1;
            }
            else if ( (LA72_0==18) ) {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==EOF||LA72_2==RULE_INT||(LA72_2>=18 && LA72_2<=19)||LA72_2==24||(LA72_2>=88 && LA72_2<=89)) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4286:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4286:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_INT||LA67_0==18||LA67_0==86) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==87) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4286:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4286:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==86) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4287:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4287:1: (lv_minExclusive_2_0= '(' )
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4288:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleImportedPackage9647); 

                                            newLeafNode(lv_minExclusive_2_0, grammarAccess.getImportedPackageAccess().getMinExclusiveLeftParenthesisKeyword_2_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getImportedPackageRule());
                                    	        }
                                           		setWithLastConsumed(current, "minExclusive", true, "(");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4302:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleImportedPackage9679); 

                                	newLeafNode(otherlv_3, grammarAccess.getImportedPackageAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4306:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4307:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4307:1: (lv_minVersion_4_0= ruleVersion )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4308:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage9701);
                            lv_minVersion_4_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImportedPackageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"minVersion",
                                    		lv_minVersion_4_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImportedPackage9714); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportedPackageAccess().getCommaKeyword_2_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4328:1: ( ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4328:2: ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4328:2: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4329:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4329:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4330:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportedPackageAccess().getMaxVersionVersionParserRuleCall_2_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleImportedPackage9736);
                            lv_maxVersion_6_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImportedPackageRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"maxVersion",
                                    		lv_maxVersion_6_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4346:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==EOF||(LA71_0>=18 && LA71_0<=19)||LA71_0==24||LA71_0==88) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==89) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4346:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4346:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==88) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4347:1: (lv_maxExclusive_7_0= ')' )
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4348:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleImportedPackage9756); 

                                            newLeafNode(lv_maxExclusive_7_0, grammarAccess.getImportedPackageAccess().getMaxExclusiveRightParenthesisKeyword_2_3_1_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getImportedPackageRule());
                                    	        }
                                           		setWithLastConsumed(current, "maxExclusive", true, ")");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4362:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleImportedPackage9788); 

                                	newLeafNode(otherlv_8, grammarAccess.getImportedPackageAccess().getRightSquareBracketKeyword_2_3_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4366:5: (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==24) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4366:7: otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) )
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleImportedPackage9805); 

                        	newLeafNode(otherlv_9, grammarAccess.getImportedPackageAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4370:1: ( (lv_excludeExpression_10_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4371:1: (lv_excludeExpression_10_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4371:1: (lv_excludeExpression_10_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4372:3: lv_excludeExpression_10_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportedPackageAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleImportedPackage9826);
                    lv_excludeExpression_10_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportedPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_10_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportedPackage"


    // $ANTLR start "entryRuleExportedPackage"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4396:1: entryRuleExportedPackage returns [EObject current=null] : iv_ruleExportedPackage= ruleExportedPackage EOF ;
    public final EObject entryRuleExportedPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedPackage = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4397:2: (iv_ruleExportedPackage= ruleExportedPackage EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4398:2: iv_ruleExportedPackage= ruleExportedPackage EOF
            {
             newCompositeNode(grammarAccess.getExportedPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage9864);
            iv_ruleExportedPackage=ruleExportedPackage();

            state._fsp--;

             current =iv_ruleExportedPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExportedPackage9874); 

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
    // $ANTLR end "entryRuleExportedPackage"


    // $ANTLR start "ruleExportedPackage"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4405:1: ruleExportedPackage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleExportedPackage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        EObject lv_excludeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4408:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4409:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4409:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4409:2: () ( (lv_name_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4409:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4410:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExportedPackageAccess().getExportedPackageAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4415:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4416:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4416:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4417:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExportedPackage9925); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExportedPackageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExportedPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4433:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4434:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4434:1: (lv_version_2_0= ruleVersion )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4435:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportedPackageAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleExportedPackage9951);
                    lv_version_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExportedPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4451:3: (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==24) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4451:5: otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExportedPackage9965); 

                        	newLeafNode(otherlv_3, grammarAccess.getExportedPackageAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4455:1: ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4456:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4456:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4457:3: lv_excludeExpression_4_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExportedPackageAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExportedPackage9986);
                    lv_excludeExpression_4_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExportedPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_4_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExportedPackage"


    // $ANTLR start "entryRuleExtension"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4481:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4482:2: (iv_ruleExtension= ruleExtension EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4483:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtension_in_entryRuleExtension10024);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtension10034); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4490:1: ruleExtension returns [EObject current=null] : ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token lv_point_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_elements_9_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_excludeExpression_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4493:28: ( ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4494:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4494:1: ( () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4494:2: () ( (lv_point_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )? (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )? otherlv_13= '}' (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4494:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4495:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExtensionAccess().getExtensionAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4500:2: ( (lv_point_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4501:1: (lv_point_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4501:1: (lv_point_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4502:3: lv_point_1_0= RULE_STRING
            {
            lv_point_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension10085); 

            			newLeafNode(lv_point_1_0, grammarAccess.getExtensionAccess().getPointSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"point",
                    		lv_point_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension10102); 

                	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4522:1: (otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==90) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4522:3: otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleExtension10115); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getIdKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension10127); 

                        	newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4530:1: ( (lv_id_5_0= RULE_STRING ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4531:1: (lv_id_5_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4531:1: (lv_id_5_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4532:3: lv_id_5_0= RULE_STRING
                    {
                    lv_id_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExtension10144); 

                    			newLeafNode(lv_id_5_0, grammarAccess.getExtensionAccess().getIdSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtensionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4548:4: (otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==91) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4548:6: otherlv_6= 'elements' otherlv_7= '=' otherlv_8= '{' ( (lv_elements_9_0= ruleElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_6=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleExtension10164); 

                        	newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getElementsKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtension10176); 

                        	newLeafNode(otherlv_7, grammarAccess.getExtensionAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExtension10188); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4560:1: ( (lv_elements_9_0= ruleElement ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4561:1: (lv_elements_9_0= ruleElement )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4561:1: (lv_elements_9_0= ruleElement )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4562:3: lv_elements_9_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension10209);
                    lv_elements_9_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_9_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4578:2: (otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==18) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4578:4: otherlv_10= ',' ( (lv_elements_11_0= ruleElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtension10222); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4582:1: ( (lv_elements_11_0= ruleElement ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4583:1: (lv_elements_11_0= ruleElement )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4583:1: (lv_elements_11_0= ruleElement )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4584:3: lv_elements_11_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExtensionAccess().getElementsElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleExtension10243);
                    	    lv_elements_11_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_11_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension10257); 

                        	newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtension10271); 

                	newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getRightCurlyBracketKeyword_5());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4608:1: (otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==24) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4608:3: otherlv_14= 'excluded-if' ( (lv_excludeExpression_15_0= ruleBooleanExpression ) )
                    {
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExtension10284); 

                        	newLeafNode(otherlv_14, grammarAccess.getExtensionAccess().getExcludedIfKeyword_6_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4612:1: ( (lv_excludeExpression_15_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4613:1: (lv_excludeExpression_15_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4613:1: (lv_excludeExpression_15_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4614:3: lv_excludeExpression_15_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtensionAccess().getExcludeExpressionBooleanExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExtension10305);
                    lv_excludeExpression_15_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_15_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleElement"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4638:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4639:2: (iv_ruleElement= ruleElement EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4640:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement10343);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement10353); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4647:1: ruleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;

        EObject lv_children_13_0 = null;

        EObject lv_children_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4650:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4651:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4651:1: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4651:2: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )? (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4651:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementAccess().getElementAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4657:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4658:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4658:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4659:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement10404); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement10421); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4679:1: (otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==92) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4679:3: otherlv_3= 'attributes' otherlv_4= '=' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )* otherlv_9= '}'
                    {
                    otherlv_3=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleElement10434); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getAttributesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement10446); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementAccess().getEqualsSignKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement10458); 

                        	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4691:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4692:1: (lv_attributes_6_0= ruleAttribute )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4692:1: (lv_attributes_6_0= ruleAttribute )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4693:3: lv_attributes_6_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement10479);
                    lv_attributes_6_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_6_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4709:2: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==18) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4709:4: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttribute ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement10492); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getElementAccess().getCommaKeyword_3_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4713:1: ( (lv_attributes_8_0= ruleAttribute ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4714:1: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4714:1: (lv_attributes_8_0= ruleAttribute )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4715:3: lv_attributes_8_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getAttributesAttributeParserRuleCall_3_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleElement10513);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_8_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement10527); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_5());
                        

                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4735:3: (otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==26) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4735:5: otherlv_10= 'children' otherlv_11= '=' otherlv_12= '{' ( (lv_children_13_0= ruleElement ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElement10542); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementAccess().getChildrenKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement10554); 

                        	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1());
                        
                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement10566); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4747:1: ( (lv_children_13_0= ruleElement ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4748:1: (lv_children_13_0= ruleElement )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4748:1: (lv_children_13_0= ruleElement )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4749:3: lv_children_13_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement10587);
                    lv_children_13_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"children",
                            		lv_children_13_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4765:2: (otherlv_14= ',' ( (lv_children_15_0= ruleElement ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==18) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4765:4: otherlv_14= ',' ( (lv_children_15_0= ruleElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement10600); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_4_4_0());
                    	        
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4769:1: ( (lv_children_15_0= ruleElement ) )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4770:1: (lv_children_15_0= ruleElement )
                    	    {
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4770:1: (lv_children_15_0= ruleElement )
                    	    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4771:3: lv_children_15_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getChildrenElementParserRuleCall_4_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement10621);
                    	    lv_children_15_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_15_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement10635); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4_5());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement10649); 

                	newLeafNode(otherlv_17, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAttribute"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4803:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4804:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4805:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute10685);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute10695); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4812:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4815:28: ( ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4816:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4816:1: ( () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4816:2: () otherlv_1= '{' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4816:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4817:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttribute10741); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4826:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4827:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4827:1: (lv_name_2_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4828:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute10758); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute10775); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4848:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4849:1: (lv_value_4_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4849:1: (lv_value_4_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4850:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute10792); 

            			newLeafNode(lv_value_4_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute10809); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequiredBundle"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4878:1: entryRuleRequiredBundle returns [EObject current=null] : iv_ruleRequiredBundle= ruleRequiredBundle EOF ;
    public final EObject entryRuleRequiredBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBundle = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4879:2: (iv_ruleRequiredBundle= ruleRequiredBundle EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4880:2: iv_ruleRequiredBundle= ruleRequiredBundle EOF
            {
             newCompositeNode(grammarAccess.getRequiredBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle10845);
            iv_ruleRequiredBundle=ruleRequiredBundle();

            state._fsp--;

             current =iv_ruleRequiredBundle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredBundle10855); 

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
    // $ANTLR end "entryRuleRequiredBundle"


    // $ANTLR start "ruleRequiredBundle"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4887:1: ruleRequiredBundle returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleRequiredBundle() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_minExclusive_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_maxExclusive_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_minVersion_4_0 = null;

        AntlrDatatypeRuleToken lv_maxVersion_6_0 = null;

        EObject lv_excludeExpression_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4890:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4891:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4891:1: ( () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4891:2: () ( (lv_name_1_0= RULE_STRING ) ) ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )? (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4891:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredBundleAccess().getRequiredBundleAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4897:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4898:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4898:1: (lv_name_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4899:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredBundle10906); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequiredBundleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredBundleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4915:2: ( ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_INT||(LA90_0>=86 && LA90_0<=87)) ) {
                alt90=1;
            }
            else if ( (LA90_0==18) ) {
                int LA90_2 = input.LA(2);

                if ( (LA90_2==EOF||LA90_2==RULE_INT||(LA90_2>=18 && LA90_2<=19)||LA90_2==24||(LA90_2>=88 && LA90_2<=89)) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4915:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' ) ( (lv_minVersion_4_0= ruleVersion ) )? otherlv_5= ',' ( (lv_maxVersion_6_0= ruleVersion ) )? ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4915:3: ( ( (lv_minExclusive_2_0= '(' ) )? | otherlv_3= '[' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_INT||LA85_0==18||LA85_0==86) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==87) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4915:4: ( (lv_minExclusive_2_0= '(' ) )?
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4915:4: ( (lv_minExclusive_2_0= '(' ) )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==86) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4916:1: (lv_minExclusive_2_0= '(' )
                                    {
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4916:1: (lv_minExclusive_2_0= '(' )
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4917:3: lv_minExclusive_2_0= '('
                                    {
                                    lv_minExclusive_2_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleRequiredBundle10931); 

                                            newLeafNode(lv_minExclusive_2_0, grammarAccess.getRequiredBundleAccess().getMinExclusiveLeftParenthesisKeyword_2_0_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getRequiredBundleRule());
                                    	        }
                                           		setWithLastConsumed(current, "minExclusive", true, "(");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4931:7: otherlv_3= '['
                            {
                            otherlv_3=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleRequiredBundle10963); 

                                	newLeafNode(otherlv_3, grammarAccess.getRequiredBundleAccess().getLeftSquareBracketKeyword_2_0_1());
                                

                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4935:2: ( (lv_minVersion_4_0= ruleVersion ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_INT) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4936:1: (lv_minVersion_4_0= ruleVersion )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4936:1: (lv_minVersion_4_0= ruleVersion )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4937:3: lv_minVersion_4_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMinVersionVersionParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle10985);
                            lv_minVersion_4_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRequiredBundleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"minVersion",
                                    		lv_minVersion_4_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRequiredBundle10998); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequiredBundleAccess().getCommaKeyword_2_2());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4957:1: ( (lv_maxVersion_6_0= ruleVersion ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_INT) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4958:1: (lv_maxVersion_6_0= ruleVersion )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4958:1: (lv_maxVersion_6_0= ruleVersion )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4959:3: lv_maxVersion_6_0= ruleVersion
                            {
                             
                            	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getMaxVersionVersionParserRuleCall_2_3_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredBundle11019);
                            lv_maxVersion_6_0=ruleVersion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getRequiredBundleRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"maxVersion",
                                    		lv_maxVersion_6_0, 
                                    		"Version");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4975:3: ( ( (lv_maxExclusive_7_0= ')' ) )? | otherlv_8= ']' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==EOF||(LA89_0>=18 && LA89_0<=19)||LA89_0==24||LA89_0==88) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==89) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4975:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4975:4: ( (lv_maxExclusive_7_0= ')' ) )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==88) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4976:1: (lv_maxExclusive_7_0= ')' )
                                    {
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4976:1: (lv_maxExclusive_7_0= ')' )
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4977:3: lv_maxExclusive_7_0= ')'
                                    {
                                    lv_maxExclusive_7_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleRequiredBundle11039); 

                                            newLeafNode(lv_maxExclusive_7_0, grammarAccess.getRequiredBundleAccess().getMaxExclusiveRightParenthesisKeyword_2_4_0_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getRequiredBundleRule());
                                    	        }
                                           		setWithLastConsumed(current, "maxExclusive", true, ")");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4991:7: otherlv_8= ']'
                            {
                            otherlv_8=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleRequiredBundle11071); 

                                	newLeafNode(otherlv_8, grammarAccess.getRequiredBundleAccess().getRightSquareBracketKeyword_2_4_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4995:4: (otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==24) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4995:6: otherlv_9= 'excluded-if' ( (lv_excludeExpression_10_0= ruleBooleanExpression ) )
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRequiredBundle11087); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequiredBundleAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:4999:1: ( (lv_excludeExpression_10_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5000:1: (lv_excludeExpression_10_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5000:1: (lv_excludeExpression_10_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5001:3: lv_excludeExpression_10_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequiredBundleAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleRequiredBundle11108);
                    lv_excludeExpression_10_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequiredBundleRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_10_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredBundle"


    // $ANTLR start "entryRuleLinkedString"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5025:1: entryRuleLinkedString returns [EObject current=null] : iv_ruleLinkedString= ruleLinkedString EOF ;
    public final EObject entryRuleLinkedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedString = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5026:2: (iv_ruleLinkedString= ruleLinkedString EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5027:2: iv_ruleLinkedString= ruleLinkedString EOF
            {
             newCompositeNode(grammarAccess.getLinkedStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLinkedString_in_entryRuleLinkedString11146);
            iv_ruleLinkedString=ruleLinkedString();

            state._fsp--;

             current =iv_ruleLinkedString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLinkedString11156); 

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
    // $ANTLR end "entryRuleLinkedString"


    // $ANTLR start "ruleLinkedString"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5034:1: ruleLinkedString returns [EObject current=null] : ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleLinkedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_weburl_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5037:28: ( ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5038:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5038:1: ( () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5038:2: () otherlv_1= 'LinkedString' ( (lv_weburl_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5038:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5039:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLinkedStringAccess().getLinkedStringAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleLinkedString11202); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkedStringAccess().getLinkedStringKeyword_1());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5048:1: ( (lv_weburl_2_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5049:1: (lv_weburl_2_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5049:1: (lv_weburl_2_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5050:3: lv_weburl_2_0= RULE_STRING
            {
            lv_weburl_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString11219); 

            			newLeafNode(lv_weburl_2_0, grammarAccess.getLinkedStringAccess().getWeburlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkedStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weburl",
                    		lv_weburl_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLinkedString11236); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkedStringAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5070:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5071:1: (lv_value_4_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5071:1: (lv_value_4_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5072:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLinkedString11253); 

            			newLeafNode(lv_value_4_0, grammarAccess.getLinkedStringAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkedStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLinkedString11270); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkedStringAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkedString"


    // $ANTLR start "entryRuleFeaturePlugin"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5100:1: entryRuleFeaturePlugin returns [EObject current=null] : iv_ruleFeaturePlugin= ruleFeaturePlugin EOF ;
    public final EObject entryRuleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePlugin = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5101:2: (iv_ruleFeaturePlugin= ruleFeaturePlugin EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5102:2: iv_ruleFeaturePlugin= ruleFeaturePlugin EOF
            {
             newCompositeNode(grammarAccess.getFeaturePluginRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin11306);
            iv_ruleFeaturePlugin=ruleFeaturePlugin();

            state._fsp--;

             current =iv_ruleFeaturePlugin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePlugin11316); 

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
    // $ANTLR end "entryRuleFeaturePlugin"


    // $ANTLR start "ruleFeaturePlugin"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5109:1: ruleFeaturePlugin returns [EObject current=null] : ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleFeaturePlugin() throws RecognitionException {
        EObject current = null;

        Token lv_unpack_1_0=null;
        Token lv_fragment_2_0=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        EObject lv_excludeExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5112:28: ( ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5113:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5113:1: ( () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5113:2: () ( (lv_unpack_1_0= 'unpacked' ) )? ( (lv_fragment_2_0= 'fragment' ) )? ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5113:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5114:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeaturePluginAccess().getFeaturePluginAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5119:2: ( (lv_unpack_1_0= 'unpacked' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==94) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5120:1: (lv_unpack_1_0= 'unpacked' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5120:1: (lv_unpack_1_0= 'unpacked' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5121:3: lv_unpack_1_0= 'unpacked'
                    {
                    lv_unpack_1_0=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleFeaturePlugin11368); 

                            newLeafNode(lv_unpack_1_0, grammarAccess.getFeaturePluginAccess().getUnpackUnpackedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "unpack", true, "unpacked");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5134:3: ( (lv_fragment_2_0= 'fragment' ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==50) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5135:1: (lv_fragment_2_0= 'fragment' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5135:1: (lv_fragment_2_0= 'fragment' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5136:3: lv_fragment_2_0= 'fragment'
                    {
                    lv_fragment_2_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFeaturePlugin11400); 

                            newLeafNode(lv_fragment_2_0, grammarAccess.getFeaturePluginAccess().getFragmentFragmentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeaturePluginRule());
                    	        }
                           		setWithLastConsumed(current, "fragment", true, "fragment");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5149:3: ( (lv_id_3_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5150:1: (lv_id_3_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5150:1: (lv_id_3_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5151:3: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeaturePlugin11431); 

            			newLeafNode(lv_id_3_0, grammarAccess.getFeaturePluginAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeaturePluginRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5167:2: (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==24) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5167:4: otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFeaturePlugin11449); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeaturePluginAccess().getExcludedIfKeyword_4_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5171:1: ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5172:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5172:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5173:3: lv_excludeExpression_5_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeaturePluginAccess().getExcludeExpressionBooleanExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleFeaturePlugin11470);
                    lv_excludeExpression_5_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeaturePluginRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_5_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeaturePlugin"


    // $ANTLR start "entryRuleRequiredFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5197:1: entryRuleRequiredFeature returns [EObject current=null] : iv_ruleRequiredFeature= ruleRequiredFeature EOF ;
    public final EObject entryRuleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeature = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5198:2: (iv_ruleRequiredFeature= ruleRequiredFeature EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5199:2: iv_ruleRequiredFeature= ruleRequiredFeature EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature11508);
            iv_ruleRequiredFeature=ruleRequiredFeature();

            state._fsp--;

             current =iv_ruleRequiredFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequiredFeature11518); 

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
    // $ANTLR end "entryRuleRequiredFeature"


    // $ANTLR start "ruleRequiredFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5206:1: ruleRequiredFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleRequiredFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_4=null;
        Enumerator lv_match_2_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;

        EObject lv_excludeExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5209:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5210:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5210:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5210:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_match_2_0= ruleMatchRule ) ) ( (lv_version_3_0= ruleVersion ) ) (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5210:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5211:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredFeatureAccess().getRequiredFeatureAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5216:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5217:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5217:1: (lv_id_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5218:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequiredFeature11569); 

            			newLeafNode(lv_id_1_0, grammarAccess.getRequiredFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5234:2: ( (lv_match_2_0= ruleMatchRule ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5235:1: (lv_match_2_0= ruleMatchRule )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5235:1: (lv_match_2_0= ruleMatchRule )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5236:3: lv_match_2_0= ruleMatchRule
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getMatchMatchRuleEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMatchRule_in_ruleRequiredFeature11595);
            lv_match_2_0=ruleMatchRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"match",
                    		lv_match_2_0, 
                    		"MatchRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5252:2: ( (lv_version_3_0= ruleVersion ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5253:1: (lv_version_3_0= ruleVersion )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5253:1: (lv_version_3_0= ruleVersion )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5254:3: lv_version_3_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getVersionVersionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleRequiredFeature11616);
            lv_version_3_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_3_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5270:2: (otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==24) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5270:4: otherlv_4= 'excluded-if' ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRequiredFeature11629); 

                        	newLeafNode(otherlv_4, grammarAccess.getRequiredFeatureAccess().getExcludedIfKeyword_4_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5274:1: ( (lv_excludeExpression_5_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5275:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5275:1: (lv_excludeExpression_5_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5276:3: lv_excludeExpression_5_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequiredFeatureAccess().getExcludeExpressionBooleanExpressionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleRequiredFeature11650);
                    lv_excludeExpression_5_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequiredFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_5_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredFeature"


    // $ANTLR start "entryRuleIncludedFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5300:1: entryRuleIncludedFeature returns [EObject current=null] : iv_ruleIncludedFeature= ruleIncludedFeature EOF ;
    public final EObject entryRuleIncludedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludedFeature = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5301:2: (iv_ruleIncludedFeature= ruleIncludedFeature EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5302:2: iv_ruleIncludedFeature= ruleIncludedFeature EOF
            {
             newCompositeNode(grammarAccess.getIncludedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature11688);
            iv_ruleIncludedFeature=ruleIncludedFeature();

            state._fsp--;

             current =iv_ruleIncludedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludedFeature11698); 

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
    // $ANTLR end "entryRuleIncludedFeature"


    // $ANTLR start "ruleIncludedFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5309:1: ruleIncludedFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleIncludedFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        EObject lv_excludeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5312:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5313:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5313:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5313:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= ruleVersion ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5313:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncludedFeatureAccess().getIncludedFeatureAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5319:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5320:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5320:1: (lv_id_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5321:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludedFeature11749); 

            			newLeafNode(lv_id_1_0, grammarAccess.getIncludedFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludedFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5337:2: ( (lv_version_2_0= ruleVersion ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_INT) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5338:1: (lv_version_2_0= ruleVersion )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5338:1: (lv_version_2_0= ruleVersion )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5339:3: lv_version_2_0= ruleVersion
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludedFeatureAccess().getVersionVersionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVersion_in_ruleIncludedFeature11775);
                    lv_version_2_0=ruleVersion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIncludedFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"Version");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5355:3: (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==24) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5355:5: otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIncludedFeature11789); 

                        	newLeafNode(otherlv_3, grammarAccess.getIncludedFeatureAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5359:1: ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5360:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5360:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5361:3: lv_excludeExpression_4_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludedFeatureAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleIncludedFeature11810);
                    lv_excludeExpression_4_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIncludedFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_4_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludedFeature"


    // $ANTLR start "entryRuleProductFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5385:1: entryRuleProductFeature returns [EObject current=null] : iv_ruleProductFeature= ruleProductFeature EOF ;
    public final EObject entryRuleProductFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductFeature = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5386:2: (iv_ruleProductFeature= ruleProductFeature EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5387:2: iv_ruleProductFeature= ruleProductFeature EOF
            {
             newCompositeNode(grammarAccess.getProductFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductFeature_in_entryRuleProductFeature11848);
            iv_ruleProductFeature=ruleProductFeature();

            state._fsp--;

             current =iv_ruleProductFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductFeature11858); 

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
    // $ANTLR end "entryRuleProductFeature"


    // $ANTLR start "ruleProductFeature"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5394:1: ruleProductFeature returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleProductFeature() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        EObject lv_excludeExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5397:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5398:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5398:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5398:2: () ( (lv_id_1_0= RULE_STRING ) ) ( (lv_version_2_0= RULE_STRING ) )? (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5398:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5399:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductFeatureAccess().getProductFeatureAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5404:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5405:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5405:1: (lv_id_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5406:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFeature11909); 

            			newLeafNode(lv_id_1_0, grammarAccess.getProductFeatureAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5422:2: ( (lv_version_2_0= RULE_STRING ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_STRING) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5423:1: (lv_version_2_0= RULE_STRING )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5423:1: (lv_version_2_0= RULE_STRING )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5424:3: lv_version_2_0= RULE_STRING
                    {
                    lv_version_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductFeature11931); 

                    			newLeafNode(lv_version_2_0, grammarAccess.getProductFeatureAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5440:3: (otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==24) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5440:5: otherlv_3= 'excluded-if' ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProductFeature11950); 

                        	newLeafNode(otherlv_3, grammarAccess.getProductFeatureAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5444:1: ( (lv_excludeExpression_4_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5445:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5445:1: (lv_excludeExpression_4_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5446:3: lv_excludeExpression_4_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductFeatureAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleProductFeature11971);
                    lv_excludeExpression_4_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_4_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductFeature"


    // $ANTLR start "entryRuleProductStartConfig"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5470:1: entryRuleProductStartConfig returns [EObject current=null] : iv_ruleProductStartConfig= ruleProductStartConfig EOF ;
    public final EObject entryRuleProductStartConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStartConfig = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5471:2: (iv_ruleProductStartConfig= ruleProductStartConfig EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5472:2: iv_ruleProductStartConfig= ruleProductStartConfig EOF
            {
             newCompositeNode(grammarAccess.getProductStartConfigRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig12009);
            iv_ruleProductStartConfig=ruleProductStartConfig();

            state._fsp--;

             current =iv_ruleProductStartConfig; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProductStartConfig12019); 

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
    // $ANTLR end "entryRuleProductStartConfig"


    // $ANTLR start "ruleProductStartConfig"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5479:1: ruleProductStartConfig returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )? ) ;
    public final EObject ruleProductStartConfig() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token lv_autoStart_2_0=null;
        Token otherlv_3=null;
        Token lv_startLevel_4_1=null;
        Token lv_startLevel_4_2=null;
        Token otherlv_5=null;
        EObject lv_excludeExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5482:28: ( ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5483:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5483:1: ( () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5483:2: () ( (lv_id_1_0= RULE_STRING ) ) ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )? (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )?
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5483:2: ()
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5484:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProductStartConfigAccess().getProductStartConfigAction_0(),
                        current);
                

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5489:2: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5490:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5490:1: (lv_id_1_0= RULE_STRING )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5491:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProductStartConfig12070); 

            			newLeafNode(lv_id_1_0, grammarAccess.getProductStartConfigAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductStartConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5507:2: ( ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )? )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==95) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5507:3: ( (lv_autoStart_2_0= 'autostarted' ) ) (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )?
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5507:3: ( (lv_autoStart_2_0= 'autostarted' ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5508:1: (lv_autoStart_2_0= 'autostarted' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5508:1: (lv_autoStart_2_0= 'autostarted' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5509:3: lv_autoStart_2_0= 'autostarted'
                    {
                    lv_autoStart_2_0=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleProductStartConfig12094); 

                            newLeafNode(lv_autoStart_2_0, grammarAccess.getProductStartConfigAccess().getAutoStartAutostartedKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                    	        }
                           		setWithLastConsumed(current, "autoStart", true, "autostarted");
                    	    

                    }


                    }

                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5522:2: (otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==96) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5522:4: otherlv_3= 'at' ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) )
                            {
                            otherlv_3=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleProductStartConfig12120); 

                                	newLeafNode(otherlv_3, grammarAccess.getProductStartConfigAccess().getAtKeyword_2_1_0());
                                
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5526:1: ( ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) ) )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5527:1: ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5527:1: ( (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT ) )
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5528:1: (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT )
                            {
                            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5528:1: (lv_startLevel_4_1= RULE_SIGNED_INT | lv_startLevel_4_2= RULE_INT )
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==RULE_SIGNED_INT) ) {
                                alt100=1;
                            }
                            else if ( (LA100_0==RULE_INT) ) {
                                alt100=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 100, 0, input);

                                throw nvae;
                            }
                            switch (alt100) {
                                case 1 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5529:3: lv_startLevel_4_1= RULE_SIGNED_INT
                                    {
                                    lv_startLevel_4_1=(Token)match(input,RULE_SIGNED_INT,FollowSets000.FOLLOW_RULE_SIGNED_INT_in_ruleProductStartConfig12139); 

                                    			newLeafNode(lv_startLevel_4_1, grammarAccess.getProductStartConfigAccess().getStartLevelSIGNED_INTTerminalRuleCall_2_1_1_0_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"startLevel",
                                            		lv_startLevel_4_1, 
                                            		"SIGNED_INT");
                                    	    

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5544:8: lv_startLevel_4_2= RULE_INT
                                    {
                                    lv_startLevel_4_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleProductStartConfig12159); 

                                    			newLeafNode(lv_startLevel_4_2, grammarAccess.getProductStartConfigAccess().getStartLevelINTTerminalRuleCall_2_1_1_0_1()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getProductStartConfigRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"startLevel",
                                            		lv_startLevel_4_2, 
                                            		"INT");
                                    	    

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5562:6: (otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==24) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5562:8: otherlv_5= 'excluded-if' ( (lv_excludeExpression_6_0= ruleBooleanExpression ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleProductStartConfig12184); 

                        	newLeafNode(otherlv_5, grammarAccess.getProductStartConfigAccess().getExcludedIfKeyword_3_0());
                        
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5566:1: ( (lv_excludeExpression_6_0= ruleBooleanExpression ) )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5567:1: (lv_excludeExpression_6_0= ruleBooleanExpression )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5567:1: (lv_excludeExpression_6_0= ruleBooleanExpression )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5568:3: lv_excludeExpression_6_0= ruleBooleanExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductStartConfigAccess().getExcludeExpressionBooleanExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleProductStartConfig12205);
                    lv_excludeExpression_6_0=ruleBooleanExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductStartConfigRule());
                    	        }
                           		set(
                           			current, 
                           			"excludeExpression",
                            		lv_excludeExpression_6_0, 
                            		"BooleanExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductStartConfig"


    // $ANTLR start "entryRuleVersion"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5592:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5593:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5594:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVersion_in_entryRuleVersion12244);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVersion12255); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5601:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5604:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5605:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5605:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )? )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5605:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '.' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion12295); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleVersion12313); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion12328); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleVersion12346); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleVersion12361); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5638:1: (kw= '.' this_ID_6= RULE_ID )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==97) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5639:2: kw= '.' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleVersion12380); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVersion12395); 

                    		current.merge(this_ID_6);
                        
                     
                        newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "ruleType"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5659:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5661:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5662:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5662:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt105=1;
                }
                break;
            case 99:
                {
                alt105=2;
                }
                break;
            case 100:
                {
                alt105=3;
                }
                break;
            case 101:
                {
                alt105=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5662:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5662:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5662:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleType12456); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5668:6: (enumLiteral_1= 'DOUBLE' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5668:6: (enumLiteral_1= 'DOUBLE' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5668:8: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleType12473); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5674:6: (enumLiteral_2= 'INT' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5674:6: (enumLiteral_2= 'INT' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5674:8: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleType12490); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5680:6: (enumLiteral_3= 'STRING' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5680:6: (enumLiteral_3= 'STRING' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5680:8: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleType12507); 

                            current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleCardinality"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5690:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE_OPTIONAL' ) | (enumLiteral_1= 'SINGLE_REQUIRED' ) | (enumLiteral_2= 'MULTI_OPTIONAL' ) | (enumLiteral_3= 'MULTI_REQUIRED' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5692:28: ( ( (enumLiteral_0= 'SINGLE_OPTIONAL' ) | (enumLiteral_1= 'SINGLE_REQUIRED' ) | (enumLiteral_2= 'MULTI_OPTIONAL' ) | (enumLiteral_3= 'MULTI_REQUIRED' ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5693:1: ( (enumLiteral_0= 'SINGLE_OPTIONAL' ) | (enumLiteral_1= 'SINGLE_REQUIRED' ) | (enumLiteral_2= 'MULTI_OPTIONAL' ) | (enumLiteral_3= 'MULTI_REQUIRED' ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5693:1: ( (enumLiteral_0= 'SINGLE_OPTIONAL' ) | (enumLiteral_1= 'SINGLE_REQUIRED' ) | (enumLiteral_2= 'MULTI_OPTIONAL' ) | (enumLiteral_3= 'MULTI_REQUIRED' ) )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt106=1;
                }
                break;
            case 103:
                {
                alt106=2;
                }
                break;
            case 104:
                {
                alt106=3;
                }
                break;
            case 105:
                {
                alt106=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5693:2: (enumLiteral_0= 'SINGLE_OPTIONAL' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5693:2: (enumLiteral_0= 'SINGLE_OPTIONAL' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5693:4: enumLiteral_0= 'SINGLE_OPTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleCardinality12552); 

                            current = grammarAccess.getCardinalityAccess().getSINGLE_OPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getSINGLE_OPTIONALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5699:6: (enumLiteral_1= 'SINGLE_REQUIRED' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5699:6: (enumLiteral_1= 'SINGLE_REQUIRED' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5699:8: enumLiteral_1= 'SINGLE_REQUIRED'
                    {
                    enumLiteral_1=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleCardinality12569); 

                            current = grammarAccess.getCardinalityAccess().getSINGLE_REQUIREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getSINGLE_REQUIREDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5705:6: (enumLiteral_2= 'MULTI_OPTIONAL' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5705:6: (enumLiteral_2= 'MULTI_OPTIONAL' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5705:8: enumLiteral_2= 'MULTI_OPTIONAL'
                    {
                    enumLiteral_2=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleCardinality12586); 

                            current = grammarAccess.getCardinalityAccess().getMULTI_OPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getMULTI_OPTIONALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5711:6: (enumLiteral_3= 'MULTI_REQUIRED' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5711:6: (enumLiteral_3= 'MULTI_REQUIRED' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5711:8: enumLiteral_3= 'MULTI_REQUIRED'
                    {
                    enumLiteral_3=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleCardinality12603); 

                            current = grammarAccess.getCardinalityAccess().getMULTI_REQUIREDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCardinalityAccess().getMULTI_REQUIREDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "rulePolicy"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5721:1: rulePolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'DYNAMIC' ) | (enumLiteral_1= 'STATIC' ) ) ;
    public final Enumerator rulePolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5723:28: ( ( (enumLiteral_0= 'DYNAMIC' ) | (enumLiteral_1= 'STATIC' ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5724:1: ( (enumLiteral_0= 'DYNAMIC' ) | (enumLiteral_1= 'STATIC' ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5724:1: ( (enumLiteral_0= 'DYNAMIC' ) | (enumLiteral_1= 'STATIC' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==106) ) {
                alt107=1;
            }
            else if ( (LA107_0==107) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5724:2: (enumLiteral_0= 'DYNAMIC' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5724:2: (enumLiteral_0= 'DYNAMIC' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5724:4: enumLiteral_0= 'DYNAMIC'
                    {
                    enumLiteral_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_rulePolicy12648); 

                            current = grammarAccess.getPolicyAccess().getDYNAMICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPolicyAccess().getDYNAMICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5730:6: (enumLiteral_1= 'STATIC' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5730:6: (enumLiteral_1= 'STATIC' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5730:8: enumLiteral_1= 'STATIC'
                    {
                    enumLiteral_1=(Token)match(input,107,FollowSets000.FOLLOW_107_in_rulePolicy12665); 

                            current = grammarAccess.getPolicyAccess().getSTATICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPolicyAccess().getSTATICEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "ruleMatchRule"
    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5740:1: ruleMatchRule returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) ;
    public final Enumerator ruleMatchRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5742:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) ) )
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5743:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            {
            // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5743:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'equivalent' ) | (enumLiteral_2= 'compatible' ) | (enumLiteral_3= 'perfect' ) | (enumLiteral_4= 'greaterOrEqual' ) )
            int alt108=5;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt108=1;
                }
                break;
            case 109:
                {
                alt108=2;
                }
                break;
            case 110:
                {
                alt108=3;
                }
                break;
            case 111:
                {
                alt108=4;
                }
                break;
            case 112:
                {
                alt108=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5743:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5743:2: (enumLiteral_0= 'none' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5743:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleMatchRule12710); 

                            current = grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMatchRuleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5749:6: (enumLiteral_1= 'equivalent' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5749:6: (enumLiteral_1= 'equivalent' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5749:8: enumLiteral_1= 'equivalent'
                    {
                    enumLiteral_1=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleMatchRule12727); 

                            current = grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMatchRuleAccess().getEquivalentEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5755:6: (enumLiteral_2= 'compatible' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5755:6: (enumLiteral_2= 'compatible' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5755:8: enumLiteral_2= 'compatible'
                    {
                    enumLiteral_2=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleMatchRule12744); 

                            current = grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMatchRuleAccess().getCompatibleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5761:6: (enumLiteral_3= 'perfect' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5761:6: (enumLiteral_3= 'perfect' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5761:8: enumLiteral_3= 'perfect'
                    {
                    enumLiteral_3=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleMatchRule12761); 

                            current = grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMatchRuleAccess().getPerfectEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5767:6: (enumLiteral_4= 'greaterOrEqual' )
                    {
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5767:6: (enumLiteral_4= 'greaterOrEqual' )
                    // ../org.eclipse.fx.ide.rrobot.dsl/src-gen/org/eclipse/fx/ide/rrobot/dsl/parser/antlr/internal/InternalRTask.g:5767:8: enumLiteral_4= 'greaterOrEqual'
                    {
                    enumLiteral_4=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleMatchRule12778); 

                            current = grammarAccess.getMatchRuleAccess().getGreaterOrEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMatchRuleAccess().getGreaterOrEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatchRule"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRobotTask_in_entryRuleRobotTask75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRobotTask85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRobotTask131 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask143 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_16_in_ruleRobotTask156 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask168 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask201 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRobotTask235 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask249 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleRobotTask264 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRobotTask276 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRobotTask288 = new BitSet(new long[]{0x0010100000400000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask309 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleRobotTask322 = new BitSet(new long[]{0x0010100000400000L});
        public static final BitSet FOLLOW_ruleGenericProject_in_ruleRobotTask343 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask357 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRobotTask371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_DOC_in_ruleVariable459 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleVariable485 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable502 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleVariable520 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericProject_in_entryRuleGenericProject580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericProject590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_ruleGenericProject637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_ruleGenericProject664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_ruleGenericProject691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_entryRuleResource726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResource736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_ruleResource783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_ruleResource810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_ruleResource837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_ruleResource864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_ruleResource891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleResource918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_ruleResource945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleResource972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentDefinitionFile_in_ruleResource999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject1034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleProject1090 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProject1111 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject1123 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_23_in_ruleProject1136 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProject1148 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProject1160 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1181 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProject1194 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleProject1215 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProject1229 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProject1243 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleProject1256 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleProject1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder1438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFolder1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFolder1494 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFolder1515 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleFolder1528 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleFolder1540 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFolder1552 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFolder1564 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1585 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFolder1598 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFolder1619 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFolder1633 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFolder1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_entryRuleTemplatedFile1683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplatedFile1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTemplatedFile1739 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1760 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTemplatedFile1772 = new BitSet(new long[]{0x0000000010080000L});
        public static final BitSet FOLLOW_28_in_ruleTemplatedFile1785 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTemplatedFile1797 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTemplatedFile1818 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTemplatedFile1832 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleTemplatedFile1845 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTemplatedFile1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataFile_in_entryRuleDataFile1904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataFile1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDataFile1960 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataFile1981 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDataFile1993 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleDataFile2006 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDataFile2018 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEByteArray_in_ruleDataFile2039 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDataFile2053 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleDataFile2066 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDataFile2087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURLFile_in_entryRuleURLFile2125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURLFile2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleURLFile2181 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2202 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleURLFile2223 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleURLFile2236 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleURLFile2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_entryRuleDynamicFile2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDynamicFile2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDynamicFile2351 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDynamicFile2372 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleDynamicFile2384 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2401 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleDynamicFile2418 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDynamicFile2435 = new BitSet(new long[]{0x0000000001008002L});
        public static final BitSet FOLLOW_15_in_ruleDynamicFile2453 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2474 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDynamicFile2487 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDynamicFile2508 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDynamicFile2522 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleDynamicFile2537 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDynamicFile2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentDefinitionFile_in_entryRuleComponentDefinitionFile2596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentDefinitionFile2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleComponentDefinitionFile2652 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentDefinitionFile2673 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponentDefinitionFile2685 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleComponentDefinitionFile2743 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentDefinitionFile2755 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentDefinitionFile2776 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_37_in_ruleComponentDefinitionFile2844 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentDefinitionFile2856 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentDefinitionFile2877 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_38_in_ruleComponentDefinitionFile2936 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentDefinitionFile2948 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponentDefinitionFile2960 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentDefinitionFile2981 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleComponentDefinitionFile2994 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentDefinitionFile3015 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleComponentDefinitionFile3029 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleComponentDefinitionFile3041 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentDefinitionFile3053 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponentDefinitionFile3065 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleComponentReference_in_ruleComponentDefinitionFile3086 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleComponentDefinitionFile3099 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleComponentReference_in_ruleComponentDefinitionFile3120 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleComponentDefinitionFile3134 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentDefinitionFile3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentReference_in_entryRuleComponentReference3182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentReference3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentReference3243 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponentReference3260 = new BitSet(new long[]{0x00000F2000000000L});
        public static final BitSet FOLLOW_40_in_ruleComponentReference3318 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentReference3330 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentReference3347 = new BitSet(new long[]{0x00000F2000080000L});
        public static final BitSet FOLLOW_41_in_ruleComponentReference3420 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentReference3432 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentReference3449 = new BitSet(new long[]{0x00000F2000080000L});
        public static final BitSet FOLLOW_37_in_ruleComponentReference3522 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentReference3534 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentReference3555 = new BitSet(new long[]{0x00000F2000080000L});
        public static final BitSet FOLLOW_42_in_ruleComponentReference3623 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentReference3635 = new BitSet(new long[]{0x0000000000000000L,0x000003C000000000L});
        public static final BitSet FOLLOW_ruleCardinality_in_ruleComponentReference3656 = new BitSet(new long[]{0x00000F2000080000L});
        public static final BitSet FOLLOW_43_in_ruleComponentReference3724 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleComponentReference3736 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
        public static final BitSet FOLLOW_rulePolicy_in_ruleComponentReference3757 = new BitSet(new long[]{0x00000F2000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentReference3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_ruleBooleanExpression3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_ruleBooleanExpression3936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferencingBooleanExpression_in_entryRuleReferencingBooleanExpression3971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferencingBooleanExpression3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression4023 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleReferencingBooleanExpression4040 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferencingBooleanExpression4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInlineBooleanExpression_in_entryRuleInlineBooleanExpression4098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInlineBooleanExpression4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInlineBooleanExpression4150 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INLINE_SCRIPT_in_ruleInlineBooleanExpression4172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEByteArray_in_entryRuleEByteArray4214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEByteArray4225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEByteArray4271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleProject_in_entryRuleBundleProject4315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleProject4325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBundleProject4371 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleProject4392 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject4404 = new BitSet(new long[]{0x0000E00000000000L});
        public static final BitSet FOLLOW_45_in_ruleBundleProject4462 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4474 = new BitSet(new long[]{0x01C0000000000000L});
        public static final BitSet FOLLOW_ruleManifestFile_in_ruleBundleProject4495 = new BitSet(new long[]{0x0001E00000800000L});
        public static final BitSet FOLLOW_46_in_ruleBundleProject4563 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_ruleBundleProject4596 = new BitSet(new long[]{0x0001E00000800000L});
        public static final BitSet FOLLOW_47_in_ruleBundleProject4664 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4676 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_ruleBundleProject4697 = new BitSet(new long[]{0x0001E00000800000L});
        public static final BitSet FOLLOW_23_in_ruleBundleProject4757 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4769 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject4781 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject4802 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject4815 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleBundleProject4836 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject4850 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleBundleProject4864 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4876 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject4888 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleSourceFragment_in_ruleBundleProject4909 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject4922 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleSourceFragment_in_ruleBundleProject4943 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject4957 = new BitSet(new long[]{0x0002000000080000L});
        public static final BitSet FOLLOW_49_in_ruleBundleProject4970 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBundleProject4982 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBundleProject4994 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCompilationUnit_in_ruleBundleProject5015 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBundleProject5028 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleCompilationUnit_in_ruleBundleProject5049 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject5063 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBundleProject5077 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleBundleProject5090 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleBundleProject5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceFragment_in_entryRuleSourceFragment5149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSourceFragment5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSourceFragment5196 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSourceFragment5217 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSourceFragment5237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompilationUnit_in_entryRuleCompilationUnit5273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompilationUnit5283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCompilationUnit5325 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleCompilationUnit5342 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCompilationUnit5362 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompilationUnit5374 = new BitSet(new long[]{0x00000001A8000000L});
        public static final BitSet FOLLOW_ruleTemplatedFile_in_ruleCompilationUnit5397 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleDataFile_in_ruleCompilationUnit5416 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleURLFile_in_ruleCompilationUnit5435 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleDynamicFile_in_ruleCompilationUnit5454 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCompilationUnit5469 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCompilationUnit5482 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleCompilationUnit5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureProject_in_entryRuleFeatureProject5541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureProject5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleFeatureProject5597 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFeatureProject5618 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureProject5630 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleFeatureProject5642 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureProject5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_ruleFeatureProject5675 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_23_in_ruleFeatureProject5688 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureProject5700 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureProject5712 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject5733 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureProject5746 = new BitSet(new long[]{0x81C00009AA000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleResource_in_ruleFeatureProject5767 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureProject5781 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureProject5795 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleFeatureProject5808 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleFeatureProject5829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManifestFile_in_entryRuleManifestFile5867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManifestFile5877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleManifestFile5929 = new BitSet(new long[]{0x0180000000000000L});
        public static final BitSet FOLLOW_55_in_ruleManifestFile5961 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleManifestFile5987 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6004 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6026 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6048 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile6065 = new BitSet(new long[]{0x0E00000000000000L});
        public static final BitSet FOLLOW_57_in_ruleManifestFile6123 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6135 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6152 = new BitSet(new long[]{0x7E00000000080000L});
        public static final BitSet FOLLOW_58_in_ruleManifestFile6225 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6237 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6254 = new BitSet(new long[]{0x7E00000000080000L});
        public static final BitSet FOLLOW_59_in_ruleManifestFile6327 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6339 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleManifestFile6356 = new BitSet(new long[]{0x7E00000000080000L});
        public static final BitSet FOLLOW_60_in_ruleManifestFile6421 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6433 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile6445 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile6466 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile6479 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_ruleManifestFile6500 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile6514 = new BitSet(new long[]{0x6000000000080000L});
        public static final BitSet FOLLOW_61_in_ruleManifestFile6529 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6541 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile6553 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile6574 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile6587 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_ruleManifestFile6608 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile6622 = new BitSet(new long[]{0x4000000000080000L});
        public static final BitSet FOLLOW_62_in_ruleManifestFile6637 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleManifestFile6649 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleManifestFile6661 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile6682 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleManifestFile6695 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_ruleManifestFile6716 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile6730 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleManifestFile6744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePluginXMLFile_in_entryRulePluginXMLFile6780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePluginXMLFile6790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rulePluginXMLFile6836 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePluginXMLFile6848 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_rulePluginXMLFile6861 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePluginXMLFile6873 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePluginXMLFile6885 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile6906 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_rulePluginXMLFile6919 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleExtension_in_rulePluginXMLFile6940 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_rulePluginXMLFile6954 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePluginXMLFile6968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBuildProperties_in_entryRuleBuildProperties7004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBuildProperties7014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleBuildProperties7060 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBuildProperties7072 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleBuildProperties7085 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBuildProperties7097 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBuildProperties7109 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties7129 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleBuildProperties7142 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBuildProperties7162 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleBuildProperties7176 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBuildProperties7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFileFeaturebase_in_entryRuleProductFileFeaturebase7226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFileFeaturebase7236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleProductFileFeaturebase7288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleProductFileFeaturebase7314 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7331 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase7348 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003E0L});
        public static final BitSet FOLLOW_69_in_ruleProductFileFeaturebase7406 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7418 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7435 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_70_in_ruleProductFileFeaturebase7508 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7520 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7537 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_71_in_ruleProductFileFeaturebase7610 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7622 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7639 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_72_in_ruleProductFileFeaturebase7712 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7724 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7741 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_73_in_ruleProductFileFeaturebase7814 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7826 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFileFeaturebase7843 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000FE0L});
        public static final BitSet FOLLOW_74_in_ruleProductFileFeaturebase7908 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase7920 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase7932 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase7953 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase7966 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_ruleProductFileFeaturebase7987 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase8001 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruleProductFileFeaturebase8016 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProductFileFeaturebase8028 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProductFileFeaturebase8040 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase8061 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProductFileFeaturebase8074 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleProductFeature_in_ruleProductFileFeaturebase8095 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase8109 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProductFileFeaturebase8123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureFile_in_entryRuleFeatureFile8159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureFile8169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleFeatureFile8215 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile8232 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile8249 = new BitSet(new long[]{0x0400000000000000L,0x000000000007E200L});
        public static final BitSet FOLLOW_73_in_ruleFeatureFile8307 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8319 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile8336 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_77_in_ruleFeatureFile8409 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8421 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile8438 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_58_in_ruleFeatureFile8511 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8523 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile8540 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_78_in_ruleFeatureFile8613 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8625 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile8646 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_79_in_ruleFeatureFile8714 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8726 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile8747 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_80_in_ruleFeatureFile8815 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8827 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLinkedString_in_ruleFeatureFile8848 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_81_in_ruleFeatureFile8961 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile8973 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureFile8990 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_82_in_ruleFeatureFile9063 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile9075 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleFeatureFile9096 = new BitSet(new long[]{0x0400000000080000L,0x00000000003FE200L});
        public static final BitSet FOLLOW_83_in_ruleFeatureFile9202 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile9214 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile9226 = new BitSet(new long[]{0x0004000000000020L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile9247 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile9260 = new BitSet(new long[]{0x0004000000000020L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_ruleFeatureFile9281 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile9295 = new BitSet(new long[]{0x0000000000080000L,0x0000000000300000L});
        public static final BitSet FOLLOW_84_in_ruleFeatureFile9310 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile9322 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile9334 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile9355 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile9368 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleFeatureFile9389 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile9403 = new BitSet(new long[]{0x0000000000080000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_ruleFeatureFile9418 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFeatureFile9430 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureFile9442 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile9463 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFeatureFile9476 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_ruleFeatureFile9497 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile9511 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFeatureFile9525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportedPackage_in_entryRuleImportedPackage9561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportedPackage9571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportedPackage9622 = new BitSet(new long[]{0x0000000001040202L,0x0000000000C00000L});
        public static final BitSet FOLLOW_86_in_ruleImportedPackage9647 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_87_in_ruleImportedPackage9679 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage9701 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleImportedPackage9714 = new BitSet(new long[]{0x0000000001000202L,0x0000000003000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleImportedPackage9736 = new BitSet(new long[]{0x0000000001000002L,0x0000000003000000L});
        public static final BitSet FOLLOW_88_in_ruleImportedPackage9756 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_89_in_ruleImportedPackage9788 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleImportedPackage9805 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleImportedPackage9826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExportedPackage_in_entryRuleExportedPackage9864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExportedPackage9874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExportedPackage9925 = new BitSet(new long[]{0x0000000001000202L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleExportedPackage9951 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleExportedPackage9965 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExportedPackage9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension10024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtension10034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension10085 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtension10102 = new BitSet(new long[]{0x0000000000080000L,0x000000000C000000L});
        public static final BitSet FOLLOW_90_in_ruleExtension10115 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleExtension10127 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExtension10144 = new BitSet(new long[]{0x0000000000080000L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_ruleExtension10164 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleExtension10176 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleExtension10188 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension10209 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleExtension10222 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleExtension10243 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleExtension10257 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtension10271 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleExtension10284 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExtension10305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement10343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement10353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement10404 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement10421 = new BitSet(new long[]{0x0000000004080000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleElement10434 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleElement10446 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement10458 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement10479 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleElement10492 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleElement10513 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleElement10527 = new BitSet(new long[]{0x0000000004080000L});
        public static final BitSet FOLLOW_26_in_ruleElement10542 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleElement10554 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement10566 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement10587 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleElement10600 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement10621 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleElement10635 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleElement10649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute10685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute10695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAttribute10741 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute10758 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute10775 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute10792 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute10809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredBundle_in_entryRuleRequiredBundle10845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredBundle10855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredBundle10906 = new BitSet(new long[]{0x0000000001040202L,0x0000000000C00000L});
        public static final BitSet FOLLOW_86_in_ruleRequiredBundle10931 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_87_in_ruleRequiredBundle10963 = new BitSet(new long[]{0x0000000000040200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle10985 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRequiredBundle10998 = new BitSet(new long[]{0x0000000001000202L,0x0000000003000000L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredBundle11019 = new BitSet(new long[]{0x0000000001000002L,0x0000000003000000L});
        public static final BitSet FOLLOW_88_in_ruleRequiredBundle11039 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_89_in_ruleRequiredBundle11071 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRequiredBundle11087 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleRequiredBundle11108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLinkedString_in_entryRuleLinkedString11146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLinkedString11156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleLinkedString11202 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString11219 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLinkedString11236 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkedString11253 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLinkedString11270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePlugin_in_entryRuleFeaturePlugin11306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePlugin11316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleFeaturePlugin11368 = new BitSet(new long[]{0x0004000000000020L});
        public static final BitSet FOLLOW_50_in_ruleFeaturePlugin11400 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeaturePlugin11431 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleFeaturePlugin11449 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleFeaturePlugin11470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature11508 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeature11518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequiredFeature11569 = new BitSet(new long[]{0x0000000000000000L,0x0001F00000000000L});
        public static final BitSet FOLLOW_ruleMatchRule_in_ruleRequiredFeature11595 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleRequiredFeature11616 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRequiredFeature11629 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleRequiredFeature11650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludedFeature_in_entryRuleIncludedFeature11688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludedFeature11698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludedFeature11749 = new BitSet(new long[]{0x0000000001000202L});
        public static final BitSet FOLLOW_ruleVersion_in_ruleIncludedFeature11775 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleIncludedFeature11789 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleIncludedFeature11810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductFeature_in_entryRuleProductFeature11848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductFeature11858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFeature11909 = new BitSet(new long[]{0x0000000001000022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductFeature11931 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleProductFeature11950 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleProductFeature11971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProductStartConfig_in_entryRuleProductStartConfig12009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProductStartConfig12019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProductStartConfig12070 = new BitSet(new long[]{0x0000000001000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_95_in_ruleProductStartConfig12094 = new BitSet(new long[]{0x0000000001000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleProductStartConfig12120 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_RULE_SIGNED_INT_in_ruleProductStartConfig12139 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleProductStartConfig12159 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleProductStartConfig12184 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleProductStartConfig12205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion12244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVersion12255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion12295 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleVersion12313 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion12328 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleVersion12346 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleVersion12361 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleVersion12380 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVersion12395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleType12456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_ruleType12473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleType12490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleType12507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleCardinality12552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_ruleCardinality12569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleCardinality12586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleCardinality12603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_rulePolicy12648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_107_in_rulePolicy12665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleMatchRule12710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleMatchRule12727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleMatchRule12744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleMatchRule12761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleMatchRule12778 = new BitSet(new long[]{0x0000000000000002L});
    }


}