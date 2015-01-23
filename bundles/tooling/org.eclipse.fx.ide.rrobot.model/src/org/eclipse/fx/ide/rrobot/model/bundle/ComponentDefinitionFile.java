/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getComponentClass <em>Component Class</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getServiceInterfaceList <em>Service Interface List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getReferenceList <em>Reference List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getComponentDefinitionFile()
 * @model
 * @generated
 */
public interface ComponentDefinitionFile extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getComponentDefinitionFile_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Component Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Class</em>' attribute.
	 * @see #setComponentClass(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getComponentDefinitionFile_ComponentClass()
	 * @model
	 * @generated
	 */
	String getComponentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile#getComponentClass <em>Component Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Class</em>' attribute.
	 * @see #getComponentClass()
	 * @generated
	 */
	void setComponentClass(String value);

	/**
	 * Returns the value of the '<em><b>Service Interface List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Interface List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interface List</em>' attribute list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getComponentDefinitionFile_ServiceInterfaceList()
	 * @model
	 * @generated
	 */
	EList<String> getServiceInterfaceList();

	/**
	 * Returns the value of the '<em><b>Reference List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.ComponentReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference List</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getComponentDefinitionFile_ReferenceList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentReference> getReferenceList();
} // ComponentDefinitionFile
