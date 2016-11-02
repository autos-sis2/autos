/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Fabiola Fernandez
 */
public class ConexionPostgres {
    
    private Connection conexion = null;
    private String password;

    public ConexionPostgres() {
        iniciarConeccion();
    }

    public void iniciarConeccion(){
        String url = "jdbc:postgresql://localhost:5432/AgenciaAutos"; /*EL NUMERO 5432 ES EL PUERTO DE POSTGRES  / (AQUI VA EL NOMBRE DE LA BASE DE DATOS)*/
        password = "postgres";  /*INTRODUCIMOS NUESTRA CONTRASEÑA DE POSTGRES*/
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,"postgres", password);
            if (conexion != null) {
                System.out.println("Conexion Realizada");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se pudo establecer la conexion");
        }
    }
}
