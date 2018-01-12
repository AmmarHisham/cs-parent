package com.capgemini.service;

import java.util.List;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;

public interface CatalogService {

	public GiftCard addCatalog();

	public List<ProductCatalog> getProduct();

	public String updateCatalog(ProductCatalog product);

	List<ProductCatalog> searchProduct(String prodName);

	List<ProductCatalog> categorySearch(String key);

}
