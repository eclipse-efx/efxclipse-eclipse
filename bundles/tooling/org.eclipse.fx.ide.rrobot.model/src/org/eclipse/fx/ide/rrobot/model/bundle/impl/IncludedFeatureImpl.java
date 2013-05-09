/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.IncludedFeature;
import org.eclipse.fx.ide.rrobot.model.task.BooleanExpression;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.IncludedFeatureImpl#getExcludeExpression <em>Exclude Expression</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.IncludedFeatureImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.IncludedFeatureImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedFeatureImpl extends EObjectImpl implements IncludedFeature {
	/**
	 * The cached value of the '{@link #getExcludeExpression() <em>Exclude Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression excludeExpression;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.INCLUDED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.INCLUDED_FEATURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.INCLUDED_FEATURE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getExcludeExpression() {
		return excludeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeExpression(BooleanExpression newExcludeExpression, NotificationChain msgs) {
		BooleanExpression oldExcludeExpression = excludeExpression;
		excludeExpression = newExcludeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION, oldExcludeExpression, newExcludeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeExpression(BooleanExpression newExcludeExpression) {
		if (newExcludeExpression != excludeExpression) {
			NotificationChain msgs = null;
			if (excludeExpression != null)
				msgs = ((InternalEObject)excludeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION, null, msgs);
			if (newExcludeExpression != null)
				msgs = ((InternalEObject)newExcludeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION, null, msgs);
			msgs = basicSetExcludeExpression(newExcludeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION, newExcludeExpression, newExcludeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION:
				return basicSetExcludeExpression(null, msgs);
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
			case BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION:
				return getExcludeExpression();
			case BundlePackage.INCLUDED_FEATURE__ID:
				return getId();
			case BundlePackage.INCLUDED_FEATURE__VERSION:
				return getVersion();
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
			case BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION:
				setExcludeExpression((BooleanExpression)newValue);
				return;
			case BundlePackage.INCLUDED_FEATURE__ID:
				setId((String)newValue);
				return;
			case BundlePackage.INCLUDED_FEATURE__VERSION:
				setVersion((Version)newValue);
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
			case BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION:
				setExcludeExpression((BooleanExpression)null);
				return;
			case BundlePackage.INCLUDED_FEATURE__ID:
				setId(ID_EDEFAULT);
				return;
			case BundlePackage.INCLUDED_FEATURE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case BundlePackage.INCLUDED_FEATURE__EXCLUDE_EXPRESSION:
				return excludeExpression != null;
			case BundlePackage.INCLUDED_FEATURE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BundlePackage.INCLUDED_FEATURE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //IncludedFeatureImpl
