/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Main {

    public static void main(String[] args) {
        Balon balon1 = new Balon();
        Balon balon2 = new Balon("Fútbol", "Adidas", 69.99);

        System.out.println(balon1);
        System.out.println(balon2);

        balon1.setDeporte("Vóley");
        balon1.setMarca("Mikasa");
        balon1.setPrecio(49.99);

        System.out.println(balon1.getDeporte() + " " + balon1.getMarca() + " " + balon1.getPrecio());
        System.out.println("El balón 2 es caro? " + balon2.esCaro());
        System.out.println();

        balon1.inflar();
        balon2.inflar();
        
        Computadora comp1 = new Computadora();
        Computadora comp2 = new Computadora("Lenovo", "ThinkPad X1 Carbon", 1999.99);

        System.out.println(comp1);
        System.out.println(comp2);

        comp1.setMarca("HP");
        comp1.setModelo("Spectre x360");
        comp1.setPrecio(1499.99);

        System.out.println(comp1.getMarca() + " " + comp1.getModelo() + " " + comp1.getPrecio());
        System.out.println("La computadora 2 es cara? " + comp2.esCaro());
        System.out.println();

        comp1.aumentarPrecio(200);
        comp2.aumentarPrecio(100);

        System.out.println(comp1);
        System.out.println(comp2);
        
        CuboDeRubik cubo1 = new CuboDeRubik();
        System.out.println("Cubo 1: " + cubo1.toString());
            CuboDeRubik cubo2 = new CuboDeRubik(4, "Gan", "Negro");
    System.out.println("Cubo 2: " + cubo2.toString());

    cubo1.setNivel(5);
    cubo1.setMarca("QiYi");
    cubo1.setColor("Blanco");

    System.out.println("Cubo 1 (modificado): " + cubo1.toString());

    cubo1.resolver();
    cubo2.resolver();

    System.out.println("¿Cubo 1 es de marca Gan? " + cubo1.esDeMarca("Gan"));
    System.out.println("¿Cubo 2 es de marca QiYi? " + cubo2.esDeMarca("QiYi"));
    
        Gato miGato = new Gato("Garfield", 5, "Persa");
        System.out.println(miGato.toString());
        miGato.maullar();
        miGato.dormir();

        // Cambiar la edad del gato
        miGato.setEdad(6);
        System.out.println("La edad del gato " + miGato.getNombre() + " es " + miGato.getEdad());
    
        Giroscopio giroscopio1 = new Giroscopio("Modelo 1", 100, false);
        System.out.println(giroscopio1.toString());

        // Encender el giroscopio1 y verificar si está activo
        giroscopio1.encender();
        System.out.println("Giroscopio1 está activo: " + giroscopio1.isActivo());

        // Cambiar la velocidad máxima del giroscopio1 y apagarlo
        giroscopio1.setVelocidadMaxima(200);
        System.out.println("La velocidad máxima del Giroscopio1 es: " + giroscopio1.getVelocidadMaxima());
        giroscopio1.apagar();
        System.out.println("Giroscopio1 está activo: " + giroscopio1.isActivo());
    
        // Crear una lámpara nueva
        Lampara lampara = new Lampara("Philips", "LED", false);

        // Mostrar información de la lámpara
        System.out.println(lampara);

        // Encender la lámpara
        lampara.encender();

        // Mostrar información de la lámpara
        System.out.println(lampara);

        // Apagar la lámpara
        lampara.apagar();

        // Mostrar información de la lámpara
        System.out.println(lampara);

        // Cambiar el estado de la lámpara
        lampara.cambiarEstado();

        // Mostrar información de la lámpara
        System.out.println(lampara);
    
        // Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        // Imprimir los detalles del libro
        System.out.println(libro1.toString());

        // Cambiar el número de páginas del libro
        libro1.aumentarNumPaginas(50);

        // Imprimir los detalles actualizados del libro
        System.out.println(libro1.toString());

        // Verificar si el libro es de un autor específico
        System.out.println(libro1.esDeAutor("Gabriel García Márquez")); // true
        System.out.println(libro1.esDeAutor("Mario Vargas Llosa")); // false
        
      
        // Crear un país
        Pais pais1 = new Pais("España", 47000000, "Madrid");

        // Imprimir los detalles del país
        System.out.println(pais1.toString());

        // Cambiar la población del país
        pais1.aumentarPoblacion(1000000);

        // Imprimir los detalles actualizados del país
        System.out.println(pais1.toString());

        // Verificar si una ciudad es la capital del país
        System.out.println(pais1.esCapital("Madrid")); // true
        System.out.println(pais1.esCapital("Barcelona")); // false
    }
}

 


 





