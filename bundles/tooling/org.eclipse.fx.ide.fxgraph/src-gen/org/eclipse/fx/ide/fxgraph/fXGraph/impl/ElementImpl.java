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

import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getStaticProperties <em>Static Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getStaticCallProperties <em>Static Call Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getDefaultChildren <em>Default Children</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends SingleValuePropertyImpl implements Element
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SimpleValueProperty value;

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
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

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
   * The cached value of the '{@link #getDefaultChildren() <em>Default Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultChildren()
   * @generated
   * @ordered
   */
  protected EList<Element> defaultChildren;

  /**
   * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactory()
   * @generated
   * @ordered
   */
  protected static final String FACTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactory() <em>Factory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactory()
   * @generated
   * @ordered
   */
  protected String factory = FACTORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<FactoryValueElement> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
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
    return FXGraphPackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.ELEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.ELEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleValueProperty getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(SimpleValueProperty newValue, NotificationChain msgs)
  {
    SimpleValueProperty oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SimpleValueProperty newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.ELEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXGraphPackage.ELEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__VALUE, newValue, newValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, FXGraphPackage.ELEMENT__PROPERTIES);
    }
    return properties;
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
      staticProperties = new EObjectContainmentEList<StaticValueProperty>(StaticValueProperty.class, this, FXGraphPackage.ELEMENT__STATIC_PROPERTIES);
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
      staticCallProperties = new EObjectContainmentEList<StaticCallValueProperty>(StaticCallValueProperty.class, this, FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES);
    }
    return staticCallProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getDefaultChildren()
  {
    if (defaultChildren == null)
    {
      defaultChildren = new EObjectContainmentEList<Element>(Element.class, this, FXGraphPackage.ELEMENT__DEFAULT_CHILDREN);
    }
    return defaultChildren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactory()
  {
    return factory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactory(String newFactory)
  {
    String oldFactory = factory;
    factory = newFactory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.ELEMENT__FACTORY, oldFactory, factory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FactoryValueElement> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<FactoryValueElement>(FactoryValueElement.class, this, FXGraphPackage.ELEMENT__VALUES);
    }
    return values;
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
      case FXGraphPackage.ELEMENT__TYPE:
        return basicSetType(null, msgs);
      case FXGraphPackage.ELEMENT__VALUE:
        return basicSetValue(null, msgs);
      case FXGraphPackage.ELEMENT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.ELEMENT__STATIC_PROPERTIES:
        return ((InternalEList<?>)getStaticProperties()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES:
        return ((InternalEList<?>)getStaticCallProperties()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.ELEMENT__DEFAULT_CHILDREN:
        return ((InternalEList<?>)getDefaultChildren()).basicRemove(otherEnd, msgs);
      case FXGraphPackage.ELEMENT__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case FXGraphPackage.ELEMENT__TYPE:
        return getType();
      case FXGraphPackage.ELEMENT__VALUE:
        return getValue();
      case FXGraphPackage.ELEMENT__NAME:
        return getName();
      case FXGraphPackage.ELEMENT__PROPERTIES:
        return getProperties();
      case FXGraphPackage.ELEMENT__STATIC_PROPERTIES:
        return getStaticProperties();
      case FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES:
        return getStaticCallProperties();
      case FXGraphPackage.ELEMENT__DEFAULT_CHILDREN:
        return getDefaultChildren();
      case FXGraphPackage.ELEMENT__FACTORY:
        return getFactory();
      case FXGraphPackage.ELEMENT__VALUES:
        return getValues();
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
      case FXGraphPackage.ELEMENT__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case FXGraphPackage.ELEMENT__VALUE:
        setValue((SimpleValueProperty)newValue);
        return;
      case FXGraphPackage.ELEMENT__NAME:
        setName((String)newValue);
        return;
      case FXGraphPackage.ELEMENT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case FXGraphPackage.ELEMENT__STATIC_PROPERTIES:
        getStaticProperties().clear();
        getStaticProperties().addAll((Collection<? extends StaticValueProperty>)newValue);
        return;
      case FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES:
        getStaticCallProperties().clear();
        getStaticCallProperties().addAll((Collection<? extends StaticCallValueProperty>)newValue);
        return;
      case FXGraphPackage.ELEMENT__DEFAULT_CHILDREN:
        getDefaultChildren().clear();
        getDefaultChildren().addAll((Collection<? extends Element>)newValue);
        return;
      case FXGraphPackage.ELEMENT__FACTORY:
        setFactory((String)newValue);
        return;
      case FXGraphPackage.ELEMENT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends FactoryValueElement>)newValue);
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
      case FXGraphPackage.ELEMENT__TYPE:
        setType((JvmTypeReference)null);
        return;
      case FXGraphPackage.ELEMENT__VALUE:
        setValue((SimpleValueProperty)null);
        return;
      case FXGraphPackage.ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FXGraphPackage.ELEMENT__PROPERTIES:
        getProperties().clear();
        return;
      case FXGraphPackage.ELEMENT__STATIC_PROPERTIES:
        getStaticProperties().clear();
        return;
      case FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES:
        getStaticCallProperties().clear();
        return;
      case FXGraphPackage.ELEMENT__DEFAULT_CHILDREN:
        getDefaultChildren().clear();
        return;
      case FXGraphPackage.ELEMENT__FACTORY:
        setFactory(FACTORY_EDEFAULT);
        return;
      case FXGraphPackage.ELEMENT__VALUES:
        getValues().clear();
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
      case FXGraphPackage.ELEMENT__TYPE:
        return type != null;
      case FXGraphPackage.ELEMENT__VALUE:
        return value != null;
      case FXGraphPackage.ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FXGraphPackage.ELEMENT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case FXGraphPackage.ELEMENT__STATIC_PROPERTIES:
        return staticProperties != null && !staticProperties.isEmpty();
      case FXGraphPackage.ELEMENT__STATIC_CALL_PROPERTIES:
        return staticCallProperties != null && !staticCallProperties.isEmpty();
      case FXGraphPackage.ELEMENT__DEFAULT_CHILDREN:
        return defaultChildren != null && !defaultChildren.isEmpty();
      case FXGraphPackage.ELEMENT__FACTORY:
        return FACTORY_EDEFAULT == null ? factory != null : !FACTORY_EDEFAULT.equals(factory);
      case FXGraphPackage.ELEMENT__VALUES:
        return values != null && !values.isEmpty();
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
    result.append(", factory: ");
    result.append(factory);
    result.append(')');
    return result.toString();
  }

} //ElementImpl
