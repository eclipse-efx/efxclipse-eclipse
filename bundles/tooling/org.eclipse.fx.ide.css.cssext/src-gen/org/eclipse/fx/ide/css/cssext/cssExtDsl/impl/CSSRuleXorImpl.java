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
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleXor;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSS Rule Xor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.CSSRuleXorImpl#getXors <em>Xors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSSRuleXorImpl extends CSSRuleImpl implements CSSRuleXor
{
  /**
   * The cached value of the '{@link #getXors() <em>Xors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXors()
   * @generated
   * @ordered
   */
  protected EList<CSSRule> xors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSRuleXorImpl()
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
    return CssExtDslPackage.Literals.CSS_RULE_XOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CSSRule> getXors()
  {
    if (xors == null)
    {
      xors = new EObjectContainmentEList<CSSRule>(CSSRule.class, this, CssExtDslPackage.CSS_RULE_XOR__XORS);
    }
    return xors;
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
      case CssExtDslPackage.CSS_RULE_XOR__XORS:
        return ((InternalEList<?>)getXors()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.CSS_RULE_XOR__XORS:
        return getXors();
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
      case CssExtDslPackage.CSS_RULE_XOR__XORS:
        getXors().clear();
        getXors().addAll((Collection<? extends CSSRule>)newValue);
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
      case CssExtDslPackage.CSS_RULE_XOR__XORS:
        getXors().clear();
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
      case CssExtDslPackage.CSS_RULE_XOR__XORS:
        return xors != null && !xors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CSSRuleXorImpl
