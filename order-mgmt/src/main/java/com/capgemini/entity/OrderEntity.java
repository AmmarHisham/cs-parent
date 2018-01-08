package com.capgemini.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.NaturalId;

@Entity
public class OrderEntity implements Serializable {
	 private static final long serialVersionUID = 2405172041950251807L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	@NaturalId
	private int userId;

	@NaturalId
	private String status;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = OrderDetailsEntity.class)
	@JoinColumn(name = "oId", referencedColumnName = "orderId")
	private List<OrderDetailsEntity> orderDetails;
	
	public OrderEntity() {
		super();
	
	}

	public OrderEntity(int orderId, int userId, String status, List<OrderDetailsEntity> orderDetails) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.status = status;
		this.orderDetails = orderDetails;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<?> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", userId=" + userId + ", status=" + status + ", orderDetails="
				+ orderDetails + "]";
	}


}