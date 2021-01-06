package com.suthan.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VedorRestConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	//geting instance
	public String getVendorInfo() {
		ServiceInstance si =client.choose("VENDOR-SERVICE");
		
		String url =si.getUri()+ "/vendor/info";
		
		RestTemplate rt = new RestTemplate();
		
		// make http call get reponse data
		String response = rt.getForObject(url, String.class);
		return response;
		
		//return null;
		
		
	}

}
