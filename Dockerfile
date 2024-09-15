FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml /app/
RUN mvn dependency:go-offline

COPY src /app/src
RUN mvn package -DskipTests=true

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=build /app/target/todo-service.jar /app/todo-service.jar

EXPOSE 8080 8080

VOLUME /data/service

CMD [ "java", "-jar", "/app/todo-service.jar" ]