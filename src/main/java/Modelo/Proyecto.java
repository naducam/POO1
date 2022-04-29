/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Proyecto {
    private String fechaInicio;
    private String nombreContrato;
    private ArrayList<Actividad> actividades;
    private TipoEstadoProyecto estado;
    
    public Proyecto(){
}

    public Proyecto(String fechaInicio, String nombreContrato, ArrayList<Actividad> actividades, TipoEstadoProyecto estado) {
        this.fechaInicio = fechaInicio;
        this.nombreContrato = nombreContrato;
        this.actividades = actividades;
        this.estado = estado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombreContrato() {
        return nombreContrato;
    }

    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public TipoEstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(TipoEstadoProyecto estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "Fecha de Inicio:" + fechaInicio + ", Nombre del Contrato:" + nombreContrato + ", Actividades:" + actividades + ", Estado:" + estado + '}';
    }
    
    
}
