package org.example.rabbit.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class QueueSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(String message) {
		String context = "hello " + new Date() + message;
		System.out.println("queue Sender : " + context);
		this.rabbitTemplate.convertAndSend("hello", context);
	}

}