/**
 */
package org.eclipse.fx.ide.rrobot.model.task;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getPackagename <em>Packagename</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getSourcefragment <em>Sourcefragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends ExcludeableElementMixin {
	/**
	 * Returns the value of the '<em><b>Packagename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packagename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packagename</em>' attribute.
	 * @see #setPackagename(String)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getCompilationUnit_Packagename()
	 * @model
	 * @generated
	 */
	String getPackagename();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getPackagename <em>Packagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packagename</em>' attribute.
	 * @see #getPackagename()
	 * @generated
	 */
	void setPackagename(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(File)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getCompilationUnit_File()
	 * @model containment="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Sourcefragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcefragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcefragment</em>' reference.
	 * @see #setSourcefragment(SourceFragment)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getCompilationUnit_Sourcefragment()
	 * @model
	 * @generated
	 */
	SourceFragment getSourcefragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit#getSourcefragment <em>Sourcefragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcefragment</em>' reference.
	 * @see #getSourcefragment()
	 * @generated
	 */
	void setSourcefragment(SourceFragment value);

} // CompilationUnit
