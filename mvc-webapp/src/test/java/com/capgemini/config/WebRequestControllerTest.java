package com.capgemini.config;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.ClickStream;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;

/**
 * The class <code>WebRequestControllerTest</code> contains tests for the class <code>{@link WebRequestController}</code>.
 *
 * @author vamshkri
 * @version $Revision: 1.0 $
 */
public class WebRequestControllerTest {
	
	@InjectMocks
	WebRequestController webRequestController;

	@Mock
	LinkedInProvider linkedInProvider;

	@Mock
	AdminService adminService;

	@Mock
	CatalogServiceImpl catalogService;

	@Mock
	ModelMap map;
	
	@Mock
	RestTemplate restTemplate;
	
	private MockMvc mockMvc;
	 
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	public void testWebRequestController_1()
		throws Exception {
		WebRequestController result = new WebRequestController();
		assertNotNull(result);
	}

	@Test
	public void testAdminHome() throws Exception {
		ProductCatalog productCatalog =new ProductCatalog();
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(productCatalog);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.AdminHome(map);

	}
	
/*	@Test
	public void testAddGiftCard_1() throws Exception {
		
	}*/

	/*
	public void testAddGiftCardResponse_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String id = (String) null;
		String value = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.addGiftCardResponse(id, value, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.addUserGiftCard(CartServiceimpl.java:107)
		//       at com.capgemini.config.WebRequestController.addGiftCardResponse(WebRequestController.java:133)
		assertNotNull(result);
	}

	*//**
	 * Run the String addToCart(String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testAddToCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String productId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();

		String result = fixture.addToCart(productId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.addToCart(WebRequestController.java:257)
		assertNotNull(result);
	}

	*//**
	 * Run the String addToProduct(ProductCatalog,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testAddToProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		ProductCatalog prod = new ProductCatalog();
		ModelMap model = new ModelMap();

		String result = fixture.addToProduct(prod, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.addToProduct(AdminServiceimpl.java:54)
		//       at com.capgemini.config.WebRequestController.addToProduct(WebRequestController.java:294)
		assertNotNull(result);
	}

	*//**
	 * Run the String adminLogin(AdminLogin,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testAdminLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		AdminLogin admin = new AdminLogin();
		admin.setUsername("");
		ModelMap model = new ModelMap();

		String result = fixture.adminLogin(admin, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.adminLogin(WebRequestController.java:323)
		assertNotNull(result);
	}

	*//**
	 * Run the String categoryAfterLogin(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testCategoryAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String key = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.categoryAfterLogin(key, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:43)
		//       at com.capgemini.config.WebRequestController.categoryAfterLogin(WebRequestController.java:353)
		assertNotNull(result);
	}

	*//**
	 * Run the String categoryBeforeLogin(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testCategoryBeforeLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String key = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.categoryBeforeLogin(key, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.categorySearch(CatalogServiceImpl.java:43)
		//       at com.capgemini.config.WebRequestController.categoryBeforeLogin(WebRequestController.java:346)
		assertNotNull(result);
	}

	*//**
	 * Run the String clearCart(String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testClearCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String userId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();

		String result = fixture.clearCart(userId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.emptyCart(CartServiceimpl.java:73)
		//       at com.capgemini.config.WebRequestController.clearCart(WebRequestController.java:285)
		assertNotNull(result);
	}

	*//**
	 * Run the String deleteFromCart(String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testDeleteFromCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String productId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();

		String result = fixture.deleteFromCart(productId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.deleteFromCart(WebRequestController.java:275)
		assertNotNull(result);
	}

	*//**
	 * Run the String error(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testError_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.error(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.error(WebRequestController.java:98)
		assertNotNull(result);
	}

	*//**
	 * Run the String homeAfterLogin(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testHomeAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.homeAfterLogin(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.homeAfterLogin(WebRequestController.java:82)
		assertNotNull(result);
	}

	*/
	
	@Test
	public void testHomeBeforeLogin() throws Exception {
		ProductCatalog productCatalog =new ProductCatalog();
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		list.add(productCatalog);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webRequestController.homeBeforeLogin(map);
	}

	/**
	 * Run the String linkedInUserInfo(Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testLinkedInUserInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ExtendedModelMap model = new ExtendedModelMap();

		String result = fixture.linkedInUserInfo(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.getLinkedInUserData(LinkedInProvider.java:42)
		//       at com.capgemini.config.WebRequestController.linkedInUserInfo(WebRequestController.java:247)
		assertNotNull(result);
	}

	*//**
	 * Run the String login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();

		String result = fixture.login();

		// add additional test code here
		assertEquals("login-auth", result);
	}

	*//**
	 * Run the String payment(String,String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testPayment_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String userId = (String) null;
		String pId = (String) null;
		ExtendedModelMap model = new ExtendedModelMap();

		String result = fixture.payment(userId, pId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.deleteFromCart(CartServiceimpl.java:67)
		//       at com.capgemini.config.WebRequestController.payment(WebRequestController.java:214)
		assertNotNull(result);
	}

	*/
	
