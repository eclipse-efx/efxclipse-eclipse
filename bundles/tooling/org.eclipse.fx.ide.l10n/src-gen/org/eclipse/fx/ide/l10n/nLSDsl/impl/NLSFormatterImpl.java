/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NLS Formatter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.NLSFormatterImpl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NLSFormatterImpl extends MinimalEObjectImpl.Container implements NLSFormatter
{
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
   * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected static final String CLASS_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected String classRef = CLASS_REF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NLSFormatterImpl()
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
    return NLSDslPackage.Literals.NLS_FORMATTER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS_FORMATTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(String newClassRef)
  {
    String oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.NLS_FORMATTER__CLASS_REF, oldClassRef, classRef));
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
      case NLSDslPackage.NLS_FORMATTER__NAME:
        return getName();
      case NLSDslPackage.NLS_FORMATTER__CLASS_REF:
        return getClassRef();
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
      case NLSDslPackage.NLS_FORMATTER__NAME:
        setName((String)newValue);
        return;
      case NLSDslPackage.NLS_FORMATTER__CLASS_REF:
        setClassRef((String)newValue);
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
      case NLSDslPackage.NLS_FORMATTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NLSDslPackage.NLS_FORMATTER__CLASS_REF:
        setClassRef(CLASS_REF_EDEFAULT);
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
      case NLSDslPackage.NLS_FORMATTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NLSDslPackage.NLS_FORMATTER__CLASS_REF:
        return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
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
    result.append(", classRef: ");
    result.append(classRef);
    result.append(')');
    return result.toString();
  }

} //NLSFormatterImpl
