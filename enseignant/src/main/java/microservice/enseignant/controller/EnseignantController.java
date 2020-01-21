package microservice.enseignant.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import microservice.enseignant.dao.EnseignantDao;
import microservice.enseignant.exception.EnseignantIntrouvableException;
import microservice.enseignant.model.Enseignant;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "Microservice de gestion des enseignants")
@RestController
public class EnseignantController {

    @Autowired
    private EnseignantDao enseignantDao;

    //Afficher tout les enseignants
    @ApiOperation(value = "Affiche tout les enseignants")
    @GetMapping(value = "/enseignants")
    public List<Enseignant> listEnseignants() {
        return enseignantDao.findAll();
    }

    //--------------------------------------------------------------------------------------------
    //Récupérer un enseignant par son Id
    @ApiOperation(value = "Recupère le id d'un enseignant et affiche l'enseignant correspondant")
    @GetMapping(value = "enseignant/{id}")
    public Enseignant afficherUnEnseignant(@PathVariable String id) throws EnseignantIntrouvableException {
        Optional<Enseignant> c = enseignantDao.findById(id);
        if (c == null)
            throw new EnseignantIntrouvableException("L'enseignant de id " + id + " que vous recherchez n'existe pas");
        return c.get();
    }

    //--------------------------------------------------------------------------------------µ
    @ApiOperation(value = "Supprimer un enseignant")
    @DeleteMapping(value = "/deleteEnseignant/{idEnseignant}")
    public List<Enseignant> deleteEnseignant(@PathVariable("idEnseignant") String id) {
        enseignantDao.deleteById(id);
        return enseignantDao.findAll();
    }

    //--------------------------------------------------------------------------------------------
    @ApiOperation(value = "Mise à jours des info sur un enseignant")
    @PutMapping(value = "/updateEnseignant/{idEnseignant}")
    public Enseignant updateEnseignant(@PathVariable("idEnseignant") String idEns, @RequestBody Enseignant enseignant) {
        Optional<Enseignant> enseignant1 = enseignantDao.findById(idEns);
        System.out.println("------------\n" + enseignant1 + "\n");
        Enseignant e = enseignant1.get();
        e.setPrenomEnseignant(enseignant.getPrenomEnseignant());
        e.setNomEnseignant(enseignant.getNomEnseignant());
        e.setSpecialiteEnseignant(enseignant.getSpecialiteEnseignant());
        e.setStatusEnseignant(enseignant.getStatusEnseignant());
        return enseignantDao.save(e);
    }

    //--------------------------------------------------------------------------------------------
    @ApiOperation(value = "Ajouter un enseignant")
    @PostMapping("/addEnseignant")
    public Enseignant addEnseigant(@RequestBody Enseignant enseignant) {
        return enseignantDao.save(enseignant);
    }

}
