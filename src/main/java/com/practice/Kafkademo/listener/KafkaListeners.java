package com.practice.Kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "firstTopic", groupId = "groupId-2")
    void listener(String data) {
        System.out.println("Listener received: "+data +" 🍕");
    }
}
