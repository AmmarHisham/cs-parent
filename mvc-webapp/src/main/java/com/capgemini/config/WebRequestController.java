package com.capgemini.config;

import java.util.ArrayList;
import java.util.Collection;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.Checkout;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.ProductList;
import com.capgemini.login.model.UserBean;
import com.capgemini.login.social.providers.LinkedInProvider;
import com.capgemini.service.AdminService;
import com.capgemini.serviceimpl.AdminServiceimpl;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.UserCartModel;

/**
 * @author dimehta
 *
 */

@Controller
public class WebRequestController {

	private static final Logger logger = LoggerFactory.getLogger(WebRequestController.class);
	@Autowired
	public CartServiceimpl cartServiceimpl;

	@Autowired
	LinkedInProvider linkedInProvider;

	@Autowired
	AdminService adminService;

	AdminLogin admin1 = new AdminLogin();

	UserBean userBean = new UserBean();

	@RequestMapping({ "/", "/home" })
	public String homeBeforeLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		return "Home";
	}

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String homeAfterLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		model.addAttribute("name1", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getEmail());
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

	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String cancelUpdateUser(HttpServletRequest request) {
		return "redirect:/order";
	}

	@RequestMapping(value = "/userOrder", method = RequestMethod.GET)
	public String userOrder(ModelMap model) {
		ArrayList<Order> orderlist = cartServiceimpl.getAllOrder();
		model.addAttribute("orderInfo", orderlist);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "UserOrder";
	}

	@RequestMapping(value = "/giftCard", method = RequestMethod.GET)
	public String showgiftCardInfo(ModelMap model) {
		GiftCard giftcard = cartServiceimpl.getAllgiftCard();
		model.addAttribute("giftcard", giftcard);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "GiftCard";
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String showCartPage(ModelMap model) {

		ArrayList<Cart1> cart = cartServiceimpl.getAllCart1();
		model.addAttribute("cartinf", cart);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "UserCart";
	}

	@RequestMapping(value = "/addGiftCard", method = RequestMethod.GET)
	public String addGiftCard(ModelMap model) {
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "AddGiftCart";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String showAddPage(ModelMap model) {
		model.addAttribute("name", admin1.getUsername());
		return "addProduct";
	}

	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String showAdminOrderPage(ModelMap model) {
		ArrayList<ProductList> productlist = adminService.getAllProduct();
		model.addAttribute("prodInf", productlist);
		model.addAttribute("name", admin1.getUsername());
		return "AdminOrderList";
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String showAdminLoginPage(ModelMap model) {
		return "AdminLogin";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String AdminHome(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", admin1.getUsername());
		return "AdminHome";
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String showCheckoutPage(ModelMap model) {
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "checkout";
	}

	@RequestMapping(value = "/checkoutcomplete", method = RequestMethod.GET)
	public String showCheckoutPage(@ModelAttribute Checkout checkout, ModelMap model) {

		System.out.println(checkout.getName());
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		return "index";
	}

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
		String email = linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getEmail();
		logger.info("productId"+productId+"email"+email);
		cartServiceimpl.addToCart(productId,email);
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		model.addAttribute("catalog", cat);
		
		return "index";
	}

	@RequestMapping(value = "/getcart", method = RequestMethod.GET)
	public String getCardDetails(@RequestParam("id") String userId, Model model) {
		logger.info("getCardDetails method invoke with userId " + userId);
		model.addAttribute("name", linkedInProvider.populateUserDetailsFromLinkedIn(userBean).getFirstName());
		UserCartModel UserCartModel = cartServiceimpl.getCardDetails(userId);
		model.addAttribute("UserCartModel", UserCartModel);
		logger.info("getCardDetails method completed return " + UserCartModel.toString());
		return "UserCart";
	}

	@RequestMapping(value = "/addtoproduct", method = RequestMethod.GET)
	public String addToProduct(@ModelAttribute("prod") ProductList prod, ModelMap model) {
		System.out.println("Product Code : " + prod.getProductId());
		System.out.println("Product Name : " + prod.getProductName());
		System.out.println("Product Price :" + prod.getProductPrice());
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		return "adminHome";
	}

	@RequestMapping(value = "/adminlog", method = RequestMethod.GET)
	public String adminLogin(@ModelAttribute("admin") AdminLogin admin, ModelMap model) {
		String validate = adminService.adminLogin(admin);
		admin1.setUsername(admin.getUsername());
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		model.addAttribute("name", admin.getUsername());
		return validate;

	}
}
