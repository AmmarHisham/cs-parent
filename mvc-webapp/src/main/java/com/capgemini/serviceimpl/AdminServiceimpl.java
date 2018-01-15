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
	
	public ArrayList<ProductList> getAllProduct() {

		ProductList productlist = new ProductList();
		productlist.setProductId("1234");
		productlist.setProductName("abc");
		productlist.setProductPrice("100");

		ProductList productlist1 = new ProductList();
		productlist1.setProductId("1234");
		productlist1.setProductName("abc");
		productlist1.setProductPrice("100");

		ProductList productlist2 = new ProductList();
		productlist2.setProductId("1234");
		productlist2.setProductName("abc");
		productlist2.setProductPrice("100");

		ProductList productlist3 = new ProductList();
		productlist3.setProductId("1234");
		productlist3.setProductName("abc");
		productlist3.setProductPrice("100");

		ArrayList<ProductList> pro = new ArrayList<ProductList>();
		pro.add(productlist);
		pro.add(productlist1);
		pro.add(productlist2);
		pro.add(productlist3);

		return pro;
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
