/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
        
    }
    
    public void area (double radio){
    double calcularArea = Math.PI * radio * radio;
        System.out.println("El área de la circunsferencia es: " + calcularArea);
        
    }
    
    public void perimetro (double radio){
    double calculaPerimetro = 2 * Math.PI * radio;
       System.out.println("El perímetro de la circunsferencia es: " + calculaPerimetro);
    
    }
    
    
}
