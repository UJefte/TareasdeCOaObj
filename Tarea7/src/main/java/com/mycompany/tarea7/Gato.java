/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Gato {
private String nombre;
private int edad;
private String raza;
public Gato() {
    this.nombre = "";
    this.edad = 0;
    this.raza = "";
}

public Gato(String nombre, int edad, String raza) {
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
}

public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

public String getRaza() {
    return raza;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setEdad(int edad) {
    this.edad =edad;
}
public void setRaza(String raza) {
    this.raza = raza;
}

@Override
public String toString() {
    return "Gato Nombre: " + nombre + ", Edad: " + edad + ", Raza: " + raza;
}

public void maullar() {
    System.out.println("Miau!");
}

public void dormir() {
    System.out.println("El gato " + nombre + " está durmiendo");
}

}
