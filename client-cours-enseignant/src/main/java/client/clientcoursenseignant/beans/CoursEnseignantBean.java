package client.clientcoursenseignant.beans;

public class CoursEnseignantBean {
    private int id;
    private String idcours;
    private String idEnseignant;


    public CoursEnseignantBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
