package com.capgemini;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	UserCartSwaggerConfigTest.class,
	com.capgemini.usercart.TestAll.class,
})
public class TestAll {

	
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
