/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;

/**
 *
 * @author Fabiola Fernandez
 */
public class Aplicacion { /*CAMBIO EN EL NOMBRE */
     public static void main(String[] args) {
        interfaz_regitro_vehiculo frame1 = new interfaz_regitro_vehiculo();
        frame1.setBounds(100, 100, 500, 400);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        eliminar_vehiculo ev = new eliminar_vehiculo();
        ev.setVisible(true);
         
         actualizar_vehiculo av = new actualizar_vehiculo("coo;no;po;ar;con;vosi;ro;sip");
         av.setBounds(100, 200, 280, 400);
         av.setVisible(true);
         av.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
