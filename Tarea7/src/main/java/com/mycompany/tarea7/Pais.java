/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Pais {
    private String nombre;
    private int poblacion;
    private String capital;
    
    public Pais() {
        this.nombre = "";
        this.poblacion = 0;
        this.capital = "";
    }
    
    public Pais(String nombre, int poblacion, String capital) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPoblacion() {
        return poblacion;
    }
    
    public String getCapital() {
        return capital;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    @Override
    public String toString() {
        return "País: " + nombre + ", Población: " + poblacion + ", Capital: " + capital;
    }
    
    public void aumentarPoblacion(int cantidad) {
        this.poblacion += cantidad;
    }
    
    public boolean esCapital(String ciudad) {
        return this.capital.equalsIgnoreCase(ciudad);
    }
}

