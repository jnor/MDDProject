/**
 */
package jdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.ContentType#getHasProperties <em>Has Properties</em>}</li>
 *   <li>{@link jdsl.ContentType#getHasVersions <em>Has Versions</em>}</li>
 *   <li>{@link jdsl.ContentType#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link jdsl.ContentType#getGuid <em>Guid</em>}</li>
 *   <li>{@link jdsl.ContentType#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getContentType()
 * @model
 * @generated
 */
public interface ContentType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' containment reference list.
	 * The list contents are of type {@link jdsl.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' containment reference list.
	 * @see jdsl.JdslPackage#getContentType_HasProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getHasProperties();

	/**
	 * Returns the value of the '<em><b>Has Versions</b></em>' containment reference list.
	 * The list contents are of type {@link jdsl.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Versions</em>' containment reference list.
	 * @see jdsl.JdslPackage#getContentType_HasVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getHasVersions();

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By</em>' containment reference.
	 * @see #setModifiedBy(User)
	 * @see jdsl.JdslPackage#getContentType_ModifiedBy()
	 * @model containment="true"
	 * @generated
	 */
	User getModifiedBy();

	/**
	 * Sets the value of the '{@link jdsl.ContentType#getModifiedBy <em>Modified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' containment reference.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(User value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(int)
	 * @see jdsl.JdslPackage#getContentType_Guid()
	 * @model
	 * @generated
	 */
	int getGuid();

	/**
	 * Sets the value of the '{@link jdsl.ContentType#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(int value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see jdsl.JdslPackage#getContentType_Visible()
	 * @model
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link jdsl.ContentType#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // ContentType
