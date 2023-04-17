/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona2;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PersonaService2 {
    Scanner leer = new Scanner(System.in);
    
    
    public Persona2 CrearPersona (){
        Persona2 persona = new Persona2();
        System.out.println("ingrese nombre");
        String nombre = leer.next();
        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt();
        System.out.println("ingrese año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        persona.setNombre(nombre);
        persona.setFechaNacimiento(fecha);
        
       
        return persona;
        
    }
    
    public int calcularEdad(Persona2 persona){
        
        Date fechaActual = new Date();
        
      int diferencia= fechaActual.getYear()-persona.getFechaNacimiento().getYear();
        
        
        return diferencia;
        
    }
    
    public boolean menorQue(Persona2 persona, int edad){
        if(calcularEdad(persona)<edad){
           return true; 
        }else{
            return false;
        }

        
    }
    
    public void mostrarPersona(Persona2 persona){
        System.out.println("nombre:"+persona.getNombre());
        System.out.println("edad"+calcularEdad(persona));
        System.out.println("fecha de nacimiento"+persona.getFechaNacimiento().toString());
        
    }
}
