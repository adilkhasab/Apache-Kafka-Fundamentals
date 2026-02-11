package com.acuver.kafkademo.controller;


import com.acuver.kafkademo.producer.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;

    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String createOrder() {
        producer.sendOrder("Order created successfully");
        return "Order event sent to Kafka";
    }
}
