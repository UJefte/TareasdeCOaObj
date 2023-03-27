/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffee;

/**
 *
 * @author 100039009
 */
public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public void servirAmericano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            System.out.println("Se ha servido un café americano");
            mostrarRecursos();
        } else {
            System.out.println("No hay suficientes recursos para servir un café americano");
        }
    }

    public void servirExpreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;
            System.out.println("Se ha servido un café expreso");
            mostrarRecursos();
        } else {
            System.out.println("No hay suficientes recursos para servir un café expreso");
        }
    }

    public void servirCapuchino() {
        if (this.agua >= 100 && this.crema >= 70 && this.cafe >= 14 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            System.out.println("Se ha servido un capuchino");
            mostrarRecursos();
        } else {
            System.out.println("No hay suficientes recursos para servir un capuchino");
        }
    }

    public void mostrarRecursos() {
        System.out.println("Recursos actuales:");
        System.out.println("Agua: " + this.agua + " ml");
        System.out.println("Café: " + this.cafe + " g");
        System.out.println("Crema: " + this.crema + " ml");
        System.out.println("Vasos: " + this.vasos);
    }
}

