package Clinica.ApiNuevoPago;

public class CitaDTO {

    private Long id;
    private Long idHor;
    private Long idPac;
    private Long idEsp;
    private Long idMed;
    private String fec;
    private String hor;
    private double pre;
    private String estPag;
    private Long idEmp;
    private String estCit;

    public CitaDTO() {
    }

    public CitaDTO(Long id, Long idHor, Long idPac, Long idEsp, Long idMed, String fec, String hor, double pre, String estPag, Long idEmp, String estCit) {
        this.id = id;
        this.idHor = idHor;
        this.idPac = idPac;
        this.idEsp = idEsp;
        this.idMed = idMed;
        this.fec = fec;
        this.hor = hor;
        this.pre = pre;
        this.estPag = estPag;
        this.idEmp = idEmp;
        this.estCit = estCit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdHor() {
        return idHor;
    }

    public void setIdHor(Long idHor) {
        this.idHor = idHor;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public String getEstPag() {
        return estPag;
    }

    public void setEstPag(String estPag) {
        this.estPag = estPag;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    public String getEstCit() {
        return estCit;
    }

    public void setEstCit(String estCit) {
        this.estCit = estCit;
    }

    
}
