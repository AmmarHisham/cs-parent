package com.cg.catalog.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.catalog.app.bean.GiftCardCatalog;

public interface MongoRepoGifts extends MongoRepository<GiftCardCatalog, String>{

}
