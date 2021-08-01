package com.binu.gaming.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.binu.gaming.demo.dao.DataService;


//business service talks to data service
@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		
		List<Integer> numList = dataService.retrieveData();
		
		long sum = numList.stream().reduce(Integer::sum).get();
		
		return sum;
	}
	
}