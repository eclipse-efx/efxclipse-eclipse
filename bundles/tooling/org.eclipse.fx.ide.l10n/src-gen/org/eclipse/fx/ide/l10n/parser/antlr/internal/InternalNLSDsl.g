/*
* generated by Xtext
*/
grammar InternalNLSDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.fx.ide.l10n.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleNLS
entryRuleNLS returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNLSRule()); }
	 iv_ruleNLS=ruleNLS 
	 { $current=$iv_ruleNLS.current; } 
	 EOF 
;

// Rule NLS
ruleNLS returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getNLSAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
	    }
		lv_package_0_0=rulePackageDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNLSRule());
	        }
       		set(
       			$current, 
       			"package",
        		lv_package_0_0, 
        		"PackageDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNLSAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNLSAccess().getBundleListNLSBundleParserRuleCall_2_0()); 
	    }
		lv_bundleList_2_0=ruleNLSBundle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNLSRule());
	        }
       		add(
       			$current, 
       			"bundleList",
        		lv_bundleList_2_0, 
        		"NLSBundle");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNLSAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRulePackageDeclaration
entryRulePackageDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageDeclarationRule()); }
	 iv_rulePackageDeclaration=rulePackageDeclaration 
	 { $current=$iv_rulePackageDeclaration.current; } 
	 EOF 
;

// Rule PackageDeclaration
rulePackageDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleNLSBundle
entryRuleNLSBundle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNLSBundleRule()); }
	 iv_ruleNLSBundle=ruleNLSBundle 
	 { $current=$iv_ruleNLSBundle.current; } 
	 EOF 
;

// Rule NLSBundle
ruleNLSBundle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='bundle' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNLSBundleAccess().getBundleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getNLSBundleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNLSBundleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='default' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNLSBundleAccess().getDefaultKeyword_2());
    }
(
(
		lv_lang_3_0=RULE_ID
		{
			newLeafNode(lv_lang_3_0, grammarAccess.getNLSBundleAccess().getLangIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNLSBundleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lang",
        		lv_lang_3_0, 
        		"ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNLSBundleAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNLSBundleAccess().getFormatterListNLSFormatterParserRuleCall_5_0()); 
	    }
		lv_formatterList_5_0=ruleNLSFormatter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNLSBundleRule());
	        }
       		add(
       			$current, 
       			"formatterList",
        		lv_formatterList_5_0, 
        		"NLSFormatter");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getNLSBundleAccess().getMessageEntryListMessageEntryParserRuleCall_6_0()); 
	    }
		lv_messageEntryList_6_0=ruleMessageEntry		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNLSBundleRule());
	        }
       		add(
       			$current, 
       			"messageEntryList",
        		lv_messageEntryList_6_0, 
        		"MessageEntry");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getNLSBundleAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleNLSFormatter
entryRuleNLSFormatter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNLSFormatterRule()); }
	 iv_ruleNLSFormatter=ruleNLSFormatter 
	 { $current=$iv_ruleNLSFormatter.current; } 
	 EOF 
;

// Rule NLSFormatter
ruleNLSFormatter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='formatter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNLSFormatterAccess().getFormatterKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getNLSFormatterAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNLSFormatterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNLSFormatterAccess().getClassRefQualifiedNameParserRuleCall_2_0()); 
	    }
		lv_classRef_2_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNLSFormatterRule());
	        }
       		set(
       			$current, 
       			"classRef",
        		lv_classRef_2_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMessageEntry
entryRuleMessageEntry returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMessageEntryRule()); }
	 iv_ruleMessageEntry=ruleMessageEntry 
	 { $current=$iv_ruleMessageEntry.current; } 
	 EOF 
;

