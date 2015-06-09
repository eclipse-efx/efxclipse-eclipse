/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

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

import org.eclipse.fx.ide.l10n.nLSDsl.NLS;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NLS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSImpl#getBundleList <em>Bundle List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NLSImpl extends MinimalEObjectImpl.Container implements NLS
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected PackageDeclaration package_;

  /**
   * The cached value of the '{@link #getBundleList() <em>Bundle List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundleList()
   * @generated
   * @ordered
   */
  protected EList<NLSBundle> bundleList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NLSImpl()
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
    return NLSDslPackage.Literals.NLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(PackageDeclaration newPackage, NotificationChain msgs)
  {
    PackageDeclaration oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(PackageDeclaration newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NLSDslPackage.NLS__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NLSDslPackage.NLS__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NLSBundle> getBundleList()
  {
    if (bundleList == null)
    {
      bundleList = new EObjectContainmentEList<NLSBundle>(NLSBundle.class, this, NLSDslPackage.NLS__BUNDLE_LIST);
    }
    return bundleList;
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
      case NLSDslPackage.NLS__PACKAGE:
        return basicSetPackage(null, msgs);
      case NLSDslPackage.NLS__BUNDLE_LIST:
        return ((InternalEList<?>)getBundleList()).basicRemove(otherEnd, msgs);
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
      case NLSDslPackage.NLS__PACKAGE:
        return getPackage();
      case NLSDslPackage.NLS__BUNDLE_LIST:
        return getBundleList();
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
      case NLSDslPackage.NLS__PACKAGE:
        setPackage((PackageDeclaration)newValue);
        return;
      case NLSDslPackage.NLS__BUNDLE_LIST:
        getBundleList().clear();
        getBundleList().addAll((Collection<? extends NLSBundle>)newValue);
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
      case NLSDslPackage.NLS__PACKAGE:
        setPackage((PackageDeclaration)null);
        return;
      case NLSDslPackage.NLS__BUNDLE_LIST:
        getBundleList().clear();
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
      case NLSDslPackage.NLS__PACKAGE:
        return package_ != null;
      case NLSDslPackage.NLS__BUNDLE_LIST:
        return bundleList != null && !bundleList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NLSImpl
