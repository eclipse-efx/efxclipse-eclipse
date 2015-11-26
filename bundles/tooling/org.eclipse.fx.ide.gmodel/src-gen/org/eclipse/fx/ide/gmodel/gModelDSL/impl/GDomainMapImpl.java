/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GDomain Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainMapImpl#getBuiltIn <em>Built In</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainMapImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDomainMapImpl extends MinimalEObjectImpl.Container implements GDomainMap
{
  /**
   * The default value of the '{@link #getBuiltIn() <em>Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltIn()
   * @generated
   * @ordered
   */
  protected static final String BUILT_IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuiltIn() <em>Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltIn()
   * @generated
   * @ordered
   */
  protected String builtIn = BUILT_IN_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected GDomainElement ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GDomainMapImpl()
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
    return GModelDSLPackage.Literals.GDOMAIN_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuiltIn()
  {
    return builtIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltIn(String newBuiltIn)
  {
    String oldBuiltIn = builtIn;
    builtIn = newBuiltIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_MAP__BUILT_IN, oldBuiltIn, builtIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDomainElement getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (GDomainElement)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GModelDSLPackage.GDOMAIN_MAP__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDomainElement basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(GDomainElement newRef)
  {
    GDomainElement oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_MAP__REF, oldRef, ref));
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
      case GModelDSLPackage.GDOMAIN_MAP__BUILT_IN:
        return getBuiltIn();
      case GModelDSLPackage.GDOMAIN_MAP__REF:
        if (resolve) return getRef();
        return basicGetRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GModelDSLPackage.GDOMAIN_MAP__BUILT_IN:
        setBuiltIn((String)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_MAP__REF:
        setRef((GDomainElement)newValue);
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
      case GModelDSLPackage.GDOMAIN_MAP__BUILT_IN:
        setBuiltIn(BUILT_IN_EDEFAULT);
        return;
      case GModelDSLPackage.GDOMAIN_MAP__REF:
        setRef((GDomainElement)null);
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
      case GModelDSLPackage.GDOMAIN_MAP__BUILT_IN:
        return BUILT_IN_EDEFAULT == null ? builtIn != null : !BUILT_IN_EDEFAULT.equals(builtIn);
      case GModelDSLPackage.GDOMAIN_MAP__REF:
        return ref != null;
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
    result.append(" (builtIn: ");
    result.append(builtIn);
    result.append(')');
    return result.toString();
  }

} //GDomainMapImpl
