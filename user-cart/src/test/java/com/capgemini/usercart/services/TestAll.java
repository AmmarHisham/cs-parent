package com.capgemini.usercart.services;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	DeleteProductCartServiceTest.class,
	UserCartDetailServiceTest.class,
	AddProductCartServiceTest.class,
	EmptyProductCartServiceTest.class,
	CheckProductInListTest.class,
})
public class TestAll {

		public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
