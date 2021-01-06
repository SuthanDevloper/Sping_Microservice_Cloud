package com.suthan.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AppThreeRestController {
	
	private Logger log =LoggerFactory.getLogger(AppThreeRestController.class);
	
	@Autowired
	private RestTemplate temple;
	
	@GetMapping("/showC")
	public String showA() {
		
		log.info("WELCOME TO SERVICE3");
		
		log.info("Bye from service Three");
		return "Done";
		
	}

}
