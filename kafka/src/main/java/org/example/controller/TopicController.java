package org.example.controller;

import org.example.kafka.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    private TopicSender topicSender;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage() {
        topicSender.send("HELLOOO");
        return new ResponseEntity<>("Message is send", HttpStatus.OK);
    }
}
