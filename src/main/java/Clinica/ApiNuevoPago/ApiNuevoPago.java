package Clinica.ApiNuevoPago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiNuevoPago")
public class ApiNuevoPago {

    @Autowired
    private ServicioNuevoPago serv;

    @PostMapping("/nuevo")
    public Salida nuevoPago(@RequestBody Entrada ent) {
        return serv.nuevoHorario(ent);
    }

    @GetMapping("/salida")
    public Salida getSalida() {
        return serv.getSalida();
    }
}
