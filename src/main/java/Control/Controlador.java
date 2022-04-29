/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import Modelo.Actividad;
import Modelo.Cliente;
import Modelo.Colaborador;
import Modelo.Contrato;
import Modelo.Proyecto;
import Modelo.TipoEstado;
import Modelo.TipoEstadoActividad;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    public ArrayList<Cliente> listaClientes  =  new ArrayList();
    public ArrayList<Colaborador> listaColaboradores  =  new ArrayList();
    public ArrayList<Contrato> listaContratos  =  new ArrayList();
    public ArrayList<Proyecto> listaProyectos  =  new ArrayList();
    public ArrayList<Actividad> listaActividad  =  new ArrayList();
    
    //Parte de los Colaboradores
    
    public String registrarColaborador(Colaborador colaborador){                  
        for (int i=0; i < listaColaboradores.size(); i++){                                          
            Colaborador nuevo = listaColaboradores.get(i);                                     
            if (colaborador == nuevo){
                return "El Colaborador ya existe";
            }
        }      
        int cont = 1;                                                                           
        listaColaboradores.add(colaborador);
        cont++;
        return "El Colaborador fue registrado con exito";
    }
    
    public String modificar(Colaborador colaborador){                                            
        for (int i=0; i < listaColaboradores.size(); i++){                                        
            Colaborador modificado = listaColaboradores.get(i);
            if (colaborador == modificado){
                listaColaboradores.set(i, modificado);
                return "El Colaborador fue modificado con exito";
            }
        }
        return "El Colaborador no existe";
    }
    
    public Colaborador localizar(Colaborador colaborador){                               
        for (int i=0; i < listaColaboradores.size(); i++){
            Colaborador localizado = listaColaboradores.get(i);
            if ( colaborador == localizado){
                return localizado;
            }
        }
        return null;
    }
    
    public void mostrarColaborador(){
        for (int i = 0; i < listaColaboradores.size(); i++) {
            Colaborador actual = listaColaboradores.get(i);
            System.out.println(actual.toString());
        }
    }
    
    // Parte de los Clientes
    
    public String registrarCliente(Cliente cliente){                  
        for (int i=0; i < listaClientes.size(); i++){                                          
            Cliente nuevo = listaClientes.get(i);                                     
            if (cliente == nuevo){
                return "El Cliente ya existe";
            }
        }      
        int cont = 1;                                                                           
        listaClientes.add(cliente);
        cont++;
        return "El Cliente fue registrado con exito";
    }
    
    public String modificar(Cliente cliente){                                            
        for (int i=0; i < listaClientes.size(); i++){                                        
            Cliente modificado = listaClientes.get(i);
            if (cliente == modificado){
                listaClientes.set(i, modificado);
                return "El Cliente fue modificado con exito";
            }
        }
        return "El Cliente no esta registrado";
    }
    
    public Cliente buscarCliente(Cliente cliente){                               
        for (int i=0; i < listaClientes.size(); i++){
            Cliente localizado = listaClientes.get(i);
            if ( cliente == localizado){
                return localizado;
            }
        }
        return null;
    }
    
    public void mostrarCliente(){
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente actual = listaClientes.get(i);
            System.out.println(actual.toString());
        }
    }
    
    //Parte de Contrato
    
    public String crearContrato(Contrato contrato){                  
        for (int i=0; i < listaContratos.size(); i++){                                          
            Contrato nuevo = listaContratos.get(i);                                     
            if (contrato == nuevo){
                System.out.println("El Contrato ya existe");
                return "El contrato ya existe";
            }
            for (int j = 0; j < listaClientes.size(); j++){
                Cliente buscar = listaClientes.get(j);
                if (buscar.getNombre() == nuevo.getNombreCliente()){
                    System.out.println("El Cliente no existe");
                    return "El Cliente no existe";
                }
            }
        }      
        int cont = 1;                                                                           
        listaContratos.add(contrato);
        cont++;
        System.out.print("El Contrato fue registrado con exito");
        return "El contrato fue registrado con exito";
    }
    
    public void actualizarVigente(Contrato contrato){
        for (int i = 0; i < listaContratos.size(); i++){
            Contrato actual = listaContratos.get(i);
            if (actual.getIdentificador() == contrato.getIdentificador()){
                actual.setEstado(TipoEstado.VIGENTE);
            }
        }
    }
    
    //actualizar()
    
    
    public Contrato consultar(int identificador){                               
        for (int i=0; i < listaContratos.size(); i++){
            Contrato localizado = listaContratos.get(i);
            if (identificador == localizado.getIdentificador()){
                return localizado;
            }
        }
        return null;
    }
    
    public void mostrarContrato(){
       for (int i = 0; i < listaContratos.size(); i++) {
            Contrato actual = listaContratos.get(i);
            System.out.println(actual.toString());
        } 
    }
    
    //Parte de Actividades y Proyecto
    
    public String crearProyecto(Proyecto proyecto){                  
        for (int i=0; i < listaProyectos.size(); i++){                                          
            Proyecto nuevo = listaProyectos.get(i);                                     
            if (proyecto == nuevo){
                System.out.println("El Contrato ya existe");
                return "El contrato ya existe";
            }
        }      
        int cont = 1;                                                                           
        listaProyectos.add(proyecto);
        cont++;
        System.out.print("El Contrato fue registrado con exito");
        return "El contrato fue registrado con exito";
    }
    
    public String registrarActividad(String contrato, Actividad actividad){                  
        for (int i=0; i < listaProyectos.size(); i++){
            Proyecto nuevo = listaProyectos.get(i);
            ArrayList<Actividad> actividades = nuevo.getActividades();
                if (nuevo.getNombreContrato() == contrato){
                    actividades.add(actividad);
                    nuevo.setActividades(actividades);
                    return "La Actividad ya fue registrada";
                }                     
        }
        return "La Actividad fue registrada con exito";
    }
    /*
    public void mostrarActividad(String nombre){
        for (int i = 0; i < listaProyectos.size(); i++) {
            Proyecto actual = listaProyectos.get(i);
            if (actual.getNombreContrato() == nombre){
                System.out.println(actual.getActividades().toString());
            }
        }
    }
    

    public void consultarActividad(String nombre, TipoEstadoActividad estado){
        for (int i = 0; i < listaProyectos.size(); i++){
            Proyecto actual = listaProyectos.get(i);
            ArrayList<Actividad> actividades = actual.getActividades();
            ArrayList imprimir = new ArrayList();
            for (int y = 0; y < actividades.size(); y++){
                if (actual.getNombreContrato() == nombre & actividades.get(y).getEstado() == estado){
                    Actividad sirve = actividades.get(y);
                    imprimir.add(sirve);
                }
            }
            System.out.println(imprimir);
        }  
    }
    */
    
    
    
    
}
