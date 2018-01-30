package com.cg.entity;

import java.util.UUID;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CustomerFeedbackTest</code> contains tests for the class <code>{@link CustomerFeedback}</code>.
 *
 * @generatedBy CodePro at 1/30/18 4:25 PM
 * @author ppallama
 * @version $Revision: 1.0 $
 */
public class CustomerFeedbackTest {
	/**
	 * Run the String getFeedback() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testGetFeedback_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		String result = fixture.getFeedback();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the UUID getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		UUID result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
		assertEquals("4fc5cd76-7a94-4620-8550-629ecbf19c3d", result.toString());
		assertEquals(4, result.version());
		assertEquals(2, result.variant());
		assertEquals(-8840457634362319811L, result.getLeastSignificantBits());
		assertEquals(5748226408154678816L, result.getMostSignificantBits());
	}

	/**
	 * Run the String getProductId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testGetProductId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		String result = fixture.getProductId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRating() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testGetRating_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		String result = fixture.getRating();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUserId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testGetUserId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		String result = fixture.getUserId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setFeedback(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testSetFeedback_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");
		String feedback = "";

		fixture.setFeedback(feedback);

		// add additional test code here
	}

	/**
	 * Run the void setId(UUID) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");
		UUID id = UUID.randomUUID();

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setProductId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testSetProductId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");
		String productId = "";

		fixture.setProductId(productId);

		// add additional test code here
	}

	/**
	 * Run the void setRating(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testSetRating_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");
		String rating = "";

		fixture.setRating(rating);

		// add additional test code here
	}

	/**
	 * Run the void setUserId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testSetUserId_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");
		String userId = "";

		fixture.setUserId(userId);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CustomerFeedback fixture = new CustomerFeedback();
		fixture.setUserId("");
		fixture.setFeedback("");
		fixture.setId(UUID.randomUUID());
		fixture.setRating("");
		fixture.setProductId("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("CustomerFeedback [id=069b3473-44cc-4e5b-b4e7-3058863734c0, userId=, productId=, feedback=, rating=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/30/18 4:25 PM
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
	 * @generatedBy CodePro at 1/30/18 4:25 PM
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
	 * @generatedBy CodePro at 1/30/18 4:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerFeedbackTest.class);
	}
}