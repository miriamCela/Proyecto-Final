package InterfacesGraficas;

import java.awt.Color;

public class Presentacion extends javax.swing.JFrame {

    public Presentacion() {
        initComponents();
        this.setSize(1100, 750);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPresentacion = new javax.swing.JPanel();
        fondoPresentacion = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnSiguientePresentacion = new javax.swing.JButton();
        btnVolverPresentacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPresentacion.setBackground(new java.awt.Color(254, 250, 211));
        pnlPresentacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPresentacion.add(fondoPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 790, 750));
        pnlPresentacion.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 570));

        btnSiguientePresentacion.setBackground(new java.awt.Color(102, 234, 202));
        btnSiguientePresentacion.setText("SIGUIENTE");
        btnSiguientePresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguientePresentacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguientePresentacionMouseExited(evt);
            }
        });
        btnSiguientePresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePresentacionActionPerformed(evt);
            }
        });
        pnlPresentacion.add(btnSiguientePresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 160, 60));

        btnVolverPresentacion.setBackground(new java.awt.Color(102, 234, 202));
        btnVolverPresentacion.setText("VOLVER");
        btnVolverPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverPresentacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverPresentacionMouseExited(evt);
            }
        });
        btnVolverPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPresentacionActionPerformed(evt);
            }
        });
        pnlPresentacion.add(btnVolverPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 150, 60));

        getContentPane().add(pnlPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPresentacionActionPerformed
        Inicial i = new Inicial();
        i.setVisible(true);
        dispose(); // sirve para que se quede una sola ventana en pantalla
    }//GEN-LAST:event_btnVolverPresentacionActionPerformed

    private void btnSiguientePresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePresentacionActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSiguientePresentacionActionPerformed

    private void btnVolverPresentacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverPresentacionMouseEntered
        btnVolverPresentacion.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnVolverPresentacionMouseEntered

    private void btnVolverPresentacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverPresentacionMouseExited
        btnVolverPresentacion.setBackground(new Color(102, 234, 202));
    }//GEN-LAST:event_btnVolverPresentacionMouseExited

    private void btnSiguientePresentacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguientePresentacionMouseEntered
        btnSiguientePresentacion.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnSiguientePresentacionMouseEntered

    private void btnSiguientePresentacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguientePresentacionMouseExited
        btnSiguientePresentacion.setBackground(new Color(102, 234, 202));
    }//GEN-LAST:event_btnSiguientePresentacionMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguientePresentacion;
    private javax.swing.JButton btnVolverPresentacion;
    private javax.swing.JLabel fondoPresentacion;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JPanel pnlPresentacion;
    // End of variables declaration//GEN-END:variables
}
