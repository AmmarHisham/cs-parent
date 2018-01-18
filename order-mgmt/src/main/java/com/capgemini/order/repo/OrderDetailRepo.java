package com.capgemini.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.OrderDetailsEntity;

public interface OrderDetailRepo extends JpaRepository<OrderDetailsEntity, Long> {

}
