/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author 100039009
 */
public class Vehículo {
    private String marca;
    private String modelo;
    private int año;

    public Vehículo() {
        this.marca = "";
        this.modelo = "";
        this.año = 0;
    }

    public Vehículo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

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

    @Override
    public String toString() {
        return "Vehículo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                '}';
    }

    public void encender() {
        System.out.println("El vehículo ha sido encendido.");
    }

    public void apagar() {
        System.out.println("El vehículo ha sido apagado.");
    }
}
