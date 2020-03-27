package com.cloud.provider.payment.dao;

import com.cloud.commons.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {

    @Resource
    private PaymentDao paymentDao;

    @Test
    public void createTest() {
        Payment payment = Payment.builder().serialNum(UUID.randomUUID().toString()).build();
        int result = paymentDao.create(payment);
        log.info(String.format("create the payment record %s !", result));
    }


}
