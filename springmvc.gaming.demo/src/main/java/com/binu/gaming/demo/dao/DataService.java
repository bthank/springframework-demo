package com.binu.gaming.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class DataService {
	
	public List<Integer> retrieveData(){

		
		return List.of(500,1000,700,800,85000);
	}
	
}