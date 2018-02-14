package com.capgemini.service;

import java.util.List;

import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;

public interface OrderService {

	public OrderEntity saveOrder(OrderEntity entity);

	public List<OrderEntity> getAll();

	public OrderEntity getOrdersByOrderId(Long orderId);

	public List<OrderEntity> getOrdersByUserId(String userId);
	
	public List<OrderEntity> getOrdersByStatus(String userId, OrderStatus status);

	public OrderEntity updateOrders(OrderEntity entity);

}
