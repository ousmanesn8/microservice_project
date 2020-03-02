package client.clientcoursenseignant.proxies;

import client.clientcoursenseignant.beans.CoursBean;
import client.clientcoursenseignant.beans.CoursEnseignantBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "microservice-cours-enseignant", url = "localhost:9092")
public interface MicroserviceCoursEnseignantProxy {

    @PostMapping(value = "/addcoursenseignant", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CoursEnseignantBean affecterCoursEnseignant(@RequestBody CoursEnseignantBean coursEnseignantBean);

    @GetMapping(value = "/coursenseignant")
    public List<CoursEnseignantBean> listCoursenseignant();

    @DeleteMapping(value = "deleteAffectation/{id}")
    public void supprimerAffectation(@PathVariable int id);
}
