/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author 100039009
 */
public class Herencia {
     public static void main(String[] args) {
Vehículo vehículo1 = new Vehículo("Ford", "Fiesta", 2022);
System.out.println(vehículo1.toString());

    Automóvil automóvil1 = new Automóvil("Chevrolet", "Camaro", 2021, 3500, "Gasolina");
    System.out.println(automóvil1.toString());
    automóvil1.acelerar();

    Taxi taxi1 = new Taxi("Toyota", "Corolla", 2019, 2000, "Gasolina",
            "1234", "Taxi SA");
    System.out.println(taxi1.toString());
    taxi1.recogerPasajero();
}
}
