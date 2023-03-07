/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6;

/**
 *
 * @author 100039009
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    //Constructor por defecto
    public Automovil() {
    }

    //Constructor sobrecargado
    public Automovil(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    //Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método toString
    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                '}';
    }

    //Métodos de uso general
    public void encender() {
        System.out.println("El automóvil ha sido encendido.");
    }

    public void apagar() {
        System.out.println("El automóvil ha sido apagado.");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }
}
