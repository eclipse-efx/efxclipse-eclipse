/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getTypeList <em>Type List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGModel()
 * @model
 * @generated
 */
public interface GModel extends EObject
{
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
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type List</em>' containment reference list.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGModel_TypeList()
   * @model containment="true"
   * @generated
   */
  EList<GDomainElement> getTypeList();

} // GModel
