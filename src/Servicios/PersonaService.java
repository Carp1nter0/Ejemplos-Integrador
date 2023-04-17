/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PersonaService {

    Persona persona = new Persona();
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día (1-31): ");
        int dia = leer.nextInt();
        System.out.print("Mes (1-12): ");
        int mes = leer.nextInt();
        System.out.print("Año (yyyy): ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Persona persona = new Persona(nombre, fecha);

        return persona;

    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFechaNacimiento();
        int edad= fechaActual.getYear()-fechaNacimiento.getYear();
        return edad;
        
       
        
        
       

    }

}
