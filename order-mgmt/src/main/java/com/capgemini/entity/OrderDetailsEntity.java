package com.capgemini.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1905122041950251207L;

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	private int oId;
	private OrderEntity orderEntity;
	
	public OrderDetailsEntity() {
		super();
		
		
	}


	public OrderDetailsEntity(int id, int productId, String productName, int price, int quantity, int oId,
			OrderEntity orderEntity) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.oId = oId;
		this.orderEntity = orderEntity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getoId() {
		return oId;
	}


	public void setoId(int oId) {
		this.oId = oId;
	}


	public OrderEntity getOrderEntity() {
		return orderEntity;
	}


	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}


	@Override
	public String toString() {
		return "OrderDetailsEntity [id=" + id + ", productId=" + productId + ", productName=" + productName + ", price="
				+ price + ", quantity=" + quantity + ", oId=" + oId + ", orderEntity=" + orderEntity + "]";
	}
	
}