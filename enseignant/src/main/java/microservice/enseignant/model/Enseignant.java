package microservice.enseignant.model;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "enseignant")
public class Enseignant {
	@Id
    private String idEnseignant;
    private  String nomEnseignant;
    private  String prenomEnseignant;
    private  String statusEnseignant;
    private  String specialiteEnseignant;


    @Override
    public String toString() {
        return "Enseignant  : \n" +
                "Id         = "+ idEnseignant +",\n" +
                "Prenom     = "+ nomEnseignant +",\n" +
                "Nom        = "+ prenomEnseignant +",\n" +
                "Status     = "+ statusEnseignant +",\n" +
                "specialite = "+ specialiteEnseignant;
    }

    public Enseignant(){}

    public Enseignant(String idEnseignant, String nomEnseignant, String prenomEnseignant, String statusEnseignant, String specialiteEnseignant) {
        this.idEnseignant = idEnseignant;
        this.nomEnseignant = nomEnseignant;
        this.prenomEnseignant = prenomEnseignant;
        this.statusEnseignant = statusEnseignant;
        this.specialiteEnseignant = specialiteEnseignant;
    }

    public String getSpecialiteEnseignant() {
        return specialiteEnseignant;
    }

    public void setSpecialiteEnseignant(String specialiteEnseignant) {
        this.specialiteEnseignant = specialiteEnseignant;
    }

    public String getStatusEnseignant() {
        return statusEnseignant;
    }

    public void setStatusEnseignant(String statusEnseignant) {
        this.statusEnseignant = statusEnseignant;
    }

    public String getPrenomEnseignant() {
        return prenomEnseignant;
    }

    public void setPrenomEnseignant(String prenomEnseignant) {
        this.prenomEnseignant = prenomEnseignant;
    }

    public String getNomEnseignant() {
        return nomEnseignant;
    }

    public void setNomEnseignant(String nomEnseignant) {
        this.nomEnseignant = nomEnseignant;
    }

    public String getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(String idEnseignant) {
        this.idEnseignant = idEnseignant;
    }
}
