create table if not exists cours(
idcours varchar(40) not null primary key,
idenseignant varchar(40),
nom varchar(40),
semestre varchar(40),
departement varchar(40),
volumehoraire integer);
