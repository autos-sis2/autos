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
     Connection conn = cp.conexion();
      Statement statement ; 
     ResultSet resultSet;
       
  /*  public ArrayList<String> extraerRoles() {    
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
    }*/
    
public String correcto( String nom,String pass )
{
    String res="";
    try {
      statement = conn.createStatement();
      resultSet = statement.executeQuery("SELECT correcto('"+nom+"','"+pass+"'); ");
      while (resultSet.next())
      {
        res=resultSet.getString(1);
      }
     }
   catch (SQLException ex) {
        System.err.println( ex.getMessage() );
   }
   return res;
}
public void nueva_sesion( int id )
{
    String res="";
    try {
      statement = conn.createStatement();
      resultSet = statement.executeQuery("SELECT nuevasession('"+id+"'); ");
      while (resultSet.next())
      {
        res=resultSet.getString(1);
      }
     }
   catch (SQLException ex) {
        System.err.println( ex.getMessage() );
   }
   
}
public String certificado( )
{
    String res="";
    try {
      statement = conn.createStatement();
      resultSet = statement.executeQuery("SELECT certificados2(); ");
      while (resultSet.next())
      {
        res=resultSet.getString(1);
      }
     }
   catch (SQLException ex) {
        System.err.println( ex.getMessage() );
   }
    return res;
}
public String retorna_nombre( )
{
    String res="";
    try {
      statement = conn.createStatement();
      resultSet = statement.executeQuery("SELECT nombre_apellido(); ");
      while (resultSet.next())
      {
        res= resultSet.getString(1);
        
      }
     }
   catch (SQLException ex) {
        System.err.println( ex.getMessage() );
   }
    return res;
}
 


}
