package com.capgemini.service;

import java.util.ArrayList;

import com.capgemini.bean.AdminLogin;
import com.capgemini.bean.ProductList;

public interface AdminService {

	public ArrayList<ProductList> getAllProduct();
	
	public String adminLogin(AdminLogin adminValidate);

}
