/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author 100039009
 */

public class Taxi extends Automóvil {
    private String númeroLicencia;
    private String empresa;

    public Taxi() {
        super();
        this.númeroLicencia = "";
        this.empresa = "";
    }

    public Taxi(String marca, String modelo, int año, int cilindrada, String tipoCombustible,
                String númeroLicencia, String empresa) {
        super(marca, modelo, año, cilindrada, tipoCombustible);
        this.númeroLicencia = númeroLicencia;
        this.empresa = empresa;
    }

    public String getNúmeroLicencia() {
        return númeroLicencia;
    }
    public void setNúmeroLicencia(String númeroLicencia) {
    this.númeroLicencia = númeroLicencia;
}

public String getEmpresa() {
    return empresa;
}

public void setEmpresa(String empresa) {
    this.empresa = empresa;
}

@Override
public String toString() {
    return "Taxi{" +
            "marca='" + getMarca() + '\'' +
            ", modelo='" + getModelo() + '\'' +
            ", año=" + getAño() +
            ", cilindrada=" + getCilindrada() +
            ", tipoCombustible='" + getTipoCombustible() + '\'' +
            ", númeroLicencia='" + númeroLicencia + '\'' +
            ", empresa='" + empresa + '\'' +
            '}';
}

public void recogerPasajero() {
    System.out.println("El taxi está recogiendo un pasajero.");
}

public void dejarPasajero() {
    System.out.println("El taxi está dejando un pasajero.");
}
}
