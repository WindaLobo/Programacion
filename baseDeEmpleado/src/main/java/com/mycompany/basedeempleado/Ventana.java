package com.mycompany.basedeempleado;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Contratado;
import modelo.Empleado;
import modelo.Permanente;
import repositorio.EmpleadoRepositorio;

public class Ventana extends javax.swing.JFrame {

    ArrayList<Empleado> empleados = new ArrayList<>();
    Empleado empleadoSeleccionado = new Permanente();
    EmpleadoRepositorio repositorio = new EmpleadoRepositorio();

    public Ventana() throws SQLException, ClassNotFoundException {

        initComponents();
        this.setLocationRelativeTo(this);

        empleados = repositorio.obtenerEmpleados();
        cargar(empleados);
        establecerObjectoEnControles();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelFechaContartacion = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        cmbTipoContrato = new javax.swing.JComboBox<>();
        jButtonNuevo = new javax.swing.JButton();
        jPanelClienteContratados = new javax.swing.JPanel();
        jTextFieldCientesContratado = new javax.swing.JTextField();
        jLabeClientesCaptado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaEmpleado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelID.setText("ID:");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellidos:");

        jLabelDni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDni.setText("Dni:");

        jLabelSalario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSalario.setText("Salario:");

        jLabelFechaContartacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFechaContartacion.setText("Fecha de contratatcion  :");

        jTextFieldFecha.setText(" \"d/M/yyyy\"");

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSalir.setText("SALIR");
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirjButtonSalirActionPerformed(evt);
            }
        });

        cmbTipoContrato.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cmbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanente", "Contratado" }));
        cmbTipoContrato.setBorder(null);
        cmbTipoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoContratoActionPerformed(evt);
            }
        });

        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setText("NUEVO");
        jButtonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setMinimumSize(new java.awt.Dimension(89, 22));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jPanelClienteContratados.setBackground(java.awt.SystemColor.activeCaption);

        jLabeClientesCaptado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabeClientesCaptado.setText("Clientes Contratados:");

        javax.swing.GroupLayout jPanelClienteContratadosLayout = new javax.swing.GroupLayout(jPanelClienteContratados);
        jPanelClienteContratados.setLayout(jPanelClienteContratadosLayout);
        jPanelClienteContratadosLayout.setHorizontalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteContratadosLayout.createSequentialGroup()
                .addComponent(jLabeClientesCaptado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldCientesContratado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelClienteContratadosLayout.setVerticalGroup(
            jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteContratadosLayout.createSequentialGroup()
                .addGroup(jPanelClienteContratadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCientesContratado)
                    .addComponent(jLabeClientesCaptado))
                .addContainerGap())
        );

        jTableListaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaEmpleado);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ELIMINAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(89, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldID.setEditable(false);

        jLabelNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaContartacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelApellido)
                                    .addComponent(jLabelNombre1)
                                    .addComponent(jLabelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDni)
                                    .addComponent(jLabelSalario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalario))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaContartacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelClienteContratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonGuardar, jButtonNuevo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            establecerControlesAObjecto();

            if (empleadoSeleccionado.getIdEmpleado() == 0) {

                repositorio.insertarEmpleado(empleadoSeleccionado);
            } else {
                repositorio.actualizarEmpleado(empleadoSeleccionado);
            }
            empleados = repositorio.obtenerEmpleados();
            cargar(empleados);

        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirjButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirjButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirjButtonSalirActionPerformed

    private void cmbTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoContratoActionPerformed
        String selectedOption = cmbTipoContrato.getSelectedItem().toString();
        if (selectedOption.equalsIgnoreCase("PERMANENTE")) {
            jPanelClienteContratados.setVisible(true);
        } else {
            jPanelClienteContratados.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoContratoActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        empleadoSeleccionado = new Permanente();
        establecerObjectoEnControles();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void establecerControlesAObjecto() {
        empleadoSeleccionado.setDni(jTextFieldDNI.getText());
        empleadoSeleccionado.setNombre(jTextFieldNombre.getText());
        empleadoSeleccionado.setApellidos(jTextFieldApellidos.getText());
        empleadoSeleccionado.setSalarioBase(Double.parseDouble(jTextFieldSalario.getText()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaTexto = jTextFieldFecha.getText();
        LocalDate fecha = LocalDate.parse(fechaTexto, formatter);
        empleadoSeleccionado.setFechaDeIngreso(fecha);

        if (cmbTipoContrato.getSelectedItem().toString().equals("PERMANENTE")) {
            Permanente permanente = (Permanente) empleadoSeleccionado;
            permanente.setClientesCaptados(Integer.parseInt(jTextFieldCientesContratado.getText()));
        }
    }

    private void establecerObjectoEnControles() {
        jTextFieldID.setText(String.valueOf(empleadoSeleccionado.getIdEmpleado()));
        jTextFieldDNI.setText(empleadoSeleccionado.getDni());
        jTextFieldNombre.setText(empleadoSeleccionado.getNombre());
        jTextFieldApellidos.setText(empleadoSeleccionado.getApellidos());
        jTextFieldSalario.setText(String.valueOf(empleadoSeleccionado.getSalarioBase()));

        if (empleadoSeleccionado.getFechaDeIngreso() != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            jTextFieldFecha.setText(empleadoSeleccionado.getFechaDeIngreso().format(formatter));
        } else {
            jTextFieldFecha.setText("dd/MM/yyyy");
        }

        if (empleadoSeleccionado instanceof Permanente) {
            Permanente permanente = (Permanente) empleadoSeleccionado;
            cmbTipoContrato.setSelectedItem("PERMANENTE");
            jTextFieldCientesContratado.setText(String.valueOf(permanente.getClientesCaptados()));
        } else {
            cmbTipoContrato.setSelectedItem("CONTRATADO");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargar(ArrayList<Empleado> obtenerEmpleados) {

        DefaultTableModel modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("cliente Contratado");
        modeloTabla.addColumn("Salario base");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Tipo de contrato");
        for (Empleado empleado : obtenerEmpleados) {
            Object[] fila = new Object[8];

            fila[0] = empleado.getIdEmpleado();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellidos();
            fila[3] = empleado.getDni();
            if (empleado instanceof Permanente) {
                Permanente permanente = (Permanente) empleado;
                fila[4] = permanente.getClientesCaptados();

            }
            fila[5] = empleado.getSalarioBase();
            fila[6] = empleado.getFechaDeIngreso();
            fila[7] = empleado instanceof Permanente ? "Permanente" : "Contratado";
            modeloTabla.addRow(fila);
        }

        jTableListaEmpleado.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoContrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabeClientesCaptado;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaContartacion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelClienteContratados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaEmpleado;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCientesContratado;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
