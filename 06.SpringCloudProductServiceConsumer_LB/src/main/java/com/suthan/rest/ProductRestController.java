package com.suthan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.suthan.consumer.VedorRestConsumer;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	private VedorRestConsumer consumer;
	
	@GetMapping("/data")
	public String showcard() {
		return"FROM product" +consumer.getVendorInfo();
	}
	

}
