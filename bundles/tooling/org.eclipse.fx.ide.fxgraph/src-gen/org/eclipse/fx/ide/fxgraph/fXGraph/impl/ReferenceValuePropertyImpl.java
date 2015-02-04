/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceType;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl#getStaticCallProperties <em>Static Call Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceValuePropertyImpl extends SingleValuePropertyImpl implements ReferenceValueProperty
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected ReferenceType reference;

  /**
   * The cached value of the '{@link #getStaticProperties() <em>Static Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticProperties()
   * @generated
   * @ordered
   */
  protected EList<StaticValueProperty> staticProperties;

  /**
   * The cached value of the '{@link #getStaticCallProperties() <em>Static Call Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticCallProperties()
   * @generated
   * @ordered
   */
  protected EList<StaticCallValueProperty> staticCallProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceValuePropertyImpl()
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
    return FXGraphPackage.Literals.REFERENCE_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (ReferenceType)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(ReferenceType newReference)
  {
    ReferenceType oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StaticValueProperty> getStaticProperties()
  {
    if (staticProperties == null)
    {
      staticProperties = new EObjectContainmentEList<StaticValueProperty>(StaticValueProperty.class, this, FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES);
    }
    return staticProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StaticCallValueProperty> getStaticCallProperties()
  {
    if (staticCallProperties == null)
    {
      staticCallProperties = new EObjectContainmentEList<StaticCallValueProperty>(StaticCallValueProperty.class, this, FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES);
    }
    return staticCallProperties;
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
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return ((InternalEList<?>)getStaticProperties()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        return ((InternalEList<?>)getStaticCallProperties()).basicRemove(otherEnd, msgs);
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
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return getStaticProperties();
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        return getStaticCallProperties();
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
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE:
        setReference((ReferenceType)newValue);
        return;
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES:
        getStaticProperties().clear();
        getStaticProperties().addAll((Collection<? extends StaticValueProperty>)newValue);
        return;
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        getStaticCallProperties().clear();
        getStaticCallProperties().addAll((Collection<? extends StaticCallValueProperty>)newValue);
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
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE:
        setReference((ReferenceType)null);
        return;
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES:
        getStaticProperties().clear();
        return;
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        getStaticCallProperties().clear();
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
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__REFERENCE:
        return reference != null;
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return staticProperties != null && !staticProperties.isEmpty();
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        return staticCallProperties != null && !staticCallProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReferenceValuePropertyImpl
