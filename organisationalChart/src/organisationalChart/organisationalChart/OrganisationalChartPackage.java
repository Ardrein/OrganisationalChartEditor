/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see organisationalChart.organisationalChart.OrganisationalChartFactory
 * @model kind="package"
 * @generated
 */
public interface OrganisationalChartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organisationalChart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://organisationalChart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "organisationalChart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganisationalChartPackage eINSTANCE = organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link organisationalChart.organisationalChart.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see organisationalChart.organisationalChart.impl.OrganisationImpl
	 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 0;

	/**
	 * The feature id for the '<em><b>CEO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CEO = 0;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DEPARTMENTS = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EMPLOYEES = 2;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__TEAMS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link organisationalChart.organisationalChart.impl.Organisational_UnitImpl <em>Organisational Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see organisationalChart.organisationalChart.impl.Organisational_UnitImpl
	 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getOrganisational_Unit()
	 * @generated
	 */
	int ORGANISATIONAL_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Personnel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_UNIT__PERSONNEL = 0;

	/**
	 * The feature id for the '<em><b>Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_UNIT__DIRECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_UNIT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Organisational Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONAL_UNIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link organisationalChart.organisationalChart.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see organisationalChart.organisationalChart.impl.RoleImpl
	 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 2;

	/**
	 * The feature id for the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUPERIOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link organisationalChart.organisationalChart.impl.Individual_RoleImpl <em>Individual Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see organisationalChart.organisationalChart.impl.Individual_RoleImpl
	 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getIndividual_Role()
	 * @generated
	 */
	int INDIVIDUAL_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ROLE__SUPERIOR = ROLE__SUPERIOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ROLE__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Individual Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link organisationalChart.organisationalChart.impl.Team_RoleImpl <em>Team Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see organisationalChart.organisationalChart.impl.Team_RoleImpl
	 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getTeam_Role()
	 * @generated
	 */
	int TEAM_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ROLE__SUPERIOR = ROLE__SUPERIOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ROLE__MEMBERS = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Team Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link organisationalChart.organisationalChart.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see organisationalChart.organisationalChart.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the reference '{@link organisationalChart.organisationalChart.Organisation#getCEO <em>CEO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CEO</em>'.
	 * @see organisationalChart.organisationalChart.Organisation#getCEO()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_CEO();

	/**
	 * Returns the meta object for the containment reference list '{@link organisationalChart.organisationalChart.Organisation#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see organisationalChart.organisationalChart.Organisation#getDepartments()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Departments();

	/**
	 * Returns the meta object for the containment reference list '{@link organisationalChart.organisationalChart.Organisation#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see organisationalChart.organisationalChart.Organisation#getEmployees()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link organisationalChart.organisationalChart.Organisation#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see organisationalChart.organisationalChart.Organisation#getTeams()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Teams();

	/**
	 * Returns the meta object for the attribute '{@link organisationalChart.organisationalChart.Organisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see organisationalChart.organisationalChart.Organisation#getName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Name();

	/**
	 * Returns the meta object for class '{@link organisationalChart.organisationalChart.Organisational_Unit <em>Organisational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisational Unit</em>'.
	 * @see organisationalChart.organisationalChart.Organisational_Unit
	 * @generated
	 */
	EClass getOrganisational_Unit();

	/**
	 * Returns the meta object for the reference list '{@link organisationalChart.organisationalChart.Organisational_Unit#getPersonnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personnel</em>'.
	 * @see organisationalChart.organisationalChart.Organisational_Unit#getPersonnel()
	 * @see #getOrganisational_Unit()
	 * @generated
	 */
	EReference getOrganisational_Unit_Personnel();

	/**
	 * Returns the meta object for the reference '{@link organisationalChart.organisationalChart.Organisational_Unit#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Director</em>'.
	 * @see organisationalChart.organisationalChart.Organisational_Unit#getDirector()
	 * @see #getOrganisational_Unit()
	 * @generated
	 */
	EReference getOrganisational_Unit_Director();

	/**
	 * Returns the meta object for the attribute '{@link organisationalChart.organisationalChart.Organisational_Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see organisationalChart.organisationalChart.Organisational_Unit#getName()
	 * @see #getOrganisational_Unit()
	 * @generated
	 */
	EAttribute getOrganisational_Unit_Name();

	/**
	 * Returns the meta object for class '{@link organisationalChart.organisationalChart.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see organisationalChart.organisationalChart.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link organisationalChart.organisationalChart.Role#getSuperior <em>Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superior</em>'.
	 * @see organisationalChart.organisationalChart.Role#getSuperior()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Superior();

	/**
	 * Returns the meta object for the attribute '{@link organisationalChart.organisationalChart.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see organisationalChart.organisationalChart.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link organisationalChart.organisationalChart.Individual_Role <em>Individual Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Role</em>'.
	 * @see organisationalChart.organisationalChart.Individual_Role
	 * @generated
	 */
	EClass getIndividual_Role();

	/**
	 * Returns the meta object for class '{@link organisationalChart.organisationalChart.Team_Role <em>Team Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Role</em>'.
	 * @see organisationalChart.organisationalChart.Team_Role
	 * @generated
	 */
	EClass getTeam_Role();

	/**
	 * Returns the meta object for the reference list '{@link organisationalChart.organisationalChart.Team_Role#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see organisationalChart.organisationalChart.Team_Role#getMembers()
	 * @see #getTeam_Role()
	 * @generated
	 */
	EReference getTeam_Role_Members();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganisationalChartFactory getOrganisationalChartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link organisationalChart.organisationalChart.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see organisationalChart.organisationalChart.impl.OrganisationImpl
		 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>CEO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__CEO = eINSTANCE.getOrganisation_CEO();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__DEPARTMENTS = eINSTANCE.getOrganisation_Departments();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__EMPLOYEES = eINSTANCE.getOrganisation_Employees();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__TEAMS = eINSTANCE.getOrganisation_Teams();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

		/**
		 * The meta object literal for the '{@link organisationalChart.organisationalChart.impl.Organisational_UnitImpl <em>Organisational Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see organisationalChart.organisationalChart.impl.Organisational_UnitImpl
		 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getOrganisational_Unit()
		 * @generated
		 */
		EClass ORGANISATIONAL_UNIT = eINSTANCE.getOrganisational_Unit();

		/**
		 * The meta object literal for the '<em><b>Personnel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATIONAL_UNIT__PERSONNEL = eINSTANCE.getOrganisational_Unit_Personnel();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATIONAL_UNIT__DIRECTOR = eINSTANCE.getOrganisational_Unit_Director();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATIONAL_UNIT__NAME = eINSTANCE.getOrganisational_Unit_Name();

		/**
		 * The meta object literal for the '{@link organisationalChart.organisationalChart.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see organisationalChart.organisationalChart.impl.RoleImpl
		 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Superior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SUPERIOR = eINSTANCE.getRole_Superior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link organisationalChart.organisationalChart.impl.Individual_RoleImpl <em>Individual Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see organisationalChart.organisationalChart.impl.Individual_RoleImpl
		 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getIndividual_Role()
		 * @generated
		 */
		EClass INDIVIDUAL_ROLE = eINSTANCE.getIndividual_Role();

		/**
		 * The meta object literal for the '{@link organisationalChart.organisationalChart.impl.Team_RoleImpl <em>Team Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see organisationalChart.organisationalChart.impl.Team_RoleImpl
		 * @see organisationalChart.organisationalChart.impl.OrganisationalChartPackageImpl#getTeam_Role()
		 * @generated
		 */
		EClass TEAM_ROLE = eINSTANCE.getTeam_Role();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_ROLE__MEMBERS = eINSTANCE.getTeam_Role_Members();

	}

} //OrganisationalChartPackage
