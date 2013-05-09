/**
 */
package org.eclipse.fx.ide.rrobot.model.task;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getSourceFragment()
 * @model
 * @generated
 */
public interface SourceFragment extends ExcludeableElementMixin {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' reference.
	 * @see #setFolder(Folder)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getSourceFragment_Folder()
	 * @model
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getFolder <em>Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getSourceFragment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SourceFragment
