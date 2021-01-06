package com.suthan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class RestCartController {
	
	@GetMapping("/info")
	public String showcard() {
		return" welcome to card";
	}

}
