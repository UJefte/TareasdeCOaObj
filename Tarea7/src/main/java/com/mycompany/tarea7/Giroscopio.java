/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Giroscopio {
    private String modelo;
    private double velocidadMaxima;
    private boolean activo;
    
    public Giroscopio() {
        this.modelo = "";
        this.velocidadMaxima = 0;
        this.activo = false;
    }
    
    public Giroscopio(String modelo, double velocidadMaxima, boolean activo) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.activo = activo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public boolean isActivo() {
        return activo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    @Override
    public String toString() {
        return "Giroscopio Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima + ", Activo: " + activo;
    }
    
    public void encender() {
        this.activo = true;
    }
    
    public void apagar() {
        this.activo = false;
    }
}