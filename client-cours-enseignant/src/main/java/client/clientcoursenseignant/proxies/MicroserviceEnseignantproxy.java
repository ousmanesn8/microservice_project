package client.clientcoursenseignant.proxies;

import client.clientcoursenseignant.beans.EnseignantBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "microservice-enseignant", url="enseignantcontainer:9091")
public interface MicroserviceEnseignantproxy {

    @GetMapping(value = "/enseignants")
    List<EnseignantBean> listEnseignants();

    @GetMapping( value = "/enseignant/{id}")
    EnseignantBean afficherUnEnseignant(@PathVariable("id") int id);

    @PostMapping(value = "/updateEnseignant", consumes = MediaType.APPLICATION_JSON_VALUE)
    public EnseignantBean updateEnseignant(@RequestBody EnseignantBean coursBean);

    @PostMapping(value = "/addEnseignant")
    public EnseignantBean addEnseigant(@RequestBody EnseignantBean enseignantBean);

    @DeleteMapping(value = "/deleteEnseignant/{id}")
    public void deleteEnseignant(@PathVariable String id);
}
