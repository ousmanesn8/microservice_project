package client.clientcoursenseignant.controller;

import client.clientcoursenseignant.beans.CoursBean;
import client.clientcoursenseignant.beans.EnseignantBean;
import client.clientcoursenseignant.proxies.MicroserviceCoursProxy;
import client.clientcoursenseignant.proxies.MicroserviceEnseignantproxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private MicroserviceEnseignantproxy microserviceEnseignantproxy;

    @RequestMapping("/")
    public String accueil(Model model){
        List<EnseignantBean> enseignantBeanList =  microserviceEnseignantproxy.listEnseignants();
        model.addAttribute("enseignant", enseignantBeanList);
        List<CoursBean> cours =  coursProxy.listeDesCours();
        model.addAttribute("cours", cours);
        return "index";
    }

    @PostMapping("/add")
    public String addUser(@Valid EnseignantBean enseignantBean, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-ens";
        }
        microserviceEnseignantproxy.addEnseigant(enseignantBean);
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return "index";
    }

    @RequestMapping("/add-ens")
    public String addenseignant(){
        return "add-ens";
    }

    @GetMapping("/deleteEnseignant/{id}")
    public RedirectView deleteEnseignant(@PathVariable("id") String id, Model model) {
        microserviceEnseignantproxy.deleteEnseignant(id);
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return new RedirectView("index");
    }

    @Autowired
    private MicroserviceCoursProxy coursProxy;

    @PostMapping("/addcours")
    public String addUser(@Valid CoursBean coursBean, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-cours";
        }
        coursProxy.ajouterModifierCours(coursBean);
        model.addAttribute("cours", coursProxy.listeDesCours());
        return "index";
    }

    @RequestMapping("/add-cours")
    public String addcours(){
        return "add-cours";
    }

    @GetMapping("/deleteCours/{id}")
    public RedirectView deleteCours(@PathVariable("id") String id, Model model) {
        coursProxy.supprimerCours(id);
        model.addAttribute("cours", coursProxy.listeDesCours());
        return new RedirectView("index");
    }

}