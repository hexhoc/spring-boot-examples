package org.example.kafka.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private KafkaTemplate<Object, Object> template;

    public void send(String message) {
        this.template.send("quickstart", message);
    }
}
