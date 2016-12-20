/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import javax.swing.JFrame;

/**
 *
 * @author Fabiola Fernandez
 */
public class frame_ingresar extends JFrame{
    frame_ingresar(){
        setVisible(true);
        setBounds(150, 0, 1020, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        panel_ingresar pane = new panel_ingresar();
        add(pane);
    }
    
}
