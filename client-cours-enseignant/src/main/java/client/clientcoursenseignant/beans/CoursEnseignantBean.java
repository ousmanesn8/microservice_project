package client.clientcoursenseignant.beans;

public class CoursEnseignantBean {
    private String id;
    private String idcours;
    private String idEnseignant;


    public CoursEnseignantBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdcours() {
        return idcours;
    }

    public void setIdcours(String idcours) {
        this.idcours = idcours;
    }

    public String getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(String idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    @Override
    public String toString() {
        return "CoursEnseignantBean{" +
                "idcours='" + idcours + '\'' +
                ", idEnseignant='" + idEnseignant + '\'' +
                '}';
    }
}
