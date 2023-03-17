package com.rohit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.demo.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	 
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/{category}")
	public String getOrdersByCategory(@PathVariable String category){
		
		return sampleService.displayData(category);
		
	}

}
