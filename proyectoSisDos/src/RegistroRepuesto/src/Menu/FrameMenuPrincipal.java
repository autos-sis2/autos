
package RegistroRepuesto.src.Menu;

import javax.swing.JFrame;

/**
 *
 * @author Daniela
 */
public class FrameMenuPrincipal extends JFrame {
  public FrameMenuPrincipal()
 {
        PanelMenu milamina = new PanelMenu();
        add(milamina);
         setResizable(false); 
         setLocationRelativeTo(null); 
         setVisible(true);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 }  
}