// Rule MessageEntry
ruleMessageEntry returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMessageEntryAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageEntryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMessageEntryAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_1_0()); 
	    }
		lv_paramList_2_0=ruleMessageParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageEntryRule());
	        }
       		add(
       			$current, 
       			"paramList",
        		lv_paramList_2_0, 
        		"MessageParam");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMessageEntryAccess().getCommaKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageEntryAccess().getParamListMessageParamParserRuleCall_1_2_1_0()); 
	    }
		lv_paramList_4_0=ruleMessageParam		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageEntryRule());
	        }
       		add(
       			$current, 
       			"paramList",
        		lv_paramList_4_0, 
        		"MessageParam");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMessageEntryAccess().getRightParenthesisKeyword_1_3());
    }
)?((	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMessageEntryAccess().getLeftCurlyBracketKeyword_2_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_1_0()); 
	    }
		lv_messageList_7_0=ruleMessage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageEntryRule());
	        }
       		add(
       			$current, 
       			"messageList",
        		lv_messageList_7_0, 
        		"Message");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMessageEntryAccess().getCommaKeyword_2_0_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageEntryAccess().getMessageListMessageParserRuleCall_2_0_2_1_0()); 
	    }
		lv_messageList_9_0=ruleMessage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageEntryRule());
	        }
       		add(
       			$current, 
       			"messageList",
        		lv_messageList_9_0, 
        		"Message");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMessageEntryAccess().getRightCurlyBracketKeyword_2_0_3());
    }
)
    |(	otherlv_11='[' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMessageEntryAccess().getLeftSquareBracketKeyword_2_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageEntryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMessageEntryAccess().getEntryRefMessageEntryCrossReference_2_1_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=']' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMessageEntryAccess().getRightSquareBracketKeyword_2_1_2());
    }
)))
;





// Entry rule entryRuleMessageParam
entryRuleMessageParam returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMessageParamRule()); }
	 iv_ruleMessageParam=ruleMessageParam 
	 { $current=$iv_ruleMessageParam.current; } 
	 EOF 
;

// Rule MessageParam
ruleMessageParam returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMessageParamAccess().getPredefinedPredefinedTypesEnumRuleCall_0_0()); 
	    }
		lv_predefined_0_0=rulePredefinedTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageParamRule());
	        }
       		set(
       			$current, 
       			"predefined",
        		lv_predefined_0_0, 
        		"PredefinedTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_var_1_0=RULE_ID
		{
			newLeafNode(lv_var_1_0, grammarAccess.getMessageParamAccess().getVarIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageParamRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"var",
        		lv_var_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	 iv_ruleMessage=ruleMessage 
	 { $current=$iv_ruleMessage.current; } 
	 EOF 
;

// Rule Message
ruleMessage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMessageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMessageAccess().getMessageRichStringParserRuleCall_2_0()); 
	    }
		lv_message_2_0=ruleRichString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMessageRule());
	        }
       		set(
       			$current, 
       			"message",
        		lv_message_2_0, 
        		"RichString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleRichString
entryRuleRichString returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichStringRule()); }
	 iv_ruleRichString=ruleRichString 
	 { $current=$iv_ruleRichString.current; } 
	 EOF 
;

// Rule RichString
ruleRichString returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralParserRuleCall_0_0()); 
	    }
		lv_expressions_0_0=ruleRichStringLiteral		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_0_0, 
        		"RichStringLiteral");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralStartParserRuleCall_1_0_0()); 
	    }
		lv_expressions_1_0=ruleRichStringLiteralStart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_1_0, 
        		"RichStringLiteralStart");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_1_0()); 
	    }
		lv_expressions_2_0=ruleRichVarPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_2_0, 
        		"RichVarPart");
	        afterParserOrEnumRuleCall();
	    }

)
)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralInbetweenParserRuleCall_1_2_0_0()); 
	    }
		lv_expressions_3_0=ruleRichStringLiteralInbetween		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_3_0, 
        		"RichStringLiteralInbetween");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichVarPartParserRuleCall_1_2_1_0()); 
	    }
		lv_expressions_4_0=ruleRichVarPart		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_4_0, 
        		"RichVarPart");
	        afterParserOrEnumRuleCall();
	    }

)
)?)*(
(
		{ 
	        newCompositeNode(grammarAccess.getRichStringAccess().getExpressionsRichStringLiteralEndParserRuleCall_1_3_0()); 
	    }
		lv_expressions_5_0=ruleRichStringLiteralEnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRichStringRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_5_0, 
        		"RichStringLiteralEnd");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleRichStringLiteral
entryRuleRichStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichStringLiteralRule()); }
	 iv_ruleRichStringLiteral=ruleRichStringLiteral 
	 { $current=$iv_ruleRichStringLiteral.current; } 
	 EOF 
;

// Rule RichStringLiteral
ruleRichStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_RICH_TEXT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichStringLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"RICH_TEXT");
	    }

)
)
;





// Entry rule entryRuleRichStringLiteralStart
entryRuleRichStringLiteralStart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichStringLiteralStartRule()); }
	 iv_ruleRichStringLiteralStart=ruleRichStringLiteralStart 
	 { $current=$iv_ruleRichStringLiteralStart.current; } 
	 EOF 
