/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Fabiola Fernandez
 */
public class Empleado {
    
    private ConexionPostgres con;
    private Connection conexion;
    
    public Empleado()
    {
      con = new ConexionPostgres();
      conexion = con.conexion();
    }
    
    public void añadir_nuevo_empleado(String nombres, String apellidos, String Sexo,String ci , int salario,int descuento,int bonos) {
        ResultSet resp;
        try {
            Statement s = conexion.createStatement();
            String sql1 = "INSERT INTO empleado(id_emp,nombre,apellidos,sexo,ci,salario,descuento,bonos) VALUES('"+2+"','"+nombres+"','"+apellidos+"','"+Sexo+"','"+ci+"','"+salario+"','"+descuento+"','"+bonos+"')";
            /*falta poner increment a los clave_primaria(distinto) para q sea manejado por la base de datos "*/
            resp = s.executeQuery(sql1);

            s.close();
            resp.close();

        } catch (Exception e) {
        }
    }
}
