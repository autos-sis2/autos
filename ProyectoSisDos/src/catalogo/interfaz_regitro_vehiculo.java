/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;
import Controlador.Consultas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author omar
 */
public class interfaz_regitro_vehiculo extends JFrame implements ActionListener{
        JLabel title , modelo  ,color , presio,  estado , marca ,tipo, imagenlabe,matricula ,year;
        JTextField modelo1,color1,presio1,matricula1 ,year1;
        JButton guardar ,verificar ,image;
        Consultas cp;
        static JComboBox estado1,tipo1,marca1;
        private JFileChooser fileChooser;
         ArrayList<String> list ,list2; 
         
         ImageIcon icon;
         String direccion;
        @SuppressWarnings("empty-statement")
        public interfaz_regitro_vehiculo(){
        setLayout(new GridLayout(1,2,10,10));
            setVisible(true);
            setBounds(300,300,700,400);
        JPanel paneregistro = new JPanel();
        //paneregistro.setBackground(Color.red);
        paneregistro.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE VEHICULO"));
        paneregistro.setLayout(new BorderLayout(10,10));
        
        JPanel paneimagen = new JPanel();
        paneimagen.setLayout(new BorderLayout(10,10));
        //paneimagen.setBackground(Color.BLUE);
        paneimagen.setBorder(javax.swing.BorderFactory.createTitledBorder("IMAGEN DE VEHICULO"));
       
        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(1,2,10,10));
        //centro.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulo"));
        
        JPanel derecho = new JPanel();
        derecho.setLayout(new GridLayout(8,1,10,10));
        //derecho.setBackground(Color.GREEN);
        
        JPanel izquierdo = new JPanel();
        izquierdo.setLayout(new GridLayout(8,1,10,10));
        //izquierdo.setBackground(Color.GRAY);
        
        JPanel botones = new JPanel();
        //botones.setBackground(Color.red);
        
        //JPanel titulo = new JPanel();
        //titulo.setBackground(Color.red);
        
        //---------------  instanciando label      ---------------
        
        title = new JLabel("REGISTRO DE VEHICULO");
        title.setFont(new Font("TimesRoman", Font.BOLD, 15));
       
        marca = new JLabel("MARCA");
        marca.setFont(new Font("TimesRoman", 2, 14));
        marca.setForeground(Color.gray);
        
        modelo = new JLabel("MODELO");
        modelo.setFont(new Font("TimesRoman", 2, 14));
        modelo.setForeground(Color.gray);
        
        
        color = new JLabel("COLOR");
        color.setFont(new Font("TimesRoman", 2, 14));
        color.setForeground(Color.gray);
        
        presio = new JLabel("PRECIO");
        presio.setFont(new Font("TimesRoman",2, 14));
        presio.setForeground(Color.gray);
        
        estado= new JLabel("ESTADO");
         estado.setFont(new Font("TimesRoman", 2, 14));
         estado.setForeground(Color.gray);
        
        matricula= new JLabel("MATRICULA");
       matricula.setFont(new Font("TimesRoman", 2, 14));
        matricula.setForeground(Color.gray);
        
       tipo= new JLabel("TIPO");
        tipo.setFont(new Font("TimesRoman", 2, 14));
      tipo.setForeground(Color.gray);
        
        year= new JLabel("YEAR");
        year.setFont(new Font("TimesRoman", 2, 14));
        year.setForeground(Color.gray);
        
        imagenlabe = new JLabel();
        
        //---------------instanciando jtextfield --------
        list = new ArrayList<String>();  
       cp = new Consultas();
       
       list=cp.extraerMarca();
       String[] lista_marca = new String[list.size()];
       lista_marca = list.toArray(lista_marca);
       
        marca1 = new JComboBox(lista_marca );
        marca1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        marca1.setFont(new Font("TimesRoman", 2, 10));
        
        modelo1 = new JTextField();
        modelo1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        modelo1.setFont(new Font("TimesRoman", 2, 10));
       
        
        color1 = new JTextField();
        color1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        color1.setFont(new Font("TimesRoman", 2, 10));
        
        presio1 = new JTextField();
        presio1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        presio1.setFont(new Font("TimesRoman", 2, 10));
        
        
       list=cp.extraerEstado();
      
       String[] lista_estado = new String[list.size()];
       lista_estado = list.toArray(lista_estado);
       
