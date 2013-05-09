/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile;
import org.eclipse.fx.ide.rrobot.model.task.Generator;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.fx.ide.rrobot.model.task.Variable;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl#getExecutionURI <em>Execution URI</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicFileImpl extends FileImpl implements DynamicFile {
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
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.DYNAMIC_FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.DYNAMIC_FILE__EXECUTION_URI, oldExecutionURI, executionURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.DYNAMIC_FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, TaskPackage.DYNAMIC_FILE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.DYNAMIC_FILE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.DYNAMIC_FILE__EXECUTION_URI:
				return getExecutionURI();
			case TaskPackage.DYNAMIC_FILE__TYPE:
				return getType();
			case TaskPackage.DYNAMIC_FILE__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskPackage.DYNAMIC_FILE__EXECUTION_URI:
				setExecutionURI((String)newValue);
				return;
			case TaskPackage.DYNAMIC_FILE__TYPE:
				setType((String)newValue);
				return;
			case TaskPackage.DYNAMIC_FILE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
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
			case TaskPackage.DYNAMIC_FILE__EXECUTION_URI:
				setExecutionURI(EXECUTION_URI_EDEFAULT);
				return;
			case TaskPackage.DYNAMIC_FILE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TaskPackage.DYNAMIC_FILE__VARIABLES:
				getVariables().clear();
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
			case TaskPackage.DYNAMIC_FILE__EXECUTION_URI:
				return EXECUTION_URI_EDEFAULT == null ? executionURI != null : !EXECUTION_URI_EDEFAULT.equals(executionURI);
			case TaskPackage.DYNAMIC_FILE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TaskPackage.DYNAMIC_FILE__VARIABLES:
				return variables != null && !variables.isEmpty();
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
	
	@Override
	public InputStream getContent(IProgressMonitor progressMonitor, Map<String, Object> data) throws IOException {
		Bundle b = FrameworkUtil.getBundle(getClass());
		try {
			Collection<ServiceReference<Generator>> references = b.getBundleContext().getServiceReferences(Generator.class, "(executabletype="+getType()+")");
			if( references.isEmpty() ) {
				throw new IOException("Could not find generator for type '"+getType()+"'");
			} else {
				return b.getBundleContext().getService(references.iterator().next()).generate(this, data);
			}
		} catch (InvalidSyntaxException e) {
			throw new IOException("Could not find generator for type '"+getType()+"'", e);
		}
	}

} //DynamicFileImpl
