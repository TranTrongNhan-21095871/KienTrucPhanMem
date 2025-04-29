# Sử dụng openjdk 17 làm base image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Sao chép file JAR vào container
COPY build/libs/InventoryService-*.jar app.jar

# EXPOSE cổng 8081 cho product-service
EXPOSE 8082

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
