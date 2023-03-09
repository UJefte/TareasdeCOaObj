/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Computadora {
    private String marca;
    private String modelo;
    private double precio;
    
    public Computadora() {
        this.marca = "";
        this.modelo = "";
        this.precio = 0;
    }
    
    public Computadora(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

@Override
public String toString() {
    return "Computadora Marca: " + marca + ", Modelo: " + modelo + ", Precio: " + precio;
}

public void aumentarPrecio(double cantidad) {
    this.precio += cantidad;
}

public boolean esCaro() {
    return this.precio > 1000;
}

}
