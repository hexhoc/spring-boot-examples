package org.example.controller;

import org.example.rabbit.exchange.TopicSender;
import org.example.rabbit.queue.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    private TopicSender topicSender;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage() {
        topicSender.send();
        topicSender.send1();
        topicSender.send2();
        return new ResponseEntity<>("Message is send", HttpStatus.OK);
    }

}
