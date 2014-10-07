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
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.font_face;
import org.eclipse.fx.ide.css.cssDsl.keyframe_selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>font face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.impl.font_faceImpl#getKeyframeselectors <em>Keyframeselectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class font_faceImpl extends keyframesImpl implements font_face
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<css_declaration> declarations;

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
   * The cached value of the '{@link #getKeyframeselectors() <em>Keyframeselectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyframeselectors()
   * @generated
   * @ordered
   */
  protected EList<keyframe_selector> keyframeselectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected font_faceImpl()
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
    return CssDslPackage.Literals.FONT_FACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<css_declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<css_declaration>(css_declaration.class, this, CssDslPackage.FONT_FACE__DECLARATIONS);
    }
    return declarations;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONT_FACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<keyframe_selector> getKeyframeselectors()
  {
    if (keyframeselectors == null)
    {
      keyframeselectors = new EObjectContainmentEList<keyframe_selector>(keyframe_selector.class, this, CssDslPackage.FONT_FACE__KEYFRAMESELECTORS);
    }
    return keyframeselectors;
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
      case CssDslPackage.FONT_FACE__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case CssDslPackage.FONT_FACE__KEYFRAMESELECTORS:
        return ((InternalEList<?>)getKeyframeselectors()).basicRemove(otherEnd, msgs);
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
      case CssDslPackage.FONT_FACE__DECLARATIONS:
        return getDeclarations();
      case CssDslPackage.FONT_FACE__NAME:
        return getName();
      case CssDslPackage.FONT_FACE__KEYFRAMESELECTORS:
        return getKeyframeselectors();
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
      case CssDslPackage.FONT_FACE__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends css_declaration>)newValue);
        return;
      case CssDslPackage.FONT_FACE__NAME:
        setName((String)newValue);
        return;
      case CssDslPackage.FONT_FACE__KEYFRAMESELECTORS:
        getKeyframeselectors().clear();
        getKeyframeselectors().addAll((Collection<? extends keyframe_selector>)newValue);
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
      case CssDslPackage.FONT_FACE__DECLARATIONS:
        getDeclarations().clear();
        return;
      case CssDslPackage.FONT_FACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssDslPackage.FONT_FACE__KEYFRAMESELECTORS:
        getKeyframeselectors().clear();
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
      case CssDslPackage.FONT_FACE__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case CssDslPackage.FONT_FACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssDslPackage.FONT_FACE__KEYFRAMESELECTORS:
        return keyframeselectors != null && !keyframeselectors.isEmpty();
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

} //font_faceImpl
