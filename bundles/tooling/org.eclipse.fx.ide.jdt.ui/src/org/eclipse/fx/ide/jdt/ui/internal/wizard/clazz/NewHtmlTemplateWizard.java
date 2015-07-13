/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard.clazz;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.jdt.ui.internal.wizard.templates.HtmlTemplateGenerator;
import org.eclipse.fx.ide.ui.wizards.template.HtmlElement;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;

/**
 * @author Martin Bluehweis
 */
@SuppressWarnings( "restriction" )
public class NewHtmlTemplateWizard extends AbstractNewClassWizard<HtmlElement> {

	@Override
	public void addPages() {
		addPage( new NewHtmlTemplatePage( getInitialRoot(), getInitialFragment(), ResourcesPlugin.getWorkspace().getRoot() ) );
	}

	@Override
	protected IGenerator<HtmlElement> getGenerator() {
		return new HtmlTemplateGenerator();
	}

	@Override
	protected IFile createFile() {
		IPath path;
		IPackageFragment fragment = getDomainClass().getPackageFragment();
		if ( fragment != null ) {
			String cuName = getDomainClass().getName() + JavaFXUIPlugin.FILEEXTENSION_HTML_TEMPLATE;
			path = fragment.getPath().append( cuName );
		}
		else {
			String cuName = getDomainClass().getName() + JavaFXUIPlugin.FILEEXTENSION_HTML_TEMPLATE;
			IFolder p = (IFolder) getDomainClass().getFragmentRoot().getResource();
			path = p.getLocation().append( cuName );
		}

		// If the path already exists then confirm overwrite.
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile( path );
		if ( file.exists() ) {
			String[] buttons = new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL };
			String question = NLS.bind( IDEWorkbenchMessages.SaveAsDialog_overwriteQuestion, path.toString() );
			MessageDialog d = new MessageDialog( getShell(), IDEWorkbenchMessages.Question, null, question, MessageDialog.QUESTION, buttons, 0 ) {
				protected int getShellStyle() {
					return super.getShellStyle() | SWT.SHEET;
				}
			};
			int overwrite = d.open();
			switch ( overwrite ) {
			case 0: // Yes
				break;
			case 1: // No
				return null;
			case 2: // Cancel
			default:
				return null;
			}
		}
		return file;
	}
}
