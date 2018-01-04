package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.Cart;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.ProductList;
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
	
	
	
	public Cart getAllCart();
	public ArrayList<Catalog> getDetails();

	public ArrayList<Order> getAllOrder();
	public GiftCard getAllgiftCard();
	/*public ProductList searchProduct(String key);*/
	
	
	
}
