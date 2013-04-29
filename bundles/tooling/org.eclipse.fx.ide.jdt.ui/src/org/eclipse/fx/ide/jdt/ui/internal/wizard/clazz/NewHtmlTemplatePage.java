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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.fx.ide.jdt.ui.internal.JavaFXUIPlugin;
import org.eclipse.fx.ide.ui.wizards.AbstractJDTElementPage;
import org.eclipse.fx.ide.ui.wizards.template.HtmlElement;
import org.eclipse.fx.ide.ui.wizards.template.JDTElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * @author Martin Bluehweis
 */
public class NewHtmlTemplatePage extends AbstractJDTElementPage<JDTElement> {
	// private Text tTitle;
	// private DataBindingContext dbc;

	protected NewHtmlTemplatePage( IPackageFragmentRoot froot, IPackageFragment fragment, IWorkspaceRoot fWorkspaceRoot ) {
		super( "newApplicationId", "JavaFX Html Template", "Create a new JavaFX Html Template", froot, fragment, fWorkspaceRoot );
	}

	@Override
	protected ImageDescriptor getTitleAreaImage( Display display ) {
		return JavaFXUIPlugin.imageDescriptorFromPlugin( JavaFXUIPlugin.PLUGIN_ID, "/icons/wizban/xhtml_wiz.png" );
	}

	@Override
	protected void createFields( Composite parent, DataBindingContext dbc ) {
		// this.dbc = dbc;
		// {
		// Label l = new Label( parent, SWT.NONE );
		// l.setText( "Title" );
		//
		// tTitle = new Text( parent, SWT.BORDER );
		// GridData gd = new GridData( GridData.FILL_HORIZONTAL );
		// gd.horizontalSpan = 2;
		// tTitle.setLayoutData( gd );
		// dbc.bindValue( WidgetProperties.text().observe( tTitle ), BeanProperties.value( "title" ).observe( getClazz() ) );
		// }
	}

	@Override
	protected HtmlElement createInstance() {
		return new HtmlElement();
	}

	// @Override
	// protected void revalidate() {
	// super.revalidate();
	// if ( isPageComplete() ) {
	// dbc.updateModels(); // TODO this should not be necessary
	// if ( tTitle.getText() == null || tTitle.getText().trim().length() == 0 ) {
	// setPageComplete( false );
	// setMessage( "Enter a page title", IMessageProvider.ERROR );
	// }
	// else {
	// setPageComplete( true );
	// setMessage( null );
	// }
	// }
	// }
}
