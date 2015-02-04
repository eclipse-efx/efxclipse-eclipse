/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl#getElementReference <em>Element Reference</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindValuePropertyImpl extends SingleValuePropertyImpl implements BindValueProperty
{
  /**
   * The cached value of the '{@link #getElementReference() <em>Element Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementReference()
   * @generated
   * @ordered
   */
  protected Element elementReference;

  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String attribute = ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindValuePropertyImpl()
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
    return FXGraphPackage.Literals.BIND_VALUE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getElementReference()
  {
    if (elementReference != null && elementReference.eIsProxy())
    {
      InternalEObject oldElementReference = (InternalEObject)elementReference;
      elementReference = (Element)eResolveProxy(oldElementReference);
      if (elementReference != oldElementReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE, oldElementReference, elementReference));
      }
    }
    return elementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element basicGetElementReference()
  {
    return elementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementReference(Element newElementReference)
  {
    Element oldElementReference = elementReference;
    elementReference = newElementReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE, oldElementReference, elementReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXGraphPackage.BIND_VALUE_PROPERTY__ATTRIBUTE, oldAttribute, attribute));
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
      case FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE:
        if (resolve) return getElementReference();
        return basicGetElementReference();
      case FXGraphPackage.BIND_VALUE_PROPERTY__ATTRIBUTE:
        return getAttribute();
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
      case FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE:
        setElementReference((Element)newValue);
        return;
      case FXGraphPackage.BIND_VALUE_PROPERTY__ATTRIBUTE:
        setAttribute((String)newValue);
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
      case FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE:
        setElementReference((Element)null);
        return;
      case FXGraphPackage.BIND_VALUE_PROPERTY__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
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
      case FXGraphPackage.BIND_VALUE_PROPERTY__ELEMENT_REFERENCE:
        return elementReference != null;
      case FXGraphPackage.BIND_VALUE_PROPERTY__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
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
    result.append(" (attribute: ");
    result.append(attribute);
    result.append(')');
    return result.toString();
  }

} //BindValuePropertyImpl
