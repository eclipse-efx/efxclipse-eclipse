/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph;

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
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphFactory
 * @model kind="package"
 * @generated
 */
public interface FXGraphPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fXGraph";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/efxclipse/tooling/fxgraph/FXGraph";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fXGraph";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXGraphPackage eINSTANCE = org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ModelImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Component Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENT_DEF = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.PackageDeclarationImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ImportImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Dynamic Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__DYNAMIC_ROOT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__CONTROLLER = 2;

  /**
   * The feature id for the '<em><b>Preview Css Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_CSS_FILES = 3;

  /**
   * The feature id for the '<em><b>Preview Resource Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE = 4;

  /**
   * The feature id for the '<em><b>Preview Classpath Entries</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES = 5;

  /**
   * The feature id for the '<em><b>Scene Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__SCENE_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__SCRIPTS = 7;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__DEFINES = 8;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__ROOT_NODE = 9;

  /**
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ValuePropertyImpl <em>Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getValueProperty()
   * @generated
   */
  int VALUE_PROPERTY = 10;

  /**
   * The number of structural features of the '<em>Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SingleValuePropertyImpl <em>Single Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.SingleValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSingleValueProperty()
   * @generated
   */
  int SINGLE_VALUE_PROPERTY = 11;

  /**
   * The number of structural features of the '<em>Single Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__STATIC_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Static Call Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__STATIC_CALL_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Default Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__DEFAULT_CHILDREN = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Factory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__FACTORY = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 5;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Include Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__INCLUDE_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 6;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LANGUAGE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SOURCECODE = 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticCallValuePropertyImpl <em>Static Call Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticCallValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticCallValueProperty()
   * @generated
   */
  int STATIC_CALL_VALUE_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CALL_VALUE_PROPERTY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CALL_VALUE_PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CALL_VALUE_PROPERTY__NAME = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CALL_VALUE_PROPERTY__VALUE = 3;

  /**
   * The number of structural features of the '<em>Static Call Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CALL_VALUE_PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticValuePropertyImpl <em>Static Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticValueProperty()
   * @generated
   */
  int STATIC_VALUE_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Static Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.PropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.MultiValuePropertyImpl <em>Multi Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.MultiValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMultiValueProperty()
   * @generated
   */
  int MULTI_VALUE_PROPERTY = 12;

  /**
   * The number of structural features of the '<em>Multi Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.FactoryValueElementImpl <em>Factory Value Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FactoryValueElementImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getFactoryValueElement()
   * @generated
   */
  int FACTORY_VALUE_ELEMENT = 13;

  /**
   * The number of structural features of the '<em>Factory Value Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY_VALUE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValueElementImpl <em>List Value Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValueElementImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueElement()
   * @generated
   */
  int LIST_VALUE_ELEMENT = 14;

  /**
   * The number of structural features of the '<em>List Value Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValuePropertyImpl <em>List Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueProperty()
   * @generated
   */
  int LIST_VALUE_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_PROPERTY__VALUE = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_PROPERTY_FEATURE_COUNT = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.MapValuePropertyImpl <em>Map Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.MapValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMapValueProperty()
   * @generated
   */
  int MAP_VALUE_PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VALUE_PROPERTY__PROPERTIES = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Map Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VALUE_PROPERTY_FEATURE_COUNT = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl <em>Simple Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSimpleValueProperty()
   * @generated
   */
  int SIMPLE_VALUE_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__STRING_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__NEGATIVE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__NUMBER = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Simple Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ConstValuePropertyImpl <em>Const Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ConstValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getConstValueProperty()
   * @generated
   */
  int CONST_VALUE_PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_PROPERTY__TYPE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_PROPERTY__FIELD = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Const Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceTypeImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceType()
   * @generated
   */
  int REFERENCE_TYPE = 19;

  /**
   * The number of structural features of the '<em>Reference Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl <em>Reference Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceValueProperty()
   * @generated
   */
  int REFERENCE_VALUE_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static Call Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reference Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl <em>Include Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeValueProperty()
   * @generated
   */
  int INCLUDE_VALUE_PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY__SOURCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY__NAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Static Call Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Include Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.CopyValuePropertyImpl <em>Copy Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.CopyValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getCopyValueProperty()
   * @generated
   */
  int COPY_VALUE_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPY_VALUE_PROPERTY__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Copy Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPY_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl <em>Controller Handled Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getControllerHandledValueProperty()
   * @generated
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Methodname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Controller Handled Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl <em>Script Handler Handled Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptHandlerHandledValueProperty()
   * @generated
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Functionname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Handler Handled Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueExpressionImpl <em>Script Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueExpressionImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueExpression()
   * @generated
   */
  int SCRIPT_VALUE_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_EXPRESSION__SOURCECODE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_EXPRESSION_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueReferenceImpl <em>Script Value Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueReferenceImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueReference()
   * @generated
   */
  int SCRIPT_VALUE_REFERENCE = 26;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_REFERENCE__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Value Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_REFERENCE_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.LocationValuePropertyImpl <em>Location Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.LocationValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getLocationValueProperty()
   * @generated
   */
  int LOCATION_VALUE_PROPERTY = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_VALUE_PROPERTY__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Location Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ResourceValuePropertyImpl <em>Resource Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ResourceValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getResourceValueProperty()
   * @generated
   */
  int RESOURCE_VALUE_PROPERTY = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_PROPERTY__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl <em>Bind Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getBindValueProperty()
   * @generated
   */
  int BIND_VALUE_PROPERTY = 29;

  /**
   * The feature id for the '<em><b>Element Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY__ELEMENT_REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY__ATTRIBUTE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bind Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StringValueImpl
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Model#getPackage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Package();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model#getComponentDef <em>Component Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Def</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Model#getComponentDef()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ComponentDef();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Definition</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition
   * @generated
   */
  EClass getComponentDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#isDynamicRoot <em>Dynamic Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic Root</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#isDynamicRoot()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_DynamicRoot();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getName()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Controller</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getController()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Controller();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewCssFiles <em>Preview Css Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Preview Css Files</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewCssFiles()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewCssFiles();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preview Resource Bundle</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewResourceBundle();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewClasspathEntries <em>Preview Classpath Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Preview Classpath Entries</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getPreviewClasspathEntries()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewClasspathEntries();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getSceneDefinition <em>Scene Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scene Definition</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getSceneDefinition()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_SceneDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getScripts <em>Scripts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scripts</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getScripts()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Scripts();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defines</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getDefines()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Defines();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Node</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition#getRootNode()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_RootNode();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getType()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValue()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticProperties <em>Static Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_StaticProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticCallProperties <em>Static Call Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Call Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getStaticCallProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_StaticCallProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getDefaultChildren <em>Default Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Default Children</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getDefaultChildren()
   * @see #getElement()
   * @generated
   */
  EReference getElement_DefaultChildren();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getFactory <em>Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factory</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getFactory()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Factory();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element#getValues()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Define#getElement()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define#getIncludeElement <em>Include Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Include Element</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Define#getIncludeElement()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_IncludeElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Script#getLanguage()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Language();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSource()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Source();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Script#getSourcecode()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Sourcecode();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty <em>Static Call Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Call Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty
   * @generated
   */
  EClass getStaticCallValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getModifier()
   * @see #getStaticCallValueProperty()
   * @generated
   */
  EAttribute getStaticCallValueProperty_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getType()
   * @see #getStaticCallValueProperty()
   * @generated
   */
  EReference getStaticCallValueProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getName()
   * @see #getStaticCallValueProperty()
   * @generated
   */
  EAttribute getStaticCallValueProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty#getValue()
   * @see #getStaticCallValueProperty()
   * @generated
   */
  EReference getStaticCallValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty <em>Static Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty
   * @generated
   */
  EClass getStaticValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getModifier()
   * @see #getStaticValueProperty()
   * @generated
   */
  EAttribute getStaticValueProperty_Modifier();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getName()
   * @see #getStaticValueProperty()
   * @generated
   */
  EAttribute getStaticValueProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty#getValue()
   * @see #getStaticValueProperty()
   * @generated
   */
  EReference getStaticValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Property#getModifier()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Modifier();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty <em>Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty
   * @generated
   */
  EClass getValueProperty();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SingleValueProperty <em>Single Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SingleValueProperty
   * @generated
   */
  EClass getSingleValueProperty();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.MultiValueProperty <em>Multi Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.MultiValueProperty
   * @generated
   */
  EClass getMultiValueProperty();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement <em>Factory Value Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factory Value Element</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement
   * @generated
   */
  EClass getFactoryValueElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement <em>List Value Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Value Element</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement
   * @generated
   */
  EClass getListValueElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty <em>List Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty
   * @generated
   */
  EClass getListValueProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty#getValue()
   * @see #getListValueProperty()
   * @generated
   */
  EReference getListValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty <em>Map Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty
   * @generated
   */
  EClass getMapValueProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty#getProperties()
   * @see #getMapValueProperty()
   * @generated
   */
  EReference getMapValueProperty_Properties();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty <em>Simple Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty
   * @generated
   */
  EClass getSimpleValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getStringValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_StringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#isNegative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#isNegative()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_Negative();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty#getNumber()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_Number();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty <em>Const Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty
   * @generated
   */
  EClass getConstValueProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty#getType()
   * @see #getConstValueProperty()
   * @generated
   */
  EReference getConstValueProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty#getField()
   * @see #getConstValueProperty()
   * @generated
   */
  EAttribute getConstValueProperty_Field();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Type</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceType
   * @generated
   */
  EClass getReferenceType();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty <em>Reference Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty
   * @generated
   */
  EClass getReferenceValueProperty();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getReference()
   * @see #getReferenceValueProperty()
   * @generated
   */
  EReference getReferenceValueProperty_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticProperties <em>Static Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticProperties()
   * @see #getReferenceValueProperty()
   * @generated
   */
  EReference getReferenceValueProperty_StaticProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticCallProperties <em>Static Call Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Call Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty#getStaticCallProperties()
   * @see #getReferenceValueProperty()
   * @generated
   */
  EReference getReferenceValueProperty_StaticCallProperties();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty <em>Include Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty
   * @generated
   */
  EClass getIncludeValueProperty();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getSource()
   * @see #getIncludeValueProperty()
   * @generated
   */
  EReference getIncludeValueProperty_Source();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getName()
   * @see #getIncludeValueProperty()
   * @generated
   */
  EAttribute getIncludeValueProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticProperties <em>Static Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticProperties()
   * @see #getIncludeValueProperty()
   * @generated
   */
  EReference getIncludeValueProperty_StaticProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticCallProperties <em>Static Call Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Call Properties</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty#getStaticCallProperties()
   * @see #getIncludeValueProperty()
   * @generated
   */
  EReference getIncludeValueProperty_StaticCallProperties();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty <em>Copy Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Copy Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty
   * @generated
   */
  EClass getCopyValueProperty();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty#getReference()
   * @see #getCopyValueProperty()
   * @generated
   */
  EReference getCopyValueProperty_Reference();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty <em>Controller Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller Handled Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty
   * @generated
   */
  EClass getControllerHandledValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty#getMethodname <em>Methodname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodname</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty#getMethodname()
   * @see #getControllerHandledValueProperty()
   * @generated
   */
  EAttribute getControllerHandledValueProperty_Methodname();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty <em>Script Handler Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Handler Handled Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty
   * @generated
   */
  EClass getScriptHandlerHandledValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty#getFunctionname <em>Functionname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functionname</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty#getFunctionname()
   * @see #getScriptHandlerHandledValueProperty()
   * @generated
   */
  EAttribute getScriptHandlerHandledValueProperty_Functionname();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression <em>Script Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Value Expression</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression
   * @generated
   */
  EClass getScriptValueExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression#getSourcecode()
   * @see #getScriptValueExpression()
   * @generated
   */
  EAttribute getScriptValueExpression_Sourcecode();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference <em>Script Value Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Value Reference</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference
   * @generated
   */
  EClass getScriptValueReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference#getReference()
   * @see #getScriptValueReference()
   * @generated
   */
  EAttribute getScriptValueReference_Reference();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty <em>Location Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty
   * @generated
   */
  EClass getLocationValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty#getValue()
   * @see #getLocationValueProperty()
   * @generated
   */
  EAttribute getLocationValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty <em>Resource Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty
   * @generated
   */
  EClass getResourceValueProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty#getValue()
   * @see #getResourceValueProperty()
   * @generated
   */
  EReference getResourceValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty <em>Bind Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Value Property</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty
   * @generated
   */
  EClass getBindValueProperty();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Reference</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getElementReference()
   * @see #getBindValueProperty()
   * @generated
   */
  EReference getBindValueProperty_ElementReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty#getAttribute()
   * @see #getBindValueProperty()
   * @generated
   */
  EAttribute getBindValueProperty_Attribute();

  /**
   * Returns the meta object for class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FXGraphFactory getFXGraphFactory();

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
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ModelImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Component Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENT_DEF = eINSTANCE.getModel_ComponentDef();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.PackageDeclarationImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ImportImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ComponentDefinitionImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getComponentDefinition()
     * @generated
     */
    EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

    /**
     * The meta object literal for the '<em><b>Dynamic Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__DYNAMIC_ROOT = eINSTANCE.getComponentDefinition_DynamicRoot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__CONTROLLER = eINSTANCE.getComponentDefinition_Controller();

    /**
     * The meta object literal for the '<em><b>Preview Css Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_CSS_FILES = eINSTANCE.getComponentDefinition_PreviewCssFiles();

    /**
     * The meta object literal for the '<em><b>Preview Resource Bundle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE = eINSTANCE.getComponentDefinition_PreviewResourceBundle();

    /**
     * The meta object literal for the '<em><b>Preview Classpath Entries</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES = eINSTANCE.getComponentDefinition_PreviewClasspathEntries();

    /**
     * The meta object literal for the '<em><b>Scene Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__SCENE_DEFINITION = eINSTANCE.getComponentDefinition_SceneDefinition();

    /**
     * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__SCRIPTS = eINSTANCE.getComponentDefinition_Scripts();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__DEFINES = eINSTANCE.getComponentDefinition_Defines();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__ROOT_NODE = eINSTANCE.getComponentDefinition_RootNode();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ElementImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__VALUE = eINSTANCE.getElement_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

    /**
     * The meta object literal for the '<em><b>Static Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__STATIC_PROPERTIES = eINSTANCE.getElement_StaticProperties();

    /**
     * The meta object literal for the '<em><b>Static Call Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__STATIC_CALL_PROPERTIES = eINSTANCE.getElement_StaticCallProperties();

    /**
     * The meta object literal for the '<em><b>Default Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__DEFAULT_CHILDREN = eINSTANCE.getElement_DefaultChildren();

    /**
     * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__FACTORY = eINSTANCE.getElement_Factory();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__VALUES = eINSTANCE.getElement_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.DefineImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__ELEMENT = eINSTANCE.getDefine_Element();

    /**
     * The meta object literal for the '<em><b>Include Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__INCLUDE_ELEMENT = eINSTANCE.getDefine_IncludeElement();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__LANGUAGE = eINSTANCE.getScript_Language();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SOURCE = eINSTANCE.getScript_Source();

    /**
     * The meta object literal for the '<em><b>Sourcecode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SOURCECODE = eINSTANCE.getScript_Sourcecode();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticCallValuePropertyImpl <em>Static Call Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticCallValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticCallValueProperty()
     * @generated
     */
    EClass STATIC_CALL_VALUE_PROPERTY = eINSTANCE.getStaticCallValueProperty();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_CALL_VALUE_PROPERTY__MODIFIER = eINSTANCE.getStaticCallValueProperty_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_CALL_VALUE_PROPERTY__TYPE = eINSTANCE.getStaticCallValueProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_CALL_VALUE_PROPERTY__NAME = eINSTANCE.getStaticCallValueProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_CALL_VALUE_PROPERTY__VALUE = eINSTANCE.getStaticCallValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticValuePropertyImpl <em>Static Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StaticValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticValueProperty()
     * @generated
     */
    EClass STATIC_VALUE_PROPERTY = eINSTANCE.getStaticValueProperty();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_VALUE_PROPERTY__MODIFIER = eINSTANCE.getStaticValueProperty_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_VALUE_PROPERTY__NAME = eINSTANCE.getStaticValueProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_VALUE_PROPERTY__VALUE = eINSTANCE.getStaticValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.PropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__MODIFIER = eINSTANCE.getProperty_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ValuePropertyImpl <em>Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getValueProperty()
     * @generated
     */
    EClass VALUE_PROPERTY = eINSTANCE.getValueProperty();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SingleValuePropertyImpl <em>Single Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.SingleValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSingleValueProperty()
     * @generated
     */
    EClass SINGLE_VALUE_PROPERTY = eINSTANCE.getSingleValueProperty();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.MultiValuePropertyImpl <em>Multi Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.MultiValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMultiValueProperty()
     * @generated
     */
    EClass MULTI_VALUE_PROPERTY = eINSTANCE.getMultiValueProperty();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.FactoryValueElementImpl <em>Factory Value Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FactoryValueElementImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getFactoryValueElement()
     * @generated
     */
    EClass FACTORY_VALUE_ELEMENT = eINSTANCE.getFactoryValueElement();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValueElementImpl <em>List Value Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValueElementImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueElement()
     * @generated
     */
    EClass LIST_VALUE_ELEMENT = eINSTANCE.getListValueElement();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValuePropertyImpl <em>List Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ListValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueProperty()
     * @generated
     */
    EClass LIST_VALUE_PROPERTY = eINSTANCE.getListValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_VALUE_PROPERTY__VALUE = eINSTANCE.getListValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.MapValuePropertyImpl <em>Map Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.MapValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMapValueProperty()
     * @generated
     */
    EClass MAP_VALUE_PROPERTY = eINSTANCE.getMapValueProperty();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_VALUE_PROPERTY__PROPERTIES = eINSTANCE.getMapValueProperty_Properties();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl <em>Simple Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.SimpleValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSimpleValueProperty()
     * @generated
     */
    EClass SIMPLE_VALUE_PROPERTY = eINSTANCE.getSimpleValueProperty();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__STRING_VALUE = eINSTANCE.getSimpleValueProperty_StringValue();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE = eINSTANCE.getSimpleValueProperty_BooleanValue();

    /**
     * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__NEGATIVE = eINSTANCE.getSimpleValueProperty_Negative();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__NUMBER = eINSTANCE.getSimpleValueProperty_Number();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ConstValuePropertyImpl <em>Const Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ConstValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getConstValueProperty()
     * @generated
     */
    EClass CONST_VALUE_PROPERTY = eINSTANCE.getConstValueProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONST_VALUE_PROPERTY__TYPE = eINSTANCE.getConstValueProperty_Type();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_VALUE_PROPERTY__FIELD = eINSTANCE.getConstValueProperty_Field();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceTypeImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceType()
     * @generated
     */
    EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl <em>Reference Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceValueProperty()
     * @generated
     */
    EClass REFERENCE_VALUE_PROPERTY = eINSTANCE.getReferenceValueProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE_PROPERTY__REFERENCE = eINSTANCE.getReferenceValueProperty_Reference();

    /**
     * The meta object literal for the '<em><b>Static Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE_PROPERTY__STATIC_PROPERTIES = eINSTANCE.getReferenceValueProperty_StaticProperties();

    /**
     * The meta object literal for the '<em><b>Static Call Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES = eINSTANCE.getReferenceValueProperty_StaticCallProperties();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl <em>Include Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.IncludeValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeValueProperty()
     * @generated
     */
    EClass INCLUDE_VALUE_PROPERTY = eINSTANCE.getIncludeValueProperty();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_VALUE_PROPERTY__SOURCE = eINSTANCE.getIncludeValueProperty_Source();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_VALUE_PROPERTY__NAME = eINSTANCE.getIncludeValueProperty_Name();

    /**
     * The meta object literal for the '<em><b>Static Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_VALUE_PROPERTY__STATIC_PROPERTIES = eINSTANCE.getIncludeValueProperty_StaticProperties();

    /**
     * The meta object literal for the '<em><b>Static Call Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_VALUE_PROPERTY__STATIC_CALL_PROPERTIES = eINSTANCE.getIncludeValueProperty_StaticCallProperties();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.CopyValuePropertyImpl <em>Copy Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.CopyValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getCopyValueProperty()
     * @generated
     */
    EClass COPY_VALUE_PROPERTY = eINSTANCE.getCopyValueProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COPY_VALUE_PROPERTY__REFERENCE = eINSTANCE.getCopyValueProperty_Reference();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl <em>Controller Handled Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getControllerHandledValueProperty()
     * @generated
     */
    EClass CONTROLLER_HANDLED_VALUE_PROPERTY = eINSTANCE.getControllerHandledValueProperty();

    /**
     * The meta object literal for the '<em><b>Methodname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME = eINSTANCE.getControllerHandledValueProperty_Methodname();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl <em>Script Handler Handled Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptHandlerHandledValueProperty()
     * @generated
     */
    EClass SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY = eINSTANCE.getScriptHandlerHandledValueProperty();

    /**
     * The meta object literal for the '<em><b>Functionname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME = eINSTANCE.getScriptHandlerHandledValueProperty_Functionname();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueExpressionImpl <em>Script Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueExpressionImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueExpression()
     * @generated
     */
    EClass SCRIPT_VALUE_EXPRESSION = eINSTANCE.getScriptValueExpression();

    /**
     * The meta object literal for the '<em><b>Sourcecode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_VALUE_EXPRESSION__SOURCECODE = eINSTANCE.getScriptValueExpression_Sourcecode();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueReferenceImpl <em>Script Value Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ScriptValueReferenceImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueReference()
     * @generated
     */
    EClass SCRIPT_VALUE_REFERENCE = eINSTANCE.getScriptValueReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_VALUE_REFERENCE__REFERENCE = eINSTANCE.getScriptValueReference_Reference();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.LocationValuePropertyImpl <em>Location Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.LocationValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getLocationValueProperty()
     * @generated
     */
    EClass LOCATION_VALUE_PROPERTY = eINSTANCE.getLocationValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_VALUE_PROPERTY__VALUE = eINSTANCE.getLocationValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.ResourceValuePropertyImpl <em>Resource Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.ResourceValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getResourceValueProperty()
     * @generated
     */
    EClass RESOURCE_VALUE_PROPERTY = eINSTANCE.getResourceValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_VALUE_PROPERTY__VALUE = eINSTANCE.getResourceValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl <em>Bind Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.BindValuePropertyImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getBindValueProperty()
     * @generated
     */
    EClass BIND_VALUE_PROPERTY = eINSTANCE.getBindValueProperty();

    /**
     * The meta object literal for the '<em><b>Element Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_VALUE_PROPERTY__ELEMENT_REFERENCE = eINSTANCE.getBindValueProperty_ElementReference();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND_VALUE_PROPERTY__ATTRIBUTE = eINSTANCE.getBindValueProperty_Attribute();

    /**
     * The meta object literal for the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.StringValueImpl
     * @see org.eclipse.fx.ide.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

  }

} //FXGraphPackage
