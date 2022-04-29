package Modelo;

import java.util.Date;

public class Licencia {

    private int numero;
    private String tipo;
    private Date fecha_emision;
    private Date fecha_expiracion;
    private String imagen_nombre; // ex: "nombre_de_archivo.png"

    public Licencia(){}

    public Licencia(int num, String tip, Date emision, Date expiracion, String imagen_nombre)
    {
        this.numero = num;
        this.tipo = tip;
        this.fecha_emision = emision;
        this.fecha_expiracion = expiracion;
        this.imagen_nombre = imagen_nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public void setFecha_expiracion(Date fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public Date getFecha_expiracion() {
        return fecha_expiracion;
    }

    public String getImagen_nombre() {
        return imagen_nombre;
    }

    public void setImagen_nombre(String imagen_nombre) {
        this.imagen_nombre = imagen_nombre;
    }
}
