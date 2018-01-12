package com.capgemini.constant;

/**
 * @author dimehta
 *
 */
public class URLConstants {

	public static final String GET_CART = "http://10.246.16.166:1003/cart/detail?userId={userId}";
	public static final String ADD_TO_CART = "http://10.246.16.166:1003/cart/add?userId={userId}&productId={productId}&quantity=1";
	public static final String DELETE_FROM_CART = "http://10.246.16.166:1003/cart/deleteProduct?userId={userId}&productId={productId}";
	public static final String CLEAR_CART = "http://10.246.16.166:1003/cart/empty?userId={userId}";

	public static final String DEBIT_GIFTCARD = "http://10.77.79.80:8080/users/debit?userId={userId}Vamshi&amount={price}";
	public static final String CREDIT_GIFTCARD = "http://10.77.116.23:9090/add?productId= {productId}&productName={productName}&productPrice{productPrice}";

	public static final String ADD_TO_PRODUCT = "http://10.77.116.23:9090/add";
	public static final String UPDATE_PRODUCT = "http://10.77.116.23:9090/update";
	
	public static final String GET_ALLPRODUCT="http://10.77.116.23:9090/getAllProds";
	public static final String SEARCH_PRODUCT="http://10.77.116.23:9090/getPartialProducts?prodName={prodName}";
	public static final String CATEGORY_SEARCH="http://10.77.116.23:9090/catagory?categoryName={categoryName}";
	
	// public static final String GET_PRODUCT=
	// "http://10.77.116.23:9090/addAll?productId={productId}&productName={productName}&productPrice{productPrice}";

}
