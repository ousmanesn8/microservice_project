package client.clientcoursenseignant.beans;

public class CoursBean {
    private String idcours;
    private String idenseignant;
    private String nom;
    private String semestre;
    private String departement;
    private int volume;

    public CoursBean() {
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "idcours='" + idcours + '\'' +
                ", idenseignant='" + idenseignant + '\'' +
                ", nom='" + nom + '\'' +
                ", semestre='" + semestre + '\'' +
                ", departement='" + departement + '\'' +
                ", volumeHoraire=" + volume +
                '}';

    }

}
