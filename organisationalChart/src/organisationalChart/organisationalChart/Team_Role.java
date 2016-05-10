/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link organisationalChart.organisationalChart.Team_Role#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getTeam_Role()
 * @model
 * @generated
 */
public interface Team_Role extends Role {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link organisationalChart.organisationalChart.Individual_Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see organisationalChart.organisationalChart.OrganisationalChartPackage#getTeam_Role_Members()
	 * @model type="organisationalChart.organisationalChart.Individual_Role" required="true"
	 * @generated
	 */
	EList getMembers();

} // Team_Role
