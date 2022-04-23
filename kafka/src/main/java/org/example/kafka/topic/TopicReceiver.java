package org.example.kafka.topic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver {
    @KafkaListener(topics = "quickstart", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Topic receiver: " + message);
    }
}
