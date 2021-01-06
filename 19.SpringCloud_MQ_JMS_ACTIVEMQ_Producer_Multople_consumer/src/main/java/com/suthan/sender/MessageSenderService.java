package com.suthan.sender;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderService implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate jmsTemplete;
	
	@Scheduled(cron="*/10 * * * * *")
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String destination="mymultiplecomsumer";
		
		jmsTemplete.send(destination, new MessageCreator() {

			
			public Message createMessage(Session session) throws JMSException 
			{
				Message m=session.createTextMessage("HELLO FROM PRODUCE...DATA"+new Date());
				return m;
			}
			
		});
	}

}
