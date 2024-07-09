# Patient Appointment Service Using Kafka
## Demo Project for Event-Based Architecture

## Project Overview
This project implements a microservices architecture for managing patient appointments, utilizing Apache Kafka.

## Why Apache Kafka?
Apache Kafka is a distributed streaming platform capable of handling trillions of events a day. 

- **Asynchronous Communication**: Event-based uses events for communication, not direct API calls; it doesn't require a request to receive a response.
- **Decoupling**: Decouples services by having them communicate through events.
- - **Scalability**: With Kafka, our system can handle large volumes of events seamlessly, making it ideal for the increasing scale of our application.
- **Reliability**: It provides reliable event storage and processing, ensuring that all patient appointment data is accurately captured and available for real-time processing.

Kafka's distributed nature support our need for a high-performance, scalable, and dependable messaging system in a microservices architecture.

## Key Features
- **Microservices Architecture**: Allows for independent service scalability and maintenance.
- **Docker Containerization**: Ensures consistency.
- **Real-time Data Streaming**: Manages appointments efficiently.

## Technologies Used
- **Apache Kafka**: For messaging and stream processing.
- **Java**: Programming language.
- **Spring Boot**: Spring applications.
- **Docker & Docker Compose**: For containerization and orchestration of services.

## Setup and Running Instructions
1. **Clone the repository:**
   ```bash
   git clone https://github.com/deveshwaripujari/Kafka-Patient-Appointment-Service.git
