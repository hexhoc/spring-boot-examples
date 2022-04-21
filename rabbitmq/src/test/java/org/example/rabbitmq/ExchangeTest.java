package org.example.rabbitmq;

import org.example.rabbit.exchange.TopicSender;
import org.example.rabbit.queue.QueueSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExchangeTest {

    @Autowired
    private TopicSender topicSender;

    @Test
    public void exchangeTest() throws Exception {
        topicSender.send();
        topicSender.send1();
        topicSender.send2();
    }
}
