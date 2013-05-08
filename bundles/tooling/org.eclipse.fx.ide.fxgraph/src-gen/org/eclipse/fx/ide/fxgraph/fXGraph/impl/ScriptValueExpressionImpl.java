/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Value Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueExpressionImpl#getSourcecode <em>Sourcecode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptValueExpressionImpl extends SingleValuePropertyImpl implements ScriptValueExpression
{
  /**
   * The default value of the '{@link #getSourcecode() <em>Sourcecode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcecode()
   * @generated
   * @ordered
   */
  protected static final String SOURCECODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourcecode() <em>Sourcecode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcecode()
   * @generated
   * @ordered
   */
  protected String sourcecode = SOURCECODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptValueExpressionImpl()
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
    return FXGraphPackage.Literals.SCRIPT_VALUE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourcecode()
  {
    return sourcecode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcecode(String newSourcecode)
  {
    String oldSourcecode = sourcecode;
    sourcecode = newSourcecode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SCRIPT_VALUE_EXPRESSION__SOURCECODE, oldSourcecode, sourcecode));
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
      case FXGraphPackage.SCRIPT_VALUE_EXPRESSION__SOURCECODE:
        return getSourcecode();
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
      case FXGraphPackage.SCRIPT_VALUE_EXPRESSION__SOURCECODE:
        setSourcecode((String)newValue);
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
      case FXGraphPackage.SCRIPT_VALUE_EXPRESSION__SOURCECODE:
        setSourcecode(SOURCECODE_EDEFAULT);
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
      case FXGraphPackage.SCRIPT_VALUE_EXPRESSION__SOURCECODE:
        return SOURCECODE_EDEFAULT == null ? sourcecode != null : !SOURCECODE_EDEFAULT.equals(sourcecode);
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
    result.append(" (sourcecode: ");
    result.append(sourcecode);
    result.append(')');
    return result.toString();
  }

} //ScriptValueExpressionImpl
