package com.capgemini.serviceimpl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ProductList;
import com.capgemini.service.AdminService;
@Service
public class AdminServiceimpl implements AdminService{
	
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
	
	

}
