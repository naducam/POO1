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
import java.util.UUID;

public class Registrar_usuario_rol_servicio_cliente {
    private Cliente cliente;
    private Trabajador trabajador;
    private String Contraseña;
    
    public Registrar_usuario_rol_servicio_cliente(){}
    public Registrar_usuario_rol_servicio_cliente(Cliente cliente, Trabajador trabajador, String Contraseña) {
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.Contraseña = Contraseña;
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

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String generar_Contrase�a(){
    String Contrase�a = "";
    Contrase�a = UUID.randomUUID().toString().toUpperCase().substring(0,8);
    return "Su Contrase�a es : " + Contrase�a;     
    }
    public void  Enviar_a_Correo(){
        /*Insertar*/
    }
}
    

