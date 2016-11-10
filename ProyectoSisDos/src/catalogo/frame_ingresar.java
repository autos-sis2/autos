
import Controlador.Consultas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omar
 */
public class frame_ingresar extends JFrame{
    JMenuBar barra;
    JMenu inicio, ingresar;
    JMenuItem  catalogo,ingresar1;
    JLabel labe_ingre , labe_usuario, labe_pass , labe_imagen;
    JTextField user;
    JPasswordField pass;
    JButton ingre;
     Consultas cp;
    int id;
    String vista,nombre;
    
    public frame_ingresar(){
        setVisible(true);
        setBounds(150, 0, 1020, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        //-------barra----------
        barra = new JMenuBar();
        barra.setBounds(0, 0, 800, 20);
        
        inicio = new JMenu("INICIO");
        catalogo = new JMenuItem("catalogo");
        inicio.add(catalogo);
        barra.add(inicio);
        
        ingresar = new JMenu("INGRESAR");
        ingresar1 = new JMenuItem("ingresar1");
        ingresar.add(ingresar1);
        barra.add(ingresar);
        add(barra);
        
        
        labe_ingre = new JLabel("INICIAR SESION");
        labe_ingre.setForeground(Color.blue);
        labe_ingre.setFont(new Font("Arial", 3, 50));
        labe_ingre.setBounds(320, 100, 400, 50);
        add(labe_ingre);
        
        ImageIcon icon = new ImageIcon("C:/Users/omar/Documents/NetBeansProjects/ejemplo/login.jpg");
        ImageIcon mage = new ImageIcon(icon.getImage().getScaledInstance(100, -1, Image.SCALE_DEFAULT));
         
        labe_imagen = new JLabel();
        labe_imagen.setIcon(mage);
        labe_imagen.setBounds(450, 200, 100, 100);
        add(labe_imagen);
        
        user = new JTextField();
        user.setBounds(375, 350, 250, 40);
        user.setFont(new Font("Arial", 3, 22));
        add(user);
        
        labe_usuario = new JLabel("nombre de usuario");
        labe_usuario.setBounds(375, 380, 250, 40);
        labe_usuario.setFont(new Font("Arial", 3, 15));
        labe_usuario.setForeground(Color.red);
        add(labe_usuario);
        
        
        
        pass = new JPasswordField();
        pass.setBounds(375, 430, 250, 40);
        pass.setFont(new Font("Arial", 3, 22));
        add(pass);
        
        labe_pass = new JLabel("contrasena");
        labe_pass.setBounds(375, 460, 250, 40);
        labe_pass.setFont(new Font("Arial", 3, 15));
        labe_pass.setForeground(Color.red);
        add(labe_pass);
        
        ingre = new JButton("INGRESAR");
        ingre.setBounds(375, 510, 250, 40);
        ingre.setFont(new Font("Arial", 3, 22));
        add(ingre);
        
       catalogo.addActionListener(new ActionListener() {

           
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                frame_principal mipane = new frame_principal();
               // interfaz_regitro_vehiculo pane=new interfaz_regitro_vehiculo();
            }

        }); 
       
       ingre.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cp = new Consultas();
                String id2 = cp.correcto(user.getText(), pass.getText());
                if(id2!=null){
                id=Integer.parseInt(id2);
                cp.nueva_sesion(id);
                vista=cp.certificado();
               
                nombre=cp.retorna_nombre();
                System.out.println(nombre);
                
                }   
                else{
                    System.out.println("contrasena o user incorrecto");
                }
            }
        });
        
    }
    
}
