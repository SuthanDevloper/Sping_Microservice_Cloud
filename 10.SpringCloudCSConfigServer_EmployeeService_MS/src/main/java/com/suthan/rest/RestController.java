package com.suthan.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/employee")
public class RestController {
		
	@Value("${app.title}")
	private String code;
	
	@GetMapping("/data")
	public String getConfigServer(){
		
		return "Hello Config server  restcontroller"+code;
	}

}
