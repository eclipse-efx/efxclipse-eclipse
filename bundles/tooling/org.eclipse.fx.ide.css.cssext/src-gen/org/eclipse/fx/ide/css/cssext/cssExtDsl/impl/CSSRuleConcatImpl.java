/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcat;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Rule Concat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSRuleConcatImpl#getConc <em>Conc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSSRuleConcatImpl extends CSSRuleImpl implements CSSRuleConcat
{
  /**
   * The cached value of the '{@link #getConc() <em>Conc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConc()
   * @generated
   * @ordered
   */
  protected EList<CSSRule> conc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSRuleConcatImpl()
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
    return CssExtDslPackage.Literals.CSS_RULE_CONCAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CSSRule> getConc()
  {
    if (conc == null)
    {
      conc = new EObjectContainmentEList<CSSRule>(CSSRule.class, this, CssExtDslPackage.CSS_RULE_CONCAT__CONC);
    }
    return conc;
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
      case CssExtDslPackage.CSS_RULE_CONCAT__CONC:
        return ((InternalEList<?>)getConc()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.CSS_RULE_CONCAT__CONC:
        return getConc();
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
      case CssExtDslPackage.CSS_RULE_CONCAT__CONC:
        getConc().clear();
        getConc().addAll((Collection<? extends CSSRule>)newValue);
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
      case CssExtDslPackage.CSS_RULE_CONCAT__CONC:
        getConc().clear();
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
      case CssExtDslPackage.CSS_RULE_CONCAT__CONC:
        return conc != null && !conc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CSSRuleConcatImpl
