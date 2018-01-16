package com.capgemini.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.GiftCardCatalog;
import com.capgemini.bean.Order;
import com.capgemini.bean.OrderDetailsEntity;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.OrderStatus;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ProductList;
import com.capgemini.bean.ShippingBean;
import com.capgemini.login.model.UserBean;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;
import com.capgemini.serviceimpl.UserCartModel;

/**
 * @author dimehta
 *
 */

@Controller
public class WebRequestController {

	@Autowired
	WebRequestController web;

	private static final Logger logger = LoggerFactory.getLogger(WebRequestController.class);
	@Autowired
	public CartServiceimpl cartServiceimpl;

	@Autowired
	LinkedInProvider linkedInProvider;

	@Autowired
	AdminService adminService;

	@Autowired
	public CatalogServiceImpl catalogService;

	AdminLogin admin1 = new AdminLogin();

	UserBean userBean = new UserBean();

	@RequestMapping({ "/", "/home" })
	public String homeBeforeLogin(ModelMap model) {
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		return "Home";
	}
	
	@RequestMapping("/sar")
	public String sar(ModelMap model) {
		model.addAttribute("name", admin1.getUsername());
		return "SAR";
	}
	
	@RequestMapping("/sar1")
	public String sarResponse(@RequestParam("userId") String userId, ModelMap model) {
		System.out.println("UserID==========="+userId);
		ClickStream click=adminService.sar(userId);
		model.addAttribute("sar", click);
		model.addAttribute("name", admin1.getUsername());
		return "SAR1";
	}

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String homeAfterLogin(ModelMap model) {
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "index";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String showOrderInfo(ModelMap model) {
		UserBean bean = linkedInProvider.populateUserDetailsFromLinkedIn(userBean);
		model.addAttribute("userinfo", bean);
		model.addAttribute("name", bean.getFirstName());
		return "UserInfo";
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap model) {
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "error";
	}


	@RequestMapping(value = "/userOrder", method = RequestMethod.GET)
	public String userOrder(ModelMap model) {
		List<OrderEntity> orderlist = cartServiceimpl.getAllOrder("5");
		model.addAttribute("orderInfo", orderlist);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "UserOrder";
	}

	@RequestMapping(value = "/giftCard", method = RequestMethod.GET)
	public String showgiftCardInfo(ModelMap model) {
		String name=linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName();
		GiftCardCatalog gift=cartServiceimpl.getUserGiftCard(name);
		model.addAttribute("name", name);
		model.addAttribute("giftcard", gift);
		return "GiftCard";
	}

	@RequestMapping(value = "/addGiftCard", method = RequestMethod.GET)
	public String addGiftCard(ModelMap model) {
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "AddGiftCart";
	}
	
	
	@RequestMapping(value = "/addgiftcardresponse", method = RequestMethod.GET)
	public String addGiftCardResponse(@RequestParam("id") String id, @RequestParam("value") String value, ModelMap model) {
		GiftCardCatalog giftcard=new GiftCardCatalog();
		giftcard.setGiftCardId(id);
		giftcard.setGiftCardValue(value);
		
		cartServiceimpl.addUserGiftCard(giftcard);
		
		String name=linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName();
		GiftCardCatalog gift=cartServiceimpl.getUserGiftCard(name);
		model.addAttribute("name", name);
		model.addAttribute("giftcard", gift);
		return "GiftCard";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String showAddPage(ModelMap model) {
		model.addAttribute("name", admin1.getUsername());
		return "addProduct";
	}


	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String showAdminOrderPage(ModelMap model) {
		List<OrderEntity> productlist = adminService.getAllOrder();
		model.addAttribute("orderInfo", productlist);
		model.addAttribute("name", admin1.getUsername());
		return "AdminOrderList";
	}
	
	@RequestMapping(value = "/updateorderList", method = RequestMethod.GET)
	public String updateOrder(@RequestParam("orderId") String orderId, @RequestParam("userId") String userId,
			@RequestParam("productId") String productId, @RequestParam("productName") String productName,
			@RequestParam("price") String price, @RequestParam("quantity") String quantity, ModelMap model) {
		OrderDetailsEntity orddetails=new OrderDetailsEntity();
		orddetails.setPrice(Integer.parseInt(price));
		orddetails.setProductId(Long.parseLong(productId));
		orddetails.setQuantity(Integer.parseInt(quantity));
		orddetails.setProductName(productName);
		orddetails.setId(Long.parseLong("5"));
		List<OrderDetailsEntity> orddetailslist=new ArrayList<OrderDetailsEntity>();
		orddetailslist.add(orddetails);
		OrderEntity ord=new OrderEntity();
		ord.setOrderDetails(orddetailslist);
		ord.setOrderId(Long.parseLong(orderId));
		ord.setUserId(Long.parseLong(userId));
		OrderStatus ok = OrderStatus.valueOf("delivered");
		ord.setStatus(ok);
		adminService.updateOrder(ord);
		return showAdminOrderPage(model);
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String showAdminLoginPage(ModelMap model) {
		return "AdminLogin";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String AdminHome(ModelMap model) {
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", admin1.getUsername());
		return "AdminHome";
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String showCheckoutPage(@RequestParam("uid") String userId, @RequestParam("pid") String productid,
			@RequestParam("qua") String quantity, @RequestParam("price") String price, ModelMap model) {
		model.addAttribute("uid", userId);
		model.addAttribute("pid", productid);
		model.addAttribute("qua", quantity);
		model.addAttribute("price", price);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "checkout";
	}

	@RequestMapping(value = "/checkoutcomplete", method = RequestMethod.GET)
	public String showCheckoutCompletePage(@ModelAttribute ShippingBean address, ModelMap model) {
		address.setPrice(address.getPrice() * address.getQua());
		model.addAttribute("checkout", address);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "CheckoutConfirm";
	}

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public String payment(@RequestParam("uid") String userId, @RequestParam("pid") String pId, Model model) {
		// cartServiceimpl.debitGiftCard(user);
		cartServiceimpl.deleteFromCart(pId, userId);
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "index";
	}

	/*
	 * @RequestMapping(value = "/creditGiftcard", method = RequestMethod.GET) public
	 * String creditGiftcard(@ModelAttribute ShippingBean proDetail, Model model) {
	 * cartServiceimpl.creditGiftCard(proDetail.getUid(), proDetail.getPrice());
	 * deleteFromCart(proDetail.getPid(), model); return null; }
	 */

	@RequestMapping(value = "/linkedin", method = RequestMethod.GET)
	public String linkedInUserInfo(Model model) {
		return linkedInProvider.getLinkedInUserData(model, new UserBean());
	}

	@RequestMapping(value = "/loginauth", method = RequestMethod.GET)
	public String login() {
		return "login-auth";
	}

	@RequestMapping(value = "/addtocart", method = RequestMethod.GET)
	public String addToCart(@RequestParam("id") String productId, Model model) {
		String userId = linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName();
		cartServiceimpl.addToCart(productId, userId);
		model.addAttribute("name", userId);
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		return "index";
	}

	@RequestMapping(value = "/getcart", method = RequestMethod.GET)
	public String getCardDetails(@RequestParam("id") String userId, Model model) {
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		UserCartModel UserCartModel = cartServiceimpl.setProductPrice(cartServiceimpl.getCardDetails(userId));
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/deletefromcart", method = RequestMethod.GET)
	public String deleteFromCart(@RequestParam("id") String productId, Model model) {
		String userId = linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName();
		cartServiceimpl.deleteFromCart(productId, userId);
		model.addAttribute("name", userId);
		UserCartModel UserCartModel = cartServiceimpl.setProductPrice(cartServiceimpl.getCardDetails(userId));
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/clearcart", method = RequestMethod.GET)
	public String clearCart(@RequestParam("name") String userId, Model model) {
		cartServiceimpl.emptyCart(userId);
		model.addAttribute("name", userId);
		UserCartModel UserCartModel = cartServiceimpl.getCardDetails(userId);
		model.addAttribute("UserCartModel", UserCartModel);
		return "UserCart";
	}

	@RequestMapping(value = "/addtoproduct", method = RequestMethod.POST)
	public String addToProduct(@ModelAttribute("prod") ProductCatalog prod, ModelMap model) {
		adminService.addToProduct(prod);
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", admin1.getUsername());
		return "adminHome";
	}

	@RequestMapping(value = "/updateproduct1", method = RequestMethod.GET)
	public String updateProduct1(@RequestParam("id") String proId, ModelMap model) {
		List<ProductCatalog> list = catalogService.getProduct();
		for (ProductCatalog productCatalog : list) {
			if (productCatalog.getProductIdChild().equalsIgnoreCase(proId)) {
				model.addAttribute("catalog", productCatalog);
			}
		}
		model.addAttribute("name", admin1.getUsername());
		return "EditProduct";
	}

	@RequestMapping(value = "/updateproduct", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("prod") ProductCatalog prod, ModelMap model) {
		adminService.updateProduct(prod);
		return AdminHome(model);
	}

	@RequestMapping(value = "/adminlog", method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute("admin") AdminLogin admin, ModelMap model) {
		String validate = adminService.adminLogin(admin);
		admin1.setUsername(admin.getUsername());
		List<ProductCatalog> cat = catalogService.getProduct();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", admin.getUsername());
		return validate;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchAfterLogin(@RequestParam("key") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.searchProduct(key);
		model.addAttribute("catalog", list);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "index";
	}

	@RequestMapping(value = "/search1", method = RequestMethod.GET)
	public String searchBeforeLogin(@RequestParam("key") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.searchProduct(key);
		model.addAttribute("catalog", list);
		return "Home";
	}

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public String categoryBeforeLogin(@RequestParam("type") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.categorySearch(key);
		model.addAttribute("catalog", list);
		return "Home";
	}

	@RequestMapping(value = "/category1", method = RequestMethod.GET)
	public String categoryAfterLogin(@RequestParam("type") String key, ModelMap model) {
		List<ProductCatalog> list = catalogService.categorySearch(key);
		model.addAttribute("catalog", list);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "index";
	}

}
