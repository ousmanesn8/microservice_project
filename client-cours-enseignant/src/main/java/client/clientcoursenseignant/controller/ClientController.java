package client.clientcoursenseignant.controller;

import client.clientcoursenseignant.beans.CoursBean;
import client.clientcoursenseignant.beans.CoursEnseignantBean;
import client.clientcoursenseignant.beans.EnseignantBean;
import client.clientcoursenseignant.proxies.MicroserviceCoursEnseignantProxy;
import client.clientcoursenseignant.proxies.MicroserviceCoursProxy;
import client.clientcoursenseignant.proxies.MicroserviceEnseignantproxy;
import org.bouncycastle.math.raw.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @RequestMapping("/coursenseignant")
    public String messages(){ return "index-message"; }

    @RequestMapping("/")
    public String accueil(Model model){
        return "index";
    }

    @PostMapping("/addenseignant")
    public String addUser(@Valid EnseignantBean enseignantBean, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-ens";
        }
        microserviceEnseignantproxy.addEnseigant(enseignantBean);
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return "list-enseignant";
    }

    @RequestMapping("/add-ens")
    public String addenseignant(){
        return "add-enseignant";
    }

    @RequestMapping("/list-ens")
    public String listens(Model model){
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return "list-enseignant";
    }

    @GetMapping("/deleteEnseignant/{id}")
    public String deleteEnseignant(@PathVariable("id") String id, Model model) {
        microserviceEnseignantproxy.deleteEnseignant(id);
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return "list-enseignant";
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
        return "list-cours";
    }

    @RequestMapping("/add-cours")
    public String addcours(){
        return "add-cours";
    }

    @RequestMapping("/list-cours")
    public String listcours(Model model){
        model.addAttribute("cours", coursProxy.listeDesCours());
        return "list-cours";
    }

    @GetMapping("/deleteCours/{id}")
    public String deleteCours(@PathVariable("id") String id, Model model) {
        coursProxy.supprimerCours(id);
        model.addAttribute("cours", coursProxy.listeDesCours());
        return "list-cours";
    }

    @Autowired
    private MicroserviceCoursEnseignantProxy microserviceCoursEnseignantProxy;

    @RequestMapping("/add-cours-enseignant")
    public String addcoursenseignant(){
        return "add-cours-enseignant";
    }

    @RequestMapping("/list-cours-enseignant")
    public String listcoursenseignant(Model model){
        model.addAttribute("affecter", microserviceCoursEnseignantProxy.listCoursenseignant());
        return "list-cours-enseignant";
    }

    @PostMapping(value = "/addcoursenseignant")
    public String addcoursenseignant(@Valid CoursEnseignantBean coursEnseignantBean, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-cours-enseignant";
        }
        microserviceCoursEnseignantProxy.affecterCoursEnseignant(coursEnseignantBean);
        model.addAttribute("affecter", microserviceCoursEnseignantProxy.listCoursenseignant());
        return "list-cours-enseignant";
    }

    @GetMapping("/deleteAffectation/{id}")
    public String deleteAffectation(@PathVariable("id") String id, Model model) {
        microserviceCoursEnseignantProxy.supprimerAffectation( Integer.parseInt(id));
        model.addAttribute("affecter", microserviceCoursEnseignantProxy.listCoursenseignant());
        return "list-cours-enseignant";
    }
}