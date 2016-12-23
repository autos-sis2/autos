package GUI;

import java.util.List.*;
import java.util.*;
import Clases.Articulos;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author CINTHIA FELIPE
 */
public class FrFactura extends javax.swing.JFrame {
    ArrayList lista=new ArrayList();
    DefaultTableModel dt=new DefaultTableModel();
    double pre=0;
    public FrFactura() {
        initComponents();
        
        tabla1.setModel(dt);
        dt.addColumn("Codigo");
        dt.addColumn("Descripcion");
        dt.addColumn("Precio");
        dt.addColumn("Cantidad");
        dt.addColumn("Total");
        FormateaGrid();
        LlenaCombo();
    }
    
    //para dar ancho a cada columna que por defecto es de 10 caracteres.
    void FormateaGrid(){tabla1.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabla1.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla1.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabla1.getColumnModel().getColumn(2).setPreferredWidth(80);
    }
    void LlenaCombo(){
        lista=(ArrayList) ArticulosDB.ListaArt();
        Articulos x;this.combo1.removeAllItems();for(int f=0; 
            f<lista.size();f++){
            combo1.addItem(ArticulosDB.LeerArt(f).getNomar());
            combo1.insertItemAt(ArticulosDB.LeerArt(f).getNomar(),f );
        }
    }
    
    private void btnGrabaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String factura=ArticulosDB.GeneraFac();
        this.lbfac.setText(factura);
        ArticulosDB.InsertaFactura(factura,this.lbfecha.getText());
    //insertar detalle
        String coda;
        int can;
        for(int f=0;
               f<dt.getRowCount();
               f++){coda=dt.getValueAt(f,0).toString();
               can=(Integer)(dt.getValueAt(f,3));
        }
        ArticulosDB.InsertaDeta(factura,coda,can);
    }
    JOptionPane.showMessageDialog(this,"Registro Grabado");
}
private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    this.txtcan.setText("");
    this.lbstot.setText("");
    dt.setRowCount(0);
    // coloca la tabla a cero filas
    this.txtcan.requestFocus();
}
private void formWindowOpened(java.awt.event.WindowEvent evt) { 
    // TODO add your handling code here:
    Date fecha=new Date();
    SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
    lbfecha.setText(""+sd.format(fecha));
}
private void btnBorraActionPerformed(java.awt.event.ActionEvent evt) { 
    // TODO add your handling code here:
    int nro= this.tabla1.getSelectedRow();
    if(nro==-1)return;
    dt.removeRow(nro);
    Totaliza();
}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    //agregar datos a la tabla
int can;
double tot;
int pos=this.combo1.getSelectedIndex();
String codp=ArticulosDB.LeerArt(pos).getCoda();
can=Integer.parseInt(this.txtcan.getText());
tot=can*pre;dt.addRow(new Object[]{codp,this.combo1.getSelectedItem(),pre,can,tot});
Totaliza();
}
void Totaliza(){
double sm=0;
}
for(int f=0;f<dt.getRowCount();f++){
sm += (Double)(dt.getValueAt(f,4));
}

this.lbstot.setText(""+sm);
}
private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) { 
// TODO add your handling code here:
int posicion= combo1.getSelectedIndex();
try{pre=ArticulosDB.LeerArt(posicion).getPrecio();
this.lbprecio.setText(""+pre);
}
catch(Exception ex){}
}
/*** @param args the command line arguments*/ 
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new FrFactura().setVisible(true);
}
});
}