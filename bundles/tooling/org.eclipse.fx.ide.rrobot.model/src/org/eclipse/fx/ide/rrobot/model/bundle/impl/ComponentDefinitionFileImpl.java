/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile;

import org.eclipse.fx.ide.rrobot.model.bundle.ComponentReference;
import org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentDefinitionFileImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentDefinitionFileImpl#getComponentClass <em>Component Class</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentDefinitionFileImpl#getServiceInterfaceList <em>Service Interface List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.impl.ComponentDefinitionFileImpl#getReferenceList <em>Reference List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentDefinitionFileImpl extends TemplatedFileImpl implements ComponentDefinitionFile {
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
	 * The default value of the '{@link #getComponentClass() <em>Component Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComponentClass() <em>Component Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentClass()
	 * @generated
	 * @ordered
	 */
	protected String componentClass = COMPONENT_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceInterfaceList() <em>Service Interface List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceInterfaceList;

	/**
	 * The cached value of the '{@link #getReferenceList() <em>Reference List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceList()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentReference> referenceList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ComponentDefinitionFileImpl() {
		super();
		setGeneratorType("ds-component-xml");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.COMPONENT_DEFINITION_FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_DEFINITION_FILE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentClass() {
		return componentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentClass(String newComponentClass) {
		String oldComponentClass = componentClass;
		componentClass = newComponentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.COMPONENT_DEFINITION_FILE__COMPONENT_CLASS, oldComponentClass, componentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceInterfaceList() {
		if (serviceInterfaceList == null) {
			serviceInterfaceList = new EDataTypeUniqueEList<String>(String.class, this, BundlePackage.COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST);
		}
		return serviceInterfaceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentReference> getReferenceList() {
		if (referenceList == null) {
			referenceList = new EObjectContainmentEList<ComponentReference>(ComponentReference.class, this, BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST);
		}
		return referenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST:
				return ((InternalEList<?>)getReferenceList()).basicRemove(otherEnd, msgs);
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
			case BundlePackage.COMPONENT_DEFINITION_FILE__ID:
				return getId();
			case BundlePackage.COMPONENT_DEFINITION_FILE__COMPONENT_CLASS:
				return getComponentClass();
			case BundlePackage.COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST:
				return getServiceInterfaceList();
			case BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST:
				return getReferenceList();
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
			case BundlePackage.COMPONENT_DEFINITION_FILE__ID:
				setId((String)newValue);
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__COMPONENT_CLASS:
				setComponentClass((String)newValue);
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST:
				getServiceInterfaceList().clear();
				getServiceInterfaceList().addAll((Collection<? extends String>)newValue);
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST:
				getReferenceList().clear();
				getReferenceList().addAll((Collection<? extends ComponentReference>)newValue);
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
			case BundlePackage.COMPONENT_DEFINITION_FILE__ID:
				setId(ID_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__COMPONENT_CLASS:
				setComponentClass(COMPONENT_CLASS_EDEFAULT);
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST:
				getServiceInterfaceList().clear();
				return;
			case BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST:
				getReferenceList().clear();
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
			case BundlePackage.COMPONENT_DEFINITION_FILE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BundlePackage.COMPONENT_DEFINITION_FILE__COMPONENT_CLASS:
				return COMPONENT_CLASS_EDEFAULT == null ? componentClass != null : !COMPONENT_CLASS_EDEFAULT.equals(componentClass);
			case BundlePackage.COMPONENT_DEFINITION_FILE__SERVICE_INTERFACE_LIST:
				return serviceInterfaceList != null && !serviceInterfaceList.isEmpty();
			case BundlePackage.COMPONENT_DEFINITION_FILE__REFERENCE_LIST:
				return referenceList != null && !referenceList.isEmpty();
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
		result.append(", componentClass: ");
		result.append(componentClass);
		result.append(", serviceInterfaceList: ");
		result.append(serviceInterfaceList);
		result.append(')');
		return result.toString();
	}

} //ComponentDefinitionFileImpl
