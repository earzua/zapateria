/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.repair;

import datos.Cliente;
import datos.Reparacion;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocios.ClientesBL;
import negocios.ReparacionesBL;
import negocios.TiposCalzadoBL;
import ui.Client.JClientes_ui;
import ui.JAppmain_ui;
import ui.jTipoCalzados;

public class JAddReparClient extends javax.swing.JInternalFrame {

    private final JClientes_ui clientes_ui;
    private Reparacion reparacion = null;
    private final ReparacionesBL reparacionbl;
    private Cliente cliente = new Cliente();
    private JDesktopPane dskMain = null;
    private JAppmain_ui app = null;

    public JAddReparClient(JClientes_ui aThis, int cliente_id, JAppmain_ui app) {
        this.reparacionbl = null;
        this.clientes_ui = aThis;
        this.app = app;
        cliente = ClientesBL.findById(cliente_id);
        initComponents();
        fillClient();
        fillComboTipoCalzado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utilDateModel1 = new org.jdatepicker.UtilDateModel();
        sqlDateModel1 = new org.jdatepicker.SqlDateModel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboTipoCalzado = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JFormattedTextField();
        btnAddTipoCalzado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCompletos = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        utilDateModel1.setSelected(true);

        sqlDateModel1.setSelected(true);

        setTitle("Registro de reparacion");

        jLabel4.setLabelFor(txtDescripcion);
        jLabel4.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel5.setLabelFor(txtValor);
        jLabel5.setText("Valor");

        jLabel6.setLabelFor(cboTipoCalzado);
        jLabel6.setText("Tipo de calzado");

        cboTipoCalzado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnAddTipoCalzado.setText("...");
        btnAddTipoCalzado.setToolTipText("Agregar nuevo tipo de calzado");
        btnAddTipoCalzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTipoCalzadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Identificación:");

        txtIdentificacion.setEditable(false);

        jLabel3.setText("Nombres Cliente");

        txtNombreCompletos.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21)
                                .addComponent(cboTipoCalzado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddTipoCalzado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCompletos))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCompletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboTipoCalzado)
                    .addComponent(btnAddTipoCalzado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
        );

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/diskette_24.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setToolTipText("Guarda el registro");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);
        jToolBar1.add(jSeparator1);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cancel_24.png"))); // NOI18N
        btnClose.setMnemonic('c');
        btnClose.setText("Cerrar");
        btnClose.setToolTipText("Cierra el Formulario");
        btnClose.setFocusable(false);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClose);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nueva Reparación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Guarda la reparacion para el cliente
     *
     * @param evt
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

     
        if (this.txtDescripcion.getText().length() > 0) {
            if (this.txtValor.getText().length() > 0) {
                try {
                    reparacion = new Reparacion();
                    reparacion.setDescripcionReparacion(this.txtDescripcion.getText());
                    reparacion.setValor(Double.parseDouble(this.txtValor.getText()));
                    TiposCalzadoBL.TiposCalzadoscbo tipo_calzado = new TiposCalzadoBL.TiposCalzadoscbo();
                    tipo_calzado = (TiposCalzadoBL.TiposCalzadoscbo) this.cboTipoCalzado.getSelectedItem();
                    reparacion.setTipoCalzadoId(tipo_calzado.getId());
                    reparacion.setClienteID(cliente.getId());
                    reparacion.setUsuariosId(app.user.getId());
                    reparacion.setEstado("En reparación");

                    ReparacionesBL.create(reparacion);

                    clearFields();
                    JOptionPane.showMessageDialog(rootPane, "Se ha guardado la reparación");
                    this.dispose();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getLocalizedMessage());
                }

            }
            else
                txtValor.setBackground(Color.red);
        }
        else
            txtDescripcion.setBackground(Color.red);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddTipoCalzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTipoCalzadoActionPerformed

        jTipoCalzados tipo = new jTipoCalzados();
        clientes_ui.dskApp.add(tipo);
        tipo.show();
    }//GEN-LAST:event_btnAddTipoCalzadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTipoCalzado;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboTipoCalzado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdatepicker.SqlDateModel sqlDateModel1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombreCompletos;
    private javax.swing.JFormattedTextField txtValor;
    private org.jdatepicker.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        this.txtDescripcion.setText("");

    }

    private void fillClient() {

        this.txtIdentificacion.setText(cliente.getIdentificacion());
        this.txtNombreCompletos.setText(cliente.getNombreCompleto());
    }

    /**
     * Llena el combobox de los tipos de calzado.
     *
     */
    private void fillComboTipoCalzado() {

        this.cboTipoCalzado.removeAllItems();
        try {
            DefaultComboBoxModel modelTiposCalzado;

            modelTiposCalzado = TiposCalzadoBL.cboTiposCalzado();
            this.cboTipoCalzado.setModel(modelTiposCalzado);
            //disableButtons();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de clientes " + e.getMessage());
            e.printStackTrace();
        }
    }

}
