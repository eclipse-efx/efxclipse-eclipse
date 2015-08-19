/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.handler;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.Util;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.program.Program;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;

public class OpenWithFXMLHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();
		ISelection s = (ISelection) context.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if( s instanceof IStructuredSelection ) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if( o instanceof IFile ) {
				IFile f = (IFile) o;
				String scenebuilder = InstanceScope.INSTANCE.getNode("org.eclipse.fx.ide.ui").get("scenebuilder.exe", null);
				if( scenebuilder != null ) {
					try {
						String executable = scenebuilder;
						if( Util.isMac()  ) {
						 executable += "/Contents/MacOS/scenebuilder-launcher.sh";
							if( ! new File(executable).exists() ) {
								executable = scenebuilder + "/Contents/MacOS/SceneBuilder";
							}
						}

						Runtime.getRuntime().exec(new String[] {executable, f.getLocation().toFile().getAbsolutePath() });
					} catch (IOException e) {
						MessageDialog.openError(HandlerUtil.getActiveShell(event), "Launch failed", "Failed to launch SceneBuilder. The error message was: " + e.getMessage());
					}
				} else {
					if( Program.findProgram(".fxml") != null ) {
						if( ! Program.launch(f.getLocation().toFile().getAbsolutePath()) ) {
							MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unable to open file", "Opening the file with SceneBuilder failed. Try setting the absolute path to scenebuilder in your the preferences");
						}
					} else {
						MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Unable to open file", "Opening the file with SceneBuilder failed. Try setting the absolute path to scenebuilder in your the preferences");
					}
				}
			}
		}
		return null;
	}

}
