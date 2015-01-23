/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.Cardinality;
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentReference;
import org.eclipse.fx.ide.rrobot.model.bundle.Policy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getUnbind <em>Unbind</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentReferenceImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentReferenceImpl extends EObjectImpl implements ComponentReference {
	/**
	 * The default value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected String bind = BIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnbind() <em>Unbind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbind()
	 * @generated
	 * @ordered
	 */
	protected static final String UNBIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnbind() <em>Unbind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbind()
	 * @generated
	 * @ordered
	 */
	protected String unbind = UNBIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.SINGLE_OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Policy POLICY_EDEFAULT = Policy.DYNAMIC;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected Policy policy = POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.COMPONENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind(String newBind) {
		String oldBind = bind;
		bind = newBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__BIND, oldBind, bind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnbind() {
		return unbind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnbind(String newUnbind) {
		String oldUnbind = unbind;
		unbind = newUnbind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__UNBIND, oldUnbind, unbind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(Policy newPolicy) {
		Policy oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_REFERENCE__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BundlePackage.COMPONENT_REFERENCE__BIND:
				return getBind();
			case BundlePackage.COMPONENT_REFERENCE__UNBIND:
				return getUnbind();
			case BundlePackage.COMPONENT_REFERENCE__CARDINALITY:
				return getCardinality();
			case BundlePackage.COMPONENT_REFERENCE__NAME:
				return getName();
			case BundlePackage.COMPONENT_REFERENCE__TYPE_NAME:
				return getTypeName();
			case BundlePackage.COMPONENT_REFERENCE__POLICY:
				return getPolicy();
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
			case BundlePackage.COMPONENT_REFERENCE__BIND:
				setBind((String)newValue);
				return;
			case BundlePackage.COMPONENT_REFERENCE__UNBIND:
				setUnbind((String)newValue);
				return;
			case BundlePackage.COMPONENT_REFERENCE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case BundlePackage.COMPONENT_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case BundlePackage.COMPONENT_REFERENCE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case BundlePackage.COMPONENT_REFERENCE__POLICY:
				setPolicy((Policy)newValue);
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
			case BundlePackage.COMPONENT_REFERENCE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_REFERENCE__UNBIND:
				setUnbind(UNBIND_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_REFERENCE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_REFERENCE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_REFERENCE__POLICY:
				setPolicy(POLICY_EDEFAULT);
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
			case BundlePackage.COMPONENT_REFERENCE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case BundlePackage.COMPONENT_REFERENCE__UNBIND:
				return UNBIND_EDEFAULT == null ? unbind != null : !UNBIND_EDEFAULT.equals(unbind);
			case BundlePackage.COMPONENT_REFERENCE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case BundlePackage.COMPONENT_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BundlePackage.COMPONENT_REFERENCE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case BundlePackage.COMPONENT_REFERENCE__POLICY:
				return policy != POLICY_EDEFAULT;
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
		result.append(" (bind: ");
		result.append(bind);
		result.append(", unbind: ");
		result.append(unbind);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", name: ");
		result.append(name);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", policy: ");
		result.append(policy);
		result.append(')');
		return result.toString();
	}

} //ComponentReferenceImpl
