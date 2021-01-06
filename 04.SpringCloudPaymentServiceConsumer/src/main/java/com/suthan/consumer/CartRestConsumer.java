package com.suthan.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartRestConsumer {
	
	@Autowired
	private DiscoveryClient client;
	
	//geting instance
	public String cardInfo() {
		
		//getThe service instance 
		List<ServiceInstance> list=client.getInstances("CART-SERVICE");
		
		//read manually
		ServiceInstance si =list.get(0);
		
		//read URI and Path
		
		String url=si.getUri()+"/card/info";
		
		// create RestTemplete object
		
		RestTemplate rt = new RestTemplate();
		
		// make http call get reponse data
		String response = rt.getForObject(url, String.class);
		return response;
	}

}
