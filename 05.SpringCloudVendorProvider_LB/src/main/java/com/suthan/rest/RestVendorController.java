package com.suthan.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class RestVendorController {
	
	@Value("${server:port}")
	private String port;
	
	@GetMapping("/info")
	public String showcard() {
		return"from vendor"+port;
	}

}
