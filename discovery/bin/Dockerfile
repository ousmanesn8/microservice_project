FROM openjdk:8
ADD target/discovery-0.0.1-SNAPSHOT.jar discovery.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "discovery.jar"]

