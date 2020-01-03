package com.imageworks.spcue.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ActiveMQConfig {
    public static final String HELLO_QUEUE = "hello.queue";

    @Bean
    public Queue helloJMSQueue() {
        return new ActiveMQQueue(HELLO_QUEUE);
    }
}
