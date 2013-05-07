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
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Import;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Css Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CssExtensionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CssExtensionImpl#getPackageDef <em>Package Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CssExtensionImpl extends MinimalEObjectImpl.Container implements CssExtension
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getPackageDef() <em>Package Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageDef()
   * @generated
   * @ordered
   */
  protected PackageDefinition packageDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CssExtensionImpl()
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
    return CssExtDslPackage.Literals.CSS_EXTENSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, CssExtDslPackage.CSS_EXTENSION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDefinition getPackageDef()
  {
    return packageDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackageDef(PackageDefinition newPackageDef, NotificationChain msgs)
  {
    PackageDefinition oldPackageDef = packageDef;
    packageDef = newPackageDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF, oldPackageDef, newPackageDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageDef(PackageDefinition newPackageDef)
  {
    if (newPackageDef != packageDef)
    {
      NotificationChain msgs = null;
      if (packageDef != null)
        msgs = ((InternalEObject)packageDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF, null, msgs);
      if (newPackageDef != null)
        msgs = ((InternalEObject)newPackageDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF, null, msgs);
      msgs = basicSetPackageDef(newPackageDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF, newPackageDef, newPackageDef));
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
      case CssExtDslPackage.CSS_EXTENSION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF:
        return basicSetPackageDef(null, msgs);
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
      case CssExtDslPackage.CSS_EXTENSION__IMPORTS:
        return getImports();
      case CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF:
        return getPackageDef();
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
      case CssExtDslPackage.CSS_EXTENSION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF:
        setPackageDef((PackageDefinition)newValue);
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
      case CssExtDslPackage.CSS_EXTENSION__IMPORTS:
        getImports().clear();
        return;
      case CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF:
        setPackageDef((PackageDefinition)null);
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
      case CssExtDslPackage.CSS_EXTENSION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CssExtDslPackage.CSS_EXTENSION__PACKAGE_DEF:
        return packageDef != null;
    }
    return super.eIsSet(featureID);
  }

} //CssExtensionImpl
