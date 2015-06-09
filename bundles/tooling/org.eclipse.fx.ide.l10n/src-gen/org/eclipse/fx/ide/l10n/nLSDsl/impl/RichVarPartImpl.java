/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage;
import org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter;
import org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich Var Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.impl.RichVarPartImpl#getFormatterClass <em>Formatter Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RichVarPartImpl extends MinimalEObjectImpl.Container implements RichVarPart
{
  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormatterClass() <em>Formatter Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatterClass()
   * @generated
   * @ordered
   */
  protected NLSFormatter formatterClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RichVarPartImpl()
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
    return NLSDslPackage.Literals.RICH_VAR_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.RICH_VAR_PART__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.RICH_VAR_PART__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSFormatter getFormatterClass()
  {
    if (formatterClass != null && formatterClass.eIsProxy())
    {
      InternalEObject oldFormatterClass = (InternalEObject)formatterClass;
      formatterClass = (NLSFormatter)eResolveProxy(oldFormatterClass);
      if (formatterClass != oldFormatterClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS, oldFormatterClass, formatterClass));
      }
    }
    return formatterClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSFormatter basicGetFormatterClass()
  {
    return formatterClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormatterClass(NLSFormatter newFormatterClass)
  {
    NLSFormatter oldFormatterClass = formatterClass;
    formatterClass = newFormatterClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS, oldFormatterClass, formatterClass));
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
      case NLSDslPackage.RICH_VAR_PART__KEY:
        return getKey();
      case NLSDslPackage.RICH_VAR_PART__FORMAT:
        return getFormat();
      case NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS:
        if (resolve) return getFormatterClass();
        return basicGetFormatterClass();
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
      case NLSDslPackage.RICH_VAR_PART__KEY:
        setKey((String)newValue);
        return;
      case NLSDslPackage.RICH_VAR_PART__FORMAT:
        setFormat((String)newValue);
        return;
      case NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS:
        setFormatterClass((NLSFormatter)newValue);
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
      case NLSDslPackage.RICH_VAR_PART__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case NLSDslPackage.RICH_VAR_PART__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS:
        setFormatterClass((NLSFormatter)null);
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
      case NLSDslPackage.RICH_VAR_PART__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case NLSDslPackage.RICH_VAR_PART__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case NLSDslPackage.RICH_VAR_PART__FORMATTER_CLASS:
        return formatterClass != null;
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
    result.append(" (key: ");
    result.append(key);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //RichVarPartImpl
