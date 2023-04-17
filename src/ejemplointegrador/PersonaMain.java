/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointegrador;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author pc
 */
public class PersonaMain {

    public static void main(String[] args) {
        
        Persona persona = new Persona();

        PersonaService service = new PersonaService();
        
        System.out.println("Creando persona");
      
       service.crearPersona();
        System.out.println("Calculando edad");
        service.calcularEdad(persona);
        
        
    }

}
