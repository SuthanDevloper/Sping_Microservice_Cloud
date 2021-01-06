package com.suthan.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class PaymentRescontroller {
	
	@GetMapping("/pay")
	@HystrixCommand(
			fallbackMethod = "doDummyPay"
			/*commandProperties = { 
					@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",
							value="5"),
					@HystrixProperty(
							name="circuitBreaker.sleepWindowInMilliseconds",
							value = "10000"),
					@HystrixProperty(
							name="circuitBreaker.enabled",
							value = "false"),
					
			}*/
	
			)
	public String doPayment() {
		System.out.println("FROM PAYMENT METHOD-START");
		if(new Random().nextInt(15)<=10) {
			throw new RuntimeException("DUMMY EX");
		}
		System.out.println("FROM PAYMENT METHOD-END");
		return "SUCCESS";	
	}
	
	public String doDummyPay() {
		System.out.println("FROM FALLBACK METHOD-START");
		return "PLZ TRY LATER";
	}

}
