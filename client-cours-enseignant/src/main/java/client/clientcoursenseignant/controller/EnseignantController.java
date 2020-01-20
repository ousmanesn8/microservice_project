package client.clientcoursenseignant.controller;

import client.clientcoursenseignant.beans.EnseignantBean;
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
public class EnseignantController {

    @Autowired
    private MicroserviceEnseignantproxy microserviceEnseignantproxy;

    @RequestMapping("/")
    public String accueil(Model model){
        List<EnseignantBean> enseignantBeanList =  microserviceEnseignantproxy.listEnseignants();
        model.addAttribute("enseignant", enseignantBeanList);
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

    @GetMapping("/delete/{id}")
    public RedirectView deleteUser(@PathVariable("id") String id, Model model) {
        microserviceEnseignantproxy.deleteEnseignant(id);
        model.addAttribute("enseignant", microserviceEnseignantproxy.listEnseignants());
        return new RedirectView("index");
    }

}
