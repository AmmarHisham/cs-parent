package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	CatalogService catalogService;

	@Override
	@SuppressWarnings("null")
	public List<OrderEntity> getAllOrder(String userId) {

		ResponseEntity<OrderEntity[]> orderlists = restTemplate.getForEntity(URLConstants.GET_ORDER_BY_USERID,
				OrderEntity[].class, userId);
		List<OrderEntity> list = new ArrayList<OrderEntity>();

		for (int i = 0; i < orderlists.getBody().length; i++) {
			list.add(orderlists.getBody()[i]);
		}

		return list;
	}

	@Override
	public String addToCart(String productName, String userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("productId", productName);
		params.put("userId", userId);
		//logger.info("productId  =" + productName + "  userId =" + userId);
		return restTemplate.postForObject(URLConstants.ADD_TO_CART, String.class, String.class, params);
	}

	@Override
	public void deleteFromCart(String productId, String userId) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("productId", productId);
		params.put("userId", userId);
		//logger.info("productId  =" + productId + "  userId =" + userId);
		restTemplate.postForObject(URLConstants.DELETE_FROM_CART, String.class, String.class, params);

	}

	@Override
	public void emptyCart(String userId) {
		restTemplate.postForObject(URLConstants.CLEAR_CART, String.class, String.class, userId);
		//logger.info("userId =" + userId);
	}

	public UserCartModel getCardDetails(String userId) {
		//logger.info("getCardDetails service invoke with userID" + userId);
		ResponseEntity<UserCartModel> cartLists = restTemplate.getForEntity(URLConstants.GET_CART, UserCartModel.class,userId);
			return cartLists.getBody();
		//logger.info("getCardDetails service Responce body " + cartLists.getBody());
	}

	@Override
	public String getProductPrice(String productId) {
		List<ProductCatalog> list = catalogService.getProduct();
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
			String price = getProductPrice(prod.getProductId());
			prod.setPrice(price);
		}
		return user;
	}

	@Override
	public GiftCard addUserGiftCard(GiftCard giftCard) {
		return restTemplate.postForObject(URLConstants.ADD_GIFT_CARD, GiftCard.class, GiftCard.class, giftCard);

	}

	@Override
	public GiftCard getUserGiftCard(String name) {
		GiftCard[] gift = restTemplate.getForObject(URLConstants.GET_GIFT_CARD, GiftCard[].class);
		for (int i = 0; i < gift.length; i++) {
			if (gift[i].getGiftCardId().equalsIgnoreCase(name)) {
				return gift[i];
			}
		}
		return null;

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
