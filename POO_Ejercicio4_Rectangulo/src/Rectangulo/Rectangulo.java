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

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    
    public double calcular_area() {
        double area = lado1 * lado2;
        return area;
    }

    public double calcular_perimetro() {
        double perimetro = 2 * (lado1 + lado2);
        return perimetro;

    }
    
    public void dibujar(){
        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
