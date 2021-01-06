package com.suthan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suthan.consumer.MessageConsumer;
import com.suthan.sender.MessageProducer;
import com.suthan.store.MessageStore;

@Component
public class KafkaRestController {
	
	@Autowired
	private MessageProducer producer;
	
	@Autowired
	private MessageStore store;
	
	//1. send message to kafka
	@GetMapping("/send")
	public String sendMsg(
			@RequestParam("msg") String message)
	{
		producer.sendMessage(message);
		return "DONE";
	}
	
	//2. read all
	@GetMapping("/all")
	public String getAllMsgs() {
		return store.getAllMessage();
	}
	

}
