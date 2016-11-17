/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionPostgres;
import catalogo.Auto;
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

}
