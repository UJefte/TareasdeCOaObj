/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6;

/**
 *
 * @author 100039009
 */
public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor sobrecargado
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Métodos de acceso
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    //Métodos de uso general
    public void hablar() {
        System.out.println("La persona está hablando.");
    }

    public void caminar() {
        System.out.println("La persona está caminando.");
    }

    public void comer() {
        System.out.println("La persona está comiendo.");
    }
}


