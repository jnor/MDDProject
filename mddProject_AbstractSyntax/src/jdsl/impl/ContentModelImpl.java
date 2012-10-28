/**
 */
package jdsl.impl;

import java.util.Collection;

import jdsl.ContentModel;
import jdsl.JdslPackage;
import jdsl.NamedElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jdsl.impl.ContentModelImpl#getHasElements <em>Has Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentModelImpl extends NamedElementImpl implements ContentModel {
	/**
	 * The cached value of the '{@link #getHasElements() <em>Has Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> hasElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdslPackage.Literals.CONTENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getHasElements() {
		if (hasElements == null) {
			hasElements = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, JdslPackage.CONTENT_MODEL__HAS_ELEMENTS);
		}
		return hasElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdslPackage.CONTENT_MODEL__HAS_ELEMENTS:
				return ((InternalEList<?>)getHasElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdslPackage.CONTENT_MODEL__HAS_ELEMENTS:
				return getHasElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JdslPackage.CONTENT_MODEL__HAS_ELEMENTS:
				getHasElements().clear();
				getHasElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JdslPackage.CONTENT_MODEL__HAS_ELEMENTS:
				getHasElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JdslPackage.CONTENT_MODEL__HAS_ELEMENTS:
				return hasElements != null && !hasElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentModelImpl
