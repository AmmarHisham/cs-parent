package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.constant.URLConstants;
import com.capgemini.service.Cart;
import com.capgemini.service.Cart1;
import com.capgemini.service.CartService;
import com.capgemini.service.Catalog;
import com.capgemini.service.GiftCard;
import com.capgemini.service.Order;
import com.capgemini.service.ProductList;
import com.capgemini.service.UseDetails;

@Service
public class CartServiceimpl implements CartService {
	@Override
	public Cart getAllCart() {

		/*
		 * String uri = URLConstants.URL + "/{id}"; System.out.println(uri); Map<String,
		 * String> params = new HashMap<String, String>(); params.put("userId", "1");
		 * RestTemplate restTemplate = new RestTemplate(); Cart result =
		 * restTemplate.getForObject(uri, Cart.class, params);
		 * System.out.println(result); System.out.println(result);
		 */

		Cart cart = new Cart();
		cart.setEducation("sdfsafas");
		cart.setUserId("1234");
		return cart;
	}

	@Override
	public ArrayList<Catalog> getDetails() {
		ArrayList<Catalog> col = new ArrayList<Catalog>();

		Catalog cat = new Catalog();
		cat.setName("aaaaaaaa");
		cat.setPrice(00);
		cat.setId(11111);
		Catalog cat1 = new Catalog();
		cat1.setName("bbbbbbbbbb");
		cat1.setPrice(00);
		cat1.setId(2222);
		Catalog cat2 = new Catalog();
		cat2.setName("cccccccccc");
		cat2.setPrice(00);
		cat2.setId(3333);
		Catalog cat3 = new Catalog();
		cat3.setName("aaaaaaaaaa");
		cat3.setPrice(00);
		cat3.setId(4444);
		Catalog cat4 = new Catalog();
		cat4.setName("dddddddda");
		cat4.setPrice(00);
		cat4.setId(5555);
		Catalog cat5 = new Catalog();
		cat5.setName("aaaaaaaaa");
		cat5.setPrice(00);
		cat5.setId(6666);
		col.add(cat);
		col.add(cat1);
		col.add(cat2);
		col.add(cat3);
		col.add(cat4);
		col.add(cat5);
		return col;
	}

	@Override
	public UseDetails getAllDetails() {
		UseDetails UseDetails = new UseDetails();
		UseDetails.setfirstName("xyz");
		UseDetails.setlastName("modiSSS");
		UseDetails.setgender("male");
		UseDetails.setemailId("xyz@gmail.com");
		UseDetails.setId("asassdfedf");
		return UseDetails;

	}

	public ArrayList<ProductList> getAllProduct() {

		ProductList productlist = new ProductList();
		productlist.setProductId("1234");
		productlist.setProductName("abc");
		productlist.setProductPrice("100");

		ProductList productlist1 = new ProductList();
		productlist1.setProductId("1234");
		productlist1.setProductName("abc");
		productlist1.setProductPrice("100");

		ProductList productlist2 = new ProductList();
		productlist2.setProductId("1234");
		productlist2.setProductName("abc");
		productlist2.setProductPrice("100");

		ProductList productlist3 = new ProductList();
		productlist3.setProductId("1234");
		productlist3.setProductName("abc");
		productlist3.setProductPrice("100");

		ArrayList<ProductList> pro = new ArrayList<ProductList>();
		pro.add(productlist);
		pro.add(productlist1);
		pro.add(productlist2);
		pro.add(productlist3);

		return pro;
	}

