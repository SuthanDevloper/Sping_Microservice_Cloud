package com.suthan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Scope("prototype")
public class StudentRestControoler {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/show")
	public String show() {
		return "Hello";
		
	}
}
