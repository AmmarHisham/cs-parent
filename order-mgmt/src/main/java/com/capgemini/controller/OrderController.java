package com.capgemini.controller;

import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dao.OrderDao;


@RestController
public class OrderController {

	@Autowired
	OrderDao orderDetailsDao;

	@RequestMapping("/")
	public String getOrdersMicroservice() {
		return "Inside order management";
	}

	@RequestMapping(value = "/getOrdersByOrderId/{orderId}", method = RequestMethod.GET)
	public String getOrders(@PathVariable int orderId) {

		orderDetailsDao = new OrderDao();
		try {
			return orderDetailsDao.getOrders(orderId);
		} catch (Exception e) {
			
			java.util.logging.Logger.getLogger("Test").log(Level.INFO, "No Order Found with this order Id!", e);
		}
		return null;
	}

	@RequestMapping(value = "/getCompletedOrdersByUserId/{userId}", method = RequestMethod.GET)
	public String getOrdersByOkStatus(@PathVariable int userId) {

		orderDetailsDao = new OrderDao();
		try {
			return orderDetailsDao.getOrdersByStatus(userId, "ok");
		} catch (Exception e) {
			
			java.util.logging.Logger.getLogger("Test").log(Level.INFO, "No Completed Order Found for this User!", e);
		}
		return null;
	}

	@RequestMapping(value = "/getOpenOrdersByUserId/{userId}", method = RequestMethod.GET)
	public String getOrdersByProgStatus(@PathVariable int userId) {

		orderDetailsDao = new OrderDao();
		try {
			return orderDetailsDao.getOrdersByStatus(userId, "inprogress");
		} catch (Exception e) {
			
			java.util.logging.Logger.getLogger("Test").log(Level.INFO, "No Open Order Found for this User!", e);
		}
		return null;
	}

}
