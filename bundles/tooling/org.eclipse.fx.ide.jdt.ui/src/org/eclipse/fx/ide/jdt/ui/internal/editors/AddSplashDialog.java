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

import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.SPLASH__HREF;
import static org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage.Literals.SPLASH__MODE;

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
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerValueProperty;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


/**
 * @author martin
 * 
 */
public class AddSplashDialog extends AddDialog<Splash> {
	private Splash o;
	private Text tUrl;
	private final EditingDomain editingDomain;
	private final AntTask task;

	/**
	 * @param parentShell
	 *            parent shell
	 * @param editingDomain
	 *            the editing domain
	 * @param task
	 *            ant task working on
	 */
	public AddSplashDialog( final Shell parentShell, final EditingDomain editingDomain, final AntTask task ) {
		super( parentShell );
		this.editingDomain = editingDomain;
		this.task = task;
	}

	@Override
	protected Control createDialogContent( final Composite parent ) {
		o = ParametersFactory.eINSTANCE.createSplash();
		Composite area = new Composite( parent, SWT.NONE );
		area.setLayout( new GridLayout( 1, false ) );
		area.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		getShell().setText( "Add splash icon" );
		setTitle( "Add splash" );
		setMessage( "Enter informations about the splash to add" );

		Composite container = new Composite( area, SWT.NONE );
		container.setLayout( new GridLayout( 2, false ) );
		container.setLayoutData( new GridData( GridData.FILL_BOTH ) );

		IViewerValueProperty selProp = ViewerProperties.singleSelection();
		IWidgetValueProperty tProp = WidgetProperties.text( SWT.Modify );

		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "Mode*:" );

			ComboViewer v = new ComboViewer( container, SWT.READ_ONLY );
			v.setLabelProvider( new LabelProvider() );
			v.setContentProvider( ArrayContentProvider.getInstance() );
			v.setInput( SplashMode.values() );
			IEMFValueProperty prop = EMFEditProperties.value( editingDomain, SPLASH__MODE );
			dbContext.bindValue( selProp.observe( v ), prop.observe( o ), new EMFUpdateValueStrategy( EMFUpdateValueStrategy.POLICY_ON_REQUEST ),
					new EMFUpdateValueStrategy() );
		}

		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "URL*:" );

			tUrl = new Text( container, SWT.BORDER );
			tUrl.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
			IEMFValueProperty prop = EMFEditProperties.value( editingDomain, SPLASH__HREF );
			dbContext.bindValue( tProp.observeDelayed( DELAY, tUrl ), prop.observe( o ),
					new EMFUpdateValueStrategy( EMFUpdateValueStrategy.POLICY_ON_REQUEST ), new EMFUpdateValueStrategy() );
		}
		return area;
	}

	@Override
	protected Command generateOkCommand() {
		return new AddCommand( editingDomain, task.getDeploy().getInfo().getSplash(), o );
	}

	@Override
	protected IStatus validate() {
		IStatus status;
		if ( tUrl.getText() == null || tUrl.getText().trim().equals( "" ) ) {
			status = new Status( Status.ERROR, JavaFXUIPlugin.PLUGIN_ID, "Please enter a URL" );
		}
		else {
			status = new Status( Status.OK, JavaFXUIPlugin.PLUGIN_ID, "OK" );
		}
		return status;
	}

	@Override
	protected Splash getObject() {
		return o;
	}
}
