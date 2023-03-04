
package com.mycompany.juegodelgato;

import java.util.Scanner;

public class JuegoDelGato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 9 caracteres (solo X, O ó _): ");
        String cadena = teclado.nextLine();
        teclado.close();

        if (cadena.length() != 9 || !cadena.matches("[XO_]{9}")) {
            System.out.println("Cadena ingresada inválida. Debe ser una cadena de 9 caracteres, solo X, O ó _");
            return;
        }
        String marco = " " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " \n"
                     + "-----------\n"
                     + " " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " \n"
                     + "-----------\n"
                     + " " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " \n";

        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("Marco:\n" + marco);
    }
}

