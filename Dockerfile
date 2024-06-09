FROM openjdk:21
ADD DevOps_app-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","DevOps_app-1.0-SNAPSHOT.jar"]
