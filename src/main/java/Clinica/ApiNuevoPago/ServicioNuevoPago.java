/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiNuevoPago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioNuevoPago {

    @Autowired
    private RestTemplate resTem;
    private Salida sal;

    public Salida nuevoHorario(Entrada ent) {
        Long idPac = ent.getIdPac();
        Long idCit = ent.getIdCit();

        String urlPac = "http://ApiPaciente/paciente/buscar/" + idPac;
        String urlCit = "http://ApiCita/cita/buscar/" + idCit;

        PacienteDTO pac = resTem.getForObject(urlPac, PacienteDTO.class);
        CitaDTO cit = resTem.getForObject(urlCit, CitaDTO.class);

        sal = new Salida();
        sal.setPac(pac);
        sal.setCit(cit);

        return sal;
    }

    public Salida getSalida() {
        return sal;
    }
}
