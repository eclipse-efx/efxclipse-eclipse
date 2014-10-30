package org.eclipse.fx.ide.l10n.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class NLSHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String RICH_TEXT_ID = "nls.richText";
	public static final String RICH_TEXT_VAR_ID = "nls.richTextVar";

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(RICH_TEXT_ID, "Template Text", stringTextStyle());
		acceptor.acceptDefaultHighlighting(RICH_TEXT_VAR_ID, "Template Text", richTextVarStyle());
		super.configure(acceptor);
	}

	def richTextVarStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.color = new RGB(82, 142, 105);
		textStyle.style = SWT.BOLD;
		return textStyle;
	}

}