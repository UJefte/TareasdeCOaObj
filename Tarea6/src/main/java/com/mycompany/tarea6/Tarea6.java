/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea6;

/**
 *
 * @author 100039009
 */
public class Tarea6 {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Automovil
        Automovil miAuto = new Automovil("Ford", "Mustang", "Rojo", 2022);
        System.out.println(miAuto);

        //Usamos algunos métodos de la clase Automovil
        miAuto.encender();
        miAuto.acelerar(50);
        miAuto.frenar();
        miAuto.apagar();

        //Creamos un objeto de la clase Persona
        Persona miPersona = new Persona("Juan", "Pérez", 25, "México");
        System.out.println(miPersona);

        //Usamos algunos métodos de la clase Persona
        miPersona.caminar(1000);
        miPersona.hablar("Hola, ¿cómo estás?");
        miPersona.cambiarEdad(26);

        //Creamos un objeto de la clase Monitor
        Monitor miMonitor = new Monitor("LG", "27GL83A-B", 27, 2560);
        System.out.println(miMonitor);

        //Usamos algunos métodos de la clase Monitor
        miMonitor.encender();
        miMonitor.ajustarBrillo(50);
        miMonitor.apagar();

        //Creamos un objeto de la clase Electrodomestico
        Electrodomesticos miElectrodomestico = new Electrodomesticos("Samsung", "TV", 500.0, false);
        System.out.println(miElectrodomestico);

        //Usamos algunos métodos de la clase Electrodomestico
        miElectrodomestico.encender();
        miElectrodomestico.cambiarPrecio(550.0);
        miElectrodomestico.apagar();
    }
}

