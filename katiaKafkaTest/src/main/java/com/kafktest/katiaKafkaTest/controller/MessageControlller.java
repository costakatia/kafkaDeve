package com.kafktest.katiaKafkaTest.controller;


import net.javaguides.s
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageControlller {
    private K ;

    public  MessageControlller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    //http:localhost:8080/api/v1/kafka/publish?message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
    KafkaProducer.send
    }
}
