package com.suthan.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppOneRestController {
	
	private Logger log =LoggerFactory.getLogger(AppOneRestController.class);
	
	@Autowired
	private RestTemplate temple;
	
	@GetMapping("/showA")
	public String showA() {
		
		log.info("WELCOME TO SERVICE1");
		String resp =	temple.getForObject("http://localhost:8082/showB",String.class);
		log.info("Back to service one");
		return "Done";
		
	}

}
