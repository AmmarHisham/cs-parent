package com.capgemini.order.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.OrderDetailsEntity;
import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;
import com.capgemini.order.repo.OrderDetailRepo;
import com.capgemini.order.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Override
	public OrderEntity saveOrder(OrderEntity entity) {

		List<OrderDetailsEntity> od = entity.getOrderDetails();
		OrderEntity oe = new OrderEntity(entity.getOrderId(), entity.getUserId(), entity.getStatus(),
				new ArrayList<>());
		od.forEach(item -> {
			System.err.println(item);
			oe.getOrderDetails().add(item);
		});
		orderRepo.save(oe);
		System.out.println(oe);
		return oe;

	}

	@Override
	public OrderEntity updateOrders(OrderEntity entity) {
		return orderRepo.save(entity);
	}

	@Override
	public List<OrderEntity> getAll() {
		return orderRepo.findAll();
	}

	@Override
	public OrderEntity getOrdersByOrderId(Long orderId) {
		return orderRepo.findByOrderId(orderId);
	}

	@Override
	public List<OrderEntity> getOrdersByUserId(Long userId) {
		return orderRepo.findByUserId(userId);
	}

	@Override
	public List<OrderEntity> getOrdersByStatus(Long userId, OrderStatus status) {
		return orderRepo.findByUserIdAndStatus(userId, status);
	}

}
