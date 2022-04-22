package Modelo;

import java.util.ArrayList;

public class Vehiculo {

    private String placa;
    private int año;
    private TEstilo estilo;
    private String color;
    private String marca;
    private int capacidad;
    private float kilometraje; //en kilometros
    private int puertas;
    private int vin;
    private int mpg;
    private float costo_diario;
    private int capacidad_maletas;
    private TTransmision transmision;
    private TEstado estado;
    private ArrayList<Mantenimiento> historial_mantenimeinto = new ArrayList<Mantenimiento>();

    public Vehiculo() {}

    public Vehiculo(String placa, int año, TEstilo estilo, String color, String marca, int capacidad, float kilometraje, int puertas, int vin, int mpg, float costo_diario, int capacidad_maletas, TTransmision transmision, TEstado estado, ArrayList<Mantenimiento> historial_mantenimeinto) {
        this.placa = placa;
        this.año = año;
        this.estilo = estilo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.puertas = puertas;
        this.vin = vin;
        this.mpg = mpg;
        this.costo_diario = costo_diario;
        this.capacidad_maletas = capacidad_maletas;
        this.transmision = transmision;
        this.estado = estado;
        this.historial_mantenimeinto = historial_mantenimeinto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public TEstilo getEstilo() {
        return estilo;
    }

    public void setEstilo(TEstilo estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public float getCosto_diario() {
        return costo_diario;
    }

    public void setCosto_diario(float costo_diario) {
        this.costo_diario = costo_diario;
    }

    public int getCapacidad_maletas() {
        return capacidad_maletas;
    }

    public void setCapacidad_maletas(int capacidad_maletas) {
        this.capacidad_maletas = capacidad_maletas;
    }

    public TTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(TTransmision transmision) {
        this.transmision = transmision;
    }

    public TEstado getEstado() {
        return estado;
    }

    public void setEstado(TEstado estado) {
        this.estado = estado;
    }

    public ArrayList<Mantenimiento> getHistorial_mantenimeinto() {
        return historial_mantenimeinto;
    }

    public void setHistorial_mantenimeinto(ArrayList<Mantenimiento> historial_mantenimeinto) {
        this.historial_mantenimeinto = historial_mantenimeinto;
    }
}
