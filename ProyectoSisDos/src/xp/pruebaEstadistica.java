/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xp;

import java.io.BufferedWriter;
import java.io.IOException;
import xp.estadistica;
import java.util.ArrayList;
import xp.Auto;

/**
 *
 * @author CINTHIA FELIPE
 */
public class pruebaEstadistica extends javax.swing.JFrame {

    ArrayList<estadistica> listaObjetosEstadisticos=new ArrayList<estadistica>();
    ArrayList<Auto> listaAutoOrdenado=new ArrayList<Auto>();
    ArrayList<Auto> listaAuto=new ArrayList<Auto>();
    public pruebaEstadistica() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaEst = new javax.swing.JTable();
        BtnMostrarEst = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Medida", "CantAutos Vendidos", "Procentaje", "Empresa", "CantAutos", "Porcentaje"
            }
        ));
        jScrollPane3.setViewportView(TablaEst);

        BtnMostrarEst.setText("Mostrar Est");
        BtnMostrarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEstActionPerformed(evt);
            }
        });

        jLabel1.setText("ESTADISTICAS");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrarEst))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jButton1)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(BtnMostrarEst)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMostrarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEstActionPerformed

        //listaVueloOrdenado
        //listaObjetosEstadisticos
        int cantAutosVendidos=0;
        int cantAuto=0;
        int cantAuto1=0;
        int cantAuto2=0;
        int cantAuto3=0;
        int cantKm1=0;
        int cantKm2=0;
        int cantKm3=0;

        for (int i = 0; i < listaAutoOrdenado.size(); i++) {
            cantAutosVendidos++;
        }
        //obteniendo la cantidad de aviones
        for (int i = 0; i < listaAuto.size(); i++) {
            cantAuto++;
        }

        //obteniendo la cantidad de AvionesBoa

        for (int i = 0; i < listaAuto.size(); i++) {
            if(listaAuto.get(i).getCodControl().equals("auto11"))
            { cantAuto1++;
            }
        }

        for (int i = 0; i < listaAuto.size(); i++) {
            if(listaAuto.get(i).getCodControl().equals("auto22"))
            {cantAuto2++;
            }
        }
        for (int i = 0; i < listaAuto.size(); i++) {
            if(listaAuto.get(i).getCodControl().equals("auto33"))
            {cantAuto3++;
            }
        }
        for (int i = 0; i < listaAutoOrdenado.size(); i++) {
            if(listaAutoOrdenado.get(i).getEstado().equals("disponble"))
            {    
            }
        }

        for (int i = 0; i < listaAutoOrdenado.size(); i++) {
            if(listaAutoOrdenado.get(i).getEstado().equals("reservado"))
            {    
            }
        }
        for (int i = 0; i < listaAutoOrdenado.size(); i++) {
            if(listaAutoOrdenado.get(i).getEstado().equals("vendido"))
            {    
            }
        }

        System.out.print(cantAuto1);

        System.out.print(cantAuto2);
        System.out.print(cantAuto3);
        System.out.print(cantAuto);

        Double PorcentajeAltura;
        Double PorcentajeCodigo;

        PorcentajeAltura=Double.valueOf((cantKm1*100)/cantAutosVendidos);
        PorcentajeCodigo=Double.valueOf((cantAuto1*100)/cantAuto);

        estadistica s=new estadistica("3000",cantKm1,String.valueOf(PorcentajeAltura),
            "Auto1" ,cantAuto1,String.valueOf(PorcentajeCodigo));
        listaObjetosEstadisticos.add(s);

        PorcentajeAltura=Double.valueOf((cantKm2*100)/cantAutosVendidos);
        PorcentajeCodigo=Double.valueOf((cantAuto2*100)/cantAuto);

        estadistica s2=new estadistica("6000",cantKm2,String.valueOf(PorcentajeAltura),
            "Auto2" ,cantAuto2,String.valueOf(PorcentajeCodigo));
        listaObjetosEstadisticos.add(s2);

        PorcentajeAltura=Double.valueOf((cantKm3*100)/cantAutosVendidos);
        PorcentajeCodigo=Double.valueOf((cantAuto3*100)/cantAuto);

        estadistica s3=new estadistica("9000",cantKm3,String.valueOf(PorcentajeAltura),
            "Auto3" ,cantAuto3,String.valueOf(PorcentajeCodigo));
        listaObjetosEstadisticos.add(s3);

        for (int i = 0; i < listaObjetosEstadisticos.size(); i++) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }

        Object matris2[][]=new Object[listaObjetosEstadisticos.size()][6];
        for(int i=0;i<listaObjetosEstadisticos.size();i++){

            matris2[i][0]= listaObjetosEstadisticos.get(i).getMedida();
            matris2[i][1]= listaObjetosEstadisticos.get(i).getCant();
            matris2[i][2]= listaObjetosEstadisticos.get(i).getPorcentaje1();
            matris2[i][3]= listaObjetosEstadisticos.get(i).getCodigoControl();
            matris2[i][4]= listaObjetosEstadisticos.get(i).getCant2();
            matris2[i][5]= listaObjetosEstadisticos.get(i).getPorcentaje2();

        }

        TablaEst.setModel(new javax.swing.table.DefaultTableModel(
            matris2,
            new String [] {
                "Medida", "CantAutosVendidos", "Procentaje", "Empresa", "CantAutos", "Porcentaje"
            }
        ));
        jScrollPane3.setViewportView(TablaEst);

    }//GEN-LAST:event_BtnMostrarEstActionPerformed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped

    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(pruebaEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pruebaEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pruebaEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pruebaEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pruebaEstadistica().setVisible(true);
                Auto auto=new Auto();
                //auto.unMetodoAuto();
            }
        });
    }
    public void escribeFichero(BufferedWriter bw) throws IOException{
      
        
       for(int i=0;i<listaAuto.size();i++)
       {
        bw.write("-----------------------------------------");
        bw.newLine();
        bw.write(listaAuto.get(i).getCodigo());
        bw.newLine();
        bw.write(listaAuto.get(i).getMarca());
        bw.newLine();
        bw.write(listaAuto.get(i).getTipo());
        bw.newLine();
        bw.write(listaAuto.get(i).getEstado());
        bw.newLine();  
        bw.write(listaAuto.get(i).getMatricula());
        bw.newLine();
        bw.write(listaAuto.get(i).getColor());
        bw.newLine();
        bw.write(listaAuto.get(i).getPrecio());
        bw.newLine();
        bw.write(listaAuto.get(i).getYear());
        bw.newLine();
        bw.write(listaAuto.get(i).getModelo());
        bw.newLine();
        bw.write(listaAuto.get(i).getImagen());
        bw.newLine();
        }
       
      
    }
    
     public void leeFicheroAuto(BufferedWriter bw) throws IOException{
      
        
       for(int i=0;i<listaAuto.size();i++)
       {
        bw.write("-----------------------------------------");
        bw.newLine();
        bw.write(listaAuto.get(i).getNroPlaca());
        bw.newLine();
        bw.write(listaAuto.get(i).getRecorrido());
        bw.newLine();
        bw.write(listaAuto.get(i).getvelocidad());
        bw.newLine();
        bw.write(listaAuto.get(i).getmodelo());
        bw.newLine();
         bw.write(listaAuto.get(i).getcolor());
        bw.newLine();
        bw.write(listaAuto.get(i).getCantGasolina());
        bw.newLine();  
        bw.write(listaAuto.get(i).getNroPasajeros());
        bw.newLine();
        bw.write(listaAuto.get(i).getOrigen());
        bw.newLine();
        bw.write(listaAuto.get(i).getDestino());
        bw.newLine();
        bw.write(listaAuto.get(i).getCodControl());
        bw.newLine();
        }
       
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrarEst;
    private javax.swing.JTable TablaEst;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
