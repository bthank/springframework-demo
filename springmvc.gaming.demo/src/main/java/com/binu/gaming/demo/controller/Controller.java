package com.binu.gaming.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binu.gaming.demo.service.BusinessService;

// Controller talks to business service
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public long getSum() {
		return businessService.calculateSum();
	}
	
}




