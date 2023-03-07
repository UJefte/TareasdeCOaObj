/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6;

/**
 *
 * @author 100039009
 */
public class Electrodomesticos {
    private String marca;
    private String modelo;
    private double precio;
    private boolean encendido;

    //Constructor por defecto
    public Electrodomesticos() {
    }

    //Constructor sobrecargado
    public Electrodomesticos(String marca, String modelo, double precio, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.encendido = encendido;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    //Método toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", encendido=" + encendido +
                '}';
    }

    //Métodos de uso general
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El electrodoméstico ha sido encendido.");
        } else {
            System.out.println("El electrodoméstico ya está encendido.");
        }
    }

    public void apagar() {
        if(encendido) {
        encendido = false;
        System.out.println("El electrodoméstico ha sido apagado.");
    } else {
        System.out.println("El electrodoméstico ya está apagado.");
    }
}

public void cambiarPrecio(double nuevoPrecio) {
    precio = nuevoPrecio;
    System.out.println("El precio del electrodoméstico ha sido actualizado a " + precio + ".");
}

}
