package Modelo;

import Modelo.Licencia;

public class Cliente {

    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private Licencia licencia;

    public Cliente(){}
    public Cliente(String nombre, String cedula, String correo, String telefono){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setLicenscia(Licencia licenscia) {
        this.licencia = licenscia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
