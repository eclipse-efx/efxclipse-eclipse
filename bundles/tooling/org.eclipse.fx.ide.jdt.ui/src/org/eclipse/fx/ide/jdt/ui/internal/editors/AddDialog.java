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
package org.eclipse.fx.ide.jdt.ui.internal.editors;

import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.ObservablesManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Martin Bluehweis
 */
public abstract class AddDialog<T extends EObject> extends TitleAreaDialog {
	protected final DataBindingContext dbContext = new DataBindingContext();
	private final ObservablesManager mgr = new ObservablesManager();
	protected static final int DELAY = 500;

	/**
	 * @param parentShell
	 */
	public AddDialog( final Shell parentShell ) {
		super( parentShell );
	}

	@Override
	protected Control createDialogArea( final Composite parent ) {
		final AtomicReference<Control> c = new AtomicReference<Control>();
		mgr.runAndCollect( new Runnable() {
			@Override
			public void run() {
				c.set( createDialogContent( parent ) );
			}
		} );
		return c.get();
	}

	@Override
	protected void okPressed() {
		IStatus status = validate();
		if ( status.isOK() ) {
			Command cmd = generateOkCommand();
			if ( cmd.canExecute() ) {
				cmd.execute();
				dbContext.updateModels();
				doCleanUp();
				super.okPressed();
			}
		}
		else {
			if ( status.isMultiStatus() ) {
				StringBuffer errors = new StringBuffer();
				for ( IStatus s : ( (MultiStatus) status ).getChildren() ) {
					errors.append( s.getMessage() ).append( "\n" );
				}
				setErrorMessage( errors.toString() );
			}
			else {
				setErrorMessage( status.getMessage() );
			}
		}
	}

	@Override
	protected void cancelPressed() {
		doCleanUp();
		super.cancelPressed();
	}
	
	/**
	 * cleanup.
	 */
	private void doCleanUp() {
		mgr.dispose();
		dbContext.dispose();
	}

	protected abstract Command generateOkCommand();

	protected abstract IStatus validate();

	protected abstract Control createDialogContent( Composite parent );

	protected abstract T getObject();
}
