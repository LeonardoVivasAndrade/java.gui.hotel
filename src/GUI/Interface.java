
package GUI;

import MUNDO.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1151641 - 1151646
 */

public class Interface extends javax.swing.JFrame implements ActionListener{

    Hotel hotel;
    ArrayList<String> listEventos;
    ArrayList<Habitacion> listCheckin;
    ArrayList<Habitacion> listCheckout;
    
    public Interface() {
        hotel = new Hotel();
        listEventos = new ArrayList();
        initComponents();
        iniButtons();        
        listCheckin = new ArrayList();
        listCheckout = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btn_checkin = new javax.swing.JButton();
        btn_servicios = new javax.swing.JButton();
        btn_pagoServicios = new javax.swing.JButton();
        btn_consultaHabitacion = new javax.swing.JButton();
        btn_consultaResponsable = new javax.swing.JButton();
        btn_responsableRecurrente = new javax.swing.JButton();
        btn_mayorDeuda = new javax.swing.JButton();
        btn_mayorConsumo = new javax.swing.JButton();
        btn_bitacora = new javax.swing.JButton();
        btn_estadísticas = new javax.swing.JButton();
        btn_checkout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        h9 = new javax.swing.JButton();
        h10 = new javax.swing.JButton();
        h11 = new javax.swing.JButton();
        h12 = new javax.swing.JButton();
        h13 = new javax.swing.JButton();
        h14 = new javax.swing.JButton();
        h15 = new javax.swing.JButton();
        h16 = new javax.swing.JButton();
        h17 = new javax.swing.JButton();
        h18 = new javax.swing.JButton();
        h19 = new javax.swing.JButton();
        h20 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL FIVECODE | Recepción");
        setPreferredSize(new java.awt.Dimension(820, 510));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        btn_checkin.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        btn_checkin.setForeground(new java.awt.Color(0, 102, 102));
        btn_checkin.setText("ChekIn");
        btn_checkin.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkinActionPerformed(evt);
            }
        });

        btn_servicios.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_servicios.setForeground(new java.awt.Color(0, 102, 102));
        btn_servicios.setText("Servicios Habitación");
        btn_servicios.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_serviciosActionPerformed(evt);
            }
        });

        btn_pagoServicios.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_pagoServicios.setForeground(new java.awt.Color(0, 102, 102));
        btn_pagoServicios.setText("Pagar Servicios");
        btn_pagoServicios.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_pagoServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagoServiciosActionPerformed(evt);
            }
        });

        btn_consultaHabitacion.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_consultaHabitacion.setForeground(new java.awt.Color(0, 102, 102));
        btn_consultaHabitacion.setText("Consulta Habitación");
        btn_consultaHabitacion.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_consultaHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaHabitacionActionPerformed(evt);
            }
        });

        btn_consultaResponsable.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_consultaResponsable.setForeground(new java.awt.Color(0, 102, 102));
        btn_consultaResponsable.setText("Consulta Responsable");
        btn_consultaResponsable.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_consultaResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaResponsableActionPerformed(evt);
            }
        });

        btn_responsableRecurrente.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_responsableRecurrente.setForeground(new java.awt.Color(0, 102, 102));
        btn_responsableRecurrente.setText("Responsable más Recurrente");
        btn_responsableRecurrente.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_responsableRecurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_responsableRecurrenteActionPerformed(evt);
            }
        });

        btn_mayorDeuda.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_mayorDeuda.setForeground(new java.awt.Color(0, 102, 102));
        btn_mayorDeuda.setText("Habitación Mayor Deuda");
        btn_mayorDeuda.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_mayorDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayorDeudaActionPerformed(evt);
            }
        });

        btn_mayorConsumo.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_mayorConsumo.setForeground(new java.awt.Color(0, 102, 102));
        btn_mayorConsumo.setText("Habitación Mayor Consumo");
        btn_mayorConsumo.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_mayorConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayorConsumoActionPerformed(evt);
            }
        });

        btn_bitacora.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_bitacora.setForeground(new java.awt.Color(0, 102, 102));
        btn_bitacora.setText("BITACORA");
        btn_bitacora.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bitacoraActionPerformed(evt);
            }
        });

        btn_estadísticas.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btn_estadísticas.setForeground(new java.awt.Color(0, 102, 102));
        btn_estadísticas.setText("ESTADISTICAS");
        btn_estadísticas.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_estadísticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadísticasActionPerformed(evt);
            }
        });

        btn_checkout.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        btn_checkout.setForeground(new java.awt.Color(0, 102, 102));
        btn_checkout.setText("ChekOut");
        btn_checkout.setPreferredSize(new java.awt.Dimension(100, 33));
        btn_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(btn_bitacora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mayorConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mayorDeuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultaHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pagoServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_servicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_checkin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultaResponsable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_responsableRecurrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_estadísticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pagoServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_consultaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consultaResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_responsableRecurrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mayorDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_mayorConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bitacora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btn_estadísticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h1.setText("1");
        jPanel4.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 76, 53));

        h2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h2.setText("2");
        h2.setToolTipText("");
        jPanel4.add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 76, 53));

        h3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h3.setText("3");
        jPanel4.add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 76, 53));

        h4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h4.setText("4");
        jPanel4.add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 76, 53));

        h5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h5.setText("5");
        jPanel4.add(h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 76, 53));

        h6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h6.setText("6");
        jPanel4.add(h6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 76, 53));

        h7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h7.setText("7");
        jPanel4.add(h7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 76, 53));

        h8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h8.setText("8");
        jPanel4.add(h8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 76, 53));

        h9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h9.setText("9");
        jPanel4.add(h9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 76, 53));

        h10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h10.setText("10");
        jPanel4.add(h10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 76, 53));

        h11.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h11.setText("11");
        jPanel4.add(h11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 76, 53));

        h12.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h12.setText("12");
        jPanel4.add(h12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 76, 53));

        h13.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h13.setText("13");
        jPanel4.add(h13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 76, 53));

        h14.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h14.setText("14");
        jPanel4.add(h14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 76, 53));

        h15.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h15.setText("15");
        jPanel4.add(h15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 76, 53));

        h16.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h16.setText("16");
        jPanel4.add(h16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 76, 53));

        h17.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h17.setText("17");
        jPanel4.add(h17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 76, 53));

        h18.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h18.setText("18");
        jPanel4.add(h18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 76, 53));

        h19.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h19.setText("19");
        jPanel4.add(h19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 76, 53));

        h20.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        h20.setText("20");
        jPanel4.add(h20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 130, 53));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 556, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 556, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 556, 10));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 30)); // NOI18N
        jLabel1.setText("Habitación Presidencial");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 430, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel2.setText("Habitaciones Ejecutivas");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel3.setText("Habitaciones Dobles");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        jLabel4.setText("Habitaciones Suite");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkinActionPerformed
        Object datos[] = new Object[5];
        Checkin ventana = new Checkin(this, true, datos, hotel.getLista());
        ventana.setVisible(true);
        
        if(datos[0]!=null){
            String a= (String)datos[0]; 
            int b = Integer.valueOf((String)datos[1]); 
            int c = Integer.valueOf((String)datos[2]); 
            TipoHabitacion d = TipoHabitacion.valueOf((String)datos[3]);
            ArrayList<Huesped> e = (ArrayList) datos[4];
            int id = hotel.checkIn(a,b,c,d,e);
            listCheckin.add(hotel.getLista()[id]);

            actualizar();
        }        
    }//GEN-LAST:event_btn_checkinActionPerformed

    private void btn_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkoutActionPerformed
        try{
            int numHab = Integer.valueOf(JOptionPane.showInputDialog(null, "Digíte número de habitación"));
            if(numHab>=1 && numHab<=20){
                Habitacion hab = hotel.getLista()[numHab-1];

                if(!hab.isDisponible()){
                    try{
                        int salida = JOptionPane.showConfirmDialog(null, "Seguro dar salida Habitación");                
                        if(salida==0)
                            if(hab.getSaldo()>0){
                                try{
                                    int pagar = JOptionPane.showConfirmDialog(null, "La Habitación Tiene un saldo de: "+hab.getSaldo()+" Pagar saldo y dar salida?");                
                                    if(pagar==0){
                                        hotel.darSalida(hab.getId());
                                        listCheckout.add(hab);
                                        actualizar();
                                    }
                                }
                                catch(Exception e){}
                            }
                            else{
                                hotel.darSalida(hab.getId());
                                listCheckout.add(hab);
                                actualizar();
                            }
                    }
                    catch(Exception e){}

                }
                else
                    JOptionPane.showMessageDialog(null, "Habitación Sin Huéspedes");
            }
        }
        catch(Exception e){}
        
        
    }//GEN-LAST:event_btn_checkoutActionPerformed

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
        try{
            int numHab = Integer.valueOf(JOptionPane.showInputDialog(null, "Digíte número de habitación"));
            if(numHab>=1 && numHab<=20){
            Habitacion hab = hotel.getLista()[numHab-1];
        
            if(!hab.isDisponible()){
                Servicios ventana = new Servicios(this, true, hab);
                ventana.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Habitación Sin Huéspedes");
            }
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void btn_consultaHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaHabitacionActionPerformed
        try{
            int ced = Integer.valueOf(JOptionPane.showInputDialog(null, "Digíte Cédula del Huésped"));
            int habitacion = hotel.buscarHabitacionCed(ced);

            if(habitacion==0){
                JOptionPane.showMessageDialog(null, "El huésped no se encuentra registrado. Verifique la cédula");
                btn_consultaHabitacionActionPerformed(evt);
            }
            else
                JOptionPane.showMessageDialog(null, "El huésped: "+ced+" esta en la habitación: "+habitacion);
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_btn_consultaHabitacionActionPerformed

    private void btn_mayorConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayorConsumoActionPerformed
        int hab = hotel.habitacionMayorConsumo();
        double consumo = hotel.getLista()[hab-1].getConsumo();
        if(consumo==0)
            JOptionPane.showMessageDialog(null, "No hay habitaciones con consumo");
        else
            JOptionPane.showMessageDialog(null, "La habitación "+hab+" tiene el MAYOR CONSUMMO <$"+consumo+">");
    }//GEN-LAST:event_btn_mayorConsumoActionPerformed

    private void btn_pagoServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagoServiciosActionPerformed
        try{
            int numHab = Integer.valueOf(JOptionPane.showInputDialog(null, "Digíte número de habitación"));
            if(numHab>=1 && numHab<=20){
                Habitacion hab = hotel.getLista()[numHab-1];

                if(!hab.isDisponible()){
                    if(hab.getSaldo()>0){
                        try{
                            float pago = Float.valueOf(JOptionPane.showInputDialog("La Habitación Tiene un saldo actual de: "+hab.getSaldo()+"Indique valor a cancelar"));
                            hab.setSaldo(hab.getSaldo()-pago);
                            JOptionPane.showMessageDialog(null, "Saldo Actual: "+hab.getSaldo());
                            }
                        catch(Exception e){}
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Habitación sin deuda");                        
                }
                else
                    JOptionPane.showMessageDialog(null, "Habitación Sin Huéspedes");
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btn_pagoServiciosActionPerformed

    private void btn_consultaResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaResponsableActionPerformed
        try{
            int ced = Integer.valueOf(JOptionPane.showInputDialog(null, "Digíte Cédula del Responsable"));
            ArrayList<Habitacion> hab = hotel.responsableHabitaciones(ced);

            if(hab.size()==0){
                JOptionPane.showMessageDialog(null, "La cédula no se encuentra registrada. Verifique nuevamente");
                btn_consultaHabitacionActionPerformed(evt);
            }
            else{
                InfoResponsable ventana = new InfoResponsable(this, true, hab);
                ventana.setVisible(true);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btn_consultaResponsableActionPerformed

    private void btn_mayorDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayorDeudaActionPerformed
        int hab = hotel.habitacionMayorDeuda();
        float deuda = hotel.getLista()[hab-1].getSaldo();
        if(deuda==0)
            JOptionPane.showMessageDialog(null, "No hay habitaciones con deudas");
        else
            JOptionPane.showMessageDialog(null, "La habitación "+hab+" tiene la MAYOR DEUDA <$"+deuda+">");
    }//GEN-LAST:event_btn_mayorDeudaActionPerformed

    private void btn_bitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bitacoraActionPerformed
        // TODO add your handling code here:
        
        
        String a = "leonardo";
    }//GEN-LAST:event_btn_bitacoraActionPerformed

    private void btn_responsableRecurrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_responsableRecurrenteActionPerformed
        Responsable responsable = hotel.responsableMasRecurrente();
        
        if(responsable!=null){
            int cantHabitaciones = hotel.responsableHabitaciones(responsable.getCedula()).size();
                
            JOptionPane.showMessageDialog(null, "RESPONSABLE CON MAS HABITACIONES: "+responsable.getNombre()+" CON <"+cantHabitaciones+"> HABITACION(ES)");
        }
        else
            JOptionPane.showMessageDialog(null, "No hay Responsables Registrados");
        
        
    }//GEN-LAST:event_btn_responsableRecurrenteActionPerformed

    private void btn_estadísticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadísticasActionPerformed
    
        DefaultTableModel modelI = getTableModel();
        DefaultTableModel modelO = getTableModel();
        
        
        for (Habitacion habitacion : listCheckin) {
            int id = habitacion.getId();
            String tipo = habitacion.getCategoria().name();
            String responsable = habitacion.getResponsable().getNombre();
            modelI.addRow(new Object[]
            {"Habitación <"+id+">  "+tipo+"  | Responsable: "+responsable} );
            if(habitacion.getListaHuespedes().size()>0)
                modelI.addRow(new Object[] { "Huépedes: "} );
            for (Huesped huesped : habitacion.getListaHuespedes()) {
                String name = huesped.getNombre();
                int ced = huesped.getCedula();
                int edad = huesped.getEdad();
                modelI.addRow(new Object[] { name+" | "+ced+" | "+edad+" Años"} );
            }
        }
        
        for (Habitacion habitacion : listCheckout) {
            int id = habitacion.getId();
            String tipo = habitacion.getCategoria().name();
            String responsable = habitacion.getResponsable().getNombre();
            modelO.addRow(new Object[]
            {"Habitación <"+id+">  "+tipo+"  | Responsable: "+responsable} );
            if(habitacion.getListaServicios().size()>0)
                modelO.addRow(new Object[] { "Servicios: "} );
            for (Servicio servicio : habitacion.getListaServicios()) {
                String name = servicio.getTipo().name();
                float costo = servicio.getCosto();
                modelO.addRow(new Object[] { name+" | $"+costo} );
            }
        }
        
        double totalConsumo = hotel.getTotalConsumoHotel();
        
        for (int i = 0; i < listCheckout.size(); i++) {
            totalConsumo += listCheckout.get(i).getConsumo();
        }
        
        Object datos[] = new Object[4];
        datos[0] = modelI;
        datos[1] = modelO;
        datos[2] = hotel.habitacionesDisponibles();
        datos[3] = totalConsumo;
        Estadistica ventana = new Estadistica(this, true, datos);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btn_estadísticasActionPerformed

    private DefaultTableModel getTableModel(){
        Estadistica est = new Estadistica();
        return est.getTableModel();
    }
    
    private void iniButtons(){
        h1.addActionListener(this);h2.addActionListener(this);h3.addActionListener(this);h4.addActionListener(this);h5.addActionListener(this);
        h6.addActionListener(this);h7.addActionListener(this);h8.addActionListener(this);h9.addActionListener(this);h10.addActionListener(this);
        h11.addActionListener(this);h12.addActionListener(this);h13.addActionListener(this);h14.addActionListener(this);h15.addActionListener(this);
        h16.addActionListener(this);h17.addActionListener(this);h18.addActionListener(this);h19.addActionListener(this);h20.addActionListener(this);       
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {        
        int idHab = Integer.valueOf(evento.getActionCommand());
        if(!hotel.getLista()[idHab-1].isDisponible()){
            InfoHabitacion ventana = new  InfoHabitacion(this, true, hotel.getLista()[idHab-1]);
            ventana.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Habitación Disponible");
            
    }
    
    private void actualizar(){
        ArrayList<JButton> botones = new ArrayList();
        
        botones.add(h1);botones.add(h2);botones.add(h3);botones.add(h4);botones.add(h5);
        botones.add(h6);botones.add(h7);botones.add(h8);botones.add(h9);botones.add(h10);
        botones.add(h11);botones.add(h12);botones.add(h13);botones.add(h14);botones.add(h15);
        botones.add(h16);botones.add(h17);botones.add(h18);botones.add(h19);botones.add(h20);
        
        for (int i = 0; i < hotel.getLista().length; i++) {
            if(!hotel.getLista()[i].isDisponible())
                botones.get(i).setBackground(Color.red);
            else
                botones.get(i).setBackground(new Color(240,240,240));
        }    
    }
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bitacora;
    private javax.swing.JButton btn_checkin;
    private javax.swing.JButton btn_checkout;
    private javax.swing.JButton btn_consultaHabitacion;
    private javax.swing.JButton btn_consultaResponsable;
    private javax.swing.JButton btn_estadísticas;
    private javax.swing.JButton btn_mayorConsumo;
    private javax.swing.JButton btn_mayorDeuda;
    private javax.swing.JButton btn_pagoServicios;
    private javax.swing.JButton btn_responsableRecurrente;
    private javax.swing.JButton btn_servicios;
    private javax.swing.JButton h1;
    private javax.swing.JButton h10;
    private javax.swing.JButton h11;
    private javax.swing.JButton h12;
    private javax.swing.JButton h13;
    private javax.swing.JButton h14;
    private javax.swing.JButton h15;
    private javax.swing.JButton h16;
    private javax.swing.JButton h17;
    private javax.swing.JButton h18;
    private javax.swing.JButton h19;
    private javax.swing.JButton h2;
    private javax.swing.JButton h20;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton h9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    
}