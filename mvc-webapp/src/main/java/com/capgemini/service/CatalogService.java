package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;

public interface CatalogService {
	//public List<GiftCard> getAllgiftCard();
	public GiftCard addCatalog();
	//public List<GiftCard> addAllCatalog();
	
	public List<ProductCatalog> getProduct();
	
	public List<ProductCatalog> searchproduct(String ProductName);
	//public GiftCard getBycatagory();
	public String updateCatalog(ProductCatalog product);
	
}
