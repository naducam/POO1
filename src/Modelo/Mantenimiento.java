package Modelo;

import Modelo.TServicio;

import java.util.Date;

public class Mantenimiento {

    private String identificador;
    private Date fecha_inicio;
    private Date fecha_fin;
    private float monto;
    private String detalle;
    private TServicio servicio;
    private Empresa empresa;

    public Mantenimiento(String identificador, Date fecha_inicio, Date fecha_fin, float monto, String detalle, TServicio servicio, Empresa empresa) {
        this.identificador = identificador;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.monto = monto;
        this.detalle = detalle;
        this.servicio = servicio;
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TServicio getServicio() {
        return servicio;
    }

    public void setServicio(TServicio servicio) {
        this.servicio = servicio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
