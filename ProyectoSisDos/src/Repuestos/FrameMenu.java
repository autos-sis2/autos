
package Repuestos;

import javax.swing.JFrame;

/**
 *
 * @author Daniela
 */
public class FrameMenu extends JFrame {
    
  
  public FrameMenu()
  {
      
      MenuPanel milamina = new MenuPanel();
        add(milamina);
        setResizable(false);
        pack();
  
  }
    
}

