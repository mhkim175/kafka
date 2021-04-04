package com.mhkim.kafka.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "tms", groupId = "dev")
    public void consume(String message) throws IOException {
        System.out.println(String.format("Consumed message : %s", message));
    }

}
