package com.cloud.stream.rabbitmq.service.impl;

import com.cloud.stream.rabbitmq.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

@Slf4j
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output; //message provider sending channel


    @Override
    public String send() {
        String testdata = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(testdata).build());
        log.info("---------->" + testdata);
        return null;
    }
}
