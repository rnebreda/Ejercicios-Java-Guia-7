/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private double salario;
    private String nombre;
    private int edad;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double calcular_aumento(){
        double retorno;
        if (edad>30){
            retorno=salario*0.1;    
        }else{
            retorno=salario*0.05;
        }
        salario+=retorno;
    return retorno;
    }
}
