package com.example.messaging;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    public static final String DEMO_TOPIC = "demo_topic";
    private final KafkaTemplate<String,String> kafkaTemplate;

    public MessageSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message){
        kafkaTemplate.send(DEMO_TOPIC,message);
    }
}
