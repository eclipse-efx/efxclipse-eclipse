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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Substructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getStyleclass <em>Styleclass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getPseudoClasses <em>Pseudo Classes</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.impl.ElementDefinitionImpl#getSubstructures <em>Substructures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends MinimalEObjectImpl.Container implements ElementDefinition
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
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected EList<ElementDefinition> super_;

  /**
   * The default value of the '{@link #getStyleclass() <em>Styleclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleclass()
   * @generated
   * @ordered
   */
  protected static final String STYLECLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyleclass() <em>Styleclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleclass()
   * @generated
   * @ordered
   */
  protected String styleclass = STYLECLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Definition> properties;

  /**
   * The cached value of the '{@link #getPseudoClasses() <em>Pseudo Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoClasses()
   * @generated
   * @ordered
   */
  protected EList<PseudoClassDefinition> pseudoClasses;

  /**
   * The cached value of the '{@link #getSubstructures() <em>Substructures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstructures()
   * @generated
   * @ordered
   */
  protected EList<Substructure> substructures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDefinitionImpl()
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
    return CssExtDslPackage.Literals.ELEMENT_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__DOKU, oldDoku, newDoku);
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
        msgs = ((InternalEObject)doku).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.ELEMENT_DEFINITION__DOKU, null, msgs);
      if (newDoku != null)
        msgs = ((InternalEObject)newDoku).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssExtDslPackage.ELEMENT_DEFINITION__DOKU, null, msgs);
      msgs = basicSetDoku(newDoku, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__DOKU, newDoku, newDoku));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementDefinition> getSuper()
  {
    if (super_ == null)
    {
      super_ = new EObjectResolvingEList<ElementDefinition>(ElementDefinition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__SUPER);
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyleclass()
  {
    return styleclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyleclass(String newStyleclass)
  {
    String oldStyleclass = styleclass;
    styleclass = newStyleclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssExtDslPackage.ELEMENT_DEFINITION__STYLECLASS, oldStyleclass, styleclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Definition> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Definition>(Definition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PseudoClassDefinition> getPseudoClasses()
  {
    if (pseudoClasses == null)
    {
      pseudoClasses = new EObjectContainmentEList<PseudoClassDefinition>(PseudoClassDefinition.class, this, CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES);
    }
    return pseudoClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Substructure> getSubstructures()
  {
    if (substructures == null)
    {
      substructures = new EObjectContainmentEList<Substructure>(Substructure.class, this, CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES);
    }
    return substructures;
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return basicSetDoku(null, msgs);
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return ((InternalEList<?>)getPseudoClasses()).basicRemove(otherEnd, msgs);
      case CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES:
        return ((InternalEList<?>)getSubstructures()).basicRemove(otherEnd, msgs);
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return getDoku();
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        return getName();
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        return getSuper();
      case CssExtDslPackage.ELEMENT_DEFINITION__STYLECLASS:
        return getStyleclass();
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return getProperties();
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return getPseudoClasses();
      case CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES:
        return getSubstructures();
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        setDoku((Doku)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        getSuper().clear();
        getSuper().addAll((Collection<? extends ElementDefinition>)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__STYLECLASS:
        setStyleclass((String)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Definition>)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        getPseudoClasses().clear();
        getPseudoClasses().addAll((Collection<? extends PseudoClassDefinition>)newValue);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES:
        getSubstructures().clear();
        getSubstructures().addAll((Collection<? extends Substructure>)newValue);
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        setDoku((Doku)null);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        getSuper().clear();
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__STYLECLASS:
        setStyleclass(STYLECLASS_EDEFAULT);
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        getProperties().clear();
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        getPseudoClasses().clear();
        return;
      case CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES:
        getSubstructures().clear();
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
      case CssExtDslPackage.ELEMENT_DEFINITION__DOKU:
        return doku != null;
      case CssExtDslPackage.ELEMENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CssExtDslPackage.ELEMENT_DEFINITION__SUPER:
        return super_ != null && !super_.isEmpty();
      case CssExtDslPackage.ELEMENT_DEFINITION__STYLECLASS:
        return STYLECLASS_EDEFAULT == null ? styleclass != null : !STYLECLASS_EDEFAULT.equals(styleclass);
      case CssExtDslPackage.ELEMENT_DEFINITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case CssExtDslPackage.ELEMENT_DEFINITION__PSEUDO_CLASSES:
        return pseudoClasses != null && !pseudoClasses.isEmpty();
      case CssExtDslPackage.ELEMENT_DEFINITION__SUBSTRUCTURES:
        return substructures != null && !substructures.isEmpty();
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
    result.append(", styleclass: ");
    result.append(styleclass);
    result.append(')');
    return result.toString();
  }

} //ElementDefinitionImpl
