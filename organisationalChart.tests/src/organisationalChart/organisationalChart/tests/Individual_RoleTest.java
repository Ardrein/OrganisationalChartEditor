/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.tests;

import junit.textui.TestRunner;

import organisationalChart.organisationalChart.Individual_Role;
import organisationalChart.organisationalChart.OrganisationalChartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Individual_RoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Individual_RoleTest.class);
	}

	/**
	 * Constructs a new Individual Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual_RoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Individual_Role getFixture() {
		return (Individual_Role)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrganisationalChartFactory.eINSTANCE.createIndividual_Role());
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

} //Individual_RoleTest
