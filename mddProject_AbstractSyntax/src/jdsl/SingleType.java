/**
 */
package jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.SingleType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getSingleType()
 * @model
 * @generated
 */
public interface SingleType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jdsl.TypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jdsl.TypeEnum
	 * @see #setType(TypeEnum)
	 * @see jdsl.JdslPackage#getSingleType_Type()
	 * @model
	 * @generated
	 */
	TypeEnum getType();

	/**
	 * Sets the value of the '{@link jdsl.SingleType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jdsl.TypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeEnum value);

} // SingleType
