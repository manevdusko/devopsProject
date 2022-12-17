FROM openjdk:8-alpine
add target/*.jar springboot-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springboot-docker-0.0.1-SNAPSHOT.jar"]