package org.example.controller;

import org.example.rabbit.exchange.TopicSender;
import org.example.rabbit.fanout.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fanout")
public class FanoutController {

    @Autowired
    private FanoutSender fanoutSender;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage() {
        fanoutSender.send();
        return new ResponseEntity<>("Message is send", HttpStatus.OK);
    }

}
