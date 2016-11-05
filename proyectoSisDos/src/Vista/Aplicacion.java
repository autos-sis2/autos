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
        
        //eliminar_vehiculo ev = new eliminar_vehiculo();
         //ev.setVisible(true);
       
    }
}
