package com.capgemini.usercart.services;

import org.junit.*;
import static org.junit.Assert.*;
import com.capgemini.usercart.repository.MongoRepositoryDataBaseOperations;

/**
 * The class <code>EmptyProductCartServiceTest</code> contains tests for the class <code>{@link EmptyProductCartService}</code>.
 *
 * @generatedBy CodePro at 1/30/18 7:13 PM
 * @author dsriniv1
 * @version $Revision: 1.0 $
 */
public class EmptyProductCartServiceTest {
	/**
	 * Run the String emptyCart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 7:13 PM
	 */
	@Test
	public void testEmptyCart_1()
		throws Exception {
		EmptyProductCartService fixture = new EmptyProductCartService();
		fixture.mongoRepositoryDataBaseOperations = null;
		String userId = "";

		String result = fixture.emptyCart(userId);

		// add additional test code here
		assertEquals("Failed", result);
	}

	/**
	 * Run the String emptyCart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 7:13 PM
	 */
	@Test
	public void testEmptyCart_2()
		throws Exception {
		EmptyProductCartService fixture = new EmptyProductCartService();
		fixture.mongoRepositoryDataBaseOperations = null;
		String userId = "";

		String result = fixture.emptyCart(userId);

		// add additional test code here
		assertEquals("Failed", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 7:13 PM
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
	 * @generatedBy CodePro at 1/30/18 7:13 PM
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
	 * @generatedBy CodePro at 1/30/18 7:13 PM
	 */
	
}
