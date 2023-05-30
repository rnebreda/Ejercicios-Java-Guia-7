/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puntos {
    private int x1, y1, x2, y2;

    public Puntos() {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos (){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas de ambos puntos (x1, y1, x2, y2)");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    
    }
    
    public void calcularDistancia(){
    int x = x2-x1;
    int y = y2-y1;
    double distancia = Math.sqrt(x*x + y*y);
        System.out.println("La distancia entre los puntos es: "+ distancia);
    
    }
    
}
