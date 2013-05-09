/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.rrobot.model.task.Generator;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Templated File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl#getGeneratorType <em>Generator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplatedFileImpl extends FileImpl implements TemplatedFile {
	/**
	 * The default value of the '{@link #getGeneratorType() <em>Generator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorType()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeneratorType() <em>Generator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorType()
	 * @generated
	 * @ordered
	 */
	protected String generatorType = GENERATOR_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplatedFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TEMPLATED_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorType() {
		return generatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorType(String newGeneratorType) {
		String oldGeneratorType = generatorType;
		generatorType = newGeneratorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE, oldGeneratorType, generatorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE:
				return getGeneratorType();
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
			case TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE:
				setGeneratorType((String)newValue);
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
			case TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE:
				setGeneratorType(GENERATOR_TYPE_EDEFAULT);
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
			case TaskPackage.TEMPLATED_FILE__GENERATOR_TYPE:
				return GENERATOR_TYPE_EDEFAULT == null ? generatorType != null : !GENERATOR_TYPE_EDEFAULT.equals(generatorType);
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
		result.append(" (generatorType: ");
		result.append(generatorType);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public InputStream getContent(IProgressMonitor progressMonitor, Map<String, Object> data) throws IOException {
		Bundle b = FrameworkUtil.getBundle(getClass());
		try {
			Collection<ServiceReference<Generator>> references = b.getBundleContext().getServiceReferences(Generator.class, "(type="+getGeneratorType()+")");
			if( references.isEmpty() ) {
				throw new IOException("Could not find generator for type '"+getGeneratorType()+"'");
			} else {
				return b.getBundleContext().getService(references.iterator().next()).generate(this, data);
			}
		} catch (InvalidSyntaxException e) {
			throw new IOException("Could not find generator for type '"+getGeneratorType()+"'", e);
		}
	}
} //TemplatedFileImpl
