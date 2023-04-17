/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ejemplointegrador.ArreglosMain;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class ArreglosService {

    ArreglosMain arreglo = new ArreglosMain();

    public void inicializarArreglo(double arreglo1[]) {

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = Math.random() * 100;
        }

    }

    public void mostrar(double[] arreglo1) {
        System.out.println(Arrays.toString(arreglo1));

    }

    public void ordenarArreglo(double[] arreglo1) {
        Arrays.sort(arreglo1);
        System.out.println(Arrays.toString(arreglo1));
    }
    
    public void llenarArregloB(double [] arreglo1, double[]arreglo2){
        
        for(int i = 0;i<10;i++){
             System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
              Arrays.fill(arreglo2, 10, 20, 0.5);
        }
        
    }
    
    

}
