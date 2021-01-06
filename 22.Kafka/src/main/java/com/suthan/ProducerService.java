package com.suthan;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class ProducerService {

	
	public static void main(String[] args) {
		//01.configration property
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		
		//02.Kafka object
		//JDK 1.7 : Collections Type Inference
		KafkaProducer<String, String> producer=new KafkaProducer<>(props);
		
		//03.kafaka record or ; 
		
		String message ="WELCOME TO KAFKA java";
		String topic="kafka-sample";
		
		ProducerRecord<String, String> record = new ProducerRecord<>(topic, message);
		
		//04.send flush
		producer.send(record);
		producer.flush();
		producer.close();
		
		//05.print simple message
		
		
		System.out.println("DATA IS SENT");
	}

}
