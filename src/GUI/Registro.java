
package GUI;

import MUNDO.Habitacion;
import MUNDO.Huesped;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 1151641-1161646
 */
public class Registro extends javax.swing.JDialog {

    Object datos[];
    ArrayList<Huesped> huespedes;
    String tipoHabitacion;
    Habitacion lista[];
    
    public Registro(java.awt.Frame parent, boolean modal, Object datos[], String tipoHabitacion, Habitacion lista[]) {
        super(parent, modal);
        initComponents();
        this.datos = datos;
        huespedes = new ArrayList();
        this.tipoHabitacion = tipoHabitacion;
        this.lista = lista;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmp_edadHuesped = new javax.swing.JTextField();
        btn_aceptarRegistro = new javax.swing.JButton();
        cmp_cedHuesped = new javax.swing.JTextField();
        btn_registrarHuesped = new javax.swing.JButton();
        cmp_cedResponsable = new javax.swing.JTextField();
        cmp_nameResponsable = new javax.swing.JTextField();
        cmp_edadResponsable = new javax.swing.JTextField();
        cmp_nameHuesped = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_huespedes = new javax.swing.JList<>();
        btn_cancelarRegistro = new javax.swing.JButton();
        btn_borrarHuesped = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        isResponsableHuesped = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_back_registro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmp_edadHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_edadHuespedKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_edadHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 157, -1));

        btn_aceptarRegistro.setText("ACEPTAR");
        btn_aceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, -1));

        cmp_cedHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_cedHuespedKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_cedHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 157, -1));

        btn_registrarHuesped.setText("Registrar");
        btn_registrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarHuespedActionPerformed(evt);
            }
        });
        btn_registrarHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_registrarHuespedKeyPressed(evt);
            }
        });
        jPanel1.add(btn_registrarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, -1));

        cmp_cedResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_cedResponsableKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_cedResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 157, -1));

        cmp_nameResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_nameResponsableKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_nameResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 157, -1));

        cmp_edadResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_edadResponsableKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_edadResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 157, -1));

        cmp_nameHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmp_nameHuespedKeyPressed(evt);
            }
        });
        jPanel1.add(cmp_nameHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 157, -1));

        jScrollPane1.setViewportView(lst_huespedes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 140, 160));

        btn_cancelarRegistro.setText("CANCELAR");
        btn_cancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, -1));

        btn_borrarHuesped.setText("Borrar");
        btn_borrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarHuespedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_borrarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("Registro de Responsable de Habitación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        isResponsableHuesped.setText("Es Huesped");
        isResponsableHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isResponsableHuespedKeyPressed(evt);
            }
        });
        jPanel1.add(isResponsableHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Registro de Huéspedes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 10, 210));

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
        jLabel1.setText("REGISTRO DE HUESPEDES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Edad  +18");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 202, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 142, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Cédula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 172, 40, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 142, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("Cédula");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 172, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setText("Edad ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 202, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_registroActionPerformed
        datos[0] = null;        
        dispose();
    }//GEN-LAST:event_btn_back_registroActionPerformed

    private void btn_aceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarRegistroActionPerformed
        datos[0] = cmp_nameResponsable.getText();
        datos[1] = cmp_cedResponsable.getText();
        datos[2] = cmp_edadResponsable.getText();
        
        
        if(datos[0].toString().isEmpty() || datos[1].toString().isEmpty() || datos[2].toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltan datos del Responsable");
            return;
        }
        else{
            int edad = Integer.valueOf(cmp_edadResponsable.getText());
        
            if(edad<18){
                JOptionPane.showMessageDialog(null, "El responsable debe ser Mayor de edad!");
                return;
            }

            if(isResponsableHuesped.isSelected()) {
                String nameR = (String) datos[0];
                int cedR = Integer.valueOf((String)datos[1]);
                int edadR = Integer.valueOf((String)datos[2]);        
                huespedes.add(0, new Huesped(nameR, cedR, edadR));
            }        
            datos[3] = huespedes;            
            dispose();
    }    
    }//GEN-LAST:event_btn_aceptarRegistroActionPerformed
    
    private void btn_cancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarRegistroActionPerformed
        cmp_cedHuesped.setText("");
        cmp_edadHuesped.setText("");
        cmp_nameHuesped.setText("");
        cmp_cedResponsable.setText("");
        cmp_nameResponsable.setText("");
        cmp_edadResponsable.setText("");
        huespedes.clear();
        isResponsableHuesped.setEnabled(true);
        actualizar();
    }//GEN-LAST:event_btn_cancelarRegistroActionPerformed

    private void btn_borrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarHuespedActionPerformed
        if(!lst_huespedes.isSelectionEmpty()){
            int index = lst_huespedes.getSelectedIndex();
            huespedes.remove(index);
            actualizar();
            if(!isResponsableHuesped.isEnabled() && !isFullHuespedes())
                    isResponsableHuesped.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccionar Huésped en la lista");
        
    }//GEN-LAST:event_btn_borrarHuespedActionPerformed

    public boolean isHuespedHotel(int cedula){
        boolean esta = false;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isHuesped(cedula)){
                esta = true;
                i = lista.length;
            }
        }        
        return esta;
    }
    
    private void btn_registrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarHuespedActionPerformed
        
        if(!cmp_nameHuesped.getText().equals("") || !cmp_cedHuesped.getText().equals("") ||
           !cmp_edadHuesped.getText().equals("") ){
            
            if(isFullHuespedes())
                JOptionPane.showMessageDialog(null, "Cupo Completo! HABITACION "+tipoHabitacion);            
            else{
                String nombre = cmp_nameHuesped.getText();
                int cedula = Integer.valueOf(cmp_cedHuesped.getText());
                int edad = Integer.valueOf(cmp_edadHuesped.getText());
                
                if(!isHuespedHotel(cedula)){
                    huespedes.add(new Huesped(nombre, cedula, edad));  
                    actualizar();

                    if(!isResponsableHuesped.isSelected() && isFullHuespedes())
                        isResponsableHuesped.setEnabled(false);                    
                }
                else
                    JOptionPane.showMessageDialog(null, "El huésped ya esta registrado");
                    
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Faltan datos del Huésped");
        
        
    }//GEN-LAST:event_btn_registrarHuespedActionPerformed

    private void cmp_nameResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_nameResponsableKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_cedResponsable.requestFocus();
    }//GEN-LAST:event_cmp_nameResponsableKeyPressed

    private void cmp_cedResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_cedResponsableKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_edadResponsable.requestFocus();
    }//GEN-LAST:event_cmp_cedResponsableKeyPressed

    private void cmp_edadResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_edadResponsableKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) isResponsableHuesped.requestFocus();
    }//GEN-LAST:event_cmp_edadResponsableKeyPressed

    private void isResponsableHuespedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isResponsableHuespedKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_nameHuesped.requestFocus();
    }//GEN-LAST:event_isResponsableHuespedKeyPressed

    private void cmp_nameHuespedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_nameHuespedKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_cedHuesped.requestFocus();
    }//GEN-LAST:event_cmp_nameHuespedKeyPressed

    private void cmp_cedHuespedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_cedHuespedKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cmp_edadHuesped.requestFocus();
    }//GEN-LAST:event_cmp_cedHuespedKeyPressed

    private void cmp_edadHuespedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmp_edadHuespedKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) btn_registrarHuesped.requestFocus();
    }//GEN-LAST:event_cmp_edadHuespedKeyPressed

    private void btn_registrarHuespedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registrarHuespedKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ 
            btn_registrarHuesped.doClick();
            cmp_nameHuesped.requestFocus();
        }        
    }//GEN-LAST:event_btn_registrarHuespedKeyPressed

    private boolean isFullHuespedes(){
        int cant = 0;
        
        if(isResponsableHuesped.isSelected()) 
            cant = -1;
        
        if(tipoHabitacion.equals("EJECUTIVA")){
            
            if(huespedes.size()==cant+1)
                return true;}
        if(tipoHabitacion.equals("DOBLE")){
            if(huespedes.size()==cant+2)
                return true;}
        if(tipoHabitacion.equals("SUITE")){
            if(huespedes.size()==cant+5)
                return true;}
        if(tipoHabitacion.equals("EJECUTIVA")){
            if(huespedes.size()==cant+10)
                return true;}
        
        return false;
    }    
    
    private void actualizar(){
        DefaultListModel model = new DefaultListModel();

        for(int i=0; i<huespedes.size();i++){
            String name = huespedes.get(i).getNombre();            
            String cedula = String.valueOf(huespedes.get(i).getCedula());
            String edad = String.valueOf(huespedes.get(i).getEdad());
            String mostrar = name+"  "+cedula+"  -  "+edad+"años";
            model.add(i, mostrar);
        }
        lst_huespedes.setModel(model);
        cmp_nameHuesped.setText("");
        cmp_cedHuesped.setText("");
        cmp_edadHuesped.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptarRegistro;
    private javax.swing.JButton btn_back_registro;
    private javax.swing.JButton btn_borrarHuesped;
    private javax.swing.JButton btn_cancelarRegistro;
    private javax.swing.JButton btn_registrarHuesped;
    private javax.swing.JTextField cmp_cedHuesped;
    private javax.swing.JTextField cmp_cedResponsable;
    private javax.swing.JTextField cmp_edadHuesped;
    private javax.swing.JTextField cmp_edadResponsable;
    private javax.swing.JTextField cmp_nameHuesped;
    private javax.swing.JTextField cmp_nameResponsable;
    private javax.swing.JCheckBox isResponsableHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList<String> lst_huespedes;
    // End of variables declaration//GEN-END:variables
}
