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

Voici un jeu de données pour tester :

{
	"idcours":"c1",
	"idenseignant":"e3",
	"semestre":"S1",
	"departement":"informatque",
	"nom":"qualité",
	"volumehoraire":50
}

{
	"idcours":"c2",
	"idenseignant":"e2",
	"semestre":"S1",
	"departement":"informatque",
	"nom":"nosql",
	"volumehoraire":50
}

{
	"idcours":"c3",
	"idenseignant":"e1",
	"semestre":"S2",
	"departement":"informatque",
	"nom":"framework",
	"volumehoraire":50
}


