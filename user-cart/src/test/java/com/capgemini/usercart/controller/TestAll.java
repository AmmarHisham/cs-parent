package com.capgemini.usercart.controller;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	UserCartEmptyControllerTest.class,
	UserCartDelteProductControllerTest.class,
	UserCartAddControllerTest.class,
	UserCartDetailControllerTest.class,
})
public class TestAll {

	
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
