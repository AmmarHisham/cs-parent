package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<ProductCatalog> getProduct() {
		ProductCatalog[] cartLists = restTemplate.getForObject(URLConstants.GET_ALLPRODUCT, ProductCatalog[].class);
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		for (int i = 0; i < cartLists.length; i++) {
			list.add(cartLists[i]);
		}
		return list;
	}

	@Override
	public List<ProductCatalog> searchProduct(String prodName) {
		ProductCatalog[] cartLists = restTemplate.postForObject(URLConstants.SEARCH_PRODUCT, ProductCatalog[].class,
				ProductCatalog[].class, prodName);
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		for (int i = 0; i < cartLists.length; i++) {
			list.add(cartLists[i]);
		}
		return list;
	}

	@Override
	public List<ProductCatalog> categorySearch(String categoryName) {
		ProductCatalog[] cartLists = restTemplate.postForObject(URLConstants.CATEGORY_SEARCH, ProductCatalog[].class,
				ProductCatalog[].class, categoryName);
		List<ProductCatalog> list = new ArrayList<ProductCatalog>();
		for (int i = 0; i < cartLists.length; i++) {
			list.add(cartLists[i]);
		}
		return list;
	}

}
