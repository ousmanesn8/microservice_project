package client.clientcoursenseignant.beans;

public class EnseignantBean {
    private String idEnseignant;
    private String nomEnseignant;
    private String prenomEnseignant;
    private String statusEnseignant;
    private String specialiteEnseignant;

    public EnseignantBean() {
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

    public String toString() {
        return "Enseignant  : \n" +
                "Id         = " + idEnseignant + ",\n" +
                "Prenom     = " + nomEnseignant + ",\n" +
                "Nom        = " + prenomEnseignant + ",\n" +
                "Status     = " + statusEnseignant + ",\n" +
                "specialite = " + specialiteEnseignant;
    }
}