/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDomain Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getBuiltIn <em>Built In</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#isList <em>List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty()
 * @model
 * @generated
 */
public interface GDomainProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Built In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Built In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In</em>' attribute.
   * @see #setBuiltIn(String)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty_BuiltIn()
   * @model
   * @generated
   */
  String getBuiltIn();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getBuiltIn <em>Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In</em>' attribute.
   * @see #getBuiltIn()
   * @generated
   */
  void setBuiltIn(String value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

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
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(GDefault)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty_DefaultValue()
   * @model containment="true"
   * @generated
   */
  GDefault getDefaultValue();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(GDefault value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(GDomainElement)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainProperty_Ref()
   * @model
   * @generated
   */
  GDomainElement getRef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainProperty#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(GDomainElement value);

} // GDomainProperty
