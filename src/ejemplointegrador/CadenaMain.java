/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author pc
 */
public class CadenaMain {
     public static void main(String[] args) {
         CadenaServicio servicio = new CadenaServicio();
         
         servicio.crearCadena();
         Cadena cadena= new Cadena();
         servicio.contarVocales();
         servicio.invertirFrase();
         servicio.vecesRepetido();
         servicio.unirFrases();
         
         
         String resultado = servicio.reemplazar();
         System.out.println(resultado);
         boolean resultados= servicio.contieneLetra();
        if (resultados = true){
            System.out.println("letra encontrada");
        }else{
            System.out.println("no se encontro la letra");
        }
        
         
     }
    
}
