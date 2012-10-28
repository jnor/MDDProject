/**
 */
package jdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jdsl.ContentModel#getHasElements <em>Has Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see jdsl.JdslPackage#getContentModel()
 * @model
 * @generated
 */
public interface ContentModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Has Elements</b></em>' containment reference list.
	 * The list contents are of type {@link jdsl.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elements</em>' containment reference list.
	 * @see jdsl.JdslPackage#getContentModel_HasElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getHasElements();

} // ContentModel
