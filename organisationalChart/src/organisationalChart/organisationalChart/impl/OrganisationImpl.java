/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import organisationalChart.organisationalChart.Individual_Role;
import organisationalChart.organisationalChart.Organisation;
import organisationalChart.organisationalChart.OrganisationalChartPackage;
import organisationalChart.organisationalChart.Organisational_Unit;
import organisationalChart.organisationalChart.Role;
import organisationalChart.organisationalChart.Team_Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.impl.OrganisationImpl#getCEO <em>CEO</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.OrganisationImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.OrganisationImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.OrganisationImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.impl.OrganisationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationImpl extends EObjectImpl implements Organisation {
	/**
	 * The cached value of the '{@link #getCEO() <em>CEO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEO()
	 * @generated
	 * @ordered
	 */
	protected Role ceo;

	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList departments;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList employees;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList teams;

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
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OrganisationalChartPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getCEO() {
		if (ceo != null && ceo.eIsProxy()) {
			InternalEObject oldCEO = (InternalEObject)ceo;
			ceo = (Role)eResolveProxy(oldCEO);
			if (ceo != oldCEO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganisationalChartPackage.ORGANISATION__CEO, oldCEO, ceo));
			}
		}
		return ceo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetCEO() {
		return ceo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEO(Role newCEO) {
		Role oldCEO = ceo;
		ceo = newCEO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganisationalChartPackage.ORGANISATION__CEO, oldCEO, ceo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDepartments() {
		if (departments == null) {
			departments = new EObjectContainmentEList(Organisational_Unit.class, this, OrganisationalChartPackage.ORGANISATION__DEPARTMENTS);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList(Individual_Role.class, this, OrganisationalChartPackage.ORGANISATION__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList(Team_Role.class, this, OrganisationalChartPackage.ORGANISATION__TEAMS);
		}
		return teams;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrganisationalChartPackage.ORGANISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATION__DEPARTMENTS:
				return ((InternalEList)getDepartments()).basicRemove(otherEnd, msgs);
			case OrganisationalChartPackage.ORGANISATION__EMPLOYEES:
				return ((InternalEList)getEmployees()).basicRemove(otherEnd, msgs);
			case OrganisationalChartPackage.ORGANISATION__TEAMS:
				return ((InternalEList)getTeams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganisationalChartPackage.ORGANISATION__CEO:
				if (resolve) return getCEO();
				return basicGetCEO();
			case OrganisationalChartPackage.ORGANISATION__DEPARTMENTS:
				return getDepartments();
			case OrganisationalChartPackage.ORGANISATION__EMPLOYEES:
				return getEmployees();
			case OrganisationalChartPackage.ORGANISATION__TEAMS:
				return getTeams();
			case OrganisationalChartPackage.ORGANISATION__NAME:
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
			case OrganisationalChartPackage.ORGANISATION__CEO:
				setCEO((Role)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATION__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATION__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATION__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection)newValue);
				return;
			case OrganisationalChartPackage.ORGANISATION__NAME:
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
			case OrganisationalChartPackage.ORGANISATION__CEO:
				setCEO((Role)null);
				return;
			case OrganisationalChartPackage.ORGANISATION__DEPARTMENTS:
				getDepartments().clear();
				return;
			case OrganisationalChartPackage.ORGANISATION__EMPLOYEES:
				getEmployees().clear();
				return;
			case OrganisationalChartPackage.ORGANISATION__TEAMS:
				getTeams().clear();
				return;
			case OrganisationalChartPackage.ORGANISATION__NAME:
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
			case OrganisationalChartPackage.ORGANISATION__CEO:
				return ceo != null;
			case OrganisationalChartPackage.ORGANISATION__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
			case OrganisationalChartPackage.ORGANISATION__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case OrganisationalChartPackage.ORGANISATION__TEAMS:
				return teams != null && !teams.isEmpty();
			case OrganisationalChartPackage.ORGANISATION__NAME:
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

} //OrganisationImpl
