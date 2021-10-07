FROM openjdk:16-alpine3.13
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chat_app.jar
ENTRYPOINT ["java","-jar","/chat_app.jar"]