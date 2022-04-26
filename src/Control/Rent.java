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

    // ↓ busca en la lista de reservas para determinar si un vehiculo p[articular esta reservado

    public boolean is_vehiculo_reservado(String placa)
    {
        for(int i = 0; i <= reservas.size(); i++)
        {
            Reserva actual = reservas.get(i);
            if(actual.getVehiculo().getPlaca() == placa)
            {
                return true;
            }
        }
        return false;
    }

    public void vehiculo_cambiar_color(String placa, String nuevo_color)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setColor(nuevo_color);
                return;
            }
        }
        return;
    }
    public void vehiculo_cambiar_año(String placa, int nuevo_año)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setAño(nuevo_año);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_estilo(String placa, TEstilo nuevo_estilo)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setEstilo(nuevo_estilo);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_marca(String placa, String nueva_marca)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setMarca(nueva_marca);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_capacidad(String placa, int nueva_capacidad)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setCapacidad(nueva_capacidad);
                return;
            }
        }
        return;
    }
    public void vehiculo_cambiar_kilometraje(String placa, float nuevo_kilometraje)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setKilometraje(nuevo_kilometraje);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_numpuertas(String placa, int nueva_cantidad_puertas)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setPuertas(nueva_cantidad_puertas);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_vin(String placa, int nuevo_vin)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setVin(nuevo_vin);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_mpg(String placa, int nuevo_mpg)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setMpg(nuevo_mpg);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_costodiario(String placa, float nuevo_costodiario)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setCosto_diario(nuevo_costodiario);
                return;
            }
        }
        return;
    }
    public void vehiculo_cambiar_capacidad_maletas(String placa, int nueva_capacidad_maletas)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setCapacidad_maletas(nueva_capacidad_maletas);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_transmision(String placa, TTransmision transmision)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setTransmision(transmision);
                return;
            }
        }
        return;
    }

    public void vehiculo_cambiar_estado(String placa, TEstado estado)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.setEstado(estado);
                return;
            }
        }
        return;
    }

    public void vehiculo_add_mantenimiento(String placa, Mantenimiento mantenimiento)
    {
        for(int i = 0; i <= vehiculos.size(); i++)
        {
            Vehiculo actual = vehiculos.get(i);
            if(actual.getPlaca() == placa)
            {
                actual.add_mantenimiento(mantenimiento);
                return;
            }
        }
        return;
    }




}
