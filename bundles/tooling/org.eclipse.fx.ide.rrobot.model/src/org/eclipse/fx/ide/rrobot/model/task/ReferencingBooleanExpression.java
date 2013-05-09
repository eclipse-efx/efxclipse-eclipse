/**
 */
package org.eclipse.fx.ide.rrobot.model.task;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referencing Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getExecutionURI <em>Execution URI</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getReferencingBooleanExpression()
 * @model
 * @generated
 */
public interface ReferencingBooleanExpression extends BooleanExpression {
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
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getReferencingBooleanExpression_ExecutionURI()
	 * @model
	 * @generated
	 */
	String getExecutionURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getExecutionURI <em>Execution URI</em>}' attribute.
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
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getReferencingBooleanExpression_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ReferencingBooleanExpression
