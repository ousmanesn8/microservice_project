package microservice.enseignant;

import microservice.enseignant.controller.EnseignantController;
import microservice.enseignant.model.Enseignant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class EnseignantApplicationTests {
    @Autowired
    EnseignantController enseignantController =new EnseignantController();

    @Test
    public void TestRepositoryAdd(){
        Enseignant  enseignant =new Enseignant();
        enseignant.setIdEnseignant("enseignant1");
        enseignant.setNomEnseignant("Lopez");
        enseignant.setPrenomEnseignant("Stephane");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Programmation");
        enseignantController.addEnseigant(enseignant);

        enseignant.setIdEnseignant("enseignant2");
        enseignant.setNomEnseignant("YEH");
        enseignant.setPrenomEnseignant("Lauren");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Tuning");
        enseignantController.addEnseigant(enseignant);
        Assert.isTrue(enseignantController.listEnseignants().size()==2, "Enregistrement OK !!!!!");
    }
    @Test
    public void TestFinfEnsseignant(){
        Enseignant  enseignant =new Enseignant();
        enseignant.setIdEnseignant("enseignant1");
        enseignant.setNomEnseignant("Lopez");
        enseignant.setPrenomEnseignant("Stephane");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Programmation");
        enseignantController.addEnseigant(enseignant);

        enseignant.setIdEnseignant("enseignant2");
        enseignant.setNomEnseignant("YEH");
        enseignant.setPrenomEnseignant("Lauren");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Tuning");
        enseignantController.addEnseigant(enseignant);
        Enseignant enseignant1= enseignantController.afficherUnEnseignant("enseignant2");
        Assert.notNull(enseignant1, "Enseigant "+enseignant1.getIdEnseignant()+ "  Existe !!!");
    }

    @Test
    public void TestDeleteEnseignant(){
        Enseignant  enseignant =new Enseignant();
        enseignant.setIdEnseignant("enseignant1");
        enseignant.setNomEnseignant("Lopez");
        enseignant.setPrenomEnseignant("Stephane");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Programmation");
        enseignantController.addEnseigant(enseignant);

        enseignant.setIdEnseignant("enseignant2");
        enseignant.setNomEnseignant("YEH");
        enseignant.setPrenomEnseignant("Lauren");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Tuning");
        enseignantController.addEnseigant(enseignant);
        Enseignant enseignant1= enseignantController.afficherUnEnseignant("enseignant2");
        enseignantController.deleteEnseignant("enseignant2");

        Assert.isTrue(enseignantController.listEnseignants().size()==1, "Enseigant2  n'Existe !!!");
    }

    @Test
    public void TestUpdateEnseignant() {
        Enseignant enseignant = new Enseignant();
        enseignant.setIdEnseignant("enseignant1");
        enseignant.setNomEnseignant("Lopez");
        enseignant.setPrenomEnseignant("Stephane");
        enseignant.setStatusEnseignant("Titulaire");
        enseignant.setSpecialiteEnseignant("Programmation");
        enseignantController.addEnseigant(enseignant);

        Enseignant enseignant1 =new Enseignant();
        enseignant1.setIdEnseignant("enseignant1");
        enseignant1.setNomEnseignant("Camara");
        enseignant1.setPrenomEnseignant("Ousmane");
        enseignant1.setStatusEnseignant("Titulaire");
        enseignant1.setSpecialiteEnseignant("Programmation");
        enseignantController.updateEnseignant(enseignant1.getIdEnseignant(),enseignant1);
        Assert.isTrue(enseignantController.afficherUnEnseignant("enseignant1").getNomEnseignant().equals("Camara"),"Mise à jours OK!!!");
    }

}
