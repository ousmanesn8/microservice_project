package microservice.cours.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cours {
    @Column(name = "idcours")
    @Id
    private String idcours;
    @Column(name = "idenseignant")
    private String idenseignant;
    @Column(name = "nom")
    private String nom;
    @Column(name = "semestre")
    private String semestre;
    @Column(name = "departement")
    private String departement;
    @Column(name = "volumehoraire")
    private int volumehoraire;

    public Cours(String idcours, String idenseignant, String nom, String semestre, String departement, int volumeHoraire) {
        this.idcours = idcours;
        this.idenseignant = idenseignant;
        this.nom = nom;
        this.semestre = semestre;
        this.departement = departement;
        this.volumehoraire = volumehoraire;
    }

    public Cours(){

    }

    public String getIdcours() {
        return idcours;
    }

    public void setIdcours(String idcours) {
        this.idcours = idcours;
    }

    public String getIdenseignant() {
        return idenseignant;
    }

    public void setIdenseignant(String idenseignant) {
        this.idenseignant = idenseignant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getVolumeHoraire() {
        return volumehoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumehoraire = volumeHoraire;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "idcours='" + idcours + '\'' +
                ", idenseignant='" + idenseignant + '\'' +
                ", nom='" + nom + '\'' +
                ", semestre='" + semestre + '\'' +
                ", departement='" + departement + '\'' +
                ", volumeHoraire=" + volumehoraire +
                '}';
    }
}
