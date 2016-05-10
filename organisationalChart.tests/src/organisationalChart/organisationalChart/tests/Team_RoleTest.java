/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.tests;

import junit.textui.TestRunner;

import organisationalChart.organisationalChart.OrganisationalChartFactory;
import organisationalChart.organisationalChart.Team_Role;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Team_RoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Team_RoleTest.class);
	}

	/**
	 * Constructs a new Team Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team_RoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Team Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Team_Role getFixture() {
		return (Team_Role)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrganisationalChartFactory.eINSTANCE.createTeam_Role());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //Team_RoleTest
