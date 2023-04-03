package springservices.demospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springservices.demospring.models.domain.ItemFactura;
import springservices.demospring.models.domain.Producto;
import springservices.demospring.models.service.IServicio;
import springservices.demospring.models.service.ServicioComplejo;
import springservices.demospring.models.service.ServicioSimple;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("servicioSimple")
    public IServicio registrarMiServicion(){
        return new ServicioSimple();
    }

    @Primary
    @Bean("servicioComplejo")
    public IServicio registrarServicioComplejo(){
        return new ServicioComplejo();
    }

    @Bean("registroProductos")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("camara",100);
        Producto producto2 = new Producto("telefono", 200);

        ItemFactura itemFactura1 = new ItemFactura(producto1 , 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 2);

        return Arrays.asList(itemFactura1, itemFactura2);
    }

    @Bean("registroProductosOficica")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("monito",300);
        Producto producto2 = new Producto("pc", 500);
        Producto producto3 = new Producto("escritorio",300);
        Producto producto4 = new Producto("silla",200);

        ItemFactura itemFactura1 = new ItemFactura(producto1 , 2);
        ItemFactura itemFactura2 = new ItemFactura(producto2, 1);
        ItemFactura itemFactura3 = new ItemFactura(producto3, 1);
        ItemFactura itemFactura4 = new ItemFactura(producto4, 1);

        return Arrays.asList(itemFactura1, itemFactura2, itemFactura3, itemFactura4);
    }
}
