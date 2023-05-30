/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public void mostrarAtributosPersona(Persona persona){
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("DNI: "+ persona.getDni());
        System.out.println("Fecha de Nacimiento: "+persona.getFechaNacimiento());
        System.out.println("Fecha en Texto: "+ persona.getFechaTexto());
    }
    
    
}
