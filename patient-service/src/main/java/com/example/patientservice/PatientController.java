package com.example.patientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private KafkaTemplate<String, Patient> kafkaTemplate;

    private static final String TOPIC = "patient-registered";

    @PostMapping("/register")
    public String registerPatient(@RequestBody Patient patient) {
        kafkaTemplate.send(TOPIC, patient);
        return "Patient registered successfully";
    }
}
