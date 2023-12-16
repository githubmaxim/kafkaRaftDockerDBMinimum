package com.example.producer;

import com.example.producer.service.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(ProducerApplication.class, args);
        Producer producer = context.getBean(Producer.class);
        producer.sendMessage("1", "hello");
//
    }

}
