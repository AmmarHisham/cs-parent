package com.capgemini.usercart;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	com.capgemini.usercart.controller.TestAll.class,
	com.capgemini.usercart.model.TestAll.class,

	com.capgemini.usercart.services.TestAll.class,
})
public class TestAll {

	
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
