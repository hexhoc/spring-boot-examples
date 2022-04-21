package org.example.rabbit.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class QueueReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("queue Receiver  : " + hello);
    }

}
