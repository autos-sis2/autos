package catalogo;


import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author omar
 */
public class panel_sesion extends   JPanel{
    JLabel label1,labe2,label3,label4,label5,nombre,password;
    JTextField text_nom,text_pass;
    public panel_sesion() {
        setLayout(new GridLayout(3,3));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        
        text_nom = new JTextField();
        text_pass = new JTextField();
        
        nombre = new JLabel("usuario");
        password = new JLabel("password");
        
        panel.add(nombre);
        panel.add(text_nom);
        panel.add(password);
        panel.add(text_pass);
        
        add(panel);
    }
    
}
