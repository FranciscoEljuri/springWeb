package springservices.demospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springservices.demospring.models.service.IServicio;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("servicioSecundario")
    private IServicio servicio;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}
