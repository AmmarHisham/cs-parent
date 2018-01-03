package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.Cart;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.serviceimpl.UserCartModel;

/**
 * @author dimehta
 *
 */
public interface CartService {

	
	public void addToCart();
	public void deleteFromCart();
	public UserCartModel getCardDetails(String userId);
	public void emptyCart();
	
	
	
	public Cart getAllCart();
	public ArrayList<Catalog> getDetails();
	/* public ArrayList<ProductList> getAllProduct(); */
	public ArrayList<Order> getAllOrder();
	public GiftCard getAllgiftCard();
	public ArrayList<Cart1> getAllCart1();
	
	
}
