package com.example.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "customer-data",
            groupId = "com.example"
    )
    void listener(String data) {
        System.out.println("Listener received: "+data);
    }
}
