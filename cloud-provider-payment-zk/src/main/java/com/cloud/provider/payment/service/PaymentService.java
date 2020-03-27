package com.cloud.provider.payment.service;

import com.cloud.commons.entities.Payment;
import com.cloud.provider.payment.dao.PaymentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int createPayment(Payment payment) {
        return paymentDao.create(payment);
    }


    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }

}
