/**
 */
package jdsl.impl;

import java.util.Collection;

import jdsl.JdslPackage;
import jdsl.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jdsl.impl.RoleImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link jdsl.impl.RoleImpl#isIsAdmin <em>Is Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> types;

	/**
	 * The default value of the '{@link #isIsAdmin() <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAdmin() <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAdmin()
	 * @generated
	 * @ordered
	 */
	protected boolean isAdmin = IS_ADMIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdslPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypes() {
		if (types == null) {
			types = new EDataTypeUniqueEList<String>(String.class, this, JdslPackage.ROLE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAdmin() {
		return isAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAdmin(boolean newIsAdmin) {
		boolean oldIsAdmin = isAdmin;
		isAdmin = newIsAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.ROLE__IS_ADMIN, oldIsAdmin, isAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdslPackage.ROLE__TYPES:
				return getTypes();
			case JdslPackage.ROLE__IS_ADMIN:
				return isIsAdmin();
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
			case JdslPackage.ROLE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends String>)newValue);
				return;
			case JdslPackage.ROLE__IS_ADMIN:
				setIsAdmin((Boolean)newValue);
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
			case JdslPackage.ROLE__TYPES:
				getTypes().clear();
				return;
			case JdslPackage.ROLE__IS_ADMIN:
				setIsAdmin(IS_ADMIN_EDEFAULT);
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
			case JdslPackage.ROLE__TYPES:
				return types != null && !types.isEmpty();
			case JdslPackage.ROLE__IS_ADMIN:
				return isAdmin != IS_ADMIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (types: ");
		result.append(types);
		result.append(", isAdmin: ");
		result.append(isAdmin);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
