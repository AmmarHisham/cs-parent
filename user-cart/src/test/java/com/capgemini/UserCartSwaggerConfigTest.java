package com.capgemini;

import org.junit.*;
import springfox.documentation.spring.web.plugins.Docket;
import static org.junit.Assert.*;

/**
 * The class <code>UserCartSwaggerConfigTest</code> contains tests for the class <code>{@link UserCartSwaggerConfig}</code>.
 *
 * @generatedBy CodePro at 1/30/18 6:40 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class UserCartSwaggerConfigTest {
	/**
	 * Run the Docket api() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Test
	public void testApi_1()
		throws Exception {
		UserCartSwaggerConfig fixture = new UserCartSwaggerConfig();

		Docket result = fixture.api();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
		assertEquals("default", result.getGroupName());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 1/30/18 6:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserCartSwaggerConfigTest.class);
	}
}