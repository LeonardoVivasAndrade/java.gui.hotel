
package GUI;

import MUNDO.Habitacion;
import MUNDO.Responsable;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 1151641-1161646
 */
public class InfoResponsable extends javax.swing.JDialog {

    ArrayList<Habitacion> habitaciones;
    Responsable responsable;
    Frame frame;
    public InfoResponsable(java.awt.Frame parent, boolean modal, ArrayList<Habitacion> habitaciones) {
        super(parent, modal);
        this.frame = parent;
        initComponents();
        this.habitaciones = habitaciones;
        this.responsable = habitaciones.get(0).getResponsable();
        actualizar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmp_cedResponsableInf = new javax.swing.JTextField();
        cmp_nameResponsableInf = new javax.swing.JTextField();
        cmp_edadResponsableInf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_back_infResponsable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboHabResponsable = new javax.swing.JComboBox<>();
        btn_verHabitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmp_cedResponsableInf.setEditable(false);
        cmp_cedResponsableInf.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_cedResponsableInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 157, -1));

        cmp_nameResponsableInf.setEditable(false);
        cmp_nameResponsableInf.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_nameResponsableInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 157, -1));

        cmp_edadResponsableInf.setEditable(false);
        cmp_edadResponsableInf.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_edadResponsableInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 157, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Responsable");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btn_back_infResponsable.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_infResponsable.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_back_infResponsable.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_infResponsable.setText("Back");
        btn_back_infResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_infResponsableActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_infResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        jLabel1.setText("INFORMACION DEL RESPONSABLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Edad ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 212, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 152, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Cédula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 182, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Habitaciones del Responsable");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        comboHabResponsable.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jPanel1.add(comboHabResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 210, 30));

        btn_verHabitacion.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        btn_verHabitacion.setText("Ver Habitación");
        btn_verHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_verHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 190, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_infResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_infResponsableActionPerformed
       dispose();
    }//GEN-LAST:event_btn_back_infResponsableActionPerformed

    private void btn_verHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verHabitacionActionPerformed
        int index = comboHabResponsable.getSelectedIndex();
        
        InfoHabitacion ventana = new InfoHabitacion(frame, true, habitaciones.get(index));
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_verHabitacionActionPerformed

    private void actualizar(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        cmp_nameResponsableInf.setText(responsable.getNombre());
        cmp_cedResponsableInf.setText(responsable.getCedula()+"");
        cmp_edadResponsableInf.setText(responsable.getEdad()+"");

        for(int i=0; i<habitaciones.size();i++){
            String id = habitaciones.get(i).getId()+"";
            String tipo = habitaciones.get(i).getCategoria().name();
            String mostrar = id+" | "+tipo;
            model.addElement(mostrar);
        }
        comboHabResponsable.setModel(model);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_infResponsable;
    private javax.swing.JButton btn_verHabitacion;
    private javax.swing.JTextField cmp_cedResponsableInf;
    private javax.swing.JTextField cmp_edadResponsableInf;
    private javax.swing.JTextField cmp_nameResponsableInf;
    private javax.swing.JComboBox<String> comboHabResponsable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
