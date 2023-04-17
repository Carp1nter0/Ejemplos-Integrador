/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FechaService {

    public Date fechNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Día (1-31): ");
        int dia = leer.nextInt();
        System.out.print("Mes (1-12): ");
        int mes = leer.nextInt();
        System.out.print("Año (yyyy): ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);

        return fecha;

    }
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
        
    }
    public int diferencia(Date fecha, Date fechaActual){
        int _diferencia = fechaActual.getYear()-fecha.getYear();
        return _diferencia;
        
    }
}
