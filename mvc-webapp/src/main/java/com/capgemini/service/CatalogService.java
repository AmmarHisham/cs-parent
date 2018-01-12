package com.capgemini.service;

import java.util.List;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;

public interface CatalogService {

	public GiftCard addCatalog();

	public List<ProductCatalog> getProduct();

	public List<ProductCatalog> searchproduct(String ProductName);

	public String updateCatalog(ProductCatalog product);

}
