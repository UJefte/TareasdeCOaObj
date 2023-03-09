/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class CuboDeRubik {
    private int nivel;
    private String marca;
    private String color;
    
    public CuboDeRubik() {
    this.nivel = 3;
    this.marca = "";
    this.color = "";
}

public CuboDeRubik(int nivel, String marca, String color) {
    this.nivel = nivel;
    this.marca = marca;
    this.color = color;
}

public int getNivel() {
    return nivel;
}

public String getMarca() {
    return marca;
}

public String getColor() {
    return color;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void setColor(String color) {
    this.color = color;
}

@Override
public String toString() {
    return "Cubo de Rubik Nivel: " + nivel + ", Marca: " + marca + ", Color: " + color;
}

public void resolver() {
    System.out.println("Resolviendo el cubo de Rubik de nivel " + nivel);
}

public boolean esDeMarca(String marca) {
    return this.marca.equalsIgnoreCase(marca);
}

}
