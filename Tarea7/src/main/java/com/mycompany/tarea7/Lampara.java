/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Lampara {
private String marca;
private String tipo;
private boolean encendida;
public Lampara() {
    this.marca = "";
    this.tipo = "";
    this.encendida = false;
}

public Lampara(String marca, String tipo, boolean encendida) {
    this.marca = marca;
    this.tipo = tipo;
    this.encendida = encendida;
}

public String getMarca() {
    return marca;
}

public String getTipo() {
    return tipo;
}

public boolean isEncendida() {
    return encendida;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public void encender() {
    this.encendida = true;
    System.out.println("Lámpara encendida");
}

public void apagar() {
    this.encendida = false;
    System.out.println("Lámpara apagada");
}

public void cambiarEstado() {
    if (this.encendida) {
        this.apagar();
    } else {
        this.encender();
    }
}

@Override
public String toString() {
    String estado;
    if (encendida) {
        estado = "encendida";
    } else {
        estado = "apagada";
    }
    return "Lámpara Marca: " + marca + ", Tipo: " + tipo + ", Estado: " + estado;
}

}
