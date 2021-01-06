package com.suthan.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


import com.suthan.store.MessageStore;

@Component
public class MessageConsumer {
	
	private Logger log=LoggerFactory.getLogger(MessageConsumer.class);
	
	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics="${my.app.kafka.topic}",groupId = "kkk")
	private void consumer(String message) {
		log.info("Mesaage info at consumer"+message);
		store.addMessage(message);
		

	}

}
