FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/patient-service-0.0.1-SNAPSHOT.jar patient-service.jar
ENTRYPOINT ["java","-jar","/patient-service.jar"]
