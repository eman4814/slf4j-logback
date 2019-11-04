FROM openjdk:8u111-jdk-alpine

COPY target/slf4j-logback-1.0.jar /app/slf4j-logback-1.0.jar

CMD ["java","-jar","/app/slf4j-logback-1.0.jar"]