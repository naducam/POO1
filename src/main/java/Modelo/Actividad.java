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
public class Actividad {
    private String nombre;
    private int duracion;
    private ArrayList<String> colaboradores;
    private TipoEstadoActividad estado;
    
    Actividad(){
}

    public Actividad(String nombre, int duracion, ArrayList<String> colaboradores, TipoEstadoActividad estado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.colaboradores = colaboradores;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<String> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public TipoEstadoActividad getEstado() {
        return estado;
    }

    public void setEstado(TipoEstadoActividad estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Actividad{" + "Nombre:" + nombre + ", Duracion:" + duracion + ", Colaboradores:" + colaboradores + ", Estado:" + estado + '}';
    }
    
    
}
