package com.capgemini.serviceimpl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;

public class CatalogServiceImpl {

	RestTemplate restTemplate = new RestTemplate();

	public ProductCatalog getProduct() {

		ResponseEntity<ProductCatalog> cartLists = restTemplate.getForEntity(URLConstants.GET_ALLPRODUCT, ProductCatalog.class);
		if (cartLists != null) {
			return cartLists.getBody();
		}
		return null;
	}
}
