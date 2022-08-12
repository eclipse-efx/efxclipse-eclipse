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
package org.eclipse.fx.ide.css.extapi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ValidationResult {
	public final ValidationStatus status;
	public final String message;
	public final EObject object;
	public final EStructuralFeature feature;
	public final int index;
	
	public ValidationResult(ValidationStatus status, String message, EObject object, EStructuralFeature feature, int index) {
		this.status = status;
		this.message = message;
		this.object = object;
		this.feature = feature;
		this.index = index;
	}
	
	@Override
	public String toString() {
		return status.name() + " - " + message;
	}
}