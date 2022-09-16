FROM openjdk:17
EXPOSE 8080
ADD build/libs/simple-CICD.jar simple-CICD.jar
ENTRYPOINT ["java","-jar","/simple-CICD.jar"]