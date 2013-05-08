/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl#getIncludeElement <em>Include Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefineImpl extends MinimalEObjectImpl.Container implements Define
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Element element;

  /**
   * The cached value of the '{@link #getIncludeElement() <em>Include Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeElement()
   * @generated
   * @ordered
   */
  protected IncludeValueProperty includeElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineImpl()
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
    return FXGraphPackage.Literals.DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Element newElement, NotificationChain msgs)
  {
    Element oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.DEFINE__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Element newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.DEFINE__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.DEFINE__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.DEFINE__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeValueProperty getIncludeElement()
  {
    return includeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludeElement(IncludeValueProperty newIncludeElement, NotificationChain msgs)
  {
    IncludeValueProperty oldIncludeElement = includeElement;
    includeElement = newIncludeElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.DEFINE__INCLUDE_ELEMENT, oldIncludeElement, newIncludeElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeElement(IncludeValueProperty newIncludeElement)
  {
    if (newIncludeElement != includeElement)
    {
      NotificationChain msgs = null;
      if (includeElement != null)
        msgs = ((InternalEObject)includeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.DEFINE__INCLUDE_ELEMENT, null, msgs);
      if (newIncludeElement != null)
        msgs = ((InternalEObject)newIncludeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.DEFINE__INCLUDE_ELEMENT, null, msgs);
      msgs = basicSetIncludeElement(newIncludeElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.DEFINE__INCLUDE_ELEMENT, newIncludeElement, newIncludeElement));
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
      case FXGraphPackage.DEFINE__ELEMENT:
        return basicSetElement(null, msgs);
      case FXGraphPackage.DEFINE__INCLUDE_ELEMENT:
        return basicSetIncludeElement(null, msgs);
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
      case FXGraphPackage.DEFINE__ELEMENT:
        return getElement();
      case FXGraphPackage.DEFINE__INCLUDE_ELEMENT:
        return getIncludeElement();
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
      case FXGraphPackage.DEFINE__ELEMENT:
        setElement((Element)newValue);
        return;
      case FXGraphPackage.DEFINE__INCLUDE_ELEMENT:
        setIncludeElement((IncludeValueProperty)newValue);
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
      case FXGraphPackage.DEFINE__ELEMENT:
        setElement((Element)null);
        return;
      case FXGraphPackage.DEFINE__INCLUDE_ELEMENT:
        setIncludeElement((IncludeValueProperty)null);
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
      case FXGraphPackage.DEFINE__ELEMENT:
        return element != null;
      case FXGraphPackage.DEFINE__INCLUDE_ELEMENT:
        return includeElement != null;
    }
    return super.eIsSet(featureID);
  }

} //DefineImpl
