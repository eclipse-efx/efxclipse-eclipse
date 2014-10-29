package org.eclipse.fx.ide.l10n.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.EObject

class NLSHighlightingCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if( resource == null ) {
			return
		}

		resource.allContents.filter(typeof(RichVarPart)).map[e | NodeModelUtils.getNode(e as EObject)].forEach[n|
			acceptor.addPosition(n.offset-1,n.length+2,NLSHighlightingConfiguration.RICH_TEXT_VAR_ID)
		]
	}

}