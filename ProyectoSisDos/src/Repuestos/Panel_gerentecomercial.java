/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repuestos;



import Vista.Formulario;
import catalogo.interfaz_regitro_vehiculo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 *
 * @author Daniela
 */
public class Panel_gerentecomercial extends JPanel{
 ImageIcon imagen1;
     ImageIcon imagen2;
     ImageIcon imagen3;
     JButton boton1;
     JButton boton2;
     JButton boton3;
     JLabel text1;
     JLabel text2;
     JLabel text3;
     JLabel palabra; //titulo
    
public Panel_gerentecomercial()
{
   imagen1 = new ImageIcon("src/Imagenes/au.jpg");
   imagen2 = new ImageIcon("src/Imagenes/rep.jpg");
   imagen3 = new ImageIcon("src/Imagenes/emp.jpg");
   
   setLayout(null);  
   
    palabra=new JLabel("                          MENU"); 
    palabra.setBounds(0, 0, 1000,95 );          
    palabra.setFont(new Font("AR DARLING", 2, 45));
    palabra.setBackground(Color.WHITE);  
    palabra.setOpaque(true);
    
     boton1 = new JButton("AUTOS",imagen1);
     boton1.setForeground(Color.BLACK);
     boton1.setBounds(20 ,130, 350, 350);
     boton1.setContentAreaFilled(false);
     boton1.setBorderPainted(false); 
     boton1.setHorizontalTextPosition(SwingConstants.CENTER); 
     boton1.setVerticalTextPosition(SwingConstants.BOTTOM);  
     boton1.addActionListener(new ActionListener(){
           
           
           
             public void actionPerformed (ActionEvent e) {
                
                new interfaz_regitro_vehiculo();
                
            }
        
            });
                 
                boton2 = new JButton("REPUESTOS",imagen2);
                boton2.setForeground(Color. BLACK); 
                boton2.setBounds(330,130, 350, 350);
                boton2.setContentAreaFilled(false);
                boton2.setBorderPainted(false);
                boton2.setHorizontalTextPosition(SwingConstants.CENTER);
                boton2.setVerticalTextPosition(SwingConstants.BOTTOM);
               boton2.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           FrameMenu miframe  = new FrameMenu();
     miframe.setVisible(true);
        //miframe.setResizable(false);
        miframe.setBounds(500, 0, 780, 750);
        miframe.setLocationRelativeTo(null);
        miframe.setDefaultCloseOperation(miframe.DISPOSE_ON_CLOSE);
       }
   });
           
                
                add(boton1);
                add(boton2);
                
                add(palabra);
         }

  @Override
      public void paint(Graphics g) {
          
           Dimension height = getSize();
           ImageIcon Img = new ImageIcon("src/Imagenes/fondo.jpg");
           g.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
           setOpaque(false);
          super.paintComponents(g);
          
    }
       
}
