FROM openjdk:11-jre-slim

ENV JAVA_OPTS " -Xms512m -Xmx512 -Djava.security.egd=file:/dev/./urandom"

WORKDIR application

COPY target/brewery-restful-service-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java", "-jar", "brewery-restful-service-0.0.1-SNAPSHOT.jar"]