package springservices.demospring.models.service;

import org.springframework.stereotype.Component;

@Component("servicioSecundario")
public class ServicioSimple implements IServicio{
    @Override
    public String operacion() {
        return "servicio simple";
    }
}
