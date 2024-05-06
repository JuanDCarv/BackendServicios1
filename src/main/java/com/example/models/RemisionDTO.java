package com.example.models;

import java.util.Date;

public class RemisionDTO {

    private Date fechaHoraRecogida;
    private String origen;
    private String destino;
    private String placaCamion;
    private String conductor;
    private String ruta;

    // Constructor vacío
    public RemisionDTO() {
    }

    // Getters y Setters
    public Date getFechaHoraRecogida() {
        return fechaHoraRecogida;
    }

    public void setFechaHoraRecogida(Date fechaHoraRecogida) {
        this.fechaHoraRecogida = fechaHoraRecogida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}