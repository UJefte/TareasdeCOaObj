/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author 100039009
 */
public class Automóvil extends Vehículo {
    private int cilindrada;
    private String tipoCombustible;

    public Automóvil() {
        super();
        this.cilindrada = 0;
        this.tipoCombustible = "";
    }

    public Automóvil(String marca, String modelo, int año, int cilindrada, String tipoCombustible) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automóvil{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", cilindrada=" + cilindrada +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }

    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }
}