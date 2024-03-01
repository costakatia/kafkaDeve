package com.kafktest.katiaKafkaTest.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private KafkaTemplate<String, String>KafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        KafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message){
        KafkaTemplate.send("javaguides",message);
    }
    public void sedMessage(String message){
        KafkaTemplate.send("javaguides", message);
    }
}
