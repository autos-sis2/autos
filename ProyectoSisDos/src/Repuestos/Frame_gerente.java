/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repuestos;


import javax.swing.JFrame;

/**
 *
 * @author Daniela
 */
public class Frame_gerente extends JFrame {
  public Frame_gerente()
 {
        Panel_gerentecomercial milamina = new Panel_gerentecomercial();
        add(milamina);
         setResizable(false); 
         //setLocationRelativeTo(null);
         setSize(500, 500);
         setVisible(true);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }  
}