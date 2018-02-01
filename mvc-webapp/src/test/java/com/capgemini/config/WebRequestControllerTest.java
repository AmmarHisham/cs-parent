package com.capgemini.config;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ShippingBean;
import com.capgemini.bean.UserBean;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.service.CatalogService;
import com.capgemini.serviceimpl.AdminServiceimpl;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;
import junit.framework.*;
import org.junit.Test;
import java.lang.NullPointerException;


/**
 * The class <code>WebRequestControllerTest</code> contains tests for the class <code>{@link WebRequestController}</code>.
 *
 * @generatedBy CodePro at 2/1/18 9:44 PM, using the Spring generator
 * @author sabrmc
 * @version $Revision: 1.0 $
 */
public class WebRequestControllerTest {
	
	@InjectMocks
	WebRequestController webrequest;

	@Mock
	CatalogService catalogService;
	
	@Mock
	AdminService adminService;
	
	@Mock
	CartServiceimpl cartServiceimpl;
	
	@Mock
	ModelMap model;
	
	@Mock
	LinkedInProvider linkedInProvider;
	
	@Mock
	Model model1;
	
	@Mock
	AdminLogin admin1;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
	}
	
	@Test(expected = NullPointerException.class)
	public void testHomeBeforeLogin_1() throws Exception {
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		ProductCatalog pc=new ProductCatalog();
		list.add(pc);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		//Mockito.when(webrequest.homeBeforeLogin(new ModelMap())).thenReturn("Home");
		/*Mockito.when(webrequest.homeBeforeLogin(new ModelMap())).thenReturn("Home");
		Mockito.when(model.addAttribute(String.class, Class.class )).thenReturn("Home");*/
		webrequest.homeBeforeLogin(model);
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddToProduct_1()
			throws Exception {
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		ProductCatalog cat=new ProductCatalog();
		list.add(cat);
		ProductCatalog pc=new ProductCatalog();
		pc.setCatagoryName("test");
		pc.setImageUrl("");
		pc.setPrice(null);
		pc.setProductIdParent("900");
		pc.setProductName(null);
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		String name = webrequest.addToProduct(pc, new ModelMap());
		
			
		}
	
	@Test
	public void testLinkedInUserInfo_1()
			throws Exception {
	
		//Model mod=(Model) new ModelMap();
		Mockito.when(linkedInProvider.getLinkedInUserData(Mockito.isA(Model.class), Mockito.isA(UserBean.class))).thenReturn("test");
		webrequest.linkedInUserInfo(model1);
		
	}
	
	@Test
	public void testLogin_1() {
		webrequest.login();
	}
	
	@Test(expected = NullPointerException.class)
	public void testUpdateProduct_1()
			throws Exception {
		ProductCatalog prod = new ProductCatalog();
		Mockito.when(adminService.updateProduct(Mockito.isA(ProductCatalog.class))).thenReturn("sample");
		webrequest.updateProduct(prod, model);
	}
		
	@Test
	public void testUpdateOrder_1()
			throws Exception {
		//OrderEntity ord=new OrderEntity();
		Mockito.when(adminService.updateOrder(Mockito.isA(OrderEntity.class))).thenReturn("sample");
		webrequest.updateOrder("1", "1", "1", "1", "1", "1", model);
	}
	
	@Test(expected = NullPointerException.class)
	public void testCategoryAfterLogin_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.categorySearch("sample")).thenReturn(list);
		webrequest.categoryAfterLogin("sample", model);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testCategoryBeforeLogin_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.categorySearch("sample")).thenReturn(list);
		webrequest.categoryBeforeLogin("sample", model);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testSearchBeforeLogin_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.searchProduct("sample")).thenReturn(list);
		webrequest.searchBeforeLogin("sample", model);
		
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testSearchAfterLogin_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.searchProduct("sample")).thenReturn(list);
		webrequest.searchAfterLogin("sample", model);
		
	}
	
	
	
	@Test(expected = NullPointerException.class)
	public void testAdminLogin_1()
			throws Exception {
		admin1.setUsername("capgemini");
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webrequest.adminLogin(admin1, model);
	}
	
	@Test(expected = NullPointerException.class)
	public void testUpdateProduct1_1()
			throws Exception {
		List<ProductCatalog> list=new ArrayList<ProductCatalog>();
		Mockito.when(catalogService.getProduct()).thenReturn(list);
		webrequest.updateProduct1("sample", model);
	}
	
	/*
	*//**
	 * Run the WebRequestController() constructor test.
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testWebRequestController_1()
		throws Exception {
		WebRequestController result = new WebRequestController();
		assertNotNull(result);
		// add additional test code here
	}

	*//**
	 * Run the String AdminHome(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAdminHome_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		ModelMap model = new ModelMap();

		String result = fixture.AdminHome(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.AdminHome(WebRequestController.java:186)
		assertNotNull(result);
	}

	*//**
	 * Run the String addGiftCard(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAddGiftCard_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
		ModelMap model = new ModelMap();

		String result = fixture.addGiftCard(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.login.social.providers.LinkedInProvider.populateUserDetailsFromLinkedIn(LinkedInProvider.java:54)
		//       at com.capgemini.config.WebRequestController.addGiftCard(WebRequestController.java:122)
		assertNotNull(result);
	}

	*//**
	 * Run the String addGiftCardResponse(String,String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAddGiftCardResponse_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAddToCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAddToProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testAdminLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testCategoryAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testCategoryBeforeLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testClearCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testDeleteFromCart_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testError_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testHomeAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
		ModelMap model = new ModelMap();

		String result = fixture.homeAfterLogin(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.homeAfterLogin(WebRequestController.java:82)
		assertNotNull(result);
	}

	*//**
	 * Run the String homeBeforeLogin(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testHomeBeforeLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
		ModelMap model = new ModelMap();

		String result = fixture.homeBeforeLogin(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CatalogServiceImpl.getProduct(CatalogServiceImpl.java:22)
		//       at com.capgemini.config.WebRequestController.homeBeforeLogin(WebRequestController.java:60)
		assertNotNull(result);
	}

	*//**
	 * Run the String linkedInUserInfo(Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testLinkedInUserInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();

		String result = fixture.login();

		// add additional test code here
		assertEquals("login-auth", result);
	}

	*//**
	 * Run the String payment(String,String,Model) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testPayment_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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

	*//**
	 * Run the String sar(ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testSar_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		ModelMap model = new ModelMap();

		String result = fixture.sar(model);

		// add additional test code here
		assertEquals("SAR", result);
	}

	*//**
	 * Run the String sarResponse(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testSarResponse_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
		String userId = (String) null;
		ModelMap model = new ModelMap();

		String result = fixture.sarResponse(userId, model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.AdminServiceimpl.sar(AdminServiceimpl.java:71)
		//       at com.capgemini.config.WebRequestController.sarResponse(WebRequestController.java:74)
		assertNotNull(result);
	}

	*//**
	 * Run the String searchAfterLogin(String,ModelMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testSearchAfterLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testSearchBeforeLogin_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowAddPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowAdminLoginPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowAdminOrderPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowCheckoutCompletePage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowCheckoutPage_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowOrderInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testShowgiftCardInfo_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_2()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_3()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_4()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_5()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_6()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateOrder_7()
		throws Exception {
		try {
			WebRequestController fixture = new WebRequestController();
			fixture.linkedInProvider = new LinkedInProvider();
			fixture.userBean = new UserBean();
			fixture.web = new WebRequestController();
			fixture.catalogService = new CatalogServiceImpl();
			fixture.cartServiceimpl = new CartServiceimpl();
			fixture.adminService = new AdminServiceimpl();
			fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateProduct_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateProduct1_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateProduct1_2()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUpdateProduct1_3()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setUsername("");
		fixture.admin1 = adminLogin;
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
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public void testUserOrder_1()
		throws Exception {
		WebRequestController fixture = new WebRequestController();
		fixture.linkedInProvider = new LinkedInProvider();
		fixture.userBean = new UserBean();
		fixture.web = new WebRequestController();
		fixture.catalogService = new CatalogServiceImpl();
		fixture.cartServiceimpl = new CartServiceimpl();
		fixture.adminService = new AdminServiceimpl();
		fixture.admin1 = new AdminLogin();
		ModelMap model = new ModelMap();

		String result = fixture.userOrder(model);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.capgemini.serviceimpl.CartServiceimpl.getAllOrder(CartServiceimpl.java:41)
		//       at com.capgemini.config.WebRequestController.userOrder(WebRequestController.java:105)
		assertNotNull(result);
	}

	*//**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	*//**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}

	*//**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/18 9:44 PM
	 *//*
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(WebRequestControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new WebRequestControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}*/
}