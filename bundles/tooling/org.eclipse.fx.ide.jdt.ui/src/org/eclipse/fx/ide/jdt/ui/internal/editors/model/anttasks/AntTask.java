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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ant Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries <em>Manifest Entries</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin <em>Css To Bin</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFonts <em>Fonts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask()
 * @model
 * @generated
 */
public interface AntTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference.
	 * @see #setDeploy(Deploy)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	Deploy getDeploy();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' containment reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deploy value);

	/**
	 * Returns the value of the '<em><b>Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar</em>' containment reference.
	 * @see #setJar(Jar)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Jar()
	 * @model containment="true"
	 * @generated
	 */
	Jar getJar();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar</em>' containment reference.
	 * @see #getJar()
	 * @generated
	 */
	void setJar(Jar value);

	/**
	 * Returns the value of the '<em><b>Signjar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signjar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signjar</em>' containment reference.
	 * @see #setSignjar(SignJar)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Signjar()
	 * @model containment="true"
	 * @generated
	 */
	SignJar getSignjar();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signjar</em>' containment reference.
	 * @see #getSignjar()
	 * @generated
	 */
	void setSignjar(SignJar value);

	/**
	 * Returns the value of the '<em><b>Build Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Directory</em>' attribute.
	 * @see #setBuildDirectory(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_BuildDirectory()
	 * @model
	 * @generated
	 */
	String getBuildDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Directory</em>' attribute.
	 * @see #getBuildDirectory()
	 * @generated
	 */
	void setBuildDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Manifest Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Entries</em>' containment reference list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_ManifestEntries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getManifestEntries();

	/**
	 * Returns the value of the '<em><b>Css To Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css To Bin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css To Bin</em>' attribute.
	 * @see #setCssToBin(boolean)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_CssToBin()
	 * @model derived="true"
	 * @generated
	 */
	boolean isCssToBin();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin <em>Css To Bin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css To Bin</em>' attribute.
	 * @see #isCssToBin()
	 * @generated
	 */
	void setCssToBin(boolean value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getFiles();

	/**
	 * Returns the value of the '<em><b>Fonts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonts</em>' containment reference list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#getAntTask_Fonts()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getFonts();

} // AntTask
