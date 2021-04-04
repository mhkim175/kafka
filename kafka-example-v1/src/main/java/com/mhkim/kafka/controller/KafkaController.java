package com.mhkim.kafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhkim.kafka.service.KafkaProducer;

import lombok.RequiredArgsConstructor;

/**
 * kafka ver.1: 카프카 간단 사용 예제
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka/v1")
public class KafkaController {

    private final KafkaProducer producer;

    @PostMapping(value = "/send")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "success";
    }

}
