package org.example.Percistencia;
import org.sqlite.JDBC;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    private Connection conexion;

    private ConexionSingleton(String database){
        this.baseDatos = database;
        try{
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        }catch (SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance(String baseDatos){
        if (_instance == null){
            _instance = new ConexionSingleton(baseDatos);
        }else {
            System.out.println("Ya fue creado");
        }
        return _instance;
    }

    public Connection getConexion(){
        return conexion;
    }

}
