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
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.CartService;
import com.capgemini.service.CatalogService;

/**
 * @author dimehta
 *
 */
@Service
public class CartServiceimpl implements CartService {

	private static final Logger logger = LoggerFactory.getLogger(CartServiceimpl.class);

	RestTemplate restTemplate = new RestTemplate();

	CatalogService catalogService = new CatalogServiceImpl();

	/*
	 * @Override public ArrayList<Order> getAllOrder() { Order ord = new Order();
	 * ord.setProductId("1234"); ord.setProductName("abc");
	 * ord.setProductPrice("100"); ord.setQuantity(2); ord.setOrderNumber(1);
	 * ord.setOrderDate("23-06-2017");
	 * 
	 * Order ord1 = new Order(); ord1.setProductId("2345");
	 * ord1.setProductName("def"); ord1.setProductPrice("200"); ord1.setQuantity(1);
	 * ord1.setOrderNumber(2); ord1.setOrderDate("07-08-2017");
	 * 
	 * Order ord2 = new Order(); ord2.setProductId("3456");
	 * ord2.setProductName("ghi"); ord2.setProductPrice("300"); ord2.setQuantity(1);
	 * ord2.setOrderNumber(3); ord2.setOrderDate("09-10-2017");
	 * 
	 * Order ord3 = new Order(); ord3.setProductId("4567");
	 * ord3.setProductName("jkl"); ord3.setProductPrice("400"); ord3.setQuantity(3);
	 * ord3.setOrderNumber(4); ord3.setOrderDate("28-12-2017");
	 * 
	 * ArrayList<Order> order = new ArrayList<Order>(); order.add(ord);
	 * order.add(ord1); order.add(ord2); order.add(ord3); return order;
	 * 
	 * }
	 */
	
	@SuppressWarnings("null")
	@Override
	public List<OrderEntity> getAllOrder(String userId) {

		ResponseEntity<OrderEntity[]> orderlists = restTemplate.getForEntity(URLConstants.GET_ORDER_BY_USERID,
				OrderEntity[].class, userId);
		List<OrderEntity> list = new ArrayList<OrderEntity>();
		if (orderlists.getBody().length != 0) {
			for (int i = 0; i < orderlists.getBody().length; i++) {
				list.add(orderlists.getBody()[i]);
			}
		}
		System.out.println(list);
		for (OrderEntity lists : list) {
			System.out.println(lists.getOrderId());
		}
		return list;
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

	@Override
	public void addToCart(String productName, String userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("productId", productName);
		params.put("userId", userId);
		logger.info("productId  =" + productName + "  userId =" + userId);
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
		System.out.println(cartLists);
		if (cartLists != null) {
			return cartLists.getBody();
		}
		logger.info("getCardDetails service Responce body " + cartLists.getBody());
		return null;
	}

	@Override
	public String getProductPrice(String productId) {
		List<ProductCatalog> list = catalogService.getProduct();
		for (ProductCatalog productCatalog : list) {
			System.out.println(productCatalog.getProductIdChild());
		}

		for (ProductCatalog productCatalog : list) {
			if ((productCatalog.getProductIdChild()).equalsIgnoreCase(productId)) {
				return productCatalog.getPrice();
			}
		}
		return null;
	}

	@Override
	public UserCartModel setProductPrice(UserCartModel user) {
		List<ProductCartModel> list = user.getCartItemList();
		for (ProductCartModel prod : list) {
			System.out.println(prod.getProductId());
			String price = getProductPrice(prod.getProductId());
			System.out.println(prod.getProductId() + "========" + price);
			prod.setPrice(price);
		}
		return user;
	}

	/*
	 * public void createUserGiftCard(User user) {
	 * 
	 * }
	 * 
	 * public void debitGiftCard(User user) { createUserGiftCard(user);
	 * restTemplate.postForObject(URLConstants.DEBIT_GIFTCARD, User.class,
	 * User.class, user); }
	 */

	/*
	 * @Override public void creditGiftCard(String firstName, int balance) { String
	 * str1 = Integer.toString(balance); Map<String, String> params = new
	 * HashMap<String, String>(); params.put("userId", firstName);
	 * params.put("price", str1);
	 * restTemplate.postForEntity(URLConstants.CREDIT_GIFTCARD, User.class,
	 * User.class, params); }
	 */

}
