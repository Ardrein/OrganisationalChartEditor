/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.Organisation#getCEO <em>CEO</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisation#getDepartments <em>Departments</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisation#getEmployees <em>Employees</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisation#getTeams <em>Teams</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>CEO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEO</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEO</em>' reference.
	 * @see #setCEO(Role)
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation_CEO()
	 * @model required="true"
	 * @generated
	 */
	Role getCEO();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Organisation#getCEO <em>CEO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEO</em>' reference.
	 * @see #getCEO()
	 * @generated
	 */
	void setCEO(Role value);

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link organisationalChart.organisationalChart.Organisational_Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation_Departments()
	 * @model type="organisationalChart.organisationalChart.Organisational_Unit" containment="true" required="true"
	 * @generated
	 */
	EList getDepartments();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link organisationalChart.organisationalChart.Individual_Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation_Employees()
	 * @model type="organisationalChart.organisationalChart.Individual_Role" containment="true"
	 * @generated
	 */
	EList getEmployees();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link organisationalChart.organisationalChart.Team_Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation_Teams()
	 * @model type="organisationalChart.organisationalChart.Team_Role" containment="true"
	 * @generated
	 */
	EList getTeams();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Organisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Organisation
