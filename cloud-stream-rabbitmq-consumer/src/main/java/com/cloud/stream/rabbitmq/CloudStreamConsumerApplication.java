package com.cloud.stream.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamConsumerApplication.class, args);
    }

}
