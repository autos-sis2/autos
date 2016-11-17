/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author CINTHIA FELIPE
 */
public class Fondo extends javax.swing.JPanel{
      public Fondo(){
        this.setSize(1600,1200);
    }

    @Override
    public void paintComponent(Graphics g){
        ImageIcon imagenFondo= new ImageIcon(getClass().getResource("/Imagenes/auto1.png"));
    
    g.drawImage(imagenFondo.getImage(),0,0,1600,1200, null);
    setOpaque(false);
    super.paintComponent(g);
    }
}
