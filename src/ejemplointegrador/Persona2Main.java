/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Entidades.Persona2;
import Servicios.PersonaService2;

/**
 *
 * @author pc
 */
public class Persona2Main {
    public static void main(String[] args) {
        PersonaService2 service = new PersonaService2();
        Persona2 persona = service.CrearPersona();
        
      
        
  
        
        service.menorQue(persona, 18);
        
        if (service.menorQue(persona, 18)==true){
            System.out.println("es chiquita violin");
        } else{
            System.out.println("la persona es legal");
        }
        
        service.mostrarPersona(persona);
        
    }
}
