package com.app.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.lti.document.Screens;
import com.app.lti.repository.ScreensRepository;


@Service
public class ScreeensServiceImpl implements ScreensService {

	@Autowired
	private ScreensRepository repository;
	
	@Override
	public List<Screens> findAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

}