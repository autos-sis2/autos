package catalogo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class Test extends JPanel{
    
    Auto [] miauto = new Auto[12];
    JPanel prueba,prueba2,contenedor;
    JLabel image1,tipo,placa,color,precio,estado,modelo;
    JLabel nom_tipo,nom_placa,nom_color,nom_precio,nom_estado,nom_modelo;
    ImageIcon mage = null;

   public Test(){
       
       
       llenar_vec();
       setLayout(new BorderLayout(50,30));
       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,2,20,40));

        for (Auto miauto1 : miauto) {
            prueba=new JPanel ();
            prueba.setLayout(new GridLayout(1,2,50,20));
            prueba2=new JPanel ();
            prueba2.setLayout(new GridLayout(6,2));
            image1=new JLabel();
           // image1.setIcon(new ImageIcon("auto.jpg"));
            mage=new ImageIcon(miauto1.getImagen().getImage().getScaledInstance(220, -1, Image.SCALE_DEFAULT));
            image1.setIcon(mage);
            
            nom_tipo = new JLabel("TIPO");
            tipo = new JLabel(miauto1.getTipo());
            
            nom_placa = new JLabel("PLACA");
            placa = new JLabel(miauto1.getMatricula());
            
            nom_color = new JLabel("COLOR");
            color = new JLabel(miauto1.getColor());
            
            nom_precio = new JLabel("PRECIO");
            precio = new JLabel(miauto1.getPrecio());
            
            nom_estado = new JLabel("ESTADO");
            estado = new JLabel(miauto1.getEstado());
            
            nom_modelo = new JLabel("MODELO");
            modelo = new JLabel(miauto1.getModelo());
            
            prueba2.add(nom_tipo);
            prueba2.add(tipo);
            prueba2.add(nom_placa);
            prueba2.add(placa);
            prueba2.add(nom_color);
            prueba2.add(color);
            prueba2.add(nom_precio);
            prueba2.add(precio);
            prueba2.add(nom_estado);
            prueba2.add(estado);
            prueba2.add(nom_modelo);
            prueba2.add(modelo);
            
            prueba.add(image1);
            prueba.add(prueba2);
            panel.add(prueba);
        }
        JScrollPane scrollPane = new JScrollPane(panel);

        add(scrollPane,BorderLayout.CENTER);
        
        
   }

       public void llenar_vec(){
       
       
       ImageIcon icon = new ImageIcon("C:/Users/omar/Documents/NetBeansProjects/ejemplo/auto.jpg");
       ImageIcon icon2 = new ImageIcon("C:/Users/omar/Documents/NetBeansProjects/ejemplo/auto2.jpg");
       ImageIcon icon3 = new ImageIcon("C:/Users/omar/Documents/NetBeansProjects/ejemplo/auto3.jpg");
  
       miauto[0] = new Auto("120","EX-CON","ROJO","500.000.000$","NUEVO","1234-KBO",icon);
       miauto[1] = new Auto("121","EX-CON2","VERDE","500.000.000$","NUEVO","1234-KBO",icon2);
       miauto[2] = new Auto("122","EX-CON3","AZUL","500.000.000$","NUEVO","1234-KBO",icon3);
       miauto[3] = new Auto("123","EX-CON4","PLOMO","500.000.000$","NUEVO","1234-KBO",icon);
       miauto[4] = new Auto("123","EX-CON4","PLOMO","500.000.000$","NUEVO","1234-KBO",icon2);
       miauto[5] = new Auto("123","EX-CON4","PLOMO","500.000.000$","NUEVO","1234-KBO",icon3);
      miauto[6] = new Auto("120","EX-CON","ROJO","500.000.000$","NUEVO","1234-KBO",icon);
       miauto[7] = new Auto("121","EX-CON2","VERDE","500.000.000$","NUEVO","1234-KBO",icon2);
       miauto[8] = new Auto("122","EX-CON3","AZUL","500.000.000$","NUEVO","1234-KBO",icon3);
       miauto[9] = new Auto("123","EX-CON4","PLOMO","500.000.000$","NUEVO","1234-KBO",icon);
       miauto[10] = new Auto("122","EX-CON3","AZUL","500.000.000$","NUEVO","1234-KBO",icon2);
       miauto[11] = new Auto("123","EX-CON4","PLOMO","500.000.000$","NUEVO","1234-KBO",icon3);
       
   }
}