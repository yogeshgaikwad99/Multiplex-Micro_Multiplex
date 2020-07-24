package com.app.lti.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.lti.document.MultiplexDocument;

@Repository
public interface MultiplexRepository extends MongoRepository<MultiplexDocument, String> {

}
