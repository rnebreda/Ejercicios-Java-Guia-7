/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extras1_cancion;

import Cancion.Cancion;

/**
 *
 * @author Usuario
 */
public class POO_extras1_cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("La Balsa");
        miCancion.setAutor("Los Gatos");
        System.out.println(" La cancion es: "+ miCancion.getTitulo()
        + "\n El Autor es: " + miCancion.getAutor());
        
    }
    
}
