package org.example.rabbitmq;

import org.example.RabbitMqApplication;
import org.example.rabbit.queue.QueueSender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
public class QueueTest {

    @Autowired
    private QueueSender queueSender;

    @Test
    public void queueTest() throws Exception {
        queueSender.send("TEST");
    }
}
