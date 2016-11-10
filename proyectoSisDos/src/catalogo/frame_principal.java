package catalogo;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class frame_principal extends JFrame {
    JLabel label,titulo,label1;
    JPanel panel_botones,principal,prueba=null;
    JMenuBar barra;
    JMenu inicio , ingresar;
    JMenuItem ingresar1 ,catalogo;
            
    Test mipane;
  
    public frame_principal(){
        setLayout(new BorderLayout());
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize(); 
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setBounds(150,0,1200, 800);

        setVisible(true);
        
    
        panel_botones=new JPanel();
        panel_botones.setLayout(new BorderLayout());
        
        titulo = new JLabel("CATALOGO DE VEHICULOS");
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Arial", 3, 40));
        
        label = new JLabel();
        label1 = new JLabel();
       
        barra = new JMenuBar();
        
        inicio = new JMenu("INICIO");
        catalogo = new JMenuItem("catalogo");
        inicio.add(catalogo);
        barra.add(inicio);
        
        ingresar = new JMenu("INGRESAR");
        ingresar1 = new JMenuItem("ingresar1");
        ingresar.add(ingresar1);
        barra.add(ingresar);
        
        
        panel_botones.add(titulo,BorderLayout.CENTER);
        panel_botones.add(barra,BorderLayout.SOUTH);

        principal=new JPanel();
        principal.setLayout(new BorderLayout(50,30));
        add(panel_botones,BorderLayout.NORTH);

        mipane = new Test();
        add(mipane,BorderLayout.CENTER);
        pack();
        
        ingresar1.addActionListener(new ActionListener() {

           
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                frame_principal mipane = new frame_principal();

                //frame_ingresar mipane = new frame_ingresar();
                //interfaz_regitro_vehiculo pane=new interfaz_regitro_vehiculo();

            }

        });
    }

}
