/**
 */
package jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.CMS#getAddress_url <em>Address url</em>}</li>
 *   <li>{@link jdsl.CMS#getType <em>Type</em>}</li>
 *   <li>{@link jdsl.CMS#getUsername <em>Username</em>}</li>
 *   <li>{@link jdsl.CMS#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getCMS()
 * @model
 * @generated
 */
public interface CMS extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Address url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address url</em>' attribute.
	 * @see #setAddress_url(String)
	 * @see jdsl.JdslPackage#getCMS_Address_url()
	 * @model
	 * @generated
	 */
	String getAddress_url();

	/**
	 * Sets the value of the '{@link jdsl.CMS#getAddress_url <em>Address url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address url</em>' attribute.
	 * @see #getAddress_url()
	 * @generated
	 */
	void setAddress_url(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jdsl.CMSEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see jdsl.CMSEnum
	 * @see #setType(CMSEnum)
	 * @see jdsl.JdslPackage#getCMS_Type()
	 * @model
	 * @generated
	 */
	CMSEnum getType();

	/**
	 * Sets the value of the '{@link jdsl.CMS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see jdsl.CMSEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(CMSEnum value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see jdsl.JdslPackage#getCMS_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link jdsl.CMS#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see jdsl.JdslPackage#getCMS_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link jdsl.CMS#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // CMS
