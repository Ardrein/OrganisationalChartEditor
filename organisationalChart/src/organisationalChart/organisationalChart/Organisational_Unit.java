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
 * A representation of the model object '<em><b>Organisational Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.Organisational_Unit#getPersonnel <em>Personnel</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisational_Unit#getDirector <em>Director</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Organisational_Unit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisational_Unit()
 * @model
 * @generated
 */
public interface Organisational_Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Personnel</b></em>' reference list.
	 * The list contents are of type {@link organisationalChart.organisationalChart.Individual_Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnel</em>' reference list.
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisational_Unit_Personnel()
	 * @model type="organisationalChart.organisationalChart.Individual_Role" required="true"
	 * @generated
	 */
	EList getPersonnel();

	/**
	 * Returns the value of the '<em><b>Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Director</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Director</em>' reference.
	 * @see #setDirector(Individual_Role)
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisational_Unit_Director()
	 * @model required="true"
	 * @generated
	 */
	Individual_Role getDirector();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Organisational_Unit#getDirector <em>Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Director</em>' reference.
	 * @see #getDirector()
	 * @generated
	 */
	void setDirector(Individual_Role value);

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
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getOrganisational_Unit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Organisational_Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Organisational_Unit
