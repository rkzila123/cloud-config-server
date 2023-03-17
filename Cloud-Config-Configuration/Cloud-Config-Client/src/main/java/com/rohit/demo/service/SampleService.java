package com.rohit.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class SampleService {
	
	@Value("${microservice.payment.services.endpoint.uri}")
	 private String endPointUrl;
	
	public String displayData(String  str) {
    	return str+endPointUrl;
    }

}
