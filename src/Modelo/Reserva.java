package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {

    private String numero;
    private String sede_recogida;
    private String sede_entrega;
    private Date fecha_inicio;
    private Date fecha_entrega;
    private Date fecha_solicitud;
    private Operador operador;
    private ArrayList<Opcionales> opcionales = new ArrayList<Opcionales>();

    public Reserva() {}

    public Reserva(String numero, String sede_recogida, String sede_entrega, Date fecha_inicio, Date fecha_entrega, Date fecha_solicitud, Operador operador, ArrayList<Opcionales> opcionales) {
        this.numero = numero;
        this.sede_recogida = sede_recogida;
        this.sede_entrega = sede_entrega;
        this.fecha_inicio = fecha_inicio;
        this.fecha_entrega = fecha_entrega;
        this.fecha_solicitud = fecha_solicitud;
        this.operador = operador;
        this.opcionales = opcionales;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSede_recogida() {
        return sede_recogida;
    }

    public void setSede_recogida(String sede_recogida) {
        this.sede_recogida = sede_recogida;
    }

    public String getSede_entrega() {
        return sede_entrega;
    }

    public void setSede_entrega(String sede_entrega) {
        this.sede_entrega = sede_entrega;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public ArrayList<Opcionales> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(ArrayList<Opcionales> opcionales) {
        this.opcionales = opcionales;
    }
}
