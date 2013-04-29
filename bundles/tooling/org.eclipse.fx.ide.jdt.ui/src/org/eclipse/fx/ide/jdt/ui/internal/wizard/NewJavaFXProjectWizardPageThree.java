/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class NewJavaFXProjectWizardPageThree extends WizardPage {

	protected NewJavaFXProjectWizardPageThree( String pageName ) {
		super( pageName );
	}

	@Override
	public void createControl( Composite arg0 ) {
		Composite container = new Composite( arg0, SWT.NONE );
		container.setLayout( new GridLayout( 2, false ) );
		
		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "Type" );
			
			Combo c = new Combo( container, SWT.READ_ONLY );
			c.setItems( new String[] { "Plain","FXML","FxGraph" } );
		}
		
		setControl( container );
	}
}