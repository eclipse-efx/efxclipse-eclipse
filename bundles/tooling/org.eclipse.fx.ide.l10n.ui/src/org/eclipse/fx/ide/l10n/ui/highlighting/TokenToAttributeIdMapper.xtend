package org.eclipse.fx.ide.l10n.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class TokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		if(
			"RULE_RICH_TEXT".equals(tokenName) ||
			"RULE_RICH_TEXT_START".equals(tokenName) ||
			"RULE_RICH_TEXT_END".equals(tokenName) ||
			"RULE_RICH_TEXT_INBETWEEN".equals(tokenName) ) {
			return NLSHighlightingConfiguration.RICH_TEXT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}