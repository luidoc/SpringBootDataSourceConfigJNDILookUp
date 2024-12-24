package com.examples.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.dao.TestRepository;
import com.examples.model.Test;

@RestController
public class TestController {
	
	@Autowired
	public TestRepository testRepo;
	
	@RequestMapping("/testing")
	public List<Test> testInformation() {
		
		List<Test> tests = testRepo.findAll();
		
		return tests;
	}
}
