/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getExecutionURI <em>Execution URI</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getDynamicFile()
 * @model
 * @generated
 */
public interface DynamicFile extends File {

	/**
	 * Returns the value of the '<em><b>Execution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution URI</em>' attribute.
	 * @see #setExecutionURI(String)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getDynamicFile_ExecutionURI()
	 * @model
	 * @generated
	 */
	String getExecutionURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getExecutionURI <em>Execution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution URI</em>' attribute.
	 * @see #getExecutionURI()
	 * @generated
	 */
	void setExecutionURI(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getDynamicFile_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.task.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getDynamicFile_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();
} // DynamicFile
