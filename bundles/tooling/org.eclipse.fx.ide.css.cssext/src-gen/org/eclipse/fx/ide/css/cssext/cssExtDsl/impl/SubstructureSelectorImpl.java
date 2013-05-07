/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substructure Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureSelectorImpl#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.SubstructureSelectorImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstructureSelectorImpl extends MinimalEObjectImpl.Container implements SubstructureSelector
{
  /**
   * The default value of the '{@link #getSelectorName() <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorName()
   * @generated
   * @ordered
   */
  protected static final String SELECTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelectorName() <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorName()
   * @generated
   * @ordered
   */
  protected String selectorName = SELECTOR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstructureSelectorImpl()
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
    return CssExtDslPackage.Literals.SUBSTRUCTURE_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelectorName()
  {
    return selectorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectorName(String newSelectorName)
  {
    String oldSelectorName = selectorName;
    selectorName = newSelectorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE_SELECTOR__SELECTOR_NAME, oldSelectorName, selectorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.SUBSTRUCTURE_SELECTOR__VAR, oldVar, var));
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
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__SELECTOR_NAME:
        return getSelectorName();
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__VAR:
        return getVar();
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
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__SELECTOR_NAME:
        setSelectorName((String)newValue);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__VAR:
        setVar((String)newValue);
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
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__SELECTOR_NAME:
        setSelectorName(SELECTOR_NAME_EDEFAULT);
        return;
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__VAR:
        setVar(VAR_EDEFAULT);
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
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__SELECTOR_NAME:
        return SELECTOR_NAME_EDEFAULT == null ? selectorName != null : !SELECTOR_NAME_EDEFAULT.equals(selectorName);
      case CssExtDslPackage.SUBSTRUCTURE_SELECTOR__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
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
    result.append(" (selectorName: ");
    result.append(selectorName);
    result.append(", var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //SubstructureSelectorImpl
