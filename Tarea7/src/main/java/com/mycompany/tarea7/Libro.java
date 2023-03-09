/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author 100039009
 */
public class Libro {
private String titulo;
private String autor;
private int numPaginas;

public Libro() {
    this.titulo = "";
    this.autor = "";
    this.numPaginas = 0;
}

public Libro(String titulo, String autor, int numPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}

public int getNumPaginas() {
    return numPaginas;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
}

@Override
public String toString() {
    return "Libro Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numPaginas;
}

public void aumentarNumPaginas(int cantidad) {
    this.numPaginas += cantidad;
}

public boolean esDeAutor(String autor) {
    return this.autor.equalsIgnoreCase(autor);
}

}
