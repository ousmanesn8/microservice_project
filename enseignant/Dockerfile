FROM openjdk:8
ADD target/enseignant-0.0.1-SNAPSHOT.jar enseignant.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "enseignant.jar"]


