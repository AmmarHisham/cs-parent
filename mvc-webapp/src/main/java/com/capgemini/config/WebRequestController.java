package com.capgemini.config;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.service.AdminLoginPOJO;
import com.capgemini.service.Cart;
import com.capgemini.service.Cart1;
import com.capgemini.service.Catalog;
import com.capgemini.service.Checkout;
import com.capgemini.service.GiftCard;
import com.capgemini.service.Order;
import com.capgemini.service.ProductList;
import com.capgemini.service.UseDetails;
import com.capgemini.serviceimpl.CartServiceimpl;

@Controller
public class WebRequestController {
	@Autowired
	public CartServiceimpl cartServiceimpl;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homeBeforeLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		return "Home";
	}

	@RequestMapping(value = "/home1", method = RequestMethod.GET)
	public String homeAfterLogin(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "index";
	}

	@RequestMapping(value = "/userinfo", method = RequestMethod.GET)
	public String showOrderInfo(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("userinfo", userDetails);
		model.addAttribute("name", userDetails.getfirstName());
		return "accountInfo";

	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "error";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getAllProduct(ModelMap model) {
		ArrayList<ProductList> productlist = cartServiceimpl.getAllProduct();
		model.addAttribute("prodInfo", productlist);
		System.out.println(productlist);
		return "productList";
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String showOrderPage(ModelMap model) {
		ArrayList<ProductList> productlist = cartServiceimpl.getAllProduct();
		model.addAttribute("prodInfo", productlist);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("details", userDetails);
		return "orderList";
	}

	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String cancelUpdateUser(HttpServletRequest request) {
		return "redirect:/order";
	}

	@RequestMapping(value = "/userOrder", method = RequestMethod.GET)
	public String userOrder(ModelMap model) {
		ArrayList<Order> orderlist = cartServiceimpl.getAllOrder();
		model.addAttribute("orderInfo", orderlist);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "Order1";
	}

	@RequestMapping(value = "/giftCard", method = RequestMethod.GET)
	public String showgiftCardInfo(ModelMap model) {
		GiftCard giftcard = cartServiceimpl.getAllgiftCard();
		model.addAttribute("giftcard", giftcard);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "GiftCard";
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String showCartPage(ModelMap model) {
		ArrayList<Cart1> cart = cartServiceimpl.getAllCart1();
		model.addAttribute("cartinf", cart);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "cart";
	}

	@RequestMapping(value = "/addGiftCard", method = RequestMethod.GET)
	public String addGiftCard(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "AddGiftCart";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String showAddPage(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "addProduct";
	}

	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String showAdminOrderPage(ModelMap model) {
		ArrayList<ProductList> productlist = cartServiceimpl.getAllProduct();
		model.addAttribute("prodInf", productlist);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "orderList";
	}

	@RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	public String showAdminLoginPage(ModelMap model) {
		return "AdminLogin";
	}

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String AdminHome(ModelMap model) {
		Collection<Catalog> cat = cartServiceimpl.getDetails();
		model.addAttribute("catalog", cat);
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "AdminHome";
	}

	/*@RequestMapping(value = "/adminlog", method = RequestMethod.GET)
	public void saveAdminData(@ModelAttribute AdminLoginPOJO adm) {
		System.out.println(adm.getUsername());
		System.out.println(adm.getPassword());
	}
*/
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String showCheckoutPage(ModelMap model) {
		UseDetails userDetails = cartServiceimpl.getAllDetails();
		model.addAttribute("name", userDetails.getfirstName());
		return "checkout";
	}

	/*@RequestMapping(value = "/checkout/complete", method = RequestMethod.GET)
	public String showCheckoutPage(@RequestBody Checkout checkout) {

		System.out.println(checkout.getName());
		return "Hi";
	}*/
}
