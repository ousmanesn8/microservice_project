FROM openjdk:8
ADD target/cours-0.0.1-SNAPSHOT.jar cours.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "cours.jar"]
EXPOSE 9090
