
package autosis;

//import List.*;
import java.util.*;
//import Clases.Articulos;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author CINTHIA FELIPE
 */
public class form extends javax.swing.JFrame{
    ArrayList lista=new ArrayList();
    DefaultTableModel dt=new DefaultTableModel();
    double pre=0;
    public form() {
        initComponents();
        tabla1.setModel(dt);
        dt.addColumn("Codigo");
        dt.addColumn("Descripcion");
        dt.addColumn("Precio");
        dt.addColumn("Cantidad");
        dt.addColumn("Total");
        FormateaGrid();
        LlenaCombo();}
    }
}
