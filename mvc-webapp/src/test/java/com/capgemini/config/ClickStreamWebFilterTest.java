package com.capgemini.config;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.core.ApplicationFilterChain;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.mock.web.MockFilterConfig;
import org.springframework.web.client.RestTemplate;
import com.capgemini.login.social.providers.LinkedInProvider;

/**
 * The class <code>ClickStreamWebFilterTest</code> contains tests for the class <code>{@link ClickStreamWebFilter}</code>.
 *
 * @generatedBy CodePro at 2/1/18 11:45 PM
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class ClickStreamWebFilterTest {
	/**
	 * Run the ClickStreamWebFilter() constructor test.
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 */
	@Test
	public void testClickStreamWebFilter_1()
		throws Exception {
		ClickStreamWebFilter result = new ClickStreamWebFilter();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.restTemplate = new RestTemplate();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 */
	/*@Test
	public void testDoFilter_1()
		throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.restTemplate = new RestTemplate();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		ServletRequest servletRequest = new HttpServletRequestWrapper(new Request());
		ServletResponse servletResponse = new ServletResponseWrapper(new HttpServletResponseWrapper(new Response()));
		FilterChain filterChain = new ApplicationFilterChain();

		fixture.doFilter(servletRequest, servletResponse, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.catalina.connector.Request.getScheme(Request.java:1427)
		//       at org.apache.catalina.connector.Request.getRequestURL(Request.java:2375)
		//       at javax.servlet.http.HttpServletRequestWrapper.getRequestURL(HttpServletRequestWrapper.java:197)
		//       at com.capgemini.config.ClickStreamWebFilter.doFilter(ClickStreamWebFilter.java:44)
	}

	*//**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 *//*
	@Test
	public void testDoFilter_2()
		throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.restTemplate = new RestTemplate();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		ServletRequest servletRequest = new HttpServletRequestWrapper(new Request());
		ServletResponse servletResponse = new ServletResponseWrapper(new HttpServletResponseWrapper(new Response()));
		FilterChain filterChain = new ApplicationFilterChain();

		fixture.doFilter(servletRequest, servletResponse, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.catalina.connector.Request.getScheme(Request.java:1427)
		//       at org.apache.catalina.connector.Request.getRequestURL(Request.java:2375)
		//       at javax.servlet.http.HttpServletRequestWrapper.getRequestURL(HttpServletRequestWrapper.java:197)
		//       at com.capgemini.config.ClickStreamWebFilter.doFilter(ClickStreamWebFilter.java:44)
	}

	*//**
	 * Run the void doFilter(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 *//*
	@Test
	public void testDoFilter_3()
		throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.restTemplate = new RestTemplate();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		ServletRequest servletRequest = new HttpServletRequestWrapper(new Request());
		ServletResponse servletResponse = new ServletResponseWrapper(new HttpServletResponseWrapper(new Response()));
		FilterChain filterChain = new ApplicationFilterChain();

		fixture.doFilter(servletRequest, servletResponse, filterChain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.catalina.connector.Request.getScheme(Request.java:1427)
		//       at org.apache.catalina.connector.Request.getRequestURL(Request.java:2375)
		//       at javax.servlet.http.HttpServletRequestWrapper.getRequestURL(HttpServletRequestWrapper.java:197)
		//       at com.capgemini.config.ClickStreamWebFilter.doFilter(ClickStreamWebFilter.java:44)
	}*/

	/**
	 * Run the void init(FilterConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		ClickStreamWebFilter fixture = new ClickStreamWebFilter();
		fixture.restTemplate = new RestTemplate();
		fixture.linkedInProvider1 = new LinkedInProvider();
		fixture.count = 1L;
		FilterConfig filterConfig = new MockFilterConfig();

		fixture.init(filterConfig);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/18 11:45 PM
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
	 * @generatedBy CodePro at 2/1/18 11:45 PM
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
	 * @generatedBy CodePro at 2/1/18 11:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClickStreamWebFilterTest.class);
	}
}