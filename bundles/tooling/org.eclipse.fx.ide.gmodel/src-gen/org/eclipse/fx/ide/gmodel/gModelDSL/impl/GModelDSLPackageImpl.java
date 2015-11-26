/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fx.ide.gmodel.gModelDSL.GDefault;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap;
import org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModel;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLFactory;
import org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GModelDSLPackageImpl extends EPackageImpl implements GModelDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gDomainElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gDomainMapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gDomainPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gDefaultEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GModelDSLPackageImpl()
  {
    super(eNS_URI, GModelDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GModelDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GModelDSLPackage init()
  {
    if (isInited) return (GModelDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GModelDSLPackage.eNS_URI);

    // Obtain or create and register package
    GModelDSLPackageImpl theGModelDSLPackage = (GModelDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GModelDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GModelDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGModelDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGModelDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGModelDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GModelDSLPackage.eNS_URI, theGModelDSLPackage);
    return theGModelDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGModel()
  {
    return gModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGModel_Name()
  {
    return (EAttribute)gModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGModel_TypeList()
  {
    return (EReference)gModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGDomainElement()
  {
    return gDomainElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDomainElement_Name()
  {
    return (EAttribute)gDomainElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainElement_SuperTypeList()
  {
    return (EReference)gDomainElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainElement_Map()
  {
    return (EReference)gDomainElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainElement_PropertyList()
  {
    return (EReference)gDomainElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGDomainMap()
  {
    return gDomainMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDomainMap_BuiltIn()
  {
    return (EAttribute)gDomainMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainMap_Ref()
  {
    return (EReference)gDomainMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGDomainProperty()
  {
    return gDomainPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDomainProperty_BuiltIn()
  {
    return (EAttribute)gDomainPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDomainProperty_List()
  {
    return (EAttribute)gDomainPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDomainProperty_Name()
  {
    return (EAttribute)gDomainPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainProperty_DefaultValue()
  {
    return (EReference)gDomainPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGDomainProperty_Ref()
  {
    return (EReference)gDomainPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGDefault()
  {
    return gDefaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDefault_StringVal()
  {
    return (EAttribute)gDefaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGDefault_IntVal()
  {
    return (EAttribute)gDefaultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GModelDSLFactory getGModelDSLFactory()
  {
    return (GModelDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gModelEClass = createEClass(GMODEL);
    createEAttribute(gModelEClass, GMODEL__NAME);
    createEReference(gModelEClass, GMODEL__TYPE_LIST);

    gDomainElementEClass = createEClass(GDOMAIN_ELEMENT);
    createEAttribute(gDomainElementEClass, GDOMAIN_ELEMENT__NAME);
    createEReference(gDomainElementEClass, GDOMAIN_ELEMENT__SUPER_TYPE_LIST);
    createEReference(gDomainElementEClass, GDOMAIN_ELEMENT__MAP);
    createEReference(gDomainElementEClass, GDOMAIN_ELEMENT__PROPERTY_LIST);

    gDomainMapEClass = createEClass(GDOMAIN_MAP);
    createEAttribute(gDomainMapEClass, GDOMAIN_MAP__BUILT_IN);
    createEReference(gDomainMapEClass, GDOMAIN_MAP__REF);

    gDomainPropertyEClass = createEClass(GDOMAIN_PROPERTY);
    createEAttribute(gDomainPropertyEClass, GDOMAIN_PROPERTY__BUILT_IN);
    createEAttribute(gDomainPropertyEClass, GDOMAIN_PROPERTY__LIST);
    createEAttribute(gDomainPropertyEClass, GDOMAIN_PROPERTY__NAME);
    createEReference(gDomainPropertyEClass, GDOMAIN_PROPERTY__DEFAULT_VALUE);
    createEReference(gDomainPropertyEClass, GDOMAIN_PROPERTY__REF);

    gDefaultEClass = createEClass(GDEFAULT);
    createEAttribute(gDefaultEClass, GDEFAULT__STRING_VAL);
    createEAttribute(gDefaultEClass, GDEFAULT__INT_VAL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(gModelEClass, GModel.class, "GModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGModel_TypeList(), this.getGDomainElement(), null, "typeList", null, 0, -1, GModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gDomainElementEClass, GDomainElement.class, "GDomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGDomainElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainElement_SuperTypeList(), this.getGDomainElement(), null, "superTypeList", null, 0, -1, GDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainElement_Map(), this.getGDomainMap(), null, "map", null, 0, 1, GDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainElement_PropertyList(), this.getGDomainProperty(), null, "propertyList", null, 0, -1, GDomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gDomainMapEClass, GDomainMap.class, "GDomainMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGDomainMap_BuiltIn(), ecorePackage.getEString(), "builtIn", null, 0, 1, GDomainMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainMap_Ref(), this.getGDomainElement(), null, "ref", null, 0, 1, GDomainMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gDomainPropertyEClass, GDomainProperty.class, "GDomainProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGDomainProperty_BuiltIn(), ecorePackage.getEString(), "builtIn", null, 0, 1, GDomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGDomainProperty_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, GDomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGDomainProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, GDomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainProperty_DefaultValue(), this.getGDefault(), null, "defaultValue", null, 0, 1, GDomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGDomainProperty_Ref(), this.getGDomainElement(), null, "ref", null, 0, 1, GDomainProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gDefaultEClass, GDefault.class, "GDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGDefault_StringVal(), ecorePackage.getEString(), "stringVal", null, 0, 1, GDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGDefault_IntVal(), ecorePackage.getEInt(), "intVal", null, 0, 1, GDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GModelDSLPackageImpl
