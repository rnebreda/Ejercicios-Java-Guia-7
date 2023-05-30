 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1= new Persona("Juan","17506960","15/10/1968");
        Persona p2= new Persona("Carlos","27508988","15/10/1998");
        PersonaServicio ps= new PersonaServicio();
        ps.mostrarAtributosPersona(p1);
        ps.mostrarAtributosPersona(p2);
        
        
    }
    
}
