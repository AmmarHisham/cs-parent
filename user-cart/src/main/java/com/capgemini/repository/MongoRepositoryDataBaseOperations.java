package com.capgemini.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.UserCartModel;

@Transactional
public interface MongoRepositoryDataBaseOperations extends MongoRepository<UserCartModel, String> {

}
