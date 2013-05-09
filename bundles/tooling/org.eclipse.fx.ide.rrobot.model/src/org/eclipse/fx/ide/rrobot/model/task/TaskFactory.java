/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage
 * @generated
 */
public interface TaskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskFactory eINSTANCE = org.eclipse.fx.ide.rrobot.model.task.impl.TaskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Task</em>'.
	 * @generated
	 */
	RobotTask createRobotTask();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	Folder createFolder();

	/**
	 * Returns a new object of class '<em>Templated File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Templated File</em>'.
	 * @generated
	 */
	TemplatedFile createTemplatedFile();

	/**
	 * Returns a new object of class '<em>Data File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data File</em>'.
	 * @generated
	 */
	DataFile createDataFile();

	/**
	 * Returns a new object of class '<em>URL File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL File</em>'.
	 * @generated
	 */
	URLFile createURLFile();

	/**
	 * Returns a new object of class '<em>Dynamic File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic File</em>'.
	 * @generated
	 */
	DynamicFile createDynamicFile();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Referencing Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referencing Boolean Expression</em>'.
	 * @generated
	 */
	ReferencingBooleanExpression createReferencingBooleanExpression();

	/**
	 * Returns a new object of class '<em>Inline Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Boolean Expression</em>'.
	 * @generated
	 */
	InlineBooleanExpression createInlineBooleanExpression();

	/**
	 * Returns a new object of class '<em>JDT Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JDT Project</em>'.
	 * @generated
	 */
	JDTProject createJDTProject();

	/**
	 * Returns a new object of class '<em>Source Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Fragment</em>'.
	 * @generated
	 */
	SourceFragment createSourceFragment();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskPackage getTaskPackage();

} //TaskFactory
