/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getSplash()
 * @model
 * @generated
 */
public interface Splash extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getSplash_Href()
	 * @model
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode
	 * @see #setMode(SplashMode)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getSplash_Mode()
	 * @model
	 * @generated
	 */
	SplashMode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SplashMode value);

} // Splash
