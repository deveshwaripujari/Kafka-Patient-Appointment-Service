FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/appointment-service-0.0.1-SNAPSHOT.jar appointment-service.jar
ENTRYPOINT ["java","-jar","/appointment-service.jar"]
