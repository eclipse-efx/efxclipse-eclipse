/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package $packageName$;

import org.eclipse.fx.ui.workbench3.FXViewPart;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class $viewPartClass$ extends FXViewPart {
	public static final String ID = "$packageName$.$viewPartClass$";
	
	private Button button;
	
	@Override
	protected Scene createFxScene() {
		BorderPane p = new BorderPane();
		button = new Button("Hello JavaFX/RCP");
		p.setCenter(button);
		Scene s = new Scene(p);
		return s;
	}

	@Override
	protected void setFxFocus() {
		button.requestFocus();
	}
}