/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extras4_cuenta;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_extras4_cuenta {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta();
        int opcion;

        do {
            System.out.println("Ingrese una opción");
            System.out.println(" 1 - Abrir Cuenta"
                    + "\n 2 - Retirar Dinero"
                    + "\n 3 - Agregar Monto"
                    + "\n 99 - Salir");
            opcion = leer.nextInt();
            String tieneCuenta;

            switch (opcion) {

                case 1:
                  
                    if (!miCuenta.getTitular().equalsIgnoreCase(" ")){
                        System.out.println(miCuenta.getTitular()+ " Usted ya tiene una cuenta");
                    } else {
                        miCuenta.abrirCuenta();
                    }
                    break;
                    
                case 2:
                    miCuenta.retirar_dinero();
                    break;
                case 3:
                    miCuenta.agregar_saldo();
                    break;
                case 99:
                    System.out.println("Fin de transacción");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 99);

    }

}
