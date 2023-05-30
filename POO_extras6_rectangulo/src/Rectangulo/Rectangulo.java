/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area() {
        double area = lado1 * lado2;
        return area;
    }

}