;

// Rule RichStringLiteralStart
ruleRichStringLiteralStart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_RICH_TEXT_START
		{
			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichStringLiteralStartRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"RICH_TEXT_START");
	    }

)
)
;





// Entry rule entryRuleRichStringLiteralEnd
entryRuleRichStringLiteralEnd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichStringLiteralEndRule()); }
	 iv_ruleRichStringLiteralEnd=ruleRichStringLiteralEnd 
	 { $current=$iv_ruleRichStringLiteralEnd.current; } 
	 EOF 
;

// Rule RichStringLiteralEnd
ruleRichStringLiteralEnd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_RICH_TEXT_END
		{
			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralEndAccess().getValueRICH_TEXT_ENDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichStringLiteralEndRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"RICH_TEXT_END");
	    }

)
)
;





// Entry rule entryRuleRichStringLiteralInbetween
entryRuleRichStringLiteralInbetween returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichStringLiteralInbetweenRule()); }
	 iv_ruleRichStringLiteralInbetween=ruleRichStringLiteralInbetween 
	 { $current=$iv_ruleRichStringLiteralInbetween.current; } 
	 EOF 
;

// Rule RichStringLiteralInbetween
ruleRichStringLiteralInbetween returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_RICH_TEXT_INBETWEEN
		{
			newLeafNode(lv_value_0_0, grammarAccess.getRichStringLiteralInbetweenAccess().getValueRICH_TEXT_INBETWEENTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichStringLiteralInbetweenRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"RICH_TEXT_INBETWEEN");
	    }

)
)
;





// Entry rule entryRuleRichVarPart
entryRuleRichVarPart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRichVarPartRule()); }
	 iv_ruleRichVarPart=ruleRichVarPart 
	 { $current=$iv_ruleRichVarPart.current; } 
	 EOF 
;

// Rule RichVarPart
ruleRichVarPart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_ID
		{
			newLeafNode(lv_key_0_0, grammarAccess.getRichVarPartAccess().getKeyIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichVarPartRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_0_0, 
        		"ID");
	    }

)
)((
(
		lv_format_1_0=RULE_STRING
		{
			newLeafNode(lv_format_1_0, grammarAccess.getRichVarPartAccess().getFormatSTRINGTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichVarPartRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"format",
        		lv_format_1_0, 
        		"STRING");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRichVarPartRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRichVarPartAccess().getFormatterClassNLSFormatterCrossReference_1_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)?)?)
;





// Entry rule entryRuleValidID
entryRuleValidID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValidIDRule()); } 
	 iv_ruleValidID=ruleValidID 
	 { $current=$iv_ruleValidID.current.getText(); }  
	 EOF 
;

// Rule ValidID
ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
    }
    this_ValidID_0=ruleValidID    {
		$current.merge(this_ValidID_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(((
	'.' 
)=>
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
)
    { 
        newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
    }
    this_ValidID_2=ruleValidID    {
		$current.merge(this_ValidID_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Rule PredefinedTypes
rulePredefinedTypes returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='ANY' 
	{
        $current = grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPredefinedTypesAccess().getANYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='NUMBER' 
	{
        $current = grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPredefinedTypesAccess().getNUMBEREnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='DATE' 
	{
        $current = grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPredefinedTypesAccess().getDATEEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='TEMPORAL' 
	{
        $current = grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getPredefinedTypesAccess().getTEMPORALEnumLiteralDeclaration_3()); 
    }
));



RULE_RICH_TEXT : '\'\'\'' RULE_IN_RICH_STRING* ('\'\'\''|('\'' '\''?)? EOF);

RULE_RICH_TEXT_START : '\'\'\'' RULE_IN_RICH_STRING* ('\'' '\''?)? '\u00AB';

RULE_RICH_TEXT_END : '\u00BB' RULE_IN_RICH_STRING* ('\'\'\''|('\'' '\''?)? EOF);

RULE_RICH_TEXT_INBETWEEN : '\u00BB' RULE_IN_RICH_STRING* ('\'' '\''?)? '\u00AB';

fragment RULE_IN_RICH_STRING : ('\'\'' ~(('\u00AB'|'\''))|'\'' ~(('\u00AB'|'\''))|~(('\u00AB'|'\'')));

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


