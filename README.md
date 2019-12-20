# microservice_project
# microservice_project
Le projet  gére la scolarité(enseignant et cours) avec des microservices pour chaque entité, nous avons utilisé: 
  - Projet Maven multi module :  (module enseignant et cours)
  - Spring Boot : pour chaque microservice(enseignant et cours)
  - Docker : pour le déploiement sur des conteneurs
  - Execution du projet : 
  - se positionner au niveau du POM.xml du projet "parent" avec le terminal qui vas creer les images docker("docker-cours" et "docker-  enseignant") et les conteneurs: 
  
    - Taper  => mvn package
    - Tapez => docker run -p 4000:8080 docker-enseignant:0.0.1-SNAPSHOT
    - Tapez => docker run -p 9191:8080 docker-cours:0.0.1-SNAPSHOT
  
  - ces commandes vont lancer les conteneurs docker on pourras accer aux microservices grace au lien suivant :
  -Sur Postman : en attendant que nous réalisons le client 
    - http://localhost:4000/enseignants : type="GET" pour avoir la liste des enseignant (vide par defaut)
    - http://localhost:4000/enseignants/add :  pour ajouter un enseignant 
      * type="POST"
      * Body :  {
        "idEnseignant": "ens1",
        "nomEnseignant": "camara2",
        "prenomEnseignant": "ousmane",
        "statusEnseignant": "Tuning BD",
        "specialiteEnseignant": "Titulaire"
         }
    - http://localhost:4000/enseignants/update/ens1 : pour modifier l'enseigant qui a "ens1" comme id en ajouttant au body le code si-dessous : 
      * type="PUT"
      * Body : 
        	{
        "idEnseignant": "ens1",
        "nomEnseignant": "Simon",
        "prenomEnseignant": "Sily",
        "statusEnseignant": "Tun",
        "specialiteEnseignant": "Ti"
         }
     - http://localhost:4000/enseignants/delete/ens1 : pour la suppresion 
        * type: DEL
     - http://localhost:4000/enseignants/ens1 : pour rechercher l'enseignant avec l'id "ens1"
        * type : GET
- Pour COURS le "readme" est dans le fichier "readmi.txt" dans le projet
