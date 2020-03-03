package coursenseignant.coursenseignant.Beans;

import javax.persistence.*;

@Entity
public class CoursEnseignant {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String idcours;
    private String idEnseignant;

    public CoursEnseignant() {
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
}
