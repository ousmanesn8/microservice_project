package microservice.cours.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import microservice.cours.DAO.CoursDao;
import microservice.cours.Exception.CoursIntrouvableException;
import microservice.cours.Model.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "Microservice de gestion de cours")
@RestController
public class CoursController {

    @Autowired
    private CoursDao coursDao;

    //Récupérer un cours par son Id
    @ApiOperation(value = "Recupère le id d'un cours et affiche le cours correspondant")
    @GetMapping(value = "cours/{id}")
    public Cours afficherUnCours(@PathVariable String id) throws CoursIntrouvableException {
        Optional<Cours> c=coursDao.findById(id);
        if(c==null) throw new CoursIntrouvableException("Le cours de id "+id+" que vous recherchez n'existe pas");
        return c.get();
    }

    //Afficher tout les cours
    @ApiOperation(value = "Affiche tout les cours")
    @GetMapping(value = "cours")
    public List<Cours> listCours(){return coursDao.findAll();}

    //Supprimer un cours
    @ApiOperation(value = "Recupère le id d'un cours et supprime le cours correspondant")
    @DeleteMapping(value = "deleteCours/{id}")
    public void supprimerCours(@PathVariable String id){
        coursDao.deleteById(id);
    }

    //Ajouter et modification d'un cours
    @ApiOperation(value = "Permet d'ajouter et de modifier un cours")
    @PostMapping (value = "addOrModifyCours", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cours ajouterModifierCours(@RequestBody Cours cours){
        coursDao.save(cours);
        return cours;
    }
}
