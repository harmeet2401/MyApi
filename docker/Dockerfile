FROM quay.io/devfile/maven:3.8.1-openjdk-17-slim

WORKDIR /build

# Build dependency offline to streamline build
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src
RUN mvn package -Dmaven.test.skip=true

FROM openjdk:11-jdk

COPY --from=0 /build/target/Myapi-0.0.1-SNAPSHOT.jar /app/jar/myapp.jar
# set the startup command to execute the jar
EXPOSE 8082
ENTRYPOINT [ "java", "-jar", "/app/jar/myapp.jar", "--server.port=8082" ]
