package com.sebaspc.aplicacionesmoviles;

public class Componente {
    private int idComponente;
    private String nombreComponente;
    private String descripcion;
    private String idProforma;

    public Componente(int idComponente, String nombreComponente, String descripcion, String idProforma) {
        this.idComponente = idComponente;
        this.nombreComponente = nombreComponente;
        this.descripcion = descripcion;
        this.idProforma = idProforma;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdProforma() {
        return idProforma;
    }

    public void setIdProforma(String idProforma) {
        this.idProforma = idProforma;
    }
}
