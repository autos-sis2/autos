
package Menu;

import javax.swing.JFrame;

/**
 *
 * @author Daniela
 */
public class FrameMenuPrincipal extends JFrame {
  public FrameMenuPrincipal()
 {
        registrorepuesto.PanelMenu milamina = new registrorepuesto.PanelMenu();
        add(milamina);
         setResizable(false); 
         setLocationRelativeTo(null); 
         setVisible(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
 }  
}
