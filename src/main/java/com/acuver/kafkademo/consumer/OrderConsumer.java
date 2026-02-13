package com.acuver.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order.created", groupId = "order-group")
    public void consume(String message) {
        System.out.println("Received Order Event: " + message);
    }
}
