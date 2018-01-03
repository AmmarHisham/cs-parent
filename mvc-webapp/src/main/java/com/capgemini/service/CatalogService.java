package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.GiftCard;

public interface CatalogService {
	public List<GiftCard> getAllgiftCard();
	public GiftCard addCatalog();
	public List<GiftCard> addAllCatalog();
	public GiftCard getBycatagory();
	public String deleteCatalog();
	
}
