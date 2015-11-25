/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.gmodel.gModelDSL.GDefault;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GDomain Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl#getBuiltIn <em>Built In</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl#isList <em>List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDomainPropertyImpl extends MinimalEObjectImpl.Container implements GDomainProperty
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
   * The default value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isList()
   * @generated
   * @ordered
   */
  protected boolean list = LIST_EDEFAULT;

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
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected GDefault defaultValue;

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
  protected GDomainPropertyImpl()
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
    return GModelDSLPackage.Literals.GDOMAIN_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__BUILT_IN, oldBuiltIn, builtIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(boolean newList)
  {
    boolean oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__LIST, oldList, list));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDefault getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(GDefault newDefaultValue, NotificationChain msgs)
  {
    GDefault oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(GDefault newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GModelDSLPackage.GDOMAIN_PROPERTY__REF, oldRef, ref));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDOMAIN_PROPERTY__REF, oldRef, ref));
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
      case GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
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
      case GModelDSLPackage.GDOMAIN_PROPERTY__BUILT_IN:
        return getBuiltIn();
      case GModelDSLPackage.GDOMAIN_PROPERTY__LIST:
        return isList();
      case GModelDSLPackage.GDOMAIN_PROPERTY__NAME:
        return getName();
      case GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE:
        return getDefaultValue();
      case GModelDSLPackage.GDOMAIN_PROPERTY__REF:
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
      case GModelDSLPackage.GDOMAIN_PROPERTY__BUILT_IN:
        setBuiltIn((String)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__LIST:
        setList((Boolean)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE:
        setDefaultValue((GDefault)newValue);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__REF:
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
      case GModelDSLPackage.GDOMAIN_PROPERTY__BUILT_IN:
        setBuiltIn(BUILT_IN_EDEFAULT);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__LIST:
        setList(LIST_EDEFAULT);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE:
        setDefaultValue((GDefault)null);
        return;
      case GModelDSLPackage.GDOMAIN_PROPERTY__REF:
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
      case GModelDSLPackage.GDOMAIN_PROPERTY__BUILT_IN:
        return BUILT_IN_EDEFAULT == null ? builtIn != null : !BUILT_IN_EDEFAULT.equals(builtIn);
      case GModelDSLPackage.GDOMAIN_PROPERTY__LIST:
        return list != LIST_EDEFAULT;
      case GModelDSLPackage.GDOMAIN_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GModelDSLPackage.GDOMAIN_PROPERTY__DEFAULT_VALUE:
        return defaultValue != null;
      case GModelDSLPackage.GDOMAIN_PROPERTY__REF:
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
    result.append(", list: ");
    result.append(list);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GDomainPropertyImpl
