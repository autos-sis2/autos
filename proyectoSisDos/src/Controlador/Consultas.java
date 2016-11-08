/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionPostgres;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fabiola Fernandez
 */
public class Consultas {
    
    ConexionPostgres cp = new ConexionPostgres();
    private Connection c = cp.conexion();
    private  Statement s ; 
    private  ResultSet resp;
    public Consultas()
    {}    
    public ArrayList<String> extraerRoles() {    
        ArrayList<String> list = new ArrayList<String>(); 
        try {
            s = c.createStatement();
            resp = s.executeQuery("SELECT nombre_rol FROM ROL");
            while (resp.next()) {
                list.add(resp.getString("nombre_rol"));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
      public boolean Ingresar(String nombre, String password) {
        boolean exito = false;
        try {
            s = c.createStatement();
            resp = s.executeQuery("");
            while (resp.next()) {
                String res = resp.getString(1);
                if (res.equals("t")) {
                    exito = true;
                }
                break;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(exito);
        return exito;
    }
}
