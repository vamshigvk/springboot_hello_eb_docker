FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG WAR_FILE=target/aws-beanstalk-example-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]