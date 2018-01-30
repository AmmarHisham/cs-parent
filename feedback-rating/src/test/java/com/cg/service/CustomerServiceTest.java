package com.cg.service;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.cg.entity.CustomerFeedback;
import com.cg.repository.CustomerRepository;

/**
 * The class <code>CustomerServiceTest</code> contains tests for the class <code>{@link CustomerService}</code>.
 *
 * @generatedBy CodePro at 1/30/18 4:24 PM
 * @author ppallama
 * @version $Revision: 1.0 $
 */
public class CustomerServiceTest {
	/**
	 * Run the List<CustomerFeedback> getData(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:24 PM
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		CustomerService fixture = new CustomerService();
		fixture.customerRepository = null;
		String productId = "";

		List<CustomerFeedback> result = fixture.getData(productId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.service.CustomerService.getData(CustomerService.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the CustomerFeedback saveData(CustomerFeedback) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:24 PM
	 */
	@Test
	public void testSaveData_1()
		throws Exception {
		CustomerService fixture = new CustomerService();
		fixture.customerRepository = null;
		CustomerFeedback customer = new CustomerFeedback();

		CustomerFeedback result = fixture.saveData(customer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.cg.service.CustomerService.saveData(CustomerService.java:18)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 4:24 PM
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
	 * @generatedBy CodePro at 1/30/18 4:24 PM
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
	 * @generatedBy CodePro at 1/30/18 4:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerServiceTest.class);
	}
}