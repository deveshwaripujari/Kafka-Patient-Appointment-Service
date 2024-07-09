package com.example.appointmentservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AppointmentListener {

    @KafkaListener(topics = "patient-registered", groupId = "group_id")
    public void listen(Patient patient) {
        // Handle the patient registration event
        System.out.println("Received patient registration: " + patient.getName());
    }
}
