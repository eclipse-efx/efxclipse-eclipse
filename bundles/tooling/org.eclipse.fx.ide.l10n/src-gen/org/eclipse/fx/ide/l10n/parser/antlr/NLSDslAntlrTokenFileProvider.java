/*
* generated by Xtext
*/
package org.eclipse.fx.ide.l10n.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class NLSDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/fx/ide/l10n/parser/antlr/internal/InternalNLSDsl.tokens");
	}
}