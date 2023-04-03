package springservices.demospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springservices.demospring.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public String ver(Model model){
        model.addAttribute("titulo", "ejemplo de inyeccion de dependecia");
        model.addAttribute("factura", factura);
        return "factura/ver";
    }
}
