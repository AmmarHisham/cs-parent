package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.Cart;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductList;
import com.capgemini.bean.User;
import com.capgemini.serviceimpl.UserCartModel;

/**
 * @author dimehta
 *
 */
public interface CartService {

	
	public void addToCart(String productId, String userId);
	public void deleteFromCart(String productId, String userId);
	public UserCartModel getCardDetails(String userId);
	public void emptyCart(String userId);

	public List<OrderEntity> getAllOrder(String userId);
	public GiftCard getAllgiftCard();
	/*public ProductList searchProduct(String key);*/
	String getProductPrice(String productId);
	UserCartModel setProductPrice(UserCartModel user);
	//public void debitGiftCard(User user);
	//void creditGiftCard(String firstName, int balance);
	
	
	
}
