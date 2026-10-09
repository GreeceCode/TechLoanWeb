package com.techloan.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/techloan_db?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root"; 
    private static final String PASSWORD = "123456"; 
    // admin - 123456

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos TechLoan!");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el Driver de MySQL -> " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL al conectar a la BD -> " + e.getMessage());
        }
        return conexion;
    }

}
