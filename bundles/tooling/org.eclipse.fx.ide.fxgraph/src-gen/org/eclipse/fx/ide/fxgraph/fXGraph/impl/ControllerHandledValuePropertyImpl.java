/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Handled Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl#getMethodname <em>Methodname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerHandledValuePropertyImpl extends SingleValuePropertyImpl implements ControllerHandledValueProperty
{
  /**
   * The default value of the '{@link #getMethodname() <em>Methodname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodname()
   * @generated
   * @ordered
   */
  protected static final String METHODNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodname() <em>Methodname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodname()
   * @generated
   * @ordered
   */
  protected String methodname = METHODNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControllerHandledValuePropertyImpl()
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
    return FXGraphPackage.Literals.CONTROLLER_HANDLED_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodname()
  {
    return methodname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodname(String newMethodname)
  {
    String oldMethodname = methodname;
    methodname = newMethodname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME, oldMethodname, methodname));
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
      case FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME:
        return getMethodname();
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
      case FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME:
        setMethodname((String)newValue);
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
      case FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME:
        setMethodname(METHODNAME_EDEFAULT);
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
      case FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME:
        return METHODNAME_EDEFAULT == null ? methodname != null : !METHODNAME_EDEFAULT.equals(methodname);
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
    result.append(" (methodname: ");
    result.append(methodname);
    result.append(')');
    return result.toString();
  }

} //ControllerHandledValuePropertyImpl
