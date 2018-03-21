/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que implementa el Patron Singleton (unica conexxion a DB)
 * @author Rocío y Juan Pablo
 */
public class LogicaConexion {

    private static Connection conecta = null;
    //Propiedades
    private String url;
    private String user;
    private String pass;
    private String driver;

    //Constructor
    private LogicaConexion() {
        this.url = "jdbc:mysql://localhost:3306/parkingsystem";//ruta de la BD
        this.user = "root";
        this.pass = "";
        this.driver = "com.mysql.jdbc.Driver";//driver que permite la conexion: controlador

        try {
            Class.forName(driver);
            conecta = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Metodos
    public static Connection getConexion() {
        if (conecta == null) {
            new LogicaConexion();
        }
        return conecta;
    }
}