	@Test
	public void testSar() throws Exception {
		webRequestController.sar(map);
	}

	@Test
	public void testSarResponse_1() throws Exception {
		Mockito.when(adminService.sar(Mockito.isA(String.class))).thenReturn(new ClickStream());
	}

	/**
	 * Run the String searchAfterLogin(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testSearchAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String key = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.searchAfterLogin(key, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:32)
		//       at com.capgemini.config.WebRequestController.searchAfterLogin(WebRequestController.java:331)
		assertNotNull(result);
	}

	*//**
	 * Run the String searchBeforeLogin(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testSearchBeforeLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String key = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.searchBeforeLogin(key, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.searchProduct(CatalogServiceImpl.java:32)
		//       at com.capgemini.config.WebRequestController.searchBeforeLogin(WebRequestController.java:339)
		assertNotNull(result);
	}

	*//**
	 * Run the String showAddPage(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowAddPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.showAddPage(model);

		// add additional test code here
		assertEquals("addProduct", result);
	}

	*//**
	 * Run the String showAdminLoginPage(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowAdminLoginPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.showAdminLoginPage(model);

		// add additional test code here
		assertEquals("AdminLogin", result);
	}

	*//**
	 * Run the String showAdminOrderPage(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowAdminOrderPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.showAdminOrderPage(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.getAllOrder(AdminServiceimpl.java:30)
		//       at com.capgemini.config.WebRequestController.showAdminOrderPage(WebRequestController.java:151)
		assertNotNull(result);
	}

	*//**
	 * Run the String showCheckoutCompletePage(ShippingBean,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowCheckoutCompletePage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ShippingBean address = new ShippingBean();
		address.setQua(1);
		address.setPrice(1);
		ModelMap model = new ModelMap();

		String result = fixture.showCheckoutCompletePage(address, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.showCheckoutCompletePage(WebRequestController.java:207)
		assertNotNull(result);
	}

	*//**
	 * Run the String showCheckoutPage(String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowCheckoutPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String userId = (String) null;
		String productid = (String) null;
		String quantity = (String) null;
		String price = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.showCheckoutPage(userId, productid, quantity, price, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.showCheckoutPage(WebRequestController.java:199)
		assertNotNull(result);
	}

	*//**
	 * Run the String showOrderInfo(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowOrderInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.showOrderInfo(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.showOrderInfo(WebRequestController.java:90)
		assertNotNull(result);
	}

	*//**
	 * Run the String showgiftCardInfo(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testShowgiftCardInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.showgiftCardInfo(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.showgiftCardInfo(WebRequestController.java:113)
		assertNotNull(result);
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		String orderId = (String) null;
		String user = (String) null;
		String productId = (String) null;
		String productName = (String) null;
		String price = (String) null;
		String quantity = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at com.capgemini.config.WebRequestController.updateOrder(WebRequestController.java:162)
		assertNotNull(result);
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_2()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_3()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_4()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_5()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_6()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateOrder(String,String,String,String,String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateOrder_7()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.userBean = new UserBean();
			fixture.adminService = new AdminServiceimpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.admin1 = new AdminLogin();
			fixture.web = new WebRequestController();
			String orderId = (String) null;
			String user = (String) null;
			String productId = (String) null;
			String productName = (String) null;
			String price = (String) null;
			String quantity = (String) null;
			ModelMap model = new ModelMap();

			String result = fixture.updateOrder(orderId, user, productId, productName, price, quantity, model);

			// add additional test code here
			fail("The exception java.lang.NumberFormatException should have been thrown.");
		} catch (java.lang.NumberFormatException exception) {
			// The test succeeded by throwing the expected exception
		}
	}

	*//**
	 * Run the String updateProduct(ProductCatalog,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ProductCatalog prod = new ProductCatalog();
		ModelMap model = new ModelMap();

		String result = fixture.updateProduct(prod, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.updateProduct(AdminServiceimpl.java:59)
		//       at com.capgemini.config.WebRequestController.updateProduct(WebRequestController.java:315)
		assertNotNull(result);
	}

	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.updateProduct1(proId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}

	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_2()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.updateProduct1(proId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}

	*//**
	 * Run the String updateProduct1(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUpdateProduct1_3()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		fixture.web = new WebRequestController();
		String proId = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.updateProduct1(proId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.updateProduct1(WebRequestController.java:303)
		assertNotNull(result);
	}

	*//**
	 * Run the String userOrder(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/2/18 9:32 AM
	 *//*
	public void testUserOrder_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.userBean = new UserBean();
		fixture.adminService = new AdminServiceimpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.admin1 = new AdminLogin();
		fixture.web = new WebRequestController();
		ModelMap model = new ModelMap();

		String result = fixture.userOrder(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.getAllOrder(CartServiceimpl.java:41)
		//       at com.capgemini.config.WebRequestController.userOrder(WebRequestController.java:105)
		assertNotNull(result);
	}*/

	protected void tearDown() throws Exception {
		
	}
}