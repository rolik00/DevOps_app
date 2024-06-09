FROM openjdk:21
ADD target/*.jar DevOps_app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","DevOps_app.jar"]
