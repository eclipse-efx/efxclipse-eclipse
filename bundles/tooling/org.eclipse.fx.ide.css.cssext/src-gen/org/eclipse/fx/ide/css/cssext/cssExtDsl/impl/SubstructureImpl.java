/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Substructure;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureImpl#getChilds <em>Childs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstructureImpl extends MinimalEObjectImpl.Container implements Substructure
{
  /**
   * The cached value of the '{@link #getDoku() <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoku()
   * @generated
   * @ordered
   */
  protected Doku doku;

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
   * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChilds()
   * @generated
   * @ordered
   */
  protected EList<SubstructureStyleclass> childs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstructureImpl()
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
    return CssExtDslPackage.Literals.SUBSTRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku getDoku()
  {
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoku(Doku newDoku, NotificationChain msgs)
  {
    Doku oldDoku = doku;
    doku = newDoku;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE__DOKU, oldDoku, newDoku);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoku(Doku newDoku)
  {
    if (newDoku != doku)
    {
      NotificationChain msgs = null;
      if (doku != null)
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.SUBSTRUCTURE__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.SUBSTRUCTURE__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE__DOKU, newDoku, newDoku));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubstructureStyleclass> getChilds()
  {
    if (childs == null)
    {
      childs = new EObjectContainmentEList<SubstructureStyleclass>(SubstructureStyleclass.class, this, CssExtDslPackage.SUBSTRUCTURE__CHILDS);
    }
    return childs;
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
      case CssExtDslPackage.SUBSTRUCTURE__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.SUBSTRUCTURE__CHILDS:
        return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.SUBSTRUCTURE__DOKU:
        return getDoku();
      case CssExtDslPackage.SUBSTRUCTURE__NAME:
        return getName();
      case CssExtDslPackage.SUBSTRUCTURE__CHILDS:
        return getChilds();
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
      case CssExtDslPackage.SUBSTRUCTURE__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE__NAME:
        setName((String)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE__CHILDS:
        getChilds().clear();
        getChilds().addAll((Collection<? extends SubstructureStyleclass>)newValue);
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
      case CssExtDslPackage.SUBSTRUCTURE__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.SUBSTRUCTURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssExtDslPackage.SUBSTRUCTURE__CHILDS:
        getChilds().clear();
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
      case CssExtDslPackage.SUBSTRUCTURE__DOKU:
        return doku != null;
      case CssExtDslPackage.SUBSTRUCTURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssExtDslPackage.SUBSTRUCTURE__CHILDS:
        return childs != null && !childs.isEmpty();
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

} //SubstructureImpl
