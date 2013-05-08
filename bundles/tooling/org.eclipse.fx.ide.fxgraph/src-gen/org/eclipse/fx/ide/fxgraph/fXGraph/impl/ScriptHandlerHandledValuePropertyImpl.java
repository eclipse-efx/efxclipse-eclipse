/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Handler Handled Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl#getFunctionname <em>Functionname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptHandlerHandledValuePropertyImpl extends SingleValuePropertyImpl implements ScriptHandlerHandledValueProperty
{
  /**
   * The default value of the '{@link #getFunctionname() <em>Functionname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionname()
   * @generated
   * @ordered
   */
  protected static final String FUNCTIONNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionname() <em>Functionname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionname()
   * @generated
   * @ordered
   */
  protected String functionname = FUNCTIONNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptHandlerHandledValuePropertyImpl()
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
    return FXGraphPackage.Literals.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunctionname()
  {
    return functionname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionname(String newFunctionname)
  {
    String oldFunctionname = functionname;
    functionname = newFunctionname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME, oldFunctionname, functionname));
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
      case FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME:
        return getFunctionname();
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
      case FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME:
        setFunctionname((String)newValue);
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
      case FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME:
        setFunctionname(FUNCTIONNAME_EDEFAULT);
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
      case FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME:
        return FUNCTIONNAME_EDEFAULT == null ? functionname != null : !FUNCTIONNAME_EDEFAULT.equals(functionname);
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
    result.append(" (functionname: ");
    result.append(functionname);
    result.append(')');
    return result.toString();
  }

} //ScriptHandlerHandledValuePropertyImpl
