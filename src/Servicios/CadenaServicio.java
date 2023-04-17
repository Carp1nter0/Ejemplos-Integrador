/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CadenaServicio {

    Cadena _cadena = new Cadena();
    Scanner leer = new Scanner(System.in);

    public void crearCadena() {
        System.out.println("ingrese la frase");
        _cadena.setFrase(leer.nextLine());
        System.out.println(_cadena.getFrase());
    }

    public void contarVocales() {
        int contador = 0;
        String frase = _cadena.getFrase().toLowerCase();

        for (int i = 0; i < _cadena.getLongitudFrase(); i++) {
            char letra = _cadena.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;

            }

        }
        System.out.println("hay " + contador + " vocales en la frase");
    }

    public void invertirFrase() {
        String frase = _cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }
        System.out.println(frase + " // inversion // " + fraseInvertida);
    }

    public void vecesRepetido() {
        int contador = 0;
        System.out.println("ingrese una letra para buscar");
        char letraBuscar = leer.next().charAt(0);
        String frase = _cadena.getFrase().toLowerCase();
        for (int i = 0; i < _cadena.getLongitudFrase(); i++) {
            char letra = _cadena.getFrase().charAt(i);

            if (letra == letraBuscar) {
                contador++;
            }

        }
        System.out.println("la letra " + letraBuscar + " se encuentra " + contador + " veces");

    }
//    Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud() {
        
        System.out.println("ingresa otra frase");
        String otraFrase = leer.nextLine();
        int longitudOtraFrase = otraFrase.length();
//        System.out.println("la longitud de la cadena 1 es "+_cadena.getLongitudFrase());
//        System.out.println("la longitud de la cadena 2 es "+longitudOtraFrase);

        if(longitudOtraFrase==_cadena.getLongitudFrase()){
            System.out.println("las longitudes son iguales");
        }else if(longitudOtraFrase<_cadena.getLongitudFrase()){
            System.out.println("la longitud de la primer cadena es menor a la segunda");
            
        }
        else if(longitudOtraFrase>_cadena.getLongitudFrase()){
            System.out.println("la longitud de la primer cadena es mayor a la segunda");
        }

    }
    
    public void unirFrases(){
        
        System.out.println("ingrese una frase nueva, otra vez");
       
        String otraFrase=leer.next();
        
       String concatenado = otraFrase.concat("").concat(_cadena.getFrase());
        System.out.println(concatenado);
    }
    public String reemplazar(){
        String frase = _cadena.getFrase();
        String letraAgregar = leer.next();
        for(int i=0; i < frase.length();i++){
            if (frase.charAt(i)=='a'){
                String nuevaFrase = frase.replace("a", letraAgregar);
                return nuevaFrase;
            }
           
        }
        return null;
        
     
        
    }
    public boolean contieneLetra(){
      
        System.out.println("ingrese otra letra a buscar en frase");
       char letraBuscada = leer.next().charAt(0);
        String frase = _cadena.getFrase();
        for (int i = 0; i<frase.length();i++){
            if(frase.charAt(i)==letraBuscada){
              
                return true;
            }
            else {
                return false;
                
            }
        }
        return false;
        
       
        
    }
}
