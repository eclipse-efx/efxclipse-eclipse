/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl#getRealValue <em>Real Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleValuePropertyImpl extends SingleValuePropertyImpl implements SimpleValueProperty
{
  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected static final String BOOLEAN_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected String booleanValue = BOOLEAN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected boolean negative = NEGATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getRealValue() <em>Real Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealValue()
   * @generated
   * @ordered
   */
  protected static final double REAL_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getRealValue() <em>Real Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealValue()
   * @generated
   * @ordered
   */
  protected double realValue = REAL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleValuePropertyImpl()
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
    return FXGraphPackage.Literals.SIMPLE_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SIMPLE_VALUE_PROPERTY__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanValue(String newBooleanValue)
  {
    String oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegative()
  {
    return negative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegative(boolean newNegative)
  {
    boolean oldNegative = negative;
    negative = newNegative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SIMPLE_VALUE_PROPERTY__NEGATIVE, oldNegative, negative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SIMPLE_VALUE_PROPERTY__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getRealValue()
  {
    return realValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealValue(double newRealValue)
  {
    double oldRealValue = realValue;
    realValue = newRealValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SIMPLE_VALUE_PROPERTY__REAL_VALUE, oldRealValue, realValue));
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
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__STRING_VALUE:
        return getStringValue();
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE:
        return getBooleanValue();
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__NEGATIVE:
        return isNegative();
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__INT_VALUE:
        return getIntValue();
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__REAL_VALUE:
        return getRealValue();
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
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE:
        setBooleanValue((String)newValue);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__NEGATIVE:
        setNegative((Boolean)newValue);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__REAL_VALUE:
        setRealValue((Double)newValue);
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
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE:
        setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__NEGATIVE:
        setNegative(NEGATIVE_EDEFAULT);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__REAL_VALUE:
        setRealValue(REAL_VALUE_EDEFAULT);
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
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE:
        return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__NEGATIVE:
        return negative != NEGATIVE_EDEFAULT;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY__REAL_VALUE:
        return realValue != REAL_VALUE_EDEFAULT;
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
    result.append(" (stringValue: ");
    result.append(stringValue);
    result.append(", booleanValue: ");
    result.append(booleanValue);
    result.append(", negative: ");
    result.append(negative);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", realValue: ");
    result.append(realValue);
    result.append(')');
    return result.toString();
  }

} //SimpleValuePropertyImpl
