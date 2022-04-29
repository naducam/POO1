/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Contrato {
    private int identificador;
    private String nombre;
    private String nombreCliente;
    private String descripcion;
    private String fecha_Firma;
    private String fecha_Inicio;
    private int duracion;
    private TipoEstado estado;
    private Proyecto proyecto;
    private String fecha_Final;
    private float costo;
    
    Contrato(){
}

    public Contrato(int identificador, String nombre, String nombreCliente ,String descripcion, String fecha_Firma, String fecha_Inicio, int duracion, TipoEstado estado, Proyecto proyecto, String fecha_Final, float costo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.fecha_Firma = fecha_Firma;
        this.fecha_Inicio = fecha_Inicio;
        this.duracion = duracion;
        this.estado = estado;
        this.proyecto = proyecto;
        this.fecha_Final = fecha_Final;
        this.costo = costo;
    }
    
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_Firma() {
        return fecha_Firma;
    }

    public void setFecha_Firma(String fecha_Firma) {
        this.fecha_Firma = fecha_Firma;
    }

    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(String fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "Contrato{" + "Identificador:" + identificador + ", Nombre del Contrato:" + nombre + ", Nombre del Cliente:" + nombreCliente + ", Descripcion:" + descripcion + ", Fecha Firma:" + fecha_Firma + ", Fecha Inicio:" + fecha_Inicio + ", Duracion en meses del proyecto:" + duracion + ", Estado:" + estado + ", Proyecto:" + proyecto + ", Fecha de Finalización:" + fecha_Final + ", Coste del Proyecto:" + costo + '}';
    }
    
    
    
    
}
