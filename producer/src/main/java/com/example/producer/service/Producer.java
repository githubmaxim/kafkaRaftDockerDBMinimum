package com.example.producer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Slf4j
@RequiredArgsConstructor
public class Producer {

    private String topic="msg";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msgId, String msg){
        System.out.println("Producer created");
        kafkaTemplate.send(topic , msgId, msg);
    }
}