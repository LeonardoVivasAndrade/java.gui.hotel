
package GUI;

import MUNDO.Habitacion;
import MUNDO.Servicio;
import MUNDO.TipoServicio;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author 1151641-1161646
 */
public class Servicios extends javax.swing.JDialog {

    Habitacion hab;
    ArrayList<Servicio> servicios;
    public Servicios(java.awt.Frame parent, boolean modal, Habitacion hab) {
        super(parent, modal);
        initComponents();
        this.hab = hab;
        this.servicios = hab.getListaServicios();
        actualizar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_registrarServicio = new javax.swing.JButton();
        cmp_costo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_servicios = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btn_back_registro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmp_idHabitacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        combo_Servicios = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isCancelado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrarServicio.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_registrarServicio.setText("Registrar Servicio");
        btn_registrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarServicioActionPerformed(evt);
            }
        });
        btn_registrarServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_registrarServicioKeyPressed(evt);
            }
        });
        jPanel1.add(btn_registrarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 180, -1));

        cmp_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_costoKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, -1));

        jScrollPane1.setViewportView(lst_servicios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 200, 160));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Costo");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        btn_back_registro.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_registro.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_back_registro.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_registro.setText("Back");
        btn_back_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_registroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE SERVICIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        cmp_idHabitacion.setEditable(false);
        cmp_idHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 22)); // NOI18N
        cmp_idHabitacion.setBorder(null);
        jPanel1.add(cmp_idHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        jLabel11.setText("Habitación");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, -1));

        combo_Servicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Servicio" }));
        combo_Servicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_ServiciosKeyPressed(evt);
            }
        });
        jPanel1.add(combo_Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Servicios Registrados");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Servicios Disponibles");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        isCancelado.setBackground(new java.awt.Color(255, 255, 255));
        isCancelado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        isCancelado.setText(" Cancelado");
        jPanel1.add(isCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 162, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_registroActionPerformed
        dispose();
    }//GEN-LAST:event_btn_back_registroActionPerformed

    private void cmp_costoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_costoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) btn_registrarServicio.requestFocus();
    }//GEN-LAST:event_cmp_costoKeyPressed

    private void btn_registrarServicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registrarServicioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btn_registrarServicio.doClick();
            combo_Servicios.requestFocus();
        }
    }//GEN-LAST:event_btn_registrarServicioKeyPressed

    private void btn_registrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarServicioActionPerformed
        float costo = Float.valueOf(cmp_costo.getText());
        boolean cancelado = false;
        if(isCancelado.isSelected())
            cancelado = true;
        TipoServicio tipo = TipoServicio.valueOf(combo_Servicios.getSelectedItem().toString());
        
        hab.registrarServicio(new Servicio(tipo, costo, cancelado));
        actualizar();
    }//GEN-LAST:event_btn_registrarServicioActionPerformed

    private void combo_ServiciosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_ServiciosKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_costo.requestFocus();
    }//GEN-LAST:event_combo_ServiciosKeyPressed

    
    private void actualizar(){
        DefaultListModel model = new DefaultListModel();

        for(int i=0; i<servicios.size();i++){
            String name = servicios.get(i).getTipo().toString();
            String costo = String.valueOf(servicios.get(i).getCosto());            
            String mostrar = name+" | $"+costo;
            model.add(i, mostrar);
        }
        lst_servicios.setModel(model);
        cmp_costo.setText("");
        cmp_idHabitacion.setText(hab.getId()+"");
        
        DefaultComboBoxModel modelC = new DefaultComboBoxModel();
        
        for (TipoServicio value : TipoServicio.values()) 
            modelC.addElement(value.name());
        
        combo_Servicios.setModel(modelC);
        
        if(hab.getCategoria().name().equals("EJECUTIVA") || hab.getCategoria().name().equals("DOBLE")){
            modelC.removeElementAt(2);
            combo_Servicios.setModel(modelC);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_registro;
    private javax.swing.JButton btn_registrarServicio;
    private javax.swing.JTextField cmp_costo;
    private javax.swing.JTextField cmp_idHabitacion;
    private javax.swing.JComboBox<String> combo_Servicios;
    private javax.swing.JCheckBox isCancelado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_servicios;
    // End of variables declaration//GEN-END:variables
}
