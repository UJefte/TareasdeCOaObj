
package com.mycompany.gato;
public class GATo {
    public static void main(String[] args) {
        int ancho = 9;
        int alto = 5;

        // Dibujar marco
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (i == 1 || i == alto) {
                    System.out.print("-");
                } else {
                    if (j == 1 || j == ancho) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
