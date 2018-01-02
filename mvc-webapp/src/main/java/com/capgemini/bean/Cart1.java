package com.capgemini.bean;

public class Cart1 {
	
	private String productName;
	private String productId;
	private double productPrice;
	private int quantity;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", ProductPrice=" + productPrice + ", quantity=" + quantity +  "]";
	}
	
}
