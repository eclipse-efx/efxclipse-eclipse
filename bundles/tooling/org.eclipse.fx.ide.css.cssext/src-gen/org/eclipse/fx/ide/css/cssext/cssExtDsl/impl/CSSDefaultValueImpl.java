/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl#getIval <em>Ival</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl#getDval <em>Dval</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSDefaultValueImpl#getSval <em>Sval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSSDefaultValueImpl extends MinimalEObjectImpl.Container implements CSSDefaultValue
{
  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected CSSRule val;

  /**
   * The default value of the '{@link #getIval() <em>Ival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIval()
   * @generated
   * @ordered
   */
  protected static final int IVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIval() <em>Ival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIval()
   * @generated
   * @ordered
   */
  protected int ival = IVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getDval() <em>Dval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDval()
   * @generated
   * @ordered
   */
  protected static final double DVAL_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDval() <em>Dval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDval()
   * @generated
   * @ordered
   */
  protected double dval = DVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSval() <em>Sval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSval()
   * @generated
   * @ordered
   */
  protected static final String SVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSval() <em>Sval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSval()
   * @generated
   * @ordered
   */
  protected String sval = SVAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSDefaultValueImpl()
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
    return CssExtDslPackage.Literals.CSS_DEFAULT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSRule getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(CSSRule newVal, NotificationChain msgs)
  {
    CSSRule oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_DEFAULT_VALUE__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(CSSRule newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_DEFAULT_VALUE__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.CSS_DEFAULT_VALUE__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_DEFAULT_VALUE__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIval()
  {
    return ival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIval(int newIval)
  {
    int oldIval = ival;
    ival = newIval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_DEFAULT_VALUE__IVAL, oldIval, ival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDval()
  {
    return dval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDval(double newDval)
  {
    double oldDval = dval;
    dval = newDval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_DEFAULT_VALUE__DVAL, oldDval, dval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSval()
  {
    return sval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSval(String newSval)
  {
    String oldSval = sval;
    sval = newSval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.CSS_DEFAULT_VALUE__SVAL, oldSval, sval));
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
      case CssExtDslPackage.CSS_DEFAULT_VALUE__VAL:
        return basicSetVal(null, msgs);
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
      case CssExtDslPackage.CSS_DEFAULT_VALUE__VAL:
        return getVal();
      case CssExtDslPackage.CSS_DEFAULT_VALUE__IVAL:
        return getIval();
      case CssExtDslPackage.CSS_DEFAULT_VALUE__DVAL:
        return getDval();
      case CssExtDslPackage.CSS_DEFAULT_VALUE__SVAL:
        return getSval();
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
      case CssExtDslPackage.CSS_DEFAULT_VALUE__VAL:
        setVal((CSSRule)newValue);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__IVAL:
        setIval((Integer)newValue);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__DVAL:
        setDval((Double)newValue);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__SVAL:
        setSval((String)newValue);
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
      case CssExtDslPackage.CSS_DEFAULT_VALUE__VAL:
        setVal((CSSRule)null);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__IVAL:
        setIval(IVAL_EDEFAULT);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__DVAL:
        setDval(DVAL_EDEFAULT);
        return;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__SVAL:
        setSval(SVAL_EDEFAULT);
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
      case CssExtDslPackage.CSS_DEFAULT_VALUE__VAL:
        return val != null;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__IVAL:
        return ival != IVAL_EDEFAULT;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__DVAL:
        return dval != DVAL_EDEFAULT;
      case CssExtDslPackage.CSS_DEFAULT_VALUE__SVAL:
        return SVAL_EDEFAULT == null ? sval != null : !SVAL_EDEFAULT.equals(sval);
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
    result.append(" (ival: ");
    result.append(ival);
    result.append(", dval: ");
    result.append(dval);
    result.append(", sval: ");
    result.append(sval);
    result.append(')');
    return result.toString();
  }

} //CSSDefaultValueImpl
