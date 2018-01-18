package com.capgemini.constant;

import java.net.URI;

/**
 * @author dimehta
 *
 */
public class URLConstants {

	public static final String GET_CART = "http://13.127.14.15:1009/cart/detail?userId={userId}";
	public static final String ADD_TO_CART = "http://13.127.14.15:1009/cart/add?userId={userId}&productId={productId}&quantity=1";
	public static final String DELETE_FROM_CART = "http://13.127.14.15:1009/cart/deleteProduct?userId={userId}&productId={productId}";
	public static final String CLEAR_CART = "http://13.127.14.15:1009/cart/empty?userId={userId}";

	public static final String DEBIT_GIFTCARD = "http://10.77.79.80:8080/users/debit?userId={userId}Vamshi&amount={price}";
	public static final String CREDIT_GIFTCARD = "http://13.127.14.15:9090/add?productId= {productId}&productName={productName}&productPrice{productPrice}";

	public static final String ADD_TO_PRODUCT = "http://13.127.14.15:9090/add";
	public static final String UPDATE_PRODUCT = "http://13.127.14.15:9090/update";
	
	public static final String GET_ALLPRODUCT="http://13.127.14.15:9090/getAllProds";
	public static final String SEARCH_PRODUCT="http://13.127.14.15:9090/getPartialProducts?prodName={prodName}";
	public static final String CATEGORY_SEARCH="http://13.127.14.15:9090/catagory?categoryName={categoryName}";
	
	public static final String GET_ORDER_BY_USERID="http://10.246.69.135:8000/orders/byuserid?userid={userId}";
	public static final String GET_ALL_ORDERS="http://10.246.69.135:8000/orders/findall";
	public static final String UPDATE_ORDER="http://10.246.69.135:8000/orders";
	
	public static final String ADD_GIFT_CARD="http://13.127.14.15:9090/addAllGifts";
	public static final String GET_GIFT_CARD = "http://13.127.14.15:9090/getGiftCards";
	public static final String click = "http://10.77.116.60:8081/getById?userId={userId}";
	public static final String PUT_STREAM= "http://10.77.116.60:8081/saveUrl?userId= {userId}&userUrl= {userUrl}";
	// public static final String GET_PRODUCT=
	// "http://13.127.14.15:9090/addAll?productId={productId}&productName={productName}&productPrice{productPrice}";

}
