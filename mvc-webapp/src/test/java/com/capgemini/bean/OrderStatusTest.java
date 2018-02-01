package com.capgemini.bean;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class OrderStatusTest {

	@Before
	public void setUp() throws Exception {
		System.err.println("inside setup");
	}
	
	@Test
	public void test()
	{
		assertEquals(com.capgemini.bean.OrderStatus.inprogress, OrderStatus.inprogress);
	}

	@After
	public void tearDown() throws Exception {
		System.err.println("inside teardown");
	}

}