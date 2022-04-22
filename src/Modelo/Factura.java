package Modelo;

import Modelo.Vehiculo;

public class Factura {

    private String numero;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int costo;

    public Factura(String numero, Cliente cliente, Vehiculo vehiculo, int costo) {
        this.numero = numero;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.costo = costo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
