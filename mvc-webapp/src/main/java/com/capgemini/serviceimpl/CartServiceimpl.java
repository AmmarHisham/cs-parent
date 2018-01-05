package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.Cart;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.ProductList;
import com.capgemini.config.WebRequestController;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.CartService;

/**
 * @author dimehta
 *
 */
@Service
public class CartServiceimpl implements CartService {

	private static final Logger logger = LoggerFactory.getLogger(CartServiceimpl.class);

	RestTemplate restTemplate = new RestTemplate();

	@Override
	public Cart getAllCart() {
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
		cat.setPrice("1200");
		cat.setId("11111");
		Catalog cat1 = new Catalog();
		cat1.setName("bbbbbbbbbb");
		cat1.setPrice("850");
		cat1.setId("2222");
		Catalog cat2 = new Catalog();
		cat2.setName("cccccccccc");
		cat2.setPrice("453");
		cat2.setId("3333");
		Catalog cat3 = new Catalog();
		cat3.setName("aaaaaaaaaa");
		cat3.setPrice("670");
		cat3.setId("4444");
		Catalog cat4 = new Catalog();
		cat4.setName("dddddddda");
		cat4.setPrice("1900");
		cat4.setId("5555");
		Catalog cat5 = new Catalog();
		cat5.setName("aaaaaaaaa");
		cat5.setPrice("2700");
		cat5.setId("6666");
		col.add(cat);
		col.add(cat1);
		col.add(cat2);
		col.add(cat3);
		col.add(cat4);
		col.add(cat5);
		return col;
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

	@Override
	public GiftCard getAllgiftCard() {
		GiftCard giftcard = new GiftCard();
		giftcard.setGiftCardId("123");
		giftcard.setGiftCardValue("$50");
		System.out.println(giftcard.getGiftCardId());
		System.out.println(giftcard.getGiftCardValue());
		return giftcard;
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

	@Override
	public void addToCart(String productId, String userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("productId", productId);
		params.put("userId", userId);
		logger.info("productId  =" + productId + "  userId =" + userId);
		restTemplate.postForObject(URLConstants.ADD_TO_CART, String.class, String.class, params);
	}

	@Override
	public void deleteFromCart(String productId, String userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("productId", productId);
		params.put("userId", userId);
		logger.info("productId  =" + productId + "  userId =" + userId);
		restTemplate.postForObject(URLConstants.DELETE_FROM_CART, String.class, String.class, params);

	}

	@Override
	public void emptyCart(String userId) {
		restTemplate.postForObject(URLConstants.CLEAR_CART, String.class, String.class, userId);
		logger.info("userId =" + userId);
	}

	@SuppressWarnings("null")
	public UserCartModel getCardDetails(String userId) {
		logger.info("getCardDetails service invoke with userID" + userId);
		ResponseEntity<UserCartModel> cartLists = restTemplate.getForEntity(URLConstants.GET_CART, UserCartModel.class,
				userId);
		if (cartLists != null) {
			return cartLists.getBody();
		}
		logger.info("getCardDetails service Responce body " + cartLists.getBody());
		return null;
	}

	public static void main(String[] args) {
		new CartServiceimpl().emptyCart("DILIP");
	}

	/*
	 * @SuppressWarnings("null") public ProductList searchProduct(String key) {
	 * logger.info("getCardDetails service invoke with userID" + key);
	 * ResponseEntity<ProductList> proList =
	 * restTemplate.getForEntity(URLConstants.SEARCH_PRODUCT, ProductList.class,
	 * key); if (proList != null) { return proList.getBody(); }
	 * logger.info("getCardDetails service Responce body " + proList.getBody());
	 * return null;
	 * 
	 * }
	 */

	@Override
	public String getProductPrice(String productId) {
		ArrayList<Catalog> pro = getDetails();
		for (Catalog product : pro) {
			if ((product.getId()).equalsIgnoreCase(productId)) {
				return product.getPrice();
			}
		}
		return null;
	}

	@Override
	public UserCartModel setProductPrice(UserCartModel user) {
		List<ProductCartModel> list = user.getCartItemList();
		for (ProductCartModel prod : list) {
			String price = getProductPrice(prod.getProductId());
			prod.setPrice(price);
		}
		return user;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void debitGiftCard(String uid, int price) {
		Map params = new HashMap();
		params.put("userId", uid);
		params.put("price", price);
		restTemplate.postForEntity(URLConstants.DEBIT_GIFTCARD, request, responseType, params);
	}

}
