# microservice_project
# microservice_project
Le projet  gére la scolarité(enseignant et cours) avec des microservices pour chaque entité, nous avons utilisé: 
  - Projet Maven multi module :  (module enseignant et cours)
  - Spring Boot : pour chaque microservice(enseignant et cours)
  - Docker : pour le déploiement sur des conteneurs
  - Execution du projet : 
  - se positionner au niveau du POM.xml du projet "parent" avec le terminal qui vas creer les images docker("docker-cours" et "docker-  enseignant") et les conteneurs: 
  
    - Taper  
    - >mvn package
    - > docker-compose up
- Pour acceder au client qui appele les deux services, il faut aller à l'URL suivant :
  - http://localhost:9092/ 
