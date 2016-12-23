package catalogo;
import xp.Auto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Controlador.Consultas;
import java.util.ArrayList;
public final class Test extends JPanel{
    
    Auto [] miauto = new Auto[12];
    JPanel prueba,prueba2,contenedor;
    JLabel image1,tipo,placa,color,precio,estado,modelo,codigo,marca;
    JLabel nom_tipo,nom_placa,nom_color,nom_precio,nom_estado,nom_modelo, nom_codigo,nom_marca;
    ImageIcon mage = null;
    Consultas cp;
     ImageIcon foto ;
   public Test(){
      
       ArrayList<Auto> miauto1 = new ArrayList<Auto>(); 
       cp = new Consultas();
       miauto1 = cp.catalogo();
      
       setLayout(new BorderLayout(50,30));
       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout((miauto1.size()+1)/2,2,20,40));

        for (Auto miauto : miauto1) {
            prueba=new JPanel ();
            prueba.setLayout(new GridLayout(1,2,50,20));
            prueba2=new JPanel ();
            prueba2.setLayout(new GridLayout(8,2));
            image1=new JLabel();
            foto = new ImageIcon(miauto.getImagen());
            mage=new ImageIcon(foto.getImage().getScaledInstance(220, -1, Image.SCALE_DEFAULT));
            image1.setIcon(mage);
            
            nom_codigo = new JLabel("CODIGO");
            nom_codigo.setForeground(Color.blue);
            codigo = new JLabel(miauto.getCodigo());
            
            nom_tipo = new JLabel("TIPO");
            nom_tipo.setForeground(Color.blue);
            tipo = new JLabel(miauto.getTipo());
            
            nom_estado = new JLabel("ESTADO");
            nom_estado.setForeground(Color.blue);
            estado = new JLabel(miauto.getEstado());
            
            nom_marca = new JLabel("MARCA");
            nom_marca.setForeground(Color.blue);
            marca = new JLabel(miauto.getMarca());
            
            nom_placa = new JLabel("PLACA");
            nom_placa.setForeground(Color.blue);
            placa = new JLabel(miauto.getMatricula());
            
            nom_color = new JLabel("COLOR");
            nom_color.setForeground(Color.blue);
            color = new JLabel(miauto.getColor());
            
            nom_precio = new JLabel("PRECIO");
            nom_precio.setForeground(Color.blue);
            precio = new JLabel(miauto.getPrecio());

            nom_modelo = new JLabel("MODELO");
            nom_modelo.setForeground(Color.blue);
            modelo = new JLabel(miauto.getModelo());
            
            prueba2.add(nom_codigo);
            prueba2.add(codigo);
            prueba2.add(nom_tipo);
            prueba2.add(tipo);
            prueba2.add(nom_estado);
            prueba2.add(estado);
            prueba2.add(nom_marca);
            prueba2.add(marca);
            prueba2.add(nom_placa);
            prueba2.add(placa);
            prueba2.add(nom_color);
            prueba2.add(color);
            prueba2.add(nom_precio);
            prueba2.add(precio);
            prueba2.add(nom_modelo);
            prueba2.add(modelo);
            
            prueba.add(image1);
            prueba.add(prueba2);
            panel.add(prueba);
        }
        JScrollPane scrollPane = new JScrollPane(panel);

        add(scrollPane,BorderLayout.CENTER);
        
        
   }


}