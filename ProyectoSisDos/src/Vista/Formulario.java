/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Consultas;
import Modelo.ConexionPostgres;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author CINTHIA FELIPE
 */
public class Formulario extends javax.swing.JFrame {

    ConexionPostgres cp = new ConexionPostgres();
    Connection conn = cp.conexion();
    Consultas bd = new Consultas();

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jlApellido1 = new javax.swing.JLabel();
        jlNombre1 = new javax.swing.JLabel();
        jlFechaNacimiento1 = new javax.swing.JLabel();
        jlCi1 = new javax.swing.JLabel();
        jlSexo1 = new javax.swing.JLabel();
        jlCorreo1 = new javax.swing.JLabel();
        jlFechaIngreso1 = new javax.swing.JLabel();
        jlCargo1 = new javax.swing.JLabel();
        jlSalario1 = new javax.swing.JLabel();
        jlDireccion1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        txtDireccion1 = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtSalario1 = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox();
        cbSexo = new javax.swing.JComboBox();
        jlFoto1 = new javax.swing.JLabel();
        jbSubirFoto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDatos = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcDia = new javax.swing.JComboBox();
        jcMes = new javax.swing.JComboBox();
        txtAñoNacimiento = new javax.swing.JTextField();
        jcSalario = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro de Empleado");

        jlApellido1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlApellido1.setForeground(new java.awt.Color(0, 41, 191));
        jlApellido1.setText("Apellido");

