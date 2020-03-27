package com.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment2Application.class, args);
    }
}
