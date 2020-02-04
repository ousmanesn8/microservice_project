package microservice.cours;

import microservice.cours.Controller.CoursController;
import microservice.cours.Model.Cours;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CoursApplicationTests {

    @Autowired
    CoursController cc = new CoursController();

    @Test
    public void testListTousLesCours(){
        Cours c = new Cours();
        c.setIdcours("c1");
        c.setNom("qualite");
        c.setSemestre("s1");
        c.setDepartement("informatique");
        c.setVolume(40);
        cc.ajouterModifierCours(c);
        Assert.isTrue(cc.listCours().size()==2);
    }

    @Test
    public void testAdd(){
        Cours c = new Cours();
        c.setIdcours("c4");
        c.setNom("machine learning");
        c.setSemestre("s1");
        c.setDepartement("informatique");
        c.setVolume(40);
        cc.ajouterModifierCours(c);
        System.out.println(cc.listCours());
        Assert.isTrue(cc.afficherUnCours("c4").getNom().equalsIgnoreCase("machine learning"));
    }

    @Test
    public void getUnCours(){
        Assert.isTrue(cc.afficherUnCours("c1").getNom().equals("qualite"));
        Assert.isTrue(cc.afficherUnCours("c1").getSemestre().equals("s1"));
        Assert.isTrue(cc.afficherUnCours("c1").getDepartement().equals("informatique"));
        Assert.isTrue(cc.afficherUnCours("c1").getVolume()==40);
    }

    @Test
    public void testModify(){
        Cours c = new Cours();
        c.setIdcours("c4");
        c.setNom("machine");
        c.setSemestre("s1");
        c.setDepartement("mathématiques");
        c.setVolume(40);
        cc.ajouterModifierCours(c);
        Assert.isTrue(cc.afficherUnCours("c4").getNom().equals("machine"));
        Assert.isTrue(cc.afficherUnCours("c4").getSemestre().equals("s1"));
        Assert.isTrue(cc.afficherUnCours("c4").getDepartement().equals("mathématiques"));
        Assert.isTrue(cc.afficherUnCours("c4").getVolume()==40);

    }

    @Test
    public void testDelete(){
        cc.supprimerCours("c4");
        Assert.isTrue(cc.listCours().size()==1);
    }
}
