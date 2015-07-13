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
package org.eclipse.fx.ide.fxgraph.ui.wizards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.fx.ide.fxgraph.ui.wizards.template.FXGraphElement;
import org.eclipse.fx.ide.fxgraph.ui.wizards.template.FXGraphTemplate;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;

import org.eclipse.fx.ide.ui.wizards.AbstractNewJDTElementWizard;
import org.eclipse.fx.ide.ui.wizards.template.IGenerator;

public class NewFXGraphWizard extends AbstractNewJDTElementWizard<FXGraphElement> {
	private static final String SETTINGS_FILE = "new-graph-settings.xml";
	public static final String KEY_LAST_SELECTIONS = "KEY_LAST_SELECTIONS";

	private static final int MAX_HISTORY_SIZE = 20;

	public NewFXGraphWizard() {
		if( getDialogSettings() == null ) {
			DialogSettings settings = new DialogSettings("new-fxgraph");
			try {
				settings.load(SETTINGS_FILE);
			} catch (IOException e) {
			}
			setDialogSettings(settings);
		}
	}

	@Override
	protected IGenerator<FXGraphElement> getGenerator() {
		return new FXGraphTemplate();
	}

	@Override
	public void addPages() {
		addPage(new FXGraphWizardPage(getInitialRoot(),getInitialFragment(),ResourcesPlugin.getWorkspace().getRoot()));
	}

	@Override
	public boolean performFinish() {
		boolean finish = super.performFinish();

		if( finish && getDialogSettings() != null ) {
			IDialogSettings settings = getDialogSettings();
			String typeName = getDomainClass().getRootElement().getFullyQualifiedName();

			String[] elements = settings.getArray(KEY_LAST_SELECTIONS);

			if( elements == null ) {
				settings.put(KEY_LAST_SELECTIONS, new String[]{ typeName });
			} else {
				List<String> ar = new ArrayList<String>(Arrays.asList(elements));
				ar.remove(typeName);
				ar.add(0, typeName);

				// If the list gets too long we'll remove the last entry
				if( ar.size() > MAX_HISTORY_SIZE ) {
					while( ar.size() > MAX_HISTORY_SIZE ) {
						ar.remove(MAX_HISTORY_SIZE);
					}
				}

				settings.put(KEY_LAST_SELECTIONS, ar.toArray(new String[0]));
			}

			try {
				settings.save(SETTINGS_FILE);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return finish;
	}

	@Override
	protected IFile createFile() {
		if (getFragment() != null) {
			String fxgraph = getDomainClass().getName() + ".fxgraph";
			IFolder p = (IFolder) getFragment().getResource();
			IResource resource = p.getFile(fxgraph);
			return (IFile) resource;
		} else {
			String fxgraph = getDomainClass().getName() + ".fxgraph";
			IFolder p = (IFolder) getDomainClass().getFragmentRoot().getResource();
			return p.getFile(fxgraph);
		}
	}
}
