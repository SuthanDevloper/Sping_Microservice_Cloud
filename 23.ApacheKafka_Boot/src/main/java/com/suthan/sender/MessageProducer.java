package com.suthan.sender;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.suthan.consumer.MessageConsumer;

@Component
public class MessageProducer {
	private Logger log=LoggerFactory.getLogger(MessageConsumer.class);
	//log.info("Mesaage info at consumer"+message);
	
	@Autowired
	private KafkaTemplate<String, String> templete;
	
	@Value("${my.app.kafka.topic}")
	private String topic;
	
	public void sendMessage(String message) {
		log.info("Mesaage sent from producer"+message);
		templete.send(topic, message);
		
		

	}
	
	

}
