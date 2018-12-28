
package GUI;

import MUNDO.Habitacion;
import MUNDO.TipoHabitacion;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 1151641 - 1151646
 */
public class Checkin extends javax.swing.JDialog implements ActionListener {

    Frame frame;
    Object datosC[];
    Habitacion lista[];
    
    public Checkin(java.awt.Frame parent, boolean modal, Object datos[], Habitacion lista[]) {
        super(parent, modal);
        frame = parent;
        this.datosC = datos;
        initComponents();
        T1.addActionListener(this);
        T2.addActionListener(this);
        T3.addActionListener(this);
        T4.addActionListener(this);        
        this.lista = lista;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_back_chekin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        T2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        T3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        T4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Habitaciones");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(114, 0, 38));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habEjecutiva.jpg"))); // NOI18N
        T1.setName("EJECUTIVA"); // NOI18N
        T1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habEjecutiva2.jpg"))); // NOI18N
        jPanel1.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1 Huésped");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HABITACION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Ejecutiva");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("$ Precio ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Capacidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        btn_back_chekin.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_chekin.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_back_chekin.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_chekin.setText("Back");
        btn_back_chekin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_chekinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_chekin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jPanel2.setBackground(new java.awt.Color(114, 0, 38));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habDoble.jpg"))); // NOI18N
        T2.setName("DOBLE"); // NOI18N
        T2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habDoble2.jpg"))); // NOI18N
        jPanel2.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 150));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo Doble");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("$ Precio ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Capacidad");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2 Huéspedes");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 32)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("HABITACION");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jPanel4.setBackground(new java.awt.Color(114, 0, 38));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habSuite.jpg"))); // NOI18N
        T3.setName("SUITE"); // NOI18N
        T3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habSuite2.jpg"))); // NOI18N
        jPanel4.add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 150));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tipo Suite");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("$ Precio ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Capacidad");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("5 Huéspedes");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 32)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("HABITACION");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jPanel5.setBackground(new java.awt.Color(114, 0, 38));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habPresidencial.jpg"))); // NOI18N
        T4.setName("PRESIDENCIAL"); // NOI18N
        T4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/habPresidencial2.jpg"))); // NOI18N
        jPanel5.add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 150));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Tipo Presidencial");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("$ Precio ");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 335, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Capacidad");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("10 Huéspedes");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 32)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("HABITACION");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_chekinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_chekinActionPerformed
        dispose();
    }//GEN-LAST:event_btn_back_chekinActionPerformed

    public boolean isFull(String tipoS){
        TipoHabitacion tipoH = TipoHabitacion.valueOf(tipoS);
        boolean activo = true; 
        
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].getCategoria().equals(tipoH) && lista[i].isDisponible()){
                activo = false;
                i = lista.length;
            }
        }        
        return activo;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento){
        
        JButton button = (JButton) evento.getSource();
        
        if(isFull(button.getName())){
                JOptionPane.showMessageDialog(null, "NO HAY HABITACION " +button.getName()+ " DISPONIBLE");            
        }
        else{
            Object datosR[] = new Object[5];
            Registro ventana = new Registro(frame, true, datosR, button.getName(), lista);        
            ventana.setVisible(true);
            if(datosR[0]!=null){
                datosC[0] = datosR[0];
                datosC[1] = datosR[1];
                datosC[2] = datosR[2];
                datosC[3] = button.getName();
                datosC[4] = datosR[3];
                dispose();
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton T1;
    private javax.swing.JButton T2;
    private javax.swing.JButton T3;
    private javax.swing.JButton T4;
    private javax.swing.JButton btn_back_chekin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
