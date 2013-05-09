/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public interface TaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.efxclipse.org/rrobot/task/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskPackage eINSTANCE = org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.RobotTaskImpl <em>Robot Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.RobotTaskImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getRobotTask()
	 * @generated
	 */
	int ROBOT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TASK__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TASK__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Robot Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ProjectImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXCLUDE_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin <em>Excludeable Element Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getExcludeableElementMixin()
	 * @generated
	 */
	int EXCLUDEABLE_ELEMENT_MIXIN = 16;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Excludeable Element Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ResourceImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXCLUDE_EXPRESSION = EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.FolderImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__EXCLUDE_EXPRESSION = RESOURCE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CHILDREN = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.FileImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXCLUDE_EXPRESSION = RESOURCE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl <em>Templated File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getTemplatedFile()
	 * @generated
	 */
	int TEMPLATED_FILE = 5;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE__EXCLUDE_EXPRESSION = FILE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE__GENERATOR_TYPE = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Templated File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATED_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.DataFileImpl <em>Data File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.DataFileImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getDataFile()
	 * @generated
	 */
	int DATA_FILE = 6;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__EXCLUDE_EXPRESSION = FILE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__CONTENT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.URLFileImpl <em>URL File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.URLFileImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getURLFile()
	 * @generated
	 */
	int URL_FILE = 7;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE__EXCLUDE_EXPRESSION = FILE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE__URI = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl <em>Dynamic File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getDynamicFile()
	 * @generated
	 */
	int DYNAMIC_FILE = 8;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE__EXCLUDE_EXPRESSION = FILE__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Execution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE__EXECUTION_URI = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE__TYPE = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE__VARIABLES = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dynamic File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.VariableImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.BooleanExpression <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.BooleanExpression
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl <em>Referencing Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getReferencingBooleanExpression()
	 * @generated
	 */
	int REFERENCING_BOOLEAN_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Execution URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_BOOLEAN_EXPRESSION__TYPE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referencing Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_BOOLEAN_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.InlineBooleanExpressionImpl <em>Inline Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.InlineBooleanExpressionImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getInlineBooleanExpression()
	 * @generated
	 */
	int INLINE_BOOLEAN_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_BOOLEAN_EXPRESSION__TYPE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_BOOLEAN_EXPRESSION__EXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inline Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_BOOLEAN_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl <em>JDT Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getJDTProject()
	 * @generated
	 */
	int JDT_PROJECT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT__RESOURCES = PROJECT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT__EXCLUDE_EXPRESSION = PROJECT__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT__SOURCE_FRAGMENTS = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT__COMPILATION_UNITS = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JDT Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDT_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.SourceFragmentImpl <em>Source Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.SourceFragmentImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getSourceFragment()
	 * @generated
	 */
	int SOURCE_FRAGMENT = 14;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT__EXCLUDE_EXPRESSION = EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT__FOLDER = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT__NAME = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FRAGMENT_FEATURE_COUNT = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.CompilationUnitImpl
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__EXCLUDE_EXPRESSION = EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Packagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGENAME = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FILE = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sourcefragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__SOURCEFRAGMENT = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = EXCLUDEABLE_ELEMENT_MIXIN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Type
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 20;

	/**
	 * The meta object id for the '<em>Generator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.rrobot.model.task.Generator
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 21;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 18;

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.RobotTask <em>Robot Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Task</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.RobotTask
	 * @generated
	 */
	EClass getRobotTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.RobotTask#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.RobotTask#getProjects()
	 * @see #getRobotTask()
	 * @generated
	 */
	EReference getRobotTask_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.RobotTask#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.RobotTask#getVariables()
	 * @see #getRobotTask()
	 * @generated
	 */
	EReference getRobotTask_Variables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.Project#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Project#getResources()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.rrobot.model.task.Project#getExcludeExpression <em>Exclude Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Project#getExcludeExpression()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ExcludeExpression();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.Folder#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Folder#getChildren()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor" serializeable="false"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.TemplatedFile <em>Templated File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Templated File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.TemplatedFile
	 * @generated
	 */
	EClass getTemplatedFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Type</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.TemplatedFile#getGeneratorType()
	 * @see #getTemplatedFile()
	 * @generated
	 */
	EAttribute getTemplatedFile_GeneratorType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.DataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DataFile
	 * @generated
	 */
	EClass getDataFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.DataFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DataFile#getContent()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_Content();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.URLFile <em>URL File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.URLFile
	 * @generated
	 */
	EClass getURLFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.URLFile#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.URLFile#getUri()
	 * @see #getURLFile()
	 * @generated
	 */
	EAttribute getURLFile_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile <em>Dynamic File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DynamicFile
	 * @generated
	 */
	EClass getDynamicFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getExecutionURI <em>Execution URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution URI</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getExecutionURI()
	 * @see #getDynamicFile()
	 * @generated
	 */
	EAttribute getDynamicFile_ExecutionURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getType()
	 * @see #getDynamicFile()
	 * @generated
	 */
	EAttribute getDynamicFile_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.DynamicFile#getVariables()
	 * @see #getDynamicFile()
	 * @generated
	 */
	EReference getDynamicFile_Variables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.Variable#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Variable#getKey()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.Variable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Variable#getDefaultValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.Variable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Variable#getDescription()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression <em>Referencing Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencing Boolean Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression
	 * @generated
	 */
	EClass getReferencingBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getExecutionURI <em>Execution URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution URI</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getExecutionURI()
	 * @see #getReferencingBooleanExpression()
	 * @generated
	 */
	EAttribute getReferencingBooleanExpression_ExecutionURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression#getType()
	 * @see #getReferencingBooleanExpression()
	 * @generated
	 */
	EAttribute getReferencingBooleanExpression_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression <em>Inline Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Boolean Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression
	 * @generated
	 */
	EClass getInlineBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression#getType()
	 * @see #getInlineBooleanExpression()
	 * @generated
	 */
	EAttribute getInlineBooleanExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression#getExpression()
	 * @see #getInlineBooleanExpression()
	 * @generated
	 */
	EAttribute getInlineBooleanExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.JDTProject <em>JDT Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDT Project</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.JDTProject
	 * @generated
	 */
	EClass getJDTProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.JDTProject#getSourceFragments <em>Source Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Fragments</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.JDTProject#getSourceFragments()
	 * @see #getJDTProject()
	 * @generated
	 */
	EReference getJDTProject_SourceFragments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.rrobot.model.task.JDTProject#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.JDTProject#getCompilationUnits()
	 * @see #getJDTProject()
	 * @generated
	 */
	EReference getJDTProject_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment <em>Source Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Fragment</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.SourceFragment
	 * @generated
	 */
	EClass getSourceFragment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Folder</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getFolder()
	 * @see #getSourceFragment()
	 * @generated
	 */
	EReference getSourceFragment_Folder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getName()
	 * @see #getSourceFragment()
	 * @generated
	 */
	EAttribute getSourceFragment_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getPackagename <em>Packagename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packagename</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getPackagename()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Packagename();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getFile()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_File();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getSourcefragment <em>Sourcefragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sourcefragment</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getSourcefragment()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Sourcefragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin <em>Excludeable Element Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludeable Element Mixin</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin
	 * @generated
	 */
	EClass getExcludeableElementMixin();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin#getExcludeExpression <em>Exclude Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Expression</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin#getExcludeExpression()
	 * @see #getExcludeableElementMixin()
	 * @generated
	 */
	EReference getExcludeableElementMixin_ExcludeExpression();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.fx.ide.rrobot.model.task.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generator</em>'.
	 * @see org.eclipse.fx.ide.rrobot.model.task.Generator
	 * @model instanceClass="at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator" typeParameters="F"
	 * @generated
	 */
	EDataType getGenerator();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException" serializeable="false"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskFactory getTaskFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.RobotTaskImpl <em>Robot Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.RobotTaskImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getRobotTask()
		 * @generated
		 */
		EClass ROBOT_TASK = eINSTANCE.getRobotTask();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TASK__PROJECTS = eINSTANCE.getRobotTask_Projects();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TASK__VARIABLES = eINSTANCE.getRobotTask_Variables();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ProjectImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

		/**
		 * The meta object literal for the '<em><b>Exclude Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__EXCLUDE_EXPRESSION = eINSTANCE.getProject_ExcludeExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ResourceImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.FolderImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CHILDREN = eINSTANCE.getFolder_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.FileImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl <em>Templated File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TemplatedFileImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getTemplatedFile()
		 * @generated
		 */
		EClass TEMPLATED_FILE = eINSTANCE.getTemplatedFile();

		/**
		 * The meta object literal for the '<em><b>Generator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATED_FILE__GENERATOR_TYPE = eINSTANCE.getTemplatedFile_GeneratorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.DataFileImpl <em>Data File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.DataFileImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getDataFile()
		 * @generated
		 */
		EClass DATA_FILE = eINSTANCE.getDataFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__CONTENT = eINSTANCE.getDataFile_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.URLFileImpl <em>URL File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.URLFileImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getURLFile()
		 * @generated
		 */
		EClass URL_FILE = eINSTANCE.getURLFile();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_FILE__URI = eINSTANCE.getURLFile_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl <em>Dynamic File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.DynamicFileImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getDynamicFile()
		 * @generated
		 */
		EClass DYNAMIC_FILE = eINSTANCE.getDynamicFile();

		/**
		 * The meta object literal for the '<em><b>Execution URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_FILE__EXECUTION_URI = eINSTANCE.getDynamicFile_ExecutionURI();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_FILE__TYPE = eINSTANCE.getDynamicFile_Type();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FILE__VARIABLES = eINSTANCE.getDynamicFile_Variables();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.VariableImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__KEY = eINSTANCE.getVariable_Key();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFAULT_VALUE = eINSTANCE.getVariable_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DESCRIPTION = eINSTANCE.getVariable_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.BooleanExpression <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.BooleanExpression
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl <em>Referencing Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.ReferencingBooleanExpressionImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getReferencingBooleanExpression()
		 * @generated
		 */
		EClass REFERENCING_BOOLEAN_EXPRESSION = eINSTANCE.getReferencingBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Execution URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI = eINSTANCE.getReferencingBooleanExpression_ExecutionURI();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCING_BOOLEAN_EXPRESSION__TYPE = eINSTANCE.getReferencingBooleanExpression_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.InlineBooleanExpressionImpl <em>Inline Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.InlineBooleanExpressionImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getInlineBooleanExpression()
		 * @generated
		 */
		EClass INLINE_BOOLEAN_EXPRESSION = eINSTANCE.getInlineBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_BOOLEAN_EXPRESSION__TYPE = eINSTANCE.getInlineBooleanExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_BOOLEAN_EXPRESSION__EXPRESSION = eINSTANCE.getInlineBooleanExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl <em>JDT Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.JDTProjectImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getJDTProject()
		 * @generated
		 */
		EClass JDT_PROJECT = eINSTANCE.getJDTProject();

		/**
		 * The meta object literal for the '<em><b>Source Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDT_PROJECT__SOURCE_FRAGMENTS = eINSTANCE.getJDTProject_SourceFragments();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDT_PROJECT__COMPILATION_UNITS = eINSTANCE.getJDTProject_CompilationUnits();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.SourceFragmentImpl <em>Source Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.SourceFragmentImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getSourceFragment()
		 * @generated
		 */
		EClass SOURCE_FRAGMENT = eINSTANCE.getSourceFragment();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FRAGMENT__FOLDER = eINSTANCE.getSourceFragment_Folder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_FRAGMENT__NAME = eINSTANCE.getSourceFragment_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.CompilationUnitImpl
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Packagename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__PACKAGENAME = eINSTANCE.getCompilationUnit_Packagename();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__FILE = eINSTANCE.getCompilationUnit_File();

		/**
		 * The meta object literal for the '<em><b>Sourcefragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__SOURCEFRAGMENT = eINSTANCE.getCompilationUnit_Sourcefragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin <em>Excludeable Element Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getExcludeableElementMixin()
		 * @generated
		 */
		EClass EXCLUDEABLE_ELEMENT_MIXIN = eINSTANCE.getExcludeableElementMixin();

		/**
		 * The meta object literal for the '<em><b>Exclude Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION = eINSTANCE.getExcludeableElementMixin_ExcludeExpression();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.Type
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Generator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.rrobot.model.task.Generator
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getGenerator()
		 * @generated
		 */
		EDataType GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see org.eclipse.fx.ide.rrobot.model.task.impl.TaskPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

	}

} //TaskPackage
