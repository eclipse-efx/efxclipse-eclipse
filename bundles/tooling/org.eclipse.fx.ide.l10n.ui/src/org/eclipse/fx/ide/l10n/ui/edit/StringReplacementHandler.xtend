package org.eclipse.fx.ide.l10n.ui.edit

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.swt.widgets.Event
import org.eclipse.swt.SWT

abstract class StringReplacementHandler extends AbstractHandler {
	static class LeftGuillemet extends org.eclipse.fx.ide.l10n.ui.edit.StringReplacementHandler {
		new() {
			super('\u00ab')
		}
	}

	static class RightGuillemet extends org.eclipse.fx.ide.l10n.ui.edit.StringReplacementHandler {
		new() {
			super('\u00bb')
		}
	}

	val char replacement;

	new(char replacement) {
		this.replacement = replacement
	}

	override execute(ExecutionEvent event) throws ExecutionException {
		val editor = EditorUtils::getActiveXtextEditor(event)
		if( editor == null ) {
			return null
		}

		editor.internalSourceViewer.textWidget.notifyListeners(SWT::KeyDown,new Event => [
			character = replacement
			type = SWT::KeyDown
			doit = true
		])

		return null
	}

}