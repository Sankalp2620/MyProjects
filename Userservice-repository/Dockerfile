# Step 1: Use Maven to build the project
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Step 2: Use a lightweight JDK to run the app
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose port 8081 (or whatever you set in application.properties)
EXPOSE 8081

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]