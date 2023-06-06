package org.example;

import org.example.Controladro.ControladorLeague;
import org.example.Vista.VentanaLeague;

import java.sql.*;

import org.sqlite.JDBC;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            VentanaLeague view = new VentanaLeague("League Of Legends");
            ControladorLeague controlador = new ControladorLeague(view);
    }
}