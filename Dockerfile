FROM openjdk:8-jre-alpine3.9
COPY /target/Myapi-0.0.1-SNAPSHOT.jar /app/jar/myapp.jar
# set the startup command to execute the jar
CMD ["java", "-jar", "/app/jar/myapp.jar"]

