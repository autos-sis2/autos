/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fabiola Fernandez
 */
public class Pruebadeconexion {
    
    public static void main(String []args)
    {
      //ConexionPostgres cn = new  ConexionPostgres(); 
       Empleado e = new Empleado(); 
       e.añadir_nuevo_empleado("carlita","chavez","F", "7633", 45, 3, 1);
    }
}
