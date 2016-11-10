
package Modelo;

import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Fabiola Fernandez
 */
public class ManageBD {
    
    private ConexionPostgres con;
    private Connection conexion;
    private ResultSet resp;
    private Statement s;
    
    public ManageBD()
    {
      con = new ConexionPostgres();
      conexion = con.conexion();
    }
    
    public void añadir_nuevo_empleado(String nombres, String apellidos, String Sexo,String correo ,String ci, Date fecha,String cargo,int salario,String direccion){
        try {
            s = conexion.createStatement();
            String sql1 = "INSERT INTO empleado(nombre,apellidos,sexo,correo,ci,fecha_ingreso,cargo,salario,direccion) VALUES('"+nombres+"','"+apellidos+"','"+Sexo+"','"+correo+"','"+ci+"','"+fecha+"','"+cargo+"','"+salario+"','"+direccion+"')";
            resp = s.executeQuery(sql1);

            s.close();
            resp.close();

        } catch (Exception e) {
        }
    }
    
     public void actualizar_empleado(String nombres, String apellidos, String Sexo,String correo ,String ci, Date fecha,String cargo,int salario,String direccion){
        try {
            s = conexion.createStatement();
            String sql1 = "ALTER TABLE empleado(nombre,apellidos,sexo,correo,ci,fecha_ingreso,cargo,salario,direccion) VALUES('"+nombres+"','"+apellidos+"','"+Sexo+"','"+correo+"','"+ci+"','"+fecha+"','"+cargo+"','"+salario+"','"+direccion+"')";
            resp = s.executeQuery(sql1);

            s.close();
            resp.close();
        } catch (Exception e) {
        }
    }
     
      public void eliminar_empleado(){
        try {
            s = conexion.createStatement();
            String sql1 = "";
            resp = s.executeQuery(sql1);

            s.close();
            resp.close();
        } catch (Exception e) {
        }
    }
      
    
    public void añadir_repuesto(String codigo , int tipo_rep , String costo ,String nombre ,String modelo)
    {
         Integer codigo1 = Integer.valueOf(codigo);
         try {
            s = conexion.createStatement();     
            String sql1 = "INSERT INTO repuesto_automovil(id_repauto,id_tiporepuesto,nombre_rep,modelo,precio) VALUES('"+codigo1+"','"+tipo_rep+"','"+nombre+"','"+modelo+"','"+costo+"')";
            resp = s.executeQuery(sql1);
        } catch (Exception e){}
    }
}
