/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Servicios.ArreglosService;

/**
 *
 * @author pc
 */
public class ArreglosMain {
    
    public static void main(String[] args) {
        ArreglosService servicio = new ArreglosService();
        double arreglo1[]= new double[50];
        double arreglo2[]= new double[20];
        
        servicio.inicializarArreglo(arreglo1);
      System.out.println("ARREGLO 1");
        servicio.mostrar(arreglo1);
         System.out.println("ORDENAR ARREGLO");
        servicio.ordenarArreglo(arreglo1);
        servicio.llenarArregloB(arreglo1, arreglo2);
        System.out.println("ARREGLO 2");
        servicio.mostrar(arreglo2);
    }
}
