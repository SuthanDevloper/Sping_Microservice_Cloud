package com.suthan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymetRestController {
	@GetMapping("/pay")
	public String  ShowMeg() {
		
		return "From Payment Service";
		
	}

}
