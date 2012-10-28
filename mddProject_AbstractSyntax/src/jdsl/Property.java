/**
 */
package jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link jdsl.Property#getAccessModifer <em>Access Modifer</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(Type)
	 * @see jdsl.JdslPackage#getProperty_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	Type getDatatype();

	/**
	 * Sets the value of the '{@link jdsl.Property#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Type value);

	/**
	 * Returns the value of the '<em><b>Access Modifer</b></em>' attribute.
	 * The literals are from the enumeration {@link jdsl.AccessLevelEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Modifer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Modifer</em>' attribute.
	 * @see jdsl.AccessLevelEnum
	 * @see #setAccessModifer(AccessLevelEnum)
	 * @see jdsl.JdslPackage#getProperty_AccessModifer()
	 * @model required="true"
	 * @generated
	 */
	AccessLevelEnum getAccessModifer();

	/**
	 * Sets the value of the '{@link jdsl.Property#getAccessModifer <em>Access Modifer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Modifer</em>' attribute.
	 * @see jdsl.AccessLevelEnum
	 * @see #getAccessModifer()
	 * @generated
	 */
	void setAccessModifer(AccessLevelEnum value);

} // Property
