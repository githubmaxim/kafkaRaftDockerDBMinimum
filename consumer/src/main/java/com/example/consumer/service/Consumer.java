package com.example.consumer.service;

import com.example.consumer.entity.MyEnt;
import com.example.consumer.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Consumer {
    private final MyRepository myRepository;

    @KafkaListener(topics="msg", groupId="order-1")
    public void msgListener(String msg){
        System.out.println("Consumer created");
        System.out.println(msg);
        log.info("Прочитано сообщение {}", msg);

        myRepository.save(MyEnt.builder().text(msg).build());
        System.out.println("Сообщение записано в БД");
        log.info("Save {}", msg);
    }
}
