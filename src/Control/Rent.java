package Control;

import Modelo.*;

import java.util.ArrayList;

public class Rent {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Trabajador trabajador;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Factura> facturas = new ArrayList<Factura>();
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
    private ArrayList<Mantenimiento> mantenimientos = new ArrayList<Mantenimiento>();
    private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

    public Rent(){}
    public Rent(Vehiculo vehiculo, Cliente cliente, Trabajador trabajador, ArrayList<Vehiculo> vehiculos, ArrayList<Cliente> clientes, ArrayList<Factura> facturas, ArrayList<Reserva> reservas, ArrayList<Empresa> empresas, ArrayList<Mantenimiento> mantenimientos, ArrayList<Trabajador> trabajadores) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.facturas = facturas;
        this.reservas = reservas;
        this.empresas = empresas;
        this.mantenimientos = mantenimientos;
        this.trabajadores = trabajadores;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(ArrayList<Mantenimiento> mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
