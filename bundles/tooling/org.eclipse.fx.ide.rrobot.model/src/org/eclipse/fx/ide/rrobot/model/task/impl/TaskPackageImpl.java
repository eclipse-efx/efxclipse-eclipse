/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;


import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage;
import org.eclipse.fx.ide.rrobot.model.bundle.impl.BundlePackageImpl;
import org.eclipse.fx.ide.rrobot.model.task.BooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit;
import org.eclipse.fx.ide.rrobot.model.task.DataFile;
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile;
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin;
import org.eclipse.fx.ide.rrobot.model.task.File;
import org.eclipse.fx.ide.rrobot.model.task.Folder;
import org.eclipse.fx.ide.rrobot.model.task.Generator;
import org.eclipse.fx.ide.rrobot.model.task.InlineBooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.JDTProject;
import org.eclipse.fx.ide.rrobot.model.task.Project;
import org.eclipse.fx.ide.rrobot.model.task.ReferencingBooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.RobotTask;
import org.eclipse.fx.ide.rrobot.model.task.SourceFragment;
import org.eclipse.fx.ide.rrobot.model.task.TaskFactory;
import org.eclipse.fx.ide.rrobot.model.task.TaskPackage;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;
import org.eclipse.fx.ide.rrobot.model.task.URLFile;
import org.eclipse.fx.ide.rrobot.model.task.Variable;

