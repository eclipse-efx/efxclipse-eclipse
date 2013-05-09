/**
 */
package org.eclipse.fx.ide.rrobot.model.task.impl;

import org.eclipse.fx.ide.rrobot.model.task.*;
import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit;
import org.eclipse.fx.ide.rrobot.model.task.DataFile;
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile;
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


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskFactoryImpl extends EFactoryImpl implements TaskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskFactory init() {
		try {
			TaskFactory theTaskFactory = (TaskFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.efxclipse.org/rrobot/task/1.0"); 
			if (theTaskFactory != null) {
				return theTaskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaskPackage.ROBOT_TASK: return createRobotTask();
			case TaskPackage.PROJECT: return createProject();
			case TaskPackage.FOLDER: return createFolder();
			case TaskPackage.TEMPLATED_FILE: return createTemplatedFile();
			case TaskPackage.DATA_FILE: return createDataFile();
			case TaskPackage.URL_FILE: return createURLFile();
			case TaskPackage.DYNAMIC_FILE: return createDynamicFile();
			case TaskPackage.VARIABLE: return createVariable();
			case TaskPackage.REFERENCING_BOOLEAN_EXPRESSION: return createReferencingBooleanExpression();
			case TaskPackage.INLINE_BOOLEAN_EXPRESSION: return createInlineBooleanExpression();
			case TaskPackage.JDT_PROJECT: return createJDTProject();
			case TaskPackage.SOURCE_FRAGMENT: return createSourceFragment();
			case TaskPackage.COMPILATION_UNIT: return createCompilationUnit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TaskPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case TaskPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case TaskPackage.GENERATOR:
				return createGeneratorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TaskPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case TaskPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case TaskPackage.GENERATOR:
				return convertGeneratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotTask createRobotTask() {
		RobotTaskImpl robotTask = new RobotTaskImpl();
		return robotTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatedFile createTemplatedFile() {
		TemplatedFileImpl templatedFile = new TemplatedFileImpl();
		return templatedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFile createDataFile() {
		DataFileImpl dataFile = new DataFileImpl();
		return dataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLFile createURLFile() {
		URLFileImpl urlFile = new URLFileImpl();
		return urlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicFile createDynamicFile() {
		DynamicFileImpl dynamicFile = new DynamicFileImpl();
		return dynamicFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingBooleanExpression createReferencingBooleanExpression() {
		ReferencingBooleanExpressionImpl referencingBooleanExpression = new ReferencingBooleanExpressionImpl();
		return referencingBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineBooleanExpression createInlineBooleanExpression() {
		InlineBooleanExpressionImpl inlineBooleanExpression = new InlineBooleanExpressionImpl();
		return inlineBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JDTProject createJDTProject() {
		JDTProjectImpl jdtProject = new JDTProjectImpl();
		return jdtProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFragment createSourceFragment() {
		SourceFragmentImpl sourceFragment = new SourceFragmentImpl();
		return sourceFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator<?> createGeneratorFromString(EDataType eDataType, String initialValue) {
		return (Generator<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPackage getTaskPackage() {
		return (TaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskPackage getPackage() {
		return TaskPackage.eINSTANCE;
	}

} //TaskFactoryImpl
