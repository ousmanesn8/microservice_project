package coursenseignant.coursenseignant.Controller;

import coursenseignant.coursenseignant.Beans.CoursEnseignant;
import coursenseignant.coursenseignant.Chargement.Load;
import coursenseignant.coursenseignant.DAO.CoursEnseignantDao;
import net.minidev.json.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class WebController {

    @Autowired
    private Load load;

    @Autowired
    private CoursEnseignantDao coursEnseignantDao;

    @RequestMapping("/findCours/{id}")
    public boolean indexCours(@PathVariable String id) throws IOException, ParseException {
        if(load.loadCours().contains(id)) return true;
        else return false;

    }
    @RequestMapping("/findEnseignant/{id}")
    public boolean indexEnseignant(@PathVariable String id) throws IOException, ParseException {
        if(load.loadEnseignant().contains(id)) return true;
        else return false;
    }
    @PostMapping(value = "/addcoursenseignant", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CoursEnseignant affecterCoursEnseignant(@RequestBody CoursEnseignant coursEnseignant) throws IOException, ParseException {
        if(load.loadCours().contains(coursEnseignant.getIdcours()) && load.loadEnseignant()
        .contains(coursEnseignant.getIdEnseignant())){
            coursEnseignantDao.save(coursEnseignant);

        }
        return coursEnseignant;
    }
    @GetMapping(value = "/coursenseignant")
    public List<CoursEnseignant> listCoursenseignant(){return coursEnseignantDao.findAll();}

    @DeleteMapping(value = "deleteAffectation/{id}")
    public void supprimerAffectation(@PathVariable int id){
        coursEnseignantDao.deleteById(id);
    }

}
