package com.example.activemqtest;

import com.example.activemqtest.service.ConsumerService;
import com.example.activemqtest.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveMqTestApplication {

	public static void main(String[] args) throws JsonProcessingException {
		ConfigurableApplicationContext appContext = SpringApplication.run(ActiveMqTestApplication.class, args);
		ProducerService producerService = appContext.getBean(ProducerService.class);
		producerService.sendToQueue();
		producerService.sendToTopic();
	}

}
