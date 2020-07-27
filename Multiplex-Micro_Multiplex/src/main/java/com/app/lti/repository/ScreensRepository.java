package com.app.lti.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.app.lti.document.Screens;


@Repository
public interface ScreensRepository extends MongoRepository<Screens, String> {

}