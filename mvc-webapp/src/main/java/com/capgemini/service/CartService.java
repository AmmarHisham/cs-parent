package com.capgemini.service;

import java.util.ArrayList;

import com.capgemini.bean.Cart;
import com.capgemini.bean.Cart1;
import com.capgemini.bean.Catalog;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.ProductList;

/**
 * @author dimehta
 *
 */
public interface CartService {

	public Cart getAllCart();

	public ArrayList<Catalog> getDetails();

	/* public ArrayList<ProductList> getAllProduct(); */

	public ArrayList<Order> getAllOrder();

	public GiftCard getAllgiftCard();

	public ArrayList<Cart1> getAllCart1();
	
	
}
