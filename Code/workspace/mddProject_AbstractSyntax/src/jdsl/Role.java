/**
 */
package jdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.Role#getTypes <em>Types</em>}</li>
 *   <li>{@link jdsl.Role#isIsAdmin <em>Is Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see jdsl.JdslPackage#getRole_Types()
	 * @model
	 * @generated
	 */
	EList<String> getTypes();

	/**
	 * Returns the value of the '<em><b>Is Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Admin</em>' attribute.
	 * @see #setIsAdmin(boolean)
	 * @see jdsl.JdslPackage#getRole_IsAdmin()
	 * @model
	 * @generated
	 */
	boolean isIsAdmin();

	/**
	 * Sets the value of the '{@link jdsl.Role#isIsAdmin <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Admin</em>' attribute.
	 * @see #isIsAdmin()
	 * @generated
	 */
	void setIsAdmin(boolean value);

} // Role
