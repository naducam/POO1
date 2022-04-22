package Modelo;

import java.util.Date;

public class Licencia {

    private int numero;
    private String tipo;
    private Date fecha_emision;
    private Date fecha_expiracion;
    //imagen

    public Licencia(){}

    public Licencia(int num, String tip, Date emision, Date expiracion)
    {
        this.numero = num;
        this.tipo = tip;
        this.fecha_emision = emision;
        this.fecha_expiracion = expiracion;
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
}
