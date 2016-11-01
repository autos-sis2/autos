/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

import javax.swing.JFrame;

/**
 *
 * @author omar
 */
public class Sistema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interfaz_regitro_vehiculo frame1 = new interfaz_regitro_vehiculo();
        frame1.setBounds(100, 100, 600, 400);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
