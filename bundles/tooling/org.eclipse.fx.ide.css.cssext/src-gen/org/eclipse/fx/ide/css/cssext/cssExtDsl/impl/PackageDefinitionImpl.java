/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl.impl;

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

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.PackageDefinitionImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.PackageDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.PackageDefinitionImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.PackageDefinitionImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.PackageDefinitionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDefinitionImpl extends MinimalEObjectImpl.Container implements PackageDefinition
{
  /**
   * The cached value of the '{@link #getDoku() <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoku()
   * @generated
   * @ordered
   */
  protected Doku doku;

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
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Definition> rules;

  /**
   * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubpackages()
   * @generated
   * @ordered
   */
  protected EList<PackageDefinition> subpackages;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<ElementDefinition> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDefinitionImpl()
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
    return CssExtDslPackage.Literals.PACKAGE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doku getDoku()
  {
    return doku;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoku(Doku newDoku, NotificationChain msgs)
  {
    Doku oldDoku = doku;
    doku = newDoku;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.PACKAGE_DEFINITION__DOKU, oldDoku, newDoku);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoku(Doku newDoku)
  {
    if (newDoku != doku)
    {
      NotificationChain msgs = null;
      if (doku != null)
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.PACKAGE_DEFINITION__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.PACKAGE_DEFINITION__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.PACKAGE_DEFINITION__DOKU, newDoku, newDoku));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.PACKAGE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Definition> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Definition>(Definition.class, this, CssExtDslPackage.PACKAGE_DEFINITION__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageDefinition> getSubpackages()
  {
    if (subpackages == null)
    {
      subpackages = new EObjectContainmentEList<PackageDefinition>(PackageDefinition.class, this, CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES);
    }
    return subpackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementDefinition> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<ElementDefinition>(ElementDefinition.class, this, CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS);
    }
    return elements;
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
      case CssExtDslPackage.PACKAGE_DEFINITION__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.PACKAGE_DEFINITION__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES:
        return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.PACKAGE_DEFINITION__DOKU:
        return getDoku();
      case CssExtDslPackage.PACKAGE_DEFINITION__NAME:
        return getName();
      case CssExtDslPackage.PACKAGE_DEFINITION__RULES:
        return getRules();
      case CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES:
        return getSubpackages();
      case CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS:
        return getElements();
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
      case CssExtDslPackage.PACKAGE_DEFINITION__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Definition>)newValue);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES:
        getSubpackages().clear();
        getSubpackages().addAll((Collection<? extends PackageDefinition>)newValue);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends ElementDefinition>)newValue);
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
      case CssExtDslPackage.PACKAGE_DEFINITION__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__RULES:
        getRules().clear();
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES:
        getSubpackages().clear();
        return;
      case CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS:
        getElements().clear();
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
      case CssExtDslPackage.PACKAGE_DEFINITION__DOKU:
        return doku != null;
      case CssExtDslPackage.PACKAGE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssExtDslPackage.PACKAGE_DEFINITION__RULES:
        return rules != null && !rules.isEmpty();
      case CssExtDslPackage.PACKAGE_DEFINITION__SUBPACKAGES:
        return subpackages != null && !subpackages.isEmpty();
      case CssExtDslPackage.PACKAGE_DEFINITION__ELEMENTS:
        return elements != null && !elements.isEmpty();
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

} //PackageDefinitionImpl
