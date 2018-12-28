
package GUI;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 1151641-1161646
 */
public class Estadistica extends javax.swing.JDialog {
    
    Object datos[];
    public Estadistica(java.awt.Frame parent, boolean modal, Object datos[] ) {
        super(parent, modal);
        initComponents();        
        this.datos = datos;
        actualizar();
    }
    
    public Estadistica(){
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back_estadisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_checkin = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_checkout = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        etiqueta_habDisponibles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiqueta_totalConsumo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back_estadisticas.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_estadisticas.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_back_estadisticas.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_estadisticas.setText("Back");
        btn_back_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_estadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("ESTADISTICAS DEL HOTEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        tabla_checkin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habitaciones y Huéspedes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_checkin.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tabla_checkin);
        if (tabla_checkin.getColumnModel().getColumnCount() > 0) {
            tabla_checkin.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, 250));

        tabla_checkout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SALIDAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_checkout.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tabla_checkout);
        if (tabla_checkout.getColumnModel().getColumnCount() > 0) {
            tabla_checkout.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 360, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("Registro de Check Out");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        etiqueta_habDisponibles.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        etiqueta_habDisponibles.setForeground(new java.awt.Color(0, 0, 204));
        etiqueta_habDisponibles.setText("0");
        jPanel1.add(etiqueta_habDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setText("TOTAL CONSUMO HOTEL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        etiqueta_totalConsumo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        etiqueta_totalConsumo.setForeground(new java.awt.Color(153, 0, 0));
        etiqueta_totalConsumo.setText("0");
        jPanel1.add(etiqueta_totalConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setText("HABITACIONES DISPONIBLES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel5.setText("Registro de Check In");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_estadisticasActionPerformed
       dispose();
    }//GEN-LAST:event_btn_back_estadisticasActionPerformed

    public DefaultTableModel getTableModel(){
        return (DefaultTableModel) tabla_checkin.getModel();
    }
    
    private void actualizar(){        
        tabla_checkin.setModel((DefaultTableModel) datos[0]);        
        tabla_checkout.setModel((DefaultTableModel) datos[1]);
        etiqueta_habDisponibles.setText(datos[2]+"");
        etiqueta_totalConsumo.setText(datos[3]+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_estadisticas;
    private javax.swing.JLabel etiqueta_habDisponibles;
    private javax.swing.JLabel etiqueta_totalConsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla_checkin;
    private javax.swing.JTable tabla_checkout;
    // End of variables declaration//GEN-END:variables
}
