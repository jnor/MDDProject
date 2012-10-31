/**
 */
package jdsl.impl;

import jdsl.AccessLevelEnum;
import jdsl.JdslPackage;
import jdsl.Property;
import jdsl.TypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jdsl.impl.PropertyImpl#getAccessModifer <em>Access Modifer</em>}</li>
 *   <li>{@link jdsl.impl.PropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The default value of the '{@link #getAccessModifer() <em>Access Modifer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifer()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevelEnum ACCESS_MODIFER_EDEFAULT = AccessLevelEnum.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessModifer() <em>Access Modifer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessModifer()
	 * @generated
	 * @ordered
	 */
	protected AccessLevelEnum accessModifer = ACCESS_MODIFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeEnum TYPE_EDEFAULT = TypeEnum.CHAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeEnum type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdslPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevelEnum getAccessModifer() {
		return accessModifer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessModifer(AccessLevelEnum newAccessModifer) {
		AccessLevelEnum oldAccessModifer = accessModifer;
		accessModifer = newAccessModifer == null ? ACCESS_MODIFER_EDEFAULT : newAccessModifer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.PROPERTY__ACCESS_MODIFER, oldAccessModifer, accessModifer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeEnum newType) {
		TypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				return getAccessModifer();
			case JdslPackage.PROPERTY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				setAccessModifer((AccessLevelEnum)newValue);
				return;
			case JdslPackage.PROPERTY__TYPE:
				setType((TypeEnum)newValue);
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
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				setAccessModifer(ACCESS_MODIFER_EDEFAULT);
				return;
			case JdslPackage.PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				return accessModifer != ACCESS_MODIFER_EDEFAULT;
			case JdslPackage.PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (accessModifer: ");
		result.append(accessModifer);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
