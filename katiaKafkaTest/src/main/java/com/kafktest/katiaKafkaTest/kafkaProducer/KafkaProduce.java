package com.kafktest.katiaKafkaTest.kafkaProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProduce {

    private static final Logger logger
            = LoggerFactory.getLogger(KafkaProduce.class);
    private KafkaTemplate<String,String> KafkaTemplate;

    public KafkaProduce(KafkaTemplate<String, String> kafkaTemplate) {
     this.KafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message){
        logger.info(String.format("Message sent %s",message));
        KafkaTemplate.send("javaguides",message);
    }
}
