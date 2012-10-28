/**
 */
package jdsl.impl;

import jdsl.AccessLevelEnum;
import jdsl.JdslPackage;
import jdsl.Property;
import jdsl.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jdsl.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link jdsl.impl.PropertyImpl#getAccessModifer <em>Access Modifer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Type datatype;

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
	public Type getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(Type newDatatype, NotificationChain msgs) {
		Type oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdslPackage.PROPERTY__DATATYPE, oldDatatype, newDatatype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Type newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdslPackage.PROPERTY__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdslPackage.PROPERTY__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.PROPERTY__DATATYPE, newDatatype, newDatatype));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdslPackage.PROPERTY__DATATYPE:
				return basicSetDatatype(null, msgs);
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
			case JdslPackage.PROPERTY__DATATYPE:
				return getDatatype();
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				return getAccessModifer();
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
			case JdslPackage.PROPERTY__DATATYPE:
				setDatatype((Type)newValue);
				return;
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				setAccessModifer((AccessLevelEnum)newValue);
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
			case JdslPackage.PROPERTY__DATATYPE:
				setDatatype((Type)null);
				return;
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				setAccessModifer(ACCESS_MODIFER_EDEFAULT);
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
			case JdslPackage.PROPERTY__DATATYPE:
				return datatype != null;
			case JdslPackage.PROPERTY__ACCESS_MODIFER:
				return accessModifer != ACCESS_MODIFER_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
