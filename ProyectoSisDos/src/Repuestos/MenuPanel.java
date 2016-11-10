package Repuestos;

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
public class MenuPanel  extends JPanel{
    
   private JButton opcion1;
    private JButton opcion2;
    private JButton opcion3;
    private JButton opcion4;
    private JButton botonatras;
    private JLabel titulo;
    private ImageIcon imagen1;
    private ImageIcon imagen2;
   private  ImageIcon imagen3;
    private ImageIcon imagen4;
    private ImageIcon imagen5;        
  
    
   
    
    public  MenuPanel(){
       
        imagen1 = new ImageIcon("src/Imagenes/anadir.jpg");
        imagen2 = new ImageIcon("src/Imagenes/modificar.jpg");
        imagen3 = new ImageIcon("src/Imagenes/Eliminar.jpg");
        imagen4 = new ImageIcon("src/Imagenes/buscar.jpg");
        imagen5 = new ImageIcon("src/Imagenes/atras.jpg");
        
         setLayout(null);
         setBackground(Color.red);
         titulo=new JLabel("                                       REPUESTOS");

         titulo.setBounds(0, 0, 999,75);        
         titulo.setFont(new Font("Comic Sans MS", 0, 25));
         titulo.setBackground(Color.WHITE);  
         titulo.setOpaque(true);
         
          opcion1 = new JButton("AGREGAR",imagen1);
          opcion1.setFont(new Font("Comic Sans MS", 3, 18));    
          opcion1.setForeground(Color.BLACK);
          opcion1.setBounds(60 ,150, 250, 250);
          opcion1.setContentAreaFilled(false);
          opcion1.setBorderPainted(false); 
          opcion1.setHorizontalTextPosition(SwingConstants.CENTER); 
          opcion1.setVerticalTextPosition(SwingConstants.BOTTOM); 
          opcion1.addActionListener(new ActionListener() {

       public void actionPerformed (ActionEvent e) {
           
           AgregarRepuesto miframe=new AgregarRepuesto();
           miframe.setVisible(true);
           //this.dispose();
         }
        
        });
            add(opcion1);
           
          opcion2 = new JButton("MODIFICAR",imagen2);
          opcion2.setFont(new Font("Comic Sans MS", 3, 18));
          opcion2.setForeground(Color.BLACK);
          opcion2.setBounds(400 ,150, 250, 250);
           
          opcion2.setContentAreaFilled(false);
          opcion2.setBorderPainted(false); 
          opcion2.setHorizontalTextPosition(SwingConstants.CENTER); 
          opcion2.setVerticalTextPosition(SwingConstants.BOTTOM);
          opcion2.addActionListener(new ActionListener() {

            public void actionPerformed (ActionEvent e) {
             ModificarDatosRepuesto miframe=new ModificarDatosRepuesto();
             miframe.setVisible(true);
              //miframe.dispose();
                
            }
        
            });
          add(opcion2);
         
          
           
          
          opcion3 = new JButton("ELIMINAR",imagen3);
          opcion3.setFont(new Font("Comic Sans MS", 3, 18));
          opcion3.setForeground(Color.BLACK);
          opcion3.setBounds(60 ,420,250,250);
          opcion3.setContentAreaFilled(false);
          opcion3.setBorderPainted(false); 
          opcion3.setHorizontalTextPosition(SwingConstants.CENTER); 
          opcion3.setVerticalTextPosition(SwingConstants.BOTTOM); 
          opcion3.addActionListener(new ActionListener() {

          public void actionPerformed (ActionEvent e) {
                EliminarRepuesto miframe =new EliminarRepuesto();
                miframe.setVisible(true);
               //miframe.dispose();
                
            }
        
            });
         add(opcion3);
          
          
           
           
          opcion4 = new JButton("CONSULTAS",imagen4);
          opcion4.setFont(new Font("Comic Sans MS", 3, 18));
          opcion4.setForeground(Color.BLACK);
          opcion4.setBounds(400,420,250,250);
          opcion4.setContentAreaFilled(false);
          opcion4.setBorderPainted(false); 
          opcion4.setHorizontalTextPosition(SwingConstants.CENTER); 
          opcion4.setVerticalTextPosition(SwingConstants.BOTTOM);  
          opcion4.addActionListener(new ActionListener() {
        public void actionPerformed (ActionEvent e) {
               ConsultarRepuesto miframe=new ConsultarRepuesto();
               miframe.setVisible(true);
              // miframe.dispose();
                
            }
        
            });
         add(opcion4);
                  
                  
          
          
          
         botonatras = new JButton(imagen5);    
         botonatras.setForeground(Color.WHITE);
         botonatras.setBounds(10,0,100,100);
         botonatras.setContentAreaFilled(false);
         botonatras.setBorderPainted(false);
          botonatras.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                      // frame del anterior q este
                        //milamina.dispose();
                    }
                });
    
      
        add(botonatras);
        add(titulo);
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
