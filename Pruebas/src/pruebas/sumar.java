/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author CINTHIA FELIPE
 */
public class sumar extends javax.swing.JFrame {

    private static TableModel calculaTotales(TableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form sumar
     */
    public sumar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sumar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumar().setVisible(true);
                }
        
        
        Object nombreColumnas[] = {"Auto", "Modelo", "Cantidad", "Total"};
        String datos[][]= {
            {"10.33", "2", ""},
            {"30.5", "8", ""}
        };
        
        final JTable table=new JTable(datos, nombreColumnas);
        table.setModel(calculaTotales(table.getModel()));
        
        table.getModel().addTableModelListener (new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }{
           
            public void tableChanged(TableModelEvent e){
        boolean activa = false;
        boolean active=true; 
                if(!activa && e.getType() == TableModelEvent.UPDATE){
            //boolean active = true;
            TableModel modelo=table.getModel();
            
            table.setModel(calculaTotales(modelo));
            active=false;
                }
            }
     });
        
        JFrame frame=new JFrame();
        frame.setSize(300, 100);
        frame.add(new JScrollPanel(table));
        frame.setVisible(true);
    }
    private static TableModel calculaTotales(TableModel datos){
        for(int x=0; x< datos.getRowCount(); x++){
            String valor= null;
            try{
                valor = String.valueOf((Double.valueOf((String) datos.getValueAt(x, 0))*(Integer.valueOf((String) datos.getValueAt(x, 1)))));
                }
                catch (Exception e){}
                datos.setValueAt(valor, x, 2);
        }
        return datos;
    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
