/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.l10n.nLSDsl.MessageParam;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl#getPredefined <em>Predefined</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.MessageParamImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageParamImpl extends MinimalEObjectImpl.Container implements MessageParam
{
  /**
   * The default value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected static final PredefinedTypes PREDEFINED_EDEFAULT = PredefinedTypes.ANY;

  /**
   * The cached value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected PredefinedTypes predefined = PREDEFINED_EDEFAULT;

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
  protected MessageParamImpl()
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
    return NLSDslPackage.Literals.MESSAGE_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredefinedTypes getPredefined()
  {
    return predefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefined(PredefinedTypes newPredefined)
  {
    PredefinedTypes oldPredefined = predefined;
    predefined = newPredefined == null ? PREDEFINED_EDEFAULT : newPredefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.MESSAGE_PARAM__PREDEFINED, oldPredefined, predefined));
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
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.MESSAGE_PARAM__VAR, oldVar, var));
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
      case NLSDslPackage.MESSAGE_PARAM__PREDEFINED:
        return getPredefined();
      case NLSDslPackage.MESSAGE_PARAM__VAR:
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
      case NLSDslPackage.MESSAGE_PARAM__PREDEFINED:
        setPredefined((PredefinedTypes)newValue);
        return;
      case NLSDslPackage.MESSAGE_PARAM__VAR:
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
      case NLSDslPackage.MESSAGE_PARAM__PREDEFINED:
        setPredefined(PREDEFINED_EDEFAULT);
        return;
      case NLSDslPackage.MESSAGE_PARAM__VAR:
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
      case NLSDslPackage.MESSAGE_PARAM__PREDEFINED:
        return predefined != PREDEFINED_EDEFAULT;
      case NLSDslPackage.MESSAGE_PARAM__VAR:
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
    result.append(" (predefined: ");
    result.append(predefined);
    result.append(", var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //MessageParamImpl