	@Override
	public ArrayList<Order> getAllOrder() {
		Order ord = new Order();
		ord.setProductId("1234");
		ord.setProductName("abc");
		ord.setProductPrice("100");
		ord.setQuantity(2);
		ord.setOrderNumber(1);
		ord.setOrderDate("23-06-2017");

		Order ord1 = new Order();
		ord1.setProductId("2345");
		ord1.setProductName("def");
		ord1.setProductPrice("200");
		ord1.setQuantity(1);
		ord1.setOrderNumber(2);
		ord1.setOrderDate("07-08-2017");

		Order ord2 = new Order();
		ord2.setProductId("3456");
		ord2.setProductName("ghi");
		ord2.setProductPrice("300");
		ord2.setQuantity(1);
		ord2.setOrderNumber(3);
		ord2.setOrderDate("09-10-2017");

		Order ord3 = new Order();
		ord3.setProductId("4567");
		ord3.setProductName("jkl");
		ord3.setProductPrice("400");
		ord3.setQuantity(3);
		ord3.setOrderNumber(4);
		ord3.setOrderDate("28-12-2017");

		ArrayList<Order> order = new ArrayList<Order>();
		order.add(ord);
		order.add(ord1);
		order.add(ord2);
		order.add(ord3);
		return order;

	}

	/*
	 * public ArrayList<Order> getAllOrder() { Order order = new Order();
	 * order.setName("qwert"); order.setEmail("siaohi"); order.setPhone("1234");
	 * order.setAddress("bangalore");
	 * 
	 * Order order1 = new Order(); order1.setName("qwert");
	 * order1.setEmail("siaohi"); order1.setPhone("1234");
	 * order1.setAddress("bangalore");
	 * 
	 * Order order2 = new Order(); order2.setName("qwert");
	 * order2.setEmail("siaohi"); order2.setPhone("1234");
	 * order2.setAddress("bangalore");
	 * 
	 * Order order3 = new Order(); order3.setName("qwert");
	 * order3.setEmail("siaohi"); order3.setPhone("1234");
	 * order3.setAddress("bangalore");
	 * 
	 * ArrayList<Order> ord=new ArrayList<Order>(); ord.add(order); ord.add(order1);
	 * ord.add(order2); ord.add(order3); return ord;
	 * 
	 * }
	 */

	@Override
	public GiftCard getAllgiftCard() {
		GiftCard giftcard = new GiftCard();
		giftcard.setGiftCardId("123");
		giftcard.setGiftCardValue("$50");
		System.out.println(giftcard.getGiftCardId());
		System.out.println(giftcard.getGiftCardValue());
		return giftcard;
	}

	@Override
	public ArrayList<Cart1> getAllCart1() {

		ArrayList<Cart1> cart = new ArrayList<Cart1>();

		Cart1 cart1 = new Cart1();
		cart1.setQuantity(2);
		cart1.setProductPrice(10);
		cart1.setProductId("abc");
		cart1.setProductName("a");

		Cart1 cart2 = new Cart1();

		cart2.setQuantity(2);
		cart2.setProductPrice(10);
		cart2.setProductId("abc");
		cart2.setProductName("a");

		Cart1 cart3 = new Cart1();
		cart3.setQuantity(2);
		cart3.setProductPrice(10);
		cart3.setProductId("abc");
		cart3.setProductName("a");

		cart.add(cart1);
		cart.add(cart2);
		cart.add(cart3);

		return cart;
	}

	public ArrayList<ProductList> getAllAdminProduct() {

		ProductList productlist = new ProductList();
		productlist.setProductId("1234");
		productlist.setProductName("abc");
		productlist.setProductPrice("100");

		ProductList productlist1 = new ProductList();
		productlist1.setProductId("1234");
		productlist1.setProductName("abc");
		productlist1.setProductPrice("100");

		ProductList productlist2 = new ProductList();
		productlist2.setProductId("1234");
		productlist2.setProductName("abc");
		productlist2.setProductPrice("100");

		ProductList productlist3 = new ProductList();
		productlist3.setProductId("1234");
		productlist3.setProductName("abc");
		productlist3.setProductPrice("100");

		ArrayList<ProductList> pro = new ArrayList<ProductList>();
		pro.add(productlist);
		pro.add(productlist1);
		pro.add(productlist2);
		pro.add(productlist3);

		return pro;
	}
}
