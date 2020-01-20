package client.clientcoursenseignant.proxies;

import client.clientcoursenseignant.beans.EnseignantBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "enseignantContainer", url = "http://localhost:9091")
public interface MicroserviceEnseignantproxy {

    @GetMapping(value = "/enseignant")
    List<EnseignantBean> listEnseignants();

    @GetMapping( value = "/enseignant/{id}")
    EnseignantBean afficherUnEnseignant(@PathVariable("id") int id);

    @PostMapping(value = "/addOrModifyCours", consumes = MediaType.APPLICATION_JSON_VALUE)
    public EnseignantBean updateEnseignant(@RequestBody EnseignantBean coursBean);

    @PostMapping(value = "/add")
    public EnseignantBean addEnseigant(@RequestBody EnseignantBean enseignantBean);

    @DeleteMapping(value = "deleteCours/{id}")
    public void deleteEnseignant(@PathVariable String id);
}
