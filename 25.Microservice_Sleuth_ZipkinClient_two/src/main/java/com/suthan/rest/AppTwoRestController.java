package com.suthan.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppTwoRestController {
	
	private Logger log =LoggerFactory.getLogger(AppTwoRestController.class);
	
	@Autowired
	private RestTemplate temple;
	
	@GetMapping("/showB")
	public String showA() {
		
		log.info("WELCOME TO SERVICE2");
		String resp =	temple.getForObject("http://localhost:8083/showC",String.class);
		log.info("Back to service two");
		return "Done";
		
	}

}