        jlNombre1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(0, 41, 191));
        jlNombre1.setText("Nombre");

        jlFechaNacimiento1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlFechaNacimiento1.setForeground(new java.awt.Color(0, 41, 191));
        jlFechaNacimiento1.setText("Fecha de Nacimiento");

        jlCi1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlCi1.setForeground(new java.awt.Color(0, 41, 191));
        jlCi1.setText("CI");

        jlSexo1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlSexo1.setForeground(new java.awt.Color(0, 41, 191));
        jlSexo1.setText("Sexo");

        jlCorreo1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlCorreo1.setForeground(new java.awt.Color(0, 41, 191));
        jlCorreo1.setText("Correo Electronico");

        jlFechaIngreso1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlFechaIngreso1.setForeground(new java.awt.Color(0, 41, 191));
        jlFechaIngreso1.setText("Fecha de Ingreso");

        jlCargo1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlCargo1.setForeground(new java.awt.Color(0, 41, 191));
        jlCargo1.setText("Cargo");

        jlSalario1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlSalario1.setForeground(new java.awt.Color(0, 41, 191));
        jlSalario1.setText("Salario");

        jlDireccion1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlDireccion1.setForeground(new java.awt.Color(0, 41, 191));
        jlDireccion1.setText("Direccion");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre1KeyTyped(evt);
            }
        });

        txtApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido1KeyTyped(evt);
            }
        });

        txtCorreo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreo1KeyTyped(evt);
            }
        });

        txtDireccion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccion1KeyTyped(evt);
            }
        });

        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });

        txtFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyTyped(evt);
            }
        });

        txtSalario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalario1KeyTyped(evt);
            }
        });

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente Comercial", "Vendedor", "Marketing", "Mecanico" }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mascullino", "femenino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        jlFoto1.setText("foto");

        jbSubirFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subirImagen.png"))); // NOI18N
        jbSubirFoto.setText("Subir Foto");
        jbSubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubirFotoActionPerformed(evt);
            }
        });

        jtbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "FechaNacimiento", "CI", "Sexo", "CorreoElectronico", "FechaIngreso", "Cargo", "Salario", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(jtbDatos);

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir.png"))); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clear.jpg"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("/");

        jLabel2.setText("/");

        jcDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jcMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        txtAñoNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoNacimientoKeyTyped(evt);
            }
        });

        jcSalario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bs", "$" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCi1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaNacimiento1)
                    .addComponent(jlFechaIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlDireccion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(jlSalario1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlCargo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(txtNombre1)
                                    .addComponent(txtApellido1)
                                    .addComponent(txtCI)
                                    .addComponent(txtCorreo1)
                                    .addComponent(txtFechaIngreso)
                                    .addComponent(txtSalario1)
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSubirFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbSalir)
                                        .addGap(114, 114, 114))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbAgregar)
                                        .addGap(98, 98, 98)
                                        .addComponent(jbLimpiar)
                                        .addGap(101, 101, 101)
                                        .addComponent(jbEliminar)
                                        .addGap(115, 115, 115))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCorreo1)
                                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbLimpiar)
                                    .addComponent(jbEliminar)
                                    .addComponent(jbAgregar))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlFechaIngreso1)
                                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCargo1)
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlSalario1)
                                    .addComponent(txtSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jlDireccion1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNombre1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlApellido1))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlFechaNacimiento1)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCi1)
                                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSexo1)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSubirFoto)
                        .addGap(289, 289, 289))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCargoActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    File fichero;
    private void jbSubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubirFotoActionPerformed
        int resultado;
        Foto ventana = new Foto();
        ventana.setVisible(true);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.jFileChooserFoto.setFileFilter(filtro);
        resultado = ventana.jFileChooserFoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jFileChooserFoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jlFoto1.getWidth(), jlFoto1.getHeight(), Image.SCALE_DEFAULT));
                jlFoto1.setIcon(icono);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir la imagen" + ex);

            }
            jlFoto1.setText(null);
        }
    }//GEN-LAST:event_jbSubirFotoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //obtenemos el modelo de nuestra tabla
        DefaultTableModel model = (DefaultTableModel) jtbDatos.getModel();

        //validando que fila este seleccionada
        int a = jtbDatos.getSelectedRow();
        String s = jtbDatos.getSelectedRows().toString();

        //condicion para verificar si se ha seleccionado o no una fila
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "debe seleccionar una fila de la tabla");
        } else {
            //cuadro de verificacion que nos pedira si queremos eliminar la fila de la tabla
            int confirmar = JOptionPane.showConfirmDialog(null, "esta seguro que desea eliminar el registro?");
            //verificamos si hemos respondido de manera positiva a la pregunta anterior
            if (JOptionPane.OK_OPTION == confirmar) {
                //removemos la fila de la tabla
                model.removeRow(a);
                //cuadro de confirmando de eliminacion
                JOptionPane.showMessageDialog(null, "registro eliminado");
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        //obtenemos el modelo de nuestra tabla
        DefaultTableModel modelo = (DefaultTableModel) jtbDatos.getModel();
        /*creamos un array donde guardaremos los datos de los componentes
        de nuestro formulario, cuya longitud dependera del numero de datos
        a capturar y del modelo de columnas que posee nuestra tabla*/
        Object[] fila = new Object[10];

        /*recogemos lo datos de acuerdo al orden de las columnass 
        de la tabla es decir, si la primera columna es nombre, el primer dato a recoger 
        debe ser el del elemento(campo de texto) que contenga el dato nombre*/
        fila[0] = txtNombre1.getText();
        fila[1] = txtApellido1.getText();
        fila[2] = txtAñoNacimiento.getText();
        fila[3] = txtCI.getText();
        fila[4] = cbSexo.getSelectedItem().toString();
        fila[5] = txtCorreo1.getText();
        fila[6] = txtFechaIngreso.getText();
        fila[7] = cbCargo.getSelectedItem().toString();
        fila[8] = txtSalario1.getText();
        fila[9] = txtDireccion1.getText();

        //agregamos el array anterior al modelo de nuestra tabla
        modelo.addRow(fila);

        //asignamos y/o aplicamos el modelo a nuestra tabla
        jtbDatos.setModel(modelo);

        if (txtNombre1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }
        if (txtApellido1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el apellido");
            return;
        }
        if (txtAñoNacimiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de nacimiento");
            return;
        }
        if (txtFechaIngreso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha de ingreso");
            return;
        }
        if (txtSalario1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha el salario");
            return;
        }
        if (txtDireccion1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la direccion");
            return;
        }

        bd.añadir_nuevo_empleado(txtNombre1.getText(), txtApellido1.getText(), cbSexo.getSelectedItem().toString(), txtCorreo1.getText(),
                txtCI.getText(), txtAñoNacimiento.getText(), txtFechaIngreso.getText(), cbCargo.getSelectedItem().toString(), Integer.valueOf(txtSalario1.getText()), txtDireccion1.getText());
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        txtNombre1.setText("");
        txtApellido1.setText("");
        txtAñoNacimiento.setText("");
        txtCI.setText("");
        txtCorreo1.setText("");
        txtFechaIngreso.setText("");
        txtSalario1.setText("");
        txtDireccion1.setText("");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Fondo aplicarFondo = new Fondo();
        this.add(aplicarFondo, BorderLayout.SOUTH);
        aplicarFondo.repaint();

    }//GEN-LAST:event_formWindowOpened

      public  boolean validarDeCorreo(String dato){
        Pattern pat = Pattern.compile("^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,4})?$");
        Matcher mat = pat.matcher(dato);
        if(mat.find()){
            return true;
            //JOptionPane.showMessageDialog(null, "el texto escrito es un correo");
        }else{
            //JOptionPane.showMessageDialog(null, "el texto escrito NO! es un correo");
            return false;
        }
    }
      
     public boolean validadCI(String cedula)
     {
       boolean res = false;  
        if(cedula.isEmpty())
        {
         return false;
        }
        else if(cedula.length()>=7 || cedula.length()<=8)
        {
         for(int i =0 ;i <cedula.length(); i++)
         {
           char v = cedula.charAt(i);
           if(v>= 0 && v<=9 )
           {
            res = true;
           }
           else
           {
            res = false;
           }
            
         }
        }
        return res;
     }
      
     
     public boolean  datosNulos(String nombre)
     {
       return  nombre.isEmpty() ? false : true;
     }
    
    private void txtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyTyped
        if (txtNombre1.getText().length() >= 20) {
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if (Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombre1KeyTyped

    private void txtApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido1KeyTyped
        if (txtApellido1.getText().length() >= 25) {
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if (Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellido1KeyTyped

    private void txtAñoNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoNacimientoKeyTyped
        if (txtAñoNacimiento.getText().length() >= 4) {
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoNacimientoKeyTyped

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        if (txtCI.getText().length() >= 8) {
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtCorreo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreo1KeyTyped
        if (txtCorreo1.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreo1KeyTyped

    private void txtFechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyTyped
        if (txtFechaIngreso.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaIngresoKeyTyped

    private void txtSalario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalario1KeyTyped
        if (txtSalario1.getText().length() >= 10) {
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalario1KeyTyped
    /**/
    private void txtDireccion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccion1KeyTyped
        if (txtDireccion1.getText().length() >= 70) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccion1KeyTyped

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSubirFoto;
    private javax.swing.JComboBox jcDia;
    private javax.swing.JComboBox jcMes;
    private javax.swing.JComboBox jcSalario;
    private javax.swing.JLabel jlApellido1;
    private javax.swing.JLabel jlCargo1;
    private javax.swing.JLabel jlCi1;
    private javax.swing.JLabel jlCorreo1;
    private javax.swing.JLabel jlDireccion1;
    private javax.swing.JLabel jlFechaIngreso1;
    private javax.swing.JLabel jlFechaNacimiento1;
    private javax.swing.JLabel jlFoto1;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlSalario1;
    private javax.swing.JLabel jlSexo1;
    private javax.swing.JTable jtbDatos;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtAñoNacimiento;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtSalario1;
    // End of variables declaration//GEN-END:variables
}
