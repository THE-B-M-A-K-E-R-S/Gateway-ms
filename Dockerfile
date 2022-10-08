FROM openjdk:8
EXPOSE 8080
ADD target/gateway-ms.jar gateway-ms.jar
ENTRYPOINT ["java", "-jar", "gateway-ms.jar"]