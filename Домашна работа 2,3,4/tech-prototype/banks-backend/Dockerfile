# Use openjdk image as base
FROM openjdk:19

# Copy the jar file for the application to the image
COPY target/lab-0.0.1-SNAPSHOT.jar /app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Set environment variables for the application
ENV DATABASE_URL=jdbc:postgresql://postgres:5436/banks
ENV DATABASE_USERNAME=dians
ENV DATABASE_PASSWORD=dians123

# Run the application when a container is started from the image
CMD ["java", "-jar", "/app.jar"]
