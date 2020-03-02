FROM openjdk:8
ADD target/cours-enseignant-0.0.1-SNAPSHOT.jar cours-enseignant.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "cours-enseignant.jar"]
EXPOSE 9092

