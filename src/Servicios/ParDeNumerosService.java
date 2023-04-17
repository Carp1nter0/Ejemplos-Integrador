/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ParDeNumerosService {
    ParDeNumeros par = new ParDeNumeros();
    Scanner leer=new Scanner(System.in);
    
    public void mostrarValores(){
        System.out.println("el numero 1 es: "+par.getNumer1());
        System.out.println("el numero 2 es: "+par.getNumer2());
        
    }
    
    public double devolverMayor(ParDeNumeros par){
       double numMayor = Math.max(par.getNumer1(), par.getNumer2());
        return numMayor;
        
    }
    
    public double calcularPotencia(ParDeNumeros par){
        double mayor = devolverMayor(par);
        double menor = Math.min(par.getNumer1(), par.getNumer2());
        mayor=Math.round(mayor);
        menor=Math.round(menor);
        return (Math.pow(mayor, menor));
    }
    
    public double calcularRaiz(ParDeNumeros par){
        double menor = Math.min(par.getNumer1(), par.getNumer2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
      
        
    }
    
}
