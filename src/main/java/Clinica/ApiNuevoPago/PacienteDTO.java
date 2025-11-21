/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiNuevoPago;

public class PacienteDTO {

    private Long id;
    private String nom;
    private int dni;
    private double pes;
    private double tal;
    private int eda;
    private String est;
    private Long idEmp;

    public PacienteDTO() {
    }

    public PacienteDTO(Long id, String nom, int dni, double pes, double tal, int eda, String est, Long idEmp) {
        this.id = id;
        this.nom = nom;
        this.dni = dni;
        this.pes = pes;
        this.tal = tal;
        this.eda = eda;
        this.est = est;
        this.idEmp = idEmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getTal() {
        return tal;
    }

    public void setTal(double tal) {
        this.tal = tal;
    }

    public int getEda() {
        return eda;
    }

    public void setEda(int eda) {
        this.eda = eda;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    
}
