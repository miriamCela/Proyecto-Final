package InterfacesGraficas;

import java.awt.Color;

public class Habitacion extends javax.swing.JFrame {

    public Habitacion() {
        initComponents();
        this.setSize(1100, 750);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHabitacion = new javax.swing.JPanel();
        pnlNroHabitacion = new javax.swing.JPanel();
        lblNroHabitacion = new javax.swing.JLabel();
        btnReservacion = new javax.swing.JButton();
        btnVolverHabitacion = new javax.swing.JButton();
        lblDatoNroHabitacion = new javax.swing.JLabel();
        lblDatoPrecio = new javax.swing.JLabel();
        lblPublicidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblDatoCapacidad = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        lblSiNo = new javax.swing.JLabel();
        lblImagenHabitacion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDescripcionHabitacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHabitacion.setBackground(new java.awt.Color(254, 250, 211));
        pnlHabitacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNroHabitacion.setBackground(new java.awt.Color(192, 240, 202));
        pnlNroHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNroHabitacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNroHabitacion.setText("Habitación Nro:");
        pnlNroHabitacion.add(lblNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 80, 40));

        btnReservacion.setBackground(new java.awt.Color(102, 234, 202));
        btnReservacion.setText("RESERVACION");
        btnReservacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservacionMouseExited(evt);
            }
        });
        btnReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionActionPerformed(evt);
            }
        });
        pnlNroHabitacion.add(btnReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 150, 50));

        btnVolverHabitacion.setBackground(new java.awt.Color(102, 234, 202));
        btnVolverHabitacion.setText("VOLVER");
        btnVolverHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverHabitacionMouseExited(evt);
            }
        });
        btnVolverHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverHabitacionActionPerformed(evt);
            }
        });
        pnlNroHabitacion.add(btnVolverHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        lblDatoNroHabitacion.setText("nro de la habitacion");
        pnlNroHabitacion.add(lblDatoNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 40));

        pnlHabitacion.add(pnlNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        lblDatoPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblDatoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 170, 30));

        lblPublicidad.setText("publicidad ista");
        lblPublicidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblPublicidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 210, 210));

        lblPrecio.setText("precio");
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 40, 30));

        lblCapacidad.setText("capacidad");
        lblCapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 60, 30));

        lblDatoCapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblDatoCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 150, 30));

        lblDisponible.setText("disponible");
        lblDisponible.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 60, 30));

        lblSiNo.setText(" si / no");
        lblSiNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblSiNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 150, 30));

        lblImagenHabitacion.setText("Iimagenes de la habitacion");
        lblImagenHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblImagenHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 780, 470));

        jLabel10.setText("Iimagenes de la habitacion");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 780, 470));

        lblDescripcionHabitacion.setText("descripcion");
        lblDescripcionHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHabitacion.add(lblDescripcionHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 1040, 150));

        getContentPane().add(pnlHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionActionPerformed
        Registro r = new Registro();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReservacionActionPerformed

    private void btnVolverHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverHabitacionActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverHabitacionActionPerformed

    private void btnVolverHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverHabitacionMouseEntered
        btnVolverHabitacion.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnVolverHabitacionMouseEntered

    private void btnVolverHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverHabitacionMouseExited
        btnVolverHabitacion.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnVolverHabitacionMouseExited

    private void btnReservacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionMouseEntered
        btnReservacion.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnReservacionMouseEntered

    private void btnReservacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservacionMouseExited
        btnReservacion.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnReservacionMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservacion;
    private javax.swing.JButton btnVolverHabitacion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblDatoCapacidad;
    private javax.swing.JLabel lblDatoNroHabitacion;
    private javax.swing.JLabel lblDatoPrecio;
    private javax.swing.JLabel lblDescripcionHabitacion;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblImagenHabitacion;
    private javax.swing.JLabel lblNroHabitacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPublicidad;
    private javax.swing.JLabel lblSiNo;
    private javax.swing.JPanel pnlHabitacion;
    private javax.swing.JPanel pnlNroHabitacion;
    // End of variables declaration//GEN-END:variables
}
