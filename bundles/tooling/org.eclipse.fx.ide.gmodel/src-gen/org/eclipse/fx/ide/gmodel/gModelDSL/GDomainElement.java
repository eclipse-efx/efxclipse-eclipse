/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDomain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getSuperTypeList <em>Super Type List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getPropertyList <em>Property List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainElement()
 * @model
 * @generated
 */
public interface GDomainElement extends EObject
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
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type List</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type List</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type List</em>' reference list.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainElement_SuperTypeList()
   * @model
   * @generated
   */
  EList<GDomainElement> getSuperTypeList();

  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(GDomainMap)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainElement_Map()
   * @model containment="true"
   * @generated
   */
  GDomainMap getMap();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainElement#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(GDomainMap value);

  /**
   * Returns the value of the '<em><b>Property List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property List</em>' containment reference list.
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainElement_PropertyList()
   * @model containment="true"
   * @generated
   */
  EList<GDomainProperty> getPropertyList();

} // GDomainElement
