package com.suthan.sender;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderService implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate jmsTemplete;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		String destination="mysql";
		
		jmsTemplete.send(destination, new MessageCreator() {

			
			public Message createMessage(Session session) throws JMSException 
			{
				Message m=session.createTextMessage("HELLO FROM PRODUCE"+new Date());
				return m;
			}
			
		});
	}

}
