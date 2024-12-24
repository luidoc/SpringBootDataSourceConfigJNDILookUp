package com.examples.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.examples.model.Test;

public interface TestRepository extends MongoRepository<Test, String> {

}
