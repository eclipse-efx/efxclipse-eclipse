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

import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl#getStaticCallProperties <em>Static Call Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeValuePropertyImpl extends SingleValuePropertyImpl implements IncludeValueProperty
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ComponentDefinition source;

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
  protected IncludeValuePropertyImpl()
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
    return FXGraphPackage.Literals.INCLUDE_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (ComponentDefinition)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ComponentDefinition newSource)
  {
    ComponentDefinition oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE, oldSource, source));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.INCLUDE_VALUE_PROPERTY__NAME, oldName, name));
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
      staticProperties = new EObjectContainmentEList<StaticValueProperty>(StaticValueProperty.class, this, FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES);
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
      staticCallProperties = new EObjectContainmentEList<StaticCallValueProperty>(StaticCallValueProperty.class, this, FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES);
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
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return ((InternalEList<?>)getStaticProperties()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
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
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__NAME:
        return getName();
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return getStaticProperties();
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
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
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE:
        setSource((ComponentDefinition)newValue);
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES:
        getStaticProperties().clear();
        getStaticProperties().addAll((Collection<? extends StaticValueProperty>)newValue);
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
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
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE:
        setSource((ComponentDefinition)null);
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES:
        getStaticProperties().clear();
        return;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
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
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__SOURCE:
        return source != null;
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES:
        return staticProperties != null && !staticProperties.isEmpty();
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES:
        return staticCallProperties != null && !staticCallProperties.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IncludeValuePropertyImpl
