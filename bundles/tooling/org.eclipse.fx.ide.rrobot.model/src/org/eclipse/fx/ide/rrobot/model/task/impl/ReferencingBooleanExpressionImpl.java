/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;


import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencing Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl#getExecutionURI <em>Execution URI</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencingBooleanExpressionImpl extends EObjectImpl implements ReferencingBooleanExpression {
	/**
	 * The default value of the '{@link #getExecutionURI() <em>Execution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionURI() <em>Execution URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionURI()
	 * @generated
	 * @ordered
	 */
	protected String executionURI = EXECUTION_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencingBooleanExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.REFERENCING_BOOLEAN_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionURI() {
		return executionURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionURI(String newExecutionURI) {
		String oldExecutionURI = executionURI;
		executionURI = newExecutionURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI, oldExecutionURI, executionURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean execute(Map<String, Object> data) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI:
				return getExecutionURI();
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI:
				setExecutionURI((String)newValue);
				return;
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI:
				setExecutionURI(EXECUTION_URI_EDEFAULT);
				return;
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI:
				return EXECUTION_URI_EDEFAULT == null ? executionURI != null : !EXECUTION_URI_EDEFAULT.equals(executionURI);
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (executionURI: ");
		result.append(executionURI);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ReferencingBooleanExpressionImpl
