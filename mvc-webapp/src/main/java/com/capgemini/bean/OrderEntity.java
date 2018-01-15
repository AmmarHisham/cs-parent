package com.capgemini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 2405172041950251807L;

	private Long orderId;

	private Long userId;

	private List<OrderDetailsEntity> orderDetails = new ArrayList<OrderDetailsEntity>();

	public OrderEntity() {
	}


	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<OrderDetailsEntity> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
