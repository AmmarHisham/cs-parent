package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.CatalogService;
@Service
public class CatalogServiceImpl implements CatalogService {

	RestTemplate restTemplate = new RestTemplate();
	static CatalogServiceImpl cat = new CatalogServiceImpl();

	@Override
	@SuppressWarnings("null")
	public List<ProductCatalog> getProduct() {
		ProductCatalog[] cartLists = restTemplate.getForObject(URLConstants.GET_ALLPRODUCT, ProductCatalog[].class);
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		if(cartLists.length!=0)
		{
			for (int i = 0; i < cartLists.length; i++) {
				list.add(cartLists[i]);
			}
		}
		for (ProductCatalog productCatalog : list) {
			System.out.println(productCatalog.getProductName());
		}
		return list;
	}

	
	  public static void main(String[] args) { 
		  cat.getProduct();

	 
	  }
	 

	@Override
	public GiftCard addCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductCatalog> searchproduct(String ProductName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCatalog(ProductCatalog product) {
		// TODO Auto-generated method stub
		return null;
	}

}
