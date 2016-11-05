/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Fabiola Fernandez
 */
public class actualizar_vehiculo extends JFrame implements ActionListener{
        JLabel title , modelo , color , presio,  capacidad , marca , imagenlabe,codigo,numpuerta ,year;
        JTextField modelo1,color1,presio1,capacidad1,marca1 , codigo1,numpuerta1 ,year1;
        JButton guardar ,verificar;
       
        private String[] datos = new String[9];
        
        
    
    public actualizar_vehiculo(String informacion){
        datos = informacion.split(";");
        
        setLayout(new GridLayout(1,2,10,10));
        
        JPanel paneregistro = new JPanel();
        //paneregistro.setBackground(Color.red);
        paneregistro.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE VEHICULO"));
        paneregistro.setLayout(new BorderLayout(5,5));
        
       
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
        
        capacidad= new JLabel("CAPACIDAD");
        capacidad.setFont(new Font("TimesRoman", 2, 14));
        capacidad.setForeground(Color.gray);
        
        codigo = new JLabel("CODIGO");
        codigo.setFont(new Font("TimesRoman", 2, 14));
        codigo.setForeground(Color.gray);
        
        numpuerta= new JLabel("NRO. PUERTAS");
        numpuerta.setFont(new Font("TimesRoman", 2, 14));
        numpuerta.setForeground(Color.gray);
        
        year= new JLabel("AÑO");
        year.setFont(new Font("TimesRoman", 2, 14));
        year.setForeground(Color.gray);
        
        imagenlabe = new JLabel("imagen");
        
        //---------------instanciando jtextfield --------
       
        marca1 = new JTextField();
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
        
        capacidad1 = new JTextField();
        capacidad1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        capacidad1.setFont(new Font("TimesRoman", 2, 10));
        
        codigo1= new JTextField();
        codigo1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        codigo1.setFont(new Font("TimesRoman", 2, 10));
        
        numpuerta1 = new JTextField();
        numpuerta1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        numpuerta1.setFont(new Font("TimesRoman", 2, 10));
        
        year1 = new JTextField();
        year1.setBorder(BorderFactory.createMatteBorder(1,5,5,1,Color.gray));
        year1.setFont(new Font("TimesRoman", 2, 10));
        
        //--------------instanciando botones *---------------------
        verificar = new JButton("verificar");
        guardar = new JButton("guardar");

        add(paneregistro);
       
        
        paneregistro.add(centro,BorderLayout.CENTER);
        
        centro.add(izquierdo);
        centro.add(derecho);
        
        //paneregistro.add(titulo,BorderLayout.NORTH);
        paneregistro.add(botones,BorderLayout.SOUTH);
        //------------anadiendo botones ----------
        botones.add(verificar);
        botones.add(guardar);
        
        //----------anadiendo titulo
        //titulo.add(title);
        
       //---------  anadiendo labels -------
        izquierdo.add(marca);
        izquierdo.add(modelo);
        izquierdo.add(color);
        izquierdo.add(presio);
        izquierdo.add(capacidad);
        izquierdo.add(codigo);
        izquierdo.add(numpuerta);
        izquierdo.add(year);
        
        
        //---------anadiendo JtextField -------------
        derecho.add(marca1);
        derecho.add(modelo1);
        derecho.add(color1);
        derecho.add(presio1);
        derecho.add(capacidad1);
        derecho.add(codigo1);
        derecho.add(numpuerta1);
        derecho.add(year1);
            
        ordenar_datos();
        
    }
    
    public void ordenar_datos()
    {
        marca1.setText(datos[0]);
        modelo1.setText(datos[1]);
        color1.setText(datos[2]); 
        presio1.setText(datos[3]);
        capacidad1.setText(datos[4]);
        codigo1.setText(datos[5]);
        numpuerta1.setText(datos[6]);
        year1.setText(datos[7]);
       
    }
  
    public void actionPerformed(ActionEvent e)
    {
    
    }
}

