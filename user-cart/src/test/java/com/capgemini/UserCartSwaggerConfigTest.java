package com.capgemini;

import org.junit.*;
import springfox.documentation.spring.web.plugins.Docket;
import static org.junit.Assert.*;


public class UserCartSwaggerConfigTest {
	
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

	
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

		@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserCartSwaggerConfigTest.class);
	}
}