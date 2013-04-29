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

import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.KEY_VALUE_PAIR__KEY;
import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.KEY_VALUE_PAIR__VALUE;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;


/**
 * @author martin
 * 
 */
public class AddFontDialog extends AddDialog<KeyValuePair> {
	private KeyValuePair o;
	private Text tFontName;
	private Text tFile;
	private final EditingDomain editingDomain;
	private final AntTask task;
	private final IContainer resourceContainer;

	/**
	 * @param parentShell
	 *            parent shell
	 * @param editingDomain
	 *            the editing domain
	 * @param task
	 *            ant task working on
	 */
	public AddFontDialog( final Shell parentShell, final EditingDomain editingDomain, final AntTask task, final IContainer resourceContainer ) {
		super( parentShell );
		this.editingDomain = editingDomain;
		this.task = task;
		this.resourceContainer = resourceContainer;
	}

	@Override
	protected Control createDialogContent( Composite parent ) {
		o = ParametersFactory.eINSTANCE.createKeyValuePair();
		Composite area = new Composite( parent, SWT.NONE );
		area.setLayout( new GridLayout( 1, false ) );
		area.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		getShell().setText( "Add font " );
		setTitle( "Add font" );
		setMessage( "Enter informations about the font to add" );

		Composite container = new Composite( area, SWT.NONE );
		container.setLayout( new GridLayout( 3, false ) );
		container.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		IWidgetValueProperty tProp = WidgetProperties.text( SWT.Modify );

		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "Font name*:" );
			tFontName = new Text( container, SWT.BORDER );
			GridData tFontGD = new GridData( GridData.FILL_HORIZONTAL );
			tFontGD.horizontalSpan = 2;
			tFontName.setLayoutData( tFontGD );
			IEMFValueProperty prop = EMFEditProperties.value( editingDomain, KEY_VALUE_PAIR__KEY );
			dbContext.bindValue( tProp.observeDelayed( DELAY, tFontName ), prop.observe( o ), new EMFUpdateValueStrategy(
					EMFUpdateValueStrategy.POLICY_ON_REQUEST ), new EMFUpdateValueStrategy() );
		}

		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "File*:" );

			tFile = new Text( container, SWT.BORDER );
			tFile.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
			tFile.setEditable( false );
			IEMFValueProperty prop = EMFEditProperties.value( editingDomain, KEY_VALUE_PAIR__VALUE );
			dbContext.bindValue( tProp.observeDelayed( DELAY, tFile ), prop.observe( o ),
					new EMFUpdateValueStrategy( EMFUpdateValueStrategy.POLICY_ON_REQUEST ), new EMFUpdateValueStrategy() );
			Button b = new Button( container, SWT.NONE );
			b.setText( "Browse ..." );
			b.addSelectionListener( new SelectionAdapter() {
				@Override
				public void widgetSelected( final SelectionEvent e ) {
					FilteredResourcesSelectionDialog d = new FilteredResourcesSelectionDialog( getShell(), false, resourceContainer, IResource.FILE ) {
						@Override
						protected IStatus validateItem( final Object item ) {
							IFile f = (IFile) item;
							if ( f.getParent() instanceof IProject ) {
								return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The selected resource has to be part of the source folder" );
							}
							if ( !f.getName().endsWith( ".ttf" ) ) {
								return new Status( IStatus.ERROR, JavaFXUIPlugin.PLUGIN_ID, "The selected resource does not seem to be a font" );
							}
							return super.validateItem( item );
						}
					};
					
					if ( d.open() == ResourceSelectionDialog.OK ) {
						Object[] rv = d.getResult();
						if ( rv.length == 1 ) {
							IFile f = (IFile) rv[0];
							IJavaElement j = JavaCore.create( f.getParent() );
							if ( j instanceof IPackageFragment ) {
								IPackageFragment p = (IPackageFragment) j;
								tFile.setText( p.getElementName().replace( '.', '/' ) + "/" + f.getName() );
							}
							else if ( j instanceof IPackageFragmentRoot ) {
								IPackageFragmentRoot p = (IPackageFragmentRoot) j;
								tFile.setText( f.getName() );
							}
							else {
								MessageDialog.openInformation( getShell(), "Not valid", "The selected resource has to be part of the source folder" );
							}
						}
					}
				}
			} );

		}
		return area;
	}

	@Override
	protected Command generateOkCommand() {
		return new AddCommand( editingDomain, task.getFonts(), o );
	}

	@Override
	protected IStatus validate() {
		IStatus status;
		if ( tFontName.getText() == null || tFontName.getText().trim().equals( "" ) ) {
			status = new Status( Status.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Please enter a folder" );
		}
		else if ( tFile.getText() == null || tFile.getText().trim().equals( "" ) ) {
			status = new Status( Status.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Please enter a file" );
		}
		else {
			status = new Status( Status.OK, JavaFXUIPlugin.PLUGIN_ID, "OK" );
		}
		return status;
	}

	@Override
	protected KeyValuePair getObject() {
		return o;
	}
}
