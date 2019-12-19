Installer maven
Installer docker

Se placer à la racine du projet et taper : 
	mvn package
Ensuite :

	docker run -p 9191:8080 docker-cours:0.0.1-SNAPSHOT

Lancer Postman

Aller à : localhost:9191/cours pour afficher les cours ne pas oublier de choisir GET
Aller à : localhost:9191/addOrModifyCours  pour insérer un cours ne pas oublier de choisir POST
Aller à : localhost:9191/deleteCours/{id} pour supprimer un cours
Aller à : localhost:9191/cours/{id} pour afficher un cours particulier en fonction de son id

