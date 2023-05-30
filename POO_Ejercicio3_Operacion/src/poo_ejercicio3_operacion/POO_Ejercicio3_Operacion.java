/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio3_operacion;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_Ejercicio3_Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion miOperacion = new Operacion();
        miOperacion.crearOperacion();
        String opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("99 - Salir");
            System.out.println("Ingrese una opción");
            opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("La suma es: "+ miOperacion.Sumar());
                    break;
                case "2":
                    System.out.println("La resta es "+ miOperacion.restar());
                    break;
                case "3":
                    System.out.println("La multiplicación es "+ miOperacion.multiplicar());
                    break;
                case "4":
                    System.out.println("La división es "+ miOperacion.division());
                    break;
                default:
                    break;

            }
        } while (!opcion.equals("99"));

    }

}
