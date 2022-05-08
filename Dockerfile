FROM openjdk:8

ADD target/*.jar app-docker.jar
ENTRYPOINT ["java","-jar","app-docker.jar"]