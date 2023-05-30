/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extras2_puntos;

import Puntos.Puntos;

/**
 *
 * @author Usuario
 */
public class POO_extras2_puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos misPuntos = new Puntos();

        misPuntos.crearPuntos();
        misPuntos.calcularDistancia();
        
        misPuntos.setX1(0);
        misPuntos.setY1(0);
        
        misPuntos.calcularDistancia();
    }

}
