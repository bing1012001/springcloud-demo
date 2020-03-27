package com.cloud.provider.payment.controller;


import com.cloud.commons.entities.CommonResult;
import com.cloud.commons.entities.Payment;
import com.cloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.createPayment(payment);
        log.info("Create process result is : " + result);
        if(result > 0) {
            return new CommonResult(200, "success on port " + serverPort, result);
        } else {

            return new CommonResult(444, "failed to create the payment on port" + serverPort, null);
        }
    }

    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null) {
            return new CommonResult(200, "success on port "+ serverPort, payment);
        } else {

            return new CommonResult(444, "failed to get the payment by Id on port "+ serverPort + id, null);
        }
    }

}
