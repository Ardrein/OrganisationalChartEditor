/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import organisationalChart.organisationalChart.Individual_Role;
import organisationalChart.organisationalChart.OrganisationalChartPackage;
import organisationalChart.organisationalChart.Organisational_Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisational Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.impl.Organisational_UnitImpl#getPersonnel <em>Personnel</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.Organisational_UnitImpl#getDirector <em>Director</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.Organisational_UnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Organisational_UnitImpl extends EObjectImpl implements Organisational_Unit {
	/**
	 * The cached value of the '{@link #getPersonnel() <em>Personnel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnel()
	 * @generated
	 * @ordered
	 */
	protected EList personnel;

	/**
	 * The cached value of the '{@link #getDirector() <em>Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirector()
	 * @generated
	 * @ordered
	 */
	protected Individual_Role director;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Organisational_UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrganisationalChartPackage.Literals.ORGANISATIONAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersonnel() {
		if (personnel == null) {
			personnel = new EObjectResolvingEList(Individual_Role.class, this, OrganisationalChartPackage.ORGANISATIONAL_UNIT__PERSONNEL);
		}
		return personnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual_Role getDirector() {
		if (director != null && director.eIsProxy()) {
			InternalEObject oldDirector = (InternalEObject)director;
			director = (Individual_Role)eResolveProxy(oldDirector);
			if (director != oldDirector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR, oldDirector, director));
			}
		}
		return director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual_Role basicGetDirector() {
		return director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirector(Individual_Role newDirector) {
		Individual_Role oldDirector = director;
		director = newDirector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR, oldDirector, director));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganisationalChartPackage.ORGANISATIONAL_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__PERSONNEL:
				return getPersonnel();
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR:
				if (resolve) return getDirector();
				return basicGetDirector();
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__PERSONNEL:
				getPersonnel().clear();
				getPersonnel().addAll((Collection)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR:
				setDirector((Individual_Role)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__PERSONNEL:
				getPersonnel().clear();
				return;
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR:
				setDirector((Individual_Role)null);
				return;
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__PERSONNEL:
				return personnel != null && !personnel.isEmpty();
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__DIRECTOR:
				return director != null;
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Organisational_UnitImpl
