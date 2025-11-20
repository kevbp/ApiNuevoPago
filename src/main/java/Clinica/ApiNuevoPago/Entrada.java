
package Clinica.ApiNuevoPago;


public class Entrada {
    private Long idCit;
    private Long idPac;

    public Entrada() {
    }

    public Entrada(Long idCit, Long idPac) {
        this.idCit = idCit;
        this.idPac = idPac;
    }

    public Long getIdCit() {
        return idCit;
    }

    public void setIdCit(Long idCit) {
        this.idCit = idCit;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }
    
    
}
