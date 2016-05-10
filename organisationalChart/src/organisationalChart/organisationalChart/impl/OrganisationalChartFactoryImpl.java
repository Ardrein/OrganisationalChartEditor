/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import organisationalChart.organisationalChart.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganisationalChartFactoryImpl extends EFactoryImpl implements OrganisationalChartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrganisationalChartFactory init() {
		try {
			OrganisationalChartFactory theOrganisationalChartFactory = (OrganisationalChartFactory)EPackage.Registry.INSTANCE.getEFactory("http://organisationalChart"); 
			if (theOrganisationalChartFactory != null) {
				return theOrganisationalChartFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrganisationalChartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalChartFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrganisationalChartPackage.ORGANISATION: return createOrganisation();
			case OrganisationalChartPackage.ORGANISATIONAL_UNIT: return createOrganisational_Unit();
			case OrganisationalChartPackage.ROLE: return createRole();
			case OrganisationalChartPackage.INDIVIDUAL_ROLE: return createIndividual_Role();
			case OrganisationalChartPackage.TEAM_ROLE: return createTeam_Role();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisational_Unit createOrganisational_Unit() {
		Organisational_UnitImpl organisational_Unit = new Organisational_UnitImpl();
		return organisational_Unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual_Role createIndividual_Role() {
		Individual_RoleImpl individual_Role = new Individual_RoleImpl();
		return individual_Role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team_Role createTeam_Role() {
		Team_RoleImpl team_Role = new Team_RoleImpl();
		return team_Role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalChartPackage getOrganisationalChartPackage() {
		return (OrganisationalChartPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static OrganisationalChartPackage getPackage() {
		return OrganisationalChartPackage.eINSTANCE;
	}

} //OrganisationalChartFactoryImpl
