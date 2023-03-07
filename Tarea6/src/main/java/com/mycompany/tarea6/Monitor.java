/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6;

/**
 *
 * @author 100039009
 */
public class Monitor {
    private String marca;
    private String modelo;
    private int tamaño;
    private int resolucion;

    //Constructor por defecto
    //Constructor sobrecargado
    public Monitor(String marca, String modelo, int tamaño, int resolucion) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.resolucion = resolucion;
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    //Método toString
    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño=" + tamaño +
                ", resolucion=" + resolucion +
                '}';
    }

    //Métodos de uso general
    public void encender() {
        System.out.println("El monitor ha sido encendido.");
    }

    public void apagar() {
        System.out.println("El monitor ha sido apagado.");
    }

    public void ajustarBrillo(int nivel) {
        System.out.println("Se ha ajustado el brillo del monitor a " + nivel + ".");
    }
}
