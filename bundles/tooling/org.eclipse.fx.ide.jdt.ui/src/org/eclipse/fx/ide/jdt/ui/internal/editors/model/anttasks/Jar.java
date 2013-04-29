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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getFileset <em>Fileset</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getJar()
 * @model
 * @generated
 */
public interface Jar extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(Platform)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getJar_Platform()
	 * @model containment="true"
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Fileset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fileset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileset</em>' containment reference.
	 * @see #setFileset(FileSet)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getJar_Fileset()
	 * @model containment="true"
	 * @generated
	 */
	FileSet getFileset();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getFileset <em>Fileset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileset</em>' containment reference.
	 * @see #getFileset()
	 * @generated
	 */
	void setFileset(FileSet value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(Application)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getJar_Application()
	 * @model containment="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getJar_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

} // Jar
