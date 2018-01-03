package com.capgemini.serviceimpl;

import java.io.Serializable;

public class ProductCartModel implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5537789757476648851L;
	private String productId;
	private String quantity;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductCartModel [productId=" + productId + ", quantity=" + quantity + "]";
	}
	
	
}
