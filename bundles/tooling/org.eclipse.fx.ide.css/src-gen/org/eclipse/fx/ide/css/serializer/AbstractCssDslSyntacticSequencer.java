package org.eclipse.fx.ide.css.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractCssDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CssDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PseudoClass_COLONTerminalRuleCall_1_q;
	protected AbstractElementAlias match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0;
	protected AbstractElementAlias match_css_declaration_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_css_declaration_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_importExpression_IMPORTKeyword_0_1_or_ImportKeyword_0_0;
	protected AbstractElementAlias match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0;
	protected AbstractElementAlias match_page_PAGEKeyword_1_1_or_PageKeyword_1_0;
	protected AbstractElementAlias match_page_SemicolonKeyword_5_0_a;
	protected AbstractElementAlias match_page_SemicolonKeyword_5_0_p;
	protected AbstractElementAlias match_ruleset_SemicolonKeyword_4_2_q;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_1_0_a;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_0_1_a;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_0_p;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_1_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CssDslGrammarAccess) access;
		match_PseudoClass_COLONTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1());
		match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()));
		match_css_declaration_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_0());
		match_css_declaration_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getCss_declarationAccess().getWSTerminalRuleCall_2());
		match_importExpression_IMPORTKeyword_0_1_or_ImportKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0()));
		match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getMediaAccess().getMediaKeyword_0_0()));
		match_page_PAGEKeyword_1_1_or_PageKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPageAccess().getPAGEKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getPageKeyword_1_0()));
		match_page_SemicolonKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
		match_page_SemicolonKeyword_5_0_p = new TokenAlias(true, false, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
		match_ruleset_SemicolonKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
		match_ruleset_WSTerminalRuleCall_1_0_a = new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0());
		match_ruleset_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2());
		match_selector_WSTerminalRuleCall_1_0_1_a = new TokenAlias(true, true, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1());
		match_selector_WSTerminalRuleCall_1_1_0_p = new TokenAlias(true, false, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
		match_selector_WSTerminalRuleCall_1_1_1_1_a = new TokenAlias(true, true, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHASHMARKRule())
			return getHASHMARKToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPORTANT_SYMRule())
			return getIMPORTANT_SYMToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNotFunctionCallRule())
			return getNotFunctionCallToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COLON: ':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal HASHMARK: '#';
	 */
	protected String getHASHMARKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	/**
	 * terminal IMPORTANT_SYM:
	 * 	'!important'
	 * ;
	 */
	protected String getIMPORTANT_SYMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!important";
	}
	
	/**
	 * NotFunctionCall hidden():
	 * 	COLON 'not('
	 * ;
	 */
	protected String getNotFunctionCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":not(";
	}
	
	/**
	 * terminal WS			: (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PseudoClass_COLONTerminalRuleCall_1_q.equals(syntax))
				emit_PseudoClass_COLONTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0.equals(syntax))
				emit_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_css_declaration_WSTerminalRuleCall_0_a.equals(syntax))
				emit_css_declaration_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_css_declaration_WSTerminalRuleCall_2_a.equals(syntax))
				emit_css_declaration_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_importExpression_IMPORTKeyword_0_1_or_ImportKeyword_0_0.equals(syntax))
				emit_importExpression_IMPORTKeyword_0_1_or_ImportKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0.equals(syntax))
				emit_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_PAGEKeyword_1_1_or_PageKeyword_1_0.equals(syntax))
				emit_page_PAGEKeyword_1_1_or_PageKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_SemicolonKeyword_5_0_a.equals(syntax))
				emit_page_SemicolonKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_SemicolonKeyword_5_0_p.equals(syntax))
				emit_page_SemicolonKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ruleset_SemicolonKeyword_4_2_q.equals(syntax))
				emit_ruleset_SemicolonKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ruleset_WSTerminalRuleCall_1_0_a.equals(syntax))
				emit_ruleset_WSTerminalRuleCall_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ruleset_WSTerminalRuleCall_2_a.equals(syntax))
				emit_ruleset_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_selector_WSTerminalRuleCall_1_0_1_a.equals(syntax))
				emit_selector_WSTerminalRuleCall_1_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_selector_WSTerminalRuleCall_1_1_0_p.equals(syntax))
				emit_selector_WSTerminalRuleCall_1_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_selector_WSTerminalRuleCall_1_1_1_1_a.equals(syntax))
				emit_selector_WSTerminalRuleCall_1_1_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     COLON?
	 */
	protected void emit_PseudoClass_COLONTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@CHARSET' | '@charset'
	 */
	protected void emit_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_css_declaration_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_css_declaration_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@IMPORT' | '@import'
	 */
	protected void emit_importExpression_IMPORTKeyword_0_1_or_ImportKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@media' | '@MEDIA'
	 */
	protected void emit_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@PAGE' | '@page'
	 */
	protected void emit_page_PAGEKeyword_1_1_or_PageKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_page_SemicolonKeyword_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'+
	 */
	protected void emit_page_SemicolonKeyword_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ruleset_SemicolonKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_ruleset_WSTerminalRuleCall_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_ruleset_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_selector_WSTerminalRuleCall_1_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_selector_WSTerminalRuleCall_1_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_selector_WSTerminalRuleCall_1_1_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
