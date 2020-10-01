package com.maynar.kafkaconsumerdemo1.service;

import com.maynar.model.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"topic_string"}, groupId = "group_string")
    public void consume(String message){
        System.out.println("Message: " + message);
    }

    @KafkaListener(topics = {"topic_json3"}, groupId = "group_json",
        containerFactory = "getKafkaEmployeeListener")
    public void consume(Employee employee){
        System.out.println("Employee: " + employee);
    }
}