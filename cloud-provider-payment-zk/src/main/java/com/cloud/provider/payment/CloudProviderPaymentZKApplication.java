package com.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPaymentZKApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentZKApplication.class, args);
    }
}
