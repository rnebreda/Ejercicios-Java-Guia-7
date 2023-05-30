/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.extras5_salario;

import Salario.Empleado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POOExtras5_salario {
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado miEmpleado = new Empleado();
        System.out.println("Ingrese el nombre del empleado");
        miEmpleado.setNombre(leer.nextLine());
    }
    
}
