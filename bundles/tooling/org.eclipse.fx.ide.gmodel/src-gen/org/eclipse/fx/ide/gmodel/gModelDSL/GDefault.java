/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDefault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getStringVal <em>String Val</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getIntVal <em>Int Val</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDefault()
 * @model
 * @generated
 */
public interface GDefault extends EObject
{
  /**
   * Returns the value of the '<em><b>String Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Val</em>' attribute.
   * @see #setStringVal(String)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDefault_StringVal()
   * @model
   * @generated
   */
  String getStringVal();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getStringVal <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Val</em>' attribute.
   * @see #getStringVal()
   * @generated
   */
  void setStringVal(String value);

  /**
   * Returns the value of the '<em><b>Int Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Val</em>' attribute.
   * @see #setIntVal(int)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDefault_IntVal()
   * @model
   * @generated
   */
  int getIntVal();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDefault#getIntVal <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Val</em>' attribute.
   * @see #getIntVal()
   * @generated
   */
  void setIntVal(int value);

} // GDefault
