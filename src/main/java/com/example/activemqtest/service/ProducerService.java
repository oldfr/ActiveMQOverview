package com.example.activemqtest.service;

import com.example.activemqtest.model.Department;
import com.example.activemqtest.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;
import java.util.Date;

@Component
public class ProducerService {

    @Value("${spring.activemq.topic}")
    String topic;

    @Value("${spring.activemq.queue}")
    String queue;

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendToQueue() throws JsonProcessingException {
        try {
            Employee employee = new Employee("Micheal", "Jackson", 10000L, new Date(), 24);
            String jsonObj = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(employee);
            jmsTemplate.send(queue, messageCreator -> {
                TextMessage message = messageCreator.createTextMessage();
                message.setText(jsonObj);
                return message;
            });
        }
        catch (Exception ex) {
            System.out.println("ERROR in sending message to queue");
        }
    }

    public void sendToTopic() throws JsonProcessingException {
        try {
            Department department = new Department(1,"HR",100);
            String jsonObj = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(department);
            jmsTemplate.send(topic, messageCreator -> {
                TextMessage message = messageCreator.createTextMessage();
                message.setText(jsonObj);
                return message;
            });
        }
        catch (Exception ex) {
            System.out.println("ERROR in sending message to queue");
        }
    }

}
