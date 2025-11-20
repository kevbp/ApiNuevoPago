
package Clinica.ApiNuevoPago;

public class Salida {
    private CitaDTO cit;
    private PacienteDTO pac;

    public double getTotal(){
        return cit.getPre();
    }
    
    public Salida() {
    }

    public Salida(CitaDTO cit, PacienteDTO pac) {
        this.cit = cit;
        this.pac = pac;
    }

    public CitaDTO getCit() {
        return cit;
    }

    public void setCit(CitaDTO cit) {
        this.cit = cit;
    }

    public PacienteDTO getPac() {
        return pac;
    }

    public void setPac(PacienteDTO pac) {
        this.pac = pac;
    }
    
    
}
