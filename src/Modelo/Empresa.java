package Modelo;

public class Empresa {
    private String razon_social;
    private String cedula_juridica;
    private String telefono;
    private String direcion;

    public Empresa(){}

    public Empresa(String razon_social, String cedula_juridica, String telefono, String direcion) {
        this.razon_social = razon_social;
        this.cedula_juridica = cedula_juridica;
        this.telefono = telefono;
        this.direcion = direcion;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public void setCedula_juridica(String cedula_juridica) {
        this.cedula_juridica = cedula_juridica;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public String getCedula_juridica() {
        return cedula_juridica;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDirecion() {
        return direcion;
    }
}
