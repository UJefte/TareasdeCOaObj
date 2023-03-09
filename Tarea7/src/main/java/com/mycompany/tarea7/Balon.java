/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Balon {
private String deporte;
private String marca;
private double precio;

public Balon() {
    this.deporte = "";
    this.marca = "";
    this.precio = 0;

}
public Balon(String deporte, String marca, double precio) {
this.deporte = deporte;
this.marca = marca;
this.precio = precio;
}
public String getDeporte() {
    return deporte;
}

public String getMarca() {
    return marca;
}

public double getPrecio() {
    return precio;
}

public void setDeporte(String deporte) {
    this.deporte = deporte;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

@Override
public String toString() {
    return "Balón Deporte: " + deporte + ", Marca: " + marca + ", Precio: " + precio;
}

public void inflar() {
    System.out.println("Inflando el balón de " + deporte);
}

public boolean esCaro() {
    return this.precio > 50;
}

}