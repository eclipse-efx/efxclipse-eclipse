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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getRefid <em>Refid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJavafx <em>Javafx</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJ2se <em>J2se</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJVmArgs <em>JVm Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject {
	/**
	 * Returns the value of the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refid</em>' attribute.
	 * @see #setRefid(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform_Refid()
	 * @model
	 * @generated
	 */
	String getRefid();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getRefid <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refid</em>' attribute.
	 * @see #getRefid()
	 * @generated
	 */
	void setRefid(String value);

	/**
	 * Returns the value of the '<em><b>Javafx</b></em>' attribute.
	 * The default value is <code>"2.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Javafx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javafx</em>' attribute.
	 * @see #setJavafx(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform_Javafx()
	 * @model default="2.1"
	 * @generated
	 */
	String getJavafx();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJavafx <em>Javafx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Javafx</em>' attribute.
	 * @see #getJavafx()
	 * @generated
	 */
	void setJavafx(String value);

	/**
	 * Returns the value of the '<em><b>J2se</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>J2se</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>J2se</em>' attribute.
	 * @see #setJ2se(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform_J2se()
	 * @model
	 * @generated
	 */
	String getJ2se();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJ2se <em>J2se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>J2se</em>' attribute.
	 * @see #getJ2se()
	 * @generated
	 */
	void setJ2se(String value);

	/**
	 * Returns the value of the '<em><b>JVm Args</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JVm Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JVm Args</em>' containment reference list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform_JVmArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<JVmArg> getJVmArgs();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getPlatform_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Platform
