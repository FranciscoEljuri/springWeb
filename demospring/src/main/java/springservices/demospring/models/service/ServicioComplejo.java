package springservices.demospring.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("servicioPrincipal")
public class ServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "servicio complejo";
    }
}
