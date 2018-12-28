
package GUI;

import MUNDO.Habitacion;
import MUNDO.Huesped;
import MUNDO.Servicio;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author 1151641-1161646
 */
public class InfoHabitacion extends javax.swing.JDialog {

    Habitacion habitacion;
    ArrayList<Huesped> huespedes;
    ArrayList<Servicio> servicios;
    public InfoHabitacion(java.awt.Frame parent, boolean modal, Habitacion habitacion) {
        super(parent, modal);
        initComponents();
        this.habitacion = habitacion;
        this.huespedes = habitacion.getListaHuespedes();
        this.servicios = habitacion.getListaServicios();
        actualizar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmp_cedResponsable = new javax.swing.JTextField();
        cmp_nameResponsable = new javax.swing.JTextField();
        cmp_edadResponsable = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_huespedesInf = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btn_back_infHabitacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_serviciosInf = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        tipoHabitacion = new javax.swing.JLabel();
        cmp_saldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmp_idHabitacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmp_consumo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmp_cedResponsable.setEditable(false);
        cmp_cedResponsable.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_cedResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 157, -1));

        cmp_nameResponsable.setEditable(false);
        cmp_nameResponsable.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_nameResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 157, -1));

        cmp_edadResponsable.setEditable(false);
        cmp_edadResponsable.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmp_edadResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 157, -1));

        jScrollPane1.setViewportView(lst_huespedesInf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 200, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Responsable de Habitación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        btn_back_infHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btn_back_infHabitacion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btn_back_infHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_back_infHabitacion.setText("Back");
        btn_back_infHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_infHabitacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back_infHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("INFORMACION DE HABITACION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Edad  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Cédula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Servicios incluidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jScrollPane2.setViewportView(lst_serviciosInf);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 140, 160));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Huespédes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        tipoHabitacion.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tipoHabitacion.setForeground(new java.awt.Color(153, 0, 0));
        tipoHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(tipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 310, 30));

        cmp_saldo.setEditable(false);
        cmp_saldo.setBackground(new java.awt.Color(255, 255, 255));
        cmp_saldo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        cmp_saldo.setForeground(new java.awt.Color(204, 0, 51));
        cmp_saldo.setBorder(null);
        jPanel1.add(cmp_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 140, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setText("Consumo Total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, -1));

        cmp_idHabitacion.setEditable(false);
        cmp_idHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 22)); // NOI18N
        cmp_idHabitacion.setBorder(null);
        jPanel1.add(cmp_idHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        jLabel10.setText("Habitación");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, -1));

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("__________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 310, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel12.setText("Saldo Pendiente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));

        cmp_consumo.setEditable(false);
        cmp_consumo.setBackground(new java.awt.Color(255, 255, 255));
        cmp_consumo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        cmp_consumo.setForeground(new java.awt.Color(0, 102, 0));
        cmp_consumo.setBorder(null);
        jPanel1.add(cmp_consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 30));

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

    private void btn_back_infHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_infHabitacionActionPerformed
       dispose();
    }//GEN-LAST:event_btn_back_infHabitacionActionPerformed

    private void actualizar(){
        DefaultListModel model = new DefaultListModel();
        DefaultListModel model2 = new DefaultListModel();
        
        cmp_nameResponsable.setText(habitacion.getResponsable().getNombre());
        cmp_cedResponsable.setText(habitacion.getResponsable().getCedula()+"");
        cmp_edadResponsable.setText(habitacion.getResponsable().getEdad()+"");

        for(int i=0; i<huespedes.size();i++){
            String name = huespedes.get(i).getNombre();            
            String cedula = String.valueOf(huespedes.get(i).getCedula());
            String edad = String.valueOf(huespedes.get(i).getEdad());
            String mostrar = name+"  "+cedula+"  -  "+edad;
            model.add(i, mostrar);
        }
        lst_huespedesInf.setModel(model);
        
        for(int i=0; i<servicios.size();i++){
            String name = servicios.get(i).getTipo().name();
            String costo = servicios.get(i).getCosto()+"";
            model2.add(i, name+" | $"+costo );
        }
        lst_serviciosInf.setModel(model2);
        cmp_idHabitacion.setText(habitacion.getId()+"");
        tipoHabitacion.setText("HABITACION "+habitacion.getCategoria().name());
        
        cmp_saldo.setText("$"+habitacion.getSaldo()+"");
        cmp_consumo.setText("$"+habitacion.getConsumo()+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_infHabitacion;
    private javax.swing.JTextField cmp_cedResponsable;
    private javax.swing.JTextField cmp_consumo;
    private javax.swing.JTextField cmp_edadResponsable;
    private javax.swing.JTextField cmp_idHabitacion;
    private javax.swing.JTextField cmp_nameResponsable;
    private javax.swing.JTextField cmp_saldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst_huespedesInf;
    private javax.swing.JList<String> lst_serviciosInf;
    private javax.swing.JLabel tipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
