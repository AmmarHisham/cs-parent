package com.capgemini.service;

import java.util.List;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;

public interface CatalogService {

	public List<ProductCatalog> getProduct();

	List<ProductCatalog> searchProduct(String prodName);

	List<ProductCatalog> categorySearch(String key);

}
