package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ClickStream;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.bean.ProductList;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.AdminService;
import com.capgemini.service.CatalogService;
@Service
public class AdminServiceimpl implements AdminService{
	
	private static final Logger logger = LoggerFactory.getLogger(AdminServiceimpl.class);
	static RestTemplate restTemplate = new RestTemplate();
	CatalogService catalogService = new CatalogServiceImpl();
	


	@Override
	@SuppressWarnings("null")
	public List<OrderEntity> getAllOrder() {
		
		ResponseEntity<OrderEntity[]> orderlists = restTemplate.getForEntity(URLConstants.GET_ALL_ORDERS, OrderEntity[].class);
		List<OrderEntity> list = new ArrayList<OrderEntity>();
		if (orderlists.getBody().length != 0) {
			for (int i = 0; i < orderlists.getBody().length; i++) {
				list.add(orderlists.getBody()[i]);
			}
		}
		
		System.out.println(list);
		for (OrderEntity lists : list) {
		System.out.println(lists.getOrderId());
		}
		//ArrayList<OrderEntity> cartLists = restTemplate.getForEntity(URLConstants.GET_ORDER_BY_USERID, OrderEntity.class, userId);	
		return list;
	}

	@Override
	public String adminLogin(AdminLogin adminValidate) {

		if (adminValidate.getUsername().equalsIgnoreCase("capgemini") && adminValidate.getPassword().equalsIgnoreCase("capgemini"))
		{
			return "adminHome";
		}
		else 
		{
			return "error";
		}
	}

	@Override
	public void addToProduct(ProductCatalog prod) {
		restTemplate.postForObject(URLConstants.ADD_TO_PRODUCT,prod,ProductCatalog.class);
	}

	@Override
	public String updateProduct(ProductCatalog prod) {
		restTemplate.postForObject(URLConstants.UPDATE_PRODUCT,prod,String.class);
		return "sucessfully update";
	}
	
	@Override
	public ClickStream sar(String userId)
	{
		 ResponseEntity<ClickStream> click = restTemplate.getForEntity(URLConstants.click, ClickStream.class,String.class, userId);
		 System.out.println(click);
		 return click.getBody();
	}
}
