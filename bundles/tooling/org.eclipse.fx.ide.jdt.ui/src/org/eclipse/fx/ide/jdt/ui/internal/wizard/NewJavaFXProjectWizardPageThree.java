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

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard.ProjectData;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewJavaFXProjectWizardPageThree extends WizardPage {
	private static final String FXML_PAGE = "fxmlPage";
	private ProjectData projectData;
	private Combo declarativeUiType;
	private Combo declarativeUiRootType;
	private Text declarativeUiFilename;
	private Text declarativeUiControllerName;
	private Group g;
	private Combo mainApplication;
	private Text packageName;
	
	public static final String MOBILE = "Mobile";
	public static final String DESKTOP = "Desktop";
	
	protected NewJavaFXProjectWizardPageThree(ProjectData projectData) {
		super( FXML_PAGE );
		this.projectData = projectData;
	}

	private void validate() {
		if( projectData.packageName.trim().isEmpty() ) {
			setErrorMessage("Package name must not be empty");
			setPageComplete(false);
			return;
		}
		
		if( ! projectData.declarativeUiType.equals("None") ) {
			if( projectData.declarativeUiName.trim().isEmpty() ) {
				setErrorMessage("Declarative UI File Name must not be empty");
				setPageComplete(false);
				return;
			}
		}
		setPageComplete(true);
	}
	
	@Override
	public void createControl( Composite arg0 ) {
		Composite container = new Composite( arg0, SWT.NONE );
		container.setLayout( new GridLayout( 2, false ) );
		
		{
			Label l = new Label(container, SWT.NONE);
			l.setText("Application type");
			
			mainApplication = new Combo(container, SWT.READ_ONLY);
			mainApplication.setItems(new String[]{DESKTOP,MOBILE});
			mainApplication.select(0); 
			mainApplication.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					projectData.mainApp = mainApplication.getSelectionIndex() == 0 ? "Desktop" : "Mobile";
					validate();
				}
			});
		}
		
		{
			Label l = new Label( container, SWT.NONE );
			l.setText( "Package Name" );
			
			packageName = new Text(container,SWT.BORDER);
			packageName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			packageName.setText(projectData.packageName);
			packageName.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					projectData.packageName = packageName.getText();
					validate();
				}
			});
		}
		
		g = new Group(container, SWT.NONE);
		g.setText("Declarative UI");
		g.setLayout(new GridLayout(2, false));
		g.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
		
		{
			Label l = new Label( g, SWT.NONE );
			l.setText( "Language" );
			
			declarativeUiType = new Combo( g, SWT.READ_ONLY );
			declarativeUiType.setItems( new String[] { "None","FxGraph","FXML" } );
			
			int i = 0;
			for( String s : declarativeUiType.getItems() ) {
				if( s.equals(projectData.declarativeUiType) ) {
					declarativeUiType.select(i);
					break;
				}
				i++;
			}
			
			declarativeUiType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					int idx = declarativeUiType.getSelectionIndex(); 
					declarativeUiRootType.setEnabled(idx > 0);
					declarativeUiFilename.setEnabled(idx > 0);
					declarativeUiControllerName.setEnabled(idx > 0);
					projectData.declarativeUiType = declarativeUiType.getItem(declarativeUiType.getSelectionIndex());
					validate();
				}
			});
		}
		
		{
			Label l = new Label( g, SWT.NONE );
			l.setText( "Root-Type" );
			
			declarativeUiRootType = new Combo(g, SWT.READ_ONLY);
			declarativeUiRootType.setItems(new String[] {
					"javafx.scene.layout.AnchorPane", 
					"javafx.scene.layout.BorderPane", 
					"javafx.scene.layout.FlowPane", 
					"javafx.scene.layout.GridPane", 
					"javafx.scene.layout.HBox", 
					"javafx.scene.layout.Region", 
					"javafx.scene.layout.StackPane", 
					"javafx.scene.layout.TilePane", 
					"javafx.scene.layout.VBox",
					"org.eclipse.fx.ui.mobile.Deck"
			});
			declarativeUiRootType.setEnabled(false);
			
			int i = 0;
			for( String s : declarativeUiRootType.getItems() ) {
				if( s.equals(projectData.declarativeUiRootType) ) {
					declarativeUiRootType.select(i);
					break;
				}
				i++;
			}
			
			declarativeUiRootType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					projectData.declarativeUiRootType = declarativeUiRootType.getItem(declarativeUiRootType.getSelectionIndex());
					validate();
				}
			});
		}
				
		{
			Label l = new Label( g, SWT.NONE );
			l.setText( "File Name" );
			
			declarativeUiFilename = new Text(g,SWT.BORDER);
			declarativeUiFilename.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			declarativeUiFilename.setText(projectData.declarativeUiName);
			declarativeUiFilename.setEnabled(false);
			
			declarativeUiFilename.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					projectData.declarativeUiName = declarativeUiFilename.getText();
					validate();
				}
			});
		}
		
		{
			Label l = new Label( g, SWT.NONE );
			l.setText( "Controller Name" );
			
			declarativeUiControllerName = new Text(g,SWT.BORDER);
			declarativeUiControllerName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			declarativeUiControllerName.setText(projectData.declarativeUiController);
			declarativeUiControllerName.setEnabled(false);
			
			declarativeUiControllerName.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					projectData.declarativeUiController = declarativeUiControllerName.getText();
					validate();
				}
			});
		}
		
		setControl( container );
	}
}