package org.example.rabbitmq;

import org.example.rabbit.exchange.TopicSender;
import org.example.rabbit.fanout.FanoutSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
public class FanoutTest {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void fanoutTest() throws Exception {
        fanoutSender.send();
    }
}
