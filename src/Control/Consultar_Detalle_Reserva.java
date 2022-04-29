/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author ACER
 */
import Modelo.*;
public class Consultar_Detalle_Reserva {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Reserva reserva;
    private Trabajador trabajador;
    private String Ingresado;
    
    public Consultar_Detalle_Reserva(){}
    public Consultar_Detalle_Reserva(Cliente cliente,Vehiculo vehiculo,String Ingresado, Trabajador trabajador, Reserva reserva) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.reserva = reserva;
        this.trabajador = trabajador;
        this.Ingresado = Ingresado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getIngresado() {
        return Ingresado;
    }

    public void setIngresado(String Ingresado) {
        this.Ingresado = Ingresado;
    }
    
    public void solicitar_info(){
        System.out.println("Ingrese su número de reserva: ");
        if (Ingresado == Reserva.getnumero()){
            return True;
        }
    }

};