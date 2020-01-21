package client.clientcoursenseignant.proxies;

import client.clientcoursenseignant.beans.CoursBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "microservice-cours", url = "localhost:9090")
public interface MicroserviceCoursProxy {

    @GetMapping(value = "/cours")
    List<CoursBean> listeDesCours();

    @GetMapping( value = "/cours/{id}")
    CoursBean recupererUnCours(@PathVariable("id") int id);

    @PostMapping(value = "/addOrModifyCours", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CoursBean ajouterModifierCours(@RequestBody CoursBean coursBean);

    @DeleteMapping(value = "deleteCours/{id}")
    public void supprimerCours(@PathVariable String id);

}

