package catalogo;

import Controlador.Consultas;
import Repuestos.FrameMenuPrincipal;
import Repuestos.Frame_gerente;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;



public class panel_ingresar extends JPanel {

    JMenuBar barra;
    JMenu inicio, ingresar;
    JMenuItem catalogo, ingresar1;
    JLabel labe_ingre, labe_usuario, labe_pass, labe_imagen;
    JTextField user;
    JPasswordField pass;
    JButton ingre;
    Consultas cp;
    int id;
    String vista, nombre;

    public panel_ingresar() {
        
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
        labe_ingre.setForeground(Color.WHITE);
        labe_ingre.setFont(new Font("Arial", 3, 50));
        labe_ingre.setBounds(320, 100, 400, 50);
        add(labe_ingre);

        ImageIcon icon = new ImageIcon("src/Imagenes/login.jpg");
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
                
                 new frame_principal();

            }

        });

        ingre.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                cp = new Consultas();
                String id2 = cp.correcto(user.getText(), pass.getText());
                if (id2 != null) {
                    id = Integer.parseInt(id2);
                    cp.nueva_sesion(id);
                    vista = cp.certificado();

                    nombre = cp.retorna_nombre();
                    System.out.println(vista);

                    if (vista.equals("1")) {

                        FrameMenuPrincipal menup = new FrameMenuPrincipal();
                        menup.setVisible(true);
                        menup.setResizable(false);
                        menup.setBounds(250, 0, 1000, 600);
                    } else if (vista.equals("2")) {
                        Frame_gerente miframe = new Frame_gerente();
                        miframe.setVisible(true);
                        //miframe.setResizable(false);
                        miframe.setBounds(500, 0, 780, 550);
                        miframe.setLocationRelativeTo(null);
                        miframe.setDefaultCloseOperation(miframe.DISPOSE_ON_CLOSE);
                    }
                } else {
                    System.out.println("contrasena o user incorrecto");
                }
            }
        }
        );

    }
    
       @Override
      public void paint(Graphics g) {
          
           Dimension height = getSize();
           ImageIcon Img = new ImageIcon("src/Imagenes/images.jpg");
           g.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
           setOpaque(false);
            super.paintComponents(g);
          
    }
}
