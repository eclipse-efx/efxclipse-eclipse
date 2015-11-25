/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GModelDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gModelDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/fx/ide/gmodel/GModelDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gModelDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GModelDSLPackage eINSTANCE = org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelImpl <em>GModel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelImpl
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGModel()
   * @generated
   */
  int GMODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GMODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GMODEL__TYPE_LIST = 1;

  /**
   * The number of structural features of the '<em>GModel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl <em>GDomain Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDomainElement()
   * @generated
   */
  int GDOMAIN_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_ELEMENT__SUPER_TYPE_LIST = 1;

  /**
   * The feature id for the '<em><b>Property List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_ELEMENT__PROPERTY_LIST = 2;

  /**
   * The number of structural features of the '<em>GDomain Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl <em>GDomain Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDomainProperty()
   * @generated
   */
  int GDOMAIN_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Built In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY__BUILT_IN = 0;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY__LIST = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY__NAME = 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY__DEFAULT_VALUE = 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY__REF = 4;

  /**
   * The number of structural features of the '<em>GDomain Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDOMAIN_PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl <em>GDefault</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDefault()
   * @generated
   */
  int GDEFAULT = 3;

  /**
   * The feature id for the '<em><b>String Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFAULT__STRING_VAL = 0;

  /**
   * The feature id for the '<em><b>Int Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFAULT__INT_VAL = 1;

  /**
   * The number of structural features of the '<em>GDefault</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GDEFAULT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel <em>GModel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GModel</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModel
   * @generated
   */
  EClass getGModel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getName()
   * @see #getGModel()
   * @generated
   */
  EAttribute getGModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getTypeList <em>Type List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type List</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getTypeList()
   * @see #getGModel()
   * @generated
   */
  EReference getGModel_TypeList();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement <em>GDomain Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GDomain Element</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement
   * @generated
   */
  EClass getGDomainElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getName()
   * @see #getGDomainElement()
   * @generated
   */
  EAttribute getGDomainElement_Name();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getSuperTypeList <em>Super Type List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Type List</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getSuperTypeList()
   * @see #getGDomainElement()
   * @generated
   */
  EReference getGDomainElement_SuperTypeList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getPropertyList <em>Property List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property List</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getPropertyList()
   * @see #getGDomainElement()
   * @generated
   */
  EReference getGDomainElement_PropertyList();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty <em>GDomain Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GDomain Property</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty
   * @generated
   */
  EClass getGDomainProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getBuiltIn <em>Built In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getBuiltIn()
   * @see #getGDomainProperty()
   * @generated
   */
  EAttribute getGDomainProperty_BuiltIn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#isList()
   * @see #getGDomainProperty()
   * @generated
   */
  EAttribute getGDomainProperty_List();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getName()
   * @see #getGDomainProperty()
   * @generated
   */
  EAttribute getGDomainProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getDefaultValue()
   * @see #getGDomainProperty()
   * @generated
   */
  EReference getGDomainProperty_DefaultValue();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getRef()
   * @see #getGDomainProperty()
   * @generated
   */
  EReference getGDomainProperty_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault <em>GDefault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GDefault</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDefault
   * @generated
   */
  EClass getGDefault();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getStringVal <em>String Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Val</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getStringVal()
   * @see #getGDefault()
   * @generated
   */
  EAttribute getGDefault_StringVal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getIntVal <em>Int Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Val</em>'.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getIntVal()
   * @see #getGDefault()
   * @generated
   */
  EAttribute getGDefault_IntVal();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GModelDSLFactory getGModelDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelImpl <em>GModel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelImpl
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGModel()
     * @generated
     */
    EClass GMODEL = eINSTANCE.getGModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GMODEL__NAME = eINSTANCE.getGModel_Name();

    /**
     * The meta object literal for the '<em><b>Type List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GMODEL__TYPE_LIST = eINSTANCE.getGModel_TypeList();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl <em>GDomain Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainElementImpl
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDomainElement()
     * @generated
     */
    EClass GDOMAIN_ELEMENT = eINSTANCE.getGDomainElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDOMAIN_ELEMENT__NAME = eINSTANCE.getGDomainElement_Name();

    /**
     * The meta object literal for the '<em><b>Super Type List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GDOMAIN_ELEMENT__SUPER_TYPE_LIST = eINSTANCE.getGDomainElement_SuperTypeList();

    /**
     * The meta object literal for the '<em><b>Property List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GDOMAIN_ELEMENT__PROPERTY_LIST = eINSTANCE.getGDomainElement_PropertyList();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl <em>GDomain Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDomainPropertyImpl
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDomainProperty()
     * @generated
     */
    EClass GDOMAIN_PROPERTY = eINSTANCE.getGDomainProperty();

    /**
     * The meta object literal for the '<em><b>Built In</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDOMAIN_PROPERTY__BUILT_IN = eINSTANCE.getGDomainProperty_BuiltIn();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDOMAIN_PROPERTY__LIST = eINSTANCE.getGDomainProperty_List();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDOMAIN_PROPERTY__NAME = eINSTANCE.getGDomainProperty_Name();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GDOMAIN_PROPERTY__DEFAULT_VALUE = eINSTANCE.getGDomainProperty_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GDOMAIN_PROPERTY__REF = eINSTANCE.getGDomainProperty_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl <em>GDefault</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GDefaultImpl
     * @see org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLPackageImpl#getGDefault()
     * @generated
     */
    EClass GDEFAULT = eINSTANCE.getGDefault();

    /**
     * The meta object literal for the '<em><b>String Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDEFAULT__STRING_VAL = eINSTANCE.getGDefault_StringVal();

    /**
     * The meta object literal for the '<em><b>Int Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GDEFAULT__INT_VAL = eINSTANCE.getGDefault_IntVal();

  }

} //GModelDSLPackage
