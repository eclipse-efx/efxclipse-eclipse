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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl#getSimpleselectors <em>Simpleselectors</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.selectorImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class selectorImpl extends MinimalEObjectImpl.Container implements selector
{
  /**
   * The cached value of the '{@link #getSimpleselectors() <em>Simpleselectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleselectors()
   * @generated
   * @ordered
   */
  protected EList<simple_selector> simpleselectors;

  /**
   * The default value of the '{@link #getCombinator() <em>Combinator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCombinator()
   * @generated
   * @ordered
   */
  protected static final String COMBINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCombinator() <em>Combinator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCombinator()
   * @generated
   * @ordered
   */
  protected String combinator = COMBINATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected selector selector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected selectorImpl()
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
    return CssDslPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<simple_selector> getSimpleselectors()
  {
    if (simpleselectors == null)
    {
      simpleselectors = new EObjectContainmentEList<simple_selector>(simple_selector.class, this, CssDslPackage.SELECTOR__SIMPLESELECTORS);
    }
    return simpleselectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCombinator()
  {
    return combinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCombinator(String newCombinator)
  {
    String oldCombinator = combinator;
    combinator = newCombinator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SELECTOR__COMBINATOR, oldCombinator, combinator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(selector newSelector, NotificationChain msgs)
  {
    selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.SELECTOR__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.SELECTOR__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.SELECTOR__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SELECTOR__SELECTOR, newSelector, newSelector));
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
      case CssDslPackage.SELECTOR__SIMPLESELECTORS:
        return ((InternalEList<?>)getSimpleselectors()).basicRemove(otherEnd, msgs);
      case CssDslPackage.SELECTOR__SELECTOR:
        return basicSetSelector(null, msgs);
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
      case CssDslPackage.SELECTOR__SIMPLESELECTORS:
        return getSimpleselectors();
      case CssDslPackage.SELECTOR__COMBINATOR:
        return getCombinator();
      case CssDslPackage.SELECTOR__SELECTOR:
        return getSelector();
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
      case CssDslPackage.SELECTOR__SIMPLESELECTORS:
        getSimpleselectors().clear();
        getSimpleselectors().addAll((Collection<? extends simple_selector>)newValue);
        return;
      case CssDslPackage.SELECTOR__COMBINATOR:
        setCombinator((String)newValue);
        return;
      case CssDslPackage.SELECTOR__SELECTOR:
        setSelector((selector)newValue);
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
      case CssDslPackage.SELECTOR__SIMPLESELECTORS:
        getSimpleselectors().clear();
        return;
      case CssDslPackage.SELECTOR__COMBINATOR:
        setCombinator(COMBINATOR_EDEFAULT);
        return;
      case CssDslPackage.SELECTOR__SELECTOR:
        setSelector((selector)null);
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
      case CssDslPackage.SELECTOR__SIMPLESELECTORS:
        return simpleselectors != null && !simpleselectors.isEmpty();
      case CssDslPackage.SELECTOR__COMBINATOR:
        return COMBINATOR_EDEFAULT == null ? combinator != null : !COMBINATOR_EDEFAULT.equals(combinator);
      case CssDslPackage.SELECTOR__SELECTOR:
        return selector != null;
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
    result.append(" (combinator: ");
    result.append(combinator);
    result.append(')');
    return result.toString();
  }

} //selectorImpl
