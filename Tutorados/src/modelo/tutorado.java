/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ganzo
 */
public class tutorado {
    
         private  String clave;
         private  String nombre;
         private String direccion;
         private char carrera;
         private char genero;
         private String edad;
         private char estado;
    
         
  
    public tutorado(String clave, String nombre,String direccion, char carrera, char genero, String edad, char estado) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion= direccion;
        this.carrera = carrera;
        this.genero = genero;
        this.edad = edad;
        this.estado = estado;
   }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCarrera(char carrera) {
        this.carrera = carrera;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public char getCarrera() {
        return carrera;
    }

    public char getGenero() {
        return genero;
    }

    public String getEdad() {
        return edad;
    }

    public char getEstado() {
        return estado;
    }
    
    
    
    
    
    
    
}
