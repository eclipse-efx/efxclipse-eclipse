/**
 */
package org.eclipse.fx.ide.css.cssDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.PseudoClassFunction;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pseudo Class Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl#getParamSelector <em>Param Selector</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.PseudoClassFunctionImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PseudoClassFunctionImpl extends PseudoClassOrFuncImpl implements PseudoClassFunction
{
  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getParamSelector() <em>Param Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamSelector()
   * @generated
   * @ordered
   */
  protected SimpleSelectorForNegation paramSelector;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<CssTok> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PseudoClassFunctionImpl()
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
    return CssDslPackage.Literals.PSEUDO_CLASS_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.PSEUDO_CLASS_FUNCTION__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelectorForNegation getParamSelector()
  {
    return paramSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamSelector(SimpleSelectorForNegation newParamSelector, NotificationChain msgs)
  {
    SimpleSelectorForNegation oldParamSelector = paramSelector;
    paramSelector = newParamSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR, oldParamSelector, newParamSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamSelector(SimpleSelectorForNegation newParamSelector)
  {
    if (newParamSelector != paramSelector)
    {
      NotificationChain msgs = null;
      if (paramSelector != null)
        msgs = ((InternalEObject)paramSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR, null, msgs);
      if (newParamSelector != null)
        msgs = ((InternalEObject)newParamSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR, null, msgs);
      msgs = basicSetParamSelector(newParamSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR, newParamSelector, newParamSelector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.PSEUDO_CLASS_FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CssTok> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<CssTok>(CssTok.class, this, CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS);
    }
    return params;
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
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR:
        return basicSetParamSelector(null, msgs);
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NOT:
        return isNot();
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR:
        return getParamSelector();
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NAME:
        return getName();
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS:
        return getParams();
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
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NOT:
        setNot((Boolean)newValue);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR:
        setParamSelector((SimpleSelectorForNegation)newValue);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NAME:
        setName((String)newValue);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends CssTok>)newValue);
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
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR:
        setParamSelector((SimpleSelectorForNegation)null);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS:
        getParams().clear();
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
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NOT:
        return not != NOT_EDEFAULT;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAM_SELECTOR:
        return paramSelector != null;
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssDslPackage.PSEUDO_CLASS_FUNCTION__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (not: ");
    result.append(not);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PseudoClassFunctionImpl
