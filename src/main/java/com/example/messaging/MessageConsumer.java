package com.example.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(groupId = "demo_message_group", topics = {"demo_topic"})
    public void consume(String message) {
        System.out.println("consumed message " + message);
    }
}
