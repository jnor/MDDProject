/**
 */
package jdsl.impl;

import java.util.Collection;

import jdsl.ContentType;
import jdsl.JdslPackage;
import jdsl.Property;
import jdsl.User;
import jdsl.Version;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jdsl.impl.ContentTypeImpl#getHasProperties <em>Has Properties</em>}</li>
 *   <li>{@link jdsl.impl.ContentTypeImpl#getHasVersions <em>Has Versions</em>}</li>
 *   <li>{@link jdsl.impl.ContentTypeImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link jdsl.impl.ContentTypeImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link jdsl.impl.ContentTypeImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentTypeImpl extends NamedElementImpl implements ContentType {
	/**
	 * The cached value of the '{@link #getHasProperties() <em>Has Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasProperties;

	/**
	 * The cached value of the '{@link #getHasVersions() <em>Has Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> hasVersions;

	/**
	 * The cached value of the '{@link #getModifiedBy() <em>Modified By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected User modifiedBy;

	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final int GUID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected int guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdslPackage.Literals.CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getHasProperties() {
		if (hasProperties == null) {
			hasProperties = new EObjectContainmentEList<Property>(Property.class, this, JdslPackage.CONTENT_TYPE__HAS_PROPERTIES);
		}
		return hasProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Version> getHasVersions() {
		if (hasVersions == null) {
			hasVersions = new EObjectContainmentEList<Version>(Version.class, this, JdslPackage.CONTENT_TYPE__HAS_VERSIONS);
		}
		return hasVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifiedBy(User newModifiedBy, NotificationChain msgs) {
		User oldModifiedBy = modifiedBy;
		modifiedBy = newModifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdslPackage.CONTENT_TYPE__MODIFIED_BY, oldModifiedBy, newModifiedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedBy(User newModifiedBy) {
		if (newModifiedBy != modifiedBy) {
			NotificationChain msgs = null;
			if (modifiedBy != null)
				msgs = ((InternalEObject)modifiedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdslPackage.CONTENT_TYPE__MODIFIED_BY, null, msgs);
			if (newModifiedBy != null)
				msgs = ((InternalEObject)newModifiedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdslPackage.CONTENT_TYPE__MODIFIED_BY, null, msgs);
			msgs = basicSetModifiedBy(newModifiedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.CONTENT_TYPE__MODIFIED_BY, newModifiedBy, newModifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(int newGuid) {
		int oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.CONTENT_TYPE__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdslPackage.CONTENT_TYPE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdslPackage.CONTENT_TYPE__HAS_PROPERTIES:
				return ((InternalEList<?>)getHasProperties()).basicRemove(otherEnd, msgs);
			case JdslPackage.CONTENT_TYPE__HAS_VERSIONS:
				return ((InternalEList<?>)getHasVersions()).basicRemove(otherEnd, msgs);
			case JdslPackage.CONTENT_TYPE__MODIFIED_BY:
				return basicSetModifiedBy(null, msgs);
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
			case JdslPackage.CONTENT_TYPE__HAS_PROPERTIES:
				return getHasProperties();
			case JdslPackage.CONTENT_TYPE__HAS_VERSIONS:
				return getHasVersions();
			case JdslPackage.CONTENT_TYPE__MODIFIED_BY:
				return getModifiedBy();
			case JdslPackage.CONTENT_TYPE__GUID:
				return getGuid();
			case JdslPackage.CONTENT_TYPE__VISIBLE:
				return isVisible();
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
			case JdslPackage.CONTENT_TYPE__HAS_PROPERTIES:
				getHasProperties().clear();
				getHasProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case JdslPackage.CONTENT_TYPE__HAS_VERSIONS:
				getHasVersions().clear();
				getHasVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case JdslPackage.CONTENT_TYPE__MODIFIED_BY:
				setModifiedBy((User)newValue);
				return;
			case JdslPackage.CONTENT_TYPE__GUID:
				setGuid((Integer)newValue);
				return;
			case JdslPackage.CONTENT_TYPE__VISIBLE:
				setVisible((Boolean)newValue);
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
			case JdslPackage.CONTENT_TYPE__HAS_PROPERTIES:
				getHasProperties().clear();
				return;
			case JdslPackage.CONTENT_TYPE__HAS_VERSIONS:
				getHasVersions().clear();
				return;
			case JdslPackage.CONTENT_TYPE__MODIFIED_BY:
				setModifiedBy((User)null);
				return;
			case JdslPackage.CONTENT_TYPE__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case JdslPackage.CONTENT_TYPE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case JdslPackage.CONTENT_TYPE__HAS_PROPERTIES:
				return hasProperties != null && !hasProperties.isEmpty();
			case JdslPackage.CONTENT_TYPE__HAS_VERSIONS:
				return hasVersions != null && !hasVersions.isEmpty();
			case JdslPackage.CONTENT_TYPE__MODIFIED_BY:
				return modifiedBy != null;
			case JdslPackage.CONTENT_TYPE__GUID:
				return guid != GUID_EDEFAULT;
			case JdslPackage.CONTENT_TYPE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
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
		result.append(" (guid: ");
		result.append(guid);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //ContentTypeImpl
