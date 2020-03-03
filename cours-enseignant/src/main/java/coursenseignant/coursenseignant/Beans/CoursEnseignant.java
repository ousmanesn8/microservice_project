package coursenseignant.coursenseignant.Beans;

import javax.persistence.*;

@Entity
public class CoursEnseignant {

    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private String id;
    private String idcours;
    private String idEnseignant;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


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
