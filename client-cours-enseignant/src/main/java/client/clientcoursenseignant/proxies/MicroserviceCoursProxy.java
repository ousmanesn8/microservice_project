package client.clientcoursenseignant.proxies;

import client.clientcoursenseignant.beans.CoursBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

<<<<<<< HEAD
@FeignClient(name = "microservice-cours", url = "localhost:9090")
public interface MicroserviceCoursProxy {
=======
@FeignClient(name = "coursContainer", url = "http://localhost:9090")
public interface MicroserviceCoursProxy {

>>>>>>> 41e797b21f3ad40238bb715bc96fbf28dcf47276
    @GetMapping(value = "/cours")
    List<CoursBean> listeDesCours();

    @GetMapping( value = "/cours/{id}")
    CoursBean recupererUnCours(@PathVariable("id") int id);

    @PostMapping(value = "/addOrModifyCours", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CoursBean ajouterModifierCours(@RequestBody CoursBean coursBean);

    @DeleteMapping(value = "deleteCours/{id}")
    public void supprimerCours(@PathVariable String id);
<<<<<<< HEAD
=======

>>>>>>> 41e797b21f3ad40238bb715bc96fbf28dcf47276
}

