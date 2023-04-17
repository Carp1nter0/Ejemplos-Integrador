/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author pc
 */
public class ParNumerosMain {
     public static void main(String[] args) {
         ParDeNumeros par = new ParDeNumeros();
         ParDeNumerosService service = new ParDeNumerosService();
         
         service.mostrarValores();
         System.out.println("el numero mas alto es "+service.devolverMayor(par));
         System.out.println("Potencia: el numero mayor elevado al numero menor es igual a: "+service.calcularPotencia(par));
         System.out.println("la raiz cuadrada del numero menor es: "+service.calcularRaiz(par));
     }
    
}