import org.eclipse.fx.ide.rrobot.model.task.Resource;
import org.eclipse.fx.ide.rrobot.model.task.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskPackageImpl extends EPackageImpl implements TaskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templatedFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencingBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdtProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeableElementMixinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType generatorEDataType = null;

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
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskPackageImpl() {
		super(eNS_URI, TaskFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskPackage init() {
		if (isInited) return (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Obtain or create and register package
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaskPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);

		// Create package meta-data objects
		theTaskPackage.createPackageContents();
		theBundlePackage.createPackageContents();

		// Initialize created meta-data
		theTaskPackage.initializePackageContents();
		theBundlePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskPackage.eNS_URI, theTaskPackage);
		return theTaskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotTask() {
		return robotTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotTask_Projects() {
		return (EReference)robotTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotTask_Variables() {
		return (EReference)robotTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Resources() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ExcludeExpression() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Children() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplatedFile() {
		return templatedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplatedFile_GeneratorType() {
		return (EAttribute)templatedFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFile() {
		return dataFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFile_Content() {
		return (EAttribute)dataFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLFile() {
		return urlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLFile_Uri() {
		return (EAttribute)urlFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicFile() {
		return dynamicFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFile_ExecutionURI() {
		return (EAttribute)dynamicFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicFile_Type() {
		return (EAttribute)dynamicFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicFile_Variables() {
		return (EReference)dynamicFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Key() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_DefaultValue() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Description() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencingBooleanExpression() {
		return referencingBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencingBooleanExpression_ExecutionURI() {
		return (EAttribute)referencingBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencingBooleanExpression_Type() {
		return (EAttribute)referencingBooleanExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineBooleanExpression() {
		return inlineBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineBooleanExpression_Type() {
		return (EAttribute)inlineBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineBooleanExpression_Expression() {
		return (EAttribute)inlineBooleanExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJDTProject() {
		return jdtProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJDTProject_SourceFragments() {
		return (EReference)jdtProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJDTProject_CompilationUnits() {
		return (EReference)jdtProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFragment() {
		return sourceFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFragment_Folder() {
		return (EReference)sourceFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFragment_Name() {
		return (EAttribute)sourceFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Packagename() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_File() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Sourcefragment() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeableElementMixin() {
		return excludeableElementMixinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeableElementMixin_ExcludeExpression() {
		return (EReference)excludeableElementMixinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGenerator() {
		return generatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactory getTaskFactory() {
		return (TaskFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		robotTaskEClass = createEClass(ROBOT_TASK);
		createEReference(robotTaskEClass, ROBOT_TASK__PROJECTS);
		createEReference(robotTaskEClass, ROBOT_TASK__VARIABLES);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__RESOURCES);
		createEReference(projectEClass, PROJECT__EXCLUDE_EXPRESSION);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__CHILDREN);

		fileEClass = createEClass(FILE);

		templatedFileEClass = createEClass(TEMPLATED_FILE);
		createEAttribute(templatedFileEClass, TEMPLATED_FILE__GENERATOR_TYPE);

		dataFileEClass = createEClass(DATA_FILE);
		createEAttribute(dataFileEClass, DATA_FILE__CONTENT);

		urlFileEClass = createEClass(URL_FILE);
		createEAttribute(urlFileEClass, URL_FILE__URI);

		dynamicFileEClass = createEClass(DYNAMIC_FILE);
		createEAttribute(dynamicFileEClass, DYNAMIC_FILE__EXECUTION_URI);
		createEAttribute(dynamicFileEClass, DYNAMIC_FILE__TYPE);
		createEReference(dynamicFileEClass, DYNAMIC_FILE__VARIABLES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__KEY);
		createEAttribute(variableEClass, VARIABLE__DEFAULT_VALUE);
		createEAttribute(variableEClass, VARIABLE__DESCRIPTION);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		referencingBooleanExpressionEClass = createEClass(REFERENCING_BOOLEAN_EXPRESSION);
		createEAttribute(referencingBooleanExpressionEClass, REFERENCING_BOOLEAN_EXPRESSION__EXECUTION_URI);
		createEAttribute(referencingBooleanExpressionEClass, REFERENCING_BOOLEAN_EXPRESSION__TYPE);

		inlineBooleanExpressionEClass = createEClass(INLINE_BOOLEAN_EXPRESSION);
		createEAttribute(inlineBooleanExpressionEClass, INLINE_BOOLEAN_EXPRESSION__TYPE);
		createEAttribute(inlineBooleanExpressionEClass, INLINE_BOOLEAN_EXPRESSION__EXPRESSION);

		jdtProjectEClass = createEClass(JDT_PROJECT);
		createEReference(jdtProjectEClass, JDT_PROJECT__SOURCE_FRAGMENTS);
		createEReference(jdtProjectEClass, JDT_PROJECT__COMPILATION_UNITS);

		sourceFragmentEClass = createEClass(SOURCE_FRAGMENT);
		createEReference(sourceFragmentEClass, SOURCE_FRAGMENT__FOLDER);
		createEAttribute(sourceFragmentEClass, SOURCE_FRAGMENT__NAME);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__PACKAGENAME);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__FILE);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__SOURCEFRAGMENT);

		excludeableElementMixinEClass = createEClass(EXCLUDEABLE_ELEMENT_MIXIN);
		createEReference(excludeableElementMixinEClass, EXCLUDEABLE_ELEMENT_MIXIN__EXCLUDE_EXPRESSION);

		// Create enums
		typeEEnum = createEEnum(TYPE);

		// Create data types
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		generatorEDataType = createEDataType(GENERATOR);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(generatorEDataType, "F");

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(this.getExcludeableElementMixin());
		folderEClass.getESuperTypes().add(this.getResource());
		fileEClass.getESuperTypes().add(this.getResource());
		templatedFileEClass.getESuperTypes().add(this.getFile());
		dataFileEClass.getESuperTypes().add(this.getFile());
		urlFileEClass.getESuperTypes().add(this.getFile());
		dynamicFileEClass.getESuperTypes().add(this.getFile());
		referencingBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		inlineBooleanExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		jdtProjectEClass.getESuperTypes().add(this.getProject());
		sourceFragmentEClass.getESuperTypes().add(this.getExcludeableElementMixin());
		compilationUnitEClass.getESuperTypes().add(this.getExcludeableElementMixin());

		// Initialize classes and features; add operations and parameters
		initEClass(robotTaskEClass, RobotTask.class, "RobotTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotTask_Projects(), this.getProject(), null, "projects", null, 0, -1, RobotTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotTask_Variables(), this.getVariable(), null, "variables", null, 0, -1, RobotTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Resources(), this.getResource(), null, "resources", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ExcludeExpression(), this.getBooleanExpression(), null, "excludeExpression", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Children(), this.getResource(), null, "children", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(fileEClass, this.getInputStream(), "getContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "progressMonitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(templatedFileEClass, TemplatedFile.class, "TemplatedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplatedFile_GeneratorType(), ecorePackage.getEString(), "generatorType", null, 0, 1, TemplatedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFileEClass, DataFile.class, "DataFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFile_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, DataFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlFileEClass, URLFile.class, "URLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLFile_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, URLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicFileEClass, DynamicFile.class, "DynamicFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicFile_ExecutionURI(), ecorePackage.getEString(), "executionURI", null, 0, 1, DynamicFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicFile_Type(), ecorePackage.getEString(), "type", null, 0, 1, DynamicFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicFile_Variables(), this.getVariable(), null, "variables", null, 0, -1, DynamicFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Key(), ecorePackage.getEString(), "key", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(booleanExpressionEClass, ecorePackage.getEBoolean(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referencingBooleanExpressionEClass, ReferencingBooleanExpression.class, "ReferencingBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferencingBooleanExpression_ExecutionURI(), ecorePackage.getEString(), "executionURI", null, 0, 1, ReferencingBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferencingBooleanExpression_Type(), ecorePackage.getEString(), "type", null, 0, 1, ReferencingBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineBooleanExpressionEClass, InlineBooleanExpression.class, "InlineBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInlineBooleanExpression_Type(), ecorePackage.getEString(), "type", null, 0, 1, InlineBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineBooleanExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, InlineBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdtProjectEClass, JDTProject.class, "JDTProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJDTProject_SourceFragments(), this.getSourceFragment(), null, "sourceFragments", null, 0, -1, JDTProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDTProject_CompilationUnits(), this.getCompilationUnit(), null, "compilationUnits", null, 0, -1, JDTProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFragmentEClass, SourceFragment.class, "SourceFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceFragment_Folder(), this.getFolder(), null, "folder", null, 0, 1, SourceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceFragment_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourceFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationUnit_Packagename(), ecorePackage.getEString(), "packagename", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_File(), this.getFile(), null, "file", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_Sourcefragment(), this.getSourceFragment(), null, "sourcefragment", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeableElementMixinEClass, ExcludeableElementMixin.class, "ExcludeableElementMixin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludeableElementMixin_ExcludeExpression(), this.getBooleanExpression(), null, "excludeExpression", null, 0, 1, ExcludeableElementMixin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);

		// Initialize data types
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(generatorEDataType, Generator.class, "Generator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TaskPackageImpl
