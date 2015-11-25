/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.gmodel.gModelDSL.GDefault;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GDefault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl#getStringVal <em>String Val</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl#getIntVal <em>Int Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDefaultImpl extends MinimalEObjectImpl.Container implements GDefault
{
  /**
   * The default value of the '{@link #getStringVal() <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringVal()
   * @generated
   * @ordered
   */
  protected static final String STRING_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringVal() <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringVal()
   * @generated
   * @ordered
   */
  protected String stringVal = STRING_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected static final int INT_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected int intVal = INT_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GDefaultImpl()
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
    return GModelDSLPackage.Literals.GDEFAULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringVal()
  {
    return stringVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringVal(String newStringVal)
  {
    String oldStringVal = stringVal;
    stringVal = newStringVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDEFAULT__STRING_VAL, oldStringVal, stringVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntVal()
  {
    return intVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntVal(int newIntVal)
  {
    int oldIntVal = intVal;
    intVal = newIntVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GModelDSLPackage.GDEFAULT__INT_VAL, oldIntVal, intVal));
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
      case GModelDSLPackage.GDEFAULT__STRING_VAL:
        return getStringVal();
      case GModelDSLPackage.GDEFAULT__INT_VAL:
        return getIntVal();
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
      case GModelDSLPackage.GDEFAULT__STRING_VAL:
        setStringVal((String)newValue);
        return;
      case GModelDSLPackage.GDEFAULT__INT_VAL:
        setIntVal((Integer)newValue);
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
      case GModelDSLPackage.GDEFAULT__STRING_VAL:
        setStringVal(STRING_VAL_EDEFAULT);
        return;
      case GModelDSLPackage.GDEFAULT__INT_VAL:
        setIntVal(INT_VAL_EDEFAULT);
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
      case GModelDSLPackage.GDEFAULT__STRING_VAL:
        return STRING_VAL_EDEFAULT == null ? stringVal != null : !STRING_VAL_EDEFAULT.equals(stringVal);
      case GModelDSLPackage.GDEFAULT__INT_VAL:
        return intVal != INT_VAL_EDEFAULT;
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
    result.append(" (stringVal: ");
    result.append(stringVal);
    result.append(", intVal: ");
    result.append(intVal);
    result.append(')');
    return result.toString();
  }

} //GDefaultImpl
