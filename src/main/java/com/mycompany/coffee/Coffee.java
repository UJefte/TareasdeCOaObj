/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffee;

/**
 *
 * @author 100039009
 */
public class Coffee {

    public static void main(String[] args) {
         MaquinaCafe maquina = new MaquinaCafe();

        maquina.mostrarRecursos();

        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();

        for (int i = 0; i < 47; i++) {
            maquina.servirAmericano();
        }

        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
    }
}
