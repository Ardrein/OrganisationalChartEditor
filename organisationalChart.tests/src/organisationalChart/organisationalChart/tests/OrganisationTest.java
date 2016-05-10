/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package organisationalChart.organisationalChart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import organisationalChart.organisationalChart.Organisation;
import organisationalChart.organisationalChart.OrganisationalChartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganisationTest extends TestCase {

	/**
	 * The fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Organisation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganisationTest.class);
	}

	/**
	 * Constructs a new Organisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Organisation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Organisation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(OrganisationalChartFactory.eINSTANCE.createOrganisation());
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

} //OrganisationTest
