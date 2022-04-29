/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import Modelo.Actividad;
import Modelo.Cliente;
import Modelo.Colaborador;
import Modelo.Contrato;
import Modelo.Proyecto;
import Modelo.TipoColaborador;
import Modelo.TipoEstado;
import Modelo.TipoEstadoActividad;
import Modelo.TipoEstadoProyecto;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class main {
    
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
    
        Colaborador Colab1 = new Colaborador(1547, "Carlos Mora Perez", TipoColaborador.Analista);
        Colaborador Colab2 = new Colaborador(5247, "Ana Gabriela Sibaja Vargas", TipoColaborador.Desarrollador_Senior);
        Colaborador Colab3 = new Colaborador(7841, "Carlos Saborio Nuñez", TipoColaborador.Desarrollo_Junior);
        Colaborador Colab4 = new Colaborador(4231, "Kevin Reyes Solano", TipoColaborador.Tester);
        
        controlador.registrarColaborador(Colab1);
        controlador.registrarColaborador(Colab2);
        controlador.registrarColaborador(Colab3);
        controlador.registrarColaborador(Colab4);
        
        
    
        Cliente Cliente1 = new Cliente("Zaylin Gallardo Mendez", 85476321);
        Cliente Cliente2 = new Cliente("Maria Jose Gonzalez", 41589654);
        Cliente Cliente3 = new Cliente("Johel Mora Sibaja", 71629720);
        Cliente Cliente4 = new Cliente("Ana Alicia Sibaja Vargas", 70777789);
        
        controlador.registrarCliente(Cliente1);
        controlador.registrarCliente(Cliente2);
        controlador.registrarCliente(Cliente3);
        controlador.registrarCliente(Cliente4);
    
        Proyecto proyecto1 = new Proyecto("12 de marzo", "Videojuego Altura",null, TipoEstadoProyecto.ACTIVO);
        Proyecto proyecto2 = new Proyecto("15 de junio", "Videojuego CandyCrush", null, TipoEstadoProyecto.ACTIVO);
        
        controlador.crearProyecto(proyecto1);
        controlador.crearProyecto(proyecto2);
    
        Contrato contrato1 = new Contrato(3532, "Videojuego Altura","Maria Jose Gonzalez" ,"Para el desarrollo del contrato se pide la contruccion del software para el funcionamiento del videojuego","12 de enero", "12 de marzo", 6, TipoEstado.REGISTRADO, proyecto1, "12 de septiembre", 500000);
        Contrato contrato2 = new Contrato(8899, "Videojuego CandyCrush","Johel Mora Siabaja" ,"Para el desarrollo inicial del contrato se pide la contruccion del software para el funcionamiento del videojuego", "15 de junio", "15 de julio", 4, TipoEstado.REGISTRADO, proyecto2, "15 de noviembre", 250000);
        Contrato contrato3 = new Contrato(7201, "Videojuego Call of Duty", "Carlos Mora Perez", "Para el desarrollo de los menus dentro del videojuego","1 de enero","1 de febrero", 3, TipoEstado.REGISTRADO, proyecto2, "1 de mayo", 350000);
    
        controlador.crearContrato(contrato2);
        controlador.crearContrato(contrato1);
        
        ArrayList colaboradores = new ArrayList();
        ArrayList colaboradores2 = new ArrayList();
        
        String colaborador1 = "Carlos Mora Perez";
        String colaborador2 = "Ana Gabriela Sibaja Vargas";
        String colaborador3 = "Carlos Saborio Nuñez";
        String colaborador4 = "Kevin Reyes Solano";
        
        colaboradores.add(colaborador1);
        colaboradores.add(colaborador2);
        
        colaboradores2.add(colaborador3);
        colaboradores2.add(colaborador4);
        
        Actividad actividad1 = new Actividad("Planteamiento de los botones basicos para el videojuego",7, colaboradores,TipoEstadoActividad.COMPLETADA);
        Actividad actividad2 = new Actividad("Diseño de los botones",10, colaboradores,TipoEstadoActividad.A_TIEMPO);
        Actividad actividad3 = new Actividad("Funcionamiento de los botones",20, colaboradores,TipoEstadoActividad.ATRASADA);
        Actividad actividad4 = new Actividad("Verificacion del funcionamiento de los botones",2, colaboradores,TipoEstadoActividad.A_TIEMPO);
        Actividad actividad5 = new Actividad("Planteamiento de la interfaz de los personajes",10, colaboradores,TipoEstadoActividad.A_TIEMPO);
        
        /*
        controlador.registrarActividad("Videojuego Altura", actividad1);
        controlador.registrarActividad("Videojuego Altura", actividad2);
        controlador.registrarActividad("Videojuego Altura", actividad3);
        controlador.registrarActividad("Videojuego Altura", actividad4);
        controlador.registrarActividad("Videojuego Altura", actividad5);
        */
        Actividad actividad6 = new Actividad("Planteamiento de la interfaz de los personajes",10, colaboradores2,TipoEstadoActividad.A_TIEMPO);
        Actividad actividad7 = new Actividad("Planteamiento de la interfaz de los personajes",10, colaboradores2,TipoEstadoActividad.A_TIEMPO);
        Actividad actividad8 = new Actividad("Planteamiento de la interfaz de los personajes",10, colaboradores2,TipoEstadoActividad.A_TIEMPO);
        
        /*
        controlador.registrarActividad("Videojuego CandyCrush", actividad6);
        controlador.registrarActividad("Videojuego CandyCrush", actividad7);
        controlador.registrarActividad("Videojuego CandyCrush", actividad8);
        */

        controlador.actualizarVigente(contrato1);
        controlador.actualizarVigente(contrato2);
        
        
        
       
        System.out.println("\n");
        System.out.print("Punto 4.a");
        System.out.println("\n");
        controlador.mostrarColaborador();
        System.out.println("\n");
        
        System.out.print("Punto 4.b");
        System.out.println("\n");
        controlador.mostrarCliente();
        System.out.println("\n");
        
        System.out.print("Punto 4.c");
        System.out.println("\n");
        controlador.mostrarContrato();
        System.out.println("\n");
        
        System.out.print("Punto 4.d");
        System.out.println("\n");
        controlador.crearContrato(contrato3);
        System.out.println("\n");
        
        System.out.print("Punto 4.e");
        System.out.println("\n");

        System.out.println("\n");
        
        
    
    }
}
