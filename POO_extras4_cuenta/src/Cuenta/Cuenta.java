/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    static Scanner leer = new Scanner(System.in);

    private double saldo;
    private String titular=" ";

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void abrirCuenta() {
        //Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido. Ingrese su Nombre");
        titular = leer.next();
        System.out.println("Ingrese el monto a su cuenta");
        saldo = leer.nextDouble();

    }

    public void retirar_dinero() {
        double retiroDeseado;
        //Scanner leer = new Scanner(System.in);

        //String repite;
        //do {
        System.out.println("Ingrese el valor a retirar");
        retiroDeseado = leer.nextDouble();

        if (retiroDeseado > saldo) {
            System.out.println("Lo lamento. La transaccion no puede realizarse"
                    + "\n Su saldo es " + saldo);

        } else {
            saldo -= retiroDeseado;
            System.out.println("La transaccion se realizó con exito"
                    + "\n Su saldo es " + saldo);
        }
        //System.out.println("Desea realizar otra transacción? S=Si");
        //repite = leer.next();
        //} while (repite.equalsIgnoreCase("S"));

    }

    public void agregar_saldo() {
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto a agregar a su cuenta");
        saldo += leer.nextDouble();
        System.out.println("Su saldo actual es " + saldo);
    }
}
