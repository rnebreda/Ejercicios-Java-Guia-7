/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio4_rectangulo;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_Ejercicio4_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese los lados del rectángulo");
        r1.setLado1(leer.nextInt());
        r1.setLado2(leer.nextInt());
        System.out.println("El perímetro es: " + r1.calcular_perimetro());
        System.out.println("El área es: " + r1.calcular_area());
        System.out.println("");
        r1.dibujar();

    }

}
