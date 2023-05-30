/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.text.*;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    public String nombre;
    public String dni;
    private Date fechaNacimiento;
        // En esta linea de código estamos indicando el nuevo formato que queremos para nuestra fecha.
SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        // Aqui usamos la instancia formatoFecha para darle el formato a la fecha. Es importante ver que el resultado es un string.
    public String fechaTexto;

    public Persona() {
    }

    public Persona(String nombre, String dni, String fechaTexto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaStringToDate("dd/MM/yyyy",fechaTexto);
        this.fechaTexto = fechaTexto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SimpleDateFormat getFormatoFecha() {
        return formatoFecha;
    }

    public void setFormatoFecha(SimpleDateFormat formatoFecha) {
        this.formatoFecha = formatoFecha;
    }

    public String getFechaTexto() {
        return fechaTexto;
    }

    public void setFechaTexto(String fechaTexto) {
        this.fechaTexto = fechaTexto;
    }


//Función para pasar "fecha" en Texto con el formato establecido en "formato" a dato tipo Date
private static Date fechaStringToDate(String formato, String fecha) {
    
    SimpleDateFormat formatoFecha = new SimpleDateFormat(formato);
    try{
        Date miFecha = formatoFecha.parse(fecha);
        return miFecha;
    } catch (ParseException ex){
        return new Date();
    }
}

}
