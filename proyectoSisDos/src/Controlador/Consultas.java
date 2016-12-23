/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionPostgres;
import xp.Auto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Fabiola Fernandez
 */
public class Consultas{

    ConexionPostgres cp = new ConexionPostgres();
    Connection conn = cp.conexion();
    Statement statement;
    ResultSet resultSet;

    public ArrayList<String> extraerEstado() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nombre_estado FROM estado_automovil;");
            while (resultSet.next()) {
                list.add(resultSet.getString("nombre_estado"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<String> extraerMarca() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nombre_marca FROM marca;");
            while (resultSet.next()) {
                list.add(resultSet.getString("nombre_marca"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<String> extraerTipo() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nombre_tipo FROM tipo_auto;");
            while (resultSet.next()) {
                list.add(resultSet.getString("nombre_tipo"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<String> extraer_tipo_repuesto() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nombre_repuesto \n"
                    + "FROM \"tipo_repuestoauto\";");
            while (resultSet.next()) {
                list.add(resultSet.getString("nombre_repuesto"));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public String correcto(String nom, String pass) {
        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT correcto('" + nom + "','" + pass + "'); ");
            while (resultSet.next()) {
                res = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return res;
    }

    public void nueva_sesion(int id) {
        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nuevasession('" + id + "'); ");
            while (resultSet.next()) {
                res = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public String certificado() {
        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT certificados2(); ");
            while (resultSet.next()) {
                res = resultSet.getString(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return res;
    }

    public String retorna_nombre() {
        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT nombre_apellido(); ");
            while (resultSet.next()) {
                res = resultSet.getString(1);

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return res;
    }

    public void registrar_vehiculo(String marca, String estado, String tipo, String matri, String color, String precio, String year, String modelo, String imagen) {

        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT guardar_vehiculo2('" + marca + "','" + estado + "','" + tipo + "','" + matri + "','" + color + "','" + precio + "','" + year + "','" + modelo + "','" + imagen + "'); ");
            while (resultSet.next()) {
                res = resultSet.getString(1);

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public ArrayList<Auto> catalogo() {
        ArrayList<Auto> list = new ArrayList<Auto>();

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT id_auto , matricula,color,precio,year,modelo,imagen,nombre_marca,nombre_tipo,nombre_estado  FROM automovil a,marca,tipo_auto,estado_automovil WHERE a.id_marca=marca.id_marca and a.id_tipoauto=tipo_auto.id_tipoauto and a.id_estado=estado_automovil.id_estado;");
            while (resultSet.next()) {

                list.add(new Auto(resultSet.getString("id_auto"), resultSet.getString("nombre_marca"), resultSet.getString("nombre_estado"), resultSet.getString("nombre_tipo"), resultSet.getString("matricula"), resultSet.getString("color"), resultSet.getString("precio"), resultSet.getString("year"), resultSet.getString("modelo"), resultSet.getString("imagen")));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public int id_tipoRepuestoAuto(String nombre) {
        int res = 0;

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select id_tiporepuesto\n"
                    + "from tipo_repuestoauto\n"
                    + "where nombre_repuesto = '" + nombre + "';");
            while (resultSet.next()) {
                res = resultSet.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return res;
    }

    public String datos_repuesto(int id) {
        String res = "";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select *\n"
                    + "from repuesto_automovil\n"
                    + "where id_repauto = '" + id + "'");
            while (resultSet.next()) {
                res = resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4) + " " + resultSet.getString(5);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return res;
    }
    public void añadir_nuevo_empleado(String nombres, String apellidos, String Sexo, String correo, String ci, String fecha_nacimiento,String fecha_ingreso, String cargo, int salario, String direccion) {
        try {
            statement = conn.createStatement();
            String sql1 = " INSERT INTO empleado(nombre,apellidos,sexo,correo,ci,fecha_nacimiento,fecha_ingreso,cargo,salario,direccion) VALUES"
                    + "('"+nombres+"','"+apellidos+"','"+Sexo+" ','"+correo+" ','"+ci+"','"+fecha_nacimiento+"','"+fecha_ingreso+"','"+cargo+"','"+salario+"','"+direccion+"')";
            resultSet = statement.executeQuery(sql1);
            statement.close();
            resultSet.close();

        } catch (Exception e) {
        }
    }

    public void actualizar_empleado(String nombres, String apellidos, String Sexo, String correo, String ci, String fecha_nacimiento,String fecha_ingreso, String cargo, int salario, String direccion) {
        try {
            statement = conn.createStatement();
            String sql1 = "ALTER TABLE empleado(nombre,apellidos,sexo,correo,ci,fecha_nacimiento,fecha_ingreso,cargo,salario,direccion) VALUES"
                    + "('"+nombres+"','"+apellidos+"','"+Sexo+" ','"+correo+" ','"+ci+"','"+fecha_nacimiento+"','"+fecha_ingreso+"','"+cargo+"','"+salario+"','"+direccion+"')";
            resultSet = statement.executeQuery(sql1);

            statement.close();
            resultSet.close();
        } catch (Exception e) {
        }
    }

    public void eliminar_empleado(Integer id_empleado) {
        try {
            statement= conn.createStatement();
            String sql1 ="";
           resultSet = statement.executeQuery(sql1);
            statement.close();
            resultSet.close();
        } catch (Exception e){
        }
    }
    
    public Object[][] lista_empleado()
    {   
        int registros = 0;
        String consulta = "select *\n" + "from \"empleado\"  ";
        String consulta2 = "Select count(*) as total from \"empleado\"";

        try {
            PreparedStatement pstm = conn.prepareStatement(consulta2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e){
            System.out.println(e);
        }

        Object[][] data = new String[registros][8];

        try {
            PreparedStatement pstm = conn.prepareStatement(consulta);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                data[i][5] = res.getString(6);
                data[i][6] = res.getString(7);
                data[i][7] = res.getString(8);
                data[i][8] = res.getString(9);
                data[i][9] = res.getString(10);
                data[i][0] = res.getString(11);
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
    

    public void añadir_repuesto(String codigo, int tipo_rep, String costo, String nombre, String modelo) {
        Integer codigo1 = Integer.valueOf(codigo);
        try {
            statement = conn.createStatement();
            String sql1 = "INSERT INTO repuesto_automovil(id_repauto,id_tiporepuesto,nombre_rep,modelo,precio) VALUES('" + codigo1 + "','" + tipo_rep + "','" + nombre + "','" + modelo + "','" + costo + "')";
            resultSet = statement.executeQuery(sql1);
        } catch (Exception e) {
        }
    }

    public void update_rep(String codigo, int tipo_rep, String costo, String nombre, String modelo) {
        try {
            statement = conn.createStatement();
            String sql1 = "UPDATE repuesto_automovil SET id_tiporepuesto = '" + tipo_rep + "' , nombre_rep = '" + nombre + "',modelo = '" + modelo + "',precio ='" + costo + "'\n"
                    + "WHERE id_repauto = '" + Integer.valueOf(codigo) + "'";
            resultSet = statement.executeQuery(sql1);
        } catch (Exception e) {
        }
    }

    public void eliminar_rep(String id_rep) {
        Integer codigo1 = Integer.valueOf(id_rep);
        try {
            statement = conn.createStatement();
            String sql1 = "DELETE FROM repuesto_automovil\n"
                    + "WHERE id_repauto = '" + codigo1 + "'";
           resultSet = statement.executeQuery(sql1);
        } catch (Exception e) {
        }
    }

}
