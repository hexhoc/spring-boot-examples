package org.example.controller;

import org.example.rabbit.queue.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    private QueueSender queueSender;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam(required = false, defaultValue = "YO") String m) {
        queueSender.send(m);
        return new ResponseEntity<>("Message is send", HttpStatus.OK);
    }

}
