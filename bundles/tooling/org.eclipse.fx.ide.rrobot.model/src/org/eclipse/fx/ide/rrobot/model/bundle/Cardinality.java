/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getCardinality()
 * @model
 * @generated
 */
public enum Cardinality implements Enumerator {
	/**
	 * The '<em><b>SINGLE OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_OPTIONAL(0, "SINGLE_OPTIONAL", "SINGLE_OPTIONAL"),

	/**
	 * The '<em><b>SINGLE REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_REQUIRED(1, "SINGLE_REQUIRED", "SINGLE_REQUIRED"),

	/**
	 * The '<em><b>MULTI OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_OPTIONAL(2, "MULTI_OPTIONAL", "MULTI_OPTIONAL"),

	/**
	 * The '<em><b>MULTI REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_REQUIRED(3, "MULTI_REQUIRED", "MULTI_REQUIRED");

	/**
	 * The '<em><b>SINGLE OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE OPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_OPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_OPTIONAL_VALUE = 0;

	/**
	 * The '<em><b>SINGLE REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_REQUIRED_VALUE = 1;

	/**
	 * The '<em><b>MULTI OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI OPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_OPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_OPTIONAL_VALUE = 2;

	/**
	 * The '<em><b>MULTI REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_REQUIRED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cardinality[] VALUES_ARRAY =
		new Cardinality[] {
			SINGLE_OPTIONAL,
			SINGLE_REQUIRED,
			MULTI_OPTIONAL,
			MULTI_REQUIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Cardinality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cardinality get(int value) {
		switch (value) {
			case SINGLE_OPTIONAL_VALUE: return SINGLE_OPTIONAL;
			case SINGLE_REQUIRED_VALUE: return SINGLE_REQUIRED;
			case MULTI_OPTIONAL_VALUE: return MULTI_OPTIONAL;
			case MULTI_REQUIRED_VALUE: return MULTI_REQUIRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Cardinality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Cardinality
