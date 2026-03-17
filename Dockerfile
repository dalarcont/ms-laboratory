# BUILD STAGE
FROM maven:3-eclipse-temurin-8 AS builder
WORKDIR /app
COPY . .

# Construcción del jar
RUN mvn clean package -DskipTests
RUN JAR_FILE=$(ls /app/target/*.jar | grep -v 'original' | head -n 1) && \
    echo "Detected JAR: $JAR_FILE" && \
    mv "$JAR_FILE" /app/target/app.jar
	
# FINAL STAGE
FROM amazoncorretto:8-alpine-jre
RUN mkdir -p /opt/msworkdir/ms-laboratory
WORKDIR /opt/msworkdir/ms-laboratory
COPY --from=builder /app/target/app.jar /opt/msworkdir/ms-laboratory/ms-laboratory.jar
ENTRYPOINT ["java", "-jar", "/opt/msworkdir/ms-laboratory/ms-laboratory.jar"]
