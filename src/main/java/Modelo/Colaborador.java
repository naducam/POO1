/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Colaborador {
    private int identificacion;
    private String nombre;
    private TipoColaborador posicion;
    
    Colaborador(){
}

    public Colaborador(int identificacion, String nombre, TipoColaborador posicion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoColaborador getPosicion() {
        return posicion;
    }

    public void setPosicion(TipoColaborador posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Colaborador other = (Colaborador) obj;
        if (this.identificacion != other.identificacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.posicion != other.posicion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "Identificacion:" + identificacion + ", Nombre:" + nombre + ", Posicion:" + posicion + '}';
    }
    
    
}
