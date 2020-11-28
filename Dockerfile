FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/projetAGL-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "projetAGL-0.0.1-SNAPSHOT.jar"]
