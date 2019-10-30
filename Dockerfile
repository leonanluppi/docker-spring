FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} ${JAR_FILE}
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test-docker-0.1.0.jar"]