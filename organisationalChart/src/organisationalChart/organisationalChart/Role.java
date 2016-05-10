/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.Role#getSuperior <em>Superior</em>}</li>
 *   <li>{@link organisationalChart.organisationalChart.Role#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Superior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superior</em>' reference.
	 * @see #setSuperior(Role)
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getRole_Superior()
	 * @model
	 * @generated
	 */
	Role getSuperior();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Role#getSuperior <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superior</em>' reference.
	 * @see #getSuperior()
	 * @generated
	 */
	void setSuperior(Role value);

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
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link organisationalChart.organisationalChart.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Role