        estado1 = new JComboBox(lista_estado );
        estado1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
       estado1.setFont(new Font("TimesRoman", 2, 10));
        
        matricula1= new JTextField();
        matricula1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        matricula1.setFont(new Font("TimesRoman", 2, 10));
        
       list=cp.extraerTipo();
       String[] lista_tipo = new String[list.size()];
       lista_tipo = list.toArray(lista_tipo);
       
        tipo1 = new JComboBox(lista_tipo );
        tipo1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        tipo1.setFont(new Font("TimesRoman", 2, 10));
        
        year1 = new JTextField();
        year1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        year1.setFont(new Font("TimesRoman", 2, 10));
        
        //--------------instanciando botones *---------------------
        verificar = new JButton("verificar");
        guardar = new JButton("guardar");
        image = new JButton("anadir imagen");
        image.setActionCommand("abre");
        
        
        // ---------------------------------------------
        
        add(paneregistro);
        add(paneimagen);
        
        paneregistro.add(centro,BorderLayout.CENTER);
        
        centro.add(izquierdo);
        centro.add(derecho);
        
        //paneregistro.add(titulo,BorderLayout.NORTH);
        paneregistro.add(botones,BorderLayout.SOUTH);
        //------------anadiendo botones ----------
        botones.add(verificar);
        botones.add(guardar);
        
        paneimagen.add(image, BorderLayout.SOUTH);
        //----------anadiendo titulo
        //titulo.add(title);
        
       //---------  anadiendo labels -------
        izquierdo.add(matricula);
        izquierdo.add(modelo);
        izquierdo.add(color);
        izquierdo.add(presio);
        izquierdo.add(estado);
        izquierdo.add(marca);
        izquierdo.add(tipo);
        izquierdo.add(year);
        
        paneimagen.add(imagenlabe,BorderLayout.CENTER);
        
        //---------anadiendo JtextField -------------
        derecho.add(matricula1);
        derecho.add(modelo1);
        derecho.add(color1);
        derecho.add(presio1);
        derecho.add(estado1);
        derecho.add(marca1);
        derecho.add(tipo1);
        derecho.add(year1);
        
        
        
        
       //----------eventoss-----
    guardar.addActionListener(new ActionListener() {
              String marca ;
              String estado;
              String tipo;
              String matricula;
              String color;
              String precio;
              String year;
              String modelo;
             String imagen;
          
            @Override
            public void actionPerformed(ActionEvent ae) {
                 
                
                marca = marca1.getSelectedItem().toString();
                estado = estado1.getSelectedItem().toString();
                tipo = tipo1.getSelectedItem().toString();
                matricula= matricula1.getText();
                color= color1.getText();
                precio= presio1.getText();
               year= year1.getText();
               modelo= modelo1.getText();
               imagen=direccion;
               
                
               cp = new Consultas();
               cp.registrar_vehiculo(marca, estado, tipo, matricula, color, precio, year, modelo, imagen);
               
            }
        });
    
       image.addActionListener(this);
                
                //Creando FileChooser
                fileChooser = new JFileChooser();
                //Añadiendole un filtro
                FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
                fileChooser.setFileFilter(filter);
         
    }

    public void actionPerformed(ActionEvent e)
        {
                if("abre".equals( e.getActionCommand() ) )
                {                       
                        //Valor que tomara el fileChooser
                        int regresaValor = fileChooser.showOpenDialog(null);    
                        //Accion del fileChooser
                        if(regresaValor == JFileChooser.APPROVE_OPTION)
                        {
                                //Crear propiedades para ser utilizadas por fileChooser
                                File archivoElegido = fileChooser.getSelectedFile();
                                //Obteniendo la direccion del archivo
                                direccion = archivoElegido.getPath();
                                //Bloque try-catch para errores
                                try
                                {
                                        //Obtiene la direccion del archivo y lo instancia en icon
                                        icon = new ImageIcon( direccion );
                                    ImageIcon mage = new ImageIcon(icon.getImage().getScaledInstance(320, -1, Image.SCALE_DEFAULT));
                                        //Setea el labelImagen con el archivo obtenido
                                        imagenlabe.setIcon( mage );
                                }
                                catch(Exception es)
                                {
                                        JOptionPane.showMessageDialog(null, "Upss!! error abriendo la imagen "+ es);
                                }
                        }
                }
        }
}

