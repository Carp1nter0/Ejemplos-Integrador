/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author pc
 */
public class FechaMain {
     public static void main(String[] args) {
         FechaService service = new FechaService();
         Date fechaNacimiento = service.fechNacimiento();
          System.out.println("Su fecha de nacimiento es: " + fechaNacimiento);
          Date fechaActual = service.fechaActual();
          service.diferencia(fechaNacimiento, fechaActual);
          System.out.println("La fecha actual es"+ fechaActual);
          int edad = service.diferencia(fechaNacimiento, fechaActual);
          System.out.println("su edad es: "+edad+" años");
     }
     
}
