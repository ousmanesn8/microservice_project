FROM openjdk:8
ADD target/client-cours-enseignant-0.0.1-SNAPSHOT.jar client-cours-enseignant.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "client-cours-enseignant.jar"]
