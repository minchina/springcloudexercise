FROM java:8
WORKDIR /app
ADD ./target/eurekaserver-0.0.1.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
EXPOSE 8761