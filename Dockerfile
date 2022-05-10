FROM openjdk:11
ENV APP_HOME=/usr/myapp/
WORKDIR $APP_HOME
COPY target/*.jar spring-application-ws-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","spring-application-ws-0.0.1-SNAPSHOT.jar"]
