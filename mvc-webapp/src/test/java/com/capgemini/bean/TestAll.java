package com.capgemini.bean;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 1/30/18 5:34 PM
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	OrderStatusTest.class,
	OrderTest.class,
	ShippingBeanTest.class,

	ProductListTest.class,
	AdminLoginTest.class,
	ClickStreamTest.class,

	ProductCatalogTest.class,
	GiftCardTest.class,
	OrderDetailsEntityTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 1/30/18 5:34 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
