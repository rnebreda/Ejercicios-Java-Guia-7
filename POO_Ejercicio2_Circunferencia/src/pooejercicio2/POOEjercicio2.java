/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio2;

import Circunferencia.Circunferencia;

/**
 *
 * @author Usuario
 */
public class POOEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia miCirc = new Circunferencia();
        miCirc.crearCircunferencia();
        
        miCirc.perimetro(miCirc.getRadio());
        miCirc.area(miCirc.getRadio());
        
        //miCirc.setRadio(30);
        //miCirc.perimetro(miCirc.getRadio());
        //miCirc.area(miCirc.getRadio());
    }
    
}
