/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GDomain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl#getSuperTypeList <em>Super Type List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl#getPropertyList <em>Property List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDomainElementImpl extends MinimalEObjectImpl.Container implements GDomainElement
{
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
   * The cached value of the '{@link #getSuperTypeList() <em>Super Type List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTypeList()
   * @generated
   * @ordered
   */
  protected EList<GDomainElement> superTypeList;

  /**
   * The cached value of the '{@link #getPropertyList() <em>Property List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyList()
   * @generated
   * @ordered
   */
  protected EList<GDomainProperty> propertyList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GDomainElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GModelDSLPackage.Literals.GDOMAIN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GDomainElement> getSuperTypeList()
  {
    if (superTypeList == null)
    {
      superTypeList = new EObjectResolvingEList<GDomainElement>(GDomainElement.class, this, GModelDSLPackage.GDOMAIN_ELEMENT__SUPER_TYPE_LIST);
    }
    return superTypeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GDomainProperty> getPropertyList()
  {
    if (propertyList == null)
    {
      propertyList = new EObjectContainmentEList<GDomainProperty>(GDomainProperty.class, this, GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST);
    }
    return propertyList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST:
        return ((InternalEList<?>)getPropertyList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_ELEMENT__NAME:
        return getName();
      case GModelDSLPackage.GDOMAIN_ELEMENT__SUPER_TYPE_LIST:
        return getSuperTypeList();
      case GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST:
        return getPropertyList();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_ELEMENT__SUPER_TYPE_LIST:
        getSuperTypeList().clear();
        getSuperTypeList().addAll((Collection<? extends GDomainElement>)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST:
        getPropertyList().clear();
        getPropertyList().addAll((Collection<? extends GDomainProperty>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GModelDSLPackage.GDOMAIN_ELEMENT__SUPER_TYPE_LIST:
        getSuperTypeList().clear();
        return;
      case GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST:
        getPropertyList().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GModelDSLPackage.GDOMAIN_ELEMENT__SUPER_TYPE_LIST:
        return superTypeList != null && !superTypeList.isEmpty();
      case GModelDSLPackage.GDOMAIN_ELEMENT__PROPERTY_LIST:
        return propertyList != null && !propertyList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GDomainElementImpl
