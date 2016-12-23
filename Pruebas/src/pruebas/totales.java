/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

/**
 *
 * @author CINTHIA FELIPE
 */
public class totales {
    public static void main (String[]args) throws Exception{
        Object nombreColumnas[] = {"Auto", "Modelo", "Cantidad", "Total"};
        String datos[][]= {
            {"10.33", "2", ""},
            {"30.5", "8", ""}
        };
        
        final JTable table=new JTable(datos, nombreColumnas);
        table.setModel(calculaTotales(table.getModel()));        
        table.getModel().addTableModelListener (new TableModelListener() {
    }       boolean active=false;

    private static TableModel calculaTotales(TableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void tableChanged(TableModelEvent e){
            
        
    }}
}
