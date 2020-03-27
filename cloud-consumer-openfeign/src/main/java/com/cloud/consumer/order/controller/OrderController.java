package com.cloud.consumer.order.controller;

import com.cloud.commons.entities.CommonResult;
import com.cloud.commons.entities.Payment;
import com.cloud.consumer.order.service.PaymentFeignService;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    public static final String PAYMENT_HOST_URL= "http://cloud-payment-service";



    @GetMapping("/consumer/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        return paymentFeignService.getPaymentById(id);
    }

}